package com.andeptrai.assign9_4_annht20172935;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mynameismidori.currencypicker.CurrencyPicker;
import com.mynameismidori.currencypicker.CurrencyPickerListener;
import com.mynameismidori.currencypicker.ExtendedCurrency;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public class BaiTap2Activity extends AppCompatActivity {

    EditText fromInput, toOutput;
    Button convertButton;
    Spinner fromDropdown, toDropdown;
    String fromCurrency, toCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fromInput = findViewById(R.id.fromCurrency);
        toOutput = findViewById(R.id.toCurrency);
        convertButton = findViewById(R.id.convertButton);
        fromDropdown = findViewById(R.id.fromDropdown);
        toDropdown = findViewById(R.id.toDropdown);
        setupListeners();
    }


    void setupListeners() {
        fromDropdown.setOnItemSelectedListener(new FromDropdown());
        toDropdown.setOnItemSelectedListener(new ToDropdown());
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isNetworkConnected()) {
                    Toast.makeText(BaiTap2Activity.this, "Host unreachable, check your internet connection and try again", Toast.LENGTH_SHORT).show();
                }
                if (fromCurrency == toCurrency) {
                    Toast.makeText(BaiTap2Activity.this, "from and to values are same.", Toast.LENGTH_SHORT).show();
                    return;
                } else if (fromInput.getText().toString().isEmpty()) {
                    Toast.makeText(BaiTap2Activity.this, "Please enter a value to convert.", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    JSONFetch obj = new JSONFetch();
                    obj.execute(fromInput.getText().toString());
                }
            }
        });
    }

    void showToast(String message) {
        Toast.makeText(BaiTap2Activity.this, message, Toast.LENGTH_SHORT).show();
    }

    public boolean isNetworkConnected() {
        // TODO: Check if connected to internet
        return true;
    }


    class FromDropdown implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            fromCurrency = parent.getItemAtPosition(position).toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    }


    class ToDropdown implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            toCurrency = parent.getItemAtPosition(position).toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    }

    class JSONFetch extends AsyncTask<String, Void, Void> {
        ProgressDialog dialog = new ProgressDialog(BaiTap2Activity.this);
        String error = "", apiResponse = "";

        @Override
        protected Void doInBackground(String... params) {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://frankfurter.app/latest?amount=" + params[0] + "&from=" + "USD" + "&to=" + "VND").build();
            try {
                Response response = client.newCall(request).execute();
                apiResponse = response.body().string();
            } catch (Exception e) {
                error = e.toString();
            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            dialog.setMessage("Converting...");
            dialog.show();
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void v) {
            dialog.dismiss();
            if (!error.isEmpty()) {
                showToast("Something went wrong " + error);
            }
            try {
                toOutput.setText(new JSONObject(apiResponse).getJSONObject("rates").getString(toCurrency));
            } catch (Exception e) {
                showToast("Something went wrong " + e.toString());
            }

            super.onPostExecute(v);
        }
    }
}

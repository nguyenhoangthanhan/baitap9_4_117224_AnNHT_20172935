package com.andeptrai.baitaptuan6;

public class ContactModel {

    String fullname;
    int avt;
    boolean select;
    boolean isLeft;

    public ContactModel(String fullname, int avt) {
        this.fullname = fullname;
        this.avt = avt;
        this.select = false;
        this.isLeft = true;
    }

    public ContactModel(String fullname, int avt, boolean isLeft) {
        this.fullname = fullname;
        this.avt = avt;
        this.isLeft = isLeft;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAvt() {
        return avt;
    }

    public void setAvt(int avt) {
        this.avt = avt;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public void setLeft(boolean left) {
        isLeft = left;
    }
}

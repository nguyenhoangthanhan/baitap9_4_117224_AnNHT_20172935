package com.andeptrai.baitaptuan6;

public class Mails {

    String name;
    String content;
    boolean select_star;

    public Mails(String name, String content) {
        this.name = name;
        this.content = content;
        this.select_star = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelect_star() {
        return select_star;
    }

    public void setSelect_star(boolean select_star) {
        this.select_star = select_star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

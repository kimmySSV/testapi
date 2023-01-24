package com.ldb.testapi.Model;

public class Message {
    private String code;
    private String detail;

    public Message() {
    }

    public Message(String code, String detail) {
        this.code = code;
        this.detail = detail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code='" + code + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}

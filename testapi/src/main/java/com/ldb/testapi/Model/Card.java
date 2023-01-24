package com.ldb.testapi.Model;

public class Card {

    private String cardNo;
    private String cardName;
    private int customerId;

    public Card() {
    }

    public Card(String cardNo, String cardName) {
        this.cardNo = cardNo;
        this.cardName = cardName;
    }

    public Card(String cardNo) {
        this.cardNo = cardNo;
    }

    public Card(String cardNo, String cardName, int customerId) {
        this.cardNo = cardNo;
        this.cardName = cardName;
        this.customerId = customerId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo='" + cardNo + '\'' +
                ", cardName='" + cardName + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}

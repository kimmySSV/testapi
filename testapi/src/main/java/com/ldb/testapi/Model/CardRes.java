package com.ldb.testapi.Model;

import java.util.List;

public class CardRes {
    private Message message;
    private List<Card> card;

    public CardRes() {
    }

    public CardRes(Message message, List<Card> card) {
        this.message = message;
        this.card = card;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "CardRes{" +
                "message=" + message +
                ", card=" + card +
                '}';
    }
}

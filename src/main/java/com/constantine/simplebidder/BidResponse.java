package com.constantine.simplebidder;

public class BidResponse {
    private String id;
    private BidInfo bid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BidInfo getBid() {
        return bid;
    }

    public void setBid(BidInfo bid) {
        this.bid = bid;
    }
}

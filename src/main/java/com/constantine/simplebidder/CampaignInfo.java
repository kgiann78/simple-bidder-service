package com.constantine.simplebidder;

public class CampaignInfo {
    private String id;
    private String name;
    private Number price;
    private String adm;
    private String[] targetedCountries;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public String[] getTargetedCountries() {
        return targetedCountries;
    }

    public void setTargetedCountries(String[] targetedCountries) {
        this.targetedCountries = targetedCountries;
    }
}

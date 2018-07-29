package com.constantine.simplebidder;

public class BidRequest {
    private String id;
    private AppInfo app;
    private DeviceInfo device;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppInfo getApp() {
        return app;
    }

    public void setApp(AppInfo app) {
        this.app = app;
    }

    public DeviceInfo getDevice() {
        return device;
    }

    public void setDevice(DeviceInfo device) {
        this.device = device;
    }
}

package com.mycom._mashupApp.model;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Created by 5ia15nipetkovic on 01.02.2018.
 */
public class Connection {
    private LocalTime departure;
    private LocalTime arrival;
    private String platform;
    private String duration;
    private ArrayList<String> products;

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    public LocalTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalTime arrival) {
        this.arrival = arrival;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }
}

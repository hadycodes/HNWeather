package com.hadinour.hnweather.Service;

import java.util.List;

/**
 * Created by hadinour on 12/17/16.
 */

public class City {
    String name;
    double lat;
    double lon;

    @Override
    public String toString() {
        return name + "at " + lat + ", " + lon;
    }
}

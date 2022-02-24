package com.za.data.api;

import com.za.data.mgmt.CalculateProperty;

public interface CalculateApi {

    String calculate(CalculateProperty calculateProperty, String inputData);
}

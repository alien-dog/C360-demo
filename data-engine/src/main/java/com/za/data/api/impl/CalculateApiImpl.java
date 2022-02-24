package com.za.data.api.impl;

import com.za.data.api.CalculateApi;
import com.za.data.data.BaseDataApi;
import com.za.data.mgmt.CalculateProperty;

import com.za.data.configuration.CalculateDataBeanConfiguration;

public class CalculateApiImpl implements CalculateApi {

    @Override
    public String calculate(CalculateProperty calculateProperty, String inputData) {
        BaseDataApi baseDataApi = CalculateDataBeanConfiguration.handlers.get(calculateProperty);
        return baseDataApi.calculateData(inputData);
    }
}

package com.za.data.configuration;

import com.za.data.data.BaseDataApi;
import com.za.data.data.impl.PolicyDataImpl;
import com.za.data.mgmt.CalculateProperty;

import java.util.HashMap;
import java.util.Map;

public class CalculateDataBeanConfiguration {

    public static Map<CalculateProperty, BaseDataApi> handlers = new HashMap<>();

    static {
        handlers.put(CalculateProperty.PolicyNumberByMonth, new PolicyDataImpl());
    }
}

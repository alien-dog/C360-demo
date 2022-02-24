package com.za.tag.configuration;

import com.za.data.mgmt.CalculateProperty;
import com.za.tag.domain.UnitEquationPolicyNumber;

import java.util.HashMap;
import java.util.Map;

public class CalculateToUnitEquationConfiguration {

    public static Map<CalculateProperty, Object> calculatePropertyObjectMap = new HashMap<>();

    static {
        calculatePropertyObjectMap.put(CalculateProperty.PolicyNumberByMonth, new UnitEquationPolicyNumber());
    }
}

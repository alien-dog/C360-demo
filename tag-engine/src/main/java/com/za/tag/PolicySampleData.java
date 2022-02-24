package com.za.tag;

import com.za.data.mgmt.CalculateProperty;
import com.za.tag.configuration.Operator;

// this is cal-property data
public class PolicySampleData {

    public CalculateProperty calculateProperty = CalculateProperty.PolicyNumberByMonth;

    public int tagValue = 10;

    public int monthLimit = 6;

    public Operator operator = Operator.LESS;

    public String tagName = "test";
}

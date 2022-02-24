package com.za.data.data.impl;

import com.za.data.data.PolicyData;
import com.za.data.caldomain.PolicyNumberByMonthCondition;

public class PolicyDataImpl implements PolicyData {

    @Override
    public String calculateData(PolicyNumberByMonthCondition policyNumberByMonthCondition) {
        return "2";
    }
}

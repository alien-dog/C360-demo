package com.za.tag.domain;

import com.za.data.mgmt.CalculateProperty;
import com.za.tag.configuration.Operator;

// 6 month policy number > 5
public class UnitEquationPolicyNumber {

    int conditionValue;

    private CalculateProperty calculateProperty = CalculateProperty.PolicyNumberByMonth;

    Operator operator;

    int referenceResultValue;

    public UnitEquationPolicyNumber newUniEquation() {
        return new UnitEquationPolicyNumber();
    }
}

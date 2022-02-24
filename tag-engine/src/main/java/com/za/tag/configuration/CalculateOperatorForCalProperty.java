package com.za.tag.configuration;

import com.za.data.mgmt.CalculateProperty;

import static com.za.data.mgmt.CalculateProperty.PolicyNumberByMonth;

public enum CalculateOperatorForCalProperty {

    PolicyNumberCalOperator(PolicyNumberByMonth, new Operator[]{Operator.GREATER, Operator.LESS});

    CalculateProperty calculateProperty;

    Operator[] operators;

    CalculateOperatorForCalProperty(CalculateProperty calculateProperty, Operator[] operators) {
        this.calculateProperty = calculateProperty;
        this.operators = operators;
    }
}

package com.za.tag.mgmt;

import com.za.data.mgmt.CalculateProperty;

import java.util.HashMap;
import java.util.Map;

// 6 month policy number > 5 ===> tag is 是否是优质客户，value is 是
public class TagConfiguration {

    public Map<CalculateProperty, Object> unitEquationList = new HashMap<>();

    public String tagName; //高风险

    public String value; // gao
}

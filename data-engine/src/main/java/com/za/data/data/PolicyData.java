package com.za.data.data;

import com.za.data.caldomain.PolicyNumberByMonthCondition;

public interface PolicyData extends BaseDataApi<PolicyNumberByMonthCondition>{

    String calculateData(PolicyNumberByMonthCondition policyNumberByMonthCondition);
}

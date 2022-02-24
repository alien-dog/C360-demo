package com.za.rule.data;

import com.za.rule.mgmt.RuleConfiguration;
import com.za.tag.data.TagApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CalculateScoreUnderAgentWithCustomer {

    private TagApi tagApi;

    public int score(List<RuleConfiguration> ruleConfigurationList, String agentData, String customerData) {

        //analysis agentdata and customer data need tags
        ruleConfigurationList.forEach(ruleConfiguration -> {
            //ruleConfiguration.customerTags;
            //ruleConfiguration.agentTags;
        });
        List<String> agentNeedTags = new ArrayList<>();
        List<String> customerTags = new ArrayList<>();

        // obtain tag value  by agent data with customer data;
        String tagValueAgent = tagApi.getByTagConfiguration("agentId", agentNeedTags.get(0));
        String tagValueCustomer = tagApi.getByTagConfiguration("customerId", agentNeedTags.get(0));


        //filter rule to obtain scores;
        /**
          person1 customer tag name is risk consciousness
          risk consciousness value is high

          agent1 agent tag is level
          level is high

         public RuleConfiguration sample() {
         RuleConfiguration ruleConfiguration = new RuleConfiguration();

         TagConfiguration tagConfiguration = new TagConfiguration();
         tagConfiguration.tagName = "risk consciousness";
         tagConfiguration.value = "high";
         ruleConfiguration.customerTags = new ArrayList<>();
         ruleConfiguration.customerTags.add(tagConfiguration);

         TagConfiguration tagConfigurationAgent = new TagConfiguration();
         tagConfigurationAgent.tagName = "level";
         tagConfigurationAgent.value = "high";
         ruleConfiguration.agentTags = new ArrayList<>();
         ruleConfiguration.agentTags.add(tagConfigurationAgent);
         ruleConfiguration.score = 10
         return ruleConfiguration;
         }

         RuleConfiguration

         */
        return 0;
    }
}

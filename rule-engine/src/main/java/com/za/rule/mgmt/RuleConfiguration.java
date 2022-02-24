package com.za.rule.mgmt;

import com.za.tag.mgmt.TagConfiguration;

import java.util.ArrayList;
import java.util.List;

public class RuleConfiguration {

    public List<TagConfiguration> customerTags;

    public List<TagConfiguration> agentTags;

    public int score;

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
        ruleConfiguration.score = 10;
        return ruleConfiguration;
    }
}

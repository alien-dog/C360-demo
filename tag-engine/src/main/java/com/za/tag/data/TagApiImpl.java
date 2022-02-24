package com.za.tag.data;

import com.za.data.api.CalculateApi;
import com.za.data.mgmt.CalculateProperty;
import com.za.tag.domain.UnitEquationPolicyNumber;
import com.za.tag.mgmt.CompleteTag;
import com.za.tag.mgmt.TagConfiguration;

import java.util.List;
import java.util.Set;

import static com.za.tag.configuration.CalculateToUnitEquationConfiguration.calculatePropertyObjectMap;

public class TagApiImpl implements TagApi{

    public CalculateApi calculateApi;
    @Override
    public String[] getTagValueByName(String tagValue) {
        return new String[0];
    }

    @Override
    public String[] getTagName() {
        return new String[0];
    }

    @Override
    public String getByTagConfiguration(String personNo, String tagName) {
        //find complete tag package
        CompleteTag completeTag = new CompleteTag();

        //obtain tag configuration
        List<TagConfiguration> tagConfigurationList = completeTag.UnitTagList;

        //obtain calculate property
        CalculateProperty[] calculateProperties = (CalculateProperty[]) tagConfigurationList.get(0).unitEquationList.keySet().toArray();

        CalculateProperty calculatePropertySample1 = calculateProperties[0];
        Object handler = calculatePropertyObjectMap.get(calculatePropertySample1);
        TagConfiguration tagConfiguration = null;
        if (calculatePropertySample1 == CalculateProperty.PolicyNumberByMonth) {
            UnitEquationPolicyNumber unitEquationPolicyNumber = (UnitEquationPolicyNumber) handler;
            String data = calculateApi.calculate(calculatePropertySample1, "json unitEquationPolicyNumber");
            // filter the tag that meets condition
            // tagConfigurationList.stream().filter()
            // tagConfiguration = meetTagConfiguration;
        }

        return tagConfiguration.value;
    }
}

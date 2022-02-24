package com.za.tag.data;

import com.za.tag.mgmt.TagConfiguration;

public interface TagApi {

    String[] getTagValueByName(String tagValue);

    String[] getTagName();

    String getByTagConfiguration(String personNo, String tagName);
}

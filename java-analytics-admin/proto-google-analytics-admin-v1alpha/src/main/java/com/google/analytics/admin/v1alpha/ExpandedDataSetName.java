/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.analytics.admin.v1alpha;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class ExpandedDataSetName implements ResourceName {
  private static final PathTemplate PROPERTY_EXPANDED_DATA_SET =
      PathTemplate.createWithoutUrlEncoding(
          "properties/{property}/expandedDataSets/{expanded_data_set}");
  private volatile Map<String, String> fieldValuesMap;
  private final String property;
  private final String expandedDataSet;

  @Deprecated
  protected ExpandedDataSetName() {
    property = null;
    expandedDataSet = null;
  }

  private ExpandedDataSetName(Builder builder) {
    property = Preconditions.checkNotNull(builder.getProperty());
    expandedDataSet = Preconditions.checkNotNull(builder.getExpandedDataSet());
  }

  public String getProperty() {
    return property;
  }

  public String getExpandedDataSet() {
    return expandedDataSet;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ExpandedDataSetName of(String property, String expandedDataSet) {
    return newBuilder().setProperty(property).setExpandedDataSet(expandedDataSet).build();
  }

  public static String format(String property, String expandedDataSet) {
    return newBuilder()
        .setProperty(property)
        .setExpandedDataSet(expandedDataSet)
        .build()
        .toString();
  }

  public static ExpandedDataSetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROPERTY_EXPANDED_DATA_SET.validatedMatch(
            formattedString, "ExpandedDataSetName.parse: formattedString not in valid format");
    return of(matchMap.get("property"), matchMap.get("expanded_data_set"));
  }

  public static List<ExpandedDataSetName> parseList(List<String> formattedStrings) {
    List<ExpandedDataSetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ExpandedDataSetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ExpandedDataSetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROPERTY_EXPANDED_DATA_SET.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (property != null) {
            fieldMapBuilder.put("property", property);
          }
          if (expandedDataSet != null) {
            fieldMapBuilder.put("expanded_data_set", expandedDataSet);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROPERTY_EXPANDED_DATA_SET.instantiate(
        "property", property, "expanded_data_set", expandedDataSet);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ExpandedDataSetName that = ((ExpandedDataSetName) o);
      return Objects.equals(this.property, that.property)
          && Objects.equals(this.expandedDataSet, that.expandedDataSet);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(property);
    h *= 1000003;
    h ^= Objects.hashCode(expandedDataSet);
    return h;
  }

  /** Builder for properties/{property}/expandedDataSets/{expanded_data_set}. */
  public static class Builder {
    private String property;
    private String expandedDataSet;

    protected Builder() {}

    public String getProperty() {
      return property;
    }

    public String getExpandedDataSet() {
      return expandedDataSet;
    }

    public Builder setProperty(String property) {
      this.property = property;
      return this;
    }

    public Builder setExpandedDataSet(String expandedDataSet) {
      this.expandedDataSet = expandedDataSet;
      return this;
    }

    private Builder(ExpandedDataSetName expandedDataSetName) {
      this.property = expandedDataSetName.property;
      this.expandedDataSet = expandedDataSetName.expandedDataSet;
    }

    public ExpandedDataSetName build() {
      return new ExpandedDataSetName(this);
    }
  }
}

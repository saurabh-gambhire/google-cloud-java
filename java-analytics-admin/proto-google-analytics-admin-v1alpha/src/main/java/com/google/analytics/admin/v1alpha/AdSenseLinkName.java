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
public class AdSenseLinkName implements ResourceName {
  private static final PathTemplate PROPERTY_ADSENSE_LINK =
      PathTemplate.createWithoutUrlEncoding("properties/{property}/adSenseLinks/{adsense_link}");
  private volatile Map<String, String> fieldValuesMap;
  private final String property;
  private final String adsenseLink;

  @Deprecated
  protected AdSenseLinkName() {
    property = null;
    adsenseLink = null;
  }

  private AdSenseLinkName(Builder builder) {
    property = Preconditions.checkNotNull(builder.getProperty());
    adsenseLink = Preconditions.checkNotNull(builder.getAdsenseLink());
  }

  public String getProperty() {
    return property;
  }

  public String getAdsenseLink() {
    return adsenseLink;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AdSenseLinkName of(String property, String adsenseLink) {
    return newBuilder().setProperty(property).setAdsenseLink(adsenseLink).build();
  }

  public static String format(String property, String adsenseLink) {
    return newBuilder().setProperty(property).setAdsenseLink(adsenseLink).build().toString();
  }

  public static AdSenseLinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROPERTY_ADSENSE_LINK.validatedMatch(
            formattedString, "AdSenseLinkName.parse: formattedString not in valid format");
    return of(matchMap.get("property"), matchMap.get("adsense_link"));
  }

  public static List<AdSenseLinkName> parseList(List<String> formattedStrings) {
    List<AdSenseLinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdSenseLinkName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdSenseLinkName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROPERTY_ADSENSE_LINK.matches(formattedString);
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
          if (adsenseLink != null) {
            fieldMapBuilder.put("adsense_link", adsenseLink);
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
    return PROPERTY_ADSENSE_LINK.instantiate("property", property, "adsense_link", adsenseLink);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AdSenseLinkName that = ((AdSenseLinkName) o);
      return Objects.equals(this.property, that.property)
          && Objects.equals(this.adsenseLink, that.adsenseLink);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(property);
    h *= 1000003;
    h ^= Objects.hashCode(adsenseLink);
    return h;
  }

  /** Builder for properties/{property}/adSenseLinks/{adsense_link}. */
  public static class Builder {
    private String property;
    private String adsenseLink;

    protected Builder() {}

    public String getProperty() {
      return property;
    }

    public String getAdsenseLink() {
      return adsenseLink;
    }

    public Builder setProperty(String property) {
      this.property = property;
      return this;
    }

    public Builder setAdsenseLink(String adsenseLink) {
      this.adsenseLink = adsenseLink;
      return this;
    }

    private Builder(AdSenseLinkName adSenseLinkName) {
      this.property = adSenseLinkName.property;
      this.adsenseLink = adSenseLinkName.adsenseLink;
    }

    public AdSenseLinkName build() {
      return new AdSenseLinkName(this);
    }
  }
}

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

package com.google.area120.tables.v1alpha1;

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
public class RowName implements ResourceName {
  private static final PathTemplate TABLE_ROW =
      PathTemplate.createWithoutUrlEncoding("tables/{table}/rows/{row}");
  private volatile Map<String, String> fieldValuesMap;
  private final String table;
  private final String row;

  @Deprecated
  protected RowName() {
    table = null;
    row = null;
  }

  private RowName(Builder builder) {
    table = Preconditions.checkNotNull(builder.getTable());
    row = Preconditions.checkNotNull(builder.getRow());
  }

  public String getTable() {
    return table;
  }

  public String getRow() {
    return row;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static RowName of(String table, String row) {
    return newBuilder().setTable(table).setRow(row).build();
  }

  public static String format(String table, String row) {
    return newBuilder().setTable(table).setRow(row).build().toString();
  }

  public static RowName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        TABLE_ROW.validatedMatch(
            formattedString, "RowName.parse: formattedString not in valid format");
    return of(matchMap.get("table"), matchMap.get("row"));
  }

  public static List<RowName> parseList(List<String> formattedStrings) {
    List<RowName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<RowName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (RowName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return TABLE_ROW.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (table != null) {
            fieldMapBuilder.put("table", table);
          }
          if (row != null) {
            fieldMapBuilder.put("row", row);
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
    return TABLE_ROW.instantiate("table", table, "row", row);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      RowName that = ((RowName) o);
      return Objects.equals(this.table, that.table) && Objects.equals(this.row, that.row);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(table);
    h *= 1000003;
    h ^= Objects.hashCode(row);
    return h;
  }

  /** Builder for tables/{table}/rows/{row}. */
  public static class Builder {
    private String table;
    private String row;

    protected Builder() {}

    public String getTable() {
      return table;
    }

    public String getRow() {
      return row;
    }

    public Builder setTable(String table) {
      this.table = table;
      return this;
    }

    public Builder setRow(String row) {
      this.row = row;
      return this;
    }

    private Builder(RowName rowName) {
      this.table = rowName.table;
      this.row = rowName.row;
    }

    public RowName build() {
      return new RowName(this);
    }
  }
}

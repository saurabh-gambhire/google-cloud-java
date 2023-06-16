/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/alloydb/v1alpha/resources.proto

package com.google.cloud.alloydb.v1alpha;

public interface SupportedDatabaseFlagOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.SupportedDatabaseFlag)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Restriction on STRING type value.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.StringRestrictions string_restrictions = 7;
   * </code>
   *
   * @return Whether the stringRestrictions field is set.
   */
  boolean hasStringRestrictions();
  /**
   *
   *
   * <pre>
   * Restriction on STRING type value.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.StringRestrictions string_restrictions = 7;
   * </code>
   *
   * @return The stringRestrictions.
   */
  com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.StringRestrictions getStringRestrictions();
  /**
   *
   *
   * <pre>
   * Restriction on STRING type value.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.StringRestrictions string_restrictions = 7;
   * </code>
   */
  com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.StringRestrictionsOrBuilder
      getStringRestrictionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Restriction on INTEGER type value.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.IntegerRestrictions integer_restrictions = 8;
   * </code>
   *
   * @return Whether the integerRestrictions field is set.
   */
  boolean hasIntegerRestrictions();
  /**
   *
   *
   * <pre>
   * Restriction on INTEGER type value.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.IntegerRestrictions integer_restrictions = 8;
   * </code>
   *
   * @return The integerRestrictions.
   */
  com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.IntegerRestrictions
      getIntegerRestrictions();
  /**
   *
   *
   * <pre>
   * Restriction on INTEGER type value.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.IntegerRestrictions integer_restrictions = 8;
   * </code>
   */
  com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.IntegerRestrictionsOrBuilder
      getIntegerRestrictionsOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the flag resource, following Google Cloud conventions, e.g.:
   *  * projects/{project}/locations/{location}/flags/{flag}
   * This field currently has no semantic meaning.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the flag resource, following Google Cloud conventions, e.g.:
   *  * projects/{project}/locations/{location}/flags/{flag}
   * This field currently has no semantic meaning.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the database flag, e.g. "max_allowed_packets".
   * The is a possibly key for the Instance.database_flags map field.
   * </pre>
   *
   * <code>string flag_name = 2;</code>
   *
   * @return The flagName.
   */
  java.lang.String getFlagName();
  /**
   *
   *
   * <pre>
   * The name of the database flag, e.g. "max_allowed_packets".
   * The is a possibly key for the Instance.database_flags map field.
   * </pre>
   *
   * <code>string flag_name = 2;</code>
   *
   * @return The bytes for flagName.
   */
  com.google.protobuf.ByteString getFlagNameBytes();

  /**
   * <code>.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.ValueType value_type = 3;</code>
   *
   * @return The enum numeric value on the wire for valueType.
   */
  int getValueTypeValue();
  /**
   * <code>.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.ValueType value_type = 3;</code>
   *
   * @return The valueType.
   */
  com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.ValueType getValueType();

  /**
   *
   *
   * <pre>
   * Whether the database flag accepts multiple values. If true,
   * a comma-separated list of stringified values may be specified.
   * </pre>
   *
   * <code>bool accepts_multiple_values = 4;</code>
   *
   * @return The acceptsMultipleValues.
   */
  boolean getAcceptsMultipleValues();

  /**
   *
   *
   * <pre>
   * Major database engine versions for which this flag is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.DatabaseVersion supported_db_versions = 5;</code>
   *
   * @return A list containing the supportedDbVersions.
   */
  java.util.List<com.google.cloud.alloydb.v1alpha.DatabaseVersion> getSupportedDbVersionsList();
  /**
   *
   *
   * <pre>
   * Major database engine versions for which this flag is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.DatabaseVersion supported_db_versions = 5;</code>
   *
   * @return The count of supportedDbVersions.
   */
  int getSupportedDbVersionsCount();
  /**
   *
   *
   * <pre>
   * Major database engine versions for which this flag is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.DatabaseVersion supported_db_versions = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedDbVersions at the given index.
   */
  com.google.cloud.alloydb.v1alpha.DatabaseVersion getSupportedDbVersions(int index);
  /**
   *
   *
   * <pre>
   * Major database engine versions for which this flag is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.DatabaseVersion supported_db_versions = 5;</code>
   *
   * @return A list containing the enum numeric values on the wire for supportedDbVersions.
   */
  java.util.List<java.lang.Integer> getSupportedDbVersionsValueList();
  /**
   *
   *
   * <pre>
   * Major database engine versions for which this flag is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.DatabaseVersion supported_db_versions = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of supportedDbVersions at the given index.
   */
  int getSupportedDbVersionsValue(int index);

  /**
   *
   *
   * <pre>
   * Whether setting or updating this flag on an Instance requires a database
   * restart. If a flag that requires database restart is set, the backend
   * will automatically restart the database (making sure to satisfy any
   * availability SLO's).
   * </pre>
   *
   * <code>bool requires_db_restart = 6;</code>
   *
   * @return The requiresDbRestart.
   */
  boolean getRequiresDbRestart();

  com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag.RestrictionsCase getRestrictionsCase();
}

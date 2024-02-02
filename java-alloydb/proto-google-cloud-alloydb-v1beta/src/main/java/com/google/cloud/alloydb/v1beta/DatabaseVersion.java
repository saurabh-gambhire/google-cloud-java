/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/alloydb/v1beta/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.alloydb.v1beta;

/**
 *
 *
 * <pre>
 * The supported database engine versions.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.alloydb.v1beta.DatabaseVersion}
 */
public enum DatabaseVersion implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * This is an unknown database version.
   * </pre>
   *
   * <code>DATABASE_VERSION_UNSPECIFIED = 0;</code>
   */
  DATABASE_VERSION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * DEPRECATED - The database version is Postgres 13.
   * </pre>
   *
   * <code>POSTGRES_13 = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  POSTGRES_13(1),
  /**
   *
   *
   * <pre>
   * The database version is Postgres 14.
   * </pre>
   *
   * <code>POSTGRES_14 = 2;</code>
   */
  POSTGRES_14(2),
  /**
   *
   *
   * <pre>
   * The database version is Postgres 15.
   * </pre>
   *
   * <code>POSTGRES_15 = 3;</code>
   */
  POSTGRES_15(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * This is an unknown database version.
   * </pre>
   *
   * <code>DATABASE_VERSION_UNSPECIFIED = 0;</code>
   */
  public static final int DATABASE_VERSION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * DEPRECATED - The database version is Postgres 13.
   * </pre>
   *
   * <code>POSTGRES_13 = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int POSTGRES_13_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The database version is Postgres 14.
   * </pre>
   *
   * <code>POSTGRES_14 = 2;</code>
   */
  public static final int POSTGRES_14_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The database version is Postgres 15.
   * </pre>
   *
   * <code>POSTGRES_15 = 3;</code>
   */
  public static final int POSTGRES_15_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DatabaseVersion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatabaseVersion forNumber(int value) {
    switch (value) {
      case 0:
        return DATABASE_VERSION_UNSPECIFIED;
      case 1:
        return POSTGRES_13;
      case 2:
        return POSTGRES_14;
      case 3:
        return POSTGRES_15;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatabaseVersion> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DatabaseVersion> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DatabaseVersion>() {
        public DatabaseVersion findValueByNumber(int number) {
          return DatabaseVersion.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.alloydb.v1beta.ResourcesProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final DatabaseVersion[] VALUES = values();

  public static DatabaseVersion valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DatabaseVersion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.alloydb.v1beta.DatabaseVersion)
}

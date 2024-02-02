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
 * View on Instance. Pass this enum to rpcs that returns an Instance message to
 * control which subsets of fields to get.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.alloydb.v1beta.InstanceView}
 */
public enum InstanceView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * INSTANCE_VIEW_UNSPECIFIED Not specified, equivalent to BASIC.
   * </pre>
   *
   * <code>INSTANCE_VIEW_UNSPECIFIED = 0;</code>
   */
  INSTANCE_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * BASIC server responses for a primary or read instance include all the
   * relevant instance details, excluding the details of each node in the
   * instance. The default value.
   * </pre>
   *
   * <code>INSTANCE_VIEW_BASIC = 1;</code>
   */
  INSTANCE_VIEW_BASIC(1),
  /**
   *
   *
   * <pre>
   * FULL response is equivalent to BASIC for primary instance (for now).
   * For read pool instance, this includes details of each node in the pool.
   * </pre>
   *
   * <code>INSTANCE_VIEW_FULL = 2;</code>
   */
  INSTANCE_VIEW_FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * INSTANCE_VIEW_UNSPECIFIED Not specified, equivalent to BASIC.
   * </pre>
   *
   * <code>INSTANCE_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int INSTANCE_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * BASIC server responses for a primary or read instance include all the
   * relevant instance details, excluding the details of each node in the
   * instance. The default value.
   * </pre>
   *
   * <code>INSTANCE_VIEW_BASIC = 1;</code>
   */
  public static final int INSTANCE_VIEW_BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * FULL response is equivalent to BASIC for primary instance (for now).
   * For read pool instance, this includes details of each node in the pool.
   * </pre>
   *
   * <code>INSTANCE_VIEW_FULL = 2;</code>
   */
  public static final int INSTANCE_VIEW_FULL_VALUE = 2;

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
  public static InstanceView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InstanceView forNumber(int value) {
    switch (value) {
      case 0:
        return INSTANCE_VIEW_UNSPECIFIED;
      case 1:
        return INSTANCE_VIEW_BASIC;
      case 2:
        return INSTANCE_VIEW_FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InstanceView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<InstanceView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<InstanceView>() {
        public InstanceView findValueByNumber(int number) {
          return InstanceView.forNumber(number);
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
    return com.google.cloud.alloydb.v1beta.ResourcesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final InstanceView[] VALUES = values();

  public static InstanceView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private InstanceView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.alloydb.v1beta.InstanceView)
}

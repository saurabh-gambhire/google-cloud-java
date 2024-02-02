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
// source: google/cloud/apigeeconnect/v1/tether.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.apigeeconnect.v1;

/**
 *
 *
 * <pre>
 * The action taken by agent.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.apigeeconnect.v1.Action}
 */
public enum Action implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified Action.
   * </pre>
   *
   * <code>ACTION_UNSPECIFIED = 0;</code>
   */
  ACTION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Indicates that agent should open a new stream.
   * </pre>
   *
   * <code>OPEN_NEW_STREAM = 1;</code>
   */
  OPEN_NEW_STREAM(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified Action.
   * </pre>
   *
   * <code>ACTION_UNSPECIFIED = 0;</code>
   */
  public static final int ACTION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Indicates that agent should open a new stream.
   * </pre>
   *
   * <code>OPEN_NEW_STREAM = 1;</code>
   */
  public static final int OPEN_NEW_STREAM_VALUE = 1;

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
  public static Action valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Action forNumber(int value) {
    switch (value) {
      case 0:
        return ACTION_UNSPECIFIED;
      case 1:
        return OPEN_NEW_STREAM;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Action> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Action> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Action>() {
        public Action findValueByNumber(int number) {
          return Action.forNumber(number);
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
    return com.google.cloud.apigeeconnect.v1.TetherProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Action[] VALUES = values();

  public static Action valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Action(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.apigeeconnect.v1.Action)
}

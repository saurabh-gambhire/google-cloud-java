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
// source: google/cloud/apigeeconnect/v1/tether.proto

package com.google.cloud.apigeeconnect.v1;

/**
 *
 *
 * <pre>
 * Endpoint indicates where the messages will be delivered.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.apigeeconnect.v1.TetherEndpoint}
 */
public enum TetherEndpoint implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified tether endpoint.
   * </pre>
   *
   * <code>TETHER_ENDPOINT_UNSPECIFIED = 0;</code>
   */
  TETHER_ENDPOINT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Apigee MART endpoint.
   * </pre>
   *
   * <code>APIGEE_MART = 1;</code>
   */
  APIGEE_MART(1),
  /**
   *
   *
   * <pre>
   * Apigee Runtime endpoint.
   * </pre>
   *
   * <code>APIGEE_RUNTIME = 2;</code>
   */
  APIGEE_RUNTIME(2),
  /**
   *
   *
   * <pre>
   * Apigee Mint Rating endpoint.
   * </pre>
   *
   * <code>APIGEE_MINT_RATING = 3;</code>
   */
  APIGEE_MINT_RATING(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified tether endpoint.
   * </pre>
   *
   * <code>TETHER_ENDPOINT_UNSPECIFIED = 0;</code>
   */
  public static final int TETHER_ENDPOINT_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Apigee MART endpoint.
   * </pre>
   *
   * <code>APIGEE_MART = 1;</code>
   */
  public static final int APIGEE_MART_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Apigee Runtime endpoint.
   * </pre>
   *
   * <code>APIGEE_RUNTIME = 2;</code>
   */
  public static final int APIGEE_RUNTIME_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Apigee Mint Rating endpoint.
   * </pre>
   *
   * <code>APIGEE_MINT_RATING = 3;</code>
   */
  public static final int APIGEE_MINT_RATING_VALUE = 3;

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
  public static TetherEndpoint valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TetherEndpoint forNumber(int value) {
    switch (value) {
      case 0:
        return TETHER_ENDPOINT_UNSPECIFIED;
      case 1:
        return APIGEE_MART;
      case 2:
        return APIGEE_RUNTIME;
      case 3:
        return APIGEE_MINT_RATING;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TetherEndpoint> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TetherEndpoint> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<TetherEndpoint>() {
        public TetherEndpoint findValueByNumber(int number) {
          return TetherEndpoint.forNumber(number);
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
    return com.google.cloud.apigeeconnect.v1.TetherProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final TetherEndpoint[] VALUES = values();

  public static TetherEndpoint valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TetherEndpoint(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.apigeeconnect.v1.TetherEndpoint)
}

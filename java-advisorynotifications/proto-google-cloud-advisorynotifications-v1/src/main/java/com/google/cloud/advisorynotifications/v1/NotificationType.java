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
// source: google/cloud/advisorynotifications/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.advisorynotifications.v1;

/**
 *
 *
 * <pre>
 * Type of notification
 * </pre>
 *
 * Protobuf enum {@code google.cloud.advisorynotifications.v1.NotificationType}
 */
public enum NotificationType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default type
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_UNSPECIFIED = 0;</code>
   */
  NOTIFICATION_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Security and privacy advisory notifications
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_SECURITY_PRIVACY_ADVISORY = 1;</code>
   */
  NOTIFICATION_TYPE_SECURITY_PRIVACY_ADVISORY(1),
  /**
   *
   *
   * <pre>
   * Sensitive action notifications
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_SENSITIVE_ACTIONS = 2;</code>
   */
  NOTIFICATION_TYPE_SENSITIVE_ACTIONS(2),
  /**
   *
   *
   * <pre>
   * General security MSA
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_SECURITY_MSA = 3;</code>
   */
  NOTIFICATION_TYPE_SECURITY_MSA(3),
  /**
   *
   *
   * <pre>
   * Threat horizons MSA
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_THREAT_HORIZONS = 4;</code>
   */
  NOTIFICATION_TYPE_THREAT_HORIZONS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default type
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int NOTIFICATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Security and privacy advisory notifications
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_SECURITY_PRIVACY_ADVISORY = 1;</code>
   */
  public static final int NOTIFICATION_TYPE_SECURITY_PRIVACY_ADVISORY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Sensitive action notifications
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_SENSITIVE_ACTIONS = 2;</code>
   */
  public static final int NOTIFICATION_TYPE_SENSITIVE_ACTIONS_VALUE = 2;
  /**
   *
   *
   * <pre>
   * General security MSA
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_SECURITY_MSA = 3;</code>
   */
  public static final int NOTIFICATION_TYPE_SECURITY_MSA_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Threat horizons MSA
   * </pre>
   *
   * <code>NOTIFICATION_TYPE_THREAT_HORIZONS = 4;</code>
   */
  public static final int NOTIFICATION_TYPE_THREAT_HORIZONS_VALUE = 4;

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
  public static NotificationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NotificationType forNumber(int value) {
    switch (value) {
      case 0:
        return NOTIFICATION_TYPE_UNSPECIFIED;
      case 1:
        return NOTIFICATION_TYPE_SECURITY_PRIVACY_ADVISORY;
      case 2:
        return NOTIFICATION_TYPE_SENSITIVE_ACTIONS;
      case 3:
        return NOTIFICATION_TYPE_SECURITY_MSA;
      case 4:
        return NOTIFICATION_TYPE_THREAT_HORIZONS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NotificationType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<NotificationType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<NotificationType>() {
        public NotificationType findValueByNumber(int number) {
          return NotificationType.forNumber(number);
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
    return com.google.cloud.advisorynotifications.v1.ServiceProto.getDescriptor()
        .getEnumTypes()
        .get(2);
  }

  private static final NotificationType[] VALUES = values();

  public static NotificationType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NotificationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.advisorynotifications.v1.NotificationType)
}

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
// source: google/appengine/v1/app_yaml.proto

// Protobuf Java Version: 3.25.2
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Actions to take when the user is not logged in.
 * </pre>
 *
 * Protobuf enum {@code google.appengine.v1.AuthFailAction}
 */
public enum AuthFailAction implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified. `AUTH_FAIL_ACTION_REDIRECT` is assumed.
   * </pre>
   *
   * <code>AUTH_FAIL_ACTION_UNSPECIFIED = 0;</code>
   */
  AUTH_FAIL_ACTION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Redirects user to "accounts.google.com". The user is redirected back to the
   * application URL after signing in or creating an account.
   * </pre>
   *
   * <code>AUTH_FAIL_ACTION_REDIRECT = 1;</code>
   */
  AUTH_FAIL_ACTION_REDIRECT(1),
  /**
   *
   *
   * <pre>
   * Rejects request with a `401` HTTP status code and an error
   * message.
   * </pre>
   *
   * <code>AUTH_FAIL_ACTION_UNAUTHORIZED = 2;</code>
   */
  AUTH_FAIL_ACTION_UNAUTHORIZED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified. `AUTH_FAIL_ACTION_REDIRECT` is assumed.
   * </pre>
   *
   * <code>AUTH_FAIL_ACTION_UNSPECIFIED = 0;</code>
   */
  public static final int AUTH_FAIL_ACTION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Redirects user to "accounts.google.com". The user is redirected back to the
   * application URL after signing in or creating an account.
   * </pre>
   *
   * <code>AUTH_FAIL_ACTION_REDIRECT = 1;</code>
   */
  public static final int AUTH_FAIL_ACTION_REDIRECT_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Rejects request with a `401` HTTP status code and an error
   * message.
   * </pre>
   *
   * <code>AUTH_FAIL_ACTION_UNAUTHORIZED = 2;</code>
   */
  public static final int AUTH_FAIL_ACTION_UNAUTHORIZED_VALUE = 2;

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
  public static AuthFailAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AuthFailAction forNumber(int value) {
    switch (value) {
      case 0:
        return AUTH_FAIL_ACTION_UNSPECIFIED;
      case 1:
        return AUTH_FAIL_ACTION_REDIRECT;
      case 2:
        return AUTH_FAIL_ACTION_UNAUTHORIZED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AuthFailAction> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AuthFailAction> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<AuthFailAction>() {
        public AuthFailAction findValueByNumber(int number) {
          return AuthFailAction.forNumber(number);
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
    return com.google.appengine.v1.AppYamlProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AuthFailAction[] VALUES = values();

  public static AuthFailAction valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AuthFailAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.appengine.v1.AuthFailAction)
}

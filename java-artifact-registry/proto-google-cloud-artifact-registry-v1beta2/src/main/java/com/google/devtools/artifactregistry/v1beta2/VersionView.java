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
// source: google/devtools/artifactregistry/v1beta2/version.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.artifactregistry.v1beta2;

/**
 *
 *
 * <pre>
 * The view, which determines what version information is returned in a
 * response.
 * </pre>
 *
 * Protobuf enum {@code google.devtools.artifactregistry.v1beta2.VersionView}
 */
public enum VersionView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default / unset value.
   * The API will default to the BASIC view.
   * </pre>
   *
   * <code>VERSION_VIEW_UNSPECIFIED = 0;</code>
   */
  VERSION_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Includes basic information about the version, but not any related tags.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  BASIC(1),
  /**
   *
   *
   * <pre>
   * Include everything.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default / unset value.
   * The API will default to the BASIC view.
   * </pre>
   *
   * <code>VERSION_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int VERSION_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Includes basic information about the version, but not any related tags.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  public static final int BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Include everything.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  public static final int FULL_VALUE = 2;

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
  public static VersionView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VersionView forNumber(int value) {
    switch (value) {
      case 0:
        return VERSION_VIEW_UNSPECIFIED;
      case 1:
        return BASIC;
      case 2:
        return FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VersionView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<VersionView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<VersionView>() {
        public VersionView findValueByNumber(int number) {
          return VersionView.forNumber(number);
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
    return com.google.devtools.artifactregistry.v1beta2.VersionProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final VersionView[] VALUES = values();

  public static VersionView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VersionView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.devtools.artifactregistry.v1beta2.VersionView)
}

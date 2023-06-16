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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface CustomDimensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CustomDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name for this CustomDimension resource.
   * Format: properties/{property}/customDimensions/{customDimension}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name for this CustomDimension resource.
   * Format: properties/{property}/customDimensions/{customDimension}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Tagging parameter name for this custom dimension.
   *
   * If this is a user-scoped dimension, then this is the user property name.
   * If this is an event-scoped dimension, then this is the event parameter
   * name.
   *
   * If this is an item-scoped dimension, then this is the parameter
   * name found in the eCommerce items array.
   *
   * May only contain alphanumeric and underscore characters, starting with a
   * letter. Max length of 24 characters for user-scoped dimensions, 40
   * characters for event-scoped dimensions.
   * </pre>
   *
   * <code>
   * string parameter_name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The parameterName.
   */
  java.lang.String getParameterName();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Tagging parameter name for this custom dimension.
   *
   * If this is a user-scoped dimension, then this is the user property name.
   * If this is an event-scoped dimension, then this is the event parameter
   * name.
   *
   * If this is an item-scoped dimension, then this is the parameter
   * name found in the eCommerce items array.
   *
   * May only contain alphanumeric and underscore characters, starting with a
   * letter. Max length of 24 characters for user-scoped dimensions, 40
   * characters for event-scoped dimensions.
   * </pre>
   *
   * <code>
   * string parameter_name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for parameterName.
   */
  com.google.protobuf.ByteString getParameterNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Display name for this custom dimension as shown in the Analytics
   * UI. Max length of 82 characters, alphanumeric plus space and underscore
   * starting with a letter. Legacy system-generated display names may contain
   * square brackets, but updates to this field will never permit square
   * brackets.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Display name for this custom dimension as shown in the Analytics
   * UI. Max length of 82 characters, alphanumeric plus space and underscore
   * starting with a letter. Legacy system-generated display names may contain
   * square brackets, but updates to this field will never permit square
   * brackets.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Description for this custom dimension. Max length of 150
   * characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description for this custom dimension. Max length of 150
   * characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The scope of this dimension.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomDimension.DimensionScope scope = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The scope of this dimension.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomDimension.DimensionScope scope = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The scope.
   */
  com.google.analytics.admin.v1alpha.CustomDimension.DimensionScope getScope();

  /**
   *
   *
   * <pre>
   * Optional. If set to true, sets this dimension as NPA and excludes it from
   * ads personalization.
   *
   * This is currently only supported by user-scoped custom dimensions.
   * </pre>
   *
   * <code>bool disallow_ads_personalization = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disallowAdsPersonalization.
   */
  boolean getDisallowAdsPersonalization();
}

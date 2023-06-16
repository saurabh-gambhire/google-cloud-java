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
// source: google/analytics/admin/v1beta/access_report.proto

package com.google.analytics.admin.v1beta;

public interface AccessFilterExpressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.AccessFilterExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Each of the FilterExpressions in the and_group has an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpressionList and_group = 1;</code>
   *
   * @return Whether the andGroup field is set.
   */
  boolean hasAndGroup();
  /**
   *
   *
   * <pre>
   * Each of the FilterExpressions in the and_group has an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpressionList and_group = 1;</code>
   *
   * @return The andGroup.
   */
  com.google.analytics.admin.v1beta.AccessFilterExpressionList getAndGroup();
  /**
   *
   *
   * <pre>
   * Each of the FilterExpressions in the and_group has an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpressionList and_group = 1;</code>
   */
  com.google.analytics.admin.v1beta.AccessFilterExpressionListOrBuilder getAndGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Each of the FilterExpressions in the or_group has an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpressionList or_group = 2;</code>
   *
   * @return Whether the orGroup field is set.
   */
  boolean hasOrGroup();
  /**
   *
   *
   * <pre>
   * Each of the FilterExpressions in the or_group has an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpressionList or_group = 2;</code>
   *
   * @return The orGroup.
   */
  com.google.analytics.admin.v1beta.AccessFilterExpressionList getOrGroup();
  /**
   *
   *
   * <pre>
   * Each of the FilterExpressions in the or_group has an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpressionList or_group = 2;</code>
   */
  com.google.analytics.admin.v1beta.AccessFilterExpressionListOrBuilder getOrGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpression not_expression = 3;</code>
   *
   * @return Whether the notExpression field is set.
   */
  boolean hasNotExpression();
  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpression not_expression = 3;</code>
   *
   * @return The notExpression.
   */
  com.google.analytics.admin.v1beta.AccessFilterExpression getNotExpression();
  /**
   *
   *
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilterExpression not_expression = 3;</code>
   */
  com.google.analytics.admin.v1beta.AccessFilterExpressionOrBuilder getNotExpressionOrBuilder();

  /**
   *
   *
   * <pre>
   * A primitive filter. In the same FilterExpression, all of the filter's
   * field names need to be either all dimensions or all metrics.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilter access_filter = 4;</code>
   *
   * @return Whether the accessFilter field is set.
   */
  boolean hasAccessFilter();
  /**
   *
   *
   * <pre>
   * A primitive filter. In the same FilterExpression, all of the filter's
   * field names need to be either all dimensions or all metrics.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilter access_filter = 4;</code>
   *
   * @return The accessFilter.
   */
  com.google.analytics.admin.v1beta.AccessFilter getAccessFilter();
  /**
   *
   *
   * <pre>
   * A primitive filter. In the same FilterExpression, all of the filter's
   * field names need to be either all dimensions or all metrics.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessFilter access_filter = 4;</code>
   */
  com.google.analytics.admin.v1beta.AccessFilterOrBuilder getAccessFilterOrBuilder();

  com.google.analytics.admin.v1beta.AccessFilterExpression.OneExpressionCase getOneExpressionCase();
}

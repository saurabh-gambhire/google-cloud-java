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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

package com.google.cloud.bigquery.analyticshub.v1;

public interface UpdateDataExchangeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.UpdateDataExchangeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Field mask specifies the fields to update in the data exchange
   * resource. The fields specified in the
   * `updateMask` are relative to the resource and are not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Field mask specifies the fields to update in the data exchange
   * resource. The fields specified in the
   * `updateMask` are relative to the resource and are not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Field mask specifies the fields to update in the data exchange
   * resource. The fields specified in the
   * `updateMask` are relative to the resource and are not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The data exchange to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataExchange field is set.
   */
  boolean hasDataExchange();
  /**
   *
   *
   * <pre>
   * Required. The data exchange to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataExchange.
   */
  com.google.cloud.bigquery.analyticshub.v1.DataExchange getDataExchange();
  /**
   *
   *
   * <pre>
   * Required. The data exchange to update.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchange = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.analyticshub.v1.DataExchangeOrBuilder getDataExchangeOrBuilder();
}

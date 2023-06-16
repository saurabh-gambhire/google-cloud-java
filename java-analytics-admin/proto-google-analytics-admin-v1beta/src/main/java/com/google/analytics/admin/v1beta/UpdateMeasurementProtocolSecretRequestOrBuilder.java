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
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

public interface UpdateMeasurementProtocolSecretRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.UpdateMeasurementProtocolSecretRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the measurementProtocolSecret field is set.
   */
  boolean hasMeasurementProtocolSecret();
  /**
   *
   *
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The measurementProtocolSecret.
   */
  com.google.analytics.admin.v1beta.MeasurementProtocolSecret getMeasurementProtocolSecret();
  /**
   *
   *
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1beta.MeasurementProtocolSecretOrBuilder
      getMeasurementProtocolSecretOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

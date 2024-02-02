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
// source: google/cloud/automl/v1beta1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1beta1;

public interface GetTableSpecRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.GetTableSpecRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the table spec to retrieve.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the table spec to retrieve.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   *
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   *
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}

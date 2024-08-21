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
// source: google/cloud/apihub/v1/common_fields.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.apihub.v1;

public interface ApiOperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.ApiOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the operation.
   *
   * Format:
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}/operations/{operation}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The name of the operation.
   *
   * Format:
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}/operations/{operation}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the spec from where the operation was parsed.
   * Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec}`
   * </pre>
   *
   * <code>
   * string spec = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The spec.
   */
  java.lang.String getSpec();
  /**
   *
   *
   * <pre>
   * Output only. The name of the spec from where the operation was parsed.
   * Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}/specs/{spec}`
   * </pre>
   *
   * <code>
   * string spec = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for spec.
   */
  com.google.protobuf.ByteString getSpecBytes();

  /**
   *
   *
   * <pre>
   * Output only. Operation details.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.OperationDetails details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   *
   *
   * <pre>
   * Output only. Operation details.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.OperationDetails details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The details.
   */
  com.google.cloud.apihub.v1.OperationDetails getDetails();
  /**
   *
   *
   * <pre>
   * Output only. Operation details.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.OperationDetails details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.apihub.v1.OperationDetailsOrBuilder getDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the operation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the operation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the operation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * operation resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * operation resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAttributes(java.lang.String key);
  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.apihub.v1.AttributeValues> getAttributes();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * operation resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.apihub.v1.AttributeValues> getAttributesMap();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * operation resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.cloud.apihub.v1.AttributeValues getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.apihub.v1.AttributeValues defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the API
   * operation resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValues getAttributesOrThrow(java.lang.String key);
}

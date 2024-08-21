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
// source: google/cloud/apihub/v1/apihub_service.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.apihub.v1;

public interface UpdateVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.UpdateVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The API version to update.
   *
   * The version's `name` field is used to identify the API version to update.
   * Format:
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Version version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * Required. The API version to update.
   *
   * The version's `name` field is used to identify the API version to update.
   * Format:
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Version version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The version.
   */
  com.google.cloud.apihub.v1.Version getVersion();
  /**
   *
   *
   * <pre>
   * Required. The API version to update.
   *
   * The version's `name` field is used to identify the API version to update.
   * Format:
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Version version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apihub.v1.VersionOrBuilder getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

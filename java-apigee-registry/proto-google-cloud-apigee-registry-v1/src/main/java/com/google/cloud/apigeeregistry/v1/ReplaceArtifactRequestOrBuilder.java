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
// source: google/cloud/apigeeregistry/v1/registry_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.apigeeregistry.v1;

public interface ReplaceArtifactRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.ReplaceArtifactRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The artifact to replace.
   *
   * The `name` field is used to identify the artifact to replace.
   * Format: `{parent}/artifacts/&#42;`
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the artifact field is set.
   */
  boolean hasArtifact();
  /**
   *
   *
   * <pre>
   * Required. The artifact to replace.
   *
   * The `name` field is used to identify the artifact to replace.
   * Format: `{parent}/artifacts/&#42;`
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The artifact.
   */
  com.google.cloud.apigeeregistry.v1.Artifact getArtifact();
  /**
   *
   *
   * <pre>
   * Required. The artifact to replace.
   *
   * The `name` field is used to identify the artifact to replace.
   * Format: `{parent}/artifacts/&#42;`
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Artifact artifact = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apigeeregistry.v1.ArtifactOrBuilder getArtifactOrBuilder();
}

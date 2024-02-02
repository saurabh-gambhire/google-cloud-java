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
// source: google/devtools/artifactregistry/v1beta2/yum_artifact.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.artifactregistry.v1beta2;

public interface ImportYumArtifactsErrorInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.ImportYumArtifactsErrorInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location requested.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsGcsSource gcs_source = 1;
   * </code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location requested.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsGcsSource gcs_source = 1;
   * </code>
   *
   * @return The gcsSource.
   */
  com.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsGcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location requested.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsGcsSource gcs_source = 1;
   * </code>
   */
  com.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsGcsSourceOrBuilder
      getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The detailed error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * The detailed error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * The detailed error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  com.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsErrorInfo.SourceCase
      getSourceCase();
}

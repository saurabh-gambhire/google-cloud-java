/*
 * Copyright 2020 Google LLC
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
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

public interface BigQueryTableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.BigQueryTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Platform project ID of the project containing the table.
   * If omitted, project ID is inferred from the API call.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The Google Cloud Platform project ID of the project containing the table.
   * If omitted, project ID is inferred from the API call.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Dataset ID of the table.
   * </pre>
   *
   * <code>string dataset_id = 2;</code>
   *
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   *
   *
   * <pre>
   * Dataset ID of the table.
   * </pre>
   *
   * <code>string dataset_id = 2;</code>
   *
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString getDatasetIdBytes();

  /**
   *
   *
   * <pre>
   * Name of the table.
   * </pre>
   *
   * <code>string table_id = 3;</code>
   *
   * @return The tableId.
   */
  java.lang.String getTableId();
  /**
   *
   *
   * <pre>
   * Name of the table.
   * </pre>
   *
   * <code>string table_id = 3;</code>
   *
   * @return The bytes for tableId.
   */
  com.google.protobuf.ByteString getTableIdBytes();
}
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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.asset.v1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.asset.v1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Destination on BigQuery. The output table stores the fields in asset
   * Protobuf as columns in BigQuery.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.BigQueryDestination bigquery_destination = 2;</code>
   *
   * @return Whether the bigqueryDestination field is set.
   */
  boolean hasBigqueryDestination();
  /**
   *
   *
   * <pre>
   * Destination on BigQuery. The output table stores the fields in asset
   * Protobuf as columns in BigQuery.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.BigQueryDestination bigquery_destination = 2;</code>
   *
   * @return The bigqueryDestination.
   */
  com.google.cloud.asset.v1.BigQueryDestination getBigqueryDestination();
  /**
   *
   *
   * <pre>
   * Destination on BigQuery. The output table stores the fields in asset
   * Protobuf as columns in BigQuery.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.BigQueryDestination bigquery_destination = 2;</code>
   */
  com.google.cloud.asset.v1.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();

  com.google.cloud.asset.v1.OutputConfig.DestinationCase getDestinationCase();
}

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
// source: google/cloud/automl/v1beta1/io.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1beta1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * For Image Object Detection, Text Extraction, Video Classification and
   * Tables, in the given directory a new directory will be created with name:
   * export_data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt; where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * For Image Object Detection, Text Extraction, Video Classification and
   * Tables, in the given directory a new directory will be created with name:
   * export_data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt; where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.automl.v1beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * For Image Object Detection, Text Extraction, Video Classification and
   * Tables, in the given directory a new directory will be created with name:
   * export_data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt; where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * The BigQuery location where the output is to be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQueryDestination bigquery_destination = 2;</code>
   *
   * @return Whether the bigqueryDestination field is set.
   */
  boolean hasBigqueryDestination();
  /**
   *
   *
   * <pre>
   * The BigQuery location where the output is to be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQueryDestination bigquery_destination = 2;</code>
   *
   * @return The bigqueryDestination.
   */
  com.google.cloud.automl.v1beta1.BigQueryDestination getBigqueryDestination();
  /**
   *
   *
   * <pre>
   * The BigQuery location where the output is to be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQueryDestination bigquery_destination = 2;</code>
   */
  com.google.cloud.automl.v1beta1.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();

  com.google.cloud.automl.v1beta1.OutputConfig.DestinationCase getDestinationCase();
}

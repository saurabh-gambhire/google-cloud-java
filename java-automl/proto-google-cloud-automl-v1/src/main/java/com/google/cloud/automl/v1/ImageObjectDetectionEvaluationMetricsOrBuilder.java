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
// source: google/cloud/automl/v1/detection.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1;

public interface ImageObjectDetectionEvaluationMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ImageObjectDetectionEvaluationMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The total number of bounding boxes (i.e. summed over all
   * images) the ground truth used to create this evaluation had.
   * </pre>
   *
   * <code>int32 evaluated_bounding_box_count = 1;</code>
   *
   * @return The evaluatedBoundingBoxCount.
   */
  int getEvaluatedBoundingBoxCount();

  /**
   *
   *
   * <pre>
   * Output only. The bounding boxes match metrics for each
   * Intersection-over-union threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * and each label confidence threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * pair.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.BoundingBoxMetricsEntry bounding_box_metrics_entries = 2;
   * </code>
   */
  java.util.List<com.google.cloud.automl.v1.BoundingBoxMetricsEntry>
      getBoundingBoxMetricsEntriesList();
  /**
   *
   *
   * <pre>
   * Output only. The bounding boxes match metrics for each
   * Intersection-over-union threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * and each label confidence threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * pair.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.BoundingBoxMetricsEntry bounding_box_metrics_entries = 2;
   * </code>
   */
  com.google.cloud.automl.v1.BoundingBoxMetricsEntry getBoundingBoxMetricsEntries(int index);
  /**
   *
   *
   * <pre>
   * Output only. The bounding boxes match metrics for each
   * Intersection-over-union threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * and each label confidence threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * pair.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.BoundingBoxMetricsEntry bounding_box_metrics_entries = 2;
   * </code>
   */
  int getBoundingBoxMetricsEntriesCount();
  /**
   *
   *
   * <pre>
   * Output only. The bounding boxes match metrics for each
   * Intersection-over-union threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * and each label confidence threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * pair.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.BoundingBoxMetricsEntry bounding_box_metrics_entries = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.automl.v1.BoundingBoxMetricsEntryOrBuilder>
      getBoundingBoxMetricsEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The bounding boxes match metrics for each
   * Intersection-over-union threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * and each label confidence threshold 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99
   * pair.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1.BoundingBoxMetricsEntry bounding_box_metrics_entries = 2;
   * </code>
   */
  com.google.cloud.automl.v1.BoundingBoxMetricsEntryOrBuilder getBoundingBoxMetricsEntriesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The single metric for bounding boxes evaluation:
   * the mean_average_precision averaged over all bounding_box_metrics_entries.
   * </pre>
   *
   * <code>float bounding_box_mean_average_precision = 3;</code>
   *
   * @return The boundingBoxMeanAveragePrecision.
   */
  float getBoundingBoxMeanAveragePrecision();
}

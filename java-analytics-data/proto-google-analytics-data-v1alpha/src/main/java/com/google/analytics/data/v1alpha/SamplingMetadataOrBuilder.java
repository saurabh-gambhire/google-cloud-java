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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface SamplingMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.SamplingMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The total number of events read in this sampled report for a date range.
   * This is the size of the subset this property's data that was analyzed in
   * this funnel report.
   * </pre>
   *
   * <code>int64 samples_read_count = 1;</code>
   *
   * @return The samplesReadCount.
   */
  long getSamplesReadCount();

  /**
   *
   *
   * <pre>
   * The total number of events present in this property's data that could
   * have been analyzed in this funnel report for a date range. Sampling
   * uncovers the meaningful information about the larger data set, and this
   * is the size of the larger data set.
   *
   * To calculate the percentage of available data that was used in this
   * funnel report, compute `samplesReadCount/samplingSpaceSize`.
   * </pre>
   *
   * <code>int64 sampling_space_size = 2;</code>
   *
   * @return The samplingSpaceSize.
   */
  long getSamplingSpaceSize();
}

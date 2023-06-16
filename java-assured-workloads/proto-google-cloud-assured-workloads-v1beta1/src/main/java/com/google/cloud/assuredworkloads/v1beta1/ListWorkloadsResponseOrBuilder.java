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
// source: google/cloud/assuredworkloads/v1beta1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1beta1;

public interface ListWorkloadsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1beta1.ListWorkloadsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of Workloads under a given parent.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1beta1.Workload workloads = 1;</code>
   */
  java.util.List<com.google.cloud.assuredworkloads.v1beta1.Workload> getWorkloadsList();
  /**
   *
   *
   * <pre>
   * List of Workloads under a given parent.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1beta1.Workload workloads = 1;</code>
   */
  com.google.cloud.assuredworkloads.v1beta1.Workload getWorkloads(int index);
  /**
   *
   *
   * <pre>
   * List of Workloads under a given parent.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1beta1.Workload workloads = 1;</code>
   */
  int getWorkloadsCount();
  /**
   *
   *
   * <pre>
   * List of Workloads under a given parent.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1beta1.Workload workloads = 1;</code>
   */
  java.util.List<? extends com.google.cloud.assuredworkloads.v1beta1.WorkloadOrBuilder>
      getWorkloadsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of Workloads under a given parent.
   * </pre>
   *
   * <code>repeated .google.cloud.assuredworkloads.v1beta1.Workload workloads = 1;</code>
   */
  com.google.cloud.assuredworkloads.v1beta1.WorkloadOrBuilder getWorkloadsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The next page token. Return empty if reached the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The next page token. Return empty if reached the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}

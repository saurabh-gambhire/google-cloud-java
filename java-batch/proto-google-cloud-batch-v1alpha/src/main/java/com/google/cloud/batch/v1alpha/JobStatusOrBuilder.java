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
// source: google/cloud/batch/v1alpha/job.proto

package com.google.cloud.batch.v1alpha;

public interface JobStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.JobStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Job state
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.JobStatus.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Job state
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.JobStatus.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.batch.v1alpha.JobStatus.State getState();

  /**
   *
   *
   * <pre>
   * Job status events
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.StatusEvent> getStatusEventsList();
  /**
   *
   *
   * <pre>
   * Job status events
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  com.google.cloud.batch.v1alpha.StatusEvent getStatusEvents(int index);
  /**
   *
   *
   * <pre>
   * Job status events
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  int getStatusEventsCount();
  /**
   *
   *
   * <pre>
   * Job status events
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  java.util.List<? extends com.google.cloud.batch.v1alpha.StatusEventOrBuilder>
      getStatusEventsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Job status events
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1alpha.StatusEvent status_events = 2;</code>
   */
  com.google.cloud.batch.v1alpha.StatusEventOrBuilder getStatusEventsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Aggregated task status for each TaskGroup in the Job.
   * The map key is TaskGroup ID.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus&gt; task_groups = 4;
   * </code>
   */
  int getTaskGroupsCount();
  /**
   *
   *
   * <pre>
   * Aggregated task status for each TaskGroup in the Job.
   * The map key is TaskGroup ID.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus&gt; task_groups = 4;
   * </code>
   */
  boolean containsTaskGroups(java.lang.String key);
  /** Use {@link #getTaskGroupsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus>
      getTaskGroups();
  /**
   *
   *
   * <pre>
   * Aggregated task status for each TaskGroup in the Job.
   * The map key is TaskGroup ID.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus&gt; task_groups = 4;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus>
      getTaskGroupsMap();
  /**
   *
   *
   * <pre>
   * Aggregated task status for each TaskGroup in the Job.
   * The map key is TaskGroup ID.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus&gt; task_groups = 4;
   * </code>
   */
  /* nullable */
  com.google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus getTaskGroupsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus defaultValue);
  /**
   *
   *
   * <pre>
   * Aggregated task status for each TaskGroup in the Job.
   * The map key is TaskGroup ID.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus&gt; task_groups = 4;
   * </code>
   */
  com.google.cloud.batch.v1alpha.JobStatus.TaskGroupStatus getTaskGroupsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * The duration of time that the Job spent in status RUNNING.
   * </pre>
   *
   * <code>.google.protobuf.Duration run_duration = 5;</code>
   *
   * @return Whether the runDuration field is set.
   */
  boolean hasRunDuration();
  /**
   *
   *
   * <pre>
   * The duration of time that the Job spent in status RUNNING.
   * </pre>
   *
   * <code>.google.protobuf.Duration run_duration = 5;</code>
   *
   * @return The runDuration.
   */
  com.google.protobuf.Duration getRunDuration();
  /**
   *
   *
   * <pre>
   * The duration of time that the Job spent in status RUNNING.
   * </pre>
   *
   * <code>.google.protobuf.Duration run_duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getRunDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource usage of the job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ResourceUsage resource_usage = 6;</code>
   *
   * @return Whether the resourceUsage field is set.
   */
  boolean hasResourceUsage();
  /**
   *
   *
   * <pre>
   * The resource usage of the job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ResourceUsage resource_usage = 6;</code>
   *
   * @return The resourceUsage.
   */
  com.google.cloud.batch.v1alpha.ResourceUsage getResourceUsage();
  /**
   *
   *
   * <pre>
   * The resource usage of the job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ResourceUsage resource_usage = 6;</code>
   */
  com.google.cloud.batch.v1alpha.ResourceUsageOrBuilder getResourceUsageOrBuilder();
}

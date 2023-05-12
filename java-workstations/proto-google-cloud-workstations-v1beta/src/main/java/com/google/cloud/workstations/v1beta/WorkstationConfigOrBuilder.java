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
// source: google/cloud/workstations/v1beta/workstations.proto

package com.google.cloud.workstations.v1beta;

public interface WorkstationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1beta.WorkstationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full name of this resource.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Full name of this resource.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Human-readable name for this resource.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human-readable name for this resource.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identified for this resource.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identified for this resource.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this resource is currently being updated to
   * match its intended state.
   * </pre>
   *
   * <code>bool reconciling = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Client-specified labels that are applied to the resource and that are also
   * propagated to the underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this resource was soft-deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Checksum computed by the server. May be sent on update and delete requests
   * to make sure that the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 9;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Checksum computed by the server. May be sent on update and delete requests
   * to make sure that the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 9;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * How long to wait before automatically stopping an instance that hasn't
   * received any user traffic. A value of 0 indicates that this instance
   * should never time out due to idleness. Defaults to 20 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 10;</code>
   *
   * @return Whether the idleTimeout field is set.
   */
  boolean hasIdleTimeout();
  /**
   *
   *
   * <pre>
   * How long to wait before automatically stopping an instance that hasn't
   * received any user traffic. A value of 0 indicates that this instance
   * should never time out due to idleness. Defaults to 20 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 10;</code>
   *
   * @return The idleTimeout.
   */
  com.google.protobuf.Duration getIdleTimeout();
  /**
   *
   *
   * <pre>
   * How long to wait before automatically stopping an instance that hasn't
   * received any user traffic. A value of 0 indicates that this instance
   * should never time out due to idleness. Defaults to 20 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 10;</code>
   */
  com.google.protobuf.DurationOrBuilder getIdleTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * How long to wait before automatically stopping a workstation after it
   * started. A value of 0 indicates that workstations using this configuration
   * should never time out. Must be greater than 0 and less than 24 hours if
   * encryption_key is set. Defaults to 12 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration running_timeout = 11;</code>
   *
   * @return Whether the runningTimeout field is set.
   */
  boolean hasRunningTimeout();
  /**
   *
   *
   * <pre>
   * How long to wait before automatically stopping a workstation after it
   * started. A value of 0 indicates that workstations using this configuration
   * should never time out. Must be greater than 0 and less than 24 hours if
   * encryption_key is set. Defaults to 12 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration running_timeout = 11;</code>
   *
   * @return The runningTimeout.
   */
  com.google.protobuf.Duration getRunningTimeout();
  /**
   *
   *
   * <pre>
   * How long to wait before automatically stopping a workstation after it
   * started. A value of 0 indicates that workstations using this configuration
   * should never time out. Must be greater than 0 and less than 24 hours if
   * encryption_key is set. Defaults to 12 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration running_timeout = 11;</code>
   */
  com.google.protobuf.DurationOrBuilder getRunningTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Runtime host for the workstation.
   * </pre>
   *
   * <code>.google.cloud.workstations.v1beta.WorkstationConfig.Host host = 12;</code>
   *
   * @return Whether the host field is set.
   */
  boolean hasHost();
  /**
   *
   *
   * <pre>
   * Runtime host for the workstation.
   * </pre>
   *
   * <code>.google.cloud.workstations.v1beta.WorkstationConfig.Host host = 12;</code>
   *
   * @return The host.
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.Host getHost();
  /**
   *
   *
   * <pre>
   * Runtime host for the workstation.
   * </pre>
   *
   * <code>.google.cloud.workstations.v1beta.WorkstationConfig.Host host = 12;</code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.HostOrBuilder getHostOrBuilder();

  /**
   *
   *
   * <pre>
   * Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13;
   * </code>
   */
  java.util.List<com.google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory>
      getPersistentDirectoriesList();
  /**
   *
   *
   * <pre>
   * Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13;
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory
      getPersistentDirectories(int index);
  /**
   *
   *
   * <pre>
   * Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13;
   * </code>
   */
  int getPersistentDirectoriesCount();
  /**
   *
   *
   * <pre>
   * Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectoryOrBuilder>
      getPersistentDirectoriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Directories to persist across workstation sessions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectory persistent_directories = 13;
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.PersistentDirectoryOrBuilder
      getPersistentDirectoriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Container that will be run for each workstation using this configuration
   * when that workstation is started.
   * </pre>
   *
   * <code>.google.cloud.workstations.v1beta.WorkstationConfig.Container container = 14;</code>
   *
   * @return Whether the container field is set.
   */
  boolean hasContainer();
  /**
   *
   *
   * <pre>
   * Container that will be run for each workstation using this configuration
   * when that workstation is started.
   * </pre>
   *
   * <code>.google.cloud.workstations.v1beta.WorkstationConfig.Container container = 14;</code>
   *
   * @return The container.
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.Container getContainer();
  /**
   *
   *
   * <pre>
   * Container that will be run for each workstation using this configuration
   * when that workstation is started.
   * </pre>
   *
   * <code>.google.cloud.workstations.v1beta.WorkstationConfig.Container container = 14;</code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.ContainerOrBuilder getContainerOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Encrypts resources of this workstation configuration using a
   * customer-managed encryption key.
   * If specified, the boot disk of the Compute Engine instance and the
   * persistent disk are encrypted using this encryption key. If
   * this field is not set, the disks are encrypted using a generated
   * key. Customer-managed encryption keys do not protect disk metadata.
   * If the customer-managed encryption key is rotated, when the workstation
   * instance is stopped, the system attempts to recreate the
   * persistent disk with the new version of the key. Be sure to keep
   * older versions of the key until the persistent disk is recreated.
   * Otherwise, data on the persistent disk will be lost.
   * If the encryption key is revoked, the workstation session will
   * automatically be stopped within 7 hours.
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKey encryption_key = 17 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the encryptionKey field is set.
   */
  boolean hasEncryptionKey();
  /**
   *
   *
   * <pre>
   * Immutable. Encrypts resources of this workstation configuration using a
   * customer-managed encryption key.
   * If specified, the boot disk of the Compute Engine instance and the
   * persistent disk are encrypted using this encryption key. If
   * this field is not set, the disks are encrypted using a generated
   * key. Customer-managed encryption keys do not protect disk metadata.
   * If the customer-managed encryption key is rotated, when the workstation
   * instance is stopped, the system attempts to recreate the
   * persistent disk with the new version of the key. Be sure to keep
   * older versions of the key until the persistent disk is recreated.
   * Otherwise, data on the persistent disk will be lost.
   * If the encryption key is revoked, the workstation session will
   * automatically be stopped within 7 hours.
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKey encryption_key = 17 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The encryptionKey.
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKey getEncryptionKey();
  /**
   *
   *
   * <pre>
   * Immutable. Encrypts resources of this workstation configuration using a
   * customer-managed encryption key.
   * If specified, the boot disk of the Compute Engine instance and the
   * persistent disk are encrypted using this encryption key. If
   * this field is not set, the disks are encrypted using a generated
   * key. Customer-managed encryption keys do not protect disk metadata.
   * If the customer-managed encryption key is rotated, when the workstation
   * instance is stopped, the system attempts to recreate the
   * persistent disk with the new version of the key. Be sure to keep
   * older versions of the key until the persistent disk is recreated.
   * Otherwise, data on the persistent disk will be lost.
   * If the encryption key is revoked, the workstation session will
   * automatically be stopped within 7 hours.
   * Immutable after the workstation configuration is created.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKey encryption_key = 17 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.CustomerEncryptionKeyOrBuilder
      getEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Readiness checks to perform when starting a workstation using this
   * workstation configuration. Mark a workstation as running only after all
   * specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19;
   * </code>
   */
  java.util.List<com.google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck>
      getReadinessChecksList();
  /**
   *
   *
   * <pre>
   * Readiness checks to perform when starting a workstation using this
   * workstation configuration. Mark a workstation as running only after all
   * specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19;
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck getReadinessChecks(
      int index);
  /**
   *
   *
   * <pre>
   * Readiness checks to perform when starting a workstation using this
   * workstation configuration. Mark a workstation as running only after all
   * specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19;
   * </code>
   */
  int getReadinessChecksCount();
  /**
   *
   *
   * <pre>
   * Readiness checks to perform when starting a workstation using this
   * workstation configuration. Mark a workstation as running only after all
   * specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheckOrBuilder>
      getReadinessChecksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Readiness checks to perform when starting a workstation using this
   * workstation configuration. Mark a workstation as running only after all
   * specified readiness checks return 200 status codes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheck readiness_checks = 19;
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig.ReadinessCheckOrBuilder
      getReadinessChecksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Whether this resource is in degraded mode, in which case it
   * may require user action to restore full functionality. Details can be found
   * in the `conditions` field.
   * </pre>
   *
   * <code>bool degraded = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The degraded.
   */
  boolean getDegraded();

  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.rpc.Status> getConditionsList();
  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.Status getConditions(int index);
  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Status conditions describing the current resource state.
   * </pre>
   *
   * <code>repeated .google.rpc.Status conditions = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.StatusOrBuilder getConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Whether to enable linux auditd logging on the workstation. When enabled, a
   * service account must also be specified that has logging.buckets.write
   * permission on the project. Operating system audit logging is distinct from
   * [Cloud Audit
   * Logs](https://cloud.google.com/workstations/docs/audit-logging).
   * </pre>
   *
   * <code>bool enable_audit_agent = 20;</code>
   *
   * @return The enableAuditAgent.
   */
  boolean getEnableAuditAgent();
}

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
// source: google/cloud/metastore/v1beta/metastore_federation.proto

package com.google.cloud.metastore.v1beta;

public interface FederationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.Federation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The relative resource name of the federation, of the
   * form:
   * projects/{project_number}/locations/{location_id}/federations/{federation_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The relative resource name of the federation, of the
   * form:
   * projects/{project_number}/locations/{location_id}/federations/{federation_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the metastore federation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metastore federation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metastore federation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the metastore federation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metastore federation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metastore federation was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * User-defined labels for the metastore federation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * User-defined labels for the metastore federation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * User-defined labels for the metastore federation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * User-defined labels for the metastore federation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
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
   * User-defined labels for the metastore federation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Immutable. The Apache Hive metastore version of the federation. All backend
   * metastore versions must be compatible with the federation version.
   * </pre>
   *
   * <code>string version = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Immutable. The Apache Hive metastore version of the federation. All backend
   * metastore versions must be compatible with the federation version.
   * </pre>
   *
   * <code>string version = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * A map from `BackendMetastore` rank to `BackendMetastore`s from which the
   * federation service serves metadata at query time. The map key represents
   * the order in which `BackendMetastore`s should be evaluated to resolve
   * database names at query time and should be greater than or equal to zero. A
   * `BackendMetastore` with a lower number will be evaluated before a
   * `BackendMetastore` with a higher number.
   * </pre>
   *
   * <code>map&lt;int32, .google.cloud.metastore.v1beta.BackendMetastore&gt; backend_metastores = 6;
   * </code>
   */
  int getBackendMetastoresCount();
  /**
   *
   *
   * <pre>
   * A map from `BackendMetastore` rank to `BackendMetastore`s from which the
   * federation service serves metadata at query time. The map key represents
   * the order in which `BackendMetastore`s should be evaluated to resolve
   * database names at query time and should be greater than or equal to zero. A
   * `BackendMetastore` with a lower number will be evaluated before a
   * `BackendMetastore` with a higher number.
   * </pre>
   *
   * <code>map&lt;int32, .google.cloud.metastore.v1beta.BackendMetastore&gt; backend_metastores = 6;
   * </code>
   */
  boolean containsBackendMetastores(int key);
  /** Use {@link #getBackendMetastoresMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.google.cloud.metastore.v1beta.BackendMetastore>
      getBackendMetastores();
  /**
   *
   *
   * <pre>
   * A map from `BackendMetastore` rank to `BackendMetastore`s from which the
   * federation service serves metadata at query time. The map key represents
   * the order in which `BackendMetastore`s should be evaluated to resolve
   * database names at query time and should be greater than or equal to zero. A
   * `BackendMetastore` with a lower number will be evaluated before a
   * `BackendMetastore` with a higher number.
   * </pre>
   *
   * <code>map&lt;int32, .google.cloud.metastore.v1beta.BackendMetastore&gt; backend_metastores = 6;
   * </code>
   */
  java.util.Map<java.lang.Integer, com.google.cloud.metastore.v1beta.BackendMetastore>
      getBackendMetastoresMap();
  /**
   *
   *
   * <pre>
   * A map from `BackendMetastore` rank to `BackendMetastore`s from which the
   * federation service serves metadata at query time. The map key represents
   * the order in which `BackendMetastore`s should be evaluated to resolve
   * database names at query time and should be greater than or equal to zero. A
   * `BackendMetastore` with a lower number will be evaluated before a
   * `BackendMetastore` with a higher number.
   * </pre>
   *
   * <code>map&lt;int32, .google.cloud.metastore.v1beta.BackendMetastore&gt; backend_metastores = 6;
   * </code>
   */

  /* nullable */
  com.google.cloud.metastore.v1beta.BackendMetastore getBackendMetastoresOrDefault(
      int key,
      /* nullable */
      com.google.cloud.metastore.v1beta.BackendMetastore defaultValue);
  /**
   *
   *
   * <pre>
   * A map from `BackendMetastore` rank to `BackendMetastore`s from which the
   * federation service serves metadata at query time. The map key represents
   * the order in which `BackendMetastore`s should be evaluated to resolve
   * database names at query time and should be greater than or equal to zero. A
   * `BackendMetastore` with a lower number will be evaluated before a
   * `BackendMetastore` with a higher number.
   * </pre>
   *
   * <code>map&lt;int32, .google.cloud.metastore.v1beta.BackendMetastore&gt; backend_metastores = 6;
   * </code>
   */
  com.google.cloud.metastore.v1beta.BackendMetastore getBackendMetastoresOrThrow(int key);

  /**
   *
   *
   * <pre>
   * Output only. The federation endpoint.
   * </pre>
   *
   * <code>string endpoint_uri = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The endpointUri.
   */
  java.lang.String getEndpointUri();
  /**
   *
   *
   * <pre>
   * Output only. The federation endpoint.
   * </pre>
   *
   * <code>string endpoint_uri = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for endpointUri.
   */
  com.google.protobuf.ByteString getEndpointUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the federation.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1beta.Federation.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the federation.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1beta.Federation.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.metastore.v1beta.Federation.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state of the
   * metastore federation, if available.
   * </pre>
   *
   * <code>string state_message = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state of the
   * metastore federation, if available.
   * </pre>
   *
   * <code>string state_message = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString getStateMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The globally unique resource identifier of the metastore
   * federation.
   * </pre>
   *
   * <code>string uid = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. The globally unique resource identifier of the metastore
   * federation.
   * </pre>
   *
   * <code>string uid = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();
}

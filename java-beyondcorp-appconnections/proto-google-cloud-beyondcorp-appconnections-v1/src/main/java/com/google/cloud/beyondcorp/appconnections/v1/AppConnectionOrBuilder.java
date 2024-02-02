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
// source: google/cloud/beyondcorp/appconnections/v1/app_connections_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.beyondcorp.appconnections.v1;

public interface AppConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.appconnections.v1.AppConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique resource name of the AppConnection.
   * The name is ignored when creating a AppConnection.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Unique resource name of the AppConnection.
   * The name is ignored when creating a AppConnection.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the resource was created.
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
   * Output only. Timestamp when the resource was created.
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
   * Output only. Timestamp when the resource was created.
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
   * Output only. Timestamp when the resource was last modified.
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
   * Output only. Timestamp when the resource was last modified.
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
   * Output only. Timestamp when the resource was last modified.
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
   * Optional. Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. An arbitrary user-provided name for the AppConnection. Cannot
   * exceed 64 characters.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. An arbitrary user-provided name for the AppConnection. Cannot
   * exceed 64 characters.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A unique identifier for the instance generated by the
   * system.
   * </pre>
   *
   * <code>string uid = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. A unique identifier for the instance generated by the
   * system.
   * </pre>
   *
   * <code>string uid = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of network connectivity used by the AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.Type type = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The type of network connectivity used by the AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.Type type = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.beyondcorp.appconnections.v1.AppConnection.Type getType();

  /**
   *
   *
   * <pre>
   * Required. Address of the remote application endpoint for the BeyondCorp
   * AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.ApplicationEndpoint application_endpoint = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the applicationEndpoint field is set.
   */
  boolean hasApplicationEndpoint();
  /**
   *
   *
   * <pre>
   * Required. Address of the remote application endpoint for the BeyondCorp
   * AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.ApplicationEndpoint application_endpoint = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The applicationEndpoint.
   */
  com.google.cloud.beyondcorp.appconnections.v1.AppConnection.ApplicationEndpoint
      getApplicationEndpoint();
  /**
   *
   *
   * <pre>
   * Required. Address of the remote application endpoint for the BeyondCorp
   * AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.ApplicationEndpoint application_endpoint = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.beyondcorp.appconnections.v1.AppConnection.ApplicationEndpointOrBuilder
      getApplicationEndpointOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are
   * authorised to be associated with this AppConnection.
   * </pre>
   *
   * <code>repeated string connectors = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the connectors.
   */
  java.util.List<java.lang.String> getConnectorsList();
  /**
   *
   *
   * <pre>
   * Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are
   * authorised to be associated with this AppConnection.
   * </pre>
   *
   * <code>repeated string connectors = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of connectors.
   */
  int getConnectorsCount();
  /**
   *
   *
   * <pre>
   * Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are
   * authorised to be associated with this AppConnection.
   * </pre>
   *
   * <code>repeated string connectors = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The connectors at the given index.
   */
  java.lang.String getConnectors(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are
   * authorised to be associated with this AppConnection.
   * </pre>
   *
   * <code>repeated string connectors = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the connectors at the given index.
   */
  com.google.protobuf.ByteString getConnectorsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The current state of the AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.beyondcorp.appconnections.v1.AppConnection.State getState();

  /**
   *
   *
   * <pre>
   * Optional. Gateway used by the AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.Gateway gateway = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gateway field is set.
   */
  boolean hasGateway();
  /**
   *
   *
   * <pre>
   * Optional. Gateway used by the AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.Gateway gateway = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gateway.
   */
  com.google.cloud.beyondcorp.appconnections.v1.AppConnection.Gateway getGateway();
  /**
   *
   *
   * <pre>
   * Optional. Gateway used by the AppConnection.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnections.v1.AppConnection.Gateway gateway = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.beyondcorp.appconnections.v1.AppConnection.GatewayOrBuilder
      getGatewayOrBuilder();
}

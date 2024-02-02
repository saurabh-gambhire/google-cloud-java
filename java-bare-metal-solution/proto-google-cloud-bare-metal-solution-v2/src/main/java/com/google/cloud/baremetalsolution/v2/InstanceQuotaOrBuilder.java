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
// source: google/cloud/baremetalsolution/v2/provisioning.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.baremetalsolution.v2;

public interface InstanceQuotaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.InstanceQuota)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the instance quota.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the instance quota.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Instance type.
   * Deprecated: use gcp_service.
   * </pre>
   *
   * <code>string instance_type = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
   *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
   * @return The instanceType.
   */
  @java.lang.Deprecated
  java.lang.String getInstanceType();
  /**
   *
   *
   * <pre>
   * Instance type.
   * Deprecated: use gcp_service.
   * </pre>
   *
   * <code>string instance_type = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
   *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
   * @return The bytes for instanceType.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getInstanceTypeBytes();

  /**
   *
   *
   * <pre>
   * The gcp service of the provisioning quota.
   * </pre>
   *
   * <code>string gcp_service = 5;</code>
   *
   * @return The gcpService.
   */
  java.lang.String getGcpService();
  /**
   *
   *
   * <pre>
   * The gcp service of the provisioning quota.
   * </pre>
   *
   * <code>string gcp_service = 5;</code>
   *
   * @return The bytes for gcpService.
   */
  com.google.protobuf.ByteString getGcpServiceBytes();

  /**
   *
   *
   * <pre>
   * Location where the quota applies.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Location where the quota applies.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Number of machines than can be created for the given location and
   * instance_type.
   * </pre>
   *
   * <code>int32 available_machine_count = 4;</code>
   *
   * @return The availableMachineCount.
   */
  int getAvailableMachineCount();
}

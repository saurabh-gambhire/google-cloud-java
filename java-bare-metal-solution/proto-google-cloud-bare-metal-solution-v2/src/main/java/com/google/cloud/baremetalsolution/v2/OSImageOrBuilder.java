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
// source: google/cloud/baremetalsolution/v2/osimage.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.baremetalsolution.v2;

public interface OSImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.OSImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. OS Image's unique name.
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
   * Output only. OS Image's unique name.
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
   * OS Image code.
   * </pre>
   *
   * <code>string code = 2;</code>
   *
   * @return The code.
   */
  java.lang.String getCode();
  /**
   *
   *
   * <pre>
   * OS Image code.
   * </pre>
   *
   * <code>string code = 2;</code>
   *
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString getCodeBytes();

  /**
   *
   *
   * <pre>
   * OS Image description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * OS Image description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Instance types this image is applicable to.
   * [Available
   * types](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
   * </pre>
   *
   * <code>repeated string applicable_instance_types = 4;</code>
   *
   * @return A list containing the applicableInstanceTypes.
   */
  java.util.List<java.lang.String> getApplicableInstanceTypesList();
  /**
   *
   *
   * <pre>
   * Instance types this image is applicable to.
   * [Available
   * types](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
   * </pre>
   *
   * <code>repeated string applicable_instance_types = 4;</code>
   *
   * @return The count of applicableInstanceTypes.
   */
  int getApplicableInstanceTypesCount();
  /**
   *
   *
   * <pre>
   * Instance types this image is applicable to.
   * [Available
   * types](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
   * </pre>
   *
   * <code>repeated string applicable_instance_types = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The applicableInstanceTypes at the given index.
   */
  java.lang.String getApplicableInstanceTypes(int index);
  /**
   *
   *
   * <pre>
   * Instance types this image is applicable to.
   * [Available
   * types](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
   * </pre>
   *
   * <code>repeated string applicable_instance_types = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the applicableInstanceTypes at the given index.
   */
  com.google.protobuf.ByteString getApplicableInstanceTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Network templates that can be used with this OS Image.
   * </pre>
   *
   * <code>repeated string supported_network_templates = 5;</code>
   *
   * @return A list containing the supportedNetworkTemplates.
   */
  java.util.List<java.lang.String> getSupportedNetworkTemplatesList();
  /**
   *
   *
   * <pre>
   * Network templates that can be used with this OS Image.
   * </pre>
   *
   * <code>repeated string supported_network_templates = 5;</code>
   *
   * @return The count of supportedNetworkTemplates.
   */
  int getSupportedNetworkTemplatesCount();
  /**
   *
   *
   * <pre>
   * Network templates that can be used with this OS Image.
   * </pre>
   *
   * <code>repeated string supported_network_templates = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedNetworkTemplates at the given index.
   */
  java.lang.String getSupportedNetworkTemplates(int index);
  /**
   *
   *
   * <pre>
   * Network templates that can be used with this OS Image.
   * </pre>
   *
   * <code>repeated string supported_network_templates = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the supportedNetworkTemplates at the given index.
   */
  com.google.protobuf.ByteString getSupportedNetworkTemplatesBytes(int index);
}

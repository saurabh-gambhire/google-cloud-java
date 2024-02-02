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

public interface InstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.InstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the instance config.
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
   * Output only. The name of the instance config.
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
   * A transient unique identifier to idenfity an instance within an
   * ProvisioningConfig request.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * A transient unique identifier to idenfity an instance within an
   * ProvisioningConfig request.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Instance type.
   * [Available
   * types](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
   * </pre>
   *
   * <code>string instance_type = 3;</code>
   *
   * @return The instanceType.
   */
  java.lang.String getInstanceType();
  /**
   *
   *
   * <pre>
   * Instance type.
   * [Available
   * types](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
   * </pre>
   *
   * <code>string instance_type = 3;</code>
   *
   * @return The bytes for instanceType.
   */
  com.google.protobuf.ByteString getInstanceTypeBytes();

  /**
   *
   *
   * <pre>
   * Whether the instance should be provisioned with Hyperthreading enabled.
   * </pre>
   *
   * <code>bool hyperthreading = 4;</code>
   *
   * @return The hyperthreading.
   */
  boolean getHyperthreading();

  /**
   *
   *
   * <pre>
   * OS image to initialize the instance.
   * [Available
   * images](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
   * </pre>
   *
   * <code>string os_image = 5;</code>
   *
   * @return The osImage.
   */
  java.lang.String getOsImage();
  /**
   *
   *
   * <pre>
   * OS image to initialize the instance.
   * [Available
   * images](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
   * </pre>
   *
   * <code>string os_image = 5;</code>
   *
   * @return The bytes for osImage.
   */
  com.google.protobuf.ByteString getOsImageBytes();

  /**
   *
   *
   * <pre>
   * Client network address. Filled if InstanceConfig.multivlan_config is false.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddress client_network = 6 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.baremetalsolution.v2.InstanceConfig.client_network is deprecated. See
   *     google/cloud/baremetalsolution/v2/provisioning.proto;l=283
   * @return Whether the clientNetwork field is set.
   */
  @java.lang.Deprecated
  boolean hasClientNetwork();
  /**
   *
   *
   * <pre>
   * Client network address. Filled if InstanceConfig.multivlan_config is false.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddress client_network = 6 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.baremetalsolution.v2.InstanceConfig.client_network is deprecated. See
   *     google/cloud/baremetalsolution/v2/provisioning.proto;l=283
   * @return The clientNetwork.
   */
  @java.lang.Deprecated
  com.google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddress getClientNetwork();
  /**
   *
   *
   * <pre>
   * Client network address. Filled if InstanceConfig.multivlan_config is false.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddress client_network = 6 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddressOrBuilder
      getClientNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * Private network address, if any. Filled if InstanceConfig.multivlan_config
   * is false.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddress private_network = 7 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.baremetalsolution.v2.InstanceConfig.private_network is deprecated. See
   *     google/cloud/baremetalsolution/v2/provisioning.proto;l=287
   * @return Whether the privateNetwork field is set.
   */
  @java.lang.Deprecated
  boolean hasPrivateNetwork();
  /**
   *
   *
   * <pre>
   * Private network address, if any. Filled if InstanceConfig.multivlan_config
   * is false.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddress private_network = 7 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.baremetalsolution.v2.InstanceConfig.private_network is deprecated. See
   *     google/cloud/baremetalsolution/v2/provisioning.proto;l=287
   * @return The privateNetwork.
   */
  @java.lang.Deprecated
  com.google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddress getPrivateNetwork();
  /**
   *
   *
   * <pre>
   * Private network address, if any. Filled if InstanceConfig.multivlan_config
   * is false.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddress private_network = 7 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.baremetalsolution.v2.InstanceConfig.NetworkAddressOrBuilder
      getPrivateNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * User note field, it can be used by customers to add additional information
   * for the BMS Ops team .
   * </pre>
   *
   * <code>string user_note = 8;</code>
   *
   * @return The userNote.
   */
  java.lang.String getUserNote();
  /**
   *
   *
   * <pre>
   * User note field, it can be used by customers to add additional information
   * for the BMS Ops team .
   * </pre>
   *
   * <code>string user_note = 8;</code>
   *
   * @return The bytes for userNote.
   */
  com.google.protobuf.ByteString getUserNoteBytes();

  /**
   *
   *
   * <pre>
   * If true networks can be from different projects of the same vendor account.
   * </pre>
   *
   * <code>bool account_networks_enabled = 9;</code>
   *
   * @return The accountNetworksEnabled.
   */
  boolean getAccountNetworksEnabled();

  /**
   *
   *
   * <pre>
   * The type of network configuration on the instance.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.InstanceConfig.NetworkConfig network_config = 10;
   * </code>
   *
   * @return The enum numeric value on the wire for networkConfig.
   */
  int getNetworkConfigValue();
  /**
   *
   *
   * <pre>
   * The type of network configuration on the instance.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.InstanceConfig.NetworkConfig network_config = 10;
   * </code>
   *
   * @return The networkConfig.
   */
  com.google.cloud.baremetalsolution.v2.InstanceConfig.NetworkConfig getNetworkConfig();

  /**
   *
   *
   * <pre>
   * Server network template name. Filled if InstanceConfig.multivlan_config is
   * true.
   * </pre>
   *
   * <code>string network_template = 11;</code>
   *
   * @return The networkTemplate.
   */
  java.lang.String getNetworkTemplate();
  /**
   *
   *
   * <pre>
   * Server network template name. Filled if InstanceConfig.multivlan_config is
   * true.
   * </pre>
   *
   * <code>string network_template = 11;</code>
   *
   * @return The bytes for networkTemplate.
   */
  com.google.protobuf.ByteString getNetworkTemplateBytes();

  /**
   *
   *
   * <pre>
   * List of logical interfaces for the instance. The number of logical
   * interfaces will be the same as number of hardware bond/nic on the chosen
   * network template. Filled if InstanceConfig.multivlan_config is true.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.LogicalInterface logical_interfaces = 12;
   * </code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.LogicalInterface> getLogicalInterfacesList();
  /**
   *
   *
   * <pre>
   * List of logical interfaces for the instance. The number of logical
   * interfaces will be the same as number of hardware bond/nic on the chosen
   * network template. Filled if InstanceConfig.multivlan_config is true.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.LogicalInterface logical_interfaces = 12;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.LogicalInterface getLogicalInterfaces(int index);
  /**
   *
   *
   * <pre>
   * List of logical interfaces for the instance. The number of logical
   * interfaces will be the same as number of hardware bond/nic on the chosen
   * network template. Filled if InstanceConfig.multivlan_config is true.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.LogicalInterface logical_interfaces = 12;
   * </code>
   */
  int getLogicalInterfacesCount();
  /**
   *
   *
   * <pre>
   * List of logical interfaces for the instance. The number of logical
   * interfaces will be the same as number of hardware bond/nic on the chosen
   * network template. Filled if InstanceConfig.multivlan_config is true.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.LogicalInterface logical_interfaces = 12;
   * </code>
   */
  java.util.List<? extends com.google.cloud.baremetalsolution.v2.LogicalInterfaceOrBuilder>
      getLogicalInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of logical interfaces for the instance. The number of logical
   * interfaces will be the same as number of hardware bond/nic on the chosen
   * network template. Filled if InstanceConfig.multivlan_config is true.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.LogicalInterface logical_interfaces = 12;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.LogicalInterfaceOrBuilder getLogicalInterfacesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * List of names of ssh keys used to provision the instance.
   * </pre>
   *
   * <code>repeated string ssh_key_names = 13;</code>
   *
   * @return A list containing the sshKeyNames.
   */
  java.util.List<java.lang.String> getSshKeyNamesList();
  /**
   *
   *
   * <pre>
   * List of names of ssh keys used to provision the instance.
   * </pre>
   *
   * <code>repeated string ssh_key_names = 13;</code>
   *
   * @return The count of sshKeyNames.
   */
  int getSshKeyNamesCount();
  /**
   *
   *
   * <pre>
   * List of names of ssh keys used to provision the instance.
   * </pre>
   *
   * <code>repeated string ssh_key_names = 13;</code>
   *
   * @param index The index of the element to return.
   * @return The sshKeyNames at the given index.
   */
  java.lang.String getSshKeyNames(int index);
  /**
   *
   *
   * <pre>
   * List of names of ssh keys used to provision the instance.
   * </pre>
   *
   * <code>repeated string ssh_key_names = 13;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sshKeyNames at the given index.
   */
  com.google.protobuf.ByteString getSshKeyNamesBytes(int index);
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface NetworkInterfaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.NetworkInterface)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The network to connect the NIC to.
   * </pre>
   *
   * <code>string network = 1;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * The network to connect the NIC to.
   * </pre>
   *
   * <code>string network = 1;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * The subnetwork to connect the NIC to.
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   * <pre>
   * The subnetwork to connect the NIC to.
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString
      getSubnetworkBytes();

  /**
   * <pre>
   * The internal IP to define in the NIC.
   * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
   * resource full path.
   * </pre>
   *
   * <code>string internal_ip = 3;</code>
   * @return The internalIp.
   */
  java.lang.String getInternalIp();
  /**
   * <pre>
   * The internal IP to define in the NIC.
   * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
   * resource full path.
   * </pre>
   *
   * <code>string internal_ip = 3;</code>
   * @return The bytes for internalIp.
   */
  com.google.protobuf.ByteString
      getInternalIpBytes();

  /**
   * <pre>
   * The external IP to define in the NIC.
   * </pre>
   *
   * <code>string external_ip = 4;</code>
   * @return The externalIp.
   */
  java.lang.String getExternalIp();
  /**
   * <pre>
   * The external IP to define in the NIC.
   * </pre>
   *
   * <code>string external_ip = 4;</code>
   * @return The bytes for externalIp.
   */
  com.google.protobuf.ByteString
      getExternalIpBytes();
}
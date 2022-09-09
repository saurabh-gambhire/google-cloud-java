// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface PrivateClusterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.PrivateClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether nodes have internal IP addresses only. If enabled, all nodes are
   * given only RFC 1918 private addresses and communicate with the master via
   * private networking.
   * </pre>
   *
   * <code>bool enable_private_nodes = 1;</code>
   * @return The enablePrivateNodes.
   */
  boolean getEnablePrivateNodes();

  /**
   * <pre>
   * Whether the master's internal IP address is used as the cluster endpoint.
   * </pre>
   *
   * <code>bool enable_private_endpoint = 2;</code>
   * @return The enablePrivateEndpoint.
   */
  boolean getEnablePrivateEndpoint();

  /**
   * <pre>
   * The IP range in CIDR notation to use for the hosted master network. This
   * range will be used for assigning internal IP addresses to the master or
   * set of masters, as well as the ILB VIP. This range must not overlap with
   * any other ranges in use within the cluster's network.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 3;</code>
   * @return The masterIpv4CidrBlock.
   */
  java.lang.String getMasterIpv4CidrBlock();
  /**
   * <pre>
   * The IP range in CIDR notation to use for the hosted master network. This
   * range will be used for assigning internal IP addresses to the master or
   * set of masters, as well as the ILB VIP. This range must not overlap with
   * any other ranges in use within the cluster's network.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 3;</code>
   * @return The bytes for masterIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getMasterIpv4CidrBlockBytes();

  /**
   * <pre>
   * Output only. The internal IP address of this cluster's master endpoint.
   * </pre>
   *
   * <code>string private_endpoint = 4;</code>
   * @return The privateEndpoint.
   */
  java.lang.String getPrivateEndpoint();
  /**
   * <pre>
   * Output only. The internal IP address of this cluster's master endpoint.
   * </pre>
   *
   * <code>string private_endpoint = 4;</code>
   * @return The bytes for privateEndpoint.
   */
  com.google.protobuf.ByteString
      getPrivateEndpointBytes();

  /**
   * <pre>
   * Output only. The external IP address of this cluster's master endpoint.
   * </pre>
   *
   * <code>string public_endpoint = 5;</code>
   * @return The publicEndpoint.
   */
  java.lang.String getPublicEndpoint();
  /**
   * <pre>
   * Output only. The external IP address of this cluster's master endpoint.
   * </pre>
   *
   * <code>string public_endpoint = 5;</code>
   * @return The bytes for publicEndpoint.
   */
  com.google.protobuf.ByteString
      getPublicEndpointBytes();

  /**
   * <pre>
   * Output only. The peering name in the customer VPC used by this cluster.
   * </pre>
   *
   * <code>string peering_name = 7;</code>
   * @return The peeringName.
   */
  java.lang.String getPeeringName();
  /**
   * <pre>
   * Output only. The peering name in the customer VPC used by this cluster.
   * </pre>
   *
   * <code>string peering_name = 7;</code>
   * @return The bytes for peeringName.
   */
  com.google.protobuf.ByteString
      getPeeringNameBytes();

  /**
   * <pre>
   * Controls master global access settings.
   * </pre>
   *
   * <code>.google.container.v1beta1.PrivateClusterMasterGlobalAccessConfig master_global_access_config = 8;</code>
   * @return Whether the masterGlobalAccessConfig field is set.
   */
  boolean hasMasterGlobalAccessConfig();
  /**
   * <pre>
   * Controls master global access settings.
   * </pre>
   *
   * <code>.google.container.v1beta1.PrivateClusterMasterGlobalAccessConfig master_global_access_config = 8;</code>
   * @return The masterGlobalAccessConfig.
   */
  com.google.container.v1beta1.PrivateClusterMasterGlobalAccessConfig getMasterGlobalAccessConfig();
  /**
   * <pre>
   * Controls master global access settings.
   * </pre>
   *
   * <code>.google.container.v1beta1.PrivateClusterMasterGlobalAccessConfig master_global_access_config = 8;</code>
   */
  com.google.container.v1beta1.PrivateClusterMasterGlobalAccessConfigOrBuilder getMasterGlobalAccessConfigOrBuilder();
}
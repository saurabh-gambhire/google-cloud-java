// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface VpnGatewayStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VpnGatewayStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  java.util.List<com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection> 
      getVpnConnectionsList();
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection getVpnConnections(int index);
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  int getVpnConnectionsCount();
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder> 
      getVpnConnectionsOrBuilderList();
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder getVpnConnectionsOrBuilder(
      int index);
}
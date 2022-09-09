// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface LinuxNodeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.LinuxNodeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  int getSysctlsCount();
  /**
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  boolean containsSysctls(
      java.lang.String key);
  /**
   * Use {@link #getSysctlsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSysctls();
  /**
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSysctlsMap();
  /**
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */

  /* nullable */
java.lang.String getSysctlsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */

  java.lang.String getSysctlsOrThrow(
      java.lang.String key);
}
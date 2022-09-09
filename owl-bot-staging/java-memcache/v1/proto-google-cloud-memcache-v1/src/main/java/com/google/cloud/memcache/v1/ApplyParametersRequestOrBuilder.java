// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/memcache/v1/cloud_memcache.proto

package com.google.cloud.memcache.v1;

public interface ApplyParametersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.memcache.v1.ApplyParametersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the Memcached instance for which parameter group updates
   * should be applied.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Resource name of the Memcached instance for which parameter group updates
   * should be applied.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Nodes to which we should apply the instance-level parameter group.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   * @return A list containing the nodeIds.
   */
  java.util.List<java.lang.String>
      getNodeIdsList();
  /**
   * <pre>
   * Nodes to which we should apply the instance-level parameter group.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   * @return The count of nodeIds.
   */
  int getNodeIdsCount();
  /**
   * <pre>
   * Nodes to which we should apply the instance-level parameter group.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The nodeIds at the given index.
   */
  java.lang.String getNodeIds(int index);
  /**
   * <pre>
   * Nodes to which we should apply the instance-level parameter group.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the nodeIds at the given index.
   */
  com.google.protobuf.ByteString
      getNodeIdsBytes(int index);

  /**
   * <pre>
   * Whether to apply instance-level parameter group to all nodes. If set to
   * true, will explicitly restrict users from specifying any nodes, and apply
   * parameter group updates to all nodes within the instance.
   * </pre>
   *
   * <code>bool apply_all = 3;</code>
   * @return The applyAll.
   */
  boolean getApplyAll();
}
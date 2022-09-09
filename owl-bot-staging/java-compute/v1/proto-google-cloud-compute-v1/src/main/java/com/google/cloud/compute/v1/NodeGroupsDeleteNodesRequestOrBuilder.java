// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NodeGroupsDeleteNodesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeGroupsDeleteNodesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   * @return A list containing the nodes.
   */
  java.util.List<java.lang.String>
      getNodesList();
  /**
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   * @return The count of nodes.
   */
  int getNodesCount();
  /**
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   * @param index The index of the element to return.
   * @return The nodes at the given index.
   */
  java.lang.String getNodes(int index);
  /**
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   * @param index The index of the value to return.
   * @return The bytes of the nodes at the given index.
   */
  com.google.protobuf.ByteString
      getNodesBytes(int index);
}
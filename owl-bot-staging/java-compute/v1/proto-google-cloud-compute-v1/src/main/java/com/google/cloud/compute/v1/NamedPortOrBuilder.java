// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NamedPortOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NamedPort)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name for this named port. The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The port number, which can be a value between 1 and 65535.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   * @return Whether the port field is set.
   */
  boolean hasPort();
  /**
   * <pre>
   * The port number, which can be a value between 1 and 65535.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   * @return The port.
   */
  int getPort();
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/realms.proto

package com.google.cloud.gaming.v1;

public interface PreviewRealmUpdateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.PreviewRealmUpdateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ETag of the realm.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * ETag of the realm.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   * @return Whether the targetState field is set.
   */
  boolean hasTargetState();
  /**
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   * @return The targetState.
   */
  com.google.cloud.gaming.v1.TargetState getTargetState();
  /**
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   */
  com.google.cloud.gaming.v1.TargetStateOrBuilder getTargetStateOrBuilder();
}
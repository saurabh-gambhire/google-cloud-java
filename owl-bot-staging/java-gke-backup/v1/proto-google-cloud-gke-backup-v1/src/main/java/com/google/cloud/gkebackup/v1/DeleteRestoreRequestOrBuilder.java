// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/gkebackup.proto

package com.google.cloud.gkebackup.v1;

public interface DeleteRestoreRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.DeleteRestoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Full name of the Restore
   * Format: projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;&#47;restores/&#42;
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Full name of the Restore
   * Format: projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;&#47;restores/&#42;
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If provided, this value must match the current value of the
   * target Restore's [etag][google.cloud.gkebackup.v1.Restore.etag] field or the request is
   * rejected.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * If provided, this value must match the current value of the
   * target Restore's [etag][google.cloud.gkebackup.v1.Restore.etag] field or the request is
   * rejected.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * If set to true, any VolumeRestores below this restore will also be deleted.
   * Otherwise, the request will only succeed if the restore has no
   * VolumeRestores.
   * </pre>
   *
   * <code>bool force = 3;</code>
   * @return The force.
   */
  boolean getForce();
}
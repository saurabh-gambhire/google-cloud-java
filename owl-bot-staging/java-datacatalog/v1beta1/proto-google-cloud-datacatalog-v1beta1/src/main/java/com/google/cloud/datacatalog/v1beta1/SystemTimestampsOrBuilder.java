// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/timestamps.proto

package com.google.cloud.datacatalog.v1beta1;

public interface SystemTimestampsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.SystemTimestamps)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The creation time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The creation time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The creation time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The last-modified time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The last-modified time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The last-modified time of the resource within the given system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The expiration time of the resource within the given system.
   * Currently only apllicable to BigQuery resources.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <pre>
   * Output only. The expiration time of the resource within the given system.
   * Currently only apllicable to BigQuery resources.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   * <pre>
   * Output only. The expiration time of the resource within the given system.
   * Currently only apllicable to BigQuery resources.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();
}
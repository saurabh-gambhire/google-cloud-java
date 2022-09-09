// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/clouddms_resources.proto

package com.google.cloud.clouddms.v1;

public interface CloudSqlConnectionProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.CloudSqlConnectionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The Cloud SQL instance ID that this connection profile is associated with.
   * </pre>
   *
   * <code>string cloud_sql_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The cloudSqlId.
   */
  java.lang.String getCloudSqlId();
  /**
   * <pre>
   * Output only. The Cloud SQL instance ID that this connection profile is associated with.
   * </pre>
   *
   * <code>string cloud_sql_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for cloudSqlId.
   */
  com.google.protobuf.ByteString
      getCloudSqlIdBytes();

  /**
   * <pre>
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   * <pre>
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The settings.
   */
  com.google.cloud.clouddms.v1.CloudSqlSettings getSettings();
  /**
   * <pre>
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.clouddms.v1.CloudSqlSettingsOrBuilder getSettingsOrBuilder();

  /**
   * <pre>
   * Output only. The Cloud SQL database instance's private IP.
   * </pre>
   *
   * <code>string private_ip = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The privateIp.
   */
  java.lang.String getPrivateIp();
  /**
   * <pre>
   * Output only. The Cloud SQL database instance's private IP.
   * </pre>
   *
   * <code>string private_ip = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for privateIp.
   */
  com.google.protobuf.ByteString
      getPrivateIpBytes();

  /**
   * <pre>
   * Output only. The Cloud SQL database instance's public IP.
   * </pre>
   *
   * <code>string public_ip = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The publicIp.
   */
  java.lang.String getPublicIp();
  /**
   * <pre>
   * Output only. The Cloud SQL database instance's public IP.
   * </pre>
   *
   * <code>string public_ip = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for publicIp.
   */
  com.google.protobuf.ByteString
      getPublicIpBytes();
}
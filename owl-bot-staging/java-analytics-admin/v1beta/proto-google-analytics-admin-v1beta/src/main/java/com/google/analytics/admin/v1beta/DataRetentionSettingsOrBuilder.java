// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/resources.proto

package com.google.analytics.admin.v1beta;

public interface DataRetentionSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.DataRetentionSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name for this DataRetentionSetting resource.
   * Format: properties/{property}/dataRetentionSettings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name for this DataRetentionSetting resource.
   * Format: properties/{property}/dataRetentionSettings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The length of time that event-level data is retained.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;</code>
   * @return The enum numeric value on the wire for eventDataRetention.
   */
  int getEventDataRetentionValue();
  /**
   * <pre>
   * The length of time that event-level data is retained.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;</code>
   * @return The eventDataRetention.
   */
  com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration getEventDataRetention();

  /**
   * <pre>
   * If true, reset the retention period for the user identifier with every
   * event from that user.
   * </pre>
   *
   * <code>bool reset_user_data_on_new_activity = 3;</code>
   * @return The resetUserDataOnNewActivity.
   */
  boolean getResetUserDataOnNewActivity();
}
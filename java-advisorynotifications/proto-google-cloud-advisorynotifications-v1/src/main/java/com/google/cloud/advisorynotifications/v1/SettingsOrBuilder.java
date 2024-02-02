/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/advisorynotifications/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.advisorynotifications.v1;

public interface SettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.advisorynotifications.v1.Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the settings to retrieve.
   * Format:
   * organizations/{organization}/locations/{location}/settings.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the settings to retrieve.
   * Format:
   * organizations/{organization}/locations/{location}/settings.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Map of each notification type and its settings to get/set all
   * settings at once. The server will validate the value for each notification
   * type.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.advisorynotifications.v1.NotificationSettings&gt; notification_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getNotificationSettingsCount();
  /**
   *
   *
   * <pre>
   * Required. Map of each notification type and its settings to get/set all
   * settings at once. The server will validate the value for each notification
   * type.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.advisorynotifications.v1.NotificationSettings&gt; notification_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsNotificationSettings(java.lang.String key);
  /** Use {@link #getNotificationSettingsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.advisorynotifications.v1.NotificationSettings>
      getNotificationSettings();
  /**
   *
   *
   * <pre>
   * Required. Map of each notification type and its settings to get/set all
   * settings at once. The server will validate the value for each notification
   * type.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.advisorynotifications.v1.NotificationSettings&gt; notification_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.advisorynotifications.v1.NotificationSettings>
      getNotificationSettingsMap();
  /**
   *
   *
   * <pre>
   * Required. Map of each notification type and its settings to get/set all
   * settings at once. The server will validate the value for each notification
   * type.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.advisorynotifications.v1.NotificationSettings&gt; notification_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  /* nullable */
  com.google.cloud.advisorynotifications.v1.NotificationSettings getNotificationSettingsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.advisorynotifications.v1.NotificationSettings defaultValue);
  /**
   *
   *
   * <pre>
   * Required. Map of each notification type and its settings to get/set all
   * settings at once. The server will validate the value for each notification
   * type.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.advisorynotifications.v1.NotificationSettings&gt; notification_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.advisorynotifications.v1.NotificationSettings getNotificationSettingsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Fingerprint for optimistic concurrency returned in Get requests.
   * Must be provided for Update requests. If the value provided does not match
   * the value known to the server, ABORTED will be thrown, and the client
   * should retry the read-modify-write cycle.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Required. Fingerprint for optimistic concurrency returned in Get requests.
   * Must be provided for Update requests. If the value provided does not match
   * the value known to the server, ABORTED will be thrown, and the client
   * should retry the read-modify-write cycle.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}

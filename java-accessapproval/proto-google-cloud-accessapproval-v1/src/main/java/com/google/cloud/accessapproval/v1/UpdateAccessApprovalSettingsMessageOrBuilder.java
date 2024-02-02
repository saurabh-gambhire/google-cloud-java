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
// source: google/cloud/accessapproval/v1/accessapproval.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.accessapproval.v1;

public interface UpdateAccessApprovalSettingsMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   *
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   *
   *
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   *
   * @return The settings.
   */
  com.google.cloud.accessapproval.v1.AccessApprovalSettings getSettings();
  /**
   *
   *
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   */
  com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder getSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

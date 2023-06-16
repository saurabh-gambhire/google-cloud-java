/*
 * Copyright 2023 Google LLC
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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface UpdateAccountRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.UpdateAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The account to update.
   * The account's `name` field is used to identify the account.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Account account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   *
   *
   * <pre>
   * Required. The account to update.
   * The account's `name` field is used to identify the account.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Account account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The account.
   */
  com.google.analytics.admin.v1alpha.Account getAccount();
  /**
   *
   *
   * <pre>
   * Required. The account to update.
   * The account's `name` field is used to identify the account.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Account account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.AccountOrBuilder getAccountOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (for example, "field_to_update"). Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (for example, "field_to_update"). Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (for example, "field_to_update"). Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

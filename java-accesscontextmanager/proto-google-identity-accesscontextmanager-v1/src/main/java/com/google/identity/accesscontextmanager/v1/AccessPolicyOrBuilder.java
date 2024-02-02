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
// source: google/identity/accesscontextmanager/v1/access_policy.proto

// Protobuf Java Version: 3.25.2
package com.google.identity.accesscontextmanager.v1;

public interface AccessPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.AccessPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the `AccessPolicy`. Format:
   * `accessPolicies/{access_policy}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the `AccessPolicy`. Format:
   * `accessPolicies/{access_policy}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The parent of this `AccessPolicy` in the Cloud Resource
   * Hierarchy. Currently immutable once created. Format:
   * `organizations/{organization_id}`
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent of this `AccessPolicy` in the Cloud Resource
   * Hierarchy. Currently immutable once created. Format:
   * `organizations/{organization_id}`
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Human readable title. Does not affect behavior.
   * </pre>
   *
   * <code>string title = 3;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Required. Human readable title. Does not affect behavior.
   * </pre>
   *
   * <code>string title = 3;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * The scopes of a policy define which resources an ACM policy can restrict,
   * and where ACM resources can be referenced.
   * For example, a policy with scopes=["folders/123"] has the following
   * behavior:
   * - vpcsc perimeters can only restrict projects within folders/123
   * - access levels can only be referenced by resources within folders/123.
   * If empty, there are no limitations on which resources can be restricted by
   * an ACM policy, and there are no limitations on where ACM resources can be
   * referenced.
   * Only one policy can include a given scope (attempting to create a second
   * policy which includes "folders/123" will result in an error).
   * Currently, scopes cannot be modified after a policy is created.
   * Currently, policies can only have a single scope.
   * Format: list of `folders/{folder_number}` or `projects/{project_number}`
   * </pre>
   *
   * <code>repeated string scopes = 7;</code>
   *
   * @return A list containing the scopes.
   */
  java.util.List<java.lang.String> getScopesList();
  /**
   *
   *
   * <pre>
   * The scopes of a policy define which resources an ACM policy can restrict,
   * and where ACM resources can be referenced.
   * For example, a policy with scopes=["folders/123"] has the following
   * behavior:
   * - vpcsc perimeters can only restrict projects within folders/123
   * - access levels can only be referenced by resources within folders/123.
   * If empty, there are no limitations on which resources can be restricted by
   * an ACM policy, and there are no limitations on where ACM resources can be
   * referenced.
   * Only one policy can include a given scope (attempting to create a second
   * policy which includes "folders/123" will result in an error).
   * Currently, scopes cannot be modified after a policy is created.
   * Currently, policies can only have a single scope.
   * Format: list of `folders/{folder_number}` or `projects/{project_number}`
   * </pre>
   *
   * <code>repeated string scopes = 7;</code>
   *
   * @return The count of scopes.
   */
  int getScopesCount();
  /**
   *
   *
   * <pre>
   * The scopes of a policy define which resources an ACM policy can restrict,
   * and where ACM resources can be referenced.
   * For example, a policy with scopes=["folders/123"] has the following
   * behavior:
   * - vpcsc perimeters can only restrict projects within folders/123
   * - access levels can only be referenced by resources within folders/123.
   * If empty, there are no limitations on which resources can be restricted by
   * an ACM policy, and there are no limitations on where ACM resources can be
   * referenced.
   * Only one policy can include a given scope (attempting to create a second
   * policy which includes "folders/123" will result in an error).
   * Currently, scopes cannot be modified after a policy is created.
   * Currently, policies can only have a single scope.
   * Format: list of `folders/{folder_number}` or `projects/{project_number}`
   * </pre>
   *
   * <code>repeated string scopes = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  java.lang.String getScopes(int index);
  /**
   *
   *
   * <pre>
   * The scopes of a policy define which resources an ACM policy can restrict,
   * and where ACM resources can be referenced.
   * For example, a policy with scopes=["folders/123"] has the following
   * behavior:
   * - vpcsc perimeters can only restrict projects within folders/123
   * - access levels can only be referenced by resources within folders/123.
   * If empty, there are no limitations on which resources can be restricted by
   * an ACM policy, and there are no limitations on where ACM resources can be
   * referenced.
   * Only one policy can include a given scope (attempting to create a second
   * policy which includes "folders/123" will result in an error).
   * Currently, scopes cannot be modified after a policy is created.
   * Currently, policies can only have a single scope.
   * Format: list of `folders/{folder_number}` or `projects/{project_number}`
   * </pre>
   *
   * <code>repeated string scopes = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  com.google.protobuf.ByteString getScopesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessPolicy` was created in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessPolicy` was created in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessPolicy` was created in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessPolicy` was updated in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessPolicy` was updated in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessPolicy` was updated in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. An opaque identifier for the current version of the
   * `AccessPolicy`. This will always be a strongly validated etag, meaning that
   * two Access Polices will be identical if and only if their etags are
   * identical. Clients should not expect this to be in any specific format.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. An opaque identifier for the current version of the
   * `AccessPolicy`. This will always be a strongly validated etag, meaning that
   * two Access Polices will be identical if and only if their etags are
   * identical. Clients should not expect this to be in any specific format.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}

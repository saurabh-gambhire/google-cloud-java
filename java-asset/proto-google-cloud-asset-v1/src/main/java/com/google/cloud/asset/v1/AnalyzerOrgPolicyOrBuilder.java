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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1;

public interface AnalyzerOrgPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzerOrgPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The [full resource name]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format) of
   * an organization/folder/project resource where this organization policy is
   * set.
   *
   * Notice that some type of constraints are defined with default policy. This
   * field will be empty for them.
   * </pre>
   *
   * <code>string attached_resource = 1;</code>
   *
   * @return The attachedResource.
   */
  java.lang.String getAttachedResource();
  /**
   *
   *
   * <pre>
   * The [full resource name]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format) of
   * an organization/folder/project resource where this organization policy is
   * set.
   *
   * Notice that some type of constraints are defined with default policy. This
   * field will be empty for them.
   * </pre>
   *
   * <code>string attached_resource = 1;</code>
   *
   * @return The bytes for attachedResource.
   */
  com.google.protobuf.ByteString getAttachedResourceBytes();

  /**
   *
   *
   * <pre>
   * The [full resource name]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format) of
   * an organization/folder/project resource where this organization policy
   * applies to.
   *
   * For any user defined org policies, this field has the same value as
   * the [attached_resource] field. Only for default policy, this field has
   * the different value.
   * </pre>
   *
   * <code>string applied_resource = 5;</code>
   *
   * @return The appliedResource.
   */
  java.lang.String getAppliedResource();
  /**
   *
   *
   * <pre>
   * The [full resource name]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format) of
   * an organization/folder/project resource where this organization policy
   * applies to.
   *
   * For any user defined org policies, this field has the same value as
   * the [attached_resource] field. Only for default policy, this field has
   * the different value.
   * </pre>
   *
   * <code>string applied_resource = 5;</code>
   *
   * @return The bytes for appliedResource.
   */
  com.google.protobuf.ByteString getAppliedResourceBytes();

  /**
   *
   *
   * <pre>
   * List of rules for this organization policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.AnalyzerOrgPolicy.Rule rules = 2;</code>
   */
  java.util.List<com.google.cloud.asset.v1.AnalyzerOrgPolicy.Rule> getRulesList();
  /**
   *
   *
   * <pre>
   * List of rules for this organization policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.AnalyzerOrgPolicy.Rule rules = 2;</code>
   */
  com.google.cloud.asset.v1.AnalyzerOrgPolicy.Rule getRules(int index);
  /**
   *
   *
   * <pre>
   * List of rules for this organization policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.AnalyzerOrgPolicy.Rule rules = 2;</code>
   */
  int getRulesCount();
  /**
   *
   *
   * <pre>
   * List of rules for this organization policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.AnalyzerOrgPolicy.Rule rules = 2;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.AnalyzerOrgPolicy.RuleOrBuilder>
      getRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of rules for this organization policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.AnalyzerOrgPolicy.Rule rules = 2;</code>
   */
  com.google.cloud.asset.v1.AnalyzerOrgPolicy.RuleOrBuilder getRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If `inherit_from_parent` is true, Rules set higher up in the
   * hierarchy (up to the closest root) are inherited and present in the
   * effective policy. If it is false, then no rules are inherited, and this
   * policy becomes the effective root for evaluation.
   * </pre>
   *
   * <code>bool inherit_from_parent = 3;</code>
   *
   * @return The inheritFromParent.
   */
  boolean getInheritFromParent();

  /**
   *
   *
   * <pre>
   * Ignores policies set above this resource and restores the default behavior
   * of the constraint at this resource.
   * This field can be set in policies for either list or boolean
   * constraints. If set, `rules` must be empty and `inherit_from_parent`
   * must be set to false.
   * </pre>
   *
   * <code>bool reset = 4;</code>
   *
   * @return The reset.
   */
  boolean getReset();
}

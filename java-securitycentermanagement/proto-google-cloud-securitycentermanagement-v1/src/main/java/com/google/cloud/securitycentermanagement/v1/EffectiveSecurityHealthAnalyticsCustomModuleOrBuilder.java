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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

package com.google.cloud.securitycentermanagement.v1;

public interface EffectiveSecurityHealthAnalyticsCustomModuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.EffectiveSecurityHealthAnalyticsCustomModule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the custom module.
   * Its format is
   * "organizations/{organization}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{effective_security_health_analytics_custom_module}",
   * or
   * "folders/{folder}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{effective_security_health_analytics_custom_module}",
   * or
   * "projects/{project}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{effective_security_health_analytics_custom_module}"
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
   * Output only. The resource name of the custom module.
   * Its format is
   * "organizations/{organization}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{effective_security_health_analytics_custom_module}",
   * or
   * "folders/{folder}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{effective_security_health_analytics_custom_module}",
   * or
   * "projects/{project}/locations/{location}/effectiveSecurityHealthAnalyticsCustomModules/{effective_security_health_analytics_custom_module}"
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
   * Output only. The user-specified configuration for the module.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.CustomConfig custom_config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the customConfig field is set.
   */
  boolean hasCustomConfig();
  /**
   *
   *
   * <pre>
   * Output only. The user-specified configuration for the module.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.CustomConfig custom_config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The customConfig.
   */
  com.google.cloud.securitycentermanagement.v1.CustomConfig getCustomConfig();
  /**
   *
   *
   * <pre>
   * Output only. The user-specified configuration for the module.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.CustomConfig custom_config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycentermanagement.v1.CustomConfigOrBuilder getCustomConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The effective state of enablement for the module at the given
   * level of the hierarchy.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EffectiveSecurityHealthAnalyticsCustomModule.EnablementState enablement_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for enablementState.
   */
  int getEnablementStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The effective state of enablement for the module at the given
   * level of the hierarchy.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EffectiveSecurityHealthAnalyticsCustomModule.EnablementState enablement_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enablementState.
   */
  com.google.cloud.securitycentermanagement.v1.EffectiveSecurityHealthAnalyticsCustomModule
          .EnablementState
      getEnablementState();

  /**
   *
   *
   * <pre>
   * Output only. The display name for the custom module. The name must be
   * between 1 and 128 characters, start with a lowercase letter, and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The display name for the custom module. The name must be
   * between 1 and 128 characters, start with a lowercase letter, and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}

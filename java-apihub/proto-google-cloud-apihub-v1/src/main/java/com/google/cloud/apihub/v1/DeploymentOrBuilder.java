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
// source: google/cloud/apihub/v1/common_fields.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.apihub.v1;

public interface DeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.Deployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the deployment.
   *
   * Format:
   * `projects/{project}/locations/{location}/deployments/{deployment}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The name of the deployment.
   *
   * Format:
   * `projects/{project}/locations/{location}/deployments/{deployment}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the deployment.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the deployment.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of the deployment.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of the deployment.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The documentation of the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Documentation documentation = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the documentation field is set.
   */
  boolean hasDocumentation();
  /**
   *
   *
   * <pre>
   * Optional. The documentation of the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Documentation documentation = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The documentation.
   */
  com.google.cloud.apihub.v1.Documentation getDocumentation();
  /**
   *
   *
   * <pre>
   * Optional. The documentation of the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.Documentation documentation = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.DocumentationOrBuilder getDocumentationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The type of deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-deployment-type`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues deployment_type = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deploymentType field is set.
   */
  boolean hasDeploymentType();
  /**
   *
   *
   * <pre>
   * Required. The type of deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-deployment-type`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues deployment_type = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deploymentType.
   */
  com.google.cloud.apihub.v1.AttributeValues getDeploymentType();
  /**
   *
   *
   * <pre>
   * Required. The type of deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-deployment-type`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues deployment_type = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getDeploymentTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A URI to the runtime resource. This URI can be used to manage the
   * resource. For example, if the runtime resource is of type APIGEE_PROXY,
   * then this field will contain the URI to the management UI of the proxy.
   * </pre>
   *
   * <code>string resource_uri = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resourceUri.
   */
  java.lang.String getResourceUri();
  /**
   *
   *
   * <pre>
   * Required. A URI to the runtime resource. This URI can be used to manage the
   * resource. For example, if the runtime resource is of type APIGEE_PROXY,
   * then this field will contain the URI to the management UI of the proxy.
   * </pre>
   *
   * <code>string resource_uri = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resourceUri.
   */
  com.google.protobuf.ByteString getResourceUriBytes();

  /**
   *
   *
   * <pre>
   * Required. The endpoints at which this deployment resource is listening for
   * API requests. This could be a list of complete URIs, hostnames or an IP
   * addresses.
   * </pre>
   *
   * <code>repeated string endpoints = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the endpoints.
   */
  java.util.List<java.lang.String> getEndpointsList();
  /**
   *
   *
   * <pre>
   * Required. The endpoints at which this deployment resource is listening for
   * API requests. This could be a list of complete URIs, hostnames or an IP
   * addresses.
   * </pre>
   *
   * <code>repeated string endpoints = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of endpoints.
   */
  int getEndpointsCount();
  /**
   *
   *
   * <pre>
   * Required. The endpoints at which this deployment resource is listening for
   * API requests. This could be a list of complete URIs, hostnames or an IP
   * addresses.
   * </pre>
   *
   * <code>repeated string endpoints = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The endpoints at the given index.
   */
  java.lang.String getEndpoints(int index);
  /**
   *
   *
   * <pre>
   * Required. The endpoints at which this deployment resource is listening for
   * API requests. This could be a list of complete URIs, hostnames or an IP
   * addresses.
   * </pre>
   *
   * <code>repeated string endpoints = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the endpoints at the given index.
   */
  com.google.protobuf.ByteString getEndpointsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The API versions linked to this deployment.
   * Note: A particular deployment could be linked to multiple different API
   * versions (of same or different APIs).
   * </pre>
   *
   * <code>repeated string api_versions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the apiVersions.
   */
  java.util.List<java.lang.String> getApiVersionsList();
  /**
   *
   *
   * <pre>
   * Output only. The API versions linked to this deployment.
   * Note: A particular deployment could be linked to multiple different API
   * versions (of same or different APIs).
   * </pre>
   *
   * <code>repeated string api_versions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of apiVersions.
   */
  int getApiVersionsCount();
  /**
   *
   *
   * <pre>
   * Output only. The API versions linked to this deployment.
   * Note: A particular deployment could be linked to multiple different API
   * versions (of same or different APIs).
   * </pre>
   *
   * <code>repeated string api_versions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The apiVersions at the given index.
   */
  java.lang.String getApiVersions(int index);
  /**
   *
   *
   * <pre>
   * Output only. The API versions linked to this deployment.
   * Note: A particular deployment could be linked to multiple different API
   * versions (of same or different APIs).
   * </pre>
   *
   * <code>repeated string api_versions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the apiVersions at the given index.
   */
  com.google.protobuf.ByteString getApiVersionsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The time at which the deployment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the deployment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the deployment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the deployment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the deployment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the deployment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The SLO for this deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-slo`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues slo = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the slo field is set.
   */
  boolean hasSlo();
  /**
   *
   *
   * <pre>
   * Optional. The SLO for this deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-slo`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues slo = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The slo.
   */
  com.google.cloud.apihub.v1.AttributeValues getSlo();
  /**
   *
   *
   * <pre>
   * Optional. The SLO for this deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-slo`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues slo = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getSloOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The environment mapping to this deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-environment`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues environment = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   *
   *
   * <pre>
   * Optional. The environment mapping to this deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-environment`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues environment = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The environment.
   */
  com.google.cloud.apihub.v1.AttributeValues getEnvironment();
  /**
   *
   *
   * <pre>
   * Optional. The environment mapping to this deployment.
   * This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-environment`
   * attribute.
   * The number of values for this attribute will be based on the
   * cardinality of the attribute. The same can be retrieved via GetAttribute
   * API. All values should be from the list of allowed values defined for the
   * attribute.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.AttributeValues environment = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValuesOrBuilder getEnvironmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the
   * deployment resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the
   * deployment resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAttributes(java.lang.String key);
  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.apihub.v1.AttributeValues> getAttributes();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the
   * deployment resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.apihub.v1.AttributeValues> getAttributesMap();
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the
   * deployment resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.cloud.apihub.v1.AttributeValues getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.apihub.v1.AttributeValues defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The list of user defined attributes associated with the
   * deployment resource. The key is the attribute name. It will be of the
   * format: `projects/{project}/locations/{location}/attributes/{attribute}`.
   * The value is the attribute values associated with the resource.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.apihub.v1.AttributeValues&gt; attributes = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apihub.v1.AttributeValues getAttributesOrThrow(java.lang.String key);
}

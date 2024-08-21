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
// source: google/cloud/apihub/v1/apihub_service.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.apihub.v1;

public interface ListDeploymentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.ListDeploymentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of deployment resources.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of deployment resources.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. An expression that filters the list of Deployments.
   *
   * A filter expression consists of a field name, a comparison
   * operator, and a value for filtering. The value must be a string. The
   * comparison operator must be one of: `&lt;`, `&gt;` or
   * `=`. Filters are not case sensitive.
   *
   * The following fields in the `Deployments` are eligible for filtering:
   *
   *   * `display_name` - The display name of the Deployment. Allowed
   *   comparison operators: `=`.
   *   * `create_time` - The time at which the Deployment was created. The
   *   value should be in the (RFC3339)[https://tools.ietf.org/html/rfc3339]
   *   format. Allowed comparison operators: `&gt;` and `&lt;`.
   *   * `resource_uri` - A URI to the deployment resource. Allowed
   *   comparison operators: `=`.
   *   * `api_versions` - The API versions linked to this deployment. Allowed
   *   comparison operators: `:`.
   *   * `deployment_type.enum_values.values.id` - The allowed value id of the
   *   deployment_type attribute associated with the Deployment. Allowed
   *   comparison operators: `:`.
   *   * `deployment_type.enum_values.values.display_name` - The allowed value
   *   display name of the deployment_type attribute associated with the
   *   Deployment. Allowed comparison operators: `:`.
   *   * `slo.string_values.values` -The allowed string value of the slo
   *   attribute associated with the deployment. Allowed comparison
   *   operators: `:`.
   *   * `environment.enum_values.values.id` - The allowed value id of the
   *   environment attribute associated with the deployment. Allowed
   *   comparison operators: `:`.
   *   * `environment.enum_values.values.display_name` - The allowed value
   *   display name of the environment attribute associated with the deployment.
   *   Allowed comparison operators: `:`.
   *
   * Expressions are combined with either `AND` logic operator or `OR` logical
   * operator but not both of them together i.e. only one of the `AND` or `OR`
   * operator can be used throughout the filter string and both the operators
   * cannot be used together. No other logical operators are supported. At most
   * three filter fields are allowed in the filter string and if provided
   * more than that then `INVALID_ARGUMENT` error is returned by the API.
   *
   * Here are a few examples:
   *
   *   * `environment.enum_values.values.id: staging-id` - The allowed value id
   *   of the environment attribute associated with the Deployment is
   *   _staging-id_.
   *   * `environment.enum_values.values.display_name: &#92;"Staging Deployment&#92;"` -
   *   The allowed value display name of the environment attribute associated
   *   with the Deployment is `Staging Deployment`.
   *   * `environment.enum_values.values.id: production-id AND create_time &lt;
   *   &#92;"2021-08-15T14:50:00Z&#92;" AND create_time &gt; &#92;"2021-08-10T12:00:00Z&#92;"` -
   *   The allowed value id of the environment attribute associated with the
   *   Deployment is _production-id_ and Deployment was created before
   *   _2021-08-15 14:50:00 UTC_ and after _2021-08-10 12:00:00 UTC_.
   *   * `environment.enum_values.values.id: production-id OR
   *   slo.string_values.values: &#92;"99.99%&#92;"`
   *   - The allowed value id of the environment attribute Deployment is
   *   _production-id_ or string value of the slo attribute is _99.99%_.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. An expression that filters the list of Deployments.
   *
   * A filter expression consists of a field name, a comparison
   * operator, and a value for filtering. The value must be a string. The
   * comparison operator must be one of: `&lt;`, `&gt;` or
   * `=`. Filters are not case sensitive.
   *
   * The following fields in the `Deployments` are eligible for filtering:
   *
   *   * `display_name` - The display name of the Deployment. Allowed
   *   comparison operators: `=`.
   *   * `create_time` - The time at which the Deployment was created. The
   *   value should be in the (RFC3339)[https://tools.ietf.org/html/rfc3339]
   *   format. Allowed comparison operators: `&gt;` and `&lt;`.
   *   * `resource_uri` - A URI to the deployment resource. Allowed
   *   comparison operators: `=`.
   *   * `api_versions` - The API versions linked to this deployment. Allowed
   *   comparison operators: `:`.
   *   * `deployment_type.enum_values.values.id` - The allowed value id of the
   *   deployment_type attribute associated with the Deployment. Allowed
   *   comparison operators: `:`.
   *   * `deployment_type.enum_values.values.display_name` - The allowed value
   *   display name of the deployment_type attribute associated with the
   *   Deployment. Allowed comparison operators: `:`.
   *   * `slo.string_values.values` -The allowed string value of the slo
   *   attribute associated with the deployment. Allowed comparison
   *   operators: `:`.
   *   * `environment.enum_values.values.id` - The allowed value id of the
   *   environment attribute associated with the deployment. Allowed
   *   comparison operators: `:`.
   *   * `environment.enum_values.values.display_name` - The allowed value
   *   display name of the environment attribute associated with the deployment.
   *   Allowed comparison operators: `:`.
   *
   * Expressions are combined with either `AND` logic operator or `OR` logical
   * operator but not both of them together i.e. only one of the `AND` or `OR`
   * operator can be used throughout the filter string and both the operators
   * cannot be used together. No other logical operators are supported. At most
   * three filter fields are allowed in the filter string and if provided
   * more than that then `INVALID_ARGUMENT` error is returned by the API.
   *
   * Here are a few examples:
   *
   *   * `environment.enum_values.values.id: staging-id` - The allowed value id
   *   of the environment attribute associated with the Deployment is
   *   _staging-id_.
   *   * `environment.enum_values.values.display_name: &#92;"Staging Deployment&#92;"` -
   *   The allowed value display name of the environment attribute associated
   *   with the Deployment is `Staging Deployment`.
   *   * `environment.enum_values.values.id: production-id AND create_time &lt;
   *   &#92;"2021-08-15T14:50:00Z&#92;" AND create_time &gt; &#92;"2021-08-10T12:00:00Z&#92;"` -
   *   The allowed value id of the environment attribute associated with the
   *   Deployment is _production-id_ and Deployment was created before
   *   _2021-08-15 14:50:00 UTC_ and after _2021-08-10 12:00:00 UTC_.
   *   * `environment.enum_values.values.id: production-id OR
   *   slo.string_values.values: &#92;"99.99%&#92;"`
   *   - The allowed value id of the environment attribute Deployment is
   *   _production-id_ or string value of the slo attribute is _99.99%_.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of deployment resources to return. The service
   * may return fewer than this value. If unspecified, at most 50 deployments
   * will be returned. The maximum value is 1000; values above 1000 will be
   * coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous `ListDeployments` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters (except page_size) provided to
   * `ListDeployments` must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous `ListDeployments` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters (except page_size) provided to
   * `ListDeployments` must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}

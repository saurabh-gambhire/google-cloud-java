/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

package com.google.cloud.gsuiteaddons.v1;

public interface CreateDeploymentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gsuiteaddons.v1.CreateDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the project in which to create the deployment.
   * Example: `projects/my_project`.
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
   * Required. Name of the project in which to create the deployment.
   * Example: `projects/my_project`.
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
   * Required. The id to use for this deployment.  The full name of the created
   * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
   * </pre>
   *
   * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deploymentId.
   */
  java.lang.String getDeploymentId();
  /**
   *
   *
   * <pre>
   * Required. The id to use for this deployment.  The full name of the created
   * resource will be `projects/&lt;project_number&gt;/deployments/&lt;deployment_id&gt;`.
   * </pre>
   *
   * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deploymentId.
   */
  com.google.protobuf.ByteString getDeploymentIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The deployment to create (deployment.name cannot be set).
   * </pre>
   *
   * <code>
   * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   *
   *
   * <pre>
   * Required. The deployment to create (deployment.name cannot be set).
   * </pre>
   *
   * <code>
   * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deployment.
   */
  com.google.cloud.gsuiteaddons.v1.Deployment getDeployment();
  /**
   *
   *
   * <pre>
   * Required. The deployment to create (deployment.name cannot be set).
   * </pre>
   *
   * <code>
   * .google.cloud.gsuiteaddons.v1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gsuiteaddons.v1.DeploymentOrBuilder getDeploymentOrBuilder();
}
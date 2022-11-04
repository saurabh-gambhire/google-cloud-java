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
// source: google/cloud/run/v2/service.proto

package com.google.cloud.run.v2;

public interface CreateServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.CreateServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The location and project in which this service should be created.
   * Format: projects/{project}/locations/{location}
   * Only lowercase characters, digits, and hyphens.
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
   * Required. The location and project in which this service should be created.
   * Format: projects/{project}/locations/{location}
   * Only lowercase characters, digits, and hyphens.
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
   * Required. The Service instance to create.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * Required. The Service instance to create.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The service.
   */
  com.google.cloud.run.v2.Service getService();
  /**
   *
   *
   * <pre>
   * Required. The Service instance to create.
   * </pre>
   *
   * <code>.google.cloud.run.v2.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.run.v2.ServiceOrBuilder getServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The unique identifier for the Service. It must begin with letter,
   * and may not end with hyphen; must contain fewer than 50 characters.
   * The name of the service becomes {parent}/services/{service_id}.
   * </pre>
   *
   * <code>string service_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceId.
   */
  java.lang.String getServiceId();
  /**
   *
   *
   * <pre>
   * Required. The unique identifier for the Service. It must begin with letter,
   * and may not end with hyphen; must contain fewer than 50 characters.
   * The name of the service becomes {parent}/services/{service_id}.
   * </pre>
   *
   * <code>string service_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceId.
   */
  com.google.protobuf.ByteString getServiceIdBytes();

  /**
   *
   *
   * <pre>
   * Indicates that the request should be validated and default values
   * populated, without persisting the request or creating any resources.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}

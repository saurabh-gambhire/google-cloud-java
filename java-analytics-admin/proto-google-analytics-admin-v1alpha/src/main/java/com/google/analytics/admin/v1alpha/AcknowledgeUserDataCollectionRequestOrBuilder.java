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

public interface AcknowledgeUserDataCollectionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AcknowledgeUserDataCollectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The property for which to acknowledge user data collection.
   * </pre>
   *
   * <code>
   * string property = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * Required. The property for which to acknowledge user data collection.
   * </pre>
   *
   * <code>
   * string property = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * Required. An acknowledgement that the caller of this method understands the
   * terms of user data collection.
   *
   * This field must contain the exact value:
   * "I acknowledge that I have the necessary privacy disclosures and rights
   * from my end users for the collection and processing of their data,
   * including the association of such data with the visitation information
   * Google Analytics collects from my site and/or app property."
   * </pre>
   *
   * <code>string acknowledgement = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The acknowledgement.
   */
  java.lang.String getAcknowledgement();
  /**
   *
   *
   * <pre>
   * Required. An acknowledgement that the caller of this method understands the
   * terms of user data collection.
   *
   * This field must contain the exact value:
   * "I acknowledge that I have the necessary privacy disclosures and rights
   * from my end users for the collection and processing of their data,
   * including the association of such data with the visitation information
   * Google Analytics collects from my site and/or app property."
   * </pre>
   *
   * <code>string acknowledgement = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for acknowledgement.
   */
  com.google.protobuf.ByteString getAcknowledgementBytes();
}

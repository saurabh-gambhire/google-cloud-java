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
// source: google/cloud/asset/v1p7beta1/assets.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1p7beta1;

public interface ResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p7beta1.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The API version. Example: `v1`
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The API version. Example: `v1`
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * The URL of the discovery document containing the resource's JSON schema.
   * Example:
   * `https://www.googleapis.com/discovery/v1/apis/compute/v1/rest`
   *
   * This value is unspecified for resources that do not have an API based on a
   * discovery document, such as Cloud Bigtable.
   * </pre>
   *
   * <code>string discovery_document_uri = 2;</code>
   *
   * @return The discoveryDocumentUri.
   */
  java.lang.String getDiscoveryDocumentUri();
  /**
   *
   *
   * <pre>
   * The URL of the discovery document containing the resource's JSON schema.
   * Example:
   * `https://www.googleapis.com/discovery/v1/apis/compute/v1/rest`
   *
   * This value is unspecified for resources that do not have an API based on a
   * discovery document, such as Cloud Bigtable.
   * </pre>
   *
   * <code>string discovery_document_uri = 2;</code>
   *
   * @return The bytes for discoveryDocumentUri.
   */
  com.google.protobuf.ByteString getDiscoveryDocumentUriBytes();

  /**
   *
   *
   * <pre>
   * The JSON schema name listed in the discovery document. Example:
   * `Project`
   *
   * This value is unspecified for resources that do not have an API based on a
   * discovery document, such as Cloud Bigtable.
   * </pre>
   *
   * <code>string discovery_name = 3;</code>
   *
   * @return The discoveryName.
   */
  java.lang.String getDiscoveryName();
  /**
   *
   *
   * <pre>
   * The JSON schema name listed in the discovery document. Example:
   * `Project`
   *
   * This value is unspecified for resources that do not have an API based on a
   * discovery document, such as Cloud Bigtable.
   * </pre>
   *
   * <code>string discovery_name = 3;</code>
   *
   * @return The bytes for discoveryName.
   */
  com.google.protobuf.ByteString getDiscoveryNameBytes();

  /**
   *
   *
   * <pre>
   * The REST URL for accessing the resource. An HTTP `GET` request using this
   * URL returns the resource itself. Example:
   * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123`
   *
   * This value is unspecified for resources without a REST API.
   * </pre>
   *
   * <code>string resource_url = 4;</code>
   *
   * @return The resourceUrl.
   */
  java.lang.String getResourceUrl();
  /**
   *
   *
   * <pre>
   * The REST URL for accessing the resource. An HTTP `GET` request using this
   * URL returns the resource itself. Example:
   * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123`
   *
   * This value is unspecified for resources without a REST API.
   * </pre>
   *
   * <code>string resource_url = 4;</code>
   *
   * @return The bytes for resourceUrl.
   */
  com.google.protobuf.ByteString getResourceUrlBytes();

  /**
   *
   *
   * <pre>
   * The full name of the immediate parent of this resource. See
   * [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   *
   * For Google Cloud assets, this value is the parent resource defined in the
   * [IAM policy
   * hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy).
   * Example:
   * `//cloudresourcemanager.googleapis.com/projects/my_project_123`
   *
   * For third-party assets, this field may be set differently.
   * </pre>
   *
   * <code>string parent = 5;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The full name of the immediate parent of this resource. See
   * [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   *
   * For Google Cloud assets, this value is the parent resource defined in the
   * [IAM policy
   * hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy).
   * Example:
   * `//cloudresourcemanager.googleapis.com/projects/my_project_123`
   *
   * For third-party assets, this field may be set differently.
   * </pre>
   *
   * <code>string parent = 5;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The content of the resource, in which some sensitive fields are removed
   * and may not be present.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 6;</code>
   *
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   *
   *
   * <pre>
   * The content of the resource, in which some sensitive fields are removed
   * and may not be present.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 6;</code>
   *
   * @return The data.
   */
  com.google.protobuf.Struct getData();
  /**
   *
   *
   * <pre>
   * The content of the resource, in which some sensitive fields are removed
   * and may not be present.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getDataOrBuilder();

  /**
   *
   *
   * <pre>
   * The location of the resource in Google Cloud, such as its zone and region.
   * For more information, see https://cloud.google.com/about/locations/.
   * </pre>
   *
   * <code>string location = 8;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The location of the resource in Google Cloud, such as its zone and region.
   * For more information, see https://cloud.google.com/about/locations/.
   * </pre>
   *
   * <code>string location = 8;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();
}

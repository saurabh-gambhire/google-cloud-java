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
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

public interface TerraformErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.TerraformError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Address of the resource associated with the error,
   * e.g. `google_compute_network.vpc_network`.
   * </pre>
   *
   * <code>string resource_address = 1;</code>
   *
   * @return The resourceAddress.
   */
  java.lang.String getResourceAddress();
  /**
   *
   *
   * <pre>
   * Address of the resource associated with the error,
   * e.g. `google_compute_network.vpc_network`.
   * </pre>
   *
   * <code>string resource_address = 1;</code>
   *
   * @return The bytes for resourceAddress.
   */
  com.google.protobuf.ByteString getResourceAddressBytes();

  /**
   *
   *
   * <pre>
   * HTTP response code returned from Google Cloud Platform APIs when Terraform
   * fails to provision the resource. If unset or 0, no HTTP response code was
   * returned by Terraform.
   * </pre>
   *
   * <code>int32 http_response_code = 2;</code>
   *
   * @return The httpResponseCode.
   */
  int getHttpResponseCode();

  /**
   *
   *
   * <pre>
   * A human-readable error description.
   * </pre>
   *
   * <code>string error_description = 3;</code>
   *
   * @return The errorDescription.
   */
  java.lang.String getErrorDescription();
  /**
   *
   *
   * <pre>
   * A human-readable error description.
   * </pre>
   *
   * <code>string error_description = 3;</code>
   *
   * @return The bytes for errorDescription.
   */
  com.google.protobuf.ByteString getErrorDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Original error response from underlying Google API, if available.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Original error response from underlying Google API, if available.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Original error response from underlying Google API, if available.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}

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
// source: google/appengine/v1/appengine.proto

// Protobuf Java Version: 3.25.2
package com.google.appengine.v1;

public interface UpdateAuthorizedCertificateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.UpdateAuthorizedCertificateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the resource to update. Example:
   * `apps/myapp/authorizedCertificates/12345`.
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
   * Name of the resource to update. Example:
   * `apps/myapp/authorizedCertificates/12345`.
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
   * An `AuthorizedCertificate` containing the updated resource. Only fields set
   * in the field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   *
   * @return Whether the certificate field is set.
   */
  boolean hasCertificate();
  /**
   *
   *
   * <pre>
   * An `AuthorizedCertificate` containing the updated resource. Only fields set
   * in the field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   *
   * @return The certificate.
   */
  com.google.appengine.v1.AuthorizedCertificate getCertificate();
  /**
   *
   *
   * <pre>
   * An `AuthorizedCertificate` containing the updated resource. Only fields set
   * in the field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   */
  com.google.appengine.v1.AuthorizedCertificateOrBuilder getCertificateOrBuilder();

  /**
   *
   *
   * <pre>
   * Standard field mask for the set of fields to be updated. Updates are only
   * supported on the `certificate_raw_data` and `display_name` fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Standard field mask for the set of fields to be updated. Updates are only
   * supported on the `certificate_raw_data` and `display_name` fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Standard field mask for the set of fields to be updated. Updates are only
   * supported on the `certificate_raw_data` and `display_name` fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

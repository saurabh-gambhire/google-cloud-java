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
// source: google/cloud/alloydb/v1beta/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.alloydb.v1beta;

public interface EncryptionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.EncryptionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Type of encryption.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.EncryptionInfo.Type encryption_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for encryptionType.
   */
  int getEncryptionTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Type of encryption.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.EncryptionInfo.Type encryption_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionType.
   */
  com.google.cloud.alloydb.v1beta.EncryptionInfo.Type getEncryptionType();

  /**
   *
   *
   * <pre>
   * Output only. Cloud KMS key versions that are being used to protect the
   * database or the backup.
   * </pre>
   *
   * <code>
   * repeated string kms_key_versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the kmsKeyVersions.
   */
  java.util.List<java.lang.String> getKmsKeyVersionsList();
  /**
   *
   *
   * <pre>
   * Output only. Cloud KMS key versions that are being used to protect the
   * database or the backup.
   * </pre>
   *
   * <code>
   * repeated string kms_key_versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of kmsKeyVersions.
   */
  int getKmsKeyVersionsCount();
  /**
   *
   *
   * <pre>
   * Output only. Cloud KMS key versions that are being used to protect the
   * database or the backup.
   * </pre>
   *
   * <code>
   * repeated string kms_key_versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The kmsKeyVersions at the given index.
   */
  java.lang.String getKmsKeyVersions(int index);
  /**
   *
   *
   * <pre>
   * Output only. Cloud KMS key versions that are being used to protect the
   * database or the backup.
   * </pre>
   *
   * <code>
   * repeated string kms_key_versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the kmsKeyVersions at the given index.
   */
  com.google.protobuf.ByteString getKmsKeyVersionsBytes(int index);
}

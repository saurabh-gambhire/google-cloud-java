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
// source: google/cloud/apihub/v1/linting_service.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.apihub.v1;

public interface StyleGuideContentsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.StyleGuideContents)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The contents of the style guide.
   * </pre>
   *
   * <code>bytes contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The contents.
   */
  com.google.protobuf.ByteString getContents();

  /**
   *
   *
   * <pre>
   * Required. The mime type of the content.
   * </pre>
   *
   * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Required. The mime type of the content.
   * </pre>
   *
   * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();
}

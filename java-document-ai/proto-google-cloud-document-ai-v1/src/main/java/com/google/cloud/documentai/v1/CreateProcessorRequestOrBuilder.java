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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1;

public interface CreateProcessorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.CreateProcessorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) under which to create the
   * processor. Format: `projects/{project}/locations/{location}`
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
   * Required. The parent (project and location) under which to create the
   * processor. Format: `projects/{project}/locations/{location}`
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
   * Required. The processor to be created, requires
   * [Processor.type][google.cloud.documentai.v1.Processor.type] and
   * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
   * to be set. Also, the
   * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
   * field must be set if the processor is under CMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the processor field is set.
   */
  boolean hasProcessor();
  /**
   *
   *
   * <pre>
   * Required. The processor to be created, requires
   * [Processor.type][google.cloud.documentai.v1.Processor.type] and
   * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
   * to be set. Also, the
   * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
   * field must be set if the processor is under CMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The processor.
   */
  com.google.cloud.documentai.v1.Processor getProcessor();
  /**
   *
   *
   * <pre>
   * Required. The processor to be created, requires
   * [Processor.type][google.cloud.documentai.v1.Processor.type] and
   * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
   * to be set. Also, the
   * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
   * field must be set if the processor is under CMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.documentai.v1.ProcessorOrBuilder getProcessorOrBuilder();
}

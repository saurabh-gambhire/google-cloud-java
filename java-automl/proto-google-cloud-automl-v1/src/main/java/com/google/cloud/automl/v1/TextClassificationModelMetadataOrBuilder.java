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
// source: google/cloud/automl/v1/text.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1;

public interface TextClassificationModelMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.TextClassificationModelMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Classification type of the dataset used to train this model.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ClassificationType classification_type = 3;</code>
   *
   * @return The enum numeric value on the wire for classificationType.
   */
  int getClassificationTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Classification type of the dataset used to train this model.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ClassificationType classification_type = 3;</code>
   *
   * @return The classificationType.
   */
  com.google.cloud.automl.v1.ClassificationType getClassificationType();
}

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
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

public interface ImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.Image)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Image content represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes image_bytes = 1;</code>
   *
   * @return Whether the imageBytes field is set.
   */
  boolean hasImageBytes();
  /**
   *
   *
   * <pre>
   * Image content represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes image_bytes = 1;</code>
   *
   * @return The imageBytes.
   */
  com.google.protobuf.ByteString getImageBytes();

  /**
   *
   *
   * <pre>
   * An input config specifying the content of the image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.automl.v1beta1.InputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
   */
  com.google.cloud.automl.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. HTTP URI to the thumbnail image.
   * </pre>
   *
   * <code>string thumbnail_uri = 4;</code>
   *
   * @return The thumbnailUri.
   */
  java.lang.String getThumbnailUri();
  /**
   *
   *
   * <pre>
   * Output only. HTTP URI to the thumbnail image.
   * </pre>
   *
   * <code>string thumbnail_uri = 4;</code>
   *
   * @return The bytes for thumbnailUri.
   */
  com.google.protobuf.ByteString getThumbnailUriBytes();

  com.google.cloud.automl.v1beta1.Image.DataCase getDataCase();
}

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
// source: google/cloud/automl/v1/io.proto

package com.google.cloud.automl.v1;

public interface GcsSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.GcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs to input files, up to 2000
   * characters long. Accepted forms:
   * * Full object path, e.g. gs://bucket/directory/object.csv
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the inputUris.
   */
  java.util.List<java.lang.String> getInputUrisList();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs to input files, up to 2000
   * characters long. Accepted forms:
   * * Full object path, e.g. gs://bucket/directory/object.csv
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of inputUris.
   */
  int getInputUrisCount();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs to input files, up to 2000
   * characters long. Accepted forms:
   * * Full object path, e.g. gs://bucket/directory/object.csv
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The inputUris at the given index.
   */
  java.lang.String getInputUris(int index);
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs to input files, up to 2000
   * characters long. Accepted forms:
   * * Full object path, e.g. gs://bucket/directory/object.csv
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the inputUris at the given index.
   */
  com.google.protobuf.ByteString getInputUrisBytes(int index);
}

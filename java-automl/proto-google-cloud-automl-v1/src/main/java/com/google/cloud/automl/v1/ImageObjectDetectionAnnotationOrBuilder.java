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
// source: google/cloud/automl/v1/detection.proto

package com.google.cloud.automl.v1;

public interface ImageObjectDetectionAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ImageObjectDetectionAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BoundingPoly bounding_box = 1;</code>
   *
   * @return Whether the boundingBox field is set.
   */
  boolean hasBoundingBox();
  /**
   *
   *
   * <pre>
   * Output only. The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BoundingPoly bounding_box = 1;</code>
   *
   * @return The boundingBox.
   */
  com.google.cloud.automl.v1.BoundingPoly getBoundingBox();
  /**
   *
   *
   * <pre>
   * Output only. The rectangle representing the object location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BoundingPoly bounding_box = 1;</code>
   */
  com.google.cloud.automl.v1.BoundingPolyOrBuilder getBoundingBoxOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The confidence that this annotation is positive for the parent example,
   * value in [0, 1], higher means higher positivity confidence.
   * </pre>
   *
   * <code>float score = 2;</code>
   *
   * @return The score.
   */
  float getScore();
}

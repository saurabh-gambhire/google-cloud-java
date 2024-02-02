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
// source: google/cloud/automl/v1beta1/detection.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1beta1;

public interface VideoObjectTrackingAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.VideoObjectTrackingAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The instance of the object, expressed as a positive integer. Used to tell
   * apart objects of the same type (i.e. AnnotationSpec) when multiple are
   * present on a single example.
   * NOTE: Instance ID prediction quality is not a part of model evaluation and
   * is done as best effort. Especially in cases when an entity goes
   * off-screen for a longer time (minutes), when it comes back it may be given
   * a new instance ID.
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   *
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   *
   *
   * <pre>
   * Optional. The instance of the object, expressed as a positive integer. Used to tell
   * apart objects of the same type (i.e. AnnotationSpec) when multiple are
   * present on a single example.
   * NOTE: Instance ID prediction quality is not a part of model evaluation and
   * is done as best effort. Especially in cases when an entity goes
   * off-screen for a longer time (minutes), when it comes back it may be given
   * a new instance ID.
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   *
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString getInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A time (frame) of a video to which this annotation pertains.
   * Represented as the duration since the video's start.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   *
   *
   * <pre>
   * Required. A time (frame) of a video to which this annotation pertains.
   * Represented as the duration since the video's start.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   *
   *
   * <pre>
   * Required. A time (frame) of a video to which this annotation pertains.
   * Represented as the duration since the video's start.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The rectangle representing the object location on the frame (i.e.
   * at the time_offset of the video).
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 3;</code>
   *
   * @return Whether the boundingBox field is set.
   */
  boolean hasBoundingBox();
  /**
   *
   *
   * <pre>
   * Required. The rectangle representing the object location on the frame (i.e.
   * at the time_offset of the video).
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 3;</code>
   *
   * @return The boundingBox.
   */
  com.google.cloud.automl.v1beta1.BoundingPoly getBoundingBox();
  /**
   *
   *
   * <pre>
   * Required. The rectangle representing the object location on the frame (i.e.
   * at the time_offset of the video).
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BoundingPoly bounding_box = 3;</code>
   */
  com.google.cloud.automl.v1beta1.BoundingPolyOrBuilder getBoundingBoxOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The confidence that this annotation is positive for the video at
   * the time_offset, value in [0, 1], higher means higher positivity
   * confidence. For annotations created by the user the score is 1. When
   * user approves an annotation, the original float score is kept (and not
   * changed to 1).
   * </pre>
   *
   * <code>float score = 4;</code>
   *
   * @return The score.
   */
  float getScore();
}

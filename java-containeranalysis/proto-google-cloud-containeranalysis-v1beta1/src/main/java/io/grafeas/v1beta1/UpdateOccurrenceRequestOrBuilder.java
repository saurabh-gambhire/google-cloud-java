/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

public interface UpdateOccurrenceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.UpdateOccurrenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
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
   * The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
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
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Occurrence occurrence = 2;</code>
   *
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   *
   *
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Occurrence occurrence = 2;</code>
   *
   * @return The occurrence.
   */
  io.grafeas.v1beta1.Occurrence getOccurrence();
  /**
   *
   *
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Occurrence occurrence = 2;</code>
   */
  io.grafeas.v1beta1.OccurrenceOrBuilder getOccurrenceOrBuilder();

  /**
   *
   *
   * <pre>
   * The fields to update.
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
   * The fields to update.
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
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

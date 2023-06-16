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
// source: google/cloud/aiplatform/v1beta1/featurestore_online_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface FeatureValueListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeatureValueList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureValue values = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FeatureValue> getValuesList();
  /**
   *
   *
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureValue values = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureValue getValues(int index);
  /**
   *
   *
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureValue values = 1;</code>
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureValue values = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureValueOrBuilder>
      getValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of feature values. All of them should be the same data type.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureValue values = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureValueOrBuilder getValuesOrBuilder(int index);
}

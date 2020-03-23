/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/recommendationengine/v1beta1/common.proto

package com.google.cloud.recommendationengine.v1beta1;

public final class Common {
  private Common() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_StringList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_StringList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_FloatList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_FloatList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_CategoricalFeaturesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_CategoricalFeaturesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_NumericalFeaturesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_NumericalFeaturesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/recommendationengine/v1be"
          + "ta1/common.proto\022)google.cloud.recommend"
          + "ationengine.v1beta1\032\034google/api/annotati"
          + "ons.proto\"\226\004\n\nFeatureMap\022l\n\024categorical_"
          + "features\030\001 \003(\0132N.google.cloud.recommenda"
          + "tionengine.v1beta1.FeatureMap.Categorica"
          + "lFeaturesEntry\022h\n\022numerical_features\030\002 \003"
          + "(\0132L.google.cloud.recommendationengine.v"
          + "1beta1.FeatureMap.NumericalFeaturesEntry"
          + "\032\033\n\nStringList\022\r\n\005value\030\001 \003(\t\032\032\n\tFloatLi"
          + "st\022\r\n\005value\030\001 \003(\002\032|\n\030CategoricalFeatures"
          + "Entry\022\013\n\003key\030\001 \001(\t\022O\n\005value\030\002 \001(\0132@.goog"
          + "le.cloud.recommendationengine.v1beta1.Fe"
          + "atureMap.StringList:\0028\001\032y\n\026NumericalFeat"
          + "uresEntry\022\013\n\003key\030\001 \001(\t\022N\n\005value\030\002 \001(\0132?."
          + "google.cloud.recommendationengine.v1beta"
          + "1.FeatureMap.FloatList:\0028\001B\304\001\n-com.googl"
          + "e.cloud.recommendationengine.v1beta1P\001Z]"
          + "google.golang.org/genproto/googleapis/cl"
          + "oud/recommendationengine/v1beta1;recomme"
          + "ndationengine\242\002\005RECAI\252\002)Google.Cloud.Rec"
          + "ommendationEngine.V1Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_descriptor,
            new java.lang.String[] {
              "CategoricalFeatures", "NumericalFeatures",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_StringList_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_StringList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_StringList_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_FloatList_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_FloatList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_FloatList_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_CategoricalFeaturesEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_CategoricalFeaturesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_CategoricalFeaturesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_NumericalFeaturesEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_NumericalFeaturesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_FeatureMap_NumericalFeaturesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

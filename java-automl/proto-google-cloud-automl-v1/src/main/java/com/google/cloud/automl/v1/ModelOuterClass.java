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
// source: google/cloud/automl/v1/model.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1;

public final class ModelOuterClass {
  private ModelOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Model_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Model_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/automl/v1/model.proto\022\026go"
          + "ogle.cloud.automl.v1\032\031google/api/resourc"
          + "e.proto\032\"google/cloud/automl/v1/image.pr"
          + "oto\032!google/cloud/automl/v1/text.proto\032("
          + "google/cloud/automl/v1/translation.proto"
          + "\032\037google/protobuf/timestamp.proto\"\361\010\n\005Mo"
          + "del\022V\n\032translation_model_metadata\030\017 \001(\0132"
          + "0.google.cloud.automl.v1.TranslationMode"
          + "lMetadataH\000\022g\n#image_classification_mode"
          + "l_metadata\030\r \001(\01328.google.cloud.automl.v"
          + "1.ImageClassificationModelMetadataH\000\022e\n\""
          + "text_classification_model_metadata\030\016 \001(\013"
          + "27.google.cloud.automl.v1.TextClassifica"
          + "tionModelMetadataH\000\022j\n%image_object_dete"
          + "ction_model_metadata\030\024 \001(\01329.google.clou"
          + "d.automl.v1.ImageObjectDetectionModelMet"
          + "adataH\000\022]\n\036text_extraction_model_metadat"
          + "a\030\023 \001(\01323.google.cloud.automl.v1.TextExt"
          + "ractionModelMetadataH\000\022[\n\035text_sentiment"
          + "_model_metadata\030\026 \001(\01322.google.cloud.aut"
          + "oml.v1.TextSentimentModelMetadataH\000\022\014\n\004n"
          + "ame\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\022\n\ndatas"
          + "et_id\030\003 \001(\t\022/\n\013create_time\030\007 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022/\n\013update_time\030\013 \001("
          + "\0132\032.google.protobuf.Timestamp\022G\n\020deploym"
          + "ent_state\030\010 \001(\0162-.google.cloud.automl.v1"
          + ".Model.DeploymentState\022\014\n\004etag\030\n \001(\t\0229\n\006"
          + "labels\030\" \003(\0132).google.cloud.automl.v1.Mo"
          + "del.LabelsEntry\032-\n\013LabelsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"Q\n\017DeploymentStat"
          + "e\022 \n\034DEPLOYMENT_STATE_UNSPECIFIED\020\000\022\014\n\010D"
          + "EPLOYED\020\001\022\016\n\nUNDEPLOYED\020\002:X\352AU\n\033automl.g"
          + "oogleapis.com/Model\0226projects/{project}/"
          + "locations/{location}/models/{model}B\020\n\016m"
          + "odel_metadataB\240\001\n\032com.google.cloud.autom"
          + "l.v1P\001Z2cloud.google.com/go/automl/apiv1"
          + "/automlpb;automlpb\252\002\026Google.Cloud.AutoML"
          + ".V1\312\002\026Google\\Cloud\\AutoMl\\V1\352\002\031Google::C"
          + "loud::AutoML::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.automl.v1.ImageProto.getDescriptor(),
              com.google.cloud.automl.v1.TextProto.getDescriptor(),
              com.google.cloud.automl.v1.TranslationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_Model_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Model_descriptor,
            new java.lang.String[] {
              "TranslationModelMetadata",
              "ImageClassificationModelMetadata",
              "TextClassificationModelMetadata",
              "ImageObjectDetectionModelMetadata",
              "TextExtractionModelMetadata",
              "TextSentimentModelMetadata",
              "Name",
              "DisplayName",
              "DatasetId",
              "CreateTime",
              "UpdateTime",
              "DeploymentState",
              "Etag",
              "Labels",
              "ModelMetadata",
            });
    internal_static_google_cloud_automl_v1_Model_LabelsEntry_descriptor =
        internal_static_google_cloud_automl_v1_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_Model_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Model_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1.ImageProto.getDescriptor();
    com.google.cloud.automl.v1.TextProto.getDescriptor();
    com.google.cloud.automl.v1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

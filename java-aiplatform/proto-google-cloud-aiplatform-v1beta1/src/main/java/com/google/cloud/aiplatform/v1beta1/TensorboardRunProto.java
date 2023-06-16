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
// source: google/cloud/aiplatform/v1beta1/tensorboard_run.proto

package com.google.cloud.aiplatform.v1beta1;

public final class TensorboardRunProto {
  private TensorboardRunProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1beta1/tensor"
          + "board_run.proto\022\037google.cloud.aiplatform"
          + ".v1beta1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"\346\003\n\016TensorboardRun"
          + "\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\032\n\014display_name\030\002 \001"
          + "(\tB\004\342A\001\002\022\023\n\013description\030\003 \001(\t\0225\n\013create_"
          + "time\030\006 \001(\0132\032.google.protobuf.TimestampB\004"
          + "\342A\001\003\0225\n\013update_time\030\007 \001(\0132\032.google.proto"
          + "buf.TimestampB\004\342A\001\003\022K\n\006labels\030\010 \003(\0132;.go"
          + "ogle.cloud.aiplatform.v1beta1.Tensorboar"
          + "dRun.LabelsEntry\022\014\n\004etag\030\t \001(\t\032-\n\013Labels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\226\001"
          + "\352A\222\001\n(aiplatform.googleapis.com/Tensorbo"
          + "ardRun\022fprojects/{project}/locations/{lo"
          + "cation}/tensorboards/{tensorboard}/exper"
          + "iments/{experiment}/runs/{run}B\352\001\n#com.g"
          + "oogle.cloud.aiplatform.v1beta1B\023Tensorbo"
          + "ardRunProtoP\001ZCcloud.google.com/go/aipla"
          + "tform/apiv1beta1/aiplatformpb;aiplatform"
          + "pb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037G"
          + "oogle\\Cloud\\AIPlatform\\V1beta1\352\002\"Google:"
          + ":Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "CreateTime", "UpdateTime", "Labels", "Etag",
            });
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TensorboardRun_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

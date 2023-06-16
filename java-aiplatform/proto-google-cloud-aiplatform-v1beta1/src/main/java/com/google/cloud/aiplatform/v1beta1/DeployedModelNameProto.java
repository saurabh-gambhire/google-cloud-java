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
// source: google/cloud/aiplatform/v1beta1/deployed_model_ref.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DeployedModelNameProto {
  private DeployedModelNameProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModelRef_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModelRef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1beta1/deploy"
          + "ed_model_ref.proto\022\037google.cloud.aiplatf"
          + "orm.v1beta1\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\"r\n\020Deplo"
          + "yedModelRef\022=\n\010endpoint\030\001 \001(\tB+\342A\001\005\372A$\n\""
          + "aiplatform.googleapis.com/Endpoint\022\037\n\021de"
          + "ployed_model_id\030\002 \001(\tB\004\342A\001\005B\355\001\n#com.goog"
          + "le.cloud.aiplatform.v1beta1B\026DeployedMod"
          + "elNameProtoP\001ZCcloud.google.com/go/aipla"
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
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModelRef_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModelRef_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedModelRef_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModelId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

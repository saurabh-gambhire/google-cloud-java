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
// source: google/cloud/aiplatform/v1/model_garden_service.proto

package com.google.cloud.aiplatform.v1;

public final class ModelGardenServiceProto {
  private ModelGardenServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/model_garde"
          + "n_service.proto\022\032google.cloud.aiplatform"
          + ".v1\032\034google/api/annotations.proto\032\027googl"
          + "e/api/client.proto\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\0320"
          + "google/cloud/aiplatform/v1/publisher_mod"
          + "el.proto\"\274\001\n\030GetPublisherModelRequest\022?\n"
          + "\004name\030\001 \001(\tB1\342A\001\002\372A*\n(aiplatform.googlea"
          + "pis.com/PublisherModel\022\033\n\rlanguage_code\030"
          + "\002 \001(\tB\004\342A\001\001\022B\n\004view\030\003 \001(\0162..google.cloud"
          + ".aiplatform.v1.PublisherModelViewB\004\342A\001\001*"
          + "\241\001\n\022PublisherModelView\022$\n PUBLISHER_MODE"
          + "L_VIEW_UNSPECIFIED\020\000\022\036\n\032PUBLISHER_MODEL_"
          + "VIEW_BASIC\020\001\022\035\n\031PUBLISHER_MODEL_VIEW_FUL"
          + "L\020\002\022&\n\"PUBLISHER_MODEL_VERSION_VIEW_BASI"
          + "C\020\0032\214\002\n\022ModelGardenService\022\246\001\n\021GetPublis"
          + "herModel\0224.google.cloud.aiplatform.v1.Ge"
          + "tPublisherModelRequest\032*.google.cloud.ai"
          + "platform.v1.PublisherModel\"/\332A\004name\202\323\344\223\002"
          + "\"\022 /v1/{name=publishers/*/models/*}\032M\312A\031"
          + "aiplatform.googleapis.com\322A.https://www."
          + "googleapis.com/auth/cloud-platformB\325\001\n\036c"
          + "om.google.cloud.aiplatform.v1B\027ModelGard"
          + "enServiceProtoP\001Z>cloud.google.com/go/ai"
          + "platform/apiv1/aiplatformpb;aiplatformpb"
          + "\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\C"
          + "loud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPl"
          + "atform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PublisherModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode", "View",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PublisherModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

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
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1beta1/predic"
          + "tion_service.proto\022\037google.cloud.aiplatf"
          + "orm.v1beta1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/httpbody"
          + ".proto\032\031google/api/resource.proto\0321googl"
          + "e/cloud/aiplatform/v1beta1/explanation.p"
          + "roto\032\034google/protobuf/struct.proto\"\254\001\n\016P"
          + "redictRequest\022=\n\010endpoint\030\001 \001(\tB+\342A\001\002\372A$"
          + "\n\"aiplatform.googleapis.com/Endpoint\022/\n\t"
          + "instances\030\002 \003(\0132\026.google.protobuf.ValueB"
          + "\004\342A\001\002\022*\n\nparameters\030\003 \001(\0132\026.google.proto"
          + "buf.Value\"\324\001\n\017PredictResponse\022+\n\013predict"
          + "ions\030\001 \003(\0132\026.google.protobuf.Value\022\031\n\021de"
          + "ployed_model_id\030\002 \001(\t\0227\n\005model\030\003 \001(\tB(\342A"
          + "\001\003\372A!\n\037aiplatform.googleapis.com/Model\022\036"
          + "\n\020model_version_id\030\005 \001(\tB\004\342A\001\003\022 \n\022model_"
          + "display_name\030\004 \001(\tB\004\342A\001\003\"{\n\021RawPredictRe"
          + "quest\022=\n\010endpoint\030\001 \001(\tB+\342A\001\002\372A$\n\"aiplat"
          + "form.googleapis.com/Endpoint\022\'\n\thttp_bod"
          + "y\030\002 \001(\0132\024.google.api.HttpBody\"\244\002\n\016Explai"
          + "nRequest\022=\n\010endpoint\030\001 \001(\tB+\342A\001\002\372A$\n\"aip"
          + "latform.googleapis.com/Endpoint\022/\n\tinsta"
          + "nces\030\002 \003(\0132\026.google.protobuf.ValueB\004\342A\001\002"
          + "\022*\n\nparameters\030\004 \001(\0132\026.google.protobuf.V"
          + "alue\022[\n\031explanation_spec_override\030\005 \001(\0132"
          + "8.google.cloud.aiplatform.v1beta1.Explan"
          + "ationSpecOverride\022\031\n\021deployed_model_id\030\003"
          + " \001(\t\"\235\001\n\017ExplainResponse\022B\n\014explanations"
          + "\030\001 \003(\0132,.google.cloud.aiplatform.v1beta1"
          + ".Explanation\022\031\n\021deployed_model_id\030\002 \001(\t\022"
          + "+\n\013predictions\030\003 \003(\0132\026.google.protobuf.V"
          + "alue2\211\007\n\021PredictionService\022\250\002\n\007Predict\022/"
          + ".google.cloud.aiplatform.v1beta1.Predict"
          + "Request\0320.google.cloud.aiplatform.v1beta"
          + "1.PredictResponse\"\271\001\332A\035endpoint,instance"
          + "s,parameters\202\323\344\223\002\222\001\">/v1beta1/{endpoint="
          + "projects/*/locations/*/endpoints/*}:pred"
          + "ict:\001*ZM\"H/v1beta1/{endpoint=projects/*/"
          + "locations/*/publishers/*/models/*}:predi"
          + "ct:\001*\022\215\002\n\nRawPredict\0222.google.cloud.aipl"
          + "atform.v1beta1.RawPredictRequest\032\024.googl"
          + "e.api.HttpBody\"\264\001\332A\022endpoint,http_body\202\323"
          + "\344\223\002\230\001\"A/v1beta1/{endpoint=projects/*/loc"
          + "ations/*/endpoints/*}:rawPredict:\001*ZP\"K/"
          + "v1beta1/{endpoint=projects/*/locations/*"
          + "/publishers/*/models/*}:rawPredict:\001*\022\351\001"
          + "\n\007Explain\022/.google.cloud.aiplatform.v1be"
          + "ta1.ExplainRequest\0320.google.cloud.aiplat"
          + "form.v1beta1.ExplainResponse\"{\332A/endpoin"
          + "t,instances,parameters,deployed_model_id"
          + "\202\323\344\223\002C\">/v1beta1/{endpoint=projects/*/lo"
          + "cations/*/endpoints/*}:explain:\001*\032M\312A\031ai"
          + "platform.googleapis.com\322A.https://www.go"
          + "ogleapis.com/auth/cloud-platformB\355\001\n#com"
          + ".google.cloud.aiplatform.v1beta1B\026Predic"
          + "tionServiceProtoP\001ZCcloud.google.com/go/"
          + "aiplatform/apiv1beta1/aiplatformpb;aipla"
          + "tformpb\252\002\037Google.Cloud.AIPlatform.V1Beta"
          + "1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Go"
          + "ogle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Instances", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor,
            new java.lang.String[] {
              "Predictions", "DeployedModelId", "Model", "ModelVersionId", "ModelDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "HttpBody",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Instances", "Parameters", "ExplanationSpecOverride", "DeployedModelId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor,
            new java.lang.String[] {
              "Explanations", "DeployedModelId", "Predictions",
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
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

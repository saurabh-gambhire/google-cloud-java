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
// source: google/cloud/automl/v1/prediction_service.proto

package com.google.cloud.automl.v1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_BatchPredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_BatchPredictRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_BatchPredictResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_BatchPredictResult_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictResult_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/automl/v1/prediction_serv"
          + "ice.proto\022\026google.cloud.automl.v1\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032/google/clo"
          + "ud/automl/v1/annotation_payload.proto\032\'g"
          + "oogle/cloud/automl/v1/data_items.proto\032\037"
          + "google/cloud/automl/v1/io.proto\032#google/"
          + "longrunning/operations.proto\"\366\001\n\016Predict"
          + "Request\0222\n\004name\030\001 \001(\tB$\342A\001\002\372A\035\n\033automl.g"
          + "oogleapis.com/Model\022=\n\007payload\030\002 \001(\0132&.g"
          + "oogle.cloud.automl.v1.ExamplePayloadB\004\342A"
          + "\001\002\022B\n\006params\030\003 \003(\01322.google.cloud.automl"
          + ".v1.PredictRequest.ParamsEntry\032-\n\013Params"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\213\002"
          + "\n\017PredictResponse\022:\n\007payload\030\001 \003(\0132).goo"
          + "gle.cloud.automl.v1.AnnotationPayload\022B\n"
          + "\022preprocessed_input\030\003 \001(\0132&.google.cloud"
          + ".automl.v1.ExamplePayload\022G\n\010metadata\030\002 "
          + "\003(\01325.google.cloud.automl.v1.PredictResp"
          + "onse.MetadataEntry\032/\n\rMetadataEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\335\002\n\023BatchPre"
          + "dictRequest\0222\n\004name\030\001 \001(\tB$\342A\001\002\372A\035\n\033auto"
          + "ml.googleapis.com/Model\022K\n\014input_config\030"
          + "\003 \001(\0132/.google.cloud.automl.v1.BatchPred"
          + "ictInputConfigB\004\342A\001\002\022M\n\routput_config\030\004 "
          + "\001(\01320.google.cloud.automl.v1.BatchPredic"
          + "tOutputConfigB\004\342A\001\002\022G\n\006params\030\005 \003(\01327.go"
          + "ogle.cloud.automl.v1.BatchPredictRequest"
          + ".ParamsEntry\032-\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001\"\221\001\n\022BatchPredictResu"
          + "lt\022J\n\010metadata\030\001 \003(\01328.google.cloud.auto"
          + "ml.v1.BatchPredictResult.MetadataEntry\032/"
          + "\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 "
          + "\001(\t:\0028\0012\205\004\n\021PredictionService\022\257\001\n\007Predic"
          + "t\022&.google.cloud.automl.v1.PredictReques"
          + "t\032\'.google.cloud.automl.v1.PredictRespon"
          + "se\"S\332A\023name,payload,params\202\323\344\223\0027\"2/v1/{n"
          + "ame=projects/*/locations/*/models/*}:pre"
          + "dict:\001*\022\362\001\n\014BatchPredict\022+.google.cloud."
          + "automl.v1.BatchPredictRequest\032\035.google.l"
          + "ongrunning.Operation\"\225\001\312A\'\n\022BatchPredict"
          + "Result\022\021OperationMetadata\332A&name,input_c"
          + "onfig,output_config,params\202\323\344\223\002<\"7/v1/{n"
          + "ame=projects/*/locations/*/models/*}:bat"
          + "chPredict:\001*\032I\312A\025automl.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\270\001\n\032com.google.cloud.automl.v1B\026"
          + "PredictionServiceProtoP\001Z2cloud.google.c"
          + "om/go/automl/apiv1/automlpb;automlpb\252\002\026G"
          + "oogle.Cloud.AutoML.V1\312\002\026Google\\Cloud\\Aut"
          + "oMl\\V1\352\002\031Google::Cloud::AutoML::V1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.automl.v1.AnnotationPayloadOuterClass.getDescriptor(),
              com.google.cloud.automl.v1.DataItems.getDescriptor(),
              com.google.cloud.automl.v1.Io.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_PredictRequest_descriptor,
            new java.lang.String[] {
              "Name", "Payload", "Params",
            });
    internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_automl_v1_PredictRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_PredictRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_PredictResponse_descriptor,
            new java.lang.String[] {
              "Payload", "PreprocessedInput", "Metadata",
            });
    internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_descriptor =
        internal_static_google_cloud_automl_v1_PredictResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_PredictResponse_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1_BatchPredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_BatchPredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_BatchPredictRequest_descriptor,
            new java.lang.String[] {
              "Name", "InputConfig", "OutputConfig", "Params",
            });
    internal_static_google_cloud_automl_v1_BatchPredictRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_automl_v1_BatchPredictRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1_BatchPredictRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_BatchPredictRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1_BatchPredictResult_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1_BatchPredictResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_BatchPredictResult_descriptor,
            new java.lang.String[] {
              "Metadata",
            });
    internal_static_google_cloud_automl_v1_BatchPredictResult_MetadataEntry_descriptor =
        internal_static_google_cloud_automl_v1_BatchPredictResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1_BatchPredictResult_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_BatchPredictResult_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1.AnnotationPayloadOuterClass.getDescriptor();
    com.google.cloud.automl.v1.DataItems.getDescriptor();
    com.google.cloud.automl.v1.Io.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

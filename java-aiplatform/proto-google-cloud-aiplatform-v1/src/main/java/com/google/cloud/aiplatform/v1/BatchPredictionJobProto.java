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
// source: google/cloud/aiplatform/v1/batch_prediction_job.proto

package com.google.cloud.aiplatform.v1;

public final class BatchPredictionJobProto {
  private BatchPredictionJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/batch_predi"
          + "ction_job.proto\022\032google.cloud.aiplatform"
          + ".v1\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\0321google/cloud/ai"
          + "platform/v1/completion_stats.proto\0320goog"
          + "le/cloud/aiplatform/v1/encryption_spec.p"
          + "roto\032#google/cloud/aiplatform/v1/io.prot"
          + "o\032*google/cloud/aiplatform/v1/job_state."
          + "proto\0322google/cloud/aiplatform/v1/machin"
          + "e_resources.proto\032?google/cloud/aiplatfo"
          + "rm/v1/manual_batch_tuning_parameters.pro"
          + "to\032\034google/protobuf/struct.proto\032\037google"
          + "/protobuf/timestamp.proto\032\027google/rpc/st"
          + "atus.proto\032\034google/api/annotations.proto"
          + "\"\273\017\n\022BatchPredictionJob\022\021\n\004name\030\001 \001(\tB\003\340"
          + "A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\0226\n\005model\030\003"
          + " \001(\tB\'\340A\002\372A!\n\037aiplatform.googleapis.com/"
          + "Model\022U\n\014input_config\030\004 \001(\0132:.google.clo"
          + "ud.aiplatform.v1.BatchPredictionJob.Inpu"
          + "tConfigB\003\340A\002\0220\n\020model_parameters\030\005 \001(\0132\026"
          + ".google.protobuf.Value\022W\n\routput_config\030"
          + "\006 \001(\0132;.google.cloud.aiplatform.v1.Batch"
          + "PredictionJob.OutputConfigB\003\340A\002\022P\n\023dedic"
          + "ated_resources\030\007 \001(\01323.google.cloud.aipl"
          + "atform.v1.BatchDedicatedResources\022d\n\036man"
          + "ual_batch_tuning_parameters\030\010 \001(\01327.goog"
          + "le.cloud.aiplatform.v1.ManualBatchTuning"
          + "ParametersB\003\340A\005\022S\n\013output_info\030\t \001(\01329.g"
          + "oogle.cloud.aiplatform.v1.BatchPredictio"
          + "nJob.OutputInfoB\003\340A\003\0228\n\005state\030\n \001(\0162$.go"
          + "ogle.cloud.aiplatform.v1.JobStateB\003\340A\003\022&"
          + "\n\005error\030\013 \001(\0132\022.google.rpc.StatusB\003\340A\003\0221"
          + "\n\020partial_failures\030\014 \003(\0132\022.google.rpc.St"
          + "atusB\003\340A\003\022N\n\022resources_consumed\030\r \001(\0132-."
          + "google.cloud.aiplatform.v1.ResourcesCons"
          + "umedB\003\340A\003\022J\n\020completion_stats\030\016 \001(\0132+.go"
          + "ogle.cloud.aiplatform.v1.CompletionStats"
          + "B\003\340A\003\0224\n\013create_time\030\017 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0223\n\nstart_time\030\020 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\0221\n\010end_"
          + "time\030\021 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\0224\n\013update_time\030\022 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\022J\n\006labels\030\023 \003(\0132:.goog"
          + "le.cloud.aiplatform.v1.BatchPredictionJo"
          + "b.LabelsEntry\022C\n\017encryption_spec\030\030 \001(\0132*"
          + ".google.cloud.aiplatform.v1.EncryptionSp"
          + "ec\032\272\001\n\013InputConfig\022;\n\ngcs_source\030\002 \001(\0132%"
          + ".google.cloud.aiplatform.v1.GcsSourceH\000\022"
          + "E\n\017bigquery_source\030\003 \001(\0132*.google.cloud."
          + "aiplatform.v1.BigQuerySourceH\000\022\035\n\020instan"
          + "ces_format\030\001 \001(\tB\003\340A\002B\010\n\006source\032\326\001\n\014Outp"
          + "utConfig\022E\n\017gcs_destination\030\002 \001(\0132*.goog"
          + "le.cloud.aiplatform.v1.GcsDestinationH\000\022"
          + "O\n\024bigquery_destination\030\003 \001(\0132/.google.c"
          + "loud.aiplatform.v1.BigQueryDestinationH\000"
          + "\022\037\n\022predictions_format\030\001 \001(\tB\003\340A\002B\r\n\013des"
          + "tination\032l\n\nOutputInfo\022#\n\024gcs_output_dir"
          + "ectory\030\001 \001(\tB\003\340A\003H\000\022&\n\027bigquery_output_d"
          + "ataset\030\002 \001(\tB\003\340A\003H\000B\021\n\017output_location\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001:\206\001\352A\202\001\n,aiplatform.googleapis.com/"
          + "BatchPredictionJob\022Rprojects/{project}/l"
          + "ocations/{location}/batchPredictionJobs/"
          + "{batch_prediction_job}B\333\001\n\036com.google.cl"
          + "oud.aiplatform.v1B\027BatchPredictionJobPro"
          + "toP\001ZDgoogle.golang.org/genproto/googlea"
          + "pis/cloud/aiplatform/v1;aiplatform\252\002\032Goo"
          + "gle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\A"
          + "IPlatform\\V1\352\002\035Google::Cloud::AIPlatform"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.CompletionStatsProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ManualBatchTuningParametersProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Model",
              "InputConfig",
              "ModelParameters",
              "OutputConfig",
              "DedicatedResources",
              "ManualBatchTuningParameters",
              "OutputInfo",
              "State",
              "Error",
              "PartialFailures",
              "ResourcesConsumed",
              "CompletionStats",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Labels",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "BigquerySource", "InstancesFormat", "Source",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "PredictionsFormat", "Destination",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_OutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory", "BigqueryOutputDataset", "OutputLocation",
            });
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchPredictionJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.CompletionStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ManualBatchTuningParametersProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

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
// source: google/cloud/aiplatform/v1beta1/schedule_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ScheduleServiceProto {
  private ScheduleServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/schedu"
          + "le_service.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032/google/cloud/aiplatform/v1beta1/op"
          + "eration.proto\032.google/cloud/aiplatform/v"
          + "1beta1/schedule.proto\032#google/longrunnin"
          + "g/operations.proto\032\033google/protobuf/empt"
          + "y.proto\"\224\001\n\025CreateScheduleRequest\0229\n\006par"
          + "ent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis."
          + "com/Location\022@\n\010schedule\030\002 \001(\0132).google."
          + "cloud.aiplatform.v1beta1.ScheduleB\003\340A\002\"N"
          + "\n\022GetScheduleRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372"
          + "A$\n\"aiplatform.googleapis.com/Schedule\"\232"
          + "\001\n\024ListSchedulesRequest\0229\n\006parent\030\001 \001(\tB"
          + ")\340A\002\372A#\n!locations.googleapis.com/Locati"
          + "on\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n"
          + "\npage_token\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"n\n\025L"
          + "istSchedulesResponse\022<\n\tschedules\030\001 \003(\0132"
          + ").google.cloud.aiplatform.v1beta1.Schedu"
          + "le\022\027\n\017next_page_token\030\002 \001(\t\"Q\n\025DeleteSch"
          + "eduleRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aipl"
          + "atform.googleapis.com/Schedule\"P\n\024PauseS"
          + "cheduleRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"ai"
          + "platform.googleapis.com/Schedule\"h\n\025Resu"
          + "meScheduleRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n"
          + "\"aiplatform.googleapis.com/Schedule\022\025\n\010c"
          + "atch_up\030\002 \001(\010B\003\340A\0012\344\t\n\017ScheduleService\022\313"
          + "\001\n\016CreateSchedule\0226.google.cloud.aiplatf"
          + "orm.v1beta1.CreateScheduleRequest\032).goog"
          + "le.cloud.aiplatform.v1beta1.Schedule\"V\202\323"
          + "\344\223\002>\"2/v1beta1/{parent=projects/*/locati"
          + "ons/*}/schedules:\010schedule\332A\017parent,sche"
          + "dule\022\335\001\n\016DeleteSchedule\0226.google.cloud.a"
          + "iplatform.v1beta1.DeleteScheduleRequest\032"
          + "\035.google.longrunning.Operation\"t\202\323\344\223\0024*2"
          + "/v1beta1/{name=projects/*/locations/*/sc"
          + "hedules/*}\332A\004name\312A0\n\025google.protobuf.Em"
          + "pty\022\027DeleteOperationMetadata\022\260\001\n\013GetSche"
          + "dule\0223.google.cloud.aiplatform.v1beta1.G"
          + "etScheduleRequest\032).google.cloud.aiplatf"
          + "orm.v1beta1.Schedule\"A\202\323\344\223\0024\0222/v1beta1/{"
          + "name=projects/*/locations/*/schedules/*}"
          + "\332A\004name\022\303\001\n\rListSchedules\0225.google.cloud"
          + ".aiplatform.v1beta1.ListSchedulesRequest"
          + "\0326.google.cloud.aiplatform.v1beta1.ListS"
          + "chedulesResponse\"C\202\323\344\223\0024\0222/v1beta1/{pare"
          + "nt=projects/*/locations/*}/schedules\332A\006p"
          + "arent\022\252\001\n\rPauseSchedule\0225.google.cloud.a"
          + "iplatform.v1beta1.PauseScheduleRequest\032\026"
          + ".google.protobuf.Empty\"J\202\323\344\223\002=\"8/v1beta1"
          + "/{name=projects/*/locations/*/schedules/"
          + "*}:pause:\001*\332A\004name\022\255\001\n\016ResumeSchedule\0226."
          + "google.cloud.aiplatform.v1beta1.ResumeSc"
          + "heduleRequest\032\026.google.protobuf.Empty\"K\202"
          + "\323\344\223\002>\"9/v1beta1/{name=projects/*/locatio"
          + "ns/*/schedules/*}:resume:\001*\332A\004name\032M\312A\031a"
          + "iplatform.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\353\001\n#co"
          + "m.google.cloud.aiplatform.v1beta1B\024Sched"
          + "uleServiceProtoP\001ZCcloud.google.com/go/a"
          + "iplatform/apiv1beta1/aiplatformpb;aiplat"
          + "formpb\252\002\037Google.Cloud.AIPlatform.V1Beta1"
          + "\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Goo"
          + "gle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ScheduleProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateScheduleRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Schedule",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetScheduleRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListSchedulesResponse_descriptor,
            new java.lang.String[] {
              "Schedules", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteScheduleRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PauseScheduleRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ResumeScheduleRequest_descriptor,
            new java.lang.String[] {
              "Name", "CatchUp",
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
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ScheduleProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

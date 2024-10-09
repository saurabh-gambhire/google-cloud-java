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
// source: google/cloud/retail/v2alpha/export_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

public final class ExportConfigProto {
  private ExportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_OutputConfig_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_OutputConfig_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_OutputConfig_BigQueryDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_OutputConfig_BigQueryDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportProductsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_OutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_OutputResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_BigQueryOutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_BigQueryOutputResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_GcsOutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_GcsOutputResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/retail/v2alpha/export_con"
          + "fig.proto\022\033google.cloud.retail.v2alpha\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\037google/protobuf/time"
          + "stamp.proto\032\027google/rpc/status.proto\"\352\002\n"
          + "\014OutputConfig\022S\n\017gcs_destination\030\001 \001(\01328"
          + ".google.cloud.retail.v2alpha.OutputConfi"
          + "g.GcsDestinationH\000\022]\n\024bigquery_destinati"
          + "on\030\002 \001(\0132=.google.cloud.retail.v2alpha.O"
          + "utputConfig.BigQueryDestinationH\000\0320\n\016Gcs"
          + "Destination\022\036\n\021output_uri_prefix\030\001 \001(\tB\003"
          + "\340A\002\032e\n\023BigQueryDestination\022\027\n\ndataset_id"
          + "\030\001 \001(\tB\003\340A\002\022\034\n\017table_id_prefix\030\002 \001(\tB\003\340A"
          + "\002\022\027\n\ntable_type\030\003 \001(\tB\003\340A\002B\r\n\013destinatio"
          + "n\"9\n\022ExportErrorsConfig\022\024\n\ngcs_prefix\030\001 "
          + "\001(\tH\000B\r\n\013destination\"\244\001\n\025ExportProductsR"
          + "equest\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034retail.g"
          + "oogleapis.com/Branch\022E\n\routput_config\030\002 "
          + "\001(\0132).google.cloud.retail.v2alpha.Output"
          + "ConfigB\003\340A\002\022\016\n\006filter\030\003 \001(\t\"\247\001\n\027ExportUs"
          + "erEventsRequest\0225\n\006parent\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035retail.googleapis.com/Catalog\022E\n\routput"
          + "_config\030\002 \001(\0132).google.cloud.retail.v2al"
          + "pha.OutputConfigB\003\340A\002\022\016\n\006filter\030\003 \001(\t\"\214\001"
          + "\n\035ExportAnalyticsMetricsRequest\022\024\n\007catal"
          + "og\030\001 \001(\tB\003\340A\002\022E\n\routput_config\030\002 \001(\0132).g"
          + "oogle.cloud.retail.v2alpha.OutputConfigB"
          + "\003\340A\002\022\016\n\006filter\030\003 \001(\t\"r\n\016ExportMetadata\022/"
          + "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022/\n\013update_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\"\315\001\n\026ExportProductsRespo"
          + "nse\022)\n\rerror_samples\030\001 \003(\0132\022.google.rpc."
          + "Status\022F\n\rerrors_config\030\002 \001(\0132/.google.c"
          + "loud.retail.v2alpha.ExportErrorsConfig\022@"
          + "\n\routput_result\030\003 \001(\0132).google.cloud.ret"
          + "ail.v2alpha.OutputResult\"\317\001\n\030ExportUserE"
          + "ventsResponse\022)\n\rerror_samples\030\001 \003(\0132\022.g"
          + "oogle.rpc.Status\022F\n\rerrors_config\030\002 \001(\0132"
          + "/.google.cloud.retail.v2alpha.ExportErro"
          + "rsConfig\022@\n\routput_result\030\003 \001(\0132).google"
          + ".cloud.retail.v2alpha.OutputResult\"\325\001\n\036E"
          + "xportAnalyticsMetricsResponse\022)\n\rerror_s"
          + "amples\030\001 \003(\0132\022.google.rpc.Status\022F\n\rerro"
          + "rs_config\030\002 \001(\0132/.google.cloud.retail.v2"
          + "alpha.ExportErrorsConfig\022@\n\routput_resul"
          + "t\030\003 \001(\0132).google.cloud.retail.v2alpha.Ou"
          + "tputResult\"\234\001\n\014OutputResult\022J\n\017bigquery_"
          + "result\030\001 \003(\01321.google.cloud.retail.v2alp"
          + "ha.BigQueryOutputResult\022@\n\ngcs_result\030\002 "
          + "\003(\0132,.google.cloud.retail.v2alpha.GcsOut"
          + "putResult\"<\n\024BigQueryOutputResult\022\022\n\ndat"
          + "aset_id\030\001 \001(\t\022\020\n\010table_id\030\002 \001(\t\"%\n\017GcsOu"
          + "tputResult\022\022\n\noutput_uri\030\001 \001(\tB\325\001\n\037com.g"
          + "oogle.cloud.retail.v2alphaB\021ExportConfig"
          + "ProtoP\001Z7cloud.google.com/go/retail/apiv"
          + "2alpha/retailpb;retailpb\242\002\006RETAIL\252\002\033Goog"
          + "le.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\R"
          + "etail\\V2alpha\352\002\036Google::Cloud::Retail::V"
          + "2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "Destination",
            });
    internal_static_google_cloud_retail_v2alpha_OutputConfig_GcsDestination_descriptor =
        internal_static_google_cloud_retail_v2alpha_OutputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_OutputConfig_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_OutputConfig_GcsDestination_descriptor,
            new java.lang.String[] {
              "OutputUriPrefix",
            });
    internal_static_google_cloud_retail_v2alpha_OutputConfig_BigQueryDestination_descriptor =
        internal_static_google_cloud_retail_v2alpha_OutputConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_OutputConfig_BigQueryDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_OutputConfig_BigQueryDestination_descriptor,
            new java.lang.String[] {
              "DatasetId", "TableIdPrefix", "TableType",
            });
    internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportErrorsConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_retail_v2alpha_ExportProductsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2alpha_ExportProductsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportProductsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "OutputConfig", "Filter",
            });
    internal_static_google_cloud_retail_v2alpha_ExportUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2alpha_ExportUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "OutputConfig", "Filter",
            });
    internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsRequest_descriptor,
            new java.lang.String[] {
              "Catalog", "OutputConfig", "Filter",
            });
    internal_static_google_cloud_retail_v2alpha_ExportMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2alpha_ExportMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportProductsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "OutputResult",
            });
    internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "OutputResult",
            });
    internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ExportAnalyticsMetricsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "OutputResult",
            });
    internal_static_google_cloud_retail_v2alpha_OutputResult_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_retail_v2alpha_OutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_OutputResult_descriptor,
            new java.lang.String[] {
              "BigqueryResult", "GcsResult",
            });
    internal_static_google_cloud_retail_v2alpha_BigQueryOutputResult_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_retail_v2alpha_BigQueryOutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_BigQueryOutputResult_descriptor,
            new java.lang.String[] {
              "DatasetId", "TableId",
            });
    internal_static_google_cloud_retail_v2alpha_GcsOutputResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_retail_v2alpha_GcsOutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_GcsOutputResult_descriptor,
            new java.lang.String[] {
              "OutputUri",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

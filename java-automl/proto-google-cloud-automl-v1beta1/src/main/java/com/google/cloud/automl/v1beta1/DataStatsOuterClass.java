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
// source: google/cloud/automl/v1beta1/data_stats.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1beta1;

public final class DataStatsOuterClass {
  private DataStatsOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_DataStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_DataStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_Float64Stats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Float64Stats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_Float64Stats_HistogramBucket_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Float64Stats_HistogramBucket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_StringStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_StringStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_StringStats_UnigramStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_StringStats_UnigramStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TimestampStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TimestampStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_BucketsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_BucketsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStatsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStatsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ArrayStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ArrayStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_StructStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_StructStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_StructStats_FieldStatsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_StructStats_FieldStatsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_CategoryStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_CategoryStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_CategoryStats_SingleCategoryStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_CategoryStats_SingleCategoryStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_CorrelationStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_CorrelationStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/automl/v1beta1/data_stats"
          + ".proto\022\033google.cloud.automl.v1beta1\"\375\003\n\t"
          + "DataStats\022B\n\rfloat64_stats\030\003 \001(\0132).googl"
          + "e.cloud.automl.v1beta1.Float64StatsH\000\022@\n"
          + "\014string_stats\030\004 \001(\0132(.google.cloud.autom"
          + "l.v1beta1.StringStatsH\000\022F\n\017timestamp_sta"
          + "ts\030\005 \001(\0132+.google.cloud.automl.v1beta1.T"
          + "imestampStatsH\000\022>\n\013array_stats\030\006 \001(\0132\'.g"
          + "oogle.cloud.automl.v1beta1.ArrayStatsH\000\022"
          + "@\n\014struct_stats\030\007 \001(\0132(.google.cloud.aut"
          + "oml.v1beta1.StructStatsH\000\022D\n\016category_st"
          + "ats\030\010 \001(\0132*.google.cloud.automl.v1beta1."
          + "CategoryStatsH\000\022\034\n\024distinct_value_count\030"
          + "\001 \001(\003\022\030\n\020null_value_count\030\002 \001(\003\022\031\n\021valid"
          + "_value_count\030\t \001(\003B\007\n\005stats\"\335\001\n\014Float64S"
          + "tats\022\014\n\004mean\030\001 \001(\001\022\032\n\022standard_deviation"
          + "\030\002 \001(\001\022\021\n\tquantiles\030\003 \003(\001\022T\n\021histogram_b"
          + "uckets\030\004 \003(\01329.google.cloud.automl.v1bet"
          + "a1.Float64Stats.HistogramBucket\032:\n\017Histo"
          + "gramBucket\022\013\n\003min\030\001 \001(\001\022\013\n\003max\030\002 \001(\001\022\r\n\005"
          + "count\030\003 \001(\003\"\215\001\n\013StringStats\022P\n\021top_unigr"
          + "am_stats\030\001 \003(\01325.google.cloud.automl.v1b"
          + "eta1.StringStats.UnigramStats\032,\n\014Unigram"
          + "Stats\022\r\n\005value\030\001 \001(\t\022\r\n\005count\030\002 \001(\003\"\364\002\n\016"
          + "TimestampStats\022V\n\016granular_stats\030\001 \003(\0132>"
          + ".google.cloud.automl.v1beta1.TimestampSt"
          + "ats.GranularStatsEntry\032\230\001\n\rGranularStats"
          + "\022W\n\007buckets\030\001 \003(\0132F.google.cloud.automl."
          + "v1beta1.TimestampStats.GranularStats.Buc"
          + "ketsEntry\032.\n\014BucketsEntry\022\013\n\003key\030\001 \001(\005\022\r"
          + "\n\005value\030\002 \001(\003:\0028\001\032o\n\022GranularStatsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022H\n\005value\030\002 \001(\01329.google.clo"
          + "ud.automl.v1beta1.TimestampStats.Granula"
          + "rStats:\0028\001\"J\n\nArrayStats\022<\n\014member_stats"
          + "\030\002 \001(\0132&.google.cloud.automl.v1beta1.Dat"
          + "aStats\"\267\001\n\013StructStats\022M\n\013field_stats\030\001 "
          + "\003(\01328.google.cloud.automl.v1beta1.Struct"
          + "Stats.FieldStatsEntry\032Y\n\017FieldStatsEntry"
          + "\022\013\n\003key\030\001 \001(\t\0225\n\005value\030\002 \001(\0132&.google.cl"
          + "oud.automl.v1beta1.DataStats:\0028\001\"\240\001\n\rCat"
          + "egoryStats\022Z\n\022top_category_stats\030\001 \003(\0132>"
          + ".google.cloud.automl.v1beta1.CategorySta"
          + "ts.SingleCategoryStats\0323\n\023SingleCategory"
          + "Stats\022\r\n\005value\030\001 \001(\t\022\r\n\005count\030\002 \001(\003\"%\n\020C"
          + "orrelationStats\022\021\n\tcramers_v\030\001 \001(\001B\233\001\n\037c"
          + "om.google.cloud.automl.v1beta1P\001Z7cloud."
          + "google.com/go/automl/apiv1beta1/automlpb"
          + ";automlpb\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352"
          + "\002\036Google::Cloud::AutoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_automl_v1beta1_DataStats_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_DataStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_DataStats_descriptor,
            new java.lang.String[] {
              "Float64Stats",
              "StringStats",
              "TimestampStats",
              "ArrayStats",
              "StructStats",
              "CategoryStats",
              "DistinctValueCount",
              "NullValueCount",
              "ValidValueCount",
              "Stats",
            });
    internal_static_google_cloud_automl_v1beta1_Float64Stats_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_Float64Stats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_Float64Stats_descriptor,
            new java.lang.String[] {
              "Mean", "StandardDeviation", "Quantiles", "HistogramBuckets",
            });
    internal_static_google_cloud_automl_v1beta1_Float64Stats_HistogramBucket_descriptor =
        internal_static_google_cloud_automl_v1beta1_Float64Stats_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_Float64Stats_HistogramBucket_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_Float64Stats_HistogramBucket_descriptor,
            new java.lang.String[] {
              "Min", "Max", "Count",
            });
    internal_static_google_cloud_automl_v1beta1_StringStats_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_StringStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_StringStats_descriptor,
            new java.lang.String[] {
              "TopUnigramStats",
            });
    internal_static_google_cloud_automl_v1beta1_StringStats_UnigramStats_descriptor =
        internal_static_google_cloud_automl_v1beta1_StringStats_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_StringStats_UnigramStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_StringStats_UnigramStats_descriptor,
            new java.lang.String[] {
              "Value", "Count",
            });
    internal_static_google_cloud_automl_v1beta1_TimestampStats_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_TimestampStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TimestampStats_descriptor,
            new java.lang.String[] {
              "GranularStats",
            });
    internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_descriptor =
        internal_static_google_cloud_automl_v1beta1_TimestampStats_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_descriptor,
            new java.lang.String[] {
              "Buckets",
            });
    internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_BucketsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_BucketsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStats_BucketsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStatsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_TimestampStats_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStatsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TimestampStats_GranularStatsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1beta1_ArrayStats_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1beta1_ArrayStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ArrayStats_descriptor,
            new java.lang.String[] {
              "MemberStats",
            });
    internal_static_google_cloud_automl_v1beta1_StructStats_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1beta1_StructStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_StructStats_descriptor,
            new java.lang.String[] {
              "FieldStats",
            });
    internal_static_google_cloud_automl_v1beta1_StructStats_FieldStatsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_StructStats_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_StructStats_FieldStatsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_StructStats_FieldStatsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1beta1_CategoryStats_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_automl_v1beta1_CategoryStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_CategoryStats_descriptor,
            new java.lang.String[] {
              "TopCategoryStats",
            });
    internal_static_google_cloud_automl_v1beta1_CategoryStats_SingleCategoryStats_descriptor =
        internal_static_google_cloud_automl_v1beta1_CategoryStats_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_CategoryStats_SingleCategoryStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_CategoryStats_SingleCategoryStats_descriptor,
            new java.lang.String[] {
              "Value", "Count",
            });
    internal_static_google_cloud_automl_v1beta1_CorrelationStats_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_automl_v1beta1_CorrelationStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_CorrelationStats_descriptor,
            new java.lang.String[] {
              "CramersV",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

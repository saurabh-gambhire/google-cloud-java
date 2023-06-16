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
// source: google/cloud/aiplatform/v1/model_monitoring.proto

package com.google.cloud.aiplatform.v1;

public final class ModelMonitoringProto {
  private ModelMonitoringProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ThresholdConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SamplingStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SamplingStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/model_monit"
          + "oring.proto\022\032google.cloud.aiplatform.v1\032"
          + "\031google/api/resource.proto\032#google/cloud"
          + "/aiplatform/v1/io.proto\"\277\025\n\036ModelMonitor"
          + "ingObjectiveConfig\022d\n\020training_dataset\030\001"
          + " \001(\0132J.google.cloud.aiplatform.v1.ModelM"
          + "onitoringObjectiveConfig.TrainingDataset"
          + "\022\223\001\n)training_prediction_skew_detection_"
          + "config\030\002 \001(\0132`.google.cloud.aiplatform.v"
          + "1.ModelMonitoringObjectiveConfig.Trainin"
          + "gPredictionSkewDetectionConfig\022\204\001\n!predi"
          + "ction_drift_detection_config\030\003 \001(\0132Y.goo"
          + "gle.cloud.aiplatform.v1.ModelMonitoringO"
          + "bjectiveConfig.PredictionDriftDetectionC"
          + "onfig\022h\n\022explanation_config\030\005 \001(\0132L.goog"
          + "le.cloud.aiplatform.v1.ModelMonitoringOb"
          + "jectiveConfig.ExplanationConfig\032\333\002\n\017Trai"
          + "ningDataset\0229\n\007dataset\030\003 \001(\tB&\372A#\n!aipla"
          + "tform.googleapis.com/DatasetH\000\022;\n\ngcs_so"
          + "urce\030\004 \001(\0132%.google.cloud.aiplatform.v1."
          + "GcsSourceH\000\022E\n\017bigquery_source\030\005 \001(\0132*.g"
          + "oogle.cloud.aiplatform.v1.BigQuerySource"
          + "H\000\022\023\n\013data_format\030\002 \001(\t\022\024\n\014target_field\030"
          + "\006 \001(\t\022O\n\031logging_sampling_strategy\030\007 \001(\013"
          + "2,.google.cloud.aiplatform.v1.SamplingSt"
          + "rategyB\r\n\013data_source\032\217\005\n%TrainingPredic"
          + "tionSkewDetectionConfig\022\215\001\n\017skew_thresho"
          + "lds\030\001 \003(\0132t.google.cloud.aiplatform.v1.M"
          + "odelMonitoringObjectiveConfig.TrainingPr"
          + "edictionSkewDetectionConfig.SkewThreshol"
          + "dsEntry\022\260\001\n!attribution_score_skew_thres"
          + "holds\030\002 \003(\0132\204\001.google.cloud.aiplatform.v"
          + "1.ModelMonitoringObjectiveConfig.Trainin"
          + "gPredictionSkewDetectionConfig.Attributi"
          + "onScoreSkewThresholdsEntry\022K\n\026default_sk"
          + "ew_threshold\030\006 \001(\0132+.google.cloud.aiplat"
          + "form.v1.ThresholdConfig\032b\n\023SkewThreshold"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.goo"
          + "gle.cloud.aiplatform.v1.ThresholdConfig:"
          + "\0028\001\032r\n#AttributionScoreSkewThresholdsEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.google."
          + "cloud.aiplatform.v1.ThresholdConfig:\0028\001\032"
          + "\200\005\n\036PredictionDriftDetectionConfig\022\210\001\n\020d"
          + "rift_thresholds\030\001 \003(\0132n.google.cloud.aip"
          + "latform.v1.ModelMonitoringObjectiveConfi"
          + "g.PredictionDriftDetectionConfig.DriftTh"
          + "resholdsEntry\022\252\001\n\"attribution_score_drif"
          + "t_thresholds\030\002 \003(\0132~.google.cloud.aiplat"
          + "form.v1.ModelMonitoringObjectiveConfig.P"
          + "redictionDriftDetectionConfig.Attributio"
          + "nScoreDriftThresholdsEntry\022L\n\027default_dr"
          + "ift_threshold\030\005 \001(\0132+.google.cloud.aipla"
          + "tform.v1.ThresholdConfig\032c\n\024DriftThresho"
          + "ldsEntry\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.g"
          + "oogle.cloud.aiplatform.v1.ThresholdConfi"
          + "g:\0028\001\032s\n$AttributionScoreDriftThresholds"
          + "Entry\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001(\0132+.goog"
          + "le.cloud.aiplatform.v1.ThresholdConfig:\002"
          + "8\001\032\274\004\n\021ExplanationConfig\022!\n\031enable_featu"
          + "re_attributes\030\001 \001(\010\022~\n\024explanation_basel"
          + "ine\030\002 \001(\0132`.google.cloud.aiplatform.v1.M"
          + "odelMonitoringObjectiveConfig.Explanatio"
          + "nConfig.ExplanationBaseline\032\203\003\n\023Explanat"
          + "ionBaseline\0229\n\003gcs\030\002 \001(\0132*.google.cloud."
          + "aiplatform.v1.GcsDestinationH\000\022C\n\010bigque"
          + "ry\030\003 \001(\0132/.google.cloud.aiplatform.v1.Bi"
          + "gQueryDestinationH\000\022\214\001\n\021prediction_forma"
          + "t\030\001 \001(\0162q.google.cloud.aiplatform.v1.Mod"
          + "elMonitoringObjectiveConfig.ExplanationC"
          + "onfig.ExplanationBaseline.PredictionForm"
          + "at\"N\n\020PredictionFormat\022!\n\035PREDICTION_FOR"
          + "MAT_UNSPECIFIED\020\000\022\t\n\005JSONL\020\002\022\014\n\010BIGQUERY"
          + "\020\003B\r\n\013destination\"\315\001\n\032ModelMonitoringAle"
          + "rtConfig\022e\n\022email_alert_config\030\001 \001(\0132G.g"
          + "oogle.cloud.aiplatform.v1.ModelMonitorin"
          + "gAlertConfig.EmailAlertConfigH\000\022\026\n\016enabl"
          + "e_logging\030\002 \001(\010\032\'\n\020EmailAlertConfig\022\023\n\013u"
          + "ser_emails\030\001 \003(\tB\007\n\005alert\"/\n\017ThresholdCo"
          + "nfig\022\017\n\005value\030\001 \001(\001H\000B\013\n\tthreshold\"\234\001\n\020S"
          + "amplingStrategy\022]\n\024random_sample_config\030"
          + "\001 \001(\0132?.google.cloud.aiplatform.v1.Sampl"
          + "ingStrategy.RandomSampleConfig\032)\n\022Random"
          + "SampleConfig\022\023\n\013sample_rate\030\001 \001(\001B\304\002\n\036co"
          + "m.google.cloud.aiplatform.v1B\024ModelMonit"
          + "oringProtoP\001Z>cloud.google.com/go/aiplat"
          + "form/apiv1/aiplatformpb;aiplatformpb\252\002\032G"
          + "oogle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud"
          + "\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatfo"
          + "rm::V1\352Ao\n-monitoring.googleapis.com/Not"
          + "ificationChannel\022>projects/{project}/not"
          + "ificationChannels/{notification_channel}"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor,
            new java.lang.String[] {
              "TrainingDataset",
              "TrainingPredictionSkewDetectionConfig",
              "PredictionDriftDetectionConfig",
              "ExplanationConfig",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor,
            new java.lang.String[] {
              "Dataset",
              "GcsSource",
              "BigquerySource",
              "DataFormat",
              "TargetField",
              "LoggingSamplingStrategy",
              "DataSource",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor,
            new java.lang.String[] {
              "SkewThresholds", "AttributionScoreSkewThresholds", "DefaultSkewThreshold",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor,
            new java.lang.String[] {
              "DriftThresholds", "AttributionScoreDriftThresholds", "DefaultDriftThreshold",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor,
            new java.lang.String[] {
              "EnableFeatureAttributes", "ExplanationBaseline",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor,
            new java.lang.String[] {
              "Gcs", "Bigquery", "PredictionFormat", "Destination",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_descriptor,
            new java.lang.String[] {
              "EmailAlertConfig", "EnableLogging", "Alert",
            });
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor,
            new java.lang.String[] {
              "UserEmails",
            });
    internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ThresholdConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor,
            new java.lang.String[] {
              "Value", "Threshold",
            });
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SamplingStrategy_descriptor,
            new java.lang.String[] {
              "RandomSampleConfig",
            });
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_SamplingStrategy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SamplingStrategy_RandomSampleConfig_descriptor,
            new java.lang.String[] {
              "SampleRate",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

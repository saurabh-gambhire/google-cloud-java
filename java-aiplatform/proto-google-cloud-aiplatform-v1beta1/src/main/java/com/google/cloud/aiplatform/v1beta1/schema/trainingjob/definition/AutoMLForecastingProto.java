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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_time_series_forecasting.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLForecastingProto {
  private AutoMLForecastingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecasting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecasting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_AutoTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_AutoTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_NumericTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_NumericTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_CategoricalTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_CategoricalTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TimestampTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TimestampTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TextTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TextTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Granularity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Granularity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nbgoogle/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_time_seri"
          + "es_forecasting.proto\022=google.cloud.aipla"
          + "tform.v1beta1.schema.trainingjob.definit"
          + "ion\032fgoogle/cloud/aiplatform/v1beta1/sch"
          + "ema/trainingjob/definition/export_evalua"
          + "ted_data_items_config.proto\"\347\001\n\021AutoMlFo"
          + "recasting\022f\n\006inputs\030\001 \001(\0132V.google.cloud"
          + ".aiplatform.v1beta1.schema.trainingjob.d"
          + "efinition.AutoMlForecastingInputs\022j\n\010met"
          + "adata\030\002 \001(\0132X.google.cloud.aiplatform.v1"
          + "beta1.schema.trainingjob.definition.Auto"
          + "MlForecastingMetadata\"\367\016\n\027AutoMlForecast"
          + "ingInputs\022\025\n\rtarget_column\030\001 \001(\t\022%\n\035time"
          + "_series_identifier_column\030\002 \001(\t\022\023\n\013time_"
          + "column\030\003 \001(\t\022~\n\017transformations\030\004 \003(\0132e."
          + "google.cloud.aiplatform.v1beta1.schema.t"
          + "rainingjob.definition.AutoMlForecastingI"
          + "nputs.Transformation\022\036\n\026optimization_obj"
          + "ective\030\005 \001(\t\022%\n\035train_budget_milli_node_"
          + "hours\030\006 \001(\003\022\025\n\rweight_column\030\007 \001(\t\022%\n\035ti"
          + "me_series_attribute_columns\030\023 \003(\t\022\'\n\037una"
          + "vailable_at_forecast_columns\030\024 \003(\t\022%\n\035av"
          + "ailable_at_forecast_columns\030\025 \003(\t\022|\n\020dat"
          + "a_granularity\030\026 \001(\0132b.google.cloud.aipla"
          + "tform.v1beta1.schema.trainingjob.definit"
          + "ion.AutoMlForecastingInputs.Granularity\022"
          + "\030\n\020forecast_horizon\030\027 \001(\003\022\026\n\016context_win"
          + "dow\030\030 \001(\003\022\211\001\n\"export_evaluated_data_item"
          + "s_config\030\017 \001(\0132].google.cloud.aiplatform"
          + ".v1beta1.schema.trainingjob.definition.E"
          + "xportEvaluatedDataItemsConfig\022\021\n\tquantil"
          + "es\030\020 \003(\001\022\032\n\022validation_options\030\021 \001(\t\022\036\n\026"
          + "additional_experiments\030\031 \003(\t\032\371\007\n\016Transfo"
          + "rmation\022\210\001\n\004auto\030\001 \001(\0132x.google.cloud.ai"
          + "platform.v1beta1.schema.trainingjob.defi"
          + "nition.AutoMlForecastingInputs.Transform"
          + "ation.AutoTransformationH\000\022\216\001\n\007numeric\030\002"
          + " \001(\0132{.google.cloud.aiplatform.v1beta1.s"
          + "chema.trainingjob.definition.AutoMlForec"
          + "astingInputs.Transformation.NumericTrans"
          + "formationH\000\022\226\001\n\013categorical\030\003 \001(\0132\177.goog"
          + "le.cloud.aiplatform.v1beta1.schema.train"
          + "ingjob.definition.AutoMlForecastingInput"
          + "s.Transformation.CategoricalTransformati"
          + "onH\000\022\222\001\n\ttimestamp\030\004 \001(\0132}.google.cloud."
          + "aiplatform.v1beta1.schema.trainingjob.de"
          + "finition.AutoMlForecastingInputs.Transfo"
          + "rmation.TimestampTransformationH\000\022\210\001\n\004te"
          + "xt\030\005 \001(\0132x.google.cloud.aiplatform.v1bet"
          + "a1.schema.trainingjob.definition.AutoMlF"
          + "orecastingInputs.Transformation.TextTran"
          + "sformationH\000\032)\n\022AutoTransformation\022\023\n\013co"
          + "lumn_name\030\001 \001(\t\032,\n\025NumericTransformation"
          + "\022\023\n\013column_name\030\001 \001(\t\0320\n\031CategoricalTran"
          + "sformation\022\023\n\013column_name\030\001 \001(\t\032C\n\027Times"
          + "tampTransformation\022\023\n\013column_name\030\001 \001(\t\022"
          + "\023\n\013time_format\030\002 \001(\t\032)\n\022TextTransformati"
          + "on\022\023\n\013column_name\030\001 \001(\tB\027\n\025transformatio"
          + "n_detail\032-\n\013Granularity\022\014\n\004unit\030\001 \001(\t\022\020\n"
          + "\010quantity\030\002 \001(\003\"@\n\031AutoMlForecastingMeta"
          + "data\022#\n\033train_cost_milli_node_hours\030\001 \001("
          + "\003B\206\003\nAcom.google.cloud.aiplatform.v1beta"
          + "1.schema.trainingjob.definitionB\026AutoMLF"
          + "orecastingProtoP\001Zacloud.google.com/go/a"
          + "iplatform/apiv1beta1/schema/trainingjob/"
          + "definition/definitionpb;definitionpb\252\002=G"
          + "oogle.Cloud.AIPlatform.V1Beta1.Schema.Tr"
          + "ainingJob.Definition\312\002=Google\\Cloud\\AIPl"
          + "atform\\V1beta1\\Schema\\TrainingJob\\Defini"
          + "tion\352\002CGoogle::Cloud::AIPlatform::V1beta"
          + "1::Schema::TrainingJob::Definitionb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .ExportEvaluatedDataItemsConfigProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecasting_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecasting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecasting_descriptor,
            new java.lang.String[] {
              "Inputs", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_descriptor,
            new java.lang.String[] {
              "TargetColumn",
              "TimeSeriesIdentifierColumn",
              "TimeColumn",
              "Transformations",
              "OptimizationObjective",
              "TrainBudgetMilliNodeHours",
              "WeightColumn",
              "TimeSeriesAttributeColumns",
              "UnavailableAtForecastColumns",
              "AvailableAtForecastColumns",
              "DataGranularity",
              "ForecastHorizon",
              "ContextWindow",
              "ExportEvaluatedDataItemsConfig",
              "Quantiles",
              "ValidationOptions",
              "AdditionalExperiments",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_descriptor,
            new java.lang.String[] {
              "Auto", "Numeric", "Categorical", "Timestamp", "Text", "TransformationDetail",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_AutoTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_AutoTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_AutoTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_NumericTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_NumericTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_NumericTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_CategoricalTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_CategoricalTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_CategoricalTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TimestampTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TimestampTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TimestampTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName", "TimeFormat",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TextTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TextTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Transformation_TextTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Granularity_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Granularity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingInputs_Granularity_descriptor,
            new java.lang.String[] {
              "Unit", "Quantity",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_descriptor,
            new java.lang.String[] {
              "TrainCostMilliNodeHours",
            });
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
        .ExportEvaluatedDataItemsConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

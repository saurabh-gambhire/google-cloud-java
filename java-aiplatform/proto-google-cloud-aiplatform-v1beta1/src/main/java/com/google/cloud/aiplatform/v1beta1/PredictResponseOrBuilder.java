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

public interface PredictResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PredictResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The predictions that are the output of the predictions call.
   * The schema of any single prediction may be specified via Endpoint's
   * DeployedModels' [Model's
   * ][google.cloud.aiplatform.v1beta1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1beta1.Model.predict_schemata]
   * [prediction_schema_uri][google.cloud.aiplatform.v1beta1.PredictSchemata.prediction_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 1;</code>
   */
  java.util.List<com.google.protobuf.Value> getPredictionsList();
  /**
   *
   *
   * <pre>
   * The predictions that are the output of the predictions call.
   * The schema of any single prediction may be specified via Endpoint's
   * DeployedModels' [Model's
   * ][google.cloud.aiplatform.v1beta1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1beta1.Model.predict_schemata]
   * [prediction_schema_uri][google.cloud.aiplatform.v1beta1.PredictSchemata.prediction_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 1;</code>
   */
  com.google.protobuf.Value getPredictions(int index);
  /**
   *
   *
   * <pre>
   * The predictions that are the output of the predictions call.
   * The schema of any single prediction may be specified via Endpoint's
   * DeployedModels' [Model's
   * ][google.cloud.aiplatform.v1beta1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1beta1.Model.predict_schemata]
   * [prediction_schema_uri][google.cloud.aiplatform.v1beta1.PredictSchemata.prediction_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 1;</code>
   */
  int getPredictionsCount();
  /**
   *
   *
   * <pre>
   * The predictions that are the output of the predictions call.
   * The schema of any single prediction may be specified via Endpoint's
   * DeployedModels' [Model's
   * ][google.cloud.aiplatform.v1beta1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1beta1.Model.predict_schemata]
   * [prediction_schema_uri][google.cloud.aiplatform.v1beta1.PredictSchemata.prediction_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.ValueOrBuilder> getPredictionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The predictions that are the output of the predictions call.
   * The schema of any single prediction may be specified via Endpoint's
   * DeployedModels' [Model's
   * ][google.cloud.aiplatform.v1beta1.DeployedModel.model]
   * [PredictSchemata's][google.cloud.aiplatform.v1beta1.Model.predict_schemata]
   * [prediction_schema_uri][google.cloud.aiplatform.v1beta1.PredictSchemata.prediction_schema_uri].
   * </pre>
   *
   * <code>repeated .google.protobuf.Value predictions = 1;</code>
   */
  com.google.protobuf.ValueOrBuilder getPredictionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * ID of the Endpoint's DeployedModel that served this prediction.
   * </pre>
   *
   * <code>string deployed_model_id = 2;</code>
   *
   * @return The deployedModelId.
   */
  java.lang.String getDeployedModelId();
  /**
   *
   *
   * <pre>
   * ID of the Endpoint's DeployedModel that served this prediction.
   * </pre>
   *
   * <code>string deployed_model_id = 2;</code>
   *
   * @return The bytes for deployedModelId.
   */
  com.google.protobuf.ByteString getDeployedModelIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Model which is deployed as the
   * DeployedModel that this prediction hits.
   * </pre>
   *
   * <code>
   * string model = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Model which is deployed as the
   * DeployedModel that this prediction hits.
   * </pre>
   *
   * <code>
   * string model = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Output only. The version ID of the Model which is deployed as the
   * DeployedModel that this prediction hits.
   * </pre>
   *
   * <code>string model_version_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The modelVersionId.
   */
  java.lang.String getModelVersionId();
  /**
   *
   *
   * <pre>
   * Output only. The version ID of the Model which is deployed as the
   * DeployedModel that this prediction hits.
   * </pre>
   *
   * <code>string model_version_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for modelVersionId.
   */
  com.google.protobuf.ByteString getModelVersionIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The [display
   * name][google.cloud.aiplatform.v1beta1.Model.display_name] of the Model
   * which is deployed as the DeployedModel that this prediction hits.
   * </pre>
   *
   * <code>string model_display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The modelDisplayName.
   */
  java.lang.String getModelDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The [display
   * name][google.cloud.aiplatform.v1beta1.Model.display_name] of the Model
   * which is deployed as the DeployedModel that this prediction hits.
   * </pre>
   *
   * <code>string model_display_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for modelDisplayName.
   */
  com.google.protobuf.ByteString getModelDisplayNameBytes();
}

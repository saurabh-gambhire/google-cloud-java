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
// source: google/cloud/aiplatform/v1beta1/migration_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface MigrateResourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.MigrateResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Config for migrating Version in ml.googleapis.com to Vertex AI's Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateMlEngineModelVersionConfig migrate_ml_engine_model_version_config = 1;
   * </code>
   *
   * @return Whether the migrateMlEngineModelVersionConfig field is set.
   */
  boolean hasMigrateMlEngineModelVersionConfig();
  /**
   *
   *
   * <pre>
   * Config for migrating Version in ml.googleapis.com to Vertex AI's Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateMlEngineModelVersionConfig migrate_ml_engine_model_version_config = 1;
   * </code>
   *
   * @return The migrateMlEngineModelVersionConfig.
   */
  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateMlEngineModelVersionConfig
      getMigrateMlEngineModelVersionConfig();
  /**
   *
   *
   * <pre>
   * Config for migrating Version in ml.googleapis.com to Vertex AI's Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateMlEngineModelVersionConfig migrate_ml_engine_model_version_config = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest
          .MigrateMlEngineModelVersionConfigOrBuilder
      getMigrateMlEngineModelVersionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for migrating Model in automl.googleapis.com to Vertex AI's
   * Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlModelConfig migrate_automl_model_config = 2;
   * </code>
   *
   * @return Whether the migrateAutomlModelConfig field is set.
   */
  boolean hasMigrateAutomlModelConfig();
  /**
   *
   *
   * <pre>
   * Config for migrating Model in automl.googleapis.com to Vertex AI's
   * Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlModelConfig migrate_automl_model_config = 2;
   * </code>
   *
   * @return The migrateAutomlModelConfig.
   */
  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlModelConfig
      getMigrateAutomlModelConfig();
  /**
   *
   *
   * <pre>
   * Config for migrating Model in automl.googleapis.com to Vertex AI's
   * Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlModelConfig migrate_automl_model_config = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlModelConfigOrBuilder
      getMigrateAutomlModelConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for migrating Dataset in automl.googleapis.com to Vertex AI's
   * Dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlDatasetConfig migrate_automl_dataset_config = 3;
   * </code>
   *
   * @return Whether the migrateAutomlDatasetConfig field is set.
   */
  boolean hasMigrateAutomlDatasetConfig();
  /**
   *
   *
   * <pre>
   * Config for migrating Dataset in automl.googleapis.com to Vertex AI's
   * Dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlDatasetConfig migrate_automl_dataset_config = 3;
   * </code>
   *
   * @return The migrateAutomlDatasetConfig.
   */
  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlDatasetConfig
      getMigrateAutomlDatasetConfig();
  /**
   *
   *
   * <pre>
   * Config for migrating Dataset in automl.googleapis.com to Vertex AI's
   * Dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlDatasetConfig migrate_automl_dataset_config = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateAutomlDatasetConfigOrBuilder
      getMigrateAutomlDatasetConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for migrating Dataset in datalabeling.googleapis.com to
   * Vertex AI's Dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateDataLabelingDatasetConfig migrate_data_labeling_dataset_config = 4;
   * </code>
   *
   * @return Whether the migrateDataLabelingDatasetConfig field is set.
   */
  boolean hasMigrateDataLabelingDatasetConfig();
  /**
   *
   *
   * <pre>
   * Config for migrating Dataset in datalabeling.googleapis.com to
   * Vertex AI's Dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateDataLabelingDatasetConfig migrate_data_labeling_dataset_config = 4;
   * </code>
   *
   * @return The migrateDataLabelingDatasetConfig.
   */
  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateDataLabelingDatasetConfig
      getMigrateDataLabelingDatasetConfig();
  /**
   *
   *
   * <pre>
   * Config for migrating Dataset in datalabeling.googleapis.com to
   * Vertex AI's Dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MigrateResourceRequest.MigrateDataLabelingDatasetConfig migrate_data_labeling_dataset_config = 4;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest
          .MigrateDataLabelingDatasetConfigOrBuilder
      getMigrateDataLabelingDatasetConfigOrBuilder();

  com.google.cloud.aiplatform.v1beta1.MigrateResourceRequest.RequestCase getRequestCase();
}

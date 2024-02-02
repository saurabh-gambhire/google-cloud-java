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
// source: google/cloud/automl/v1beta1/table_spec.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1beta1;

public interface TableSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TableSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the table spec.
   * Form:
   *
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/tableSpecs/{table_spec_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the table spec.
   * Form:
   *
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/tableSpecs/{table_spec_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * column_spec_id of the time column. Only used if the parent dataset's
   * ml_use_column_spec_id is not set. Used to split rows into TRAIN, VALIDATE
   * and TEST sets such that oldest rows go to TRAIN set, newest to TEST, and
   * those in between to VALIDATE.
   * Required type: TIMESTAMP.
   * If both this column and ml_use_column are not set, then ML use of all rows
   * will be assigned by AutoML. NOTE: Updates of this field will instantly
   * affect any other users concurrently working with the dataset.
   * </pre>
   *
   * <code>string time_column_spec_id = 2;</code>
   *
   * @return The timeColumnSpecId.
   */
  java.lang.String getTimeColumnSpecId();
  /**
   *
   *
   * <pre>
   * column_spec_id of the time column. Only used if the parent dataset's
   * ml_use_column_spec_id is not set. Used to split rows into TRAIN, VALIDATE
   * and TEST sets such that oldest rows go to TRAIN set, newest to TEST, and
   * those in between to VALIDATE.
   * Required type: TIMESTAMP.
   * If both this column and ml_use_column are not set, then ML use of all rows
   * will be assigned by AutoML. NOTE: Updates of this field will instantly
   * affect any other users concurrently working with the dataset.
   * </pre>
   *
   * <code>string time_column_spec_id = 2;</code>
   *
   * @return The bytes for timeColumnSpecId.
   */
  com.google.protobuf.ByteString getTimeColumnSpecIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The number of rows (i.e. examples) in the table.
   * </pre>
   *
   * <code>int64 row_count = 3;</code>
   *
   * @return The rowCount.
   */
  long getRowCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of valid rows (i.e. without values that don't match
   * DataType-s of their columns).
   * </pre>
   *
   * <code>int64 valid_row_count = 4;</code>
   *
   * @return The validRowCount.
   */
  long getValidRowCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of columns of the table. That is, the number of
   * child ColumnSpec-s.
   * </pre>
   *
   * <code>int64 column_count = 7;</code>
   *
   * @return The columnCount.
   */
  long getColumnCount();

  /**
   *
   *
   * <pre>
   * Output only. Input configs via which data currently residing in the table
   * had been imported.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.InputConfig input_configs = 5;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.InputConfig> getInputConfigsList();
  /**
   *
   *
   * <pre>
   * Output only. Input configs via which data currently residing in the table
   * had been imported.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.InputConfig input_configs = 5;</code>
   */
  com.google.cloud.automl.v1beta1.InputConfig getInputConfigs(int index);
  /**
   *
   *
   * <pre>
   * Output only. Input configs via which data currently residing in the table
   * had been imported.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.InputConfig input_configs = 5;</code>
   */
  int getInputConfigsCount();
  /**
   *
   *
   * <pre>
   * Output only. Input configs via which data currently residing in the table
   * had been imported.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.InputConfig input_configs = 5;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.InputConfigOrBuilder>
      getInputConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Input configs via which data currently residing in the table
   * had been imported.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.InputConfig input_configs = 5;</code>
   */
  com.google.cloud.automl.v1beta1.InputConfigOrBuilder getInputConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}

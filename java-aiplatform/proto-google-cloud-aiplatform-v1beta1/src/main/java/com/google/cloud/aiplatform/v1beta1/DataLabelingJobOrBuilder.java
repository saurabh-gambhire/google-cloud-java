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
// source: google/cloud/aiplatform/v1beta1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DataLabelingJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DataLabelingJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the DataLabelingJob.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the DataLabelingJob.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The user-defined name of the DataLabelingJob.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * Display name of a DataLabelingJob.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The user-defined name of the DataLabelingJob.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * Display name of a DataLabelingJob.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Dataset resource names. Right now we only support labeling from a
   * single Dataset. Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * repeated string datasets = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the datasets.
   */
  java.util.List<java.lang.String> getDatasetsList();
  /**
   *
   *
   * <pre>
   * Required. Dataset resource names. Right now we only support labeling from a
   * single Dataset. Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * repeated string datasets = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of datasets.
   */
  int getDatasetsCount();
  /**
   *
   *
   * <pre>
   * Required. Dataset resource names. Right now we only support labeling from a
   * single Dataset. Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * repeated string datasets = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The datasets at the given index.
   */
  java.lang.String getDatasets(int index);
  /**
   *
   *
   * <pre>
   * Required. Dataset resource names. Right now we only support labeling from a
   * single Dataset. Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * repeated string datasets = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the datasets at the given index.
   */
  com.google.protobuf.ByteString getDatasetsBytes(int index);

  /**
   *
   *
   * <pre>
   * Labels to assign to annotations generated by this DataLabelingJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 12;</code>
   */
  int getAnnotationLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to assign to annotations generated by this DataLabelingJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 12;</code>
   */
  boolean containsAnnotationLabels(java.lang.String key);
  /** Use {@link #getAnnotationLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotationLabels();
  /**
   *
   *
   * <pre>
   * Labels to assign to annotations generated by this DataLabelingJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 12;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to assign to annotations generated by this DataLabelingJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 12;</code>
   */
  /* nullable */
  java.lang.String getAnnotationLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to assign to annotations generated by this DataLabelingJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 12;</code>
   */
  java.lang.String getAnnotationLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Number of labelers to work on each DataItem.
   * </pre>
   *
   * <code>int32 labeler_count = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The labelerCount.
   */
  int getLabelerCount();

  /**
   *
   *
   * <pre>
   * Required. The Google Cloud Storage location of the instruction pdf. This
   * pdf is shared with labelers, and provides detailed description on how to
   * label DataItems in Datasets.
   * </pre>
   *
   * <code>string instruction_uri = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The instructionUri.
   */
  java.lang.String getInstructionUri();
  /**
   *
   *
   * <pre>
   * Required. The Google Cloud Storage location of the instruction pdf. This
   * pdf is shared with labelers, and provides detailed description on how to
   * label DataItems in Datasets.
   * </pre>
   *
   * <code>string instruction_uri = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for instructionUri.
   */
  com.google.protobuf.ByteString getInstructionUriBytes();

  /**
   *
   *
   * <pre>
   * Required. Points to a YAML file stored on Google Cloud Storage describing
   * the config for a specific type of DataLabelingJob. The schema files that
   * can be used here are found in the
   * https://storage.googleapis.com/google-cloud-aiplatform bucket in the
   * /schema/datalabelingjob/inputs/ folder.
   * </pre>
   *
   * <code>string inputs_schema_uri = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The inputsSchemaUri.
   */
  java.lang.String getInputsSchemaUri();
  /**
   *
   *
   * <pre>
   * Required. Points to a YAML file stored on Google Cloud Storage describing
   * the config for a specific type of DataLabelingJob. The schema files that
   * can be used here are found in the
   * https://storage.googleapis.com/google-cloud-aiplatform bucket in the
   * /schema/datalabelingjob/inputs/ folder.
   * </pre>
   *
   * <code>string inputs_schema_uri = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for inputsSchemaUri.
   */
  com.google.protobuf.ByteString getInputsSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * Required. Input config parameters for the DataLabelingJob.
   * </pre>
   *
   * <code>.google.protobuf.Value inputs = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the inputs field is set.
   */
  boolean hasInputs();
  /**
   *
   *
   * <pre>
   * Required. Input config parameters for the DataLabelingJob.
   * </pre>
   *
   * <code>.google.protobuf.Value inputs = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The inputs.
   */
  com.google.protobuf.Value getInputs();
  /**
   *
   *
   * <pre>
   * Required. Input config parameters for the DataLabelingJob.
   * </pre>
   *
   * <code>.google.protobuf.Value inputs = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ValueOrBuilder getInputsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.JobState state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.JobState getState();

  /**
   *
   *
   * <pre>
   * Output only. Current labeling job progress percentage scaled in interval
   * [0, 100], indicating the percentage of DataItems that has been finished.
   * </pre>
   *
   * <code>int32 labeling_progress = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The labelingProgress.
   */
  int getLabelingProgress();

  /**
   *
   *
   * <pre>
   * Output only. Estimated cost(in US dollars) that the DataLabelingJob has
   * incurred to date.
   * </pre>
   *
   * <code>.google.type.Money current_spend = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the currentSpend field is set.
   */
  boolean hasCurrentSpend();
  /**
   *
   *
   * <pre>
   * Output only. Estimated cost(in US dollars) that the DataLabelingJob has
   * incurred to date.
   * </pre>
   *
   * <code>.google.type.Money current_spend = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The currentSpend.
   */
  com.google.type.Money getCurrentSpend();
  /**
   *
   *
   * <pre>
   * Output only. Estimated cost(in US dollars) that the DataLabelingJob has
   * incurred to date.
   * </pre>
   *
   * <code>.google.type.Money current_spend = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.type.MoneyOrBuilder getCurrentSpendOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataLabelingJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataLabelingJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataLabelingJob was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataLabelingJob was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataLabelingJob was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataLabelingJob was updated most recently.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. DataLabelingJob errors. It is only populated when job's state
   * is `JOB_STATE_FAILED` or `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. DataLabelingJob errors. It is only populated when job's state
   * is `JOB_STATE_FAILED` or `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. DataLabelingJob errors. It is only populated when job's state
   * is `JOB_STATE_FAILED` or `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your DataLabelingJobs.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each DataLabelingJob:
   *
   * * "aiplatform.googleapis.com/schema": output only, its value is the
   *   [inputs_schema][google.cloud.aiplatform.v1beta1.DataLabelingJob.inputs_schema_uri]'s
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your DataLabelingJobs.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each DataLabelingJob:
   *
   * * "aiplatform.googleapis.com/schema": output only, its value is the
   *   [inputs_schema][google.cloud.aiplatform.v1beta1.DataLabelingJob.inputs_schema_uri]'s
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your DataLabelingJobs.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each DataLabelingJob:
   *
   * * "aiplatform.googleapis.com/schema": output only, its value is the
   *   [inputs_schema][google.cloud.aiplatform.v1beta1.DataLabelingJob.inputs_schema_uri]'s
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your DataLabelingJobs.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each DataLabelingJob:
   *
   * * "aiplatform.googleapis.com/schema": output only, its value is the
   *   [inputs_schema][google.cloud.aiplatform.v1beta1.DataLabelingJob.inputs_schema_uri]'s
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your DataLabelingJobs.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for each DataLabelingJob:
   *
   * * "aiplatform.googleapis.com/schema": output only, its value is the
   *   [inputs_schema][google.cloud.aiplatform.v1beta1.DataLabelingJob.inputs_schema_uri]'s
   *   title.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The SpecialistPools' resource names associated with this job.
   * </pre>
   *
   * <code>repeated string specialist_pools = 16;</code>
   *
   * @return A list containing the specialistPools.
   */
  java.util.List<java.lang.String> getSpecialistPoolsList();
  /**
   *
   *
   * <pre>
   * The SpecialistPools' resource names associated with this job.
   * </pre>
   *
   * <code>repeated string specialist_pools = 16;</code>
   *
   * @return The count of specialistPools.
   */
  int getSpecialistPoolsCount();
  /**
   *
   *
   * <pre>
   * The SpecialistPools' resource names associated with this job.
   * </pre>
   *
   * <code>repeated string specialist_pools = 16;</code>
   *
   * @param index The index of the element to return.
   * @return The specialistPools at the given index.
   */
  java.lang.String getSpecialistPools(int index);
  /**
   *
   *
   * <pre>
   * The SpecialistPools' resource names associated with this job.
   * </pre>
   *
   * <code>repeated string specialist_pools = 16;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the specialistPools at the given index.
   */
  com.google.protobuf.ByteString getSpecialistPoolsBytes(int index);

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a DataLabelingJob. If set, this
   * DataLabelingJob will be secured by this key.
   *
   * Note: Annotations created in the DataLabelingJob are associated with
   * the EncryptionSpec of the Dataset they are exported to.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 20;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a DataLabelingJob. If set, this
   * DataLabelingJob will be secured by this key.
   *
   * Note: Annotations created in the DataLabelingJob are associated with
   * the EncryptionSpec of the Dataset they are exported to.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 20;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a DataLabelingJob. If set, this
   * DataLabelingJob will be secured by this key.
   *
   * Note: Annotations created in the DataLabelingJob are associated with
   * the EncryptionSpec of the Dataset they are exported to.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 20;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Parameters that configure the active learning pipeline. Active learning
   * will label the data incrementally via several iterations. For every
   * iteration, it will select a batch of data based on the sampling strategy.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ActiveLearningConfig active_learning_config = 21;</code>
   *
   * @return Whether the activeLearningConfig field is set.
   */
  boolean hasActiveLearningConfig();
  /**
   *
   *
   * <pre>
   * Parameters that configure the active learning pipeline. Active learning
   * will label the data incrementally via several iterations. For every
   * iteration, it will select a batch of data based on the sampling strategy.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ActiveLearningConfig active_learning_config = 21;</code>
   *
   * @return The activeLearningConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ActiveLearningConfig getActiveLearningConfig();
  /**
   *
   *
   * <pre>
   * Parameters that configure the active learning pipeline. Active learning
   * will label the data incrementally via several iterations. For every
   * iteration, it will select a batch of data based on the sampling strategy.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ActiveLearningConfig active_learning_config = 21;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ActiveLearningConfigOrBuilder
      getActiveLearningConfigOrBuilder();
}

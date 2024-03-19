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
// source: google/cloud/config/v1/config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.config.v1;

public interface RevisionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.Revision)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. A blueprint described using Terraform's HashiCorp
   * Configuration Language as a root module.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the terraformBlueprint field is set.
   */
  boolean hasTerraformBlueprint();
  /**
   *
   *
   * <pre>
   * Output only. A blueprint described using Terraform's HashiCorp
   * Configuration Language as a root module.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The terraformBlueprint.
   */
  com.google.cloud.config.v1.TerraformBlueprint getTerraformBlueprint();
  /**
   *
   *
   * <pre>
   * Output only. A blueprint described using Terraform's HashiCorp
   * Configuration Language as a root module.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.TerraformBlueprintOrBuilder getTerraformBlueprintOrBuilder();

  /**
   *
   *
   * <pre>
   * Revision name. Format:
   * `projects/{project}/locations/{location}/deployments/{deployment}/
   * revisions/{revision}`
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
   * Revision name. Format:
   * `projects/{project}/locations/{location}/deployments/{deployment}/
   * revisions/{revision}`
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
   * Output only. Time when the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the revision was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the revision was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the revision was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The action which created this revision
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Revision.Action action = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   *
   *
   * <pre>
   * Output only. The action which created this revision
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Revision.Action action = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The action.
   */
  com.google.cloud.config.v1.Revision.Action getAction();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the revision.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Revision.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the revision.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Revision.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.config.v1.Revision.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Outputs and artifacts from applying a deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ApplyResults apply_results = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the applyResults field is set.
   */
  boolean hasApplyResults();
  /**
   *
   *
   * <pre>
   * Output only. Outputs and artifacts from applying a deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ApplyResults apply_results = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The applyResults.
   */
  com.google.cloud.config.v1.ApplyResults getApplyResults();
  /**
   *
   *
   * <pre>
   * Output only. Outputs and artifacts from applying a deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ApplyResults apply_results = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.ApplyResultsOrBuilder getApplyResultsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Additional info regarding the current state.
   * </pre>
   *
   * <code>string state_detail = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateDetail.
   */
  java.lang.String getStateDetail();
  /**
   *
   *
   * <pre>
   * Output only. Additional info regarding the current state.
   * </pre>
   *
   * <code>string state_detail = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateDetail.
   */
  com.google.protobuf.ByteString getStateDetailBytes();

  /**
   *
   *
   * <pre>
   * Output only. Code describing any errors that may have occurred.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Revision.ErrorCode error_code = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   *
   *
   * <pre>
   * Output only. Code describing any errors that may have occurred.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Revision.ErrorCode error_code = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The errorCode.
   */
  com.google.cloud.config.v1.Revision.ErrorCode getErrorCode();

  /**
   *
   *
   * <pre>
   * Output only. Cloud Build instance UUID associated with this revision.
   * </pre>
   *
   * <code>string build = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The build.
   */
  java.lang.String getBuild();
  /**
   *
   *
   * <pre>
   * Output only. Cloud Build instance UUID associated with this revision.
   * </pre>
   *
   * <code>string build = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for build.
   */
  com.google.protobuf.ByteString getBuildBytes();

  /**
   *
   *
   * <pre>
   * Output only. Location of Revision operation logs in
   * `gs://{bucket}/{object}` format.
   * </pre>
   *
   * <code>string logs = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The logs.
   */
  java.lang.String getLogs();
  /**
   *
   *
   * <pre>
   * Output only. Location of Revision operation logs in
   * `gs://{bucket}/{object}` format.
   * </pre>
   *
   * <code>string logs = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for logs.
   */
  com.google.protobuf.ByteString getLogsBytes();

  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when creating or updating this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.config.v1.TerraformError> getTfErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when creating or updating this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.TerraformError getTfErrors(int index);
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when creating or updating this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTfErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when creating or updating this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.config.v1.TerraformErrorOrBuilder>
      getTfErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when creating or updating this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.TerraformErrorOrBuilder getTfErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Location of Terraform error logs in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string error_logs = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The errorLogs.
   */
  java.lang.String getErrorLogs();
  /**
   *
   *
   * <pre>
   * Output only. Location of Terraform error logs in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string error_logs = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for errorLogs.
   */
  com.google.protobuf.ByteString getErrorLogsBytes();

  /**
   *
   *
   * <pre>
   * Output only. User-specified Service Account (SA) to be used as credential
   * to manage resources. Format:
   * `projects/{projectID}/serviceAccounts/{serviceAccount}`
   * </pre>
   *
   * <code>
   * string service_account = 14 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Output only. User-specified Service Account (SA) to be used as credential
   * to manage resources. Format:
   * `projects/{projectID}/serviceAccounts/{serviceAccount}`
   * </pre>
   *
   * <code>
   * string service_account = 14 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Output only. By default, Infra Manager will return a failure when
   * Terraform encounters a 409 code (resource conflict error) during actuation.
   * If this flag is set to true, Infra Manager will instead
   * attempt to automatically import the resource into the Terraform state (for
   * supported resource types) and continue actuation.
   *
   * Not all resource types are supported, refer to documentation.
   * </pre>
   *
   * <code>bool import_existing_resources = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The importExistingResources.
   */
  boolean getImportExistingResources();

  /**
   *
   *
   * <pre>
   * Output only. The user-specified Cloud Build worker pool resource in which
   * the Cloud Build job will execute. Format:
   * `projects/{project}/locations/{location}/workerPools/{workerPoolId}`.
   * If this field is unspecified, the default Cloud Build worker pool will be
   * used.
   * </pre>
   *
   * <code>
   * string worker_pool = 17 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();
  /**
   *
   *
   * <pre>
   * Output only. The user-specified Cloud Build worker pool resource in which
   * the Cloud Build job will execute. Format:
   * `projects/{project}/locations/{location}/workerPools/{workerPoolId}`.
   * If this field is unspecified, the default Cloud Build worker pool will be
   * used.
   * </pre>
   *
   * <code>
   * string worker_pool = 17 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString getWorkerPoolBytes();

  /**
   *
   *
   * <pre>
   * Output only. The user-specified Terraform version constraint.
   * Example: "=1.3.10".
   * </pre>
   *
   * <code>string tf_version_constraint = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tfVersionConstraint.
   */
  java.lang.String getTfVersionConstraint();
  /**
   *
   *
   * <pre>
   * Output only. The user-specified Terraform version constraint.
   * Example: "=1.3.10".
   * </pre>
   *
   * <code>string tf_version_constraint = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for tfVersionConstraint.
   */
  com.google.protobuf.ByteString getTfVersionConstraintBytes();

  /**
   *
   *
   * <pre>
   * Output only. The version of Terraform used to create the Revision.
   * It is in the format of "Major.Minor.Patch", for example, "1.3.10".
   * </pre>
   *
   * <code>string tf_version = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tfVersion.
   */
  java.lang.String getTfVersion();
  /**
   *
   *
   * <pre>
   * Output only. The version of Terraform used to create the Revision.
   * It is in the format of "Major.Minor.Patch", for example, "1.3.10".
   * </pre>
   *
   * <code>string tf_version = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for tfVersion.
   */
  com.google.protobuf.ByteString getTfVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Cloud Storage path containing quota validation results. This
   * field is set when a user sets Deployment.quota_validation field to ENABLED
   * or ENFORCED. Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string quota_validation_results = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The quotaValidationResults.
   */
  java.lang.String getQuotaValidationResults();
  /**
   *
   *
   * <pre>
   * Output only. Cloud Storage path containing quota validation results. This
   * field is set when a user sets Deployment.quota_validation field to ENABLED
   * or ENFORCED. Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string quota_validation_results = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for quotaValidationResults.
   */
  com.google.protobuf.ByteString getQuotaValidationResultsBytes();

  /**
   *
   *
   * <pre>
   * Optional. Input to control quota checks for resources in terraform
   * configuration files. There are limited resources on which quota validation
   * applies.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.QuotaValidation quota_validation = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for quotaValidation.
   */
  int getQuotaValidationValue();
  /**
   *
   *
   * <pre>
   * Optional. Input to control quota checks for resources in terraform
   * configuration files. There are limited resources on which quota validation
   * applies.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.QuotaValidation quota_validation = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The quotaValidation.
   */
  com.google.cloud.config.v1.QuotaValidation getQuotaValidation();

  com.google.cloud.config.v1.Revision.BlueprintCase getBlueprintCase();
}

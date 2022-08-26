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
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

public interface CompilationResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.CompilationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The compilation result's name.
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
   * Output only. The compilation result's name.
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
   * Immutable. Git commit/tag/branch name at which the repository should be compiled.
   * Must exist in the remote repository.
   * Examples:
   * - a commit SHA: `12ade345`
   * - a tag: `tag1`
   * - a branch name: `branch1`
   * </pre>
   *
   * <code>string git_commitish = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return Whether the gitCommitish field is set.
   */
  boolean hasGitCommitish();
  /**
   *
   *
   * <pre>
   * Immutable. Git commit/tag/branch name at which the repository should be compiled.
   * Must exist in the remote repository.
   * Examples:
   * - a commit SHA: `12ade345`
   * - a tag: `tag1`
   * - a branch name: `branch1`
   * </pre>
   *
   * <code>string git_commitish = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The gitCommitish.
   */
  java.lang.String getGitCommitish();
  /**
   *
   *
   * <pre>
   * Immutable. Git commit/tag/branch name at which the repository should be compiled.
   * Must exist in the remote repository.
   * Examples:
   * - a commit SHA: `12ade345`
   * - a tag: `tag1`
   * - a branch name: `branch1`
   * </pre>
   *
   * <code>string git_commitish = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for gitCommitish.
   */
  com.google.protobuf.ByteString getGitCommitishBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The name of the workspace to compile. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;workspaces/&#42;`.
   * </pre>
   *
   * <code>
   * string workspace = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the workspace field is set.
   */
  boolean hasWorkspace();
  /**
   *
   *
   * <pre>
   * Immutable. The name of the workspace to compile. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;workspaces/&#42;`.
   * </pre>
   *
   * <code>
   * string workspace = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The workspace.
   */
  java.lang.String getWorkspace();
  /**
   *
   *
   * <pre>
   * Immutable. The name of the workspace to compile. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;workspaces/&#42;`.
   * </pre>
   *
   * <code>
   * string workspace = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for workspace.
   */
  com.google.protobuf.ByteString getWorkspaceBytes();

  /**
   *
   *
   * <pre>
   * Immutable. If set, fields of `code_compilation_overrides` override the default
   * compilation settings that are specified in dataform.json.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1alpha2.CompilationResult.CodeCompilationConfig code_compilation_config = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the codeCompilationConfig field is set.
   */
  boolean hasCodeCompilationConfig();
  /**
   *
   *
   * <pre>
   * Immutable. If set, fields of `code_compilation_overrides` override the default
   * compilation settings that are specified in dataform.json.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1alpha2.CompilationResult.CodeCompilationConfig code_compilation_config = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The codeCompilationConfig.
   */
  com.google.cloud.dataform.v1alpha2.CompilationResult.CodeCompilationConfig
      getCodeCompilationConfig();
  /**
   *
   *
   * <pre>
   * Immutable. If set, fields of `code_compilation_overrides` override the default
   * compilation settings that are specified in dataform.json.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1alpha2.CompilationResult.CodeCompilationConfig code_compilation_config = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResult.CodeCompilationConfigOrBuilder
      getCodeCompilationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The version of `&#64;dataform/core` that was used for compilation.
   * </pre>
   *
   * <code>string dataform_core_version = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The dataformCoreVersion.
   */
  java.lang.String getDataformCoreVersion();
  /**
   *
   *
   * <pre>
   * Output only. The version of `&#64;dataform/core` that was used for compilation.
   * </pre>
   *
   * <code>string dataform_core_version = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for dataformCoreVersion.
   */
  com.google.protobuf.ByteString getDataformCoreVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during project compilation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResult.CompilationError compilation_errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataform.v1alpha2.CompilationResult.CompilationError>
      getCompilationErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during project compilation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResult.CompilationError compilation_errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResult.CompilationError getCompilationErrors(
      int index);
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during project compilation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResult.CompilationError compilation_errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getCompilationErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during project compilation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResult.CompilationError compilation_errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.dataform.v1alpha2.CompilationResult.CompilationErrorOrBuilder>
      getCompilationErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered during project compilation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1alpha2.CompilationResult.CompilationError compilation_errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataform.v1alpha2.CompilationResult.CompilationErrorOrBuilder
      getCompilationErrorsOrBuilder(int index);

  public com.google.cloud.dataform.v1alpha2.CompilationResult.SourceCase getSourceCase();
}
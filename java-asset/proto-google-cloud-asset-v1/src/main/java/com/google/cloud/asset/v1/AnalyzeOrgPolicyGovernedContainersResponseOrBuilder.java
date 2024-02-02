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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1;

public interface AnalyzeOrgPolicyGovernedContainersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of the analyzed governed containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.GovernedContainer governed_containers = 1;
   * </code>
   */
  java.util.List<
          com.google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.GovernedContainer>
      getGovernedContainersList();
  /**
   *
   *
   * <pre>
   * The list of the analyzed governed containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.GovernedContainer governed_containers = 1;
   * </code>
   */
  com.google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.GovernedContainer
      getGovernedContainers(int index);
  /**
   *
   *
   * <pre>
   * The list of the analyzed governed containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.GovernedContainer governed_containers = 1;
   * </code>
   */
  int getGovernedContainersCount();
  /**
   *
   *
   * <pre>
   * The list of the analyzed governed containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.GovernedContainer governed_containers = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse
                  .GovernedContainerOrBuilder>
      getGovernedContainersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of the analyzed governed containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.GovernedContainer governed_containers = 1;
   * </code>
   */
  com.google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.GovernedContainerOrBuilder
      getGovernedContainersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The definition of the constraint in the request.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint constraint = 2;</code>
   *
   * @return Whether the constraint field is set.
   */
  boolean hasConstraint();
  /**
   *
   *
   * <pre>
   * The definition of the constraint in the request.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint constraint = 2;</code>
   *
   * @return The constraint.
   */
  com.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint getConstraint();
  /**
   *
   *
   * <pre>
   * The definition of the constraint in the request.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint constraint = 2;</code>
   */
  com.google.cloud.asset.v1.AnalyzerOrgPolicyConstraintOrBuilder getConstraintOrBuilder();

  /**
   *
   *
   * <pre>
   * The page token to fetch the next page for
   * [AnalyzeOrgPolicyGovernedContainersResponse.governed_containers][google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.governed_containers].
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The page token to fetch the next page for
   * [AnalyzeOrgPolicyGovernedContainersResponse.governed_containers][google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.governed_containers].
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}

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
// source: google/cloud/asset/v1p1beta1/assets.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1p1beta1;

public interface IamPolicySearchResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p1beta1.IamPolicySearchResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The
   * [full resource
   * name](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * of the resource associated with this IAM policy.
   * </pre>
   *
   * <code>string resource = 1;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * The
   * [full resource
   * name](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * of the resource associated with this IAM policy.
   * </pre>
   *
   * <code>string resource = 1;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The project that the associated Google Cloud resource belongs to, in the
   * form of `projects/{project_number}`. If an IAM policy is set on a resource
   * -- such as a Compute Engine instance or a Cloud Storage bucket -- the
   * project field will indicate the project that contains the resource. If an
   * IAM policy is set on a folder or orgnization, the project field will be
   * empty.
   * </pre>
   *
   * <code>string project = 3;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The project that the associated Google Cloud resource belongs to, in the
   * form of `projects/{project_number}`. If an IAM policy is set on a resource
   * -- such as a Compute Engine instance or a Cloud Storage bucket -- the
   * project field will indicate the project that contains the resource. If an
   * IAM policy is set on a folder or orgnization, the project field will be
   * empty.
   * </pre>
   *
   * <code>string project = 3;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The IAM policy attached to the specified resource. Note that the original
   * IAM policy can contain multiple bindings. This only contains the bindings
   * that match the given query. For queries that don't contain a constraint on
   * policies (e.g. an empty query), this contains all the bindings.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 4;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * The IAM policy attached to the specified resource. Note that the original
   * IAM policy can contain multiple bindings. This only contains the bindings
   * that match the given query. For queries that don't contain a constraint on
   * policies (e.g. an empty query), this contains all the bindings.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 4;</code>
   *
   * @return The policy.
   */
  com.google.iam.v1.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * The IAM policy attached to the specified resource. Note that the original
   * IAM policy can contain multiple bindings. This only contains the bindings
   * that match the given query. For queries that don't contain a constraint on
   * policies (e.g. an empty query), this contains all the bindings.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 4;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Explanation about the IAM policy search result. It contains additional
   * information that explains why the search result matches the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p1beta1.IamPolicySearchResult.Explanation explanation = 5;</code>
   *
   * @return Whether the explanation field is set.
   */
  boolean hasExplanation();
  /**
   *
   *
   * <pre>
   * Explanation about the IAM policy search result. It contains additional
   * information that explains why the search result matches the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p1beta1.IamPolicySearchResult.Explanation explanation = 5;</code>
   *
   * @return The explanation.
   */
  com.google.cloud.asset.v1p1beta1.IamPolicySearchResult.Explanation getExplanation();
  /**
   *
   *
   * <pre>
   * Explanation about the IAM policy search result. It contains additional
   * information that explains why the search result matches the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p1beta1.IamPolicySearchResult.Explanation explanation = 5;</code>
   */
  com.google.cloud.asset.v1p1beta1.IamPolicySearchResult.ExplanationOrBuilder
      getExplanationOrBuilder();
}

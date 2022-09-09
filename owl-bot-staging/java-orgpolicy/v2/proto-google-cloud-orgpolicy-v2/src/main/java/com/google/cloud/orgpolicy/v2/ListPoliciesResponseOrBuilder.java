// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

package com.google.cloud.orgpolicy.v2;

public interface ListPoliciesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orgpolicy.v2.ListPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All `Policies` that exist on the resource. It will be empty if no
   * `Policies` are set.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Policy policies = 1;</code>
   */
  java.util.List<com.google.cloud.orgpolicy.v2.Policy> 
      getPoliciesList();
  /**
   * <pre>
   * All `Policies` that exist on the resource. It will be empty if no
   * `Policies` are set.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Policy policies = 1;</code>
   */
  com.google.cloud.orgpolicy.v2.Policy getPolicies(int index);
  /**
   * <pre>
   * All `Policies` that exist on the resource. It will be empty if no
   * `Policies` are set.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Policy policies = 1;</code>
   */
  int getPoliciesCount();
  /**
   * <pre>
   * All `Policies` that exist on the resource. It will be empty if no
   * `Policies` are set.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Policy policies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.orgpolicy.v2.PolicyOrBuilder> 
      getPoliciesOrBuilderList();
  /**
   * <pre>
   * All `Policies` that exist on the resource. It will be empty if no
   * `Policies` are set.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Policy policies = 1;</code>
   */
  com.google.cloud.orgpolicy.v2.PolicyOrBuilder getPoliciesOrBuilder(
      int index);

  /**
   * <pre>
   * Page token used to retrieve the next page. This is currently not used, but
   * the server may at any point start supplying a valid token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Page token used to retrieve the next page. This is currently not used, but
   * the server may at any point start supplying a valid token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
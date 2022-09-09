// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

public interface ListApiDeploymentRevisionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.ListApiDeploymentRevisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  java.util.List<com.google.cloud.apigeeregistry.v1.ApiDeployment> 
      getApiDeploymentsList();
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  com.google.cloud.apigeeregistry.v1.ApiDeployment getApiDeployments(int index);
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  int getApiDeploymentsCount();
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder> 
      getApiDeploymentsOrBuilderList();
  /**
   * <pre>
   * The revisions of the deployment.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiDeployment api_deployments = 1;</code>
   */
  com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder getApiDeploymentsOrBuilder(
      int index);

  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
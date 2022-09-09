// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListCustomJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListCustomJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.CustomJob> 
      getCustomJobsList();
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.CustomJob getCustomJobs(int index);
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  int getCustomJobsCount();
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.CustomJobOrBuilder> 
      getCustomJobsOrBuilderList();
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.CustomJobOrBuilder getCustomJobsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
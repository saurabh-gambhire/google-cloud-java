// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/workflows/executions/v1beta/executions.proto

package com.google.cloud.workflows.executions.v1beta;

public interface CancelExecutionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workflows.executions.v1beta.CancelExecutionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the execution to be cancelled.
   * Format:
   * projects/{project}/locations/{location}/workflows/{workflow}/executions/{execution}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the execution to be cancelled.
   * Format:
   * projects/{project}/locations/{location}/workflows/{workflow}/executions/{execution}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
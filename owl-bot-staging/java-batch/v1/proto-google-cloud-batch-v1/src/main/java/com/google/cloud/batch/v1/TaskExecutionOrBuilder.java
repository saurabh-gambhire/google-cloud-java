// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/task.proto

package com.google.cloud.batch.v1;

public interface TaskExecutionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.TaskExecution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * When task is completed as the status of FAILED or SUCCEEDED,
   * exit code is for one task execution result, default is 0 as success.
   * </pre>
   *
   * <code>int32 exit_code = 1;</code>
   * @return The exitCode.
   */
  int getExitCode();
}
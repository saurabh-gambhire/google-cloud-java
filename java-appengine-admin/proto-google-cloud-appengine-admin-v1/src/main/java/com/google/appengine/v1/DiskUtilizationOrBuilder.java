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
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

public interface DiskUtilizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.DiskUtilization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Target bytes written per second.
   * </pre>
   *
   * <code>int32 target_write_bytes_per_second = 14;</code>
   *
   * @return The targetWriteBytesPerSecond.
   */
  int getTargetWriteBytesPerSecond();

  /**
   *
   *
   * <pre>
   * Target ops written per second.
   * </pre>
   *
   * <code>int32 target_write_ops_per_second = 15;</code>
   *
   * @return The targetWriteOpsPerSecond.
   */
  int getTargetWriteOpsPerSecond();

  /**
   *
   *
   * <pre>
   * Target bytes read per second.
   * </pre>
   *
   * <code>int32 target_read_bytes_per_second = 16;</code>
   *
   * @return The targetReadBytesPerSecond.
   */
  int getTargetReadBytesPerSecond();

  /**
   *
   *
   * <pre>
   * Target ops read per seconds.
   * </pre>
   *
   * <code>int32 target_read_ops_per_second = 17;</code>
   *
   * @return The targetReadOpsPerSecond.
   */
  int getTargetReadOpsPerSecond();
}

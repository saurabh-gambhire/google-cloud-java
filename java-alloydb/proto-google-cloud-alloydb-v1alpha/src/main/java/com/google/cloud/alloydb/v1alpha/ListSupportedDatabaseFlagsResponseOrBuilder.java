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
// source: google/cloud/alloydb/v1alpha/service.proto

package com.google.cloud.alloydb.v1alpha;

public interface ListSupportedDatabaseFlagsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.ListSupportedDatabaseFlagsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of SupportedDatabaseFlags.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag supported_database_flags = 1;
   * </code>
   */
  java.util.List<com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag>
      getSupportedDatabaseFlagsList();
  /**
   *
   *
   * <pre>
   * The list of SupportedDatabaseFlags.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag supported_database_flags = 1;
   * </code>
   */
  com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlag getSupportedDatabaseFlags(int index);
  /**
   *
   *
   * <pre>
   * The list of SupportedDatabaseFlags.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag supported_database_flags = 1;
   * </code>
   */
  int getSupportedDatabaseFlagsCount();
  /**
   *
   *
   * <pre>
   * The list of SupportedDatabaseFlags.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag supported_database_flags = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlagOrBuilder>
      getSupportedDatabaseFlagsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of SupportedDatabaseFlags.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1alpha.SupportedDatabaseFlag supported_database_flags = 1;
   * </code>
   */
  com.google.cloud.alloydb.v1alpha.SupportedDatabaseFlagOrBuilder
      getSupportedDatabaseFlagsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}

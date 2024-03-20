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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface SearchEntriesResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.SearchEntriesResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the entry.
   * </pre>
   *
   * <code>string entry = 1 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.entry is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1250
   * @return The entry.
   */
  @java.lang.Deprecated
  java.lang.String getEntry();
  /**
   *
   *
   * <pre>
   * Resource name of the entry.
   * </pre>
   *
   * <code>string entry = 1 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.entry is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1250
   * @return The bytes for entry.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getEntryBytes();

  /**
   *
   *
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.display_name is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1253
   * @return The displayName.
   */
  @java.lang.Deprecated
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.display_name is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1253
   * @return The bytes for displayName.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The entry type.
   * </pre>
   *
   * <code>string entry_type = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.entry_type is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1256
   * @return The entryType.
   */
  @java.lang.Deprecated
  java.lang.String getEntryType();
  /**
   *
   *
   * <pre>
   * The entry type.
   * </pre>
   *
   * <code>string entry_type = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.entry_type is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1256
   * @return The bytes for entryType.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getEntryTypeBytes();

  /**
   *
   *
   * <pre>
   * The last modification timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 4 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.modify_time is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1259
   * @return Whether the modifyTime field is set.
   */
  @java.lang.Deprecated
  boolean hasModifyTime();
  /**
   *
   *
   * <pre>
   * The last modification timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 4 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.modify_time is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1259
   * @return The modifyTime.
   */
  @java.lang.Deprecated
  com.google.protobuf.Timestamp getModifyTime();
  /**
   *
   *
   * <pre>
   * The last modification timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.TimestampOrBuilder getModifyTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Fully qualified name.
   * </pre>
   *
   * <code>string fully_qualified_name = 5 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.fully_qualified_name is deprecated.
   *     See google/cloud/dataplex/v1/catalog.proto;l=1262
   * @return The fullyQualifiedName.
   */
  @java.lang.Deprecated
  java.lang.String getFullyQualifiedName();
  /**
   *
   *
   * <pre>
   * Fully qualified name.
   * </pre>
   *
   * <code>string fully_qualified_name = 5 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.fully_qualified_name is deprecated.
   *     See google/cloud/dataplex/v1/catalog.proto;l=1262
   * @return The bytes for fullyQualifiedName.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getFullyQualifiedNameBytes();

  /**
   *
   *
   * <pre>
   * Entry description.
   * </pre>
   *
   * <code>string description = 6 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.description is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1265
   * @return The description.
   */
  @java.lang.Deprecated
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Entry description.
   * </pre>
   *
   * <code>string description = 6 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.description is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1265
   * @return The bytes for description.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Relative resource name.
   * </pre>
   *
   * <code>string relative_resource = 7 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.relative_resource is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1268
   * @return The relativeResource.
   */
  @java.lang.Deprecated
  java.lang.String getRelativeResource();
  /**
   *
   *
   * <pre>
   * Relative resource name.
   * </pre>
   *
   * <code>string relative_resource = 7 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dataplex.v1.SearchEntriesResult.relative_resource is deprecated. See
   *     google/cloud/dataplex/v1/catalog.proto;l=1268
   * @return The bytes for relativeResource.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getRelativeResourceBytes();

  /**
   *
   *
   * <pre>
   * Linked resource name.
   * </pre>
   *
   * <code>string linked_resource = 8;</code>
   *
   * @return The linkedResource.
   */
  java.lang.String getLinkedResource();
  /**
   *
   *
   * <pre>
   * Linked resource name.
   * </pre>
   *
   * <code>string linked_resource = 8;</code>
   *
   * @return The bytes for linkedResource.
   */
  com.google.protobuf.ByteString getLinkedResourceBytes();

  /**
   *
   *
   * <pre>
   * Entry format of the result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry dataplex_entry = 9;</code>
   *
   * @return Whether the dataplexEntry field is set.
   */
  boolean hasDataplexEntry();
  /**
   *
   *
   * <pre>
   * Entry format of the result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry dataplex_entry = 9;</code>
   *
   * @return The dataplexEntry.
   */
  com.google.cloud.dataplex.v1.Entry getDataplexEntry();
  /**
   *
   *
   * <pre>
   * Entry format of the result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry dataplex_entry = 9;</code>
   */
  com.google.cloud.dataplex.v1.EntryOrBuilder getDataplexEntryOrBuilder();

  /**
   *
   *
   * <pre>
   * Snippets.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.SearchEntriesResult.Snippets snippets = 12;</code>
   *
   * @return Whether the snippets field is set.
   */
  boolean hasSnippets();
  /**
   *
   *
   * <pre>
   * Snippets.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.SearchEntriesResult.Snippets snippets = 12;</code>
   *
   * @return The snippets.
   */
  com.google.cloud.dataplex.v1.SearchEntriesResult.Snippets getSnippets();
  /**
   *
   *
   * <pre>
   * Snippets.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.SearchEntriesResult.Snippets snippets = 12;</code>
   */
  com.google.cloud.dataplex.v1.SearchEntriesResult.SnippetsOrBuilder getSnippetsOrBuilder();
}

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
// source: google/api/apikeys/v2/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.api.apikeys.v2;

public interface KeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.apikeys.v2.Key)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the key.
   * The `name` has the form:
   * `projects/&lt;PROJECT_NUMBER&gt;/locations/global/keys/&lt;KEY_ID&gt;`.
   * For example:
   * `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2`
   *
   * NOTE: Key is a global resource; hence the only supported value for
   * location is `global`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the key.
   * The `name` has the form:
   * `projects/&lt;PROJECT_NUMBER&gt;/locations/global/keys/&lt;KEY_ID&gt;`.
   * For example:
   * `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2`
   *
   * NOTE: Key is a global resource; hence the only supported value for
   * location is `global`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Unique id in UUID4 format.
   * </pre>
   *
   * <code>string uid = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Unique id in UUID4 format.
   * </pre>
   *
   * <code>string uid = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Human-readable display name of this key that you can modify.
   * The maximum length is 63 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human-readable display name of this key that you can modify.
   * The maximum length is 63 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. An encrypted and signed value held by this key.
   * This field can be accessed only through the `GetKeyString` method.
   * </pre>
   *
   * <code>string key_string = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The keyString.
   */
  java.lang.String getKeyString();
  /**
   *
   *
   * <pre>
   * Output only. An encrypted and signed value held by this key.
   * This field can be accessed only through the `GetKeyString` method.
   * </pre>
   *
   * <code>string key_string = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for keyString.
   */
  com.google.protobuf.ByteString getKeyStringBytes();

  /**
   *
   *
   * <pre>
   * Output only. A timestamp identifying the time this key was originally
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. A timestamp identifying the time this key was originally
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. A timestamp identifying the time this key was originally
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A timestamp identifying the time this key was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. A timestamp identifying the time this key was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. A timestamp identifying the time this key was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A timestamp when this key was deleted. If the resource is not
   * deleted, this must be empty.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. A timestamp when this key was deleted. If the resource is not
   * deleted, this must be empty.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. A timestamp when this key was deleted. If the resource is not
   * deleted, this must be empty.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Annotations is an unstructured key-value map stored with a policy that
   * may be set by external tools to store and retrieve arbitrary metadata.
   * They are not queryable and should be preserved when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations is an unstructured key-value map stored with a policy that
   * may be set by external tools to store and retrieve arbitrary metadata.
   * They are not queryable and should be preserved when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Annotations is an unstructured key-value map stored with a policy that
   * may be set by external tools to store and retrieve arbitrary metadata.
   * They are not queryable and should be preserved when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Annotations is an unstructured key-value map stored with a policy that
   * may be set by external tools to store and retrieve arbitrary metadata.
   * They are not queryable and should be preserved when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Annotations is an unstructured key-value map stored with a policy that
   * may be set by external tools to store and retrieve arbitrary metadata.
   * They are not queryable and should be preserved when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Key restrictions.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Restrictions restrictions = 9;</code>
   *
   * @return Whether the restrictions field is set.
   */
  boolean hasRestrictions();
  /**
   *
   *
   * <pre>
   * Key restrictions.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Restrictions restrictions = 9;</code>
   *
   * @return The restrictions.
   */
  com.google.api.apikeys.v2.Restrictions getRestrictions();
  /**
   *
   *
   * <pre>
   * Key restrictions.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Restrictions restrictions = 9;</code>
   */
  com.google.api.apikeys.v2.RestrictionsOrBuilder getRestrictionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A checksum computed by the server based on the current value
   * of the Key resource. This may be sent on update and delete requests to
   * ensure the client has an up-to-date value before proceeding. See
   * https://google.aip.dev/154.
   * </pre>
   *
   * <code>string etag = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. A checksum computed by the server based on the current value
   * of the Key resource. This may be sent on update and delete requests to
   * ensure the client has an up-to-date value before proceeding. See
   * https://google.aip.dev/154.
   * </pre>
   *
   * <code>string etag = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}

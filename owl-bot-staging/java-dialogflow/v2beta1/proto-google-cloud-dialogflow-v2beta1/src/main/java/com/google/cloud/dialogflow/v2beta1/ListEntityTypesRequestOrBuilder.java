// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ListEntityTypesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ListEntityTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to list all entity types from.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The agent to list all entity types from.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Optional. The maximum number of items to return in a single page. By
   * default 100 and at most 1000.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
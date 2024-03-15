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
// source: google/chat/v1/annotation.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public interface AnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.Annotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of this annotation.
   * </pre>
   *
   * <code>.google.chat.v1.AnnotationType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of this annotation.
   * </pre>
   *
   * <code>.google.chat.v1.AnnotationType type = 1;</code>
   *
   * @return The type.
   */
  com.google.chat.v1.AnnotationType getType();

  /**
   *
   *
   * <pre>
   * Start index (0-based, inclusive) in the plain-text message body this
   * annotation corresponds to.
   * </pre>
   *
   * <code>optional int32 start_index = 2;</code>
   *
   * @return Whether the startIndex field is set.
   */
  boolean hasStartIndex();
  /**
   *
   *
   * <pre>
   * Start index (0-based, inclusive) in the plain-text message body this
   * annotation corresponds to.
   * </pre>
   *
   * <code>optional int32 start_index = 2;</code>
   *
   * @return The startIndex.
   */
  int getStartIndex();

  /**
   *
   *
   * <pre>
   * Length of the substring in the plain-text message body this annotation
   * corresponds to.
   * </pre>
   *
   * <code>int32 length = 3;</code>
   *
   * @return The length.
   */
  int getLength();

  /**
   *
   *
   * <pre>
   * The metadata of user mention.
   * </pre>
   *
   * <code>.google.chat.v1.UserMentionMetadata user_mention = 4;</code>
   *
   * @return Whether the userMention field is set.
   */
  boolean hasUserMention();
  /**
   *
   *
   * <pre>
   * The metadata of user mention.
   * </pre>
   *
   * <code>.google.chat.v1.UserMentionMetadata user_mention = 4;</code>
   *
   * @return The userMention.
   */
  com.google.chat.v1.UserMentionMetadata getUserMention();
  /**
   *
   *
   * <pre>
   * The metadata of user mention.
   * </pre>
   *
   * <code>.google.chat.v1.UserMentionMetadata user_mention = 4;</code>
   */
  com.google.chat.v1.UserMentionMetadataOrBuilder getUserMentionOrBuilder();

  /**
   *
   *
   * <pre>
   * The metadata for a slash command.
   * </pre>
   *
   * <code>.google.chat.v1.SlashCommandMetadata slash_command = 5;</code>
   *
   * @return Whether the slashCommand field is set.
   */
  boolean hasSlashCommand();
  /**
   *
   *
   * <pre>
   * The metadata for a slash command.
   * </pre>
   *
   * <code>.google.chat.v1.SlashCommandMetadata slash_command = 5;</code>
   *
   * @return The slashCommand.
   */
  com.google.chat.v1.SlashCommandMetadata getSlashCommand();
  /**
   *
   *
   * <pre>
   * The metadata for a slash command.
   * </pre>
   *
   * <code>.google.chat.v1.SlashCommandMetadata slash_command = 5;</code>
   */
  com.google.chat.v1.SlashCommandMetadataOrBuilder getSlashCommandOrBuilder();

  /**
   *
   *
   * <pre>
   * The metadata for a rich link.
   * </pre>
   *
   * <code>.google.chat.v1.RichLinkMetadata rich_link_metadata = 6;</code>
   *
   * @return Whether the richLinkMetadata field is set.
   */
  boolean hasRichLinkMetadata();
  /**
   *
   *
   * <pre>
   * The metadata for a rich link.
   * </pre>
   *
   * <code>.google.chat.v1.RichLinkMetadata rich_link_metadata = 6;</code>
   *
   * @return The richLinkMetadata.
   */
  com.google.chat.v1.RichLinkMetadata getRichLinkMetadata();
  /**
   *
   *
   * <pre>
   * The metadata for a rich link.
   * </pre>
   *
   * <code>.google.chat.v1.RichLinkMetadata rich_link_metadata = 6;</code>
   */
  com.google.chat.v1.RichLinkMetadataOrBuilder getRichLinkMetadataOrBuilder();

  com.google.chat.v1.Annotation.MetadataCase getMetadataCase();
}

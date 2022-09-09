// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface DeleteGlossaryMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.DeleteGlossaryMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the glossary that is being deleted.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the glossary that is being deleted.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The current state of the glossary deletion operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.DeleteGlossaryMetadata.State state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The current state of the glossary deletion operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.DeleteGlossaryMetadata.State state = 2;</code>
   * @return The state.
   */
  com.google.cloud.translate.v3.DeleteGlossaryMetadata.State getState();

  /**
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   * @return Whether the submitTime field is set.
   */
  boolean hasSubmitTime();
  /**
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   * @return The submitTime.
   */
  com.google.protobuf.Timestamp getSubmitTime();
  /**
   * <pre>
   * The time when the operation was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();
}
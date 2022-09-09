// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/text.proto

package com.google.cloud.automl.v1;

public interface TextClassificationModelMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.TextClassificationModelMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Classification type of the dataset used to train this model.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ClassificationType classification_type = 3;</code>
   * @return The enum numeric value on the wire for classificationType.
   */
  int getClassificationTypeValue();
  /**
   * <pre>
   * Output only. Classification type of the dataset used to train this model.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ClassificationType classification_type = 3;</code>
   * @return The classificationType.
   */
  com.google.cloud.automl.v1.ClassificationType getClassificationType();
}
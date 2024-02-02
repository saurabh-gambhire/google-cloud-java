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
// source: google/cloud/automl/v1/translation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Model metadata that is specific to translation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.TranslationModelMetadata}
 */
public final class TranslationModelMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.TranslationModelMetadata)
    TranslationModelMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TranslationModelMetadata.newBuilder() to construct.
  private TranslationModelMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TranslationModelMetadata() {
    baseModel_ = "";
    sourceLanguageCode_ = "";
    targetLanguageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TranslationModelMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1.TranslationProto
        .internal_static_google_cloud_automl_v1_TranslationModelMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.TranslationProto
        .internal_static_google_cloud_automl_v1_TranslationModelMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.TranslationModelMetadata.class,
            com.google.cloud.automl.v1.TranslationModelMetadata.Builder.class);
  }

  public static final int BASE_MODEL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object baseModel_ = "";
  /**
   *
   *
   * <pre>
   * The resource name of the model to use as a baseline to train the custom
   * model. If unset, we use the default base model provided by Google
   * Translate. Format:
   * `projects/{project_id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string base_model = 1;</code>
   *
   * @return The baseModel.
   */
  @java.lang.Override
  public java.lang.String getBaseModel() {
    java.lang.Object ref = baseModel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseModel_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the model to use as a baseline to train the custom
   * model. If unset, we use the default base model provided by Google
   * Translate. Format:
   * `projects/{project_id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string base_model = 1;</code>
   *
   * @return The bytes for baseModel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBaseModelBytes() {
    java.lang.Object ref = baseModel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      baseModel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_LANGUAGE_CODE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceLanguageCode_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Inferred from the dataset.
   * The source language (The BCP-47 language code) that is used for training.
   * </pre>
   *
   * <code>string source_language_code = 2;</code>
   *
   * @return The sourceLanguageCode.
   */
  @java.lang.Override
  public java.lang.String getSourceLanguageCode() {
    java.lang.Object ref = sourceLanguageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceLanguageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Inferred from the dataset.
   * The source language (The BCP-47 language code) that is used for training.
   * </pre>
   *
   * <code>string source_language_code = 2;</code>
   *
   * @return The bytes for sourceLanguageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceLanguageCodeBytes() {
    java.lang.Object ref = sourceLanguageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceLanguageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_LANGUAGE_CODE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object targetLanguageCode_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The target language (The BCP-47 language code) that is used
   * for training.
   * </pre>
   *
   * <code>string target_language_code = 3;</code>
   *
   * @return The targetLanguageCode.
   */
  @java.lang.Override
  public java.lang.String getTargetLanguageCode() {
    java.lang.Object ref = targetLanguageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetLanguageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The target language (The BCP-47 language code) that is used
   * for training.
   * </pre>
   *
   * <code>string target_language_code = 3;</code>
   *
   * @return The bytes for targetLanguageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTargetLanguageCodeBytes() {
    java.lang.Object ref = targetLanguageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      targetLanguageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseModel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, baseModel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceLanguageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sourceLanguageCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetLanguageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, targetLanguageCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseModel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, baseModel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceLanguageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sourceLanguageCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetLanguageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, targetLanguageCode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.automl.v1.TranslationModelMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.TranslationModelMetadata other =
        (com.google.cloud.automl.v1.TranslationModelMetadata) obj;

    if (!getBaseModel().equals(other.getBaseModel())) return false;
    if (!getSourceLanguageCode().equals(other.getSourceLanguageCode())) return false;
    if (!getTargetLanguageCode().equals(other.getTargetLanguageCode())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BASE_MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getBaseModel().hashCode();
    hash = (37 * hash) + SOURCE_LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getSourceLanguageCode().hashCode();
    hash = (37 * hash) + TARGET_LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getTargetLanguageCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.automl.v1.TranslationModelMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Model metadata that is specific to translation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.TranslationModelMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.TranslationModelMetadata)
      com.google.cloud.automl.v1.TranslationModelMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.TranslationProto
          .internal_static_google_cloud_automl_v1_TranslationModelMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.TranslationProto
          .internal_static_google_cloud_automl_v1_TranslationModelMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.TranslationModelMetadata.class,
              com.google.cloud.automl.v1.TranslationModelMetadata.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.TranslationModelMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      baseModel_ = "";
      sourceLanguageCode_ = "";
      targetLanguageCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.TranslationProto
          .internal_static_google_cloud_automl_v1_TranslationModelMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TranslationModelMetadata getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.TranslationModelMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TranslationModelMetadata build() {
      com.google.cloud.automl.v1.TranslationModelMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TranslationModelMetadata buildPartial() {
      com.google.cloud.automl.v1.TranslationModelMetadata result =
          new com.google.cloud.automl.v1.TranslationModelMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.automl.v1.TranslationModelMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.baseModel_ = baseModel_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sourceLanguageCode_ = sourceLanguageCode_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.targetLanguageCode_ = targetLanguageCode_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1.TranslationModelMetadata) {
        return mergeFrom((com.google.cloud.automl.v1.TranslationModelMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.TranslationModelMetadata other) {
      if (other == com.google.cloud.automl.v1.TranslationModelMetadata.getDefaultInstance())
        return this;
      if (!other.getBaseModel().isEmpty()) {
        baseModel_ = other.baseModel_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSourceLanguageCode().isEmpty()) {
        sourceLanguageCode_ = other.sourceLanguageCode_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTargetLanguageCode().isEmpty()) {
        targetLanguageCode_ = other.targetLanguageCode_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                baseModel_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                sourceLanguageCode_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                targetLanguageCode_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object baseModel_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the model to use as a baseline to train the custom
     * model. If unset, we use the default base model provided by Google
     * Translate. Format:
     * `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string base_model = 1;</code>
     *
     * @return The baseModel.
     */
    public java.lang.String getBaseModel() {
      java.lang.Object ref = baseModel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseModel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the model to use as a baseline to train the custom
     * model. If unset, we use the default base model provided by Google
     * Translate. Format:
     * `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string base_model = 1;</code>
     *
     * @return The bytes for baseModel.
     */
    public com.google.protobuf.ByteString getBaseModelBytes() {
      java.lang.Object ref = baseModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        baseModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the model to use as a baseline to train the custom
     * model. If unset, we use the default base model provided by Google
     * Translate. Format:
     * `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string base_model = 1;</code>
     *
     * @param value The baseModel to set.
     * @return This builder for chaining.
     */
    public Builder setBaseModel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      baseModel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the model to use as a baseline to train the custom
     * model. If unset, we use the default base model provided by Google
     * Translate. Format:
     * `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string base_model = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBaseModel() {
      baseModel_ = getDefaultInstance().getBaseModel();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the model to use as a baseline to train the custom
     * model. If unset, we use the default base model provided by Google
     * Translate. Format:
     * `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string base_model = 1;</code>
     *
     * @param value The bytes for baseModel to set.
     * @return This builder for chaining.
     */
    public Builder setBaseModelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      baseModel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object sourceLanguageCode_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Inferred from the dataset.
     * The source language (The BCP-47 language code) that is used for training.
     * </pre>
     *
     * <code>string source_language_code = 2;</code>
     *
     * @return The sourceLanguageCode.
     */
    public java.lang.String getSourceLanguageCode() {
      java.lang.Object ref = sourceLanguageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceLanguageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Inferred from the dataset.
     * The source language (The BCP-47 language code) that is used for training.
     * </pre>
     *
     * <code>string source_language_code = 2;</code>
     *
     * @return The bytes for sourceLanguageCode.
     */
    public com.google.protobuf.ByteString getSourceLanguageCodeBytes() {
      java.lang.Object ref = sourceLanguageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceLanguageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Inferred from the dataset.
     * The source language (The BCP-47 language code) that is used for training.
     * </pre>
     *
     * <code>string source_language_code = 2;</code>
     *
     * @param value The sourceLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setSourceLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceLanguageCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Inferred from the dataset.
     * The source language (The BCP-47 language code) that is used for training.
     * </pre>
     *
     * <code>string source_language_code = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceLanguageCode() {
      sourceLanguageCode_ = getDefaultInstance().getSourceLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Inferred from the dataset.
     * The source language (The BCP-47 language code) that is used for training.
     * </pre>
     *
     * <code>string source_language_code = 2;</code>
     *
     * @param value The bytes for sourceLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setSourceLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceLanguageCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object targetLanguageCode_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The target language (The BCP-47 language code) that is used
     * for training.
     * </pre>
     *
     * <code>string target_language_code = 3;</code>
     *
     * @return The targetLanguageCode.
     */
    public java.lang.String getTargetLanguageCode() {
      java.lang.Object ref = targetLanguageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetLanguageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The target language (The BCP-47 language code) that is used
     * for training.
     * </pre>
     *
     * <code>string target_language_code = 3;</code>
     *
     * @return The bytes for targetLanguageCode.
     */
    public com.google.protobuf.ByteString getTargetLanguageCodeBytes() {
      java.lang.Object ref = targetLanguageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        targetLanguageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The target language (The BCP-47 language code) that is used
     * for training.
     * </pre>
     *
     * <code>string target_language_code = 3;</code>
     *
     * @param value The targetLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setTargetLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      targetLanguageCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The target language (The BCP-47 language code) that is used
     * for training.
     * </pre>
     *
     * <code>string target_language_code = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetLanguageCode() {
      targetLanguageCode_ = getDefaultInstance().getTargetLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The target language (The BCP-47 language code) that is used
     * for training.
     * </pre>
     *
     * <code>string target_language_code = 3;</code>
     *
     * @param value The bytes for targetLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setTargetLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      targetLanguageCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.TranslationModelMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TranslationModelMetadata)
  private static final com.google.cloud.automl.v1.TranslationModelMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.TranslationModelMetadata();
  }

  public static com.google.cloud.automl.v1.TranslationModelMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranslationModelMetadata> PARSER =
      new com.google.protobuf.AbstractParser<TranslationModelMetadata>() {
        @java.lang.Override
        public TranslationModelMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<TranslationModelMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranslationModelMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.TranslationModelMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

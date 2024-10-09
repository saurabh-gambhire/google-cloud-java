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
// source: google/cloud/retail/v2alpha/generative_question_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * Response for ListQuestions method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse}
 */
public final class ListGenerativeQuestionConfigsResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse)
    ListGenerativeQuestionConfigsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListGenerativeQuestionConfigsResponse.newBuilder() to construct.
  private ListGenerativeQuestionConfigsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListGenerativeQuestionConfigsResponse() {
    generativeQuestionConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListGenerativeQuestionConfigsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.GenerativeQuestionServiceProto
        .internal_static_google_cloud_retail_v2alpha_ListGenerativeQuestionConfigsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.GenerativeQuestionServiceProto
        .internal_static_google_cloud_retail_v2alpha_ListGenerativeQuestionConfigsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse.class,
            com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse.Builder.class);
  }

  public static final int GENERATIVE_QUESTION_CONFIGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.retail.v2alpha.GenerativeQuestionConfig>
      generativeQuestionConfigs_;
  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.retail.v2alpha.GenerativeQuestionConfig>
      getGenerativeQuestionConfigsList() {
    return generativeQuestionConfigs_;
  }
  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.retail.v2alpha.GenerativeQuestionConfigOrBuilder>
      getGenerativeQuestionConfigsOrBuilderList() {
    return generativeQuestionConfigs_;
  }
  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  @java.lang.Override
  public int getGenerativeQuestionConfigsCount() {
    return generativeQuestionConfigs_.size();
  }
  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.GenerativeQuestionConfig getGenerativeQuestionConfigs(
      int index) {
    return generativeQuestionConfigs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.GenerativeQuestionConfigOrBuilder
      getGenerativeQuestionConfigsOrBuilder(int index) {
    return generativeQuestionConfigs_.get(index);
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
    for (int i = 0; i < generativeQuestionConfigs_.size(); i++) {
      output.writeMessage(1, generativeQuestionConfigs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < generativeQuestionConfigs_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, generativeQuestionConfigs_.get(i));
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
    if (!(obj instanceof com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse other =
        (com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse) obj;

    if (!getGenerativeQuestionConfigsList().equals(other.getGenerativeQuestionConfigsList()))
      return false;
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
    if (getGenerativeQuestionConfigsCount() > 0) {
      hash = (37 * hash) + GENERATIVE_QUESTION_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getGenerativeQuestionConfigsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse prototype) {
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
   * Response for ListQuestions method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse)
      com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.GenerativeQuestionServiceProto
          .internal_static_google_cloud_retail_v2alpha_ListGenerativeQuestionConfigsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.GenerativeQuestionServiceProto
          .internal_static_google_cloud_retail_v2alpha_ListGenerativeQuestionConfigsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse.class,
              com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (generativeQuestionConfigsBuilder_ == null) {
        generativeQuestionConfigs_ = java.util.Collections.emptyList();
      } else {
        generativeQuestionConfigs_ = null;
        generativeQuestionConfigsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.GenerativeQuestionServiceProto
          .internal_static_google_cloud_retail_v2alpha_ListGenerativeQuestionConfigsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse build() {
      com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse buildPartial() {
      com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse result =
          new com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse result) {
      if (generativeQuestionConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          generativeQuestionConfigs_ =
              java.util.Collections.unmodifiableList(generativeQuestionConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.generativeQuestionConfigs_ = generativeQuestionConfigs_;
      } else {
        result.generativeQuestionConfigs_ = generativeQuestionConfigsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse) {
        return mergeFrom(
            (com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse other) {
      if (other
          == com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse
              .getDefaultInstance()) return this;
      if (generativeQuestionConfigsBuilder_ == null) {
        if (!other.generativeQuestionConfigs_.isEmpty()) {
          if (generativeQuestionConfigs_.isEmpty()) {
            generativeQuestionConfigs_ = other.generativeQuestionConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGenerativeQuestionConfigsIsMutable();
            generativeQuestionConfigs_.addAll(other.generativeQuestionConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.generativeQuestionConfigs_.isEmpty()) {
          if (generativeQuestionConfigsBuilder_.isEmpty()) {
            generativeQuestionConfigsBuilder_.dispose();
            generativeQuestionConfigsBuilder_ = null;
            generativeQuestionConfigs_ = other.generativeQuestionConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            generativeQuestionConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getGenerativeQuestionConfigsFieldBuilder()
                    : null;
          } else {
            generativeQuestionConfigsBuilder_.addAllMessages(other.generativeQuestionConfigs_);
          }
        }
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
                com.google.cloud.retail.v2alpha.GenerativeQuestionConfig m =
                    input.readMessage(
                        com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.parser(),
                        extensionRegistry);
                if (generativeQuestionConfigsBuilder_ == null) {
                  ensureGenerativeQuestionConfigsIsMutable();
                  generativeQuestionConfigs_.add(m);
                } else {
                  generativeQuestionConfigsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.retail.v2alpha.GenerativeQuestionConfig>
        generativeQuestionConfigs_ = java.util.Collections.emptyList();

    private void ensureGenerativeQuestionConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        generativeQuestionConfigs_ =
            new java.util.ArrayList<com.google.cloud.retail.v2alpha.GenerativeQuestionConfig>(
                generativeQuestionConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.retail.v2alpha.GenerativeQuestionConfig,
            com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder,
            com.google.cloud.retail.v2alpha.GenerativeQuestionConfigOrBuilder>
        generativeQuestionConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.retail.v2alpha.GenerativeQuestionConfig>
        getGenerativeQuestionConfigsList() {
      if (generativeQuestionConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(generativeQuestionConfigs_);
      } else {
        return generativeQuestionConfigsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public int getGenerativeQuestionConfigsCount() {
      if (generativeQuestionConfigsBuilder_ == null) {
        return generativeQuestionConfigs_.size();
      } else {
        return generativeQuestionConfigsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public com.google.cloud.retail.v2alpha.GenerativeQuestionConfig getGenerativeQuestionConfigs(
        int index) {
      if (generativeQuestionConfigsBuilder_ == null) {
        return generativeQuestionConfigs_.get(index);
      } else {
        return generativeQuestionConfigsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder setGenerativeQuestionConfigs(
        int index, com.google.cloud.retail.v2alpha.GenerativeQuestionConfig value) {
      if (generativeQuestionConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGenerativeQuestionConfigsIsMutable();
        generativeQuestionConfigs_.set(index, value);
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder setGenerativeQuestionConfigs(
        int index,
        com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder builderForValue) {
      if (generativeQuestionConfigsBuilder_ == null) {
        ensureGenerativeQuestionConfigsIsMutable();
        generativeQuestionConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder addGenerativeQuestionConfigs(
        com.google.cloud.retail.v2alpha.GenerativeQuestionConfig value) {
      if (generativeQuestionConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGenerativeQuestionConfigsIsMutable();
        generativeQuestionConfigs_.add(value);
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder addGenerativeQuestionConfigs(
        int index, com.google.cloud.retail.v2alpha.GenerativeQuestionConfig value) {
      if (generativeQuestionConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGenerativeQuestionConfigsIsMutable();
        generativeQuestionConfigs_.add(index, value);
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder addGenerativeQuestionConfigs(
        com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder builderForValue) {
      if (generativeQuestionConfigsBuilder_ == null) {
        ensureGenerativeQuestionConfigsIsMutable();
        generativeQuestionConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder addGenerativeQuestionConfigs(
        int index,
        com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder builderForValue) {
      if (generativeQuestionConfigsBuilder_ == null) {
        ensureGenerativeQuestionConfigsIsMutable();
        generativeQuestionConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder addAllGenerativeQuestionConfigs(
        java.lang.Iterable<? extends com.google.cloud.retail.v2alpha.GenerativeQuestionConfig>
            values) {
      if (generativeQuestionConfigsBuilder_ == null) {
        ensureGenerativeQuestionConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, generativeQuestionConfigs_);
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder clearGenerativeQuestionConfigs() {
      if (generativeQuestionConfigsBuilder_ == null) {
        generativeQuestionConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public Builder removeGenerativeQuestionConfigs(int index) {
      if (generativeQuestionConfigsBuilder_ == null) {
        ensureGenerativeQuestionConfigsIsMutable();
        generativeQuestionConfigs_.remove(index);
        onChanged();
      } else {
        generativeQuestionConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder
        getGenerativeQuestionConfigsBuilder(int index) {
      return getGenerativeQuestionConfigsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public com.google.cloud.retail.v2alpha.GenerativeQuestionConfigOrBuilder
        getGenerativeQuestionConfigsOrBuilder(int index) {
      if (generativeQuestionConfigsBuilder_ == null) {
        return generativeQuestionConfigs_.get(index);
      } else {
        return generativeQuestionConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.retail.v2alpha.GenerativeQuestionConfigOrBuilder>
        getGenerativeQuestionConfigsOrBuilderList() {
      if (generativeQuestionConfigsBuilder_ != null) {
        return generativeQuestionConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(generativeQuestionConfigs_);
      }
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder
        addGenerativeQuestionConfigsBuilder() {
      return getGenerativeQuestionConfigsFieldBuilder()
          .addBuilder(
              com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder
        addGenerativeQuestionConfigsBuilder(int index) {
      return getGenerativeQuestionConfigsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All the questions for a given catalog.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.GenerativeQuestionConfig generative_question_configs = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder>
        getGenerativeQuestionConfigsBuilderList() {
      return getGenerativeQuestionConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.retail.v2alpha.GenerativeQuestionConfig,
            com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder,
            com.google.cloud.retail.v2alpha.GenerativeQuestionConfigOrBuilder>
        getGenerativeQuestionConfigsFieldBuilder() {
      if (generativeQuestionConfigsBuilder_ == null) {
        generativeQuestionConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.retail.v2alpha.GenerativeQuestionConfig,
                com.google.cloud.retail.v2alpha.GenerativeQuestionConfig.Builder,
                com.google.cloud.retail.v2alpha.GenerativeQuestionConfigOrBuilder>(
                generativeQuestionConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        generativeQuestionConfigs_ = null;
      }
      return generativeQuestionConfigsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse)
  private static final com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse();
  }

  public static com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListGenerativeQuestionConfigsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListGenerativeQuestionConfigsResponse>() {
        @java.lang.Override
        public ListGenerativeQuestionConfigsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListGenerativeQuestionConfigsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListGenerativeQuestionConfigsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.ListGenerativeQuestionConfigsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

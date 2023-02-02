/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/speech/v1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1;

/**
 *
 *
 * <pre>
 * Message sent by the client for the `CreatePhraseSet` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.CreatePhraseSetRequest}
 */
public final class CreatePhraseSetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.CreatePhraseSetRequest)
    CreatePhraseSetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreatePhraseSetRequest.newBuilder() to construct.
  private CreatePhraseSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePhraseSetRequest() {
    parent_ = "";
    phraseSetId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePhraseSetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1.SpeechAdaptationProto
        .internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechAdaptationProto
        .internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.CreatePhraseSetRequest.class,
            com.google.cloud.speech.v1.CreatePhraseSetRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this phrase set will be created.
   * Format:
   * `projects/{project}/locations/{location}/phraseSets`
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this phrase set will be created.
   * Format:
   * `projects/{project}/locations/{location}/phraseSets`
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHRASE_SET_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object phraseSetId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the phrase set, which will become the final
   * component of the phrase set's resource name.
   * This value should restrict to letters, numbers, and hyphens, with the first
   * character a letter, the last a letter or a number, and be 4-63 characters.
   * </pre>
   *
   * <code>string phrase_set_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The phraseSetId.
   */
  @java.lang.Override
  public java.lang.String getPhraseSetId() {
    java.lang.Object ref = phraseSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phraseSetId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the phrase set, which will become the final
   * component of the phrase set's resource name.
   * This value should restrict to letters, numbers, and hyphens, with the first
   * character a letter, the last a letter or a number, and be 4-63 characters.
   * </pre>
   *
   * <code>string phrase_set_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for phraseSetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPhraseSetIdBytes() {
    java.lang.Object ref = phraseSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      phraseSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHRASE_SET_FIELD_NUMBER = 3;
  private com.google.cloud.speech.v1.PhraseSet phraseSet_;
  /**
   *
   *
   * <pre>
   * Required. The phrase set to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the phraseSet field is set.
   */
  @java.lang.Override
  public boolean hasPhraseSet() {
    return phraseSet_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The phrase set to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The phraseSet.
   */
  @java.lang.Override
  public com.google.cloud.speech.v1.PhraseSet getPhraseSet() {
    return phraseSet_ == null
        ? com.google.cloud.speech.v1.PhraseSet.getDefaultInstance()
        : phraseSet_;
  }
  /**
   *
   *
   * <pre>
   * Required. The phrase set to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v1.PhraseSetOrBuilder getPhraseSetOrBuilder() {
    return phraseSet_ == null
        ? com.google.cloud.speech.v1.PhraseSet.getDefaultInstance()
        : phraseSet_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phraseSetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, phraseSetId_);
    }
    if (phraseSet_ != null) {
      output.writeMessage(3, getPhraseSet());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phraseSetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, phraseSetId_);
    }
    if (phraseSet_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPhraseSet());
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
    if (!(obj instanceof com.google.cloud.speech.v1.CreatePhraseSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.CreatePhraseSetRequest other =
        (com.google.cloud.speech.v1.CreatePhraseSetRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getPhraseSetId().equals(other.getPhraseSetId())) return false;
    if (hasPhraseSet() != other.hasPhraseSet()) return false;
    if (hasPhraseSet()) {
      if (!getPhraseSet().equals(other.getPhraseSet())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + PHRASE_SET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPhraseSetId().hashCode();
    if (hasPhraseSet()) {
      hash = (37 * hash) + PHRASE_SET_FIELD_NUMBER;
      hash = (53 * hash) + getPhraseSet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.speech.v1.CreatePhraseSetRequest prototype) {
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
   * Message sent by the client for the `CreatePhraseSet` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.CreatePhraseSetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.CreatePhraseSetRequest)
      com.google.cloud.speech.v1.CreatePhraseSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1.SpeechAdaptationProto
          .internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechAdaptationProto
          .internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.CreatePhraseSetRequest.class,
              com.google.cloud.speech.v1.CreatePhraseSetRequest.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.CreatePhraseSetRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      phraseSetId_ = "";
      phraseSet_ = null;
      if (phraseSetBuilder_ != null) {
        phraseSetBuilder_.dispose();
        phraseSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechAdaptationProto
          .internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.CreatePhraseSetRequest getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.CreatePhraseSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.CreatePhraseSetRequest build() {
      com.google.cloud.speech.v1.CreatePhraseSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.CreatePhraseSetRequest buildPartial() {
      com.google.cloud.speech.v1.CreatePhraseSetRequest result =
          new com.google.cloud.speech.v1.CreatePhraseSetRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v1.CreatePhraseSetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.phraseSetId_ = phraseSetId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.phraseSet_ = phraseSetBuilder_ == null ? phraseSet_ : phraseSetBuilder_.build();
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
      if (other instanceof com.google.cloud.speech.v1.CreatePhraseSetRequest) {
        return mergeFrom((com.google.cloud.speech.v1.CreatePhraseSetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.CreatePhraseSetRequest other) {
      if (other == com.google.cloud.speech.v1.CreatePhraseSetRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPhraseSetId().isEmpty()) {
        phraseSetId_ = other.phraseSetId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPhraseSet()) {
        mergePhraseSet(other.getPhraseSet());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                phraseSetId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getPhraseSetFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this phrase set will be created.
     * Format:
     * `projects/{project}/locations/{location}/phraseSets`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this phrase set will be created.
     * Format:
     * `projects/{project}/locations/{location}/phraseSets`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this phrase set will be created.
     * Format:
     * `projects/{project}/locations/{location}/phraseSets`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this phrase set will be created.
     * Format:
     * `projects/{project}/locations/{location}/phraseSets`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this phrase set will be created.
     * Format:
     * `projects/{project}/locations/{location}/phraseSets`
     * Speech-to-Text supports three locations: `global`, `us` (US North America),
     * and `eu` (Europe). If you are calling the `speech.googleapis.com`
     * endpoint, use the `global` location. To specify a region, use a
     * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
     * with matching `us` or `eu` location value.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object phraseSetId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the phrase set, which will become the final
     * component of the phrase set's resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string phrase_set_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The phraseSetId.
     */
    public java.lang.String getPhraseSetId() {
      java.lang.Object ref = phraseSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phraseSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the phrase set, which will become the final
     * component of the phrase set's resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string phrase_set_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for phraseSetId.
     */
    public com.google.protobuf.ByteString getPhraseSetIdBytes() {
      java.lang.Object ref = phraseSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        phraseSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the phrase set, which will become the final
     * component of the phrase set's resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string phrase_set_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The phraseSetId to set.
     * @return This builder for chaining.
     */
    public Builder setPhraseSetId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      phraseSetId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the phrase set, which will become the final
     * component of the phrase set's resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string phrase_set_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPhraseSetId() {
      phraseSetId_ = getDefaultInstance().getPhraseSetId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the phrase set, which will become the final
     * component of the phrase set's resource name.
     * This value should restrict to letters, numbers, and hyphens, with the first
     * character a letter, the last a letter or a number, and be 4-63 characters.
     * </pre>
     *
     * <code>string phrase_set_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for phraseSetId to set.
     * @return This builder for chaining.
     */
    public Builder setPhraseSetIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      phraseSetId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.speech.v1.PhraseSet phraseSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1.PhraseSet,
            com.google.cloud.speech.v1.PhraseSet.Builder,
            com.google.cloud.speech.v1.PhraseSetOrBuilder>
        phraseSetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the phraseSet field is set.
     */
    public boolean hasPhraseSet() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The phraseSet.
     */
    public com.google.cloud.speech.v1.PhraseSet getPhraseSet() {
      if (phraseSetBuilder_ == null) {
        return phraseSet_ == null
            ? com.google.cloud.speech.v1.PhraseSet.getDefaultInstance()
            : phraseSet_;
      } else {
        return phraseSetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPhraseSet(com.google.cloud.speech.v1.PhraseSet value) {
      if (phraseSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        phraseSet_ = value;
      } else {
        phraseSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPhraseSet(com.google.cloud.speech.v1.PhraseSet.Builder builderForValue) {
      if (phraseSetBuilder_ == null) {
        phraseSet_ = builderForValue.build();
      } else {
        phraseSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePhraseSet(com.google.cloud.speech.v1.PhraseSet value) {
      if (phraseSetBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && phraseSet_ != null
            && phraseSet_ != com.google.cloud.speech.v1.PhraseSet.getDefaultInstance()) {
          getPhraseSetBuilder().mergeFrom(value);
        } else {
          phraseSet_ = value;
        }
      } else {
        phraseSetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPhraseSet() {
      bitField0_ = (bitField0_ & ~0x00000004);
      phraseSet_ = null;
      if (phraseSetBuilder_ != null) {
        phraseSetBuilder_.dispose();
        phraseSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v1.PhraseSet.Builder getPhraseSetBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPhraseSetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v1.PhraseSetOrBuilder getPhraseSetOrBuilder() {
      if (phraseSetBuilder_ != null) {
        return phraseSetBuilder_.getMessageOrBuilder();
      } else {
        return phraseSet_ == null
            ? com.google.cloud.speech.v1.PhraseSet.getDefaultInstance()
            : phraseSet_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase set to create.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.PhraseSet phrase_set = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1.PhraseSet,
            com.google.cloud.speech.v1.PhraseSet.Builder,
            com.google.cloud.speech.v1.PhraseSetOrBuilder>
        getPhraseSetFieldBuilder() {
      if (phraseSetBuilder_ == null) {
        phraseSetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.speech.v1.PhraseSet,
                com.google.cloud.speech.v1.PhraseSet.Builder,
                com.google.cloud.speech.v1.PhraseSetOrBuilder>(
                getPhraseSet(), getParentForChildren(), isClean());
        phraseSet_ = null;
      }
      return phraseSetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.CreatePhraseSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.CreatePhraseSetRequest)
  private static final com.google.cloud.speech.v1.CreatePhraseSetRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.CreatePhraseSetRequest();
  }

  public static com.google.cloud.speech.v1.CreatePhraseSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePhraseSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePhraseSetRequest>() {
        @java.lang.Override
        public CreatePhraseSetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePhraseSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePhraseSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1.CreatePhraseSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

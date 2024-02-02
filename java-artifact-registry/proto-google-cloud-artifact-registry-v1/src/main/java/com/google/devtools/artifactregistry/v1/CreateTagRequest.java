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
// source: google/devtools/artifactregistry/v1/tag.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.artifactregistry.v1;

/**
 *
 *
 * <pre>
 * The request to create a new tag.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1.CreateTagRequest}
 */
public final class CreateTagRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1.CreateTagRequest)
    CreateTagRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTagRequest.newBuilder() to construct.
  private CreateTagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTagRequest() {
    parent_ = "";
    tagId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateTagRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.artifactregistry.v1.TagProto
        .internal_static_google_devtools_artifactregistry_v1_CreateTagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1.TagProto
        .internal_static_google_devtools_artifactregistry_v1_CreateTagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1.CreateTagRequest.class,
            com.google.devtools.artifactregistry.v1.CreateTagRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * The name of the parent resource where the tag will be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
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
   * The name of the parent resource where the tag will be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
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

  public static final int TAG_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tagId_ = "";
  /**
   *
   *
   * <pre>
   * The tag id to use for this repository.
   * </pre>
   *
   * <code>string tag_id = 2;</code>
   *
   * @return The tagId.
   */
  @java.lang.Override
  public java.lang.String getTagId() {
    java.lang.Object ref = tagId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tagId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The tag id to use for this repository.
   * </pre>
   *
   * <code>string tag_id = 2;</code>
   *
   * @return The bytes for tagId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTagIdBytes() {
    java.lang.Object ref = tagId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tagId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 3;
  private com.google.devtools.artifactregistry.v1.Tag tag_;
  /**
   *
   *
   * <pre>
   * The tag to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
   *
   * @return Whether the tag field is set.
   */
  @java.lang.Override
  public boolean hasTag() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The tag to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
   *
   * @return The tag.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.Tag getTag() {
    return tag_ == null ? com.google.devtools.artifactregistry.v1.Tag.getDefaultInstance() : tag_;
  }
  /**
   *
   *
   * <pre>
   * The tag to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.TagOrBuilder getTagOrBuilder() {
    return tag_ == null ? com.google.devtools.artifactregistry.v1.Tag.getDefaultInstance() : tag_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tagId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tagId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getTag());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tagId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tagId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTag());
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1.CreateTagRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1.CreateTagRequest other =
        (com.google.devtools.artifactregistry.v1.CreateTagRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getTagId().equals(other.getTagId())) return false;
    if (hasTag() != other.hasTag()) return false;
    if (hasTag()) {
      if (!getTag().equals(other.getTag())) return false;
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
    hash = (37 * hash) + TAG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTagId().hashCode();
    if (hasTag()) {
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest parseFrom(
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
      com.google.devtools.artifactregistry.v1.CreateTagRequest prototype) {
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
   * The request to create a new tag.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1.CreateTagRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1.CreateTagRequest)
      com.google.devtools.artifactregistry.v1.CreateTagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1.TagProto
          .internal_static_google_devtools_artifactregistry_v1_CreateTagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1.TagProto
          .internal_static_google_devtools_artifactregistry_v1_CreateTagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1.CreateTagRequest.class,
              com.google.devtools.artifactregistry.v1.CreateTagRequest.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1.CreateTagRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTagFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      tagId_ = "";
      tag_ = null;
      if (tagBuilder_ != null) {
        tagBuilder_.dispose();
        tagBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1.TagProto
          .internal_static_google_devtools_artifactregistry_v1_CreateTagRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.CreateTagRequest getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1.CreateTagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.CreateTagRequest build() {
      com.google.devtools.artifactregistry.v1.CreateTagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.CreateTagRequest buildPartial() {
      com.google.devtools.artifactregistry.v1.CreateTagRequest result =
          new com.google.devtools.artifactregistry.v1.CreateTagRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.artifactregistry.v1.CreateTagRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tagId_ = tagId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tag_ = tagBuilder_ == null ? tag_ : tagBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.devtools.artifactregistry.v1.CreateTagRequest) {
        return mergeFrom((com.google.devtools.artifactregistry.v1.CreateTagRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1.CreateTagRequest other) {
      if (other == com.google.devtools.artifactregistry.v1.CreateTagRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTagId().isEmpty()) {
        tagId_ = other.tagId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasTag()) {
        mergeTag(other.getTag());
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
                tagId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getTagFieldBuilder().getBuilder(), extensionRegistry);
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
     * The name of the parent resource where the tag will be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The name of the parent resource where the tag will be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The name of the parent resource where the tag will be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The name of the parent resource where the tag will be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The name of the parent resource where the tag will be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
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

    private java.lang.Object tagId_ = "";
    /**
     *
     *
     * <pre>
     * The tag id to use for this repository.
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @return The tagId.
     */
    public java.lang.String getTagId() {
      java.lang.Object ref = tagId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tagId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The tag id to use for this repository.
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @return The bytes for tagId.
     */
    public com.google.protobuf.ByteString getTagIdBytes() {
      java.lang.Object ref = tagId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tagId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The tag id to use for this repository.
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @param value The tagId to set.
     * @return This builder for chaining.
     */
    public Builder setTagId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tagId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The tag id to use for this repository.
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTagId() {
      tagId_ = getDefaultInstance().getTagId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The tag id to use for this repository.
     * </pre>
     *
     * <code>string tag_id = 2;</code>
     *
     * @param value The bytes for tagId to set.
     * @return This builder for chaining.
     */
    public Builder setTagIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tagId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.devtools.artifactregistry.v1.Tag tag_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.Tag,
            com.google.devtools.artifactregistry.v1.Tag.Builder,
            com.google.devtools.artifactregistry.v1.TagOrBuilder>
        tagBuilder_;
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     *
     * @return Whether the tag field is set.
     */
    public boolean hasTag() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     *
     * @return The tag.
     */
    public com.google.devtools.artifactregistry.v1.Tag getTag() {
      if (tagBuilder_ == null) {
        return tag_ == null
            ? com.google.devtools.artifactregistry.v1.Tag.getDefaultInstance()
            : tag_;
      } else {
        return tagBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     */
    public Builder setTag(com.google.devtools.artifactregistry.v1.Tag value) {
      if (tagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tag_ = value;
      } else {
        tagBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     */
    public Builder setTag(com.google.devtools.artifactregistry.v1.Tag.Builder builderForValue) {
      if (tagBuilder_ == null) {
        tag_ = builderForValue.build();
      } else {
        tagBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     */
    public Builder mergeTag(com.google.devtools.artifactregistry.v1.Tag value) {
      if (tagBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && tag_ != null
            && tag_ != com.google.devtools.artifactregistry.v1.Tag.getDefaultInstance()) {
          getTagBuilder().mergeFrom(value);
        } else {
          tag_ = value;
        }
      } else {
        tagBuilder_.mergeFrom(value);
      }
      if (tag_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     */
    public Builder clearTag() {
      bitField0_ = (bitField0_ & ~0x00000004);
      tag_ = null;
      if (tagBuilder_ != null) {
        tagBuilder_.dispose();
        tagBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     */
    public com.google.devtools.artifactregistry.v1.Tag.Builder getTagBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTagFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     */
    public com.google.devtools.artifactregistry.v1.TagOrBuilder getTagOrBuilder() {
      if (tagBuilder_ != null) {
        return tagBuilder_.getMessageOrBuilder();
      } else {
        return tag_ == null
            ? com.google.devtools.artifactregistry.v1.Tag.getDefaultInstance()
            : tag_;
      }
    }
    /**
     *
     *
     * <pre>
     * The tag to be created.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Tag tag = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.Tag,
            com.google.devtools.artifactregistry.v1.Tag.Builder,
            com.google.devtools.artifactregistry.v1.TagOrBuilder>
        getTagFieldBuilder() {
      if (tagBuilder_ == null) {
        tagBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.artifactregistry.v1.Tag,
                com.google.devtools.artifactregistry.v1.Tag.Builder,
                com.google.devtools.artifactregistry.v1.TagOrBuilder>(
                getTag(), getParentForChildren(), isClean());
        tag_ = null;
      }
      return tagBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1.CreateTagRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1.CreateTagRequest)
  private static final com.google.devtools.artifactregistry.v1.CreateTagRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1.CreateTagRequest();
  }

  public static com.google.devtools.artifactregistry.v1.CreateTagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTagRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateTagRequest>() {
        @java.lang.Override
        public CreateTagRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.CreateTagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

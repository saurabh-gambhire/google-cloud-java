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
// source: google/api/apikeys/v2/apikeys.proto

// Protobuf Java Version: 3.25.2
package com.google.api.apikeys.v2;

/**
 *
 *
 * <pre>
 * Request message for `CreateKey` method.
 * </pre>
 *
 * Protobuf type {@code google.api.apikeys.v2.CreateKeyRequest}
 */
public final class CreateKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.apikeys.v2.CreateKeyRequest)
    CreateKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateKeyRequest.newBuilder() to construct.
  private CreateKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateKeyRequest() {
    parent_ = "";
    keyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.apikeys.v2.ApiKeysProto
        .internal_static_google_api_apikeys_v2_CreateKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.apikeys.v2.ApiKeysProto
        .internal_static_google_api_apikeys_v2_CreateKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.apikeys.v2.CreateKeyRequest.class,
            com.google.api.apikeys.v2.CreateKeyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The project in which the API key is created.
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
   * Required. The project in which the API key is created.
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

  public static final int KEY_FIELD_NUMBER = 2;
  private com.google.api.apikeys.v2.Key key_;
  /**
   *
   *
   * <pre>
   * Required. The API key fields to set at creation time.
   * You can configure only the `display_name`, `restrictions`, and
   * `annotations` fields.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The API key fields to set at creation time.
   * You can configure only the `display_name`, `restrictions`, and
   * `annotations` fields.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public com.google.api.apikeys.v2.Key getKey() {
    return key_ == null ? com.google.api.apikeys.v2.Key.getDefaultInstance() : key_;
  }
  /**
   *
   *
   * <pre>
   * Required. The API key fields to set at creation time.
   * You can configure only the `display_name`, `restrictions`, and
   * `annotations` fields.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.api.apikeys.v2.KeyOrBuilder getKeyOrBuilder() {
    return key_ == null ? com.google.api.apikeys.v2.Key.getDefaultInstance() : key_;
  }

  public static final int KEY_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object keyId_ = "";
  /**
   *
   *
   * <pre>
   * User specified key id (optional). If specified, it will become the final
   * component of the key resource name.
   *
   * The id must be unique within the project, must conform with RFC-1034,
   * is restricted to lower-cased letters, and has a maximum length of 63
   * characters. In another word, the id must match the regular
   * expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
   *
   * The id must NOT be a UUID-like string.
   * </pre>
   *
   * <code>string key_id = 3;</code>
   *
   * @return The keyId.
   */
  @java.lang.Override
  public java.lang.String getKeyId() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * User specified key id (optional). If specified, it will become the final
   * component of the key resource name.
   *
   * The id must be unique within the project, must conform with RFC-1034,
   * is restricted to lower-cased letters, and has a maximum length of 63
   * characters. In another word, the id must match the regular
   * expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
   *
   * The id must NOT be a UUID-like string.
   * </pre>
   *
   * <code>string key_id = 3;</code>
   *
   * @return The bytes for keyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyIdBytes() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keyId_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, keyId_);
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
    if (!(obj instanceof com.google.api.apikeys.v2.CreateKeyRequest)) {
      return super.equals(obj);
    }
    com.google.api.apikeys.v2.CreateKeyRequest other =
        (com.google.api.apikeys.v2.CreateKeyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey().equals(other.getKey())) return false;
    }
    if (!getKeyId().equals(other.getKeyId())) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    hash = (37 * hash) + KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest parseFrom(
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

  public static Builder newBuilder(com.google.api.apikeys.v2.CreateKeyRequest prototype) {
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
   * Request message for `CreateKey` method.
   * </pre>
   *
   * Protobuf type {@code google.api.apikeys.v2.CreateKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.apikeys.v2.CreateKeyRequest)
      com.google.api.apikeys.v2.CreateKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.apikeys.v2.ApiKeysProto
          .internal_static_google_api_apikeys_v2_CreateKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.apikeys.v2.ApiKeysProto
          .internal_static_google_api_apikeys_v2_CreateKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.apikeys.v2.CreateKeyRequest.class,
              com.google.api.apikeys.v2.CreateKeyRequest.Builder.class);
    }

    // Construct using com.google.api.apikeys.v2.CreateKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getKeyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      key_ = null;
      if (keyBuilder_ != null) {
        keyBuilder_.dispose();
        keyBuilder_ = null;
      }
      keyId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.apikeys.v2.ApiKeysProto
          .internal_static_google_api_apikeys_v2_CreateKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.CreateKeyRequest getDefaultInstanceForType() {
      return com.google.api.apikeys.v2.CreateKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.CreateKeyRequest build() {
      com.google.api.apikeys.v2.CreateKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.CreateKeyRequest buildPartial() {
      com.google.api.apikeys.v2.CreateKeyRequest result =
          new com.google.api.apikeys.v2.CreateKeyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.apikeys.v2.CreateKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.key_ = keyBuilder_ == null ? key_ : keyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.keyId_ = keyId_;
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
      if (other instanceof com.google.api.apikeys.v2.CreateKeyRequest) {
        return mergeFrom((com.google.api.apikeys.v2.CreateKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.apikeys.v2.CreateKeyRequest other) {
      if (other == com.google.api.apikeys.v2.CreateKeyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (!other.getKeyId().isEmpty()) {
        keyId_ = other.keyId_;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getKeyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                keyId_ = input.readStringRequireUtf8();
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
     * Required. The project in which the API key is created.
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
     * Required. The project in which the API key is created.
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
     * Required. The project in which the API key is created.
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
     * Required. The project in which the API key is created.
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
     * Required. The project in which the API key is created.
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

    private com.google.api.apikeys.v2.Key key_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.apikeys.v2.Key,
            com.google.api.apikeys.v2.Key.Builder,
            com.google.api.apikeys.v2.KeyOrBuilder>
        keyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The key.
     */
    public com.google.api.apikeys.v2.Key getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? com.google.api.apikeys.v2.Key.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setKey(com.google.api.apikeys.v2.Key value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
      } else {
        keyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setKey(com.google.api.apikeys.v2.Key.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeKey(com.google.api.apikeys.v2.Key value) {
      if (keyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && key_ != null
            && key_ != com.google.api.apikeys.v2.Key.getDefaultInstance()) {
          getKeyBuilder().mergeFrom(value);
        } else {
          key_ = value;
        }
      } else {
        keyBuilder_.mergeFrom(value);
      }
      if (key_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      key_ = null;
      if (keyBuilder_ != null) {
        keyBuilder_.dispose();
        keyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.api.apikeys.v2.Key.Builder getKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.api.apikeys.v2.KeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ? com.google.api.apikeys.v2.Key.getDefaultInstance() : key_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The API key fields to set at creation time.
     * You can configure only the `display_name`, `restrictions`, and
     * `annotations` fields.
     * </pre>
     *
     * <code>.google.api.apikeys.v2.Key key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.apikeys.v2.Key,
            com.google.api.apikeys.v2.Key.Builder,
            com.google.api.apikeys.v2.KeyOrBuilder>
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.apikeys.v2.Key,
                com.google.api.apikeys.v2.Key.Builder,
                com.google.api.apikeys.v2.KeyOrBuilder>(
                getKey(), getParentForChildren(), isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private java.lang.Object keyId_ = "";
    /**
     *
     *
     * <pre>
     * User specified key id (optional). If specified, it will become the final
     * component of the key resource name.
     *
     * The id must be unique within the project, must conform with RFC-1034,
     * is restricted to lower-cased letters, and has a maximum length of 63
     * characters. In another word, the id must match the regular
     * expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
     *
     * The id must NOT be a UUID-like string.
     * </pre>
     *
     * <code>string key_id = 3;</code>
     *
     * @return The keyId.
     */
    public java.lang.String getKeyId() {
      java.lang.Object ref = keyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * User specified key id (optional). If specified, it will become the final
     * component of the key resource name.
     *
     * The id must be unique within the project, must conform with RFC-1034,
     * is restricted to lower-cased letters, and has a maximum length of 63
     * characters. In another word, the id must match the regular
     * expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
     *
     * The id must NOT be a UUID-like string.
     * </pre>
     *
     * <code>string key_id = 3;</code>
     *
     * @return The bytes for keyId.
     */
    public com.google.protobuf.ByteString getKeyIdBytes() {
      java.lang.Object ref = keyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * User specified key id (optional). If specified, it will become the final
     * component of the key resource name.
     *
     * The id must be unique within the project, must conform with RFC-1034,
     * is restricted to lower-cased letters, and has a maximum length of 63
     * characters. In another word, the id must match the regular
     * expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
     *
     * The id must NOT be a UUID-like string.
     * </pre>
     *
     * <code>string key_id = 3;</code>
     *
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      keyId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * User specified key id (optional). If specified, it will become the final
     * component of the key resource name.
     *
     * The id must be unique within the project, must conform with RFC-1034,
     * is restricted to lower-cased letters, and has a maximum length of 63
     * characters. In another word, the id must match the regular
     * expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
     *
     * The id must NOT be a UUID-like string.
     * </pre>
     *
     * <code>string key_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyId() {
      keyId_ = getDefaultInstance().getKeyId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * User specified key id (optional). If specified, it will become the final
     * component of the key resource name.
     *
     * The id must be unique within the project, must conform with RFC-1034,
     * is restricted to lower-cased letters, and has a maximum length of 63
     * characters. In another word, the id must match the regular
     * expression: `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
     *
     * The id must NOT be a UUID-like string.
     * </pre>
     *
     * <code>string key_id = 3;</code>
     *
     * @param value The bytes for keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      keyId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.api.apikeys.v2.CreateKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.apikeys.v2.CreateKeyRequest)
  private static final com.google.api.apikeys.v2.CreateKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.apikeys.v2.CreateKeyRequest();
  }

  public static com.google.api.apikeys.v2.CreateKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateKeyRequest>() {
        @java.lang.Override
        public CreateKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.apikeys.v2.CreateKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

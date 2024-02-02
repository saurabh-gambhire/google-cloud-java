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
// source: google/appengine/v1/appengine.proto

// Protobuf Java Version: 3.25.2
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Request message for `Instances.DebugInstance`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.DebugInstanceRequest}
 */
public final class DebugInstanceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.DebugInstanceRequest)
    DebugInstanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DebugInstanceRequest.newBuilder() to construct.
  private DebugInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DebugInstanceRequest() {
    name_ = "";
    sshKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DebugInstanceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_DebugInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_DebugInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.DebugInstanceRequest.class,
            com.google.appengine.v1.DebugInstanceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name of the resource requested. Example:
   * `apps/myapp/services/default/versions/v1/instances/instance-1`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the resource requested. Example:
   * `apps/myapp/services/default/versions/v1/instances/instance-1`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSH_KEY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sshKey_ = "";
  /**
   *
   *
   * <pre>
   * Public SSH key to add to the instance. Examples:
   *
   * * `[USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]`
   * * `[USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}`
   *
   * For more information, see
   * [Adding and Removing SSH Keys](https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
   * </pre>
   *
   * <code>string ssh_key = 2;</code>
   *
   * @return The sshKey.
   */
  @java.lang.Override
  public java.lang.String getSshKey() {
    java.lang.Object ref = sshKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sshKey_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Public SSH key to add to the instance. Examples:
   *
   * * `[USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]`
   * * `[USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}`
   *
   * For more information, see
   * [Adding and Removing SSH Keys](https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
   * </pre>
   *
   * <code>string ssh_key = 2;</code>
   *
   * @return The bytes for sshKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSshKeyBytes() {
    java.lang.Object ref = sshKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sshKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sshKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sshKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sshKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sshKey_);
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
    if (!(obj instanceof com.google.appengine.v1.DebugInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.DebugInstanceRequest other =
        (com.google.appengine.v1.DebugInstanceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getSshKey().equals(other.getSshKey())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SSH_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getSshKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.DebugInstanceRequest parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.DebugInstanceRequest prototype) {
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
   * Request message for `Instances.DebugInstance`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.DebugInstanceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.DebugInstanceRequest)
      com.google.appengine.v1.DebugInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_DebugInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_DebugInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.DebugInstanceRequest.class,
              com.google.appengine.v1.DebugInstanceRequest.Builder.class);
    }

    // Construct using com.google.appengine.v1.DebugInstanceRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      sshKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_DebugInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.DebugInstanceRequest getDefaultInstanceForType() {
      return com.google.appengine.v1.DebugInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.DebugInstanceRequest build() {
      com.google.appengine.v1.DebugInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.DebugInstanceRequest buildPartial() {
      com.google.appengine.v1.DebugInstanceRequest result =
          new com.google.appengine.v1.DebugInstanceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.DebugInstanceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sshKey_ = sshKey_;
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
      if (other instanceof com.google.appengine.v1.DebugInstanceRequest) {
        return mergeFrom((com.google.appengine.v1.DebugInstanceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.DebugInstanceRequest other) {
      if (other == com.google.appengine.v1.DebugInstanceRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSshKey().isEmpty()) {
        sshKey_ = other.sshKey_;
        bitField0_ |= 0x00000002;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                sshKey_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of the resource requested. Example:
     * `apps/myapp/services/default/versions/v1/instances/instance-1`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the resource requested. Example:
     * `apps/myapp/services/default/versions/v1/instances/instance-1`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the resource requested. Example:
     * `apps/myapp/services/default/versions/v1/instances/instance-1`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the resource requested. Example:
     * `apps/myapp/services/default/versions/v1/instances/instance-1`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the resource requested. Example:
     * `apps/myapp/services/default/versions/v1/instances/instance-1`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object sshKey_ = "";
    /**
     *
     *
     * <pre>
     * Public SSH key to add to the instance. Examples:
     *
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]`
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}`
     *
     * For more information, see
     * [Adding and Removing SSH Keys](https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
     * </pre>
     *
     * <code>string ssh_key = 2;</code>
     *
     * @return The sshKey.
     */
    public java.lang.String getSshKey() {
      java.lang.Object ref = sshKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sshKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Public SSH key to add to the instance. Examples:
     *
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]`
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}`
     *
     * For more information, see
     * [Adding and Removing SSH Keys](https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
     * </pre>
     *
     * <code>string ssh_key = 2;</code>
     *
     * @return The bytes for sshKey.
     */
    public com.google.protobuf.ByteString getSshKeyBytes() {
      java.lang.Object ref = sshKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sshKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Public SSH key to add to the instance. Examples:
     *
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]`
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}`
     *
     * For more information, see
     * [Adding and Removing SSH Keys](https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
     * </pre>
     *
     * <code>string ssh_key = 2;</code>
     *
     * @param value The sshKey to set.
     * @return This builder for chaining.
     */
    public Builder setSshKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sshKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Public SSH key to add to the instance. Examples:
     *
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]`
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}`
     *
     * For more information, see
     * [Adding and Removing SSH Keys](https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
     * </pre>
     *
     * <code>string ssh_key = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSshKey() {
      sshKey_ = getDefaultInstance().getSshKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Public SSH key to add to the instance. Examples:
     *
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]`
     * * `[USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}`
     *
     * For more information, see
     * [Adding and Removing SSH Keys](https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
     * </pre>
     *
     * <code>string ssh_key = 2;</code>
     *
     * @param value The bytes for sshKey to set.
     * @return This builder for chaining.
     */
    public Builder setSshKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sshKey_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.DebugInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.DebugInstanceRequest)
  private static final com.google.appengine.v1.DebugInstanceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.DebugInstanceRequest();
  }

  public static com.google.appengine.v1.DebugInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DebugInstanceRequest> PARSER =
      new com.google.protobuf.AbstractParser<DebugInstanceRequest>() {
        @java.lang.Override
        public DebugInstanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DebugInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DebugInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.DebugInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

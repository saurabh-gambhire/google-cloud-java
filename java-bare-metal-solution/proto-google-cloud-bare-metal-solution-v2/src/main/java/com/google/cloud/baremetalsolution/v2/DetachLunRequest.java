/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/baremetalsolution/v2/instance.proto

package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Message for detach specific LUN from an Instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.DetachLunRequest}
 */
public final class DetachLunRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.DetachLunRequest)
    DetachLunRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DetachLunRequest.newBuilder() to construct.
  private DetachLunRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DetachLunRequest() {
    instance_ = "";
    lun_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DetachLunRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.InstanceProto
        .internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.InstanceProto
        .internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.DetachLunRequest.class,
            com.google.cloud.baremetalsolution.v2.DetachLunRequest.Builder.class);
  }

  public static final int INSTANCE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instance_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the instance.
   * </pre>
   *
   * <code>
   * string instance = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The instance.
   */
  @java.lang.Override
  public java.lang.String getInstance() {
    java.lang.Object ref = instance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instance_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the instance.
   * </pre>
   *
   * <code>
   * string instance = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for instance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceBytes() {
    java.lang.Object ref = instance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LUN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object lun_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the Lun to detach.
   * </pre>
   *
   * <code>
   * string lun = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The lun.
   */
  @java.lang.Override
  public java.lang.String getLun() {
    java.lang.Object ref = lun_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lun_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the Lun to detach.
   * </pre>
   *
   * <code>
   * string lun = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for lun.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLunBytes() {
    java.lang.Object ref = lun_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      lun_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lun_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lun_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lun_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lun_);
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.DetachLunRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.DetachLunRequest other =
        (com.google.cloud.baremetalsolution.v2.DetachLunRequest) obj;

    if (!getInstance().equals(other.getInstance())) return false;
    if (!getLun().equals(other.getLun())) return false;
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
    hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getInstance().hashCode();
    hash = (37 * hash) + LUN_FIELD_NUMBER;
    hash = (53 * hash) + getLun().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest parseFrom(
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
      com.google.cloud.baremetalsolution.v2.DetachLunRequest prototype) {
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
   * Message for detach specific LUN from an Instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.DetachLunRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.DetachLunRequest)
      com.google.cloud.baremetalsolution.v2.DetachLunRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.InstanceProto
          .internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.InstanceProto
          .internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.DetachLunRequest.class,
              com.google.cloud.baremetalsolution.v2.DetachLunRequest.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.DetachLunRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instance_ = "";
      lun_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.InstanceProto
          .internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.DetachLunRequest getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.DetachLunRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.DetachLunRequest build() {
      com.google.cloud.baremetalsolution.v2.DetachLunRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.DetachLunRequest buildPartial() {
      com.google.cloud.baremetalsolution.v2.DetachLunRequest result =
          new com.google.cloud.baremetalsolution.v2.DetachLunRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.baremetalsolution.v2.DetachLunRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instance_ = instance_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lun_ = lun_;
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.DetachLunRequest) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.DetachLunRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.DetachLunRequest other) {
      if (other == com.google.cloud.baremetalsolution.v2.DetachLunRequest.getDefaultInstance())
        return this;
      if (!other.getInstance().isEmpty()) {
        instance_ = other.instance_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLun().isEmpty()) {
        lun_ = other.lun_;
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
                instance_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                lun_ = input.readStringRequireUtf8();
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

    private java.lang.Object instance_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the instance.
     * </pre>
     *
     * <code>
     * string instance = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The instance.
     */
    public java.lang.String getInstance() {
      java.lang.Object ref = instance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the instance.
     * </pre>
     *
     * <code>
     * string instance = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for instance.
     */
    public com.google.protobuf.ByteString getInstanceBytes() {
      java.lang.Object ref = instance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the instance.
     * </pre>
     *
     * <code>
     * string instance = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstance(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the instance.
     * </pre>
     *
     * <code>
     * string instance = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstance() {
      instance_ = getDefaultInstance().getInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the instance.
     * </pre>
     *
     * <code>
     * string instance = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for instance to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object lun_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the Lun to detach.
     * </pre>
     *
     * <code>
     * string lun = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The lun.
     */
    public java.lang.String getLun() {
      java.lang.Object ref = lun_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lun_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Lun to detach.
     * </pre>
     *
     * <code>
     * string lun = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for lun.
     */
    public com.google.protobuf.ByteString getLunBytes() {
      java.lang.Object ref = lun_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        lun_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Lun to detach.
     * </pre>
     *
     * <code>
     * string lun = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The lun to set.
     * @return This builder for chaining.
     */
    public Builder setLun(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      lun_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Lun to detach.
     * </pre>
     *
     * <code>
     * string lun = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLun() {
      lun_ = getDefaultInstance().getLun();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the Lun to detach.
     * </pre>
     *
     * <code>
     * string lun = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for lun to set.
     * @return This builder for chaining.
     */
    public Builder setLunBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      lun_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.DetachLunRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.DetachLunRequest)
  private static final com.google.cloud.baremetalsolution.v2.DetachLunRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.DetachLunRequest();
  }

  public static com.google.cloud.baremetalsolution.v2.DetachLunRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DetachLunRequest> PARSER =
      new com.google.protobuf.AbstractParser<DetachLunRequest>() {
        @java.lang.Override
        public DetachLunRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DetachLunRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DetachLunRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.DetachLunRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

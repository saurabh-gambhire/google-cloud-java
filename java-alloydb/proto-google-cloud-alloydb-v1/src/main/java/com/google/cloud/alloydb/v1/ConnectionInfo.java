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
// source: google/cloud/alloydb/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.alloydb.v1;

/**
 *
 *
 * <pre>
 * ConnectionInfo singleton resource.
 * https://google.aip.dev/156
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1.ConnectionInfo}
 */
public final class ConnectionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1.ConnectionInfo)
    ConnectionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConnectionInfo.newBuilder() to construct.
  private ConnectionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConnectionInfo() {
    name_ = "";
    ipAddress_ = "";
    instanceUid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConnectionInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1.ResourcesProto
        .internal_static_google_cloud_alloydb_v1_ConnectionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1.ResourcesProto
        .internal_static_google_cloud_alloydb_v1_ConnectionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1.ConnectionInfo.class,
            com.google.cloud.alloydb.v1.ConnectionInfo.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The name of the ConnectionInfo singleton resource, e.g.:
   * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
   * This field currently has no semantic meaning.
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
   * The name of the ConnectionInfo singleton resource, e.g.:
   * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
   * This field currently has no semantic meaning.
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

  public static final int IP_ADDRESS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ipAddress_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The private network IP address for the Instance. This is the
   * default IP for the instance and is always created (even if enable_public_ip
   * is set). This is the connection endpoint for an end-user application.
   * </pre>
   *
   * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The private network IP address for the Instance. This is the
   * default IP for the instance and is always created (even if enable_public_ip
   * is set). This is the connection endpoint for an end-user application.
   * </pre>
   *
   * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_UID_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceUid_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The unique ID of the Instance.
   * </pre>
   *
   * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceUid.
   */
  @java.lang.Override
  public java.lang.String getInstanceUid() {
    java.lang.Object ref = instanceUid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceUid_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The unique ID of the Instance.
   * </pre>
   *
   * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for instanceUid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceUidBytes() {
    java.lang.Object ref = instanceUid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceUid_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ipAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceUid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, instanceUid_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ipAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceUid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, instanceUid_);
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
    if (!(obj instanceof com.google.cloud.alloydb.v1.ConnectionInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1.ConnectionInfo other =
        (com.google.cloud.alloydb.v1.ConnectionInfo) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getIpAddress().equals(other.getIpAddress())) return false;
    if (!getInstanceUid().equals(other.getInstanceUid())) return false;
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
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + INSTANCE_UID_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceUid().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.alloydb.v1.ConnectionInfo prototype) {
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
   * ConnectionInfo singleton resource.
   * https://google.aip.dev/156
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1.ConnectionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1.ConnectionInfo)
      com.google.cloud.alloydb.v1.ConnectionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_ConnectionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_ConnectionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1.ConnectionInfo.class,
              com.google.cloud.alloydb.v1.ConnectionInfo.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1.ConnectionInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      ipAddress_ = "";
      instanceUid_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_ConnectionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.ConnectionInfo getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1.ConnectionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.ConnectionInfo build() {
      com.google.cloud.alloydb.v1.ConnectionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.ConnectionInfo buildPartial() {
      com.google.cloud.alloydb.v1.ConnectionInfo result =
          new com.google.cloud.alloydb.v1.ConnectionInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.alloydb.v1.ConnectionInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ipAddress_ = ipAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.instanceUid_ = instanceUid_;
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
      if (other instanceof com.google.cloud.alloydb.v1.ConnectionInfo) {
        return mergeFrom((com.google.cloud.alloydb.v1.ConnectionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1.ConnectionInfo other) {
      if (other == com.google.cloud.alloydb.v1.ConnectionInfo.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getInstanceUid().isEmpty()) {
        instanceUid_ = other.instanceUid_;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                ipAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 34:
              {
                instanceUid_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
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
     * The name of the ConnectionInfo singleton resource, e.g.:
     * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
     * This field currently has no semantic meaning.
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
     * The name of the ConnectionInfo singleton resource, e.g.:
     * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
     * This field currently has no semantic meaning.
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
     * The name of the ConnectionInfo singleton resource, e.g.:
     * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
     * This field currently has no semantic meaning.
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
     * The name of the ConnectionInfo singleton resource, e.g.:
     * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
     * This field currently has no semantic meaning.
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
     * The name of the ConnectionInfo singleton resource, e.g.:
     * projects/{project}/locations/{location}/clusters/&#42;&#47;instances/&#42;&#47;connectionInfo
     * This field currently has no semantic meaning.
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

    private java.lang.Object ipAddress_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The private network IP address for the Instance. This is the
     * default IP for the instance and is always created (even if enable_public_ip
     * is set). This is the connection endpoint for an end-user application.
     * </pre>
     *
     * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The private network IP address for the Instance. This is the
     * default IP for the instance and is always created (even if enable_public_ip
     * is set). This is the connection endpoint for an end-user application.
     * </pre>
     *
     * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The private network IP address for the Instance. This is the
     * default IP for the instance and is always created (even if enable_public_ip
     * is set). This is the connection endpoint for an end-user application.
     * </pre>
     *
     * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ipAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The private network IP address for the Instance. This is the
     * default IP for the instance and is always created (even if enable_public_ip
     * is set). This is the connection endpoint for an end-user application.
     * </pre>
     *
     * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {
      ipAddress_ = getDefaultInstance().getIpAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The private network IP address for the Instance. This is the
     * default IP for the instance and is always created (even if enable_public_ip
     * is set). This is the connection endpoint for an end-user application.
     * </pre>
     *
     * <code>string ip_address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ipAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object instanceUid_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The unique ID of the Instance.
     * </pre>
     *
     * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The instanceUid.
     */
    public java.lang.String getInstanceUid() {
      java.lang.Object ref = instanceUid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceUid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique ID of the Instance.
     * </pre>
     *
     * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for instanceUid.
     */
    public com.google.protobuf.ByteString getInstanceUidBytes() {
      java.lang.Object ref = instanceUid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique ID of the Instance.
     * </pre>
     *
     * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The instanceUid to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceUid(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instanceUid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique ID of the Instance.
     * </pre>
     *
     * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceUid() {
      instanceUid_ = getDefaultInstance().getInstanceUid();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique ID of the Instance.
     * </pre>
     *
     * <code>string instance_uid = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for instanceUid to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceUidBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instanceUid_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1.ConnectionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1.ConnectionInfo)
  private static final com.google.cloud.alloydb.v1.ConnectionInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1.ConnectionInfo();
  }

  public static com.google.cloud.alloydb.v1.ConnectionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectionInfo> PARSER =
      new com.google.protobuf.AbstractParser<ConnectionInfo>() {
        @java.lang.Override
        public ConnectionInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1.ConnectionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

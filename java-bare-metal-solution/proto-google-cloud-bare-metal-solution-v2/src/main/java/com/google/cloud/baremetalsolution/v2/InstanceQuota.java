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
// source: google/cloud/baremetalsolution/v2/provisioning.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * A resource budget.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.InstanceQuota}
 */
public final class InstanceQuota extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.InstanceQuota)
    InstanceQuotaOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceQuota.newBuilder() to construct.
  private InstanceQuota(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceQuota() {
    name_ = "";
    instanceType_ = "";
    gcpService_ = "";
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceQuota();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.ProvisioningProto
        .internal_static_google_cloud_baremetalsolution_v2_InstanceQuota_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.ProvisioningProto
        .internal_static_google_cloud_baremetalsolution_v2_InstanceQuota_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.InstanceQuota.class,
            com.google.cloud.baremetalsolution.v2.InstanceQuota.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The name of the instance quota.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. The name of the instance quota.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

  public static final int INSTANCE_TYPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceType_ = "";
  /**
   *
   *
   * <pre>
   * Instance type.
   * Deprecated: use gcp_service.
   * </pre>
   *
   * <code>string instance_type = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
   *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
   * @return The instanceType.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getInstanceType() {
    java.lang.Object ref = instanceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Instance type.
   * Deprecated: use gcp_service.
   * </pre>
   *
   * <code>string instance_type = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
   *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
   * @return The bytes for instanceType.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getInstanceTypeBytes() {
    java.lang.Object ref = instanceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCP_SERVICE_FIELD_NUMBER = 5;

  @SuppressWarnings("serial")
  private volatile java.lang.Object gcpService_ = "";
  /**
   *
   *
   * <pre>
   * The gcp service of the provisioning quota.
   * </pre>
   *
   * <code>string gcp_service = 5;</code>
   *
   * @return The gcpService.
   */
  @java.lang.Override
  public java.lang.String getGcpService() {
    java.lang.Object ref = gcpService_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcpService_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The gcp service of the provisioning quota.
   * </pre>
   *
   * <code>string gcp_service = 5;</code>
   *
   * @return The bytes for gcpService.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGcpServiceBytes() {
    java.lang.Object ref = gcpService_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gcpService_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   *
   *
   * <pre>
   * Location where the quota applies.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Location where the quota applies.
   * </pre>
   *
   * <code>string location = 3;</code>
   *
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AVAILABLE_MACHINE_COUNT_FIELD_NUMBER = 4;
  private int availableMachineCount_ = 0;
  /**
   *
   *
   * <pre>
   * Number of machines than can be created for the given location and
   * instance_type.
   * </pre>
   *
   * <code>int32 available_machine_count = 4;</code>
   *
   * @return The availableMachineCount.
   */
  @java.lang.Override
  public int getAvailableMachineCount() {
    return availableMachineCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instanceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, location_);
    }
    if (availableMachineCount_ != 0) {
      output.writeInt32(4, availableMachineCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcpService_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, gcpService_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instanceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, location_);
    }
    if (availableMachineCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, availableMachineCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcpService_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, gcpService_);
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.InstanceQuota)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.InstanceQuota other =
        (com.google.cloud.baremetalsolution.v2.InstanceQuota) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getInstanceType().equals(other.getInstanceType())) return false;
    if (!getGcpService().equals(other.getGcpService())) return false;
    if (!getLocation().equals(other.getLocation())) return false;
    if (getAvailableMachineCount() != other.getAvailableMachineCount()) return false;
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
    hash = (37 * hash) + INSTANCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceType().hashCode();
    hash = (37 * hash) + GCP_SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getGcpService().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + AVAILABLE_MACHINE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableMachineCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota parseFrom(
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

  public static Builder newBuilder(com.google.cloud.baremetalsolution.v2.InstanceQuota prototype) {
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
   * A resource budget.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.InstanceQuota}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.InstanceQuota)
      com.google.cloud.baremetalsolution.v2.InstanceQuotaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.ProvisioningProto
          .internal_static_google_cloud_baremetalsolution_v2_InstanceQuota_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.ProvisioningProto
          .internal_static_google_cloud_baremetalsolution_v2_InstanceQuota_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.InstanceQuota.class,
              com.google.cloud.baremetalsolution.v2.InstanceQuota.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.InstanceQuota.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      instanceType_ = "";
      gcpService_ = "";
      location_ = "";
      availableMachineCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.ProvisioningProto
          .internal_static_google_cloud_baremetalsolution_v2_InstanceQuota_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.InstanceQuota getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.InstanceQuota.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.InstanceQuota build() {
      com.google.cloud.baremetalsolution.v2.InstanceQuota result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.InstanceQuota buildPartial() {
      com.google.cloud.baremetalsolution.v2.InstanceQuota result =
          new com.google.cloud.baremetalsolution.v2.InstanceQuota(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.baremetalsolution.v2.InstanceQuota result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.instanceType_ = instanceType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.gcpService_ = gcpService_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.location_ = location_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.availableMachineCount_ = availableMachineCount_;
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.InstanceQuota) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.InstanceQuota) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.InstanceQuota other) {
      if (other == com.google.cloud.baremetalsolution.v2.InstanceQuota.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getInstanceType().isEmpty()) {
        instanceType_ = other.instanceType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getGcpService().isEmpty()) {
        gcpService_ = other.gcpService_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getAvailableMachineCount() != 0) {
        setAvailableMachineCount(other.getAvailableMachineCount());
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
                instanceType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                location_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 26
            case 32:
              {
                availableMachineCount_ = input.readInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 32
            case 42:
              {
                gcpService_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 42
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
     * Output only. The name of the instance quota.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The name of the instance quota.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The name of the instance quota.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The name of the instance quota.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The name of the instance quota.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    private java.lang.Object instanceType_ = "";
    /**
     *
     *
     * <pre>
     * Instance type.
     * Deprecated: use gcp_service.
     * </pre>
     *
     * <code>string instance_type = 2 [deprecated = true];</code>
     *
     * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
     *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
     * @return The instanceType.
     */
    @java.lang.Deprecated
    public java.lang.String getInstanceType() {
      java.lang.Object ref = instanceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Instance type.
     * Deprecated: use gcp_service.
     * </pre>
     *
     * <code>string instance_type = 2 [deprecated = true];</code>
     *
     * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
     *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
     * @return The bytes for instanceType.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getInstanceTypeBytes() {
      java.lang.Object ref = instanceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Instance type.
     * Deprecated: use gcp_service.
     * </pre>
     *
     * <code>string instance_type = 2 [deprecated = true];</code>
     *
     * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
     *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
     * @param value The instanceType to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setInstanceType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instanceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Instance type.
     * Deprecated: use gcp_service.
     * </pre>
     *
     * <code>string instance_type = 2 [deprecated = true];</code>
     *
     * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
     *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearInstanceType() {
      instanceType_ = getDefaultInstance().getInstanceType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Instance type.
     * Deprecated: use gcp_service.
     * </pre>
     *
     * <code>string instance_type = 2 [deprecated = true];</code>
     *
     * @deprecated google.cloud.baremetalsolution.v2.InstanceQuota.instance_type is deprecated. See
     *     google/cloud/baremetalsolution/v2/provisioning.proto;l=550
     * @param value The bytes for instanceType to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setInstanceTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instanceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object gcpService_ = "";
    /**
     *
     *
     * <pre>
     * The gcp service of the provisioning quota.
     * </pre>
     *
     * <code>string gcp_service = 5;</code>
     *
     * @return The gcpService.
     */
    public java.lang.String getGcpService() {
      java.lang.Object ref = gcpService_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcpService_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The gcp service of the provisioning quota.
     * </pre>
     *
     * <code>string gcp_service = 5;</code>
     *
     * @return The bytes for gcpService.
     */
    public com.google.protobuf.ByteString getGcpServiceBytes() {
      java.lang.Object ref = gcpService_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gcpService_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The gcp service of the provisioning quota.
     * </pre>
     *
     * <code>string gcp_service = 5;</code>
     *
     * @param value The gcpService to set.
     * @return This builder for chaining.
     */
    public Builder setGcpService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gcpService_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The gcp service of the provisioning quota.
     * </pre>
     *
     * <code>string gcp_service = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcpService() {
      gcpService_ = getDefaultInstance().getGcpService();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The gcp service of the provisioning quota.
     * </pre>
     *
     * <code>string gcp_service = 5;</code>
     *
     * @param value The bytes for gcpService to set.
     * @return This builder for chaining.
     */
    public Builder setGcpServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gcpService_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     *
     *
     * <pre>
     * Location where the quota applies.
     * </pre>
     *
     * <code>string location = 3;</code>
     *
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Location where the quota applies.
     * </pre>
     *
     * <code>string location = 3;</code>
     *
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Location where the quota applies.
     * </pre>
     *
     * <code>string location = 3;</code>
     *
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      location_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Location where the quota applies.
     * </pre>
     *
     * <code>string location = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Location where the quota applies.
     * </pre>
     *
     * <code>string location = 3;</code>
     *
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int availableMachineCount_;
    /**
     *
     *
     * <pre>
     * Number of machines than can be created for the given location and
     * instance_type.
     * </pre>
     *
     * <code>int32 available_machine_count = 4;</code>
     *
     * @return The availableMachineCount.
     */
    @java.lang.Override
    public int getAvailableMachineCount() {
      return availableMachineCount_;
    }
    /**
     *
     *
     * <pre>
     * Number of machines than can be created for the given location and
     * instance_type.
     * </pre>
     *
     * <code>int32 available_machine_count = 4;</code>
     *
     * @param value The availableMachineCount to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableMachineCount(int value) {

      availableMachineCount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of machines than can be created for the given location and
     * instance_type.
     * </pre>
     *
     * <code>int32 available_machine_count = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAvailableMachineCount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      availableMachineCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.InstanceQuota)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.InstanceQuota)
  private static final com.google.cloud.baremetalsolution.v2.InstanceQuota DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.InstanceQuota();
  }

  public static com.google.cloud.baremetalsolution.v2.InstanceQuota getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceQuota> PARSER =
      new com.google.protobuf.AbstractParser<InstanceQuota>() {
        @java.lang.Override
        public InstanceQuota parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceQuota> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceQuota> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.InstanceQuota getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

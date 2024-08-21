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
// source: google/cloud/apihub/v1/apihub_service.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.apihub.v1;

/**
 *
 *
 * <pre>
 * The [UpdateExternalApi][google.cloud.apihub.v1.ApiHub.UpdateExternalApi]
 * method's request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apihub.v1.UpdateExternalApiRequest}
 */
public final class UpdateExternalApiRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apihub.v1.UpdateExternalApiRequest)
    UpdateExternalApiRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateExternalApiRequest.newBuilder() to construct.
  private UpdateExternalApiRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateExternalApiRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateExternalApiRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apihub.v1.ApiHubServiceProto
        .internal_static_google_cloud_apihub_v1_UpdateExternalApiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apihub.v1.ApiHubServiceProto
        .internal_static_google_cloud_apihub_v1_UpdateExternalApiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apihub.v1.UpdateExternalApiRequest.class,
            com.google.cloud.apihub.v1.UpdateExternalApiRequest.Builder.class);
  }

  private int bitField0_;
  public static final int EXTERNAL_API_FIELD_NUMBER = 1;
  private com.google.cloud.apihub.v1.ExternalApi externalApi_;
  /**
   *
   *
   * <pre>
   * Required. The External API resource to update.
   *
   * The External API resource's `name` field is used to identify the External
   * API resource to update. Format:
   * `projects/{project}/locations/{location}/externalApis/{externalApi}`
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the externalApi field is set.
   */
  @java.lang.Override
  public boolean hasExternalApi() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The External API resource to update.
   *
   * The External API resource's `name` field is used to identify the External
   * API resource to update. Format:
   * `projects/{project}/locations/{location}/externalApis/{externalApi}`
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The externalApi.
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.ExternalApi getExternalApi() {
    return externalApi_ == null
        ? com.google.cloud.apihub.v1.ExternalApi.getDefaultInstance()
        : externalApi_;
  }
  /**
   *
   *
   * <pre>
   * Required. The External API resource to update.
   *
   * The External API resource's `name` field is used to identify the External
   * API resource to update. Format:
   * `projects/{project}/locations/{location}/externalApis/{externalApi}`
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.ExternalApiOrBuilder getExternalApiOrBuilder() {
    return externalApi_ == null
        ? com.google.cloud.apihub.v1.ExternalApi.getDefaultInstance()
        : externalApi_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getExternalApi());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getExternalApi());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.apihub.v1.UpdateExternalApiRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apihub.v1.UpdateExternalApiRequest other =
        (com.google.cloud.apihub.v1.UpdateExternalApiRequest) obj;

    if (hasExternalApi() != other.hasExternalApi()) return false;
    if (hasExternalApi()) {
      if (!getExternalApi().equals(other.getExternalApi())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasExternalApi()) {
      hash = (37 * hash) + EXTERNAL_API_FIELD_NUMBER;
      hash = (53 * hash) + getExternalApi().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.apihub.v1.UpdateExternalApiRequest prototype) {
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
   * The [UpdateExternalApi][google.cloud.apihub.v1.ApiHub.UpdateExternalApi]
   * method's request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apihub.v1.UpdateExternalApiRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apihub.v1.UpdateExternalApiRequest)
      com.google.cloud.apihub.v1.UpdateExternalApiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apihub.v1.ApiHubServiceProto
          .internal_static_google_cloud_apihub_v1_UpdateExternalApiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apihub.v1.ApiHubServiceProto
          .internal_static_google_cloud_apihub_v1_UpdateExternalApiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apihub.v1.UpdateExternalApiRequest.class,
              com.google.cloud.apihub.v1.UpdateExternalApiRequest.Builder.class);
    }

    // Construct using com.google.cloud.apihub.v1.UpdateExternalApiRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getExternalApiFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      externalApi_ = null;
      if (externalApiBuilder_ != null) {
        externalApiBuilder_.dispose();
        externalApiBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apihub.v1.ApiHubServiceProto
          .internal_static_google_cloud_apihub_v1_UpdateExternalApiRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.UpdateExternalApiRequest getDefaultInstanceForType() {
      return com.google.cloud.apihub.v1.UpdateExternalApiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.UpdateExternalApiRequest build() {
      com.google.cloud.apihub.v1.UpdateExternalApiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.UpdateExternalApiRequest buildPartial() {
      com.google.cloud.apihub.v1.UpdateExternalApiRequest result =
          new com.google.cloud.apihub.v1.UpdateExternalApiRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apihub.v1.UpdateExternalApiRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.externalApi_ =
            externalApiBuilder_ == null ? externalApi_ : externalApiBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.apihub.v1.UpdateExternalApiRequest) {
        return mergeFrom((com.google.cloud.apihub.v1.UpdateExternalApiRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apihub.v1.UpdateExternalApiRequest other) {
      if (other == com.google.cloud.apihub.v1.UpdateExternalApiRequest.getDefaultInstance())
        return this;
      if (other.hasExternalApi()) {
        mergeExternalApi(other.getExternalApi());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getExternalApiFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.apihub.v1.ExternalApi externalApi_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.ExternalApi,
            com.google.cloud.apihub.v1.ExternalApi.Builder,
            com.google.cloud.apihub.v1.ExternalApiOrBuilder>
        externalApiBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the externalApi field is set.
     */
    public boolean hasExternalApi() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The externalApi.
     */
    public com.google.cloud.apihub.v1.ExternalApi getExternalApi() {
      if (externalApiBuilder_ == null) {
        return externalApi_ == null
            ? com.google.cloud.apihub.v1.ExternalApi.getDefaultInstance()
            : externalApi_;
      } else {
        return externalApiBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExternalApi(com.google.cloud.apihub.v1.ExternalApi value) {
      if (externalApiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        externalApi_ = value;
      } else {
        externalApiBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExternalApi(com.google.cloud.apihub.v1.ExternalApi.Builder builderForValue) {
      if (externalApiBuilder_ == null) {
        externalApi_ = builderForValue.build();
      } else {
        externalApiBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeExternalApi(com.google.cloud.apihub.v1.ExternalApi value) {
      if (externalApiBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && externalApi_ != null
            && externalApi_ != com.google.cloud.apihub.v1.ExternalApi.getDefaultInstance()) {
          getExternalApiBuilder().mergeFrom(value);
        } else {
          externalApi_ = value;
        }
      } else {
        externalApiBuilder_.mergeFrom(value);
      }
      if (externalApi_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearExternalApi() {
      bitField0_ = (bitField0_ & ~0x00000001);
      externalApi_ = null;
      if (externalApiBuilder_ != null) {
        externalApiBuilder_.dispose();
        externalApiBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apihub.v1.ExternalApi.Builder getExternalApiBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExternalApiFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apihub.v1.ExternalApiOrBuilder getExternalApiOrBuilder() {
      if (externalApiBuilder_ != null) {
        return externalApiBuilder_.getMessageOrBuilder();
      } else {
        return externalApi_ == null
            ? com.google.cloud.apihub.v1.ExternalApi.getDefaultInstance()
            : externalApi_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The External API resource to update.
     *
     * The External API resource's `name` field is used to identify the External
     * API resource to update. Format:
     * `projects/{project}/locations/{location}/externalApis/{externalApi}`
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.ExternalApi external_api = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.ExternalApi,
            com.google.cloud.apihub.v1.ExternalApi.Builder,
            com.google.cloud.apihub.v1.ExternalApiOrBuilder>
        getExternalApiFieldBuilder() {
      if (externalApiBuilder_ == null) {
        externalApiBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apihub.v1.ExternalApi,
                com.google.cloud.apihub.v1.ExternalApi.Builder,
                com.google.cloud.apihub.v1.ExternalApiOrBuilder>(
                getExternalApi(), getParentForChildren(), isClean());
        externalApi_ = null;
      }
      return externalApiBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apihub.v1.UpdateExternalApiRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apihub.v1.UpdateExternalApiRequest)
  private static final com.google.cloud.apihub.v1.UpdateExternalApiRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apihub.v1.UpdateExternalApiRequest();
  }

  public static com.google.cloud.apihub.v1.UpdateExternalApiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateExternalApiRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateExternalApiRequest>() {
        @java.lang.Override
        public UpdateExternalApiRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateExternalApiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateExternalApiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apihub.v1.UpdateExternalApiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

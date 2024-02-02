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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * Request to update a saved query.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.UpdateSavedQueryRequest}
 */
public final class UpdateSavedQueryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.UpdateSavedQueryRequest)
    UpdateSavedQueryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateSavedQueryRequest.newBuilder() to construct.
  private UpdateSavedQueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateSavedQueryRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateSavedQueryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_UpdateSavedQueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_UpdateSavedQueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.UpdateSavedQueryRequest.class,
            com.google.cloud.asset.v1.UpdateSavedQueryRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SAVED_QUERY_FIELD_NUMBER = 1;
  private com.google.cloud.asset.v1.SavedQuery savedQuery_;
  /**
   *
   *
   * <pre>
   * Required. The saved query to update.
   *
   * The saved query's `name` field is used to identify the one to update,
   * which has format as below:
   *
   * * projects/project_number/savedQueries/saved_query_id
   * * folders/folder_number/savedQueries/saved_query_id
   * * organizations/organization_number/savedQueries/saved_query_id
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the savedQuery field is set.
   */
  @java.lang.Override
  public boolean hasSavedQuery() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The saved query to update.
   *
   * The saved query's `name` field is used to identify the one to update,
   * which has format as below:
   *
   * * projects/project_number/savedQueries/saved_query_id
   * * folders/folder_number/savedQueries/saved_query_id
   * * organizations/organization_number/savedQueries/saved_query_id
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The savedQuery.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.SavedQuery getSavedQuery() {
    return savedQuery_ == null
        ? com.google.cloud.asset.v1.SavedQuery.getDefaultInstance()
        : savedQuery_;
  }
  /**
   *
   *
   * <pre>
   * Required. The saved query to update.
   *
   * The saved query's `name` field is used to identify the one to update,
   * which has format as below:
   *
   * * projects/project_number/savedQueries/saved_query_id
   * * folders/folder_number/savedQueries/saved_query_id
   * * organizations/organization_number/savedQueries/saved_query_id
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.SavedQueryOrBuilder getSavedQueryOrBuilder() {
    return savedQuery_ == null
        ? com.google.cloud.asset.v1.SavedQuery.getDefaultInstance()
        : savedQuery_;
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
      output.writeMessage(1, getSavedQuery());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSavedQuery());
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
    if (!(obj instanceof com.google.cloud.asset.v1.UpdateSavedQueryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.UpdateSavedQueryRequest other =
        (com.google.cloud.asset.v1.UpdateSavedQueryRequest) obj;

    if (hasSavedQuery() != other.hasSavedQuery()) return false;
    if (hasSavedQuery()) {
      if (!getSavedQuery().equals(other.getSavedQuery())) return false;
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
    if (hasSavedQuery()) {
      hash = (37 * hash) + SAVED_QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getSavedQuery().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.UpdateSavedQueryRequest prototype) {
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
   * Request to update a saved query.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.UpdateSavedQueryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.UpdateSavedQueryRequest)
      com.google.cloud.asset.v1.UpdateSavedQueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_UpdateSavedQueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_UpdateSavedQueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.UpdateSavedQueryRequest.class,
              com.google.cloud.asset.v1.UpdateSavedQueryRequest.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.UpdateSavedQueryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSavedQueryFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      savedQuery_ = null;
      if (savedQueryBuilder_ != null) {
        savedQueryBuilder_.dispose();
        savedQueryBuilder_ = null;
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
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_UpdateSavedQueryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.UpdateSavedQueryRequest getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.UpdateSavedQueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.UpdateSavedQueryRequest build() {
      com.google.cloud.asset.v1.UpdateSavedQueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.UpdateSavedQueryRequest buildPartial() {
      com.google.cloud.asset.v1.UpdateSavedQueryRequest result =
          new com.google.cloud.asset.v1.UpdateSavedQueryRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1.UpdateSavedQueryRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.savedQuery_ = savedQueryBuilder_ == null ? savedQuery_ : savedQueryBuilder_.build();
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
      if (other instanceof com.google.cloud.asset.v1.UpdateSavedQueryRequest) {
        return mergeFrom((com.google.cloud.asset.v1.UpdateSavedQueryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.UpdateSavedQueryRequest other) {
      if (other == com.google.cloud.asset.v1.UpdateSavedQueryRequest.getDefaultInstance())
        return this;
      if (other.hasSavedQuery()) {
        mergeSavedQuery(other.getSavedQuery());
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
                input.readMessage(getSavedQueryFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.asset.v1.SavedQuery savedQuery_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.SavedQuery,
            com.google.cloud.asset.v1.SavedQuery.Builder,
            com.google.cloud.asset.v1.SavedQueryOrBuilder>
        savedQueryBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the savedQuery field is set.
     */
    public boolean hasSavedQuery() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The savedQuery.
     */
    public com.google.cloud.asset.v1.SavedQuery getSavedQuery() {
      if (savedQueryBuilder_ == null) {
        return savedQuery_ == null
            ? com.google.cloud.asset.v1.SavedQuery.getDefaultInstance()
            : savedQuery_;
      } else {
        return savedQueryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSavedQuery(com.google.cloud.asset.v1.SavedQuery value) {
      if (savedQueryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        savedQuery_ = value;
      } else {
        savedQueryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSavedQuery(com.google.cloud.asset.v1.SavedQuery.Builder builderForValue) {
      if (savedQueryBuilder_ == null) {
        savedQuery_ = builderForValue.build();
      } else {
        savedQueryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSavedQuery(com.google.cloud.asset.v1.SavedQuery value) {
      if (savedQueryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && savedQuery_ != null
            && savedQuery_ != com.google.cloud.asset.v1.SavedQuery.getDefaultInstance()) {
          getSavedQueryBuilder().mergeFrom(value);
        } else {
          savedQuery_ = value;
        }
      } else {
        savedQueryBuilder_.mergeFrom(value);
      }
      if (savedQuery_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSavedQuery() {
      bitField0_ = (bitField0_ & ~0x00000001);
      savedQuery_ = null;
      if (savedQueryBuilder_ != null) {
        savedQueryBuilder_.dispose();
        savedQueryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.asset.v1.SavedQuery.Builder getSavedQueryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSavedQueryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.asset.v1.SavedQueryOrBuilder getSavedQueryOrBuilder() {
      if (savedQueryBuilder_ != null) {
        return savedQueryBuilder_.getMessageOrBuilder();
      } else {
        return savedQuery_ == null
            ? com.google.cloud.asset.v1.SavedQuery.getDefaultInstance()
            : savedQuery_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The saved query to update.
     *
     * The saved query's `name` field is used to identify the one to update,
     * which has format as below:
     *
     * * projects/project_number/savedQueries/saved_query_id
     * * folders/folder_number/savedQueries/saved_query_id
     * * organizations/organization_number/savedQueries/saved_query_id
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.SavedQuery saved_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.SavedQuery,
            com.google.cloud.asset.v1.SavedQuery.Builder,
            com.google.cloud.asset.v1.SavedQueryOrBuilder>
        getSavedQueryFieldBuilder() {
      if (savedQueryBuilder_ == null) {
        savedQueryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.asset.v1.SavedQuery,
                com.google.cloud.asset.v1.SavedQuery.Builder,
                com.google.cloud.asset.v1.SavedQueryOrBuilder>(
                getSavedQuery(), getParentForChildren(), isClean());
        savedQuery_ = null;
      }
      return savedQueryBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.UpdateSavedQueryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.UpdateSavedQueryRequest)
  private static final com.google.cloud.asset.v1.UpdateSavedQueryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.UpdateSavedQueryRequest();
  }

  public static com.google.cloud.asset.v1.UpdateSavedQueryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSavedQueryRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateSavedQueryRequest>() {
        @java.lang.Override
        public UpdateSavedQueryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSavedQueryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSavedQueryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.UpdateSavedQueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

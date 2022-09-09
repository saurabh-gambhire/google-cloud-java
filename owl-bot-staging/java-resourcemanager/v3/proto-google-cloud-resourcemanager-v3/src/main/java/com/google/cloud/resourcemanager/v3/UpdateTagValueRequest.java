// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/tag_values.proto

package com.google.cloud.resourcemanager.v3;

/**
 * <pre>
 * The request message for updating a TagValue.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.UpdateTagValueRequest}
 */
public final class UpdateTagValueRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.UpdateTagValueRequest)
    UpdateTagValueRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTagValueRequest.newBuilder() to construct.
  private UpdateTagValueRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTagValueRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTagValueRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateTagValueRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.resourcemanager.v3.TagValue.Builder subBuilder = null;
            if (tagValue_ != null) {
              subBuilder = tagValue_.toBuilder();
            }
            tagValue_ = input.readMessage(com.google.cloud.resourcemanager.v3.TagValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tagValue_);
              tagValue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            validateOnly_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.resourcemanager.v3.TagValuesProto.internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.TagValuesProto.internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.UpdateTagValueRequest.class, com.google.cloud.resourcemanager.v3.UpdateTagValueRequest.Builder.class);
  }

  public static final int TAG_VALUE_FIELD_NUMBER = 1;
  private com.google.cloud.resourcemanager.v3.TagValue tagValue_;
  /**
   * <pre>
   * Required. The new definition of the TagValue. Only fields `description` and `etag`
   * fields can be updated by this request. If the `etag` field is nonempty, it
   * must match the `etag` field of the existing ControlGroup. Otherwise,
   * `FAILED_PRECONDITION` will be returned.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tagValue field is set.
   */
  @java.lang.Override
  public boolean hasTagValue() {
    return tagValue_ != null;
  }
  /**
   * <pre>
   * Required. The new definition of the TagValue. Only fields `description` and `etag`
   * fields can be updated by this request. If the `etag` field is nonempty, it
   * must match the `etag` field of the existing ControlGroup. Otherwise,
   * `FAILED_PRECONDITION` will be returned.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagValue.
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagValue getTagValue() {
    return tagValue_ == null ? com.google.cloud.resourcemanager.v3.TagValue.getDefaultInstance() : tagValue_;
  }
  /**
   * <pre>
   * Required. The new definition of the TagValue. Only fields `description` and `etag`
   * fields can be updated by this request. If the `etag` field is nonempty, it
   * must match the `etag` field of the existing ControlGroup. Otherwise,
   * `FAILED_PRECONDITION` will be returned.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagValueOrBuilder getTagValueOrBuilder() {
    return getTagValue();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Optional. Fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Optional. Fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Optional. Fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_;
  /**
   * <pre>
   * Optional. True to perform validations necessary for updating the resource, but not
   * actually perform the action.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tagValue_ != null) {
      output.writeMessage(1, getTagValue());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tagValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTagValue());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, validateOnly_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.UpdateTagValueRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.UpdateTagValueRequest other = (com.google.cloud.resourcemanager.v3.UpdateTagValueRequest) obj;

    if (hasTagValue() != other.hasTagValue()) return false;
    if (hasTagValue()) {
      if (!getTagValue()
          .equals(other.getTagValue())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTagValue()) {
      hash = (37 * hash) + TAG_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getTagValue().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.resourcemanager.v3.UpdateTagValueRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request message for updating a TagValue.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.UpdateTagValueRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.UpdateTagValueRequest)
      com.google.cloud.resourcemanager.v3.UpdateTagValueRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.resourcemanager.v3.TagValuesProto.internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.TagValuesProto.internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.UpdateTagValueRequest.class, com.google.cloud.resourcemanager.v3.UpdateTagValueRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.UpdateTagValueRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tagValueBuilder_ == null) {
        tagValue_ = null;
      } else {
        tagValue_ = null;
        tagValueBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.TagValuesProto.internal_static_google_cloud_resourcemanager_v3_UpdateTagValueRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateTagValueRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.UpdateTagValueRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateTagValueRequest build() {
      com.google.cloud.resourcemanager.v3.UpdateTagValueRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateTagValueRequest buildPartial() {
      com.google.cloud.resourcemanager.v3.UpdateTagValueRequest result = new com.google.cloud.resourcemanager.v3.UpdateTagValueRequest(this);
      if (tagValueBuilder_ == null) {
        result.tagValue_ = tagValue_;
      } else {
        result.tagValue_ = tagValueBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.resourcemanager.v3.UpdateTagValueRequest) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.UpdateTagValueRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.UpdateTagValueRequest other) {
      if (other == com.google.cloud.resourcemanager.v3.UpdateTagValueRequest.getDefaultInstance()) return this;
      if (other.hasTagValue()) {
        mergeTagValue(other.getTagValue());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.resourcemanager.v3.UpdateTagValueRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.resourcemanager.v3.UpdateTagValueRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.resourcemanager.v3.TagValue tagValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.resourcemanager.v3.TagValue, com.google.cloud.resourcemanager.v3.TagValue.Builder, com.google.cloud.resourcemanager.v3.TagValueOrBuilder> tagValueBuilder_;
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the tagValue field is set.
     */
    public boolean hasTagValue() {
      return tagValueBuilder_ != null || tagValue_ != null;
    }
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tagValue.
     */
    public com.google.cloud.resourcemanager.v3.TagValue getTagValue() {
      if (tagValueBuilder_ == null) {
        return tagValue_ == null ? com.google.cloud.resourcemanager.v3.TagValue.getDefaultInstance() : tagValue_;
      } else {
        return tagValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTagValue(com.google.cloud.resourcemanager.v3.TagValue value) {
      if (tagValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tagValue_ = value;
        onChanged();
      } else {
        tagValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTagValue(
        com.google.cloud.resourcemanager.v3.TagValue.Builder builderForValue) {
      if (tagValueBuilder_ == null) {
        tagValue_ = builderForValue.build();
        onChanged();
      } else {
        tagValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTagValue(com.google.cloud.resourcemanager.v3.TagValue value) {
      if (tagValueBuilder_ == null) {
        if (tagValue_ != null) {
          tagValue_ =
            com.google.cloud.resourcemanager.v3.TagValue.newBuilder(tagValue_).mergeFrom(value).buildPartial();
        } else {
          tagValue_ = value;
        }
        onChanged();
      } else {
        tagValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTagValue() {
      if (tagValueBuilder_ == null) {
        tagValue_ = null;
        onChanged();
      } else {
        tagValue_ = null;
        tagValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.resourcemanager.v3.TagValue.Builder getTagValueBuilder() {
      
      onChanged();
      return getTagValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.resourcemanager.v3.TagValueOrBuilder getTagValueOrBuilder() {
      if (tagValueBuilder_ != null) {
        return tagValueBuilder_.getMessageOrBuilder();
      } else {
        return tagValue_ == null ?
            com.google.cloud.resourcemanager.v3.TagValue.getDefaultInstance() : tagValue_;
      }
    }
    /**
     * <pre>
     * Required. The new definition of the TagValue. Only fields `description` and `etag`
     * fields can be updated by this request. If the `etag` field is nonempty, it
     * must match the `etag` field of the existing ControlGroup. Otherwise,
     * `FAILED_PRECONDITION` will be returned.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.TagValue tag_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.resourcemanager.v3.TagValue, com.google.cloud.resourcemanager.v3.TagValue.Builder, com.google.cloud.resourcemanager.v3.TagValueOrBuilder> 
        getTagValueFieldBuilder() {
      if (tagValueBuilder_ == null) {
        tagValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagValue, com.google.cloud.resourcemanager.v3.TagValue.Builder, com.google.cloud.resourcemanager.v3.TagValueOrBuilder>(
                getTagValue(),
                getParentForChildren(),
                isClean());
        tagValue_ = null;
      }
      return tagValueBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Optional. Fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * Optional. True to perform validations necessary for updating the resource, but not
     * actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * Optional. True to perform validations necessary for updating the resource, but not
     * actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {
      
      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. True to perform validations necessary for updating the resource, but not
     * actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      
      validateOnly_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.UpdateTagValueRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.UpdateTagValueRequest)
  private static final com.google.cloud.resourcemanager.v3.UpdateTagValueRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.UpdateTagValueRequest();
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagValueRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTagValueRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTagValueRequest>() {
    @java.lang.Override
    public UpdateTagValueRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateTagValueRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateTagValueRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTagValueRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.UpdateTagValueRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

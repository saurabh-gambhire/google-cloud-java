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
// source: google/dataflow/v1beta3/environment.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Defines a SDK harness container for executing Dataflow pipelines.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.SdkHarnessContainerImage}
 */
public final class SdkHarnessContainerImage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.SdkHarnessContainerImage)
    SdkHarnessContainerImageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SdkHarnessContainerImage.newBuilder() to construct.
  private SdkHarnessContainerImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SdkHarnessContainerImage() {
    containerImage_ = "";
    environmentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SdkHarnessContainerImage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SdkHarnessContainerImage(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              containerImage_ = s;
              break;
            }
          case 16:
            {
              useSingleCorePerContainer_ = input.readBool();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              environmentId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.EnvironmentProto
        .internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.EnvironmentProto
        .internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.SdkHarnessContainerImage.class,
            com.google.dataflow.v1beta3.SdkHarnessContainerImage.Builder.class);
  }

  public static final int CONTAINER_IMAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object containerImage_;
  /**
   *
   *
   * <pre>
   * A docker container image that resides in Google Container Registry.
   * </pre>
   *
   * <code>string container_image = 1;</code>
   *
   * @return The containerImage.
   */
  @java.lang.Override
  public java.lang.String getContainerImage() {
    java.lang.Object ref = containerImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      containerImage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A docker container image that resides in Google Container Registry.
   * </pre>
   *
   * <code>string container_image = 1;</code>
   *
   * @return The bytes for containerImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContainerImageBytes() {
    java.lang.Object ref = containerImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      containerImage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USE_SINGLE_CORE_PER_CONTAINER_FIELD_NUMBER = 2;
  private boolean useSingleCorePerContainer_;
  /**
   *
   *
   * <pre>
   * If true, recommends the Dataflow service to use only one core per SDK
   * container instance with this image. If false (or unset) recommends using
   * more than one core per SDK container instance with this image for
   * efficiency. Note that Dataflow service may choose to override this property
   * if needed.
   * </pre>
   *
   * <code>bool use_single_core_per_container = 2;</code>
   *
   * @return The useSingleCorePerContainer.
   */
  @java.lang.Override
  public boolean getUseSingleCorePerContainer() {
    return useSingleCorePerContainer_;
  }

  public static final int ENVIRONMENT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object environmentId_;
  /**
   *
   *
   * <pre>
   * Environment ID for the Beam runner API proto Environment that corresponds
   * to the current SDK Harness.
   * </pre>
   *
   * <code>string environment_id = 3;</code>
   *
   * @return The environmentId.
   */
  @java.lang.Override
  public java.lang.String getEnvironmentId() {
    java.lang.Object ref = environmentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      environmentId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Environment ID for the Beam runner API proto Environment that corresponds
   * to the current SDK Harness.
   * </pre>
   *
   * <code>string environment_id = 3;</code>
   *
   * @return The bytes for environmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEnvironmentIdBytes() {
    java.lang.Object ref = environmentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      environmentId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(containerImage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, containerImage_);
    }
    if (useSingleCorePerContainer_ != false) {
      output.writeBool(2, useSingleCorePerContainer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(environmentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, environmentId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(containerImage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, containerImage_);
    }
    if (useSingleCorePerContainer_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, useSingleCorePerContainer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(environmentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, environmentId_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.SdkHarnessContainerImage)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.SdkHarnessContainerImage other =
        (com.google.dataflow.v1beta3.SdkHarnessContainerImage) obj;

    if (!getContainerImage().equals(other.getContainerImage())) return false;
    if (getUseSingleCorePerContainer() != other.getUseSingleCorePerContainer()) return false;
    if (!getEnvironmentId().equals(other.getEnvironmentId())) return false;
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
    hash = (37 * hash) + CONTAINER_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getContainerImage().hashCode();
    hash = (37 * hash) + USE_SINGLE_CORE_PER_CONTAINER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUseSingleCorePerContainer());
    hash = (37 * hash) + ENVIRONMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEnvironmentId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.SdkHarnessContainerImage prototype) {
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
   * Defines a SDK harness container for executing Dataflow pipelines.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.SdkHarnessContainerImage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.SdkHarnessContainerImage)
      com.google.dataflow.v1beta3.SdkHarnessContainerImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.EnvironmentProto
          .internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.EnvironmentProto
          .internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.SdkHarnessContainerImage.class,
              com.google.dataflow.v1beta3.SdkHarnessContainerImage.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.SdkHarnessContainerImage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      containerImage_ = "";

      useSingleCorePerContainer_ = false;

      environmentId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.EnvironmentProto
          .internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SdkHarnessContainerImage getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.SdkHarnessContainerImage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SdkHarnessContainerImage build() {
      com.google.dataflow.v1beta3.SdkHarnessContainerImage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SdkHarnessContainerImage buildPartial() {
      com.google.dataflow.v1beta3.SdkHarnessContainerImage result =
          new com.google.dataflow.v1beta3.SdkHarnessContainerImage(this);
      result.containerImage_ = containerImage_;
      result.useSingleCorePerContainer_ = useSingleCorePerContainer_;
      result.environmentId_ = environmentId_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.dataflow.v1beta3.SdkHarnessContainerImage) {
        return mergeFrom((com.google.dataflow.v1beta3.SdkHarnessContainerImage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.SdkHarnessContainerImage other) {
      if (other == com.google.dataflow.v1beta3.SdkHarnessContainerImage.getDefaultInstance())
        return this;
      if (!other.getContainerImage().isEmpty()) {
        containerImage_ = other.containerImage_;
        onChanged();
      }
      if (other.getUseSingleCorePerContainer() != false) {
        setUseSingleCorePerContainer(other.getUseSingleCorePerContainer());
      }
      if (!other.getEnvironmentId().isEmpty()) {
        environmentId_ = other.environmentId_;
        onChanged();
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
      com.google.dataflow.v1beta3.SdkHarnessContainerImage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.dataflow.v1beta3.SdkHarnessContainerImage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object containerImage_ = "";
    /**
     *
     *
     * <pre>
     * A docker container image that resides in Google Container Registry.
     * </pre>
     *
     * <code>string container_image = 1;</code>
     *
     * @return The containerImage.
     */
    public java.lang.String getContainerImage() {
      java.lang.Object ref = containerImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        containerImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A docker container image that resides in Google Container Registry.
     * </pre>
     *
     * <code>string container_image = 1;</code>
     *
     * @return The bytes for containerImage.
     */
    public com.google.protobuf.ByteString getContainerImageBytes() {
      java.lang.Object ref = containerImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        containerImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A docker container image that resides in Google Container Registry.
     * </pre>
     *
     * <code>string container_image = 1;</code>
     *
     * @param value The containerImage to set.
     * @return This builder for chaining.
     */
    public Builder setContainerImage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      containerImage_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A docker container image that resides in Google Container Registry.
     * </pre>
     *
     * <code>string container_image = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContainerImage() {

      containerImage_ = getDefaultInstance().getContainerImage();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A docker container image that resides in Google Container Registry.
     * </pre>
     *
     * <code>string container_image = 1;</code>
     *
     * @param value The bytes for containerImage to set.
     * @return This builder for chaining.
     */
    public Builder setContainerImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      containerImage_ = value;
      onChanged();
      return this;
    }

    private boolean useSingleCorePerContainer_;
    /**
     *
     *
     * <pre>
     * If true, recommends the Dataflow service to use only one core per SDK
     * container instance with this image. If false (or unset) recommends using
     * more than one core per SDK container instance with this image for
     * efficiency. Note that Dataflow service may choose to override this property
     * if needed.
     * </pre>
     *
     * <code>bool use_single_core_per_container = 2;</code>
     *
     * @return The useSingleCorePerContainer.
     */
    @java.lang.Override
    public boolean getUseSingleCorePerContainer() {
      return useSingleCorePerContainer_;
    }
    /**
     *
     *
     * <pre>
     * If true, recommends the Dataflow service to use only one core per SDK
     * container instance with this image. If false (or unset) recommends using
     * more than one core per SDK container instance with this image for
     * efficiency. Note that Dataflow service may choose to override this property
     * if needed.
     * </pre>
     *
     * <code>bool use_single_core_per_container = 2;</code>
     *
     * @param value The useSingleCorePerContainer to set.
     * @return This builder for chaining.
     */
    public Builder setUseSingleCorePerContainer(boolean value) {

      useSingleCorePerContainer_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, recommends the Dataflow service to use only one core per SDK
     * container instance with this image. If false (or unset) recommends using
     * more than one core per SDK container instance with this image for
     * efficiency. Note that Dataflow service may choose to override this property
     * if needed.
     * </pre>
     *
     * <code>bool use_single_core_per_container = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUseSingleCorePerContainer() {

      useSingleCorePerContainer_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object environmentId_ = "";
    /**
     *
     *
     * <pre>
     * Environment ID for the Beam runner API proto Environment that corresponds
     * to the current SDK Harness.
     * </pre>
     *
     * <code>string environment_id = 3;</code>
     *
     * @return The environmentId.
     */
    public java.lang.String getEnvironmentId() {
      java.lang.Object ref = environmentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        environmentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Environment ID for the Beam runner API proto Environment that corresponds
     * to the current SDK Harness.
     * </pre>
     *
     * <code>string environment_id = 3;</code>
     *
     * @return The bytes for environmentId.
     */
    public com.google.protobuf.ByteString getEnvironmentIdBytes() {
      java.lang.Object ref = environmentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        environmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Environment ID for the Beam runner API proto Environment that corresponds
     * to the current SDK Harness.
     * </pre>
     *
     * <code>string environment_id = 3;</code>
     *
     * @param value The environmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      environmentId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Environment ID for the Beam runner API proto Environment that corresponds
     * to the current SDK Harness.
     * </pre>
     *
     * <code>string environment_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnvironmentId() {

      environmentId_ = getDefaultInstance().getEnvironmentId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Environment ID for the Beam runner API proto Environment that corresponds
     * to the current SDK Harness.
     * </pre>
     *
     * <code>string environment_id = 3;</code>
     *
     * @param value The bytes for environmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      environmentId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.SdkHarnessContainerImage)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.SdkHarnessContainerImage)
  private static final com.google.dataflow.v1beta3.SdkHarnessContainerImage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.SdkHarnessContainerImage();
  }

  public static com.google.dataflow.v1beta3.SdkHarnessContainerImage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SdkHarnessContainerImage> PARSER =
      new com.google.protobuf.AbstractParser<SdkHarnessContainerImage>() {
        @java.lang.Override
        public SdkHarnessContainerImage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SdkHarnessContainerImage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SdkHarnessContainerImage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SdkHarnessContainerImage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.SdkHarnessContainerImage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

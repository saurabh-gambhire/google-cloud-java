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
// source: google/cloud/asset/v1p2beta1/assets.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1p2beta1;

/**
 *
 *
 * <pre>
 * An asset in Google Cloud and its temporal metadata, including the time window
 * when it was observed and its status during that window.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1p2beta1.TemporalAsset}
 */
public final class TemporalAsset extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1p2beta1.TemporalAsset)
    TemporalAssetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TemporalAsset.newBuilder() to construct.
  private TemporalAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TemporalAsset() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TemporalAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1p2beta1.AssetProto
        .internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1p2beta1.AssetProto
        .internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1p2beta1.TemporalAsset.class,
            com.google.cloud.asset.v1p2beta1.TemporalAsset.Builder.class);
  }

  private int bitField0_;
  public static final int WINDOW_FIELD_NUMBER = 1;
  private com.google.cloud.asset.v1p2beta1.TimeWindow window_;
  /**
   *
   *
   * <pre>
   * The time window when the asset data and state was observed.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
   *
   * @return Whether the window field is set.
   */
  @java.lang.Override
  public boolean hasWindow() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The time window when the asset data and state was observed.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
   *
   * @return The window.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.TimeWindow getWindow() {
    return window_ == null
        ? com.google.cloud.asset.v1p2beta1.TimeWindow.getDefaultInstance()
        : window_;
  }
  /**
   *
   *
   * <pre>
   * The time window when the asset data and state was observed.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.TimeWindowOrBuilder getWindowOrBuilder() {
    return window_ == null
        ? com.google.cloud.asset.v1p2beta1.TimeWindow.getDefaultInstance()
        : window_;
  }

  public static final int DELETED_FIELD_NUMBER = 2;
  private boolean deleted_ = false;
  /**
   *
   *
   * <pre>
   * Whether the asset has been deleted or not.
   * </pre>
   *
   * <code>bool deleted = 2;</code>
   *
   * @return The deleted.
   */
  @java.lang.Override
  public boolean getDeleted() {
    return deleted_;
  }

  public static final int ASSET_FIELD_NUMBER = 3;
  private com.google.cloud.asset.v1p2beta1.Asset asset_;
  /**
   *
   *
   * <pre>
   * An asset in Google Cloud.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
   *
   * @return Whether the asset field is set.
   */
  @java.lang.Override
  public boolean hasAsset() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * An asset in Google Cloud.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
   *
   * @return The asset.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.Asset getAsset() {
    return asset_ == null ? com.google.cloud.asset.v1p2beta1.Asset.getDefaultInstance() : asset_;
  }
  /**
   *
   *
   * <pre>
   * An asset in Google Cloud.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.AssetOrBuilder getAssetOrBuilder() {
    return asset_ == null ? com.google.cloud.asset.v1p2beta1.Asset.getDefaultInstance() : asset_;
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
      output.writeMessage(1, getWindow());
    }
    if (deleted_ != false) {
      output.writeBool(2, deleted_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getAsset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWindow());
    }
    if (deleted_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, deleted_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAsset());
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
    if (!(obj instanceof com.google.cloud.asset.v1p2beta1.TemporalAsset)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1p2beta1.TemporalAsset other =
        (com.google.cloud.asset.v1p2beta1.TemporalAsset) obj;

    if (hasWindow() != other.hasWindow()) return false;
    if (hasWindow()) {
      if (!getWindow().equals(other.getWindow())) return false;
    }
    if (getDeleted() != other.getDeleted()) return false;
    if (hasAsset() != other.hasAsset()) return false;
    if (hasAsset()) {
      if (!getAsset().equals(other.getAsset())) return false;
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
    if (hasWindow()) {
      hash = (37 * hash) + WINDOW_FIELD_NUMBER;
      hash = (53 * hash) + getWindow().hashCode();
    }
    hash = (37 * hash) + DELETED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDeleted());
    if (hasAsset()) {
      hash = (37 * hash) + ASSET_FIELD_NUMBER;
      hash = (53 * hash) + getAsset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1p2beta1.TemporalAsset prototype) {
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
   * An asset in Google Cloud and its temporal metadata, including the time window
   * when it was observed and its status during that window.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1p2beta1.TemporalAsset}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1p2beta1.TemporalAsset)
      com.google.cloud.asset.v1p2beta1.TemporalAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1p2beta1.AssetProto
          .internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1p2beta1.AssetProto
          .internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1p2beta1.TemporalAsset.class,
              com.google.cloud.asset.v1p2beta1.TemporalAsset.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1p2beta1.TemporalAsset.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWindowFieldBuilder();
        getAssetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      window_ = null;
      if (windowBuilder_ != null) {
        windowBuilder_.dispose();
        windowBuilder_ = null;
      }
      deleted_ = false;
      asset_ = null;
      if (assetBuilder_ != null) {
        assetBuilder_.dispose();
        assetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1p2beta1.AssetProto
          .internal_static_google_cloud_asset_v1p2beta1_TemporalAsset_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.TemporalAsset getDefaultInstanceForType() {
      return com.google.cloud.asset.v1p2beta1.TemporalAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.TemporalAsset build() {
      com.google.cloud.asset.v1p2beta1.TemporalAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p2beta1.TemporalAsset buildPartial() {
      com.google.cloud.asset.v1p2beta1.TemporalAsset result =
          new com.google.cloud.asset.v1p2beta1.TemporalAsset(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1p2beta1.TemporalAsset result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.window_ = windowBuilder_ == null ? window_ : windowBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deleted_ = deleted_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.asset_ = assetBuilder_ == null ? asset_ : assetBuilder_.build();
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
      if (other instanceof com.google.cloud.asset.v1p2beta1.TemporalAsset) {
        return mergeFrom((com.google.cloud.asset.v1p2beta1.TemporalAsset) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1p2beta1.TemporalAsset other) {
      if (other == com.google.cloud.asset.v1p2beta1.TemporalAsset.getDefaultInstance()) return this;
      if (other.hasWindow()) {
        mergeWindow(other.getWindow());
      }
      if (other.getDeleted() != false) {
        setDeleted(other.getDeleted());
      }
      if (other.hasAsset()) {
        mergeAsset(other.getAsset());
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
                input.readMessage(getWindowFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                deleted_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getAssetFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.asset.v1p2beta1.TimeWindow window_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1p2beta1.TimeWindow,
            com.google.cloud.asset.v1p2beta1.TimeWindow.Builder,
            com.google.cloud.asset.v1p2beta1.TimeWindowOrBuilder>
        windowBuilder_;
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     *
     * @return Whether the window field is set.
     */
    public boolean hasWindow() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     *
     * @return The window.
     */
    public com.google.cloud.asset.v1p2beta1.TimeWindow getWindow() {
      if (windowBuilder_ == null) {
        return window_ == null
            ? com.google.cloud.asset.v1p2beta1.TimeWindow.getDefaultInstance()
            : window_;
      } else {
        return windowBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     */
    public Builder setWindow(com.google.cloud.asset.v1p2beta1.TimeWindow value) {
      if (windowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        window_ = value;
      } else {
        windowBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     */
    public Builder setWindow(com.google.cloud.asset.v1p2beta1.TimeWindow.Builder builderForValue) {
      if (windowBuilder_ == null) {
        window_ = builderForValue.build();
      } else {
        windowBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     */
    public Builder mergeWindow(com.google.cloud.asset.v1p2beta1.TimeWindow value) {
      if (windowBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && window_ != null
            && window_ != com.google.cloud.asset.v1p2beta1.TimeWindow.getDefaultInstance()) {
          getWindowBuilder().mergeFrom(value);
        } else {
          window_ = value;
        }
      } else {
        windowBuilder_.mergeFrom(value);
      }
      if (window_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     */
    public Builder clearWindow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      window_ = null;
      if (windowBuilder_ != null) {
        windowBuilder_.dispose();
        windowBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     */
    public com.google.cloud.asset.v1p2beta1.TimeWindow.Builder getWindowBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWindowFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     */
    public com.google.cloud.asset.v1p2beta1.TimeWindowOrBuilder getWindowOrBuilder() {
      if (windowBuilder_ != null) {
        return windowBuilder_.getMessageOrBuilder();
      } else {
        return window_ == null
            ? com.google.cloud.asset.v1p2beta1.TimeWindow.getDefaultInstance()
            : window_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time window when the asset data and state was observed.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.TimeWindow window = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1p2beta1.TimeWindow,
            com.google.cloud.asset.v1p2beta1.TimeWindow.Builder,
            com.google.cloud.asset.v1p2beta1.TimeWindowOrBuilder>
        getWindowFieldBuilder() {
      if (windowBuilder_ == null) {
        windowBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.asset.v1p2beta1.TimeWindow,
                com.google.cloud.asset.v1p2beta1.TimeWindow.Builder,
                com.google.cloud.asset.v1p2beta1.TimeWindowOrBuilder>(
                getWindow(), getParentForChildren(), isClean());
        window_ = null;
      }
      return windowBuilder_;
    }

    private boolean deleted_;
    /**
     *
     *
     * <pre>
     * Whether the asset has been deleted or not.
     * </pre>
     *
     * <code>bool deleted = 2;</code>
     *
     * @return The deleted.
     */
    @java.lang.Override
    public boolean getDeleted() {
      return deleted_;
    }
    /**
     *
     *
     * <pre>
     * Whether the asset has been deleted or not.
     * </pre>
     *
     * <code>bool deleted = 2;</code>
     *
     * @param value The deleted to set.
     * @return This builder for chaining.
     */
    public Builder setDeleted(boolean value) {

      deleted_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the asset has been deleted or not.
     * </pre>
     *
     * <code>bool deleted = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeleted() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deleted_ = false;
      onChanged();
      return this;
    }

    private com.google.cloud.asset.v1p2beta1.Asset asset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1p2beta1.Asset,
            com.google.cloud.asset.v1p2beta1.Asset.Builder,
            com.google.cloud.asset.v1p2beta1.AssetOrBuilder>
        assetBuilder_;
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     *
     * @return Whether the asset field is set.
     */
    public boolean hasAsset() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     *
     * @return The asset.
     */
    public com.google.cloud.asset.v1p2beta1.Asset getAsset() {
      if (assetBuilder_ == null) {
        return asset_ == null
            ? com.google.cloud.asset.v1p2beta1.Asset.getDefaultInstance()
            : asset_;
      } else {
        return assetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     */
    public Builder setAsset(com.google.cloud.asset.v1p2beta1.Asset value) {
      if (assetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asset_ = value;
      } else {
        assetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     */
    public Builder setAsset(com.google.cloud.asset.v1p2beta1.Asset.Builder builderForValue) {
      if (assetBuilder_ == null) {
        asset_ = builderForValue.build();
      } else {
        assetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     */
    public Builder mergeAsset(com.google.cloud.asset.v1p2beta1.Asset value) {
      if (assetBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && asset_ != null
            && asset_ != com.google.cloud.asset.v1p2beta1.Asset.getDefaultInstance()) {
          getAssetBuilder().mergeFrom(value);
        } else {
          asset_ = value;
        }
      } else {
        assetBuilder_.mergeFrom(value);
      }
      if (asset_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     */
    public Builder clearAsset() {
      bitField0_ = (bitField0_ & ~0x00000004);
      asset_ = null;
      if (assetBuilder_ != null) {
        assetBuilder_.dispose();
        assetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     */
    public com.google.cloud.asset.v1p2beta1.Asset.Builder getAssetBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAssetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     */
    public com.google.cloud.asset.v1p2beta1.AssetOrBuilder getAssetOrBuilder() {
      if (assetBuilder_ != null) {
        return assetBuilder_.getMessageOrBuilder();
      } else {
        return asset_ == null
            ? com.google.cloud.asset.v1p2beta1.Asset.getDefaultInstance()
            : asset_;
      }
    }
    /**
     *
     *
     * <pre>
     * An asset in Google Cloud.
     * </pre>
     *
     * <code>.google.cloud.asset.v1p2beta1.Asset asset = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1p2beta1.Asset,
            com.google.cloud.asset.v1p2beta1.Asset.Builder,
            com.google.cloud.asset.v1p2beta1.AssetOrBuilder>
        getAssetFieldBuilder() {
      if (assetBuilder_ == null) {
        assetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.asset.v1p2beta1.Asset,
                com.google.cloud.asset.v1p2beta1.Asset.Builder,
                com.google.cloud.asset.v1p2beta1.AssetOrBuilder>(
                getAsset(), getParentForChildren(), isClean());
        asset_ = null;
      }
      return assetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1p2beta1.TemporalAsset)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1p2beta1.TemporalAsset)
  private static final com.google.cloud.asset.v1p2beta1.TemporalAsset DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1p2beta1.TemporalAsset();
  }

  public static com.google.cloud.asset.v1p2beta1.TemporalAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TemporalAsset> PARSER =
      new com.google.protobuf.AbstractParser<TemporalAsset>() {
        @java.lang.Override
        public TemporalAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<TemporalAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TemporalAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1p2beta1.TemporalAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

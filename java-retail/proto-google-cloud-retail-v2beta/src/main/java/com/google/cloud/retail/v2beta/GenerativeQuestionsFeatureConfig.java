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
// source: google/cloud/retail/v2beta/generative_question.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * Configuration for overall generative question feature state.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig}
 */
public final class GenerativeQuestionsFeatureConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig)
    GenerativeQuestionsFeatureConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerativeQuestionsFeatureConfig.newBuilder() to construct.
  private GenerativeQuestionsFeatureConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerativeQuestionsFeatureConfig() {
    catalog_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerativeQuestionsFeatureConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2beta.GenerativeQuestionProto
        .internal_static_google_cloud_retail_v2beta_GenerativeQuestionsFeatureConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.GenerativeQuestionProto
        .internal_static_google_cloud_retail_v2beta_GenerativeQuestionsFeatureConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig.class,
            com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig.Builder.class);
  }

  public static final int CATALOG_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object catalog_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the affected catalog.
   * Format: projects/{project}/locations/{location}/catalogs/{catalog}
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The catalog.
   */
  @java.lang.Override
  public java.lang.String getCatalog() {
    java.lang.Object ref = catalog_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      catalog_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Resource name of the affected catalog.
   * Format: projects/{project}/locations/{location}/catalogs/{catalog}
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for catalog.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCatalogBytes() {
    java.lang.Object ref = catalog_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      catalog_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEATURE_ENABLED_FIELD_NUMBER = 2;
  private boolean featureEnabled_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Determines whether questions will be used at serving time.
   * Note: This feature cannot be enabled until initial data requirements are
   * satisfied.
   * </pre>
   *
   * <code>bool feature_enabled = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The featureEnabled.
   */
  @java.lang.Override
  public boolean getFeatureEnabled() {
    return featureEnabled_;
  }

  public static final int MINIMUM_PRODUCTS_FIELD_NUMBER = 3;
  private int minimumProducts_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Minimum number of products in the response to trigger follow-up
   * questions. Value must be 0 or positive.
   * </pre>
   *
   * <code>int32 minimum_products = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minimumProducts.
   */
  @java.lang.Override
  public int getMinimumProducts() {
    return minimumProducts_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(catalog_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, catalog_);
    }
    if (featureEnabled_ != false) {
      output.writeBool(2, featureEnabled_);
    }
    if (minimumProducts_ != 0) {
      output.writeInt32(3, minimumProducts_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(catalog_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, catalog_);
    }
    if (featureEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, featureEnabled_);
    }
    if (minimumProducts_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, minimumProducts_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig other =
        (com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig) obj;

    if (!getCatalog().equals(other.getCatalog())) return false;
    if (getFeatureEnabled() != other.getFeatureEnabled()) return false;
    if (getMinimumProducts() != other.getMinimumProducts()) return false;
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
    hash = (37 * hash) + CATALOG_FIELD_NUMBER;
    hash = (53 * hash) + getCatalog().hashCode();
    hash = (37 * hash) + FEATURE_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getFeatureEnabled());
    hash = (37 * hash) + MINIMUM_PRODUCTS_FIELD_NUMBER;
    hash = (53 * hash) + getMinimumProducts();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig parseFrom(
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
      com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig prototype) {
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
   * Configuration for overall generative question feature state.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig)
      com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2beta.GenerativeQuestionProto
          .internal_static_google_cloud_retail_v2beta_GenerativeQuestionsFeatureConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.GenerativeQuestionProto
          .internal_static_google_cloud_retail_v2beta_GenerativeQuestionsFeatureConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig.class,
              com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      catalog_ = "";
      featureEnabled_ = false;
      minimumProducts_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2beta.GenerativeQuestionProto
          .internal_static_google_cloud_retail_v2beta_GenerativeQuestionsFeatureConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig
        getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig build() {
      com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig buildPartial() {
      com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig result =
          new com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.catalog_ = catalog_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.featureEnabled_ = featureEnabled_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.minimumProducts_ = minimumProducts_;
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
      if (other instanceof com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig) {
        return mergeFrom((com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig other) {
      if (other
          == com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig.getDefaultInstance())
        return this;
      if (!other.getCatalog().isEmpty()) {
        catalog_ = other.catalog_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFeatureEnabled() != false) {
        setFeatureEnabled(other.getFeatureEnabled());
      }
      if (other.getMinimumProducts() != 0) {
        setMinimumProducts(other.getMinimumProducts());
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
                catalog_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                featureEnabled_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                minimumProducts_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object catalog_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the affected catalog.
     * Format: projects/{project}/locations/{location}/catalogs/{catalog}
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The catalog.
     */
    public java.lang.String getCatalog() {
      java.lang.Object ref = catalog_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        catalog_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the affected catalog.
     * Format: projects/{project}/locations/{location}/catalogs/{catalog}
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for catalog.
     */
    public com.google.protobuf.ByteString getCatalogBytes() {
      java.lang.Object ref = catalog_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        catalog_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the affected catalog.
     * Format: projects/{project}/locations/{location}/catalogs/{catalog}
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The catalog to set.
     * @return This builder for chaining.
     */
    public Builder setCatalog(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      catalog_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the affected catalog.
     * Format: projects/{project}/locations/{location}/catalogs/{catalog}
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCatalog() {
      catalog_ = getDefaultInstance().getCatalog();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the affected catalog.
     * Format: projects/{project}/locations/{location}/catalogs/{catalog}
     * </pre>
     *
     * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for catalog to set.
     * @return This builder for chaining.
     */
    public Builder setCatalogBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      catalog_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean featureEnabled_;
    /**
     *
     *
     * <pre>
     * Optional. Determines whether questions will be used at serving time.
     * Note: This feature cannot be enabled until initial data requirements are
     * satisfied.
     * </pre>
     *
     * <code>bool feature_enabled = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The featureEnabled.
     */
    @java.lang.Override
    public boolean getFeatureEnabled() {
      return featureEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Determines whether questions will be used at serving time.
     * Note: This feature cannot be enabled until initial data requirements are
     * satisfied.
     * </pre>
     *
     * <code>bool feature_enabled = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The featureEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureEnabled(boolean value) {

      featureEnabled_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Determines whether questions will be used at serving time.
     * Note: This feature cannot be enabled until initial data requirements are
     * satisfied.
     * </pre>
     *
     * <code>bool feature_enabled = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFeatureEnabled() {
      bitField0_ = (bitField0_ & ~0x00000002);
      featureEnabled_ = false;
      onChanged();
      return this;
    }

    private int minimumProducts_;
    /**
     *
     *
     * <pre>
     * Optional. Minimum number of products in the response to trigger follow-up
     * questions. Value must be 0 or positive.
     * </pre>
     *
     * <code>int32 minimum_products = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The minimumProducts.
     */
    @java.lang.Override
    public int getMinimumProducts() {
      return minimumProducts_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Minimum number of products in the response to trigger follow-up
     * questions. Value must be 0 or positive.
     * </pre>
     *
     * <code>int32 minimum_products = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The minimumProducts to set.
     * @return This builder for chaining.
     */
    public Builder setMinimumProducts(int value) {

      minimumProducts_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Minimum number of products in the response to trigger follow-up
     * questions. Value must be 0 or positive.
     * </pre>
     *
     * <code>int32 minimum_products = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinimumProducts() {
      bitField0_ = (bitField0_ & ~0x00000004);
      minimumProducts_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig)
  private static final com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig();
  }

  public static com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerativeQuestionsFeatureConfig> PARSER =
      new com.google.protobuf.AbstractParser<GenerativeQuestionsFeatureConfig>() {
        @java.lang.Override
        public GenerativeQuestionsFeatureConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerativeQuestionsFeatureConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerativeQuestionsFeatureConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.GenerativeQuestionsFeatureConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

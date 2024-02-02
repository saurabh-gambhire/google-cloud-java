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
 * A message to group the analysis information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.MoveAnalysis}
 */
public final class MoveAnalysis extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.MoveAnalysis)
    MoveAnalysisOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MoveAnalysis.newBuilder() to construct.
  private MoveAnalysis(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MoveAnalysis() {
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MoveAnalysis();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_MoveAnalysis_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_MoveAnalysis_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.MoveAnalysis.class,
            com.google.cloud.asset.v1.MoveAnalysis.Builder.class);
  }

  private int resultCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object result_;

  public enum ResultCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ANALYSIS(2),
    ERROR(3),
    RESULT_NOT_SET(0);
    private final int value;

    private ResultCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultCase forNumber(int value) {
      switch (value) {
        case 2:
          return ANALYSIS;
        case 3:
          return ERROR;
        case 0:
          return RESULT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ResultCase getResultCase() {
    return ResultCase.forNumber(resultCase_);
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   *
   *
   * <pre>
   * The user friendly display name of the analysis. E.g. IAM, organization
   * policy etc.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The user friendly display name of the analysis. E.g. IAM, organization
   * policy etc.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANALYSIS_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Analysis result of moving the target resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
   *
   * @return Whether the analysis field is set.
   */
  @java.lang.Override
  public boolean hasAnalysis() {
    return resultCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Analysis result of moving the target resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
   *
   * @return The analysis.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.MoveAnalysisResult getAnalysis() {
    if (resultCase_ == 2) {
      return (com.google.cloud.asset.v1.MoveAnalysisResult) result_;
    }
    return com.google.cloud.asset.v1.MoveAnalysisResult.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Analysis result of moving the target resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.MoveAnalysisResultOrBuilder getAnalysisOrBuilder() {
    if (resultCase_ == 2) {
      return (com.google.cloud.asset.v1.MoveAnalysisResult) result_;
    }
    return com.google.cloud.asset.v1.MoveAnalysisResult.getDefaultInstance();
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Description of error encountered when performing the analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return resultCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Description of error encountered when performing the analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public com.google.rpc.Status getError() {
    if (resultCase_ == 3) {
      return (com.google.rpc.Status) result_;
    }
    return com.google.rpc.Status.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Description of error encountered when performing the analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
    if (resultCase_ == 3) {
      return (com.google.rpc.Status) result_;
    }
    return com.google.rpc.Status.getDefaultInstance();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayName_);
    }
    if (resultCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.asset.v1.MoveAnalysisResult) result_);
    }
    if (resultCase_ == 3) {
      output.writeMessage(3, (com.google.rpc.Status) result_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayName_);
    }
    if (resultCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.asset.v1.MoveAnalysisResult) result_);
    }
    if (resultCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.rpc.Status) result_);
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
    if (!(obj instanceof com.google.cloud.asset.v1.MoveAnalysis)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.MoveAnalysis other = (com.google.cloud.asset.v1.MoveAnalysis) obj;

    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (!getResultCase().equals(other.getResultCase())) return false;
    switch (resultCase_) {
      case 2:
        if (!getAnalysis().equals(other.getAnalysis())) return false;
        break;
      case 3:
        if (!getError().equals(other.getError())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    switch (resultCase_) {
      case 2:
        hash = (37 * hash) + ANALYSIS_FIELD_NUMBER;
        hash = (53 * hash) + getAnalysis().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.MoveAnalysis parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.MoveAnalysis prototype) {
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
   * A message to group the analysis information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.MoveAnalysis}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.MoveAnalysis)
      com.google.cloud.asset.v1.MoveAnalysisOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_MoveAnalysis_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_MoveAnalysis_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.MoveAnalysis.class,
              com.google.cloud.asset.v1.MoveAnalysis.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.MoveAnalysis.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      displayName_ = "";
      if (analysisBuilder_ != null) {
        analysisBuilder_.clear();
      }
      if (errorBuilder_ != null) {
        errorBuilder_.clear();
      }
      resultCase_ = 0;
      result_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_MoveAnalysis_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.MoveAnalysis getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.MoveAnalysis.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.MoveAnalysis build() {
      com.google.cloud.asset.v1.MoveAnalysis result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.MoveAnalysis buildPartial() {
      com.google.cloud.asset.v1.MoveAnalysis result =
          new com.google.cloud.asset.v1.MoveAnalysis(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1.MoveAnalysis result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.displayName_ = displayName_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.asset.v1.MoveAnalysis result) {
      result.resultCase_ = resultCase_;
      result.result_ = this.result_;
      if (resultCase_ == 2 && analysisBuilder_ != null) {
        result.result_ = analysisBuilder_.build();
      }
      if (resultCase_ == 3 && errorBuilder_ != null) {
        result.result_ = errorBuilder_.build();
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
      if (other instanceof com.google.cloud.asset.v1.MoveAnalysis) {
        return mergeFrom((com.google.cloud.asset.v1.MoveAnalysis) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.MoveAnalysis other) {
      if (other == com.google.cloud.asset.v1.MoveAnalysis.getDefaultInstance()) return this;
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getResultCase()) {
        case ANALYSIS:
          {
            mergeAnalysis(other.getAnalysis());
            break;
          }
        case ERROR:
          {
            mergeError(other.getError());
            break;
          }
        case RESULT_NOT_SET:
          {
            break;
          }
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
                displayName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getAnalysisFieldBuilder().getBuilder(), extensionRegistry);
                resultCase_ = 2;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getErrorFieldBuilder().getBuilder(), extensionRegistry);
                resultCase_ = 3;
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

    private int resultCase_ = 0;
    private java.lang.Object result_;

    public ResultCase getResultCase() {
      return ResultCase.forNumber(resultCase_);
    }

    public Builder clearResult() {
      resultCase_ = 0;
      result_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * The user friendly display name of the analysis. E.g. IAM, organization
     * policy etc.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The user friendly display name of the analysis. E.g. IAM, organization
     * policy etc.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The user friendly display name of the analysis. E.g. IAM, organization
     * policy etc.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      displayName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user friendly display name of the analysis. E.g. IAM, organization
     * policy etc.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user friendly display name of the analysis. E.g. IAM, organization
     * policy etc.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      displayName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.MoveAnalysisResult,
            com.google.cloud.asset.v1.MoveAnalysisResult.Builder,
            com.google.cloud.asset.v1.MoveAnalysisResultOrBuilder>
        analysisBuilder_;
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     *
     * @return Whether the analysis field is set.
     */
    @java.lang.Override
    public boolean hasAnalysis() {
      return resultCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     *
     * @return The analysis.
     */
    @java.lang.Override
    public com.google.cloud.asset.v1.MoveAnalysisResult getAnalysis() {
      if (analysisBuilder_ == null) {
        if (resultCase_ == 2) {
          return (com.google.cloud.asset.v1.MoveAnalysisResult) result_;
        }
        return com.google.cloud.asset.v1.MoveAnalysisResult.getDefaultInstance();
      } else {
        if (resultCase_ == 2) {
          return analysisBuilder_.getMessage();
        }
        return com.google.cloud.asset.v1.MoveAnalysisResult.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     */
    public Builder setAnalysis(com.google.cloud.asset.v1.MoveAnalysisResult value) {
      if (analysisBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        analysisBuilder_.setMessage(value);
      }
      resultCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     */
    public Builder setAnalysis(
        com.google.cloud.asset.v1.MoveAnalysisResult.Builder builderForValue) {
      if (analysisBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        analysisBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     */
    public Builder mergeAnalysis(com.google.cloud.asset.v1.MoveAnalysisResult value) {
      if (analysisBuilder_ == null) {
        if (resultCase_ == 2
            && result_ != com.google.cloud.asset.v1.MoveAnalysisResult.getDefaultInstance()) {
          result_ =
              com.google.cloud.asset.v1.MoveAnalysisResult.newBuilder(
                      (com.google.cloud.asset.v1.MoveAnalysisResult) result_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 2) {
          analysisBuilder_.mergeFrom(value);
        } else {
          analysisBuilder_.setMessage(value);
        }
      }
      resultCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     */
    public Builder clearAnalysis() {
      if (analysisBuilder_ == null) {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
        }
        analysisBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     */
    public com.google.cloud.asset.v1.MoveAnalysisResult.Builder getAnalysisBuilder() {
      return getAnalysisFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.asset.v1.MoveAnalysisResultOrBuilder getAnalysisOrBuilder() {
      if ((resultCase_ == 2) && (analysisBuilder_ != null)) {
        return analysisBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 2) {
          return (com.google.cloud.asset.v1.MoveAnalysisResult) result_;
        }
        return com.google.cloud.asset.v1.MoveAnalysisResult.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Analysis result of moving the target resource.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.MoveAnalysisResult analysis = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.MoveAnalysisResult,
            com.google.cloud.asset.v1.MoveAnalysisResult.Builder,
            com.google.cloud.asset.v1.MoveAnalysisResultOrBuilder>
        getAnalysisFieldBuilder() {
      if (analysisBuilder_ == null) {
        if (!(resultCase_ == 2)) {
          result_ = com.google.cloud.asset.v1.MoveAnalysisResult.getDefaultInstance();
        }
        analysisBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.asset.v1.MoveAnalysisResult,
                com.google.cloud.asset.v1.MoveAnalysisResult.Builder,
                com.google.cloud.asset.v1.MoveAnalysisResultOrBuilder>(
                (com.google.cloud.asset.v1.MoveAnalysisResult) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 2;
      onChanged();
      return analysisBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        errorBuilder_;
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     *
     * @return Whether the error field is set.
     */
    @java.lang.Override
    public boolean hasError() {
      return resultCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     *
     * @return The error.
     */
    @java.lang.Override
    public com.google.rpc.Status getError() {
      if (errorBuilder_ == null) {
        if (resultCase_ == 3) {
          return (com.google.rpc.Status) result_;
        }
        return com.google.rpc.Status.getDefaultInstance();
      } else {
        if (resultCase_ == 3) {
          return errorBuilder_.getMessage();
        }
        return com.google.rpc.Status.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     */
    public Builder setError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }
      resultCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     */
    public Builder setError(com.google.rpc.Status.Builder builderForValue) {
      if (errorBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     */
    public Builder mergeError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (resultCase_ == 3 && result_ != com.google.rpc.Status.getDefaultInstance()) {
          result_ =
              com.google.rpc.Status.newBuilder((com.google.rpc.Status) result_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 3) {
          errorBuilder_.mergeFrom(value);
        } else {
          errorBuilder_.setMessage(value);
        }
      }
      resultCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        if (resultCase_ == 3) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 3) {
          resultCase_ = 0;
          result_ = null;
        }
        errorBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     */
    public com.google.rpc.Status.Builder getErrorBuilder() {
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     */
    @java.lang.Override
    public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
      if ((resultCase_ == 3) && (errorBuilder_ != null)) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 3) {
          return (com.google.rpc.Status) result_;
        }
        return com.google.rpc.Status.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Description of error encountered when performing the analysis.
     * </pre>
     *
     * <code>.google.rpc.Status error = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        if (!(resultCase_ == 3)) {
          result_ = com.google.rpc.Status.getDefaultInstance();
        }
        errorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(
                (com.google.rpc.Status) result_, getParentForChildren(), isClean());
        result_ = null;
      }
      resultCase_ = 3;
      onChanged();
      return errorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.MoveAnalysis)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.MoveAnalysis)
  private static final com.google.cloud.asset.v1.MoveAnalysis DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.MoveAnalysis();
  }

  public static com.google.cloud.asset.v1.MoveAnalysis getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MoveAnalysis> PARSER =
      new com.google.protobuf.AbstractParser<MoveAnalysis>() {
        @java.lang.Override
        public MoveAnalysis parsePartialFrom(
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

  public static com.google.protobuf.Parser<MoveAnalysis> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MoveAnalysis> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.MoveAnalysis getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

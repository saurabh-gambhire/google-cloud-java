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
// source: google/appengine/v1/deploy.proto

// Protobuf Java Version: 3.25.2
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Single source file that is part of the version to be deployed. Each source
 * file that is deployed must be specified separately.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.FileInfo}
 */
public final class FileInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.FileInfo)
    FileInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FileInfo.newBuilder() to construct.
  private FileInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FileInfo() {
    sourceUrl_ = "";
    sha1Sum_ = "";
    mimeType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FileInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.DeployProto
        .internal_static_google_appengine_v1_FileInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.DeployProto
        .internal_static_google_appengine_v1_FileInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.FileInfo.class, com.google.appengine.v1.FileInfo.Builder.class);
  }

  public static final int SOURCE_URL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceUrl_ = "";
  /**
   *
   *
   * <pre>
   * URL source to use to fetch this file. Must be a URL to a resource in
   * Google Cloud Storage in the form
   * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
   * </pre>
   *
   * <code>string source_url = 1;</code>
   *
   * @return The sourceUrl.
   */
  @java.lang.Override
  public java.lang.String getSourceUrl() {
    java.lang.Object ref = sourceUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URL source to use to fetch this file. Must be a URL to a resource in
   * Google Cloud Storage in the form
   * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
   * </pre>
   *
   * <code>string source_url = 1;</code>
   *
   * @return The bytes for sourceUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceUrlBytes() {
    java.lang.Object ref = sourceUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHA1_SUM_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sha1Sum_ = "";
  /**
   *
   *
   * <pre>
   * The SHA1 hash of the file, in hex.
   * </pre>
   *
   * <code>string sha1_sum = 2;</code>
   *
   * @return The sha1Sum.
   */
  @java.lang.Override
  public java.lang.String getSha1Sum() {
    java.lang.Object ref = sha1Sum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sha1Sum_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The SHA1 hash of the file, in hex.
   * </pre>
   *
   * <code>string sha1_sum = 2;</code>
   *
   * @return The bytes for sha1Sum.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSha1SumBytes() {
    java.lang.Object ref = sha1Sum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sha1Sum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object mimeType_ = "";
  /**
   *
   *
   * <pre>
   * The MIME type of the file.
   *
   * Defaults to the value from Google Cloud Storage.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The mimeType.
   */
  @java.lang.Override
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The MIME type of the file.
   *
   * Defaults to the value from Google Cloud Storage.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The bytes for mimeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mimeType_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha1Sum_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sha1Sum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mimeType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha1Sum_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sha1Sum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mimeType_);
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
    if (!(obj instanceof com.google.appengine.v1.FileInfo)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.FileInfo other = (com.google.appengine.v1.FileInfo) obj;

    if (!getSourceUrl().equals(other.getSourceUrl())) return false;
    if (!getSha1Sum().equals(other.getSha1Sum())) return false;
    if (!getMimeType().equals(other.getMimeType())) return false;
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
    hash = (37 * hash) + SOURCE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSourceUrl().hashCode();
    hash = (37 * hash) + SHA1_SUM_FIELD_NUMBER;
    hash = (53 * hash) + getSha1Sum().hashCode();
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.FileInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.FileInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.FileInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.FileInfo parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.FileInfo prototype) {
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
   * Single source file that is part of the version to be deployed. Each source
   * file that is deployed must be specified separately.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.FileInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.FileInfo)
      com.google.appengine.v1.FileInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_FileInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_FileInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.FileInfo.class,
              com.google.appengine.v1.FileInfo.Builder.class);
    }

    // Construct using com.google.appengine.v1.FileInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceUrl_ = "";
      sha1Sum_ = "";
      mimeType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_FileInfo_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.FileInfo getDefaultInstanceForType() {
      return com.google.appengine.v1.FileInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.FileInfo build() {
      com.google.appengine.v1.FileInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.FileInfo buildPartial() {
      com.google.appengine.v1.FileInfo result = new com.google.appengine.v1.FileInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.FileInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceUrl_ = sourceUrl_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sha1Sum_ = sha1Sum_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mimeType_ = mimeType_;
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
      if (other instanceof com.google.appengine.v1.FileInfo) {
        return mergeFrom((com.google.appengine.v1.FileInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.FileInfo other) {
      if (other == com.google.appengine.v1.FileInfo.getDefaultInstance()) return this;
      if (!other.getSourceUrl().isEmpty()) {
        sourceUrl_ = other.sourceUrl_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSha1Sum().isEmpty()) {
        sha1Sum_ = other.sha1Sum_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
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
                sourceUrl_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                sha1Sum_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                mimeType_ = input.readStringRequireUtf8();
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

    private java.lang.Object sourceUrl_ = "";
    /**
     *
     *
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     *
     * @return The sourceUrl.
     */
    public java.lang.String getSourceUrl() {
      java.lang.Object ref = sourceUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     *
     * @return The bytes for sourceUrl.
     */
    public com.google.protobuf.ByteString getSourceUrlBytes() {
      java.lang.Object ref = sourceUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     *
     * @param value The sourceUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSourceUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceUrl() {
      sourceUrl_ = getDefaultInstance().getSourceUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     *
     * @param value The bytes for sourceUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSourceUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object sha1Sum_ = "";
    /**
     *
     *
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     *
     * @return The sha1Sum.
     */
    public java.lang.String getSha1Sum() {
      java.lang.Object ref = sha1Sum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sha1Sum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     *
     * @return The bytes for sha1Sum.
     */
    public com.google.protobuf.ByteString getSha1SumBytes() {
      java.lang.Object ref = sha1Sum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sha1Sum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     *
     * @param value The sha1Sum to set.
     * @return This builder for chaining.
     */
    public Builder setSha1Sum(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sha1Sum_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSha1Sum() {
      sha1Sum_ = getDefaultInstance().getSha1Sum();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     *
     * @param value The bytes for sha1Sum to set.
     * @return This builder for chaining.
     */
    public Builder setSha1SumBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sha1Sum_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     *
     *
     * <pre>
     * The MIME type of the file.
     *
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     *
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The MIME type of the file.
     *
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     *
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The MIME type of the file.
     *
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     *
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      mimeType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MIME type of the file.
     *
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {
      mimeType_ = getDefaultInstance().getMimeType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MIME type of the file.
     *
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     *
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      mimeType_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.FileInfo)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.FileInfo)
  private static final com.google.appengine.v1.FileInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.FileInfo();
  }

  public static com.google.appengine.v1.FileInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileInfo> PARSER =
      new com.google.protobuf.AbstractParser<FileInfo>() {
        @java.lang.Override
        public FileInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.FileInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

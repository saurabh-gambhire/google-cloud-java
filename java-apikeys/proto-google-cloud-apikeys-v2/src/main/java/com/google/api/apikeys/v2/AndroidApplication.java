/*
 * Copyright 2023 Google LLC
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
// source: google/api/apikeys/v2/resources.proto

package com.google.api.apikeys.v2;

/**
 *
 *
 * <pre>
 * Identifier of an Android application for key use.
 * </pre>
 *
 * Protobuf type {@code google.api.apikeys.v2.AndroidApplication}
 */
public final class AndroidApplication extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.apikeys.v2.AndroidApplication)
    AndroidApplicationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AndroidApplication.newBuilder() to construct.
  private AndroidApplication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AndroidApplication() {
    sha1Fingerprint_ = "";
    packageName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AndroidApplication();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.apikeys.v2.ResourcesProto
        .internal_static_google_api_apikeys_v2_AndroidApplication_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.apikeys.v2.ResourcesProto
        .internal_static_google_api_apikeys_v2_AndroidApplication_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.apikeys.v2.AndroidApplication.class,
            com.google.api.apikeys.v2.AndroidApplication.Builder.class);
  }

  public static final int SHA1_FINGERPRINT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sha1Fingerprint_ = "";
  /**
   *
   *
   * <pre>
   * The SHA1 fingerprint of the application. For example, both sha1 formats are
   * acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or
   * DA39A3EE5E6B4B0D3255BFEF95601890AFD80709.
   * Output format is the latter.
   * </pre>
   *
   * <code>string sha1_fingerprint = 1;</code>
   *
   * @return The sha1Fingerprint.
   */
  @java.lang.Override
  public java.lang.String getSha1Fingerprint() {
    java.lang.Object ref = sha1Fingerprint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sha1Fingerprint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The SHA1 fingerprint of the application. For example, both sha1 formats are
   * acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or
   * DA39A3EE5E6B4B0D3255BFEF95601890AFD80709.
   * Output format is the latter.
   * </pre>
   *
   * <code>string sha1_fingerprint = 1;</code>
   *
   * @return The bytes for sha1Fingerprint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSha1FingerprintBytes() {
    java.lang.Object ref = sha1Fingerprint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sha1Fingerprint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGE_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object packageName_ = "";
  /**
   *
   *
   * <pre>
   * The package name of the application.
   * </pre>
   *
   * <code>string package_name = 2;</code>
   *
   * @return The packageName.
   */
  @java.lang.Override
  public java.lang.String getPackageName() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packageName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The package name of the application.
   * </pre>
   *
   * <code>string package_name = 2;</code>
   *
   * @return The bytes for packageName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPackageNameBytes() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      packageName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha1Fingerprint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sha1Fingerprint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, packageName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha1Fingerprint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sha1Fingerprint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, packageName_);
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
    if (!(obj instanceof com.google.api.apikeys.v2.AndroidApplication)) {
      return super.equals(obj);
    }
    com.google.api.apikeys.v2.AndroidApplication other =
        (com.google.api.apikeys.v2.AndroidApplication) obj;

    if (!getSha1Fingerprint().equals(other.getSha1Fingerprint())) return false;
    if (!getPackageName().equals(other.getPackageName())) return false;
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
    hash = (37 * hash) + SHA1_FINGERPRINT_FIELD_NUMBER;
    hash = (53 * hash) + getSha1Fingerprint().hashCode();
    hash = (37 * hash) + PACKAGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPackageName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.AndroidApplication parseFrom(
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

  public static Builder newBuilder(com.google.api.apikeys.v2.AndroidApplication prototype) {
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
   * Identifier of an Android application for key use.
   * </pre>
   *
   * Protobuf type {@code google.api.apikeys.v2.AndroidApplication}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.apikeys.v2.AndroidApplication)
      com.google.api.apikeys.v2.AndroidApplicationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_AndroidApplication_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_AndroidApplication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.apikeys.v2.AndroidApplication.class,
              com.google.api.apikeys.v2.AndroidApplication.Builder.class);
    }

    // Construct using com.google.api.apikeys.v2.AndroidApplication.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sha1Fingerprint_ = "";
      packageName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_AndroidApplication_descriptor;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.AndroidApplication getDefaultInstanceForType() {
      return com.google.api.apikeys.v2.AndroidApplication.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.AndroidApplication build() {
      com.google.api.apikeys.v2.AndroidApplication result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.AndroidApplication buildPartial() {
      com.google.api.apikeys.v2.AndroidApplication result =
          new com.google.api.apikeys.v2.AndroidApplication(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.apikeys.v2.AndroidApplication result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sha1Fingerprint_ = sha1Fingerprint_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.packageName_ = packageName_;
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
      if (other instanceof com.google.api.apikeys.v2.AndroidApplication) {
        return mergeFrom((com.google.api.apikeys.v2.AndroidApplication) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.apikeys.v2.AndroidApplication other) {
      if (other == com.google.api.apikeys.v2.AndroidApplication.getDefaultInstance()) return this;
      if (!other.getSha1Fingerprint().isEmpty()) {
        sha1Fingerprint_ = other.sha1Fingerprint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPackageName().isEmpty()) {
        packageName_ = other.packageName_;
        bitField0_ |= 0x00000002;
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
                sha1Fingerprint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                packageName_ = input.readStringRequireUtf8();
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

    private java.lang.Object sha1Fingerprint_ = "";
    /**
     *
     *
     * <pre>
     * The SHA1 fingerprint of the application. For example, both sha1 formats are
     * acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or
     * DA39A3EE5E6B4B0D3255BFEF95601890AFD80709.
     * Output format is the latter.
     * </pre>
     *
     * <code>string sha1_fingerprint = 1;</code>
     *
     * @return The sha1Fingerprint.
     */
    public java.lang.String getSha1Fingerprint() {
      java.lang.Object ref = sha1Fingerprint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sha1Fingerprint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The SHA1 fingerprint of the application. For example, both sha1 formats are
     * acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or
     * DA39A3EE5E6B4B0D3255BFEF95601890AFD80709.
     * Output format is the latter.
     * </pre>
     *
     * <code>string sha1_fingerprint = 1;</code>
     *
     * @return The bytes for sha1Fingerprint.
     */
    public com.google.protobuf.ByteString getSha1FingerprintBytes() {
      java.lang.Object ref = sha1Fingerprint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sha1Fingerprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The SHA1 fingerprint of the application. For example, both sha1 formats are
     * acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or
     * DA39A3EE5E6B4B0D3255BFEF95601890AFD80709.
     * Output format is the latter.
     * </pre>
     *
     * <code>string sha1_fingerprint = 1;</code>
     *
     * @param value The sha1Fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setSha1Fingerprint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sha1Fingerprint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The SHA1 fingerprint of the application. For example, both sha1 formats are
     * acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or
     * DA39A3EE5E6B4B0D3255BFEF95601890AFD80709.
     * Output format is the latter.
     * </pre>
     *
     * <code>string sha1_fingerprint = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSha1Fingerprint() {
      sha1Fingerprint_ = getDefaultInstance().getSha1Fingerprint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The SHA1 fingerprint of the application. For example, both sha1 formats are
     * acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or
     * DA39A3EE5E6B4B0D3255BFEF95601890AFD80709.
     * Output format is the latter.
     * </pre>
     *
     * <code>string sha1_fingerprint = 1;</code>
     *
     * @param value The bytes for sha1Fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setSha1FingerprintBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sha1Fingerprint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object packageName_ = "";
    /**
     *
     *
     * <pre>
     * The package name of the application.
     * </pre>
     *
     * <code>string package_name = 2;</code>
     *
     * @return The packageName.
     */
    public java.lang.String getPackageName() {
      java.lang.Object ref = packageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The package name of the application.
     * </pre>
     *
     * <code>string package_name = 2;</code>
     *
     * @return The bytes for packageName.
     */
    public com.google.protobuf.ByteString getPackageNameBytes() {
      java.lang.Object ref = packageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        packageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The package name of the application.
     * </pre>
     *
     * <code>string package_name = 2;</code>
     *
     * @param value The packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      packageName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The package name of the application.
     * </pre>
     *
     * <code>string package_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPackageName() {
      packageName_ = getDefaultInstance().getPackageName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The package name of the application.
     * </pre>
     *
     * <code>string package_name = 2;</code>
     *
     * @param value The bytes for packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      packageName_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.api.apikeys.v2.AndroidApplication)
  }

  // @@protoc_insertion_point(class_scope:google.api.apikeys.v2.AndroidApplication)
  private static final com.google.api.apikeys.v2.AndroidApplication DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.apikeys.v2.AndroidApplication();
  }

  public static com.google.api.apikeys.v2.AndroidApplication getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AndroidApplication> PARSER =
      new com.google.protobuf.AbstractParser<AndroidApplication>() {
        @java.lang.Override
        public AndroidApplication parsePartialFrom(
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

  public static com.google.protobuf.Parser<AndroidApplication> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AndroidApplication> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.apikeys.v2.AndroidApplication getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

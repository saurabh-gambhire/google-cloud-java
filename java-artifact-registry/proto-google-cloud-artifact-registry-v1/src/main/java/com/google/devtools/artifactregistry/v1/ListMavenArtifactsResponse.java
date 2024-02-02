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
// source: google/devtools/artifactregistry/v1/artifact.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.artifactregistry.v1;

/**
 *
 *
 * <pre>
 * The response from listing maven artifacts.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1.ListMavenArtifactsResponse}
 */
public final class ListMavenArtifactsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1.ListMavenArtifactsResponse)
    ListMavenArtifactsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListMavenArtifactsResponse.newBuilder() to construct.
  private ListMavenArtifactsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListMavenArtifactsResponse() {
    mavenArtifacts_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListMavenArtifactsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.artifactregistry.v1.ArtifactProto
        .internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1.ArtifactProto
        .internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse.class,
            com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse.Builder.class);
  }

  public static final int MAVEN_ARTIFACTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.devtools.artifactregistry.v1.MavenArtifact> mavenArtifacts_;
  /**
   *
   *
   * <pre>
   * The maven artifacts returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.artifactregistry.v1.MavenArtifact>
      getMavenArtifactsList() {
    return mavenArtifacts_;
  }
  /**
   *
   *
   * <pre>
   * The maven artifacts returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.artifactregistry.v1.MavenArtifactOrBuilder>
      getMavenArtifactsOrBuilderList() {
    return mavenArtifacts_;
  }
  /**
   *
   *
   * <pre>
   * The maven artifacts returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
   */
  @java.lang.Override
  public int getMavenArtifactsCount() {
    return mavenArtifacts_.size();
  }
  /**
   *
   *
   * <pre>
   * The maven artifacts returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.MavenArtifact getMavenArtifacts(int index) {
    return mavenArtifacts_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The maven artifacts returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.MavenArtifactOrBuilder getMavenArtifactsOrBuilder(
      int index) {
    return mavenArtifacts_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of artifacts, or empty if there are no
   * more artifacts to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of artifacts, or empty if there are no
   * more artifacts to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < mavenArtifacts_.size(); i++) {
      output.writeMessage(1, mavenArtifacts_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mavenArtifacts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, mavenArtifacts_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse other =
        (com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse) obj;

    if (!getMavenArtifactsList().equals(other.getMavenArtifactsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getMavenArtifactsCount() > 0) {
      hash = (37 * hash) + MAVEN_ARTIFACTS_FIELD_NUMBER;
      hash = (53 * hash) + getMavenArtifactsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse parseFrom(
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
      com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse prototype) {
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
   * The response from listing maven artifacts.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1.ListMavenArtifactsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1.ListMavenArtifactsResponse)
      com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1.ArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1.ArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse.class,
              com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse.Builder.class);
    }

    // Construct using
    // com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (mavenArtifactsBuilder_ == null) {
        mavenArtifacts_ = java.util.Collections.emptyList();
      } else {
        mavenArtifacts_ = null;
        mavenArtifactsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1.ArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse
        getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse build() {
      com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse buildPartial() {
      com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse result =
          new com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse result) {
      if (mavenArtifactsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mavenArtifacts_ = java.util.Collections.unmodifiableList(mavenArtifacts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mavenArtifacts_ = mavenArtifacts_;
      } else {
        result.mavenArtifacts_ = mavenArtifactsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse) {
        return mergeFrom(
            (com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse other) {
      if (other
          == com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse
              .getDefaultInstance()) return this;
      if (mavenArtifactsBuilder_ == null) {
        if (!other.mavenArtifacts_.isEmpty()) {
          if (mavenArtifacts_.isEmpty()) {
            mavenArtifacts_ = other.mavenArtifacts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMavenArtifactsIsMutable();
            mavenArtifacts_.addAll(other.mavenArtifacts_);
          }
          onChanged();
        }
      } else {
        if (!other.mavenArtifacts_.isEmpty()) {
          if (mavenArtifactsBuilder_.isEmpty()) {
            mavenArtifactsBuilder_.dispose();
            mavenArtifactsBuilder_ = null;
            mavenArtifacts_ = other.mavenArtifacts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mavenArtifactsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMavenArtifactsFieldBuilder()
                    : null;
          } else {
            mavenArtifactsBuilder_.addAllMessages(other.mavenArtifacts_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.devtools.artifactregistry.v1.MavenArtifact m =
                    input.readMessage(
                        com.google.devtools.artifactregistry.v1.MavenArtifact.parser(),
                        extensionRegistry);
                if (mavenArtifactsBuilder_ == null) {
                  ensureMavenArtifactsIsMutable();
                  mavenArtifacts_.add(m);
                } else {
                  mavenArtifactsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.devtools.artifactregistry.v1.MavenArtifact> mavenArtifacts_ =
        java.util.Collections.emptyList();

    private void ensureMavenArtifactsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mavenArtifacts_ =
            new java.util.ArrayList<com.google.devtools.artifactregistry.v1.MavenArtifact>(
                mavenArtifacts_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.MavenArtifact,
            com.google.devtools.artifactregistry.v1.MavenArtifact.Builder,
            com.google.devtools.artifactregistry.v1.MavenArtifactOrBuilder>
        mavenArtifactsBuilder_;

    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public java.util.List<com.google.devtools.artifactregistry.v1.MavenArtifact>
        getMavenArtifactsList() {
      if (mavenArtifactsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mavenArtifacts_);
      } else {
        return mavenArtifactsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public int getMavenArtifactsCount() {
      if (mavenArtifactsBuilder_ == null) {
        return mavenArtifacts_.size();
      } else {
        return mavenArtifactsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.MavenArtifact getMavenArtifacts(int index) {
      if (mavenArtifactsBuilder_ == null) {
        return mavenArtifacts_.get(index);
      } else {
        return mavenArtifactsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder setMavenArtifacts(
        int index, com.google.devtools.artifactregistry.v1.MavenArtifact value) {
      if (mavenArtifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMavenArtifactsIsMutable();
        mavenArtifacts_.set(index, value);
        onChanged();
      } else {
        mavenArtifactsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder setMavenArtifacts(
        int index, com.google.devtools.artifactregistry.v1.MavenArtifact.Builder builderForValue) {
      if (mavenArtifactsBuilder_ == null) {
        ensureMavenArtifactsIsMutable();
        mavenArtifacts_.set(index, builderForValue.build());
        onChanged();
      } else {
        mavenArtifactsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder addMavenArtifacts(com.google.devtools.artifactregistry.v1.MavenArtifact value) {
      if (mavenArtifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMavenArtifactsIsMutable();
        mavenArtifacts_.add(value);
        onChanged();
      } else {
        mavenArtifactsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder addMavenArtifacts(
        int index, com.google.devtools.artifactregistry.v1.MavenArtifact value) {
      if (mavenArtifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMavenArtifactsIsMutable();
        mavenArtifacts_.add(index, value);
        onChanged();
      } else {
        mavenArtifactsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder addMavenArtifacts(
        com.google.devtools.artifactregistry.v1.MavenArtifact.Builder builderForValue) {
      if (mavenArtifactsBuilder_ == null) {
        ensureMavenArtifactsIsMutable();
        mavenArtifacts_.add(builderForValue.build());
        onChanged();
      } else {
        mavenArtifactsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder addMavenArtifacts(
        int index, com.google.devtools.artifactregistry.v1.MavenArtifact.Builder builderForValue) {
      if (mavenArtifactsBuilder_ == null) {
        ensureMavenArtifactsIsMutable();
        mavenArtifacts_.add(index, builderForValue.build());
        onChanged();
      } else {
        mavenArtifactsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder addAllMavenArtifacts(
        java.lang.Iterable<? extends com.google.devtools.artifactregistry.v1.MavenArtifact>
            values) {
      if (mavenArtifactsBuilder_ == null) {
        ensureMavenArtifactsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mavenArtifacts_);
        onChanged();
      } else {
        mavenArtifactsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder clearMavenArtifacts() {
      if (mavenArtifactsBuilder_ == null) {
        mavenArtifacts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mavenArtifactsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public Builder removeMavenArtifacts(int index) {
      if (mavenArtifactsBuilder_ == null) {
        ensureMavenArtifactsIsMutable();
        mavenArtifacts_.remove(index);
        onChanged();
      } else {
        mavenArtifactsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.MavenArtifact.Builder getMavenArtifactsBuilder(
        int index) {
      return getMavenArtifactsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.MavenArtifactOrBuilder
        getMavenArtifactsOrBuilder(int index) {
      if (mavenArtifactsBuilder_ == null) {
        return mavenArtifacts_.get(index);
      } else {
        return mavenArtifactsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.artifactregistry.v1.MavenArtifactOrBuilder>
        getMavenArtifactsOrBuilderList() {
      if (mavenArtifactsBuilder_ != null) {
        return mavenArtifactsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mavenArtifacts_);
      }
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.MavenArtifact.Builder
        addMavenArtifactsBuilder() {
      return getMavenArtifactsFieldBuilder()
          .addBuilder(com.google.devtools.artifactregistry.v1.MavenArtifact.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.MavenArtifact.Builder addMavenArtifactsBuilder(
        int index) {
      return getMavenArtifactsFieldBuilder()
          .addBuilder(
              index, com.google.devtools.artifactregistry.v1.MavenArtifact.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The maven artifacts returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1.MavenArtifact maven_artifacts = 1;</code>
     */
    public java.util.List<com.google.devtools.artifactregistry.v1.MavenArtifact.Builder>
        getMavenArtifactsBuilderList() {
      return getMavenArtifactsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.MavenArtifact,
            com.google.devtools.artifactregistry.v1.MavenArtifact.Builder,
            com.google.devtools.artifactregistry.v1.MavenArtifactOrBuilder>
        getMavenArtifactsFieldBuilder() {
      if (mavenArtifactsBuilder_ == null) {
        mavenArtifactsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.devtools.artifactregistry.v1.MavenArtifact,
                com.google.devtools.artifactregistry.v1.MavenArtifact.Builder,
                com.google.devtools.artifactregistry.v1.MavenArtifactOrBuilder>(
                mavenArtifacts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mavenArtifacts_ = null;
      }
      return mavenArtifactsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of artifacts, or empty if there are no
     * more artifacts to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1.ListMavenArtifactsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1.ListMavenArtifactsResponse)
  private static final com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse();
  }

  public static com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMavenArtifactsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListMavenArtifactsResponse>() {
        @java.lang.Override
        public ListMavenArtifactsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListMavenArtifactsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMavenArtifactsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

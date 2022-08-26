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
// source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1beta;

/**
 *
 *
 * <pre>
 * Response for the `ListFindings` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1beta.ListFindingsResponse}
 */
public final class ListFindingsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1beta.ListFindingsResponse)
    ListFindingsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListFindingsResponse.newBuilder() to construct.
  private ListFindingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListFindingsResponse() {
    findings_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListFindingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListFindingsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                findings_ =
                    new java.util.ArrayList<com.google.cloud.websecurityscanner.v1beta.Finding>();
                mutable_bitField0_ |= 0x00000001;
              }
              findings_.add(
                  input.readMessage(
                      com.google.cloud.websecurityscanner.v1beta.Finding.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        findings_ = java.util.Collections.unmodifiableList(findings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse.class,
            com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse.Builder.class);
  }

  public static final int FINDINGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.websecurityscanner.v1beta.Finding> findings_;
  /**
   *
   *
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.websecurityscanner.v1beta.Finding> getFindingsList() {
    return findings_;
  }
  /**
   *
   *
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.websecurityscanner.v1beta.FindingOrBuilder>
      getFindingsOrBuilderList() {
    return findings_;
  }
  /**
   *
   *
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
   */
  @java.lang.Override
  public int getFindingsCount() {
    return findings_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1beta.Finding getFindings(int index) {
    return findings_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of Findings returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1beta.FindingOrBuilder getFindingsOrBuilder(
      int index) {
    return findings_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
    for (int i = 0; i < findings_.size(); i++) {
      output.writeMessage(1, findings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < findings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, findings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse other =
        (com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse) obj;

    if (!getFindingsList().equals(other.getFindingsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getFindingsCount() > 0) {
      hash = (37 * hash) + FINDINGS_FIELD_NUMBER;
      hash = (53 * hash) + getFindingsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parseFrom(
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
      com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse prototype) {
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
   * Response for the `ListFindings` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1beta.ListFindingsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1beta.ListFindingsResponse)
      com.google.cloud.websecurityscanner.v1beta.ListFindingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse.class,
              com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFindingsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (findingsBuilder_ == null) {
        findings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        findingsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ListFindingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse build() {
      com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse buildPartial() {
      com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse result =
          new com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse(this);
      int from_bitField0_ = bitField0_;
      if (findingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          findings_ = java.util.Collections.unmodifiableList(findings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.findings_ = findings_;
      } else {
        result.findings_ = findingsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse other) {
      if (other
          == com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse.getDefaultInstance())
        return this;
      if (findingsBuilder_ == null) {
        if (!other.findings_.isEmpty()) {
          if (findings_.isEmpty()) {
            findings_ = other.findings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFindingsIsMutable();
            findings_.addAll(other.findings_);
          }
          onChanged();
        }
      } else {
        if (!other.findings_.isEmpty()) {
          if (findingsBuilder_.isEmpty()) {
            findingsBuilder_.dispose();
            findingsBuilder_ = null;
            findings_ = other.findings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            findingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFindingsFieldBuilder()
                    : null;
          } else {
            findingsBuilder_.addAllMessages(other.findings_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.websecurityscanner.v1beta.Finding> findings_ =
        java.util.Collections.emptyList();

    private void ensureFindingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        findings_ =
            new java.util.ArrayList<com.google.cloud.websecurityscanner.v1beta.Finding>(findings_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1beta.Finding,
            com.google.cloud.websecurityscanner.v1beta.Finding.Builder,
            com.google.cloud.websecurityscanner.v1beta.FindingOrBuilder>
        findingsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1beta.Finding> getFindingsList() {
      if (findingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(findings_);
      } else {
        return findingsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public int getFindingsCount() {
      if (findingsBuilder_ == null) {
        return findings_.size();
      } else {
        return findingsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1beta.Finding getFindings(int index) {
      if (findingsBuilder_ == null) {
        return findings_.get(index);
      } else {
        return findingsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder setFindings(
        int index, com.google.cloud.websecurityscanner.v1beta.Finding value) {
      if (findingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingsIsMutable();
        findings_.set(index, value);
        onChanged();
      } else {
        findingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder setFindings(
        int index, com.google.cloud.websecurityscanner.v1beta.Finding.Builder builderForValue) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        findings_.set(index, builderForValue.build());
        onChanged();
      } else {
        findingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder addFindings(com.google.cloud.websecurityscanner.v1beta.Finding value) {
      if (findingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingsIsMutable();
        findings_.add(value);
        onChanged();
      } else {
        findingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder addFindings(
        int index, com.google.cloud.websecurityscanner.v1beta.Finding value) {
      if (findingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFindingsIsMutable();
        findings_.add(index, value);
        onChanged();
      } else {
        findingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder addFindings(
        com.google.cloud.websecurityscanner.v1beta.Finding.Builder builderForValue) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        findings_.add(builderForValue.build());
        onChanged();
      } else {
        findingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder addFindings(
        int index, com.google.cloud.websecurityscanner.v1beta.Finding.Builder builderForValue) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        findings_.add(index, builderForValue.build());
        onChanged();
      } else {
        findingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder addAllFindings(
        java.lang.Iterable<? extends com.google.cloud.websecurityscanner.v1beta.Finding> values) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, findings_);
        onChanged();
      } else {
        findingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder clearFindings() {
      if (findingsBuilder_ == null) {
        findings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        findingsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public Builder removeFindings(int index) {
      if (findingsBuilder_ == null) {
        ensureFindingsIsMutable();
        findings_.remove(index);
        onChanged();
      } else {
        findingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1beta.Finding.Builder getFindingsBuilder(
        int index) {
      return getFindingsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1beta.FindingOrBuilder getFindingsOrBuilder(
        int index) {
      if (findingsBuilder_ == null) {
        return findings_.get(index);
      } else {
        return findingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.websecurityscanner.v1beta.FindingOrBuilder>
        getFindingsOrBuilderList() {
      if (findingsBuilder_ != null) {
        return findingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(findings_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1beta.Finding.Builder addFindingsBuilder() {
      return getFindingsFieldBuilder()
          .addBuilder(com.google.cloud.websecurityscanner.v1beta.Finding.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1beta.Finding.Builder addFindingsBuilder(
        int index) {
      return getFindingsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.websecurityscanner.v1beta.Finding.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Findings returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1beta.Finding findings = 1;</code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1beta.Finding.Builder>
        getFindingsBuilderList() {
      return getFindingsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1beta.Finding,
            com.google.cloud.websecurityscanner.v1beta.Finding.Builder,
            com.google.cloud.websecurityscanner.v1beta.FindingOrBuilder>
        getFindingsFieldBuilder() {
      if (findingsBuilder_ == null) {
        findingsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.websecurityscanner.v1beta.Finding,
                com.google.cloud.websecurityscanner.v1beta.Finding.Builder,
                com.google.cloud.websecurityscanner.v1beta.FindingOrBuilder>(
                findings_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        findings_ = null;
      }
      return findingsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1beta.ListFindingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1beta.ListFindingsResponse)
  private static final com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse();
  }

  public static com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFindingsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListFindingsResponse>() {
        @java.lang.Override
        public ListFindingsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListFindingsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListFindingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFindingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
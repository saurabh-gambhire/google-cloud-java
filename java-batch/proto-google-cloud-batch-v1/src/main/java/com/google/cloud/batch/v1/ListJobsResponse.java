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
// source: google/cloud/batch/v1/batch.proto

package com.google.cloud.batch.v1;

/**
 *
 *
 * <pre>
 * ListJob Response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1.ListJobsResponse}
 */
public final class ListJobsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1.ListJobsResponse)
    ListJobsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListJobsResponse.newBuilder() to construct.
  private ListJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListJobsResponse() {
    jobs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
    unreachable_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListJobsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.batch.v1.BatchProto
        .internal_static_google_cloud_batch_v1_ListJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1.BatchProto
        .internal_static_google_cloud_batch_v1_ListJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1.ListJobsResponse.class,
            com.google.cloud.batch.v1.ListJobsResponse.Builder.class);
  }

  public static final int JOBS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.batch.v1.Job> jobs_;
  /**
   *
   *
   * <pre>
   * Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.batch.v1.Job> getJobsList() {
    return jobs_;
  }
  /**
   *
   *
   * <pre>
   * Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.batch.v1.JobOrBuilder> getJobsOrBuilderList() {
    return jobs_;
  }
  /**
   *
   *
   * <pre>
   * Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
   */
  @java.lang.Override
  public int getJobsCount() {
    return jobs_.size();
  }
  /**
   *
   *
   * <pre>
   * Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.batch.v1.Job getJobs(int index) {
    return jobs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.batch.v1.JobOrBuilder getJobsOrBuilder(int index) {
    return jobs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Next page token.
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
   * Next page token.
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

  public static final int UNREACHABLE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList unreachable_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  public com.google.protobuf.ProtocolStringList getUnreachableList() {
    return unreachable_;
  }
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  public int getUnreachableCount() {
    return unreachable_.size();
  }
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  public java.lang.String getUnreachable(int index) {
    return unreachable_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  public com.google.protobuf.ByteString getUnreachableBytes(int index) {
    return unreachable_.getByteString(index);
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
    for (int i = 0; i < jobs_.size(); i++) {
      output.writeMessage(1, jobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    for (int i = 0; i < unreachable_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, unreachable_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, jobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < unreachable_.size(); i++) {
        dataSize += computeStringSizeNoTag(unreachable_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUnreachableList().size();
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
    if (!(obj instanceof com.google.cloud.batch.v1.ListJobsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1.ListJobsResponse other =
        (com.google.cloud.batch.v1.ListJobsResponse) obj;

    if (!getJobsList().equals(other.getJobsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnreachableList().equals(other.getUnreachableList())) return false;
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
    if (getJobsCount() > 0) {
      hash = (37 * hash) + JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getJobsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    if (getUnreachableCount() > 0) {
      hash = (37 * hash) + UNREACHABLE_FIELD_NUMBER;
      hash = (53 * hash) + getUnreachableList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.ListJobsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.batch.v1.ListJobsResponse prototype) {
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
   * ListJob Response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1.ListJobsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1.ListJobsResponse)
      com.google.cloud.batch.v1.ListJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.batch.v1.BatchProto
          .internal_static_google_cloud_batch_v1_ListJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1.BatchProto
          .internal_static_google_cloud_batch_v1_ListJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1.ListJobsResponse.class,
              com.google.cloud.batch.v1.ListJobsResponse.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1.ListJobsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
      } else {
        jobs_ = null;
        jobsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      unreachable_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.batch.v1.BatchProto
          .internal_static_google_cloud_batch_v1_ListJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.ListJobsResponse getDefaultInstanceForType() {
      return com.google.cloud.batch.v1.ListJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.ListJobsResponse build() {
      com.google.cloud.batch.v1.ListJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.ListJobsResponse buildPartial() {
      com.google.cloud.batch.v1.ListJobsResponse result =
          new com.google.cloud.batch.v1.ListJobsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.batch.v1.ListJobsResponse result) {
      if (jobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jobs_ = java.util.Collections.unmodifiableList(jobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobs_ = jobs_;
      } else {
        result.jobs_ = jobsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.batch.v1.ListJobsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        unreachable_.makeImmutable();
        result.unreachable_ = unreachable_;
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
      if (other instanceof com.google.cloud.batch.v1.ListJobsResponse) {
        return mergeFrom((com.google.cloud.batch.v1.ListJobsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1.ListJobsResponse other) {
      if (other == com.google.cloud.batch.v1.ListJobsResponse.getDefaultInstance()) return this;
      if (jobsBuilder_ == null) {
        if (!other.jobs_.isEmpty()) {
          if (jobs_.isEmpty()) {
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobsIsMutable();
            jobs_.addAll(other.jobs_);
          }
          onChanged();
        }
      } else {
        if (!other.jobs_.isEmpty()) {
          if (jobsBuilder_.isEmpty()) {
            jobsBuilder_.dispose();
            jobsBuilder_ = null;
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getJobsFieldBuilder()
                    : null;
          } else {
            jobsBuilder_.addAllMessages(other.jobs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.unreachable_.isEmpty()) {
        if (unreachable_.isEmpty()) {
          unreachable_ = other.unreachable_;
          bitField0_ |= 0x00000004;
        } else {
          ensureUnreachableIsMutable();
          unreachable_.addAll(other.unreachable_);
        }
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
                com.google.cloud.batch.v1.Job m =
                    input.readMessage(com.google.cloud.batch.v1.Job.parser(), extensionRegistry);
                if (jobsBuilder_ == null) {
                  ensureJobsIsMutable();
                  jobs_.add(m);
                } else {
                  jobsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureUnreachableIsMutable();
                unreachable_.add(s);
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

    private java.util.List<com.google.cloud.batch.v1.Job> jobs_ = java.util.Collections.emptyList();

    private void ensureJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jobs_ = new java.util.ArrayList<com.google.cloud.batch.v1.Job>(jobs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.batch.v1.Job,
            com.google.cloud.batch.v1.Job.Builder,
            com.google.cloud.batch.v1.JobOrBuilder>
        jobsBuilder_;

    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.batch.v1.Job> getJobsList() {
      if (jobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobs_);
      } else {
        return jobsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public int getJobsCount() {
      if (jobsBuilder_ == null) {
        return jobs_.size();
      } else {
        return jobsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public com.google.cloud.batch.v1.Job getJobs(int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);
      } else {
        return jobsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder setJobs(int index, com.google.cloud.batch.v1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.set(index, value);
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder setJobs(int index, com.google.cloud.batch.v1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder addJobs(com.google.cloud.batch.v1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder addJobs(int index, com.google.cloud.batch.v1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(index, value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder addJobs(com.google.cloud.batch.v1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder addJobs(int index, com.google.cloud.batch.v1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder addAllJobs(java.lang.Iterable<? extends com.google.cloud.batch.v1.Job> values) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, jobs_);
        onChanged();
      } else {
        jobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder clearJobs() {
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public Builder removeJobs(int index) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.remove(index);
        onChanged();
      } else {
        jobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public com.google.cloud.batch.v1.Job.Builder getJobsBuilder(int index) {
      return getJobsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public com.google.cloud.batch.v1.JobOrBuilder getJobsOrBuilder(int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);
      } else {
        return jobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.batch.v1.JobOrBuilder> getJobsOrBuilderList() {
      if (jobsBuilder_ != null) {
        return jobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobs_);
      }
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public com.google.cloud.batch.v1.Job.Builder addJobsBuilder() {
      return getJobsFieldBuilder().addBuilder(com.google.cloud.batch.v1.Job.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public com.google.cloud.batch.v1.Job.Builder addJobsBuilder(int index) {
      return getJobsFieldBuilder()
          .addBuilder(index, com.google.cloud.batch.v1.Job.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Jobs.
     * </pre>
     *
     * <code>repeated .google.cloud.batch.v1.Job jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.batch.v1.Job.Builder> getJobsBuilderList() {
      return getJobsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.batch.v1.Job,
            com.google.cloud.batch.v1.Job.Builder,
            com.google.cloud.batch.v1.JobOrBuilder>
        getJobsFieldBuilder() {
      if (jobsBuilder_ == null) {
        jobsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.batch.v1.Job,
                com.google.cloud.batch.v1.Job.Builder,
                com.google.cloud.batch.v1.JobOrBuilder>(
                jobs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        jobs_ = null;
      }
      return jobsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Next page token.
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
     * Next page token.
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
     * Next page token.
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
     * Next page token.
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
     * Next page token.
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

    private com.google.protobuf.LazyStringArrayList unreachable_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureUnreachableIsMutable() {
      if (!unreachable_.isModifiable()) {
        unreachable_ = new com.google.protobuf.LazyStringArrayList(unreachable_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @return A list containing the unreachable.
     */
    public com.google.protobuf.ProtocolStringList getUnreachableList() {
      unreachable_.makeImmutable();
      return unreachable_;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @return The count of unreachable.
     */
    public int getUnreachableCount() {
      return unreachable_.size();
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The unreachable at the given index.
     */
    public java.lang.String getUnreachable(int index) {
      return unreachable_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the unreachable at the given index.
     */
    public com.google.protobuf.ByteString getUnreachableBytes(int index) {
      return unreachable_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The unreachable to set.
     * @return This builder for chaining.
     */
    public Builder setUnreachable(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUnreachableIsMutable();
      unreachable_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @param value The unreachable to add.
     * @return This builder for chaining.
     */
    public Builder addUnreachable(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUnreachableIsMutable();
      unreachable_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @param values The unreachable to add.
     * @return This builder for chaining.
     */
    public Builder addAllUnreachable(java.lang.Iterable<java.lang.String> values) {
      ensureUnreachableIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, unreachable_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUnreachable() {
      unreachable_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Locations that could not be reached.
     * </pre>
     *
     * <code>repeated string unreachable = 3;</code>
     *
     * @param value The bytes of the unreachable to add.
     * @return This builder for chaining.
     */
    public Builder addUnreachableBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureUnreachableIsMutable();
      unreachable_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1.ListJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1.ListJobsResponse)
  private static final com.google.cloud.batch.v1.ListJobsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1.ListJobsResponse();
  }

  public static com.google.cloud.batch.v1.ListJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListJobsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListJobsResponse>() {
        @java.lang.Override
        public ListJobsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1.ListJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

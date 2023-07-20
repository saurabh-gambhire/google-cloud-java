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
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

/**
 *
 *
 * <pre>
 * Request message for
 * [UploadQueueYaml][google.cloud.tasks.v2beta2.CloudTasks.UploadQueueYaml].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta2.UploadQueueYamlRequest}
 */
public final class UploadQueueYamlRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta2.UploadQueueYamlRequest)
    UploadQueueYamlRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UploadQueueYamlRequest.newBuilder() to construct.
  private UploadQueueYamlRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UploadQueueYamlRequest() {
    appId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UploadQueueYamlRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta2_UploadQueueYamlRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta2_UploadQueueYamlRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest.class,
            com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest.Builder.class);
  }

  private int bitField0_;
  public static final int APP_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object appId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The App ID is supplied as an HTTP parameter. Unlike internal
   * usage of App ID, it does not include a region prefix. Rather, the App ID
   * represents the Project ID against which to make the request.
   * </pre>
   *
   * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The appId.
   */
  @java.lang.Override
  public java.lang.String getAppId() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The App ID is supplied as an HTTP parameter. Unlike internal
   * usage of App ID, it does not include a region prefix. Rather, the App ID
   * represents the Project ID against which to make the request.
   * </pre>
   *
   * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for appId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAppIdBytes() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      appId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HTTP_BODY_FIELD_NUMBER = 2;
  private com.google.api.HttpBody httpBody_;
  /**
   *
   *
   * <pre>
   * The http body contains the queue.yaml file which used to update queue lists
   * </pre>
   *
   * <code>optional .google.api.HttpBody http_body = 2;</code>
   *
   * @return Whether the httpBody field is set.
   */
  @java.lang.Override
  public boolean hasHttpBody() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The http body contains the queue.yaml file which used to update queue lists
   * </pre>
   *
   * <code>optional .google.api.HttpBody http_body = 2;</code>
   *
   * @return The httpBody.
   */
  @java.lang.Override
  public com.google.api.HttpBody getHttpBody() {
    return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
  }
  /**
   *
   *
   * <pre>
   * The http body contains the queue.yaml file which used to update queue lists
   * </pre>
   *
   * <code>optional .google.api.HttpBody http_body = 2;</code>
   */
  @java.lang.Override
  public com.google.api.HttpBodyOrBuilder getHttpBodyOrBuilder() {
    return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getHttpBody());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getHttpBody());
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest other =
        (com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest) obj;

    if (!getAppId().equals(other.getAppId())) return false;
    if (hasHttpBody() != other.hasHttpBody()) return false;
    if (hasHttpBody()) {
      if (!getHttpBody().equals(other.getHttpBody())) return false;
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
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAppId().hashCode();
    if (hasHttpBody()) {
      hash = (37 * hash) + HTTP_BODY_FIELD_NUMBER;
      hash = (53 * hash) + getHttpBody().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest parseFrom(
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
      com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest prototype) {
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
   * Request message for
   * [UploadQueueYaml][google.cloud.tasks.v2beta2.CloudTasks.UploadQueueYaml].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta2.UploadQueueYamlRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta2.UploadQueueYamlRequest)
      com.google.cloud.tasks.v2beta2.UploadQueueYamlRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_UploadQueueYamlRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_UploadQueueYamlRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest.class,
              com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getHttpBodyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      appId_ = "";
      httpBody_ = null;
      if (httpBodyBuilder_ != null) {
        httpBodyBuilder_.dispose();
        httpBodyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_UploadQueueYamlRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest build() {
      com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest buildPartial() {
      com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest result =
          new com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.appId_ = appId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.httpBody_ = httpBodyBuilder_ == null ? httpBody_ : httpBodyBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest other) {
      if (other == com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest.getDefaultInstance())
        return this;
      if (!other.getAppId().isEmpty()) {
        appId_ = other.appId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasHttpBody()) {
        mergeHttpBody(other.getHttpBody());
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
                appId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getHttpBodyFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object appId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The App ID is supplied as an HTTP parameter. Unlike internal
     * usage of App ID, it does not include a region prefix. Rather, the App ID
     * represents the Project ID against which to make the request.
     * </pre>
     *
     * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The appId.
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The App ID is supplied as an HTTP parameter. Unlike internal
     * usage of App ID, it does not include a region prefix. Rather, the App ID
     * represents the Project ID against which to make the request.
     * </pre>
     *
     * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for appId.
     */
    public com.google.protobuf.ByteString getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The App ID is supplied as an HTTP parameter. Unlike internal
     * usage of App ID, it does not include a region prefix. Rather, the App ID
     * represents the Project ID against which to make the request.
     * </pre>
     *
     * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      appId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The App ID is supplied as an HTTP parameter. Unlike internal
     * usage of App ID, it does not include a region prefix. Rather, the App ID
     * represents the Project ID against which to make the request.
     * </pre>
     *
     * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      appId_ = getDefaultInstance().getAppId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The App ID is supplied as an HTTP parameter. Unlike internal
     * usage of App ID, it does not include a region prefix. Rather, the App ID
     * represents the Project ID against which to make the request.
     * </pre>
     *
     * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      appId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.api.HttpBody httpBody_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.HttpBody,
            com.google.api.HttpBody.Builder,
            com.google.api.HttpBodyOrBuilder>
        httpBodyBuilder_;
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     *
     * @return Whether the httpBody field is set.
     */
    public boolean hasHttpBody() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     *
     * @return The httpBody.
     */
    public com.google.api.HttpBody getHttpBody() {
      if (httpBodyBuilder_ == null) {
        return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
      } else {
        return httpBodyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     */
    public Builder setHttpBody(com.google.api.HttpBody value) {
      if (httpBodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        httpBody_ = value;
      } else {
        httpBodyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     */
    public Builder setHttpBody(com.google.api.HttpBody.Builder builderForValue) {
      if (httpBodyBuilder_ == null) {
        httpBody_ = builderForValue.build();
      } else {
        httpBodyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     */
    public Builder mergeHttpBody(com.google.api.HttpBody value) {
      if (httpBodyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && httpBody_ != null
            && httpBody_ != com.google.api.HttpBody.getDefaultInstance()) {
          getHttpBodyBuilder().mergeFrom(value);
        } else {
          httpBody_ = value;
        }
      } else {
        httpBodyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     */
    public Builder clearHttpBody() {
      bitField0_ = (bitField0_ & ~0x00000002);
      httpBody_ = null;
      if (httpBodyBuilder_ != null) {
        httpBodyBuilder_.dispose();
        httpBodyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     */
    public com.google.api.HttpBody.Builder getHttpBodyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHttpBodyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     */
    public com.google.api.HttpBodyOrBuilder getHttpBodyOrBuilder() {
      if (httpBodyBuilder_ != null) {
        return httpBodyBuilder_.getMessageOrBuilder();
      } else {
        return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
      }
    }
    /**
     *
     *
     * <pre>
     * The http body contains the queue.yaml file which used to update queue lists
     * </pre>
     *
     * <code>optional .google.api.HttpBody http_body = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.HttpBody,
            com.google.api.HttpBody.Builder,
            com.google.api.HttpBodyOrBuilder>
        getHttpBodyFieldBuilder() {
      if (httpBodyBuilder_ == null) {
        httpBodyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.HttpBody,
                com.google.api.HttpBody.Builder,
                com.google.api.HttpBodyOrBuilder>(getHttpBody(), getParentForChildren(), isClean());
        httpBody_ = null;
      }
      return httpBodyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta2.UploadQueueYamlRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta2.UploadQueueYamlRequest)
  private static final com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest();
  }

  public static com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadQueueYamlRequest> PARSER =
      new com.google.protobuf.AbstractParser<UploadQueueYamlRequest>() {
        @java.lang.Override
        public UploadQueueYamlRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UploadQueueYamlRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadQueueYamlRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

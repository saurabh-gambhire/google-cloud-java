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
// source: google/cloud/baremetalsolution/v2/instance.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Message for response of DisableInteractiveSerialConsole.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse}
 */
public final class DisableInteractiveSerialConsoleResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse)
    DisableInteractiveSerialConsoleResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DisableInteractiveSerialConsoleResponse.newBuilder() to construct.
  private DisableInteractiveSerialConsoleResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DisableInteractiveSerialConsoleResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DisableInteractiveSerialConsoleResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.InstanceProto
        .internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.InstanceProto
        .internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse.class,
            com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse.Builder
                .class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj
        instanceof com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse other =
        (com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      parseFrom(
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
      com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse prototype) {
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
   * Message for response of DisableInteractiveSerialConsole.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse)
      com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.InstanceProto
          .internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.InstanceProto
          .internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse.class,
              com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.InstanceProto
          .internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
        getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse build() {
      com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
        buildPartial() {
      com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse result =
          new com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse(this);
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
      if (other
          instanceof
          com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse) {
        return mergeFrom(
            (com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse other) {
      if (other
          == com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
              .getDefaultInstance()) return this;
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse)
  private static final com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse();
  }

  public static com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisableInteractiveSerialConsoleResponse> PARSER =
      new com.google.protobuf.AbstractParser<DisableInteractiveSerialConsoleResponse>() {
        @java.lang.Override
        public DisableInteractiveSerialConsoleResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DisableInteractiveSerialConsoleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisableInteractiveSerialConsoleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.DisableInteractiveSerialConsoleResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

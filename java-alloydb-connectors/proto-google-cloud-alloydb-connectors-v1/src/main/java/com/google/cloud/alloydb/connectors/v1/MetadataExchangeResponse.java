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
// source: google/cloud/alloydb/connectors/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.alloydb.connectors.v1;

/**
 *
 *
 * <pre>
 * Message for response to metadata exchange request. The sole purpose of this
 * message is for the use of AlloyDB connectors. Clients should not rely on this
 * message directly as there can be breaking changes in the future.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.connectors.v1.MetadataExchangeResponse}
 */
public final class MetadataExchangeResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.connectors.v1.MetadataExchangeResponse)
    MetadataExchangeResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MetadataExchangeResponse.newBuilder() to construct.
  private MetadataExchangeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetadataExchangeResponse() {
    responseCode_ = 0;
    error_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetadataExchangeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.connectors.v1.ResourcesProto
        .internal_static_google_cloud_alloydb_connectors_v1_MetadataExchangeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.connectors.v1.ResourcesProto
        .internal_static_google_cloud_alloydb_connectors_v1_MetadataExchangeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.class,
            com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Response code.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode}
   */
  public enum ResponseCode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unknown response code
     * </pre>
     *
     * <code>RESPONSE_CODE_UNSPECIFIED = 0;</code>
     */
    RESPONSE_CODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Success
     * </pre>
     *
     * <code>OK = 1;</code>
     */
    OK(1),
    /**
     *
     *
     * <pre>
     * Failure
     * </pre>
     *
     * <code>ERROR = 2;</code>
     */
    ERROR(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unknown response code
     * </pre>
     *
     * <code>RESPONSE_CODE_UNSPECIFIED = 0;</code>
     */
    public static final int RESPONSE_CODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Success
     * </pre>
     *
     * <code>OK = 1;</code>
     */
    public static final int OK_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Failure
     * </pre>
     *
     * <code>ERROR = 2;</code>
     */
    public static final int ERROR_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResponseCode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ResponseCode forNumber(int value) {
      switch (value) {
        case 0:
          return RESPONSE_CODE_UNSPECIFIED;
        case 1:
          return OK;
        case 2:
          return ERROR;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResponseCode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ResponseCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResponseCode>() {
          public ResponseCode findValueByNumber(int number) {
            return ResponseCode.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ResponseCode[] VALUES = values();

    public static ResponseCode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ResponseCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode)
  }

  public static final int RESPONSE_CODE_FIELD_NUMBER = 1;
  private int responseCode_ = 0;
  /**
   *
   *
   * <pre>
   * Response code.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for responseCode.
   */
  @java.lang.Override
  public int getResponseCodeValue() {
    return responseCode_;
  }
  /**
   *
   *
   * <pre>
   * Response code.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
   * </code>
   *
   * @return The responseCode.
   */
  @java.lang.Override
  public com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode
      getResponseCode() {
    com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode result =
        com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode.forNumber(
            responseCode_);
    return result == null
        ? com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode.UNRECOGNIZED
        : result;
  }

  public static final int ERROR_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object error_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Error message.
   * </pre>
   *
   * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Error message.
   * </pre>
   *
   * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for error.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      error_ = b;
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
    if (responseCode_
        != com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode
            .RESPONSE_CODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, responseCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(error_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseCode_
        != com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode
            .RESPONSE_CODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, responseCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(error_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
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
    if (!(obj instanceof com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse other =
        (com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse) obj;

    if (responseCode_ != other.responseCode_) return false;
    if (!getError().equals(other.getError())) return false;
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
    hash = (37 * hash) + RESPONSE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + responseCode_;
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse parseFrom(
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
      com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse prototype) {
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
   * Message for response to metadata exchange request. The sole purpose of this
   * message is for the use of AlloyDB connectors. Clients should not rely on this
   * message directly as there can be breaking changes in the future.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.connectors.v1.MetadataExchangeResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.connectors.v1.MetadataExchangeResponse)
      com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.connectors.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_connectors_v1_MetadataExchangeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.connectors.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_connectors_v1_MetadataExchangeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.class,
              com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      responseCode_ = 0;
      error_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.connectors.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_connectors_v1_MetadataExchangeResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse
        getDefaultInstanceForType() {
      return com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse build() {
      com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse buildPartial() {
      com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse result =
          new com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.responseCode_ = responseCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.error_ = error_;
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
      if (other instanceof com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse) {
        return mergeFrom((com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse other) {
      if (other
          == com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.getDefaultInstance())
        return this;
      if (other.responseCode_ != 0) {
        setResponseCodeValue(other.getResponseCodeValue());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
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
            case 8:
              {
                responseCode_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                error_ = input.readStringRequireUtf8();
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

    private int responseCode_ = 0;
    /**
     *
     *
     * <pre>
     * Response code.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for responseCode.
     */
    @java.lang.Override
    public int getResponseCodeValue() {
      return responseCode_;
    }
    /**
     *
     *
     * <pre>
     * Response code.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for responseCode to set.
     * @return This builder for chaining.
     */
    public Builder setResponseCodeValue(int value) {
      responseCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Response code.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
     * </code>
     *
     * @return The responseCode.
     */
    @java.lang.Override
    public com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode
        getResponseCode() {
      com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode result =
          com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode.forNumber(
              responseCode_);
      return result == null
          ? com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Response code.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
     * </code>
     *
     * @param value The responseCode to set.
     * @return This builder for chaining.
     */
    public Builder setResponseCode(
        com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      responseCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Response code.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResponseCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      responseCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Error message.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Error message.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Error message.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      error_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Error message.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearError() {
      error_ = getDefaultInstance().getError();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Error message.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      error_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.connectors.v1.MetadataExchangeResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.connectors.v1.MetadataExchangeResponse)
  private static final com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse();
  }

  public static com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetadataExchangeResponse> PARSER =
      new com.google.protobuf.AbstractParser<MetadataExchangeResponse>() {
        @java.lang.Override
        public MetadataExchangeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetadataExchangeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetadataExchangeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

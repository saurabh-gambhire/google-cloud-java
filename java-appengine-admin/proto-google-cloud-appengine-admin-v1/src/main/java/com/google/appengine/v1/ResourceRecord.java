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
// source: google/appengine/v1/domain_mapping.proto

// Protobuf Java Version: 3.25.2
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * A DNS resource record.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ResourceRecord}
 */
public final class ResourceRecord extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ResourceRecord)
    ResourceRecordOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResourceRecord.newBuilder() to construct.
  private ResourceRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourceRecord() {
    name_ = "";
    rrdata_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourceRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.DomainMappingProto
        .internal_static_google_appengine_v1_ResourceRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.DomainMappingProto
        .internal_static_google_appengine_v1_ResourceRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ResourceRecord.class,
            com.google.appengine.v1.ResourceRecord.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * A resource record type.
   * </pre>
   *
   * Protobuf enum {@code google.appengine.v1.ResourceRecord.RecordType}
   */
  public enum RecordType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * An unknown resource record.
     * </pre>
     *
     * <code>RECORD_TYPE_UNSPECIFIED = 0;</code>
     */
    RECORD_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * An A resource record. Data is an IPv4 address.
     * </pre>
     *
     * <code>A = 1;</code>
     */
    A(1),
    /**
     *
     *
     * <pre>
     * An AAAA resource record. Data is an IPv6 address.
     * </pre>
     *
     * <code>AAAA = 2;</code>
     */
    AAAA(2),
    /**
     *
     *
     * <pre>
     * A CNAME resource record. Data is a domain name to be aliased.
     * </pre>
     *
     * <code>CNAME = 3;</code>
     */
    CNAME(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * An unknown resource record.
     * </pre>
     *
     * <code>RECORD_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int RECORD_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * An A resource record. Data is an IPv4 address.
     * </pre>
     *
     * <code>A = 1;</code>
     */
    public static final int A_VALUE = 1;
    /**
     *
     *
     * <pre>
     * An AAAA resource record. Data is an IPv6 address.
     * </pre>
     *
     * <code>AAAA = 2;</code>
     */
    public static final int AAAA_VALUE = 2;
    /**
     *
     *
     * <pre>
     * A CNAME resource record. Data is a domain name to be aliased.
     * </pre>
     *
     * <code>CNAME = 3;</code>
     */
    public static final int CNAME_VALUE = 3;

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
    public static RecordType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RecordType forNumber(int value) {
      switch (value) {
        case 0:
          return RECORD_TYPE_UNSPECIFIED;
        case 1:
          return A;
        case 2:
          return AAAA;
        case 3:
          return CNAME;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RecordType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<RecordType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RecordType>() {
          public RecordType findValueByNumber(int number) {
            return RecordType.forNumber(number);
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
      return com.google.appengine.v1.ResourceRecord.getDescriptor().getEnumTypes().get(0);
    }

    private static final RecordType[] VALUES = values();

    public static RecordType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RecordType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.appengine.v1.ResourceRecord.RecordType)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Relative name of the object affected by this record. Only applicable for
   * `CNAME` records. Example: 'www'.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Relative name of the object affected by this record. Only applicable for
   * `CNAME` records. Example: 'www'.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RRDATA_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object rrdata_ = "";
  /**
   *
   *
   * <pre>
   * Data for this record. Values vary by record type, as defined in RFC 1035
   * (section 5) and RFC 1034 (section 3.6.1).
   * </pre>
   *
   * <code>string rrdata = 2;</code>
   *
   * @return The rrdata.
   */
  @java.lang.Override
  public java.lang.String getRrdata() {
    java.lang.Object ref = rrdata_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rrdata_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Data for this record. Values vary by record type, as defined in RFC 1035
   * (section 5) and RFC 1034 (section 3.6.1).
   * </pre>
   *
   * <code>string rrdata = 2;</code>
   *
   * @return The bytes for rrdata.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRrdataBytes() {
    java.lang.Object ref = rrdata_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      rrdata_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Resource record type. Example: `AAAA`.
   * </pre>
   *
   * <code>.google.appengine.v1.ResourceRecord.RecordType type = 3;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Resource record type. Example: `AAAA`.
   * </pre>
   *
   * <code>.google.appengine.v1.ResourceRecord.RecordType type = 3;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.appengine.v1.ResourceRecord.RecordType getType() {
    com.google.appengine.v1.ResourceRecord.RecordType result =
        com.google.appengine.v1.ResourceRecord.RecordType.forNumber(type_);
    return result == null ? com.google.appengine.v1.ResourceRecord.RecordType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rrdata_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, rrdata_);
    }
    if (type_
        != com.google.appengine.v1.ResourceRecord.RecordType.RECORD_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rrdata_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, rrdata_);
    }
    if (type_
        != com.google.appengine.v1.ResourceRecord.RecordType.RECORD_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, type_);
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
    if (!(obj instanceof com.google.appengine.v1.ResourceRecord)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ResourceRecord other = (com.google.appengine.v1.ResourceRecord) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getRrdata().equals(other.getRrdata())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + RRDATA_FIELD_NUMBER;
    hash = (53 * hash) + getRrdata().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ResourceRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ResourceRecord parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ResourceRecord parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.ResourceRecord prototype) {
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
   * A DNS resource record.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ResourceRecord}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ResourceRecord)
      com.google.appengine.v1.ResourceRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.DomainMappingProto
          .internal_static_google_appengine_v1_ResourceRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.DomainMappingProto
          .internal_static_google_appengine_v1_ResourceRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ResourceRecord.class,
              com.google.appengine.v1.ResourceRecord.Builder.class);
    }

    // Construct using com.google.appengine.v1.ResourceRecord.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      rrdata_ = "";
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.DomainMappingProto
          .internal_static_google_appengine_v1_ResourceRecord_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.ResourceRecord getDefaultInstanceForType() {
      return com.google.appengine.v1.ResourceRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.ResourceRecord build() {
      com.google.appengine.v1.ResourceRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.ResourceRecord buildPartial() {
      com.google.appengine.v1.ResourceRecord result =
          new com.google.appengine.v1.ResourceRecord(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.ResourceRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rrdata_ = rrdata_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
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
      if (other instanceof com.google.appengine.v1.ResourceRecord) {
        return mergeFrom((com.google.appengine.v1.ResourceRecord) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ResourceRecord other) {
      if (other == com.google.appengine.v1.ResourceRecord.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRrdata().isEmpty()) {
        rrdata_ = other.rrdata_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                rrdata_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                type_ = input.readEnum();
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Relative name of the object affected by this record. Only applicable for
     * `CNAME` records. Example: 'www'.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Relative name of the object affected by this record. Only applicable for
     * `CNAME` records. Example: 'www'.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Relative name of the object affected by this record. Only applicable for
     * `CNAME` records. Example: 'www'.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Relative name of the object affected by this record. Only applicable for
     * `CNAME` records. Example: 'www'.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Relative name of the object affected by this record. Only applicable for
     * `CNAME` records. Example: 'www'.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object rrdata_ = "";
    /**
     *
     *
     * <pre>
     * Data for this record. Values vary by record type, as defined in RFC 1035
     * (section 5) and RFC 1034 (section 3.6.1).
     * </pre>
     *
     * <code>string rrdata = 2;</code>
     *
     * @return The rrdata.
     */
    public java.lang.String getRrdata() {
      java.lang.Object ref = rrdata_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rrdata_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Data for this record. Values vary by record type, as defined in RFC 1035
     * (section 5) and RFC 1034 (section 3.6.1).
     * </pre>
     *
     * <code>string rrdata = 2;</code>
     *
     * @return The bytes for rrdata.
     */
    public com.google.protobuf.ByteString getRrdataBytes() {
      java.lang.Object ref = rrdata_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rrdata_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Data for this record. Values vary by record type, as defined in RFC 1035
     * (section 5) and RFC 1034 (section 3.6.1).
     * </pre>
     *
     * <code>string rrdata = 2;</code>
     *
     * @param value The rrdata to set.
     * @return This builder for chaining.
     */
    public Builder setRrdata(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      rrdata_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data for this record. Values vary by record type, as defined in RFC 1035
     * (section 5) and RFC 1034 (section 3.6.1).
     * </pre>
     *
     * <code>string rrdata = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRrdata() {
      rrdata_ = getDefaultInstance().getRrdata();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data for this record. Values vary by record type, as defined in RFC 1035
     * (section 5) and RFC 1034 (section 3.6.1).
     * </pre>
     *
     * <code>string rrdata = 2;</code>
     *
     * @param value The bytes for rrdata to set.
     * @return This builder for chaining.
     */
    public Builder setRrdataBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      rrdata_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Resource record type. Example: `AAAA`.
     * </pre>
     *
     * <code>.google.appengine.v1.ResourceRecord.RecordType type = 3;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Resource record type. Example: `AAAA`.
     * </pre>
     *
     * <code>.google.appengine.v1.ResourceRecord.RecordType type = 3;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource record type. Example: `AAAA`.
     * </pre>
     *
     * <code>.google.appengine.v1.ResourceRecord.RecordType type = 3;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.appengine.v1.ResourceRecord.RecordType getType() {
      com.google.appengine.v1.ResourceRecord.RecordType result =
          com.google.appengine.v1.ResourceRecord.RecordType.forNumber(type_);
      return result == null
          ? com.google.appengine.v1.ResourceRecord.RecordType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Resource record type. Example: `AAAA`.
     * </pre>
     *
     * <code>.google.appengine.v1.ResourceRecord.RecordType type = 3;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.appengine.v1.ResourceRecord.RecordType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource record type. Example: `AAAA`.
     * </pre>
     *
     * <code>.google.appengine.v1.ResourceRecord.RecordType type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ResourceRecord)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ResourceRecord)
  private static final com.google.appengine.v1.ResourceRecord DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ResourceRecord();
  }

  public static com.google.appengine.v1.ResourceRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceRecord> PARSER =
      new com.google.protobuf.AbstractParser<ResourceRecord>() {
        @java.lang.Override
        public ResourceRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.ResourceRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

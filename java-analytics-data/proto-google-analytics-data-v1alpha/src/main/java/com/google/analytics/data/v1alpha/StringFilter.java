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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * The filter for string
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.StringFilter}
 */
public final class StringFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.StringFilter)
    StringFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StringFilter.newBuilder() to construct.
  private StringFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StringFilter() {
    matchType_ = 0;
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StringFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_StringFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_StringFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.StringFilter.class,
            com.google.analytics.data.v1alpha.StringFilter.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The match type of a string filter
   * </pre>
   *
   * Protobuf enum {@code google.analytics.data.v1alpha.StringFilter.MatchType}
   */
  public enum MatchType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>MATCH_TYPE_UNSPECIFIED = 0;</code>
     */
    MATCH_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Exact match of the string value.
     * </pre>
     *
     * <code>EXACT = 1;</code>
     */
    EXACT(1),
    /**
     *
     *
     * <pre>
     * Begins with the string value.
     * </pre>
     *
     * <code>BEGINS_WITH = 2;</code>
     */
    BEGINS_WITH(2),
    /**
     *
     *
     * <pre>
     * Ends with the string value.
     * </pre>
     *
     * <code>ENDS_WITH = 3;</code>
     */
    ENDS_WITH(3),
    /**
     *
     *
     * <pre>
     * Contains the string value.
     * </pre>
     *
     * <code>CONTAINS = 4;</code>
     */
    CONTAINS(4),
    /**
     *
     *
     * <pre>
     * Full match for the regular expression with the string value.
     * </pre>
     *
     * <code>FULL_REGEXP = 5;</code>
     */
    FULL_REGEXP(5),
    /**
     *
     *
     * <pre>
     * Partial match for the regular expression with the string value.
     * </pre>
     *
     * <code>PARTIAL_REGEXP = 6;</code>
     */
    PARTIAL_REGEXP(6),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>MATCH_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MATCH_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Exact match of the string value.
     * </pre>
     *
     * <code>EXACT = 1;</code>
     */
    public static final int EXACT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Begins with the string value.
     * </pre>
     *
     * <code>BEGINS_WITH = 2;</code>
     */
    public static final int BEGINS_WITH_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Ends with the string value.
     * </pre>
     *
     * <code>ENDS_WITH = 3;</code>
     */
    public static final int ENDS_WITH_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Contains the string value.
     * </pre>
     *
     * <code>CONTAINS = 4;</code>
     */
    public static final int CONTAINS_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Full match for the regular expression with the string value.
     * </pre>
     *
     * <code>FULL_REGEXP = 5;</code>
     */
    public static final int FULL_REGEXP_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Partial match for the regular expression with the string value.
     * </pre>
     *
     * <code>PARTIAL_REGEXP = 6;</code>
     */
    public static final int PARTIAL_REGEXP_VALUE = 6;

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
    public static MatchType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MatchType forNumber(int value) {
      switch (value) {
        case 0:
          return MATCH_TYPE_UNSPECIFIED;
        case 1:
          return EXACT;
        case 2:
          return BEGINS_WITH;
        case 3:
          return ENDS_WITH;
        case 4:
          return CONTAINS;
        case 5:
          return FULL_REGEXP;
        case 6:
          return PARTIAL_REGEXP;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MatchType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<MatchType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MatchType>() {
          public MatchType findValueByNumber(int number) {
            return MatchType.forNumber(number);
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
      return com.google.analytics.data.v1alpha.StringFilter.getDescriptor().getEnumTypes().get(0);
    }

    private static final MatchType[] VALUES = values();

    public static MatchType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MatchType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.analytics.data.v1alpha.StringFilter.MatchType)
  }

  public static final int MATCH_TYPE_FIELD_NUMBER = 1;
  private int matchType_ = 0;
  /**
   *
   *
   * <pre>
   * The match type for this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter.MatchType match_type = 1;</code>
   *
   * @return The enum numeric value on the wire for matchType.
   */
  @java.lang.Override
  public int getMatchTypeValue() {
    return matchType_;
  }
  /**
   *
   *
   * <pre>
   * The match type for this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter.MatchType match_type = 1;</code>
   *
   * @return The matchType.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.StringFilter.MatchType getMatchType() {
    com.google.analytics.data.v1alpha.StringFilter.MatchType result =
        com.google.analytics.data.v1alpha.StringFilter.MatchType.forNumber(matchType_);
    return result == null
        ? com.google.analytics.data.v1alpha.StringFilter.MatchType.UNRECOGNIZED
        : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   *
   *
   * <pre>
   * The string value used for the matching.
   * </pre>
   *
   * <code>string value = 2;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The string value used for the matching.
   * </pre>
   *
   * <code>string value = 2;</code>
   *
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CASE_SENSITIVE_FIELD_NUMBER = 3;
  private boolean caseSensitive_ = false;
  /**
   *
   *
   * <pre>
   * If true, the string value is case sensitive.
   * </pre>
   *
   * <code>bool case_sensitive = 3;</code>
   *
   * @return The caseSensitive.
   */
  @java.lang.Override
  public boolean getCaseSensitive() {
    return caseSensitive_;
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
    if (matchType_
        != com.google.analytics.data.v1alpha.StringFilter.MatchType.MATCH_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, matchType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    if (caseSensitive_ != false) {
      output.writeBool(3, caseSensitive_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (matchType_
        != com.google.analytics.data.v1alpha.StringFilter.MatchType.MATCH_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, matchType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
    }
    if (caseSensitive_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, caseSensitive_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.StringFilter)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.StringFilter other =
        (com.google.analytics.data.v1alpha.StringFilter) obj;

    if (matchType_ != other.matchType_) return false;
    if (!getValue().equals(other.getValue())) return false;
    if (getCaseSensitive() != other.getCaseSensitive()) return false;
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
    hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + matchType_;
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + CASE_SENSITIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCaseSensitive());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.StringFilter parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.StringFilter prototype) {
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
   * The filter for string
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.StringFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.StringFilter)
      com.google.analytics.data.v1alpha.StringFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_StringFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_StringFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.StringFilter.class,
              com.google.analytics.data.v1alpha.StringFilter.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.StringFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      matchType_ = 0;
      value_ = "";
      caseSensitive_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_StringFilter_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.StringFilter getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.StringFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.StringFilter build() {
      com.google.analytics.data.v1alpha.StringFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.StringFilter buildPartial() {
      com.google.analytics.data.v1alpha.StringFilter result =
          new com.google.analytics.data.v1alpha.StringFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.StringFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.matchType_ = matchType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.caseSensitive_ = caseSensitive_;
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
      if (other instanceof com.google.analytics.data.v1alpha.StringFilter) {
        return mergeFrom((com.google.analytics.data.v1alpha.StringFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.StringFilter other) {
      if (other == com.google.analytics.data.v1alpha.StringFilter.getDefaultInstance()) return this;
      if (other.matchType_ != 0) {
        setMatchTypeValue(other.getMatchTypeValue());
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getCaseSensitive() != false) {
        setCaseSensitive(other.getCaseSensitive());
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
                matchType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                value_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                caseSensitive_ = input.readBool();
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

    private int matchType_ = 0;
    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.StringFilter.MatchType match_type = 1;</code>
     *
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override
    public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.StringFilter.MatchType match_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for matchType to set.
     * @return This builder for chaining.
     */
    public Builder setMatchTypeValue(int value) {
      matchType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.StringFilter.MatchType match_type = 1;</code>
     *
     * @return The matchType.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.StringFilter.MatchType getMatchType() {
      com.google.analytics.data.v1alpha.StringFilter.MatchType result =
          com.google.analytics.data.v1alpha.StringFilter.MatchType.forNumber(matchType_);
      return result == null
          ? com.google.analytics.data.v1alpha.StringFilter.MatchType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.StringFilter.MatchType match_type = 1;</code>
     *
     * @param value The matchType to set.
     * @return This builder for chaining.
     */
    public Builder setMatchType(com.google.analytics.data.v1alpha.StringFilter.MatchType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      matchType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The match type for this filter.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.StringFilter.MatchType match_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMatchType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      matchType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The string value used for the matching.
     * </pre>
     *
     * <code>string value = 2;</code>
     *
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean caseSensitive_;
    /**
     *
     *
     * <pre>
     * If true, the string value is case sensitive.
     * </pre>
     *
     * <code>bool case_sensitive = 3;</code>
     *
     * @return The caseSensitive.
     */
    @java.lang.Override
    public boolean getCaseSensitive() {
      return caseSensitive_;
    }
    /**
     *
     *
     * <pre>
     * If true, the string value is case sensitive.
     * </pre>
     *
     * <code>bool case_sensitive = 3;</code>
     *
     * @param value The caseSensitive to set.
     * @return This builder for chaining.
     */
    public Builder setCaseSensitive(boolean value) {

      caseSensitive_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, the string value is case sensitive.
     * </pre>
     *
     * <code>bool case_sensitive = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCaseSensitive() {
      bitField0_ = (bitField0_ & ~0x00000004);
      caseSensitive_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.StringFilter)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.StringFilter)
  private static final com.google.analytics.data.v1alpha.StringFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.StringFilter();
  }

  public static com.google.analytics.data.v1alpha.StringFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StringFilter> PARSER =
      new com.google.protobuf.AbstractParser<StringFilter>() {
        @java.lang.Override
        public StringFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<StringFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.StringFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

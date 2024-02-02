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
// source: google/cloud/automl/v1/data_items.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Message that describes dimension of a document.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.DocumentDimensions}
 */
public final class DocumentDimensions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.DocumentDimensions)
    DocumentDimensionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DocumentDimensions.newBuilder() to construct.
  private DocumentDimensions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DocumentDimensions() {
    unit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DocumentDimensions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1.DataItems
        .internal_static_google_cloud_automl_v1_DocumentDimensions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.DataItems
        .internal_static_google_cloud_automl_v1_DocumentDimensions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.DocumentDimensions.class,
            com.google.cloud.automl.v1.DocumentDimensions.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Unit of the document dimension.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit}
   */
  public enum DocumentDimensionUnit implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should not be used.
     * </pre>
     *
     * <code>DOCUMENT_DIMENSION_UNIT_UNSPECIFIED = 0;</code>
     */
    DOCUMENT_DIMENSION_UNIT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Document dimension is measured in inches.
     * </pre>
     *
     * <code>INCH = 1;</code>
     */
    INCH(1),
    /**
     *
     *
     * <pre>
     * Document dimension is measured in centimeters.
     * </pre>
     *
     * <code>CENTIMETER = 2;</code>
     */
    CENTIMETER(2),
    /**
     *
     *
     * <pre>
     * Document dimension is measured in points. 72 points = 1 inch.
     * </pre>
     *
     * <code>POINT = 3;</code>
     */
    POINT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should not be used.
     * </pre>
     *
     * <code>DOCUMENT_DIMENSION_UNIT_UNSPECIFIED = 0;</code>
     */
    public static final int DOCUMENT_DIMENSION_UNIT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Document dimension is measured in inches.
     * </pre>
     *
     * <code>INCH = 1;</code>
     */
    public static final int INCH_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Document dimension is measured in centimeters.
     * </pre>
     *
     * <code>CENTIMETER = 2;</code>
     */
    public static final int CENTIMETER_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Document dimension is measured in points. 72 points = 1 inch.
     * </pre>
     *
     * <code>POINT = 3;</code>
     */
    public static final int POINT_VALUE = 3;

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
    public static DocumentDimensionUnit valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DocumentDimensionUnit forNumber(int value) {
      switch (value) {
        case 0:
          return DOCUMENT_DIMENSION_UNIT_UNSPECIFIED;
        case 1:
          return INCH;
        case 2:
          return CENTIMETER;
        case 3:
          return POINT;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DocumentDimensionUnit>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<DocumentDimensionUnit>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DocumentDimensionUnit>() {
              public DocumentDimensionUnit findValueByNumber(int number) {
                return DocumentDimensionUnit.forNumber(number);
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
      return com.google.cloud.automl.v1.DocumentDimensions.getDescriptor().getEnumTypes().get(0);
    }

    private static final DocumentDimensionUnit[] VALUES = values();

    public static DocumentDimensionUnit valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DocumentDimensionUnit(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit)
  }

  public static final int UNIT_FIELD_NUMBER = 1;
  private int unit_ = 0;
  /**
   *
   *
   * <pre>
   * Unit of the dimension.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
   *
   * @return The enum numeric value on the wire for unit.
   */
  @java.lang.Override
  public int getUnitValue() {
    return unit_;
  }
  /**
   *
   *
   * <pre>
   * Unit of the dimension.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
   *
   * @return The unit.
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit getUnit() {
    com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit result =
        com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit.forNumber(unit_);
    return result == null
        ? com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit.UNRECOGNIZED
        : result;
  }

  public static final int WIDTH_FIELD_NUMBER = 2;
  private float width_ = 0F;
  /**
   *
   *
   * <pre>
   * Width value of the document, works together with the unit.
   * </pre>
   *
   * <code>float width = 2;</code>
   *
   * @return The width.
   */
  @java.lang.Override
  public float getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private float height_ = 0F;
  /**
   *
   *
   * <pre>
   * Height value of the document, works together with the unit.
   * </pre>
   *
   * <code>float height = 3;</code>
   *
   * @return The height.
   */
  @java.lang.Override
  public float getHeight() {
    return height_;
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
    if (unit_
        != com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit
            .DOCUMENT_DIMENSION_UNIT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, unit_);
    }
    if (java.lang.Float.floatToRawIntBits(width_) != 0) {
      output.writeFloat(2, width_);
    }
    if (java.lang.Float.floatToRawIntBits(height_) != 0) {
      output.writeFloat(3, height_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (unit_
        != com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit
            .DOCUMENT_DIMENSION_UNIT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, unit_);
    }
    if (java.lang.Float.floatToRawIntBits(width_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, width_);
    }
    if (java.lang.Float.floatToRawIntBits(height_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, height_);
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
    if (!(obj instanceof com.google.cloud.automl.v1.DocumentDimensions)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.DocumentDimensions other =
        (com.google.cloud.automl.v1.DocumentDimensions) obj;

    if (unit_ != other.unit_) return false;
    if (java.lang.Float.floatToIntBits(getWidth())
        != java.lang.Float.floatToIntBits(other.getWidth())) return false;
    if (java.lang.Float.floatToIntBits(getHeight())
        != java.lang.Float.floatToIntBits(other.getHeight())) return false;
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
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getWidth());
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getHeight());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.DocumentDimensions parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.DocumentDimensions prototype) {
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
   * Message that describes dimension of a document.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.DocumentDimensions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.DocumentDimensions)
      com.google.cloud.automl.v1.DocumentDimensionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.DataItems
          .internal_static_google_cloud_automl_v1_DocumentDimensions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.DataItems
          .internal_static_google_cloud_automl_v1_DocumentDimensions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.DocumentDimensions.class,
              com.google.cloud.automl.v1.DocumentDimensions.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.DocumentDimensions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      unit_ = 0;
      width_ = 0F;
      height_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.DataItems
          .internal_static_google_cloud_automl_v1_DocumentDimensions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.DocumentDimensions getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.DocumentDimensions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.DocumentDimensions build() {
      com.google.cloud.automl.v1.DocumentDimensions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.DocumentDimensions buildPartial() {
      com.google.cloud.automl.v1.DocumentDimensions result =
          new com.google.cloud.automl.v1.DocumentDimensions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.automl.v1.DocumentDimensions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.unit_ = unit_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.width_ = width_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.height_ = height_;
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
      if (other instanceof com.google.cloud.automl.v1.DocumentDimensions) {
        return mergeFrom((com.google.cloud.automl.v1.DocumentDimensions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.DocumentDimensions other) {
      if (other == com.google.cloud.automl.v1.DocumentDimensions.getDefaultInstance()) return this;
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
      }
      if (other.getWidth() != 0F) {
        setWidth(other.getWidth());
      }
      if (other.getHeight() != 0F) {
        setHeight(other.getHeight());
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
                unit_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 21:
              {
                width_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
            case 29:
              {
                height_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 29
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

    private int unit_ = 0;
    /**
     *
     *
     * <pre>
     * Unit of the dimension.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
     *
     * @return The enum numeric value on the wire for unit.
     */
    @java.lang.Override
    public int getUnitValue() {
      return unit_;
    }
    /**
     *
     *
     * <pre>
     * Unit of the dimension.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
     *
     * @param value The enum numeric value on the wire for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Unit of the dimension.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
     *
     * @return The unit.
     */
    @java.lang.Override
    public com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit getUnit() {
      com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit result =
          com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit.forNumber(unit_);
      return result == null
          ? com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Unit of the dimension.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
     *
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(
        com.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Unit of the dimension.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      unit_ = 0;
      onChanged();
      return this;
    }

    private float width_;
    /**
     *
     *
     * <pre>
     * Width value of the document, works together with the unit.
     * </pre>
     *
     * <code>float width = 2;</code>
     *
     * @return The width.
     */
    @java.lang.Override
    public float getWidth() {
      return width_;
    }
    /**
     *
     *
     * <pre>
     * Width value of the document, works together with the unit.
     * </pre>
     *
     * <code>float width = 2;</code>
     *
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(float value) {

      width_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Width value of the document, works together with the unit.
     * </pre>
     *
     * <code>float width = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000002);
      width_ = 0F;
      onChanged();
      return this;
    }

    private float height_;
    /**
     *
     *
     * <pre>
     * Height value of the document, works together with the unit.
     * </pre>
     *
     * <code>float height = 3;</code>
     *
     * @return The height.
     */
    @java.lang.Override
    public float getHeight() {
      return height_;
    }
    /**
     *
     *
     * <pre>
     * Height value of the document, works together with the unit.
     * </pre>
     *
     * <code>float height = 3;</code>
     *
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(float value) {

      height_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Height value of the document, works together with the unit.
     * </pre>
     *
     * <code>float height = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      height_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.DocumentDimensions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.DocumentDimensions)
  private static final com.google.cloud.automl.v1.DocumentDimensions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.DocumentDimensions();
  }

  public static com.google.cloud.automl.v1.DocumentDimensions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentDimensions> PARSER =
      new com.google.protobuf.AbstractParser<DocumentDimensions>() {
        @java.lang.Override
        public DocumentDimensions parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentDimensions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentDimensions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.DocumentDimensions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

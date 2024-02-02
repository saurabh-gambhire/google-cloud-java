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
// source: google/cloud/automl/v1beta1/image.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Model deployment metadata specific to Image Classification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata}
 */
public final class ImageClassificationModelDeploymentMetadata
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata)
    ImageClassificationModelDeploymentMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageClassificationModelDeploymentMetadata.newBuilder() to construct.
  private ImageClassificationModelDeploymentMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageClassificationModelDeploymentMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageClassificationModelDeploymentMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.ImageProto
        .internal_static_google_cloud_automl_v1beta1_ImageClassificationModelDeploymentMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.ImageProto
        .internal_static_google_cloud_automl_v1beta1_ImageClassificationModelDeploymentMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata.class,
            com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata.Builder
                .class);
  }

  public static final int NODE_COUNT_FIELD_NUMBER = 1;
  private long nodeCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Input only. The number of nodes to deploy the model on. A node is an
   * abstraction of a machine resource, which can handle online prediction QPS
   * as given in the model's
   *
   * [node_qps][google.cloud.automl.v1beta1.ImageClassificationModelMetadata.node_qps].
   * Must be between 1 and 100, inclusive on both ends.
   * </pre>
   *
   * <code>int64 node_count = 1;</code>
   *
   * @return The nodeCount.
   */
  @java.lang.Override
  public long getNodeCount() {
    return nodeCount_;
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
    if (nodeCount_ != 0L) {
      output.writeInt64(1, nodeCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, nodeCount_);
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
    if (!(obj
        instanceof com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata other =
        (com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata) obj;

    if (getNodeCount() != other.getNodeCount()) return false;
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
    hash = (37 * hash) + NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getNodeCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
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
      com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata prototype) {
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
   * Model deployment metadata specific to Image Classification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata)
      com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.ImageProto
          .internal_static_google_cloud_automl_v1beta1_ImageClassificationModelDeploymentMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.ImageProto
          .internal_static_google_cloud_automl_v1beta1_ImageClassificationModelDeploymentMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata.class,
              com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      nodeCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.ImageProto
          .internal_static_google_cloud_automl_v1beta1_ImageClassificationModelDeploymentMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata build() {
      com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
        buildPartial() {
      com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata result =
          new com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nodeCount_ = nodeCount_;
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
      if (other
          instanceof com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata) {
        return mergeFrom(
            (com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata other) {
      if (other
          == com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
              .getDefaultInstance()) return this;
      if (other.getNodeCount() != 0L) {
        setNodeCount(other.getNodeCount());
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
                nodeCount_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private long nodeCount_;
    /**
     *
     *
     * <pre>
     * Input only. The number of nodes to deploy the model on. A node is an
     * abstraction of a machine resource, which can handle online prediction QPS
     * as given in the model's
     *
     * [node_qps][google.cloud.automl.v1beta1.ImageClassificationModelMetadata.node_qps].
     * Must be between 1 and 100, inclusive on both ends.
     * </pre>
     *
     * <code>int64 node_count = 1;</code>
     *
     * @return The nodeCount.
     */
    @java.lang.Override
    public long getNodeCount() {
      return nodeCount_;
    }
    /**
     *
     *
     * <pre>
     * Input only. The number of nodes to deploy the model on. A node is an
     * abstraction of a machine resource, which can handle online prediction QPS
     * as given in the model's
     *
     * [node_qps][google.cloud.automl.v1beta1.ImageClassificationModelMetadata.node_qps].
     * Must be between 1 and 100, inclusive on both ends.
     * </pre>
     *
     * <code>int64 node_count = 1;</code>
     *
     * @param value The nodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setNodeCount(long value) {

      nodeCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. The number of nodes to deploy the model on. A node is an
     * abstraction of a machine resource, which can handle online prediction QPS
     * as given in the model's
     *
     * [node_qps][google.cloud.automl.v1beta1.ImageClassificationModelMetadata.node_qps].
     * Must be between 1 and 100, inclusive on both ends.
     * </pre>
     *
     * <code>int64 node_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNodeCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nodeCount_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata)
  private static final com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata();
  }

  public static com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageClassificationModelDeploymentMetadata>
      PARSER =
          new com.google.protobuf.AbstractParser<ImageClassificationModelDeploymentMetadata>() {
            @java.lang.Override
            public ImageClassificationModelDeploymentMetadata parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<ImageClassificationModelDeploymentMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageClassificationModelDeploymentMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

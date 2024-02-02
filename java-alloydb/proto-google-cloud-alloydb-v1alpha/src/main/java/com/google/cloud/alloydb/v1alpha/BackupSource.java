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
// source: google/cloud/alloydb/v1alpha/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.alloydb.v1alpha;

/**
 *
 *
 * <pre>
 * Message describing a BackupSource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1alpha.BackupSource}
 */
public final class BackupSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1alpha.BackupSource)
    BackupSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BackupSource.newBuilder() to construct.
  private BackupSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BackupSource() {
    backupUid_ = "";
    backupName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BackupSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1alpha.ResourcesProto
        .internal_static_google_cloud_alloydb_v1alpha_BackupSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1alpha.ResourcesProto
        .internal_static_google_cloud_alloydb_v1alpha_BackupSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1alpha.BackupSource.class,
            com.google.cloud.alloydb.v1alpha.BackupSource.Builder.class);
  }

  public static final int BACKUP_UID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object backupUid_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the backup which was used to
   * create this resource. The UID is generated when the backup is created, and
   * it is retained until the backup is deleted.
   * </pre>
   *
   * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The backupUid.
   */
  @java.lang.Override
  public java.lang.String getBackupUid() {
    java.lang.Object ref = backupUid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backupUid_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the backup which was used to
   * create this resource. The UID is generated when the backup is created, and
   * it is retained until the backup is deleted.
   * </pre>
   *
   * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for backupUid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBackupUidBytes() {
    java.lang.Object ref = backupUid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      backupUid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BACKUP_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object backupName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the backup resource with the format:
   *  * projects/{project}/locations/{region}/backups/{backup_id}
   * </pre>
   *
   * <code>
   * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The backupName.
   */
  @java.lang.Override
  public java.lang.String getBackupName() {
    java.lang.Object ref = backupName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backupName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the backup resource with the format:
   *  * projects/{project}/locations/{region}/backups/{backup_id}
   * </pre>
   *
   * <code>
   * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for backupName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBackupNameBytes() {
    java.lang.Object ref = backupName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      backupName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backupName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, backupName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backupUid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, backupUid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backupName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, backupName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backupUid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, backupUid_);
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
    if (!(obj instanceof com.google.cloud.alloydb.v1alpha.BackupSource)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1alpha.BackupSource other =
        (com.google.cloud.alloydb.v1alpha.BackupSource) obj;

    if (!getBackupUid().equals(other.getBackupUid())) return false;
    if (!getBackupName().equals(other.getBackupName())) return false;
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
    hash = (37 * hash) + BACKUP_UID_FIELD_NUMBER;
    hash = (53 * hash) + getBackupUid().hashCode();
    hash = (37 * hash) + BACKUP_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBackupName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.alloydb.v1alpha.BackupSource prototype) {
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
   * Message describing a BackupSource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1alpha.BackupSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1alpha.BackupSource)
      com.google.cloud.alloydb.v1alpha.BackupSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_BackupSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_BackupSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1alpha.BackupSource.class,
              com.google.cloud.alloydb.v1alpha.BackupSource.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1alpha.BackupSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      backupUid_ = "";
      backupName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1alpha.ResourcesProto
          .internal_static_google_cloud_alloydb_v1alpha_BackupSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.BackupSource getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1alpha.BackupSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.BackupSource build() {
      com.google.cloud.alloydb.v1alpha.BackupSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1alpha.BackupSource buildPartial() {
      com.google.cloud.alloydb.v1alpha.BackupSource result =
          new com.google.cloud.alloydb.v1alpha.BackupSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.alloydb.v1alpha.BackupSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.backupUid_ = backupUid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.backupName_ = backupName_;
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
      if (other instanceof com.google.cloud.alloydb.v1alpha.BackupSource) {
        return mergeFrom((com.google.cloud.alloydb.v1alpha.BackupSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1alpha.BackupSource other) {
      if (other == com.google.cloud.alloydb.v1alpha.BackupSource.getDefaultInstance()) return this;
      if (!other.getBackupUid().isEmpty()) {
        backupUid_ = other.backupUid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBackupName().isEmpty()) {
        backupName_ = other.backupName_;
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
                backupName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 10
            case 18:
              {
                backupUid_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
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

    private java.lang.Object backupUid_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The system-generated UID of the backup which was used to
     * create this resource. The UID is generated when the backup is created, and
     * it is retained until the backup is deleted.
     * </pre>
     *
     * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The backupUid.
     */
    public java.lang.String getBackupUid() {
      java.lang.Object ref = backupUid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backupUid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The system-generated UID of the backup which was used to
     * create this resource. The UID is generated when the backup is created, and
     * it is retained until the backup is deleted.
     * </pre>
     *
     * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for backupUid.
     */
    public com.google.protobuf.ByteString getBackupUidBytes() {
      java.lang.Object ref = backupUid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        backupUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The system-generated UID of the backup which was used to
     * create this resource. The UID is generated when the backup is created, and
     * it is retained until the backup is deleted.
     * </pre>
     *
     * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The backupUid to set.
     * @return This builder for chaining.
     */
    public Builder setBackupUid(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      backupUid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The system-generated UID of the backup which was used to
     * create this resource. The UID is generated when the backup is created, and
     * it is retained until the backup is deleted.
     * </pre>
     *
     * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBackupUid() {
      backupUid_ = getDefaultInstance().getBackupUid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The system-generated UID of the backup which was used to
     * create this resource. The UID is generated when the backup is created, and
     * it is retained until the backup is deleted.
     * </pre>
     *
     * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for backupUid to set.
     * @return This builder for chaining.
     */
    public Builder setBackupUidBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      backupUid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object backupName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the backup resource with the format:
     *  * projects/{project}/locations/{region}/backups/{backup_id}
     * </pre>
     *
     * <code>
     * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The backupName.
     */
    public java.lang.String getBackupName() {
      java.lang.Object ref = backupName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backupName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the backup resource with the format:
     *  * projects/{project}/locations/{region}/backups/{backup_id}
     * </pre>
     *
     * <code>
     * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for backupName.
     */
    public com.google.protobuf.ByteString getBackupNameBytes() {
      java.lang.Object ref = backupName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        backupName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the backup resource with the format:
     *  * projects/{project}/locations/{region}/backups/{backup_id}
     * </pre>
     *
     * <code>
     * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The backupName to set.
     * @return This builder for chaining.
     */
    public Builder setBackupName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      backupName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the backup resource with the format:
     *  * projects/{project}/locations/{region}/backups/{backup_id}
     * </pre>
     *
     * <code>
     * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBackupName() {
      backupName_ = getDefaultInstance().getBackupName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the backup resource with the format:
     *  * projects/{project}/locations/{region}/backups/{backup_id}
     * </pre>
     *
     * <code>
     * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for backupName to set.
     * @return This builder for chaining.
     */
    public Builder setBackupNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      backupName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1alpha.BackupSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1alpha.BackupSource)
  private static final com.google.cloud.alloydb.v1alpha.BackupSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1alpha.BackupSource();
  }

  public static com.google.cloud.alloydb.v1alpha.BackupSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackupSource> PARSER =
      new com.google.protobuf.AbstractParser<BackupSource>() {
        @java.lang.Override
        public BackupSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<BackupSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackupSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1alpha.BackupSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

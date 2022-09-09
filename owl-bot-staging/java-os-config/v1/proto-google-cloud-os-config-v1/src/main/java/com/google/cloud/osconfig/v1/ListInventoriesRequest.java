// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1/inventory.proto

package com.google.cloud.osconfig.v1;

/**
 * <pre>
 * A request message for listing inventory data for all VMs in the specified
 * location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.v1.ListInventoriesRequest}
 */
public final class ListInventoriesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.v1.ListInventoriesRequest)
    ListInventoriesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInventoriesRequest.newBuilder() to construct.
  private ListInventoriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInventoriesRequest() {
    parent_ = "";
    view_ = 0;
    pageToken_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListInventoriesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListInventoriesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            view_ = rawValue;
            break;
          }
          case 24: {

            pageSize_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            filter_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.osconfig.v1.Inventories.internal_static_google_cloud_osconfig_v1_ListInventoriesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.v1.Inventories.internal_static_google_cloud_osconfig_v1_ListInventoriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.v1.ListInventoriesRequest.class, com.google.cloud.osconfig.v1.ListInventoriesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent resource name.
   * Format: `projects/{project}/locations/{location}/instances/-`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent resource name.
   * Format: `projects/{project}/locations/{location}/instances/-`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 2;
  private int view_;
  /**
   * <pre>
   * Inventory view indicating what information should be included in the
   * inventory resource. If unspecified, the default view is BASIC.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override public int getViewValue() {
    return view_;
  }
  /**
   * <pre>
   * Inventory view indicating what information should be included in the
   * inventory resource. If unspecified, the default view is BASIC.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
   * @return The view.
   */
  @java.lang.Override public com.google.cloud.osconfig.v1.InventoryView getView() {
    @SuppressWarnings("deprecation")
    com.google.cloud.osconfig.v1.InventoryView result = com.google.cloud.osconfig.v1.InventoryView.valueOf(view_);
    return result == null ? com.google.cloud.osconfig.v1.InventoryView.UNRECOGNIZED : result;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <pre>
   * The maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * A pagination token returned from a previous call to
   * `ListInventories` that indicates where this listing
   * should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A pagination token returned from a previous call to
   * `ListInventories` that indicates where this listing
   * should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 5;
  private volatile java.lang.Object filter_;
  /**
   * <pre>
   * If provided, this field specifies the criteria that must be met by a
   * `Inventory` API resource to be included in the response.
   * </pre>
   *
   * <code>string filter = 5;</code>
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If provided, this field specifies the criteria that must be met by a
   * `Inventory` API resource to be included in the response.
   * </pre>
   *
   * <code>string filter = 5;</code>
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (view_ != com.google.cloud.osconfig.v1.InventoryView.INVENTORY_VIEW_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, view_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, filter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (view_ != com.google.cloud.osconfig.v1.InventoryView.INVENTORY_VIEW_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, view_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, filter_);
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
    if (!(obj instanceof com.google.cloud.osconfig.v1.ListInventoriesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.v1.ListInventoriesRequest other = (com.google.cloud.osconfig.v1.ListInventoriesRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (view_ != other.view_) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
    if (!getFilter()
        .equals(other.getFilter())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.v1.ListInventoriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.osconfig.v1.ListInventoriesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A request message for listing inventory data for all VMs in the specified
   * location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.v1.ListInventoriesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.v1.ListInventoriesRequest)
      com.google.cloud.osconfig.v1.ListInventoriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.osconfig.v1.Inventories.internal_static_google_cloud_osconfig_v1_ListInventoriesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.v1.Inventories.internal_static_google_cloud_osconfig_v1_ListInventoriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.v1.ListInventoriesRequest.class, com.google.cloud.osconfig.v1.ListInventoriesRequest.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.v1.ListInventoriesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      view_ = 0;

      pageSize_ = 0;

      pageToken_ = "";

      filter_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.osconfig.v1.Inventories.internal_static_google_cloud_osconfig_v1_ListInventoriesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListInventoriesRequest getDefaultInstanceForType() {
      return com.google.cloud.osconfig.v1.ListInventoriesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListInventoriesRequest build() {
      com.google.cloud.osconfig.v1.ListInventoriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListInventoriesRequest buildPartial() {
      com.google.cloud.osconfig.v1.ListInventoriesRequest result = new com.google.cloud.osconfig.v1.ListInventoriesRequest(this);
      result.parent_ = parent_;
      result.view_ = view_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
      result.filter_ = filter_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.osconfig.v1.ListInventoriesRequest) {
        return mergeFrom((com.google.cloud.osconfig.v1.ListInventoriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.v1.ListInventoriesRequest other) {
      if (other == com.google.cloud.osconfig.v1.ListInventoriesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
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
      com.google.cloud.osconfig.v1.ListInventoriesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.osconfig.v1.ListInventoriesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource name.
     * Format: `projects/{project}/locations/{location}/instances/-`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource name.
     * Format: `projects/{project}/locations/{location}/instances/-`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource name.
     * Format: `projects/{project}/locations/{location}/instances/-`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource name.
     * Format: `projects/{project}/locations/{location}/instances/-`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource name.
     * Format: `projects/{project}/locations/{location}/instances/-`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     * <pre>
     * Inventory view indicating what information should be included in the
     * inventory resource. If unspecified, the default view is BASIC.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override public int getViewValue() {
      return view_;
    }
    /**
     * <pre>
     * Inventory view indicating what information should be included in the
     * inventory resource. If unspecified, the default view is BASIC.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {
      
      view_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Inventory view indicating what information should be included in the
     * inventory resource. If unspecified, the default view is BASIC.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
     * @return The view.
     */
    @java.lang.Override
    public com.google.cloud.osconfig.v1.InventoryView getView() {
      @SuppressWarnings("deprecation")
      com.google.cloud.osconfig.v1.InventoryView result = com.google.cloud.osconfig.v1.InventoryView.valueOf(view_);
      return result == null ? com.google.cloud.osconfig.v1.InventoryView.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Inventory view indicating what information should be included in the
     * inventory resource. If unspecified, the default view is BASIC.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.cloud.osconfig.v1.InventoryView value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Inventory view indicating what information should be included in the
     * inventory resource. If unspecified, the default view is BASIC.
     * </pre>
     *
     * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearView() {
      
      view_ = 0;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * The maximum number of results to return.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * The maximum number of results to return.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum number of results to return.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * A pagination token returned from a previous call to
     * `ListInventories` that indicates where this listing
     * should continue from.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A pagination token returned from a previous call to
     * `ListInventories` that indicates where this listing
     * should continue from.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A pagination token returned from a previous call to
     * `ListInventories` that indicates where this listing
     * should continue from.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A pagination token returned from a previous call to
     * `ListInventories` that indicates where this listing
     * should continue from.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A pagination token returned from a previous call to
     * `ListInventories` that indicates where this listing
     * should continue from.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by a
     * `Inventory` API resource to be included in the response.
     * </pre>
     *
     * <code>string filter = 5;</code>
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by a
     * `Inventory` API resource to be included in the response.
     * </pre>
     *
     * <code>string filter = 5;</code>
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by a
     * `Inventory` API resource to be included in the response.
     * </pre>
     *
     * <code>string filter = 5;</code>
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by a
     * `Inventory` API resource to be included in the response.
     * </pre>
     *
     * <code>string filter = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by a
     * `Inventory` API resource to be included in the response.
     * </pre>
     *
     * <code>string filter = 5;</code>
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.v1.ListInventoriesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1.ListInventoriesRequest)
  private static final com.google.cloud.osconfig.v1.ListInventoriesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.v1.ListInventoriesRequest();
  }

  public static com.google.cloud.osconfig.v1.ListInventoriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInventoriesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListInventoriesRequest>() {
    @java.lang.Override
    public ListInventoriesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListInventoriesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListInventoriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInventoriesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.v1.ListInventoriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

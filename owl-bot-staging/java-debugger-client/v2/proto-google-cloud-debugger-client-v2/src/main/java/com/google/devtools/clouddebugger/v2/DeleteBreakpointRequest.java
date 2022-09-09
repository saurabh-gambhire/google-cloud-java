// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

/**
 * <pre>
 * Request to delete a breakpoint.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.DeleteBreakpointRequest}
 */
public final class DeleteBreakpointRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
    DeleteBreakpointRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteBreakpointRequest.newBuilder() to construct.
  private DeleteBreakpointRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteBreakpointRequest() {
    debuggeeId_ = "";
    breakpointId_ = "";
    clientVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteBreakpointRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteBreakpointRequest(
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

            debuggeeId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            breakpointId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            clientVersion_ = s;
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
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.class, com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.Builder.class);
  }

  public static final int DEBUGGEE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object debuggeeId_;
  /**
   * <pre>
   * Required. ID of the debuggee whose breakpoint to delete.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The debuggeeId.
   */
  @java.lang.Override
  public java.lang.String getDebuggeeId() {
    java.lang.Object ref = debuggeeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      debuggeeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. ID of the debuggee whose breakpoint to delete.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for debuggeeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDebuggeeIdBytes() {
    java.lang.Object ref = debuggeeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      debuggeeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BREAKPOINT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object breakpointId_;
  /**
   * <pre>
   * Required. ID of the breakpoint to delete.
   * </pre>
   *
   * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The breakpointId.
   */
  @java.lang.Override
  public java.lang.String getBreakpointId() {
    java.lang.Object ref = breakpointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      breakpointId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. ID of the breakpoint to delete.
   * </pre>
   *
   * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for breakpointId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBreakpointIdBytes() {
    java.lang.Object ref = breakpointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      breakpointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_VERSION_FIELD_NUMBER = 3;
  private volatile java.lang.Object clientVersion_;
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientVersion.
   */
  @java.lang.Override
  public java.lang.String getClientVersion() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clientVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientVersionBytes() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(debuggeeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, debuggeeId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(breakpointId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, breakpointId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clientVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(debuggeeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, debuggeeId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(breakpointId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, breakpointId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clientVersion_);
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest other = (com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest) obj;

    if (!getDebuggeeId()
        .equals(other.getDebuggeeId())) return false;
    if (!getBreakpointId()
        .equals(other.getBreakpointId())) return false;
    if (!getClientVersion()
        .equals(other.getClientVersion())) return false;
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
    hash = (37 * hash) + DEBUGGEE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDebuggeeId().hashCode();
    hash = (37 * hash) + BREAKPOINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBreakpointId().hashCode();
    hash = (37 * hash) + CLIENT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getClientVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest prototype) {
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
   * Request to delete a breakpoint.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.DeleteBreakpointRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
      com.google.devtools.clouddebugger.v2.DeleteBreakpointRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.class, com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.newBuilder()
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
      debuggeeId_ = "";

      breakpointId_ = "";

      clientVersion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest build() {
      com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest buildPartial() {
      com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest result = new com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest(this);
      result.debuggeeId_ = debuggeeId_;
      result.breakpointId_ = breakpointId_;
      result.clientVersion_ = clientVersion_;
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
      if (other instanceof com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest other) {
      if (other == com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.getDefaultInstance()) return this;
      if (!other.getDebuggeeId().isEmpty()) {
        debuggeeId_ = other.debuggeeId_;
        onChanged();
      }
      if (!other.getBreakpointId().isEmpty()) {
        breakpointId_ = other.breakpointId_;
        onChanged();
      }
      if (!other.getClientVersion().isEmpty()) {
        clientVersion_ = other.clientVersion_;
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
      com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object debuggeeId_ = "";
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to delete.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The debuggeeId.
     */
    public java.lang.String getDebuggeeId() {
      java.lang.Object ref = debuggeeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        debuggeeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to delete.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for debuggeeId.
     */
    public com.google.protobuf.ByteString
        getDebuggeeIdBytes() {
      java.lang.Object ref = debuggeeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        debuggeeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to delete.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The debuggeeId to set.
     * @return This builder for chaining.
     */
    public Builder setDebuggeeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      debuggeeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to delete.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDebuggeeId() {
      
      debuggeeId_ = getDefaultInstance().getDebuggeeId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the debuggee whose breakpoint to delete.
     * </pre>
     *
     * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for debuggeeId to set.
     * @return This builder for chaining.
     */
    public Builder setDebuggeeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      debuggeeId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object breakpointId_ = "";
    /**
     * <pre>
     * Required. ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The breakpointId.
     */
    public java.lang.String getBreakpointId() {
      java.lang.Object ref = breakpointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        breakpointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for breakpointId.
     */
    public com.google.protobuf.ByteString
        getBreakpointIdBytes() {
      java.lang.Object ref = breakpointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        breakpointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The breakpointId to set.
     * @return This builder for chaining.
     */
    public Builder setBreakpointId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      breakpointId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBreakpointId() {
      
      breakpointId_ = getDefaultInstance().getBreakpointId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for breakpointId to set.
     * @return This builder for chaining.
     */
    public Builder setBreakpointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      breakpointId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clientVersion_ = "";
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The clientVersion.
     */
    public java.lang.String getClientVersion() {
      java.lang.Object ref = clientVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for clientVersion.
     */
    public com.google.protobuf.ByteString
        getClientVersionBytes() {
      java.lang.Object ref = clientVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The clientVersion to set.
     * @return This builder for chaining.
     */
    public Builder setClientVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientVersion() {
      
      clientVersion_ = getDefaultInstance().getClientVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The client version making the call.
     * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for clientVersion to set.
     * @return This builder for chaining.
     */
    public Builder setClientVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
  private static final com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest();
  }

  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteBreakpointRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteBreakpointRequest>() {
    @java.lang.Override
    public DeleteBreakpointRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteBreakpointRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteBreakpointRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteBreakpointRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

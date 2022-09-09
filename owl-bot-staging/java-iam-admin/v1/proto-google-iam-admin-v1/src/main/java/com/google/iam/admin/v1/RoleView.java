// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

/**
 * <pre>
 * A view for Role objects.
 * </pre>
 *
 * Protobuf enum {@code google.iam.admin.v1.RoleView}
 */
public enum RoleView
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Omits the `included_permissions` field.
   * This is the default value.
   * </pre>
   *
   * <code>BASIC = 0;</code>
   */
  BASIC(0),
  /**
   * <pre>
   * Returns all fields.
   * </pre>
   *
   * <code>FULL = 1;</code>
   */
  FULL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Omits the `included_permissions` field.
   * This is the default value.
   * </pre>
   *
   * <code>BASIC = 0;</code>
   */
  public static final int BASIC_VALUE = 0;
  /**
   * <pre>
   * Returns all fields.
   * </pre>
   *
   * <code>FULL = 1;</code>
   */
  public static final int FULL_VALUE = 1;


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
  public static RoleView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RoleView forNumber(int value) {
    switch (value) {
      case 0: return BASIC;
      case 1: return FULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RoleView>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RoleView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RoleView>() {
          public RoleView findValueByNumber(int number) {
            return RoleView.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.iam.admin.v1.IamProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final RoleView[] VALUES = values();

  public static RoleView valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RoleView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.iam.admin.v1.RoleView)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/binaryauthorization/v1beta1/continuous_validation_logging.proto

package com.google.cloud.binaryauthorization.v1beta1;

public final class ContinuousValidationLoggingProto {
  private ContinuousValidationLoggingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_ImageDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_ImageDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_UnsupportedPolicyEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_UnsupportedPolicyEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/cloud/binaryauthorization/v1bet" +
      "a1/continuous_validation_logging.proto\022(" +
      "google.cloud.binaryauthorization.v1beta1" +
      "\032\037google/protobuf/timestamp.proto\"\337\010\n\031Co" +
      "ntinuousValidationEvent\022u\n\tpod_event\030\001 \001" +
      "(\0132`.google.cloud.binaryauthorization.v1" +
      "beta1.ContinuousValidationEvent.Continuo" +
      "usValidationPodEventH\000\022~\n\030unsupported_po" +
      "licy_event\030\002 \001(\0132Z.google.cloud.binaryau" +
      "thorization.v1beta1.ContinuousValidation" +
      "Event.UnsupportedPolicyEventH\000\032\215\006\n\034Conti" +
      "nuousValidationPodEvent\022\025\n\rpod_namespace" +
      "\030\007 \001(\t\022\013\n\003pod\030\001 \001(\t\022/\n\013deploy_time\030\002 \001(\013" +
      "2\032.google.protobuf.Timestamp\022,\n\010end_time" +
      "\030\003 \001(\0132\032.google.protobuf.Timestamp\022\212\001\n\007v" +
      "erdict\030\004 \001(\0162y.google.cloud.binaryauthor" +
      "ization.v1beta1.ContinuousValidationEven" +
      "t.ContinuousValidationPodEvent.PolicyCon" +
      "formanceVerdict\022}\n\006images\030\005 \003(\0132m.google" +
      ".cloud.binaryauthorization.v1beta1.Conti" +
      "nuousValidationEvent.ContinuousValidatio" +
      "nPodEvent.ImageDetails\032\200\002\n\014ImageDetails\022" +
      "\r\n\005image\030\001 \001(\t\022\211\001\n\006result\030\002 \001(\0162y.google" +
      ".cloud.binaryauthorization.v1beta1.Conti" +
      "nuousValidationEvent.ContinuousValidatio" +
      "nPodEvent.ImageDetails.AuditResult\022\023\n\013de" +
      "scription\030\003 \001(\t\"@\n\013AuditResult\022\034\n\030AUDIT_" +
      "RESULT_UNSPECIFIED\020\000\022\t\n\005ALLOW\020\001\022\010\n\004DENY\020" +
      "\002\"[\n\030PolicyConformanceVerdict\022*\n&POLICY_" +
      "CONFORMANCE_VERDICT_UNSPECIFIED\020\000\022\023\n\017VIO" +
      "LATES_POLICY\020\001\032-\n\026UnsupportedPolicyEvent" +
      "\022\023\n\013description\030\001 \001(\tB\014\n\nevent_typeB\266\002\n," +
      "com.google.cloud.binaryauthorization.v1b" +
      "eta1B ContinuousValidationLoggingProtoP\001" +
      "Z[google.golang.org/genproto/googleapis/" +
      "cloud/binaryauthorization/v1beta1;binary" +
      "authorization\370\001\001\252\002(Google.Cloud.BinaryAu" +
      "thorization.V1Beta1\312\002(Google\\Cloud\\Binar" +
      "yAuthorization\\V1beta1\352\002+Google::Cloud::" +
      "BinaryAuthorization::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_descriptor,
        new java.lang.String[] { "PodEvent", "UnsupportedPolicyEvent", "EventType", });
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_descriptor =
      internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_descriptor,
        new java.lang.String[] { "PodNamespace", "Pod", "DeployTime", "EndTime", "Verdict", "Images", });
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_ImageDetails_descriptor =
      internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_ImageDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_ContinuousValidationPodEvent_ImageDetails_descriptor,
        new java.lang.String[] { "Image", "Result", "Description", });
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_UnsupportedPolicyEvent_descriptor =
      internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_UnsupportedPolicyEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_binaryauthorization_v1beta1_ContinuousValidationEvent_UnsupportedPolicyEvent_descriptor,
        new java.lang.String[] { "Description", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
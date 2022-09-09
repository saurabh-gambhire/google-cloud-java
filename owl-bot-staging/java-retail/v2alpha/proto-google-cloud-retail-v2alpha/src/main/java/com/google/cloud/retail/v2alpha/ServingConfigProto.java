// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/serving_config.proto

package com.google.cloud.retail.v2alpha;

public final class ServingConfigProto {
  private ServingConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_ServingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ServingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/retail/v2alpha/serving_co" +
      "nfig.proto\022\033google.cloud.retail.v2alpha\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032(google/cloud/retail" +
      "/v2alpha/common.proto\0320google/cloud/reta" +
      "il/v2alpha/search_service.proto\"\366\005\n\rServ" +
      "ingConfig\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\031\n\014display_" +
      "name\030\002 \001(\tB\003\340A\002\022\020\n\010model_id\030\003 \001(\t\022\035\n\025pri" +
      "ce_reranking_level\030\004 \001(\t\022\031\n\021facet_contro" +
      "l_ids\030\005 \003(\t\022W\n\022dynamic_facet_spec\030\006 \001(\0132" +
      ";.google.cloud.retail.v2alpha.SearchRequ" +
      "est.DynamicFacetSpec\022\031\n\021boost_control_id" +
      "s\030\007 \003(\t\022\032\n\022filter_control_ids\030\t \003(\t\022\034\n\024r" +
      "edirect_control_ids\030\n \003(\t\022#\n\033twoway_syno" +
      "nyms_control_ids\030\022 \003(\t\022#\n\033oneway_synonym" +
      "s_control_ids\030\014 \003(\t\022$\n\034do_not_associate_" +
      "control_ids\030\r \003(\t\022\037\n\027replacement_control" +
      "_ids\030\016 \003(\t\022\032\n\022ignore_control_ids\030\017 \003(\t\022\027" +
      "\n\017diversity_level\030\010 \001(\t\022$\n\034enable_catego" +
      "ry_filter_level\030\020 \001(\t\022I\n\016solution_types\030" +
      "\023 \003(\0162).google.cloud.retail.v2alpha.Solu" +
      "tionTypeB\006\340A\002\340A\005:\205\001\352A\201\001\n#retail.googleap" +
      "is.com/ServingConfig\022Zprojects/{project}" +
      "/locations/{location}/catalogs/{catalog}" +
      "/servingConfigs/{serving_config}B\340\001\n\037com" +
      ".google.cloud.retail.v2alphaB\022ServingCon" +
      "figProtoP\001ZAgoogle.golang.org/genproto/g" +
      "oogleapis/cloud/retail/v2alpha;retail\242\002\006" +
      "RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033G" +
      "oogle\\Cloud\\Retail\\V2alpha\352\002\036Google::Clo" +
      "ud::Retail::V2alphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2alpha.CommonProto.getDescriptor(),
          com.google.cloud.retail.v2alpha.SearchServiceProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2alpha_ServingConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_ServingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_ServingConfig_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "ModelId", "PriceRerankingLevel", "FacetControlIds", "DynamicFacetSpec", "BoostControlIds", "FilterControlIds", "RedirectControlIds", "TwowaySynonymsControlIds", "OnewaySynonymsControlIds", "DoNotAssociateControlIds", "ReplacementControlIds", "IgnoreControlIds", "DiversityLevel", "EnableCategoryFilterLevel", "SolutionTypes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.CommonProto.getDescriptor();
    com.google.cloud.retail.v2alpha.SearchServiceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
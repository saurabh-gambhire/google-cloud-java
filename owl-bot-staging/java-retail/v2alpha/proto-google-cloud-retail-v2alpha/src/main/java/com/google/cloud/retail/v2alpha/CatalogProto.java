// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/catalog.proto

package com.google.cloud.retail.v2alpha;

public final class CatalogProto {
  private CatalogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_CatalogAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CatalogAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_AttributesConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_CompletionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompletionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_Catalog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Catalog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/retail/v2alpha/catalog.pr" +
      "oto\022\033google.cloud.retail.v2alpha\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\032(google/cloud/retail/v2alph" +
      "a/common.proto\032/google/cloud/retail/v2al" +
      "pha/import_config.proto\"^\n\022ProductLevelC" +
      "onfig\022\036\n\026ingestion_product_type\030\001 \001(\t\022(\n" +
      " merchant_center_product_id_field\030\002 \001(\t\"" +
      "\226\007\n\020CatalogAttribute\022\020\n\003key\030\001 \001(\tB\003\340A\002\022\023" +
      "\n\006in_use\030\t \001(\010B\003\340A\003\022N\n\004type\030\n \001(\0162;.goog" +
      "le.cloud.retail.v2alpha.CatalogAttribute" +
      ".AttributeTypeB\003\340A\003\022W\n\020indexable_option\030" +
      "\005 \001(\0162=.google.cloud.retail.v2alpha.Cata" +
      "logAttribute.IndexableOption\022f\n\030dynamic_" +
      "facetable_option\030\006 \001(\0162D.google.cloud.re" +
      "tail.v2alpha.CatalogAttribute.DynamicFac" +
      "etableOption\022Y\n\021searchable_option\030\007 \001(\0162" +
      ">.google.cloud.retail.v2alpha.CatalogAtt" +
      "ribute.SearchableOption\022e\n recommendatio" +
      "ns_filtering_option\030\010 \001(\0162;.google.cloud" +
      ".retail.v2alpha.RecommendationsFiltering" +
      "Option\"8\n\rAttributeType\022\013\n\007UNKNOWN\020\000\022\013\n\007" +
      "TEXTUAL\020\001\022\r\n\tNUMERICAL\020\002\"b\n\017IndexableOpt" +
      "ion\022 \n\034INDEXABLE_OPTION_UNSPECIFIED\020\000\022\025\n" +
      "\021INDEXABLE_ENABLED\020\001\022\026\n\022INDEXABLE_DISABL" +
      "ED\020\002\"\201\001\n\026DynamicFacetableOption\022(\n$DYNAM" +
      "IC_FACETABLE_OPTION_UNSPECIFIED\020\000\022\035\n\031DYN" +
      "AMIC_FACETABLE_ENABLED\020\001\022\036\n\032DYNAMIC_FACE" +
      "TABLE_DISABLED\020\002\"f\n\020SearchableOption\022!\n\035" +
      "SEARCHABLE_OPTION_UNSPECIFIED\020\000\022\026\n\022SEARC" +
      "HABLE_ENABLED\020\001\022\027\n\023SEARCHABLE_DISABLED\020\002" +
      "\"\305\003\n\020AttributesConfig\022\024\n\004name\030\001 \001(\tB\006\340A\002" +
      "\340A\005\022`\n\022catalog_attributes\030\002 \003(\0132D.google" +
      ".cloud.retail.v2alpha.AttributesConfig.C" +
      "atalogAttributesEntry\022V\n\026attribute_confi" +
      "g_level\030\003 \001(\01621.google.cloud.retail.v2al" +
      "pha.AttributeConfigLevelB\003\340A\003\032g\n\026Catalog" +
      "AttributesEntry\022\013\n\003key\030\001 \001(\t\022<\n\005value\030\002 " +
      "\001(\0132-.google.cloud.retail.v2alpha.Catalo" +
      "gAttribute:\0028\001:x\352Au\n&retail.googleapis.c" +
      "om/AttributesConfig\022Kprojects/{project}/" +
      "locations/{location}/catalogs/{catalog}/" +
      "attributesConfig\"\250\005\n\020CompletionConfig\022\024\n" +
      "\004name\030\001 \001(\tB\006\340A\002\340A\005\022\026\n\016matching_order\030\002 " +
      "\001(\t\022\027\n\017max_suggestions\030\003 \001(\005\022\031\n\021min_pref" +
      "ix_length\030\004 \001(\005\022\025\n\rauto_learning\030\013 \001(\010\022]" +
      "\n\030suggestions_input_config\030\005 \001(\01326.googl" +
      "e.cloud.retail.v2alpha.CompletionDataInp" +
      "utConfigB\003\340A\003\022.\n!last_suggestions_import" +
      "_operation\030\006 \001(\tB\003\340A\003\022Z\n\025denylist_input_" +
      "config\030\007 \001(\01326.google.cloud.retail.v2alp" +
      "ha.CompletionDataInputConfigB\003\340A\003\022+\n\036las" +
      "t_denylist_import_operation\030\010 \001(\tB\003\340A\003\022[" +
      "\n\026allowlist_input_config\030\t \001(\01326.google." +
      "cloud.retail.v2alpha.CompletionDataInput" +
      "ConfigB\003\340A\003\022,\n\037last_allowlist_import_ope" +
      "ration\030\n \001(\tB\003\340A\003:x\352Au\n&retail.googleapi" +
      "s.com/CompletionConfig\022Kprojects/{projec" +
      "t}/locations/{location}/catalogs/{catalo" +
      "g}/completionConfig\"\222\001\n\022MerchantCenterLi" +
      "nk\022\'\n\032merchant_center_account_id\030\001 \001(\003B\003" +
      "\340A\002\022\021\n\tbranch_id\030\002 \001(\t\022\024\n\014destinations\030\003" +
      " \003(\t\022\023\n\013region_code\030\004 \001(\t\022\025\n\rlanguage_co" +
      "de\030\005 \001(\t\"]\n\033MerchantCenterLinkingConfig\022" +
      ">\n\005links\030\001 \003(\0132/.google.cloud.retail.v2a" +
      "lpha.MerchantCenterLink\"\323\002\n\007Catalog\022\024\n\004n" +
      "ame\030\001 \001(\tB\006\340A\002\340A\005\022\034\n\014display_name\030\002 \001(\tB" +
      "\006\340A\002\340A\005\022R\n\024product_level_config\030\004 \001(\0132/." +
      "google.cloud.retail.v2alpha.ProductLevel" +
      "ConfigB\003\340A\002\022`\n\036merchant_center_linking_c" +
      "onfig\030\006 \001(\01328.google.cloud.retail.v2alph" +
      "a.MerchantCenterLinkingConfig:^\352A[\n\035reta" +
      "il.googleapis.com/Catalog\022:projects/{pro" +
      "ject}/locations/{location}/catalogs/{cat" +
      "alog}B\332\001\n\037com.google.cloud.retail.v2alph" +
      "aB\014CatalogProtoP\001ZAgoogle.golang.org/gen" +
      "proto/googleapis/cloud/retail/v2alpha;re" +
      "tail\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2Al" +
      "pha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Goog" +
      "le::Cloud::Retail::V2alphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2alpha.CommonProto.getDescriptor(),
          com.google.cloud.retail.v2alpha.ImportConfigProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_descriptor,
        new java.lang.String[] { "IngestionProductType", "MerchantCenterProductIdField", });
    internal_static_google_cloud_retail_v2alpha_CatalogAttribute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_CatalogAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_CatalogAttribute_descriptor,
        new java.lang.String[] { "Key", "InUse", "Type", "IndexableOption", "DynamicFacetableOption", "SearchableOption", "RecommendationsFilteringOption", });
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_AttributesConfig_descriptor,
        new java.lang.String[] { "Name", "CatalogAttributes", "AttributeConfigLevel", });
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_descriptor =
      internal_static_google_cloud_retail_v2alpha_AttributesConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_retail_v2alpha_CompletionConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2alpha_CompletionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_CompletionConfig_descriptor,
        new java.lang.String[] { "Name", "MatchingOrder", "MaxSuggestions", "MinPrefixLength", "AutoLearning", "SuggestionsInputConfig", "LastSuggestionsImportOperation", "DenylistInputConfig", "LastDenylistImportOperation", "AllowlistInputConfig", "LastAllowlistImportOperation", });
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_descriptor,
        new java.lang.String[] { "MerchantCenterAccountId", "BranchId", "Destinations", "RegionCode", "LanguageCode", });
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_descriptor,
        new java.lang.String[] { "Links", });
    internal_static_google_cloud_retail_v2alpha_Catalog_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2alpha_Catalog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_Catalog_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "ProductLevelConfig", "MerchantCenterLinkingConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.CommonProto.getDescriptor();
    com.google.cloud.retail.v2alpha.ImportConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
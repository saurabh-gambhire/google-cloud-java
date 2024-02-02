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
// source: google/devtools/artifactregistry/v1beta2/tag.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.artifactregistry.v1beta2;

public final class TagProto {
  private TagProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_Tag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ListTagsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListTagsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ListTagsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListTagsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_GetTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_GetTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_CreateTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_CreateTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_DeleteTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_DeleteTagRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/devtools/artifactregistry/v1bet"
          + "a2/tag.proto\022(google.devtools.artifactre"
          + "gistry.v1beta2\032\031google/api/resource.prot"
          + "o\032 google/protobuf/field_mask.proto\"\261\001\n\003"
          + "Tag\022\014\n\004name\030\001 \001(\t\022\017\n\007version\030\002 \001(\t:\212\001\352A\206"
          + "\001\n#artifactregistry.googleapis.com/Tag\022_"
          + "projects/{project}/locations/{location}/"
          + "repositories/{repository}/packages/{pack"
          + "age}/tags/{tag}\"X\n\017ListTagsRequest\022\016\n\006pa"
          + "rent\030\001 \001(\t\022\016\n\006filter\030\004 \001(\t\022\021\n\tpage_size\030"
          + "\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"h\n\020ListTagsRes"
          + "ponse\022;\n\004tags\030\001 \003(\0132-.google.devtools.ar"
          + "tifactregistry.v1beta2.Tag\022\027\n\017next_page_"
          + "token\030\002 \001(\t\"\035\n\rGetTagRequest\022\014\n\004name\030\001 \001"
          + "(\t\"n\n\020CreateTagRequest\022\016\n\006parent\030\001 \001(\t\022\016"
          + "\n\006tag_id\030\002 \001(\t\022:\n\003tag\030\003 \001(\0132-.google.dev"
          + "tools.artifactregistry.v1beta2.Tag\"\177\n\020Up"
          + "dateTagRequest\022:\n\003tag\030\001 \001(\0132-.google.dev"
          + "tools.artifactregistry.v1beta2.Tag\022/\n\013up"
          + "date_mask\030\002 \001(\0132\032.google.protobuf.FieldM"
          + "ask\" \n\020DeleteTagRequest\022\014\n\004name\030\001 \001(\tB\214\002"
          + "\n,com.google.devtools.artifactregistry.v"
          + "1beta2B\010TagProtoP\001ZUcloud.google.com/go/"
          + "artifactregistry/apiv1beta2/artifactregi"
          + "strypb;artifactregistrypb\252\002%Google.Cloud"
          + ".ArtifactRegistry.V1Beta2\312\002%Google\\Cloud"
          + "\\ArtifactRegistry\\V1beta2\352\002(Google::Clou"
          + "d::ArtifactRegistry::V1beta2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1beta2_Tag_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_Tag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_Tag_descriptor,
            new java.lang.String[] {
              "Name", "Version",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ListTagsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1beta2_ListTagsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ListTagsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ListTagsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1beta2_ListTagsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ListTagsResponse_descriptor,
            new java.lang.String[] {
              "Tags", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_GetTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1beta2_GetTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_GetTagRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_CreateTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1beta2_CreateTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_CreateTagRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TagId", "Tag",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_descriptor,
            new java.lang.String[] {
              "Tag", "UpdateMask",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_DeleteTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_artifactregistry_v1beta2_DeleteTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_DeleteTagRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

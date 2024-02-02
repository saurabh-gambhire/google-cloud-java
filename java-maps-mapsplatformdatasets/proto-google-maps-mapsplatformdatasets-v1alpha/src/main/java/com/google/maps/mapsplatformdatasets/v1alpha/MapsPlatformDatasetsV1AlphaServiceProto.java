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
// source: google/maps/mapsplatformdatasets/v1alpha/maps_platform_datasets_alpha_service.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.mapsplatformdatasets.v1alpha;

public final class MapsPlatformDatasetsV1AlphaServiceProto {
  private MapsPlatformDatasetsV1AlphaServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nSgoogle/maps/mapsplatformdatasets/v1alp"
          + "ha/maps_platform_datasets_alpha_service."
          + "proto\022(google.maps.mapsplatformdatasets."
          + "v1alpha\032\034google/api/annotations.proto\032\027g"
          + "oogle/api/client.proto\0326google/maps/maps"
          + "platformdatasets/v1alpha/dataset.proto\032E"
          + "google/maps/mapsplatformdatasets/v1alpha"
          + "/maps_platform_datasets.proto\032\033google/pr"
          + "otobuf/empty.proto2\360\013\n\033MapsPlatformDatas"
          + "etsV1Alpha\022\313\001\n\rCreateDataset\022>.google.ma"
          + "ps.mapsplatformdatasets.v1alpha.CreateDa"
          + "tasetRequest\0321.google.maps.mapsplatformd"
          + "atasets.v1alpha.Dataset\"G\332A\016parent,datas"
          + "et\202\323\344\223\0020\"%/v1alpha/{parent=projects/*}/d"
          + "atasets:\007dataset\022\350\001\n\025UpdateDatasetMetada"
          + "ta\022F.google.maps.mapsplatformdatasets.v1"
          + "alpha.UpdateDatasetMetadataRequest\0321.goo"
          + "gle.maps.mapsplatformdatasets.v1alpha.Da"
          + "taset\"T\332A\023dataset,update_mask\202\323\344\223\00282-/v1"
          + "alpha/{dataset.name=projects/*/datasets/"
          + "*}:\007dataset\022\262\001\n\nGetDataset\022;.google.maps"
          + ".mapsplatformdatasets.v1alpha.GetDataset"
          + "Request\0321.google.maps.mapsplatformdatase"
          + "ts.v1alpha.Dataset\"4\332A\004name\202\323\344\223\002\'\022%/v1al"
          + "pha/{name=projects/*/datasets/*}\022\345\001\n\023Lis"
          + "tDatasetVersions\022D.google.maps.mapsplatf"
          + "ormdatasets.v1alpha.ListDatasetVersionsR"
          + "equest\032E.google.maps.mapsplatformdataset"
          + "s.v1alpha.ListDatasetVersionsResponse\"A\332"
          + "A\004name\202\323\344\223\0024\0222/v1alpha/{name=projects/*/"
          + "datasets/*}:listVersions\022\305\001\n\014ListDataset"
          + "s\022=.google.maps.mapsplatformdatasets.v1a"
          + "lpha.ListDatasetsRequest\032>.google.maps.m"
          + "apsplatformdatasets.v1alpha.ListDatasets"
          + "Response\"6\332A\006parent\202\323\344\223\002\'\022%/v1alpha/{par"
          + "ent=projects/*}/datasets\022\235\001\n\rDeleteDatas"
          + "et\022>.google.maps.mapsplatformdatasets.v1"
          + "alpha.DeleteDatasetRequest\032\026.google.prot"
          + "obuf.Empty\"4\332A\004name\202\323\344\223\002\'*%/v1alpha/{nam"
          + "e=projects/*/datasets/*}\022\271\001\n\024DeleteDatas"
          + "etVersion\022E.google.maps.mapsplatformdata"
          + "sets.v1alpha.DeleteDatasetVersionRequest"
          + "\032\026.google.protobuf.Empty\"B\332A\004name\202\323\344\223\0025*"
          + "3/v1alpha/{name=projects/*/datasets/*}:d"
          + "eleteVersion\032W\312A#mapsplatformdatasets.go"
          + "ogleapis.com\322A.https://www.googleapis.co"
          + "m/auth/cloud-platformB\242\002\n,com.google.map"
          + "s.mapsplatformdatasets.v1alphaB\'MapsPlat"
          + "formDatasetsV1AlphaServiceProtoP\001Zfcloud"
          + ".google.com/go/maps/mapsplatformdatasets"
          + "/apiv1alpha/mapsplatformdatasetspb;mapsp"
          + "latformdatasetspb\370\001\001\242\002\005MDV1A\252\002(Google.Ma"
          + "ps.MapsPlatformDatasets.V1Alpha\312\002(Google"
          + "\\Maps\\MapsPlatformDatasets\\V1alphab\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.maps.mapsplatformdatasets.v1alpha.DatasetProto.getDescriptor(),
              com.google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsProto
                  .getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.maps.mapsplatformdatasets.v1alpha.DatasetProto.getDescriptor();
    com.google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

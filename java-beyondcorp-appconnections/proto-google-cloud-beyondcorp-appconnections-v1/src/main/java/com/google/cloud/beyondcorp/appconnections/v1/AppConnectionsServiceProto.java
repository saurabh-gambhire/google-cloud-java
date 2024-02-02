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
// source: google/cloud/beyondcorp/appconnections/v1/app_connections_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.beyondcorp.appconnections.v1;

public final class AppConnectionsServiceProto {
  private AppConnectionsServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/beyondcorp/appconnections"
          + "/v1/app_connections_service.proto\022)googl"
          + "e.cloud.beyondcorp.appconnections.v1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032#google/"
          + "longrunning/operations.proto\032 google/pro"
          + "tobuf/field_mask.proto\032\037google/protobuf/"
          + "timestamp.proto\"\276\001\n\031ListAppConnectionsRe"
          + "quest\022@\n\006parent\030\001 \001(\tB0\342A\001\002\372A)\022\'beyondco"
          + "rp.googleapis.com/AppConnection\022\027\n\tpage_"
          + "size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB\004\342A"
          + "\001\001\022\024\n\006filter\030\004 \001(\tB\004\342A\001\001\022\026\n\010order_by\030\005 \001"
          + "(\tB\004\342A\001\001\"\235\001\n\032ListAppConnectionsResponse\022"
          + "Q\n\017app_connections\030\001 \003(\01328.google.cloud."
          + "beyondcorp.appconnections.v1.AppConnecti"
          + "on\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachab"
          + "le\030\003 \003(\t\"Y\n\027GetAppConnectionRequest\022>\n\004n"
          + "ame\030\001 \001(\tB0\342A\001\002\372A)\n\'beyondcorp.googleapi"
          + "s.com/AppConnection\"\216\002\n\032CreateAppConnect"
          + "ionRequest\022@\n\006parent\030\001 \001(\tB0\342A\001\002\372A)\022\'bey"
          + "ondcorp.googleapis.com/AppConnection\022\037\n\021"
          + "app_connection_id\030\002 \001(\tB\004\342A\001\001\022V\n\016app_con"
          + "nection\030\003 \001(\01328.google.cloud.beyondcorp."
          + "appconnections.v1.AppConnectionB\004\342A\001\002\022\030\n"
          + "\nrequest_id\030\004 \001(\tB\004\342A\001\001\022\033\n\rvalidate_only"
          + "\030\005 \001(\010B\004\342A\001\001\"\377\001\n\032UpdateAppConnectionRequ"
          + "est\0225\n\013update_mask\030\001 \001(\0132\032.google.protob"
          + "uf.FieldMaskB\004\342A\001\002\022V\n\016app_connection\030\002 \001"
          + "(\01328.google.cloud.beyondcorp.appconnecti"
          + "ons.v1.AppConnectionB\004\342A\001\002\022\030\n\nrequest_id"
          + "\030\003 \001(\tB\004\342A\001\001\022\033\n\rvalidate_only\030\004 \001(\010B\004\342A\001"
          + "\001\022\033\n\rallow_missing\030\005 \001(\010B\004\342A\001\001\"\223\001\n\032Delet"
          + "eAppConnectionRequest\022>\n\004name\030\001 \001(\tB0\342A\001"
          + "\002\372A)\n\'beyondcorp.googleapis.com/AppConne"
          + "ction\022\030\n\nrequest_id\030\002 \001(\tB\004\342A\001\001\022\033\n\rvalid"
          + "ate_only\030\003 \001(\010B\004\342A\001\001\"\336\001\n\034ResolveAppConne"
          + "ctionsRequest\022@\n\006parent\030\001 \001(\tB0\342A\001\002\372A)\022\'"
          + "beyondcorp.googleapis.com/AppConnection\022"
          + "I\n\020app_connector_id\030\002 \001(\tB/\342A\001\002\372A(\n&beyo"
          + "ndcorp.googleapis.com/AppConnector\022\027\n\tpa"
          + "ge_size\030\003 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\004 \001(\tB"
          + "\004\342A\001\001\"\317\002\n\035ResolveAppConnectionsResponse\022"
          + "}\n\026app_connection_details\030\001 \003(\0132].google"
          + ".cloud.beyondcorp.appconnections.v1.Reso"
          + "lveAppConnectionsResponse.AppConnectionD"
          + "etails\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unrea"
          + "chable\030\003 \003(\t\032\200\001\n\024AppConnectionDetails\022P\n"
          + "\016app_connection\030\001 \001(\01328.google.cloud.bey"
          + "ondcorp.appconnections.v1.AppConnection\022"
          + "\026\n\016recent_mig_vms\030\002 \003(\t\"\252\n\n\rAppConnectio"
          + "n\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\0225\n\013create_time\030\002 \001"
          + "(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013"
          + "update_time\030\003 \001(\0132\032.google.protobuf.Time"
          + "stampB\004\342A\001\003\022Z\n\006labels\030\004 \003(\0132D.google.clo"
          + "ud.beyondcorp.appconnections.v1.AppConne"
          + "ction.LabelsEntryB\004\342A\001\001\022\032\n\014display_name\030"
          + "\005 \001(\tB\004\342A\001\001\022\021\n\003uid\030\006 \001(\tB\004\342A\001\003\022Q\n\004type\030\007"
          + " \001(\0162=.google.cloud.beyondcorp.appconnec"
          + "tions.v1.AppConnection.TypeB\004\342A\001\002\022p\n\024app"
          + "lication_endpoint\030\010 \001(\0132L.google.cloud.b"
          + "eyondcorp.appconnections.v1.AppConnectio"
          + "n.ApplicationEndpointB\004\342A\001\002\022\030\n\nconnector"
          + "s\030\t \003(\tB\004\342A\001\001\022S\n\005state\030\n \001(\0162>.google.cl"
          + "oud.beyondcorp.appconnections.v1.AppConn"
          + "ection.StateB\004\342A\001\003\022W\n\007gateway\030\013 \001(\0132@.go"
          + "ogle.cloud.beyondcorp.appconnections.v1."
          + "AppConnection.GatewayB\004\342A\001\001\032=\n\023Applicati"
          + "onEndpoint\022\022\n\004host\030\001 \001(\tB\004\342A\001\002\022\022\n\004port\030\002"
          + " \001(\005B\004\342A\001\002\032\213\002\n\007Gateway\022Y\n\004type\030\002 \001(\0162E.g"
          + "oogle.cloud.beyondcorp.appconnections.v1"
          + ".AppConnection.Gateway.TypeB\004\342A\001\002\022\021\n\003uri"
          + "\030\003 \001(\tB\004\342A\001\003\022\032\n\014ingress_port\030\004 \001(\005B\004\342A\001\003"
          + "\022B\n\013app_gateway\030\005 \001(\tB-\342A\001\002\372A&\n$beyondco"
          + "rp.googleapis.com/AppGateway\"2\n\004Type\022\024\n\020"
          + "TYPE_UNSPECIFIED\020\000\022\024\n\020GCP_REGIONAL_MIG\020\001"
          + "\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 "
          + "\001(\t:\0028\001\"+\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\r\n"
          + "\tTCP_PROXY\020\001\"_\n\005State\022\025\n\021STATE_UNSPECIFI"
          + "ED\020\000\022\014\n\010CREATING\020\001\022\013\n\007CREATED\020\002\022\014\n\010UPDAT"
          + "ING\020\003\022\014\n\010DELETING\020\004\022\010\n\004DOWN\020\005:u\352Ar\n\'beyo"
          + "ndcorp.googleapis.com/AppConnection\022Gpro"
          + "jects/{project}/locations/{location}/app"
          + "Connections/{app_connection}\"\224\002\n\036AppConn"
          + "ectionOperationMetadata\0225\n\013create_time\030\001"
          + " \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0222"
          + "\n\010end_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\022\024\n\006target\030\003 \001(\tB\004\342A\001\003\022\022\n\004verb"
          + "\030\004 \001(\tB\004\342A\001\003\022\034\n\016status_message\030\005 \001(\tB\004\342A"
          + "\001\003\022$\n\026requested_cancellation\030\006 \001(\010B\004\342A\001\003"
          + "\022\031\n\013api_version\030\007 \001(\tB\004\342A\001\0032\352\014\n\025AppConne"
          + "ctionsService\022\346\001\n\022ListAppConnections\022D.g"
          + "oogle.cloud.beyondcorp.appconnections.v1"
          + ".ListAppConnectionsRequest\032E.google.clou"
          + "d.beyondcorp.appconnections.v1.ListAppCo"
          + "nnectionsResponse\"C\332A\006parent\202\323\344\223\0024\0222/v1/"
          + "{parent=projects/*/locations/*}/appConne"
          + "ctions\022\323\001\n\020GetAppConnection\022B.google.clo"
          + "ud.beyondcorp.appconnections.v1.GetAppCo"
          + "nnectionRequest\0328.google.cloud.beyondcor"
          + "p.appconnections.v1.AppConnection\"A\332A\004na"
          + "me\202\323\344\223\0024\0222/v1/{name=projects/*/locations"
          + "/*/appConnections/*}\022\244\002\n\023CreateAppConnec"
          + "tion\022E.google.cloud.beyondcorp.appconnec"
          + "tions.v1.CreateAppConnectionRequest\032\035.go"
          + "ogle.longrunning.Operation\"\246\001\312A/\n\rAppCon"
          + "nection\022\036AppConnectionOperationMetadata\332"
          + "A\'parent,app_connection,app_connection_i"
          + "d\202\323\344\223\002D\"2/v1/{parent=projects/*/location"
          + "s/*}/appConnections:\016app_connection\022\246\002\n\023"
          + "UpdateAppConnection\022E.google.cloud.beyon"
          + "dcorp.appconnections.v1.UpdateAppConnect"
          + "ionRequest\032\035.google.longrunning.Operatio"
          + "n\"\250\001\312A/\n\rAppConnection\022\036AppConnectionOpe"
          + "rationMetadata\332A\032app_connection,update_m"
          + "ask\202\323\344\223\002S2A/v1/{app_connection.name=proj"
          + "ects/*/locations/*/appConnections/*}:\016ap"
          + "p_connection\022\370\001\n\023DeleteAppConnection\022E.g"
          + "oogle.cloud.beyondcorp.appconnections.v1"
          + ".DeleteAppConnectionRequest\032\035.google.lon"
          + "grunning.Operation\"{\312A7\n\025google.protobuf"
          + ".Empty\022\036AppConnectionOperationMetadata\332A"
          + "\004name\202\323\344\223\0024*2/v1/{name=projects/*/locati"
          + "ons/*/appConnections/*}\022\367\001\n\025ResolveAppCo"
          + "nnections\022G.google.cloud.beyondcorp.appc"
          + "onnections.v1.ResolveAppConnectionsReque"
          + "st\032H.google.cloud.beyondcorp.appconnecti"
          + "ons.v1.ResolveAppConnectionsResponse\"K\332A"
          + "\006parent\202\323\344\223\002<\022:/v1/{parent=projects/*/lo"
          + "cations/*}/appConnections:resolve\032M\312A\031be"
          + "yondcorp.googleapis.com\322A.https://www.go"
          + "ogleapis.com/auth/cloud-platformB\212\004\n-com"
          + ".google.cloud.beyondcorp.appconnections."
          + "v1B\032AppConnectionsServiceProtoP\001ZUcloud."
          + "google.com/go/beyondcorp/appconnections/"
          + "apiv1/appconnectionspb;appconnectionspb\252"
          + "\002)Google.Cloud.BeyondCorp.AppConnections"
          + ".V1\312\002)Google\\Cloud\\BeyondCorp\\AppConnect"
          + "ions\\V1\352\002-Google::Cloud::BeyondCorp::App"
          + "Connections::V1\352Ao\n&beyondcorp.googleapi"
          + "s.com/AppConnector\022Eprojects/{project}/l"
          + "ocations/{location}/appConnectors/{app_c"
          + "onnector}\352Ai\n$beyondcorp.googleapis.com/"
          + "AppGateway\022Aprojects/{project}/locations"
          + "/{location}/appGateways/{app_gateway}b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_descriptor,
            new java.lang.String[] {
              "AppConnections", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AppConnectionId", "AppConnection", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "AppConnection", "RequestId", "ValidateOnly", "AllowMissing",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AppConnectorId", "PageSize", "PageToken",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_descriptor,
            new java.lang.String[] {
              "AppConnectionDetails", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_descriptor =
        internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_descriptor,
            new java.lang.String[] {
              "AppConnection", "RecentMigVms",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "DisplayName",
              "Uid",
              "Type",
              "ApplicationEndpoint",
              "Connectors",
              "State",
              "Gateway",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor =
        internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor,
            new java.lang.String[] {
              "Host", "Port",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor =
        internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor,
            new java.lang.String[] {
              "Type", "Uri", "IngressPort", "AppGateway",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor =
        internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

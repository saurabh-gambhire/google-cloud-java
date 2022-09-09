// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/game_server_deployments.proto

package com.google.cloud.gaming.v1;

public final class GameServerDeployments {
  private GameServerDeployments() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_GameServerDeployment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerDeployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_GameServerConfigOverride_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerConfigOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/gaming/v1/game_server_dep" +
      "loyments.proto\022\026google.cloud.gaming.v1\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032#google/cloud/gaming/" +
      "v1/common.proto\032 google/protobuf/field_m" +
      "ask.proto\032\037google/protobuf/timestamp.pro" +
      "to\"\311\001\n ListGameServerDeploymentsRequest\022" +
      "H\n\006parent\030\001 \001(\tB8\340A\002\372A2\0220gameservices.go" +
      "ogleapis.com/GameServerDeployment\022\026\n\tpag" +
      "e_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340" +
      "A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(" +
      "\tB\003\340A\001\"\240\001\n!ListGameServerDeploymentsResp" +
      "onse\022M\n\027game_server_deployments\030\001 \003(\0132,." +
      "google.cloud.gaming.v1.GameServerDeploym" +
      "ent\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreacha" +
      "ble\030\004 \003(\t\"h\n\036GetGameServerDeploymentRequ" +
      "est\022F\n\004name\030\001 \001(\tB8\340A\002\372A2\n0gameservices." +
      "googleapis.com/GameServerDeployment\"o\n%G" +
      "etGameServerDeploymentRolloutRequest\022F\n\004" +
      "name\030\001 \001(\tB8\340A\002\372A2\n0gameservices.googlea" +
      "pis.com/GameServerDeployment\"\334\001\n!CreateG" +
      "ameServerDeploymentRequest\022H\n\006parent\030\001 \001" +
      "(\tB8\340A\002\372A2\0220gameservices.googleapis.com/" +
      "GameServerDeployment\022\032\n\rdeployment_id\030\002 " +
      "\001(\tB\003\340A\002\022Q\n\026game_server_deployment\030\003 \001(\013" +
      "2,.google.cloud.gaming.v1.GameServerDepl" +
      "oymentB\003\340A\002\"k\n!DeleteGameServerDeploymen" +
      "tRequest\022F\n\004name\030\001 \001(\tB8\340A\002\372A2\n0gameserv" +
      "ices.googleapis.com/GameServerDeployment" +
      "\"\254\001\n!UpdateGameServerDeploymentRequest\022Q" +
      "\n\026game_server_deployment\030\001 \001(\0132,.google." +
      "cloud.gaming.v1.GameServerDeploymentB\003\340A" +
      "\002\0224\n\013update_mask\030\002 \001(\0132\032.google.protobuf" +
      ".FieldMaskB\003\340A\002\"\253\001\n(UpdateGameServerDepl" +
      "oymentRolloutRequest\022I\n\007rollout\030\001 \001(\01323." +
      "google.cloud.gaming.v1.GameServerDeploym" +
      "entRolloutB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.g" +
      "oogle.protobuf.FieldMaskB\003\340A\002\"0\n\033FetchDe" +
      "ploymentStateRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"" +
      "\203\002\n\034FetchDeploymentStateResponse\022`\n\rclus" +
      "ter_state\030\001 \003(\0132I.google.cloud.gaming.v1" +
      ".FetchDeploymentStateResponse.DeployedCl" +
      "usterState\022\023\n\013unavailable\030\002 \003(\t\032l\n\024Deplo" +
      "yedClusterState\022\017\n\007cluster\030\001 \001(\t\022C\n\rflee" +
      "t_details\030\002 \003(\0132,.google.cloud.gaming.v1" +
      ".DeployedFleetDetails\"\260\003\n\024GameServerDepl" +
      "oyment\022\014\n\004name\030\001 \001(\t\0224\n\013create_time\030\002 \001(" +
      "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up" +
      "date_time\030\003 \001(\0132\032.google.protobuf.Timest" +
      "ampB\003\340A\003\022H\n\006labels\030\004 \003(\01328.google.cloud." +
      "gaming.v1.GameServerDeployment.LabelsEnt" +
      "ry\022\014\n\004etag\030\007 \001(\t\022\023\n\013description\030\010 \001(\t\032-\n" +
      "\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t" +
      ":\0028\001:\201\001\352A~\n0gameservices.googleapis.com/" +
      "GameServerDeployment\022Jprojects/{project}" +
      "/locations/{location}/gameServerDeployme" +
      "nts/{deployment}\"\214\001\n\030GameServerConfigOve" +
      "rride\022@\n\017realms_selector\030\001 \001(\0132%.google." +
      "cloud.gaming.v1.RealmSelectorH\000\022\030\n\016confi" +
      "g_version\030d \001(\tH\001B\n\n\010selectorB\010\n\006change\"" +
      "\265\003\n\033GameServerDeploymentRollout\022\014\n\004name\030" +
      "\001 \001(\t\0224\n\013create_time\030\002 \001(\0132\032.google.prot" +
      "obuf.TimestampB\003\340A\003\0224\n\013update_time\030\003 \001(\013" +
      "2\032.google.protobuf.TimestampB\003\340A\003\022\"\n\032def" +
      "ault_game_server_config\030\004 \001(\t\022V\n\034game_se" +
      "rver_config_overrides\030\005 \003(\01320.google.clo" +
      "ud.gaming.v1.GameServerConfigOverride\022\014\n" +
      "\004etag\030\006 \001(\t:\221\001\352A\215\001\n7gameservices.googlea" +
      "pis.com/GameServerDeploymentRollout\022Rpro" +
      "jects/{project}/locations/{location}/gam" +
      "eServerDeployments/{deployment}/rollout\"" +
      "\343\001\n)PreviewGameServerDeploymentRolloutRe" +
      "quest\022I\n\007rollout\030\001 \001(\01323.google.cloud.ga" +
      "ming.v1.GameServerDeploymentRolloutB\003\340A\002" +
      "\0224\n\013update_mask\030\002 \001(\0132\032.google.protobuf." +
      "FieldMaskB\003\340A\001\0225\n\014preview_time\030\003 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\003\340A\001\"\212\001\n*Previe" +
      "wGameServerDeploymentRolloutResponse\022\023\n\013" +
      "unavailable\030\002 \003(\t\022\014\n\004etag\030\003 \001(\t\0229\n\014targe" +
      "t_state\030\004 \001(\0132#.google.cloud.gaming.v1.T" +
      "argetStateB\\\n\032com.google.cloud.gaming.v1" +
      "P\001Z<google.golang.org/genproto/googleapi" +
      "s/cloud/gaming/v1;gamingb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.gaming.v1.Common.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_descriptor,
        new java.lang.String[] { "GameServerDeployments", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor,
        new java.lang.String[] { "Parent", "DeploymentId", "GameServerDeployment", });
    internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_descriptor,
        new java.lang.String[] { "GameServerDeployment", "UpdateMask", });
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_descriptor,
        new java.lang.String[] { "Rollout", "UpdateMask", });
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_descriptor,
        new java.lang.String[] { "ClusterState", "Unavailable", });
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_descriptor =
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_descriptor,
        new java.lang.String[] { "Cluster", "FleetDetails", });
    internal_static_google_cloud_gaming_v1_GameServerDeployment_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gaming_v1_GameServerDeployment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_GameServerDeployment_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "Etag", "Description", });
    internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_descriptor =
      internal_static_google_cloud_gaming_v1_GameServerDeployment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_gaming_v1_GameServerConfigOverride_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gaming_v1_GameServerConfigOverride_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_GameServerConfigOverride_descriptor,
        new java.lang.String[] { "RealmsSelector", "ConfigVersion", "Selector", "Change", });
    internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "DefaultGameServerConfig", "GameServerConfigOverrides", "Etag", });
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_descriptor,
        new java.lang.String[] { "Rollout", "UpdateMask", "PreviewTime", });
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_descriptor,
        new java.lang.String[] { "Unavailable", "Etag", "TargetState", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gaming.v1.Common.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
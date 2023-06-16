/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface BatchGetAssetsHistoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.BatchGetAssetsHistoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative name of the root asset. It can only be an
   * organization number (such as "organizations/123"), a project ID (such as
   * "projects/my-project-id")", or a project number (such as "projects/12345").
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The relative name of the root asset. It can only be an
   * organization number (such as "organizations/123"), a project ID (such as
   * "projects/my-project-id")", or a project number (such as "projects/12345").
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * A list of the full names of the assets.
   * See: https://cloud.google.com/asset-inventory/docs/resource-name-format
   * Example:
   *
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   *
   * The request becomes a no-op if the asset name list is empty, and the max
   * size of the asset name list is 100 in one request.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   *
   * @return A list containing the assetNames.
   */
  java.util.List<java.lang.String> getAssetNamesList();
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets.
   * See: https://cloud.google.com/asset-inventory/docs/resource-name-format
   * Example:
   *
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   *
   * The request becomes a no-op if the asset name list is empty, and the max
   * size of the asset name list is 100 in one request.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   *
   * @return The count of assetNames.
   */
  int getAssetNamesCount();
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets.
   * See: https://cloud.google.com/asset-inventory/docs/resource-name-format
   * Example:
   *
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   *
   * The request becomes a no-op if the asset name list is empty, and the max
   * size of the asset name list is 100 in one request.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The assetNames at the given index.
   */
  java.lang.String getAssetNames(int index);
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets.
   * See: https://cloud.google.com/asset-inventory/docs/resource-name-format
   * Example:
   *
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   *
   * The request becomes a no-op if the asset name list is empty, and the max
   * size of the asset name list is 100 in one request.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetNames at the given index.
   */
  com.google.protobuf.ByteString getAssetNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The content type.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.ContentType content_type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The content type.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.ContentType content_type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The contentType.
   */
  com.google.cloud.asset.v1.ContentType getContentType();

  /**
   *
   *
   * <pre>
   * Optional. The time window for the asset history. Both start_time and
   * end_time are optional and if set, it must be after the current time minus
   * 35 days. If end_time is not set, it is default to current timestamp.
   * If start_time is not set, the snapshot of the assets at end_time will be
   * returned. The returned results contain all temporal assets whose time
   * window overlap with read_time_window.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.TimeWindow read_time_window = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the readTimeWindow field is set.
   */
  boolean hasReadTimeWindow();
  /**
   *
   *
   * <pre>
   * Optional. The time window for the asset history. Both start_time and
   * end_time are optional and if set, it must be after the current time minus
   * 35 days. If end_time is not set, it is default to current timestamp.
   * If start_time is not set, the snapshot of the assets at end_time will be
   * returned. The returned results contain all temporal assets whose time
   * window overlap with read_time_window.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.TimeWindow read_time_window = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The readTimeWindow.
   */
  com.google.cloud.asset.v1.TimeWindow getReadTimeWindow();
  /**
   *
   *
   * <pre>
   * Optional. The time window for the asset history. Both start_time and
   * end_time are optional and if set, it must be after the current time minus
   * 35 days. If end_time is not set, it is default to current timestamp.
   * If start_time is not set, the snapshot of the assets at end_time will be
   * returned. The returned results contain all temporal assets whose time
   * window overlap with read_time_window.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.TimeWindow read_time_window = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.asset.v1.TimeWindowOrBuilder getReadTimeWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it outputs specified relationships' history on the [asset_names]. It
   * returns an error if any of the [relationship_types] doesn't belong to the
   * supported relationship types of the [asset_names] or if any of the
   * [asset_names]'s types doesn't belong to the source types of the
   * [relationship_types].
   * * Otherwise:
   * it outputs the supported relationships' history on the [asset_names] or
   * returns an error if any of the [asset_names]'s types has no relationship
   * support.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all
   * supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the relationshipTypes.
   */
  java.util.List<java.lang.String> getRelationshipTypesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it outputs specified relationships' history on the [asset_names]. It
   * returns an error if any of the [relationship_types] doesn't belong to the
   * supported relationship types of the [asset_names] or if any of the
   * [asset_names]'s types doesn't belong to the source types of the
   * [relationship_types].
   * * Otherwise:
   * it outputs the supported relationships' history on the [asset_names] or
   * returns an error if any of the [asset_names]'s types has no relationship
   * support.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all
   * supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of relationshipTypes.
   */
  int getRelationshipTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it outputs specified relationships' history on the [asset_names]. It
   * returns an error if any of the [relationship_types] doesn't belong to the
   * supported relationship types of the [asset_names] or if any of the
   * [asset_names]'s types doesn't belong to the source types of the
   * [relationship_types].
   * * Otherwise:
   * it outputs the supported relationships' history on the [asset_names] or
   * returns an error if any of the [asset_names]'s types has no relationship
   * support.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all
   * supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The relationshipTypes at the given index.
   */
  java.lang.String getRelationshipTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of relationship types to output, for example:
   * `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if
   * content_type=RELATIONSHIP.
   * * If specified:
   * it outputs specified relationships' history on the [asset_names]. It
   * returns an error if any of the [relationship_types] doesn't belong to the
   * supported relationship types of the [asset_names] or if any of the
   * [asset_names]'s types doesn't belong to the source types of the
   * [relationship_types].
   * * Otherwise:
   * it outputs the supported relationships' history on the [asset_names] or
   * returns an error if any of the [asset_names]'s types has no relationship
   * support.
   * See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all
   * supported asset types and relationship types.
   * </pre>
   *
   * <code>repeated string relationship_types = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the relationshipTypes at the given index.
   */
  com.google.protobuf.ByteString getRelationshipTypesBytes(int index);
}

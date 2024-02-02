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
// source: google/cloud/asset/v1p7beta1/assets.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1p7beta1;

public interface RelatedAssetsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p7beta1.RelatedAssets)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The detailed relation attributes.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p7beta1.RelationshipAttributes relationship_attributes = 1;</code>
   *
   * @return Whether the relationshipAttributes field is set.
   */
  boolean hasRelationshipAttributes();
  /**
   *
   *
   * <pre>
   * The detailed relation attributes.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p7beta1.RelationshipAttributes relationship_attributes = 1;</code>
   *
   * @return The relationshipAttributes.
   */
  com.google.cloud.asset.v1p7beta1.RelationshipAttributes getRelationshipAttributes();
  /**
   *
   *
   * <pre>
   * The detailed relation attributes.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p7beta1.RelationshipAttributes relationship_attributes = 1;</code>
   */
  com.google.cloud.asset.v1p7beta1.RelationshipAttributesOrBuilder
      getRelationshipAttributesOrBuilder();

  /**
   *
   *
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p7beta1.RelatedAsset assets = 2;</code>
   */
  java.util.List<com.google.cloud.asset.v1p7beta1.RelatedAsset> getAssetsList();
  /**
   *
   *
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p7beta1.RelatedAsset assets = 2;</code>
   */
  com.google.cloud.asset.v1p7beta1.RelatedAsset getAssets(int index);
  /**
   *
   *
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p7beta1.RelatedAsset assets = 2;</code>
   */
  int getAssetsCount();
  /**
   *
   *
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p7beta1.RelatedAsset assets = 2;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1p7beta1.RelatedAssetOrBuilder>
      getAssetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The peer resources of the relationship.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p7beta1.RelatedAsset assets = 2;</code>
   */
  com.google.cloud.asset.v1p7beta1.RelatedAssetOrBuilder getAssetsOrBuilder(int index);
}

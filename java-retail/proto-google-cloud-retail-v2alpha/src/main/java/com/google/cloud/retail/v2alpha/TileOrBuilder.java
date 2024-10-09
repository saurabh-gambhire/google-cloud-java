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
// source: google/cloud/retail/v2alpha/search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

public interface TileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.Tile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The product attribute key-value.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ProductAttributeValue product_attribute_value = 1;</code>
   *
   * @return Whether the productAttributeValue field is set.
   */
  boolean hasProductAttributeValue();
  /**
   *
   *
   * <pre>
   * The product attribute key-value.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ProductAttributeValue product_attribute_value = 1;</code>
   *
   * @return The productAttributeValue.
   */
  com.google.cloud.retail.v2alpha.ProductAttributeValue getProductAttributeValue();
  /**
   *
   *
   * <pre>
   * The product attribute key-value.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ProductAttributeValue product_attribute_value = 1;</code>
   */
  com.google.cloud.retail.v2alpha.ProductAttributeValueOrBuilder
      getProductAttributeValueOrBuilder();

  /**
   *
   *
   * <pre>
   * The product attribute key-numeric interval.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ProductAttributeInterval product_attribute_interval = 2;
   * </code>
   *
   * @return Whether the productAttributeInterval field is set.
   */
  boolean hasProductAttributeInterval();
  /**
   *
   *
   * <pre>
   * The product attribute key-numeric interval.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ProductAttributeInterval product_attribute_interval = 2;
   * </code>
   *
   * @return The productAttributeInterval.
   */
  com.google.cloud.retail.v2alpha.ProductAttributeInterval getProductAttributeInterval();
  /**
   *
   *
   * <pre>
   * The product attribute key-numeric interval.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.ProductAttributeInterval product_attribute_interval = 2;
   * </code>
   */
  com.google.cloud.retail.v2alpha.ProductAttributeIntervalOrBuilder
      getProductAttributeIntervalOrBuilder();

  /**
   *
   *
   * <pre>
   * The representative product id for this tile.
   * </pre>
   *
   * <code>string representative_product_id = 3;</code>
   *
   * @return The representativeProductId.
   */
  java.lang.String getRepresentativeProductId();
  /**
   *
   *
   * <pre>
   * The representative product id for this tile.
   * </pre>
   *
   * <code>string representative_product_id = 3;</code>
   *
   * @return The bytes for representativeProductId.
   */
  com.google.protobuf.ByteString getRepresentativeProductIdBytes();

  com.google.cloud.retail.v2alpha.Tile.ProductAttributeCase getProductAttributeCase();
}

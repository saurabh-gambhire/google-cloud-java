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
// source: google/cloud/privilegedaccessmanager/v1/privilegedaccessmanager.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.privilegedaccessmanager.v1;

public interface SearchEntitlementsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.privilegedaccessmanager.v1.SearchEntitlementsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.privilegedaccessmanager.v1.Entitlement entitlements = 1;</code>
   */
  java.util.List<com.google.cloud.privilegedaccessmanager.v1.Entitlement> getEntitlementsList();
  /**
   *
   *
   * <pre>
   * The list of entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.privilegedaccessmanager.v1.Entitlement entitlements = 1;</code>
   */
  com.google.cloud.privilegedaccessmanager.v1.Entitlement getEntitlements(int index);
  /**
   *
   *
   * <pre>
   * The list of entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.privilegedaccessmanager.v1.Entitlement entitlements = 1;</code>
   */
  int getEntitlementsCount();
  /**
   *
   *
   * <pre>
   * The list of entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.privilegedaccessmanager.v1.Entitlement entitlements = 1;</code>
   */
  java.util.List<? extends com.google.cloud.privilegedaccessmanager.v1.EntitlementOrBuilder>
      getEntitlementsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.privilegedaccessmanager.v1.Entitlement entitlements = 1;</code>
   */
  com.google.cloud.privilegedaccessmanager.v1.EntitlementOrBuilder getEntitlementsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}

/*
 * Copyright 2020 Google LLC
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
// source: google/appengine/v1/domain.proto

package com.google.appengine.v1;

public interface AuthorizedDomainOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.AuthorizedDomain)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full path to the `AuthorizedDomain` resource in the API. Example:
   * `apps/myapp/authorizedDomains/example.com`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Full path to the `AuthorizedDomain` resource in the API. Example:
   * `apps/myapp/authorizedDomains/example.com`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Fully qualified domain name of the domain authorized for use. Example:
   * `example.com`.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Fully qualified domain name of the domain authorized for use. Example:
   * `example.com`.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();
}
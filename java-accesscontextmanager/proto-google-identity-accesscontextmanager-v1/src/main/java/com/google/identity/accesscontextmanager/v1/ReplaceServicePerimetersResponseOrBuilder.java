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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

// Protobuf Java Version: 3.25.2
package com.google.identity.accesscontextmanager.v1;

public interface ReplaceServicePerimetersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.ReplaceServicePerimetersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;
   * </code>
   */
  java.util.List<com.google.identity.accesscontextmanager.v1.ServicePerimeter>
      getServicePerimetersList();
  /**
   *
   *
   * <pre>
   * List of the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeter getServicePerimeters(int index);
  /**
   *
   *
   * <pre>
   * List of the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;
   * </code>
   */
  int getServicePerimetersCount();
  /**
   *
   *
   * <pre>
   * List of the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;
   * </code>
   */
  java.util.List<? extends com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder>
      getServicePerimetersOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder
      getServicePerimetersOrBuilder(int index);
}

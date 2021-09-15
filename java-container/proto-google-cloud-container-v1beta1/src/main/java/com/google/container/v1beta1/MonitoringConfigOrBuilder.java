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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface MonitoringConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.MonitoringConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   *
   * @return Whether the componentConfig field is set.
   */
  boolean hasComponentConfig();
  /**
   *
   *
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   *
   * @return The componentConfig.
   */
  com.google.container.v1beta1.MonitoringComponentConfig getComponentConfig();
  /**
   *
   *
   * <pre>
   * Monitoring components configuration
   * </pre>
   *
   * <code>.google.container.v1beta1.MonitoringComponentConfig component_config = 1;</code>
   */
  com.google.container.v1beta1.MonitoringComponentConfigOrBuilder getComponentConfigOrBuilder();
}

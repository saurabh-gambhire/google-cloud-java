// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/table_spec.proto

package com.google.cloud.datacatalog.v1beta1;

public interface ViewSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.ViewSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The query that defines the table view.
   * </pre>
   *
   * <code>string view_query = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The viewQuery.
   */
  java.lang.String getViewQuery();
  /**
   * <pre>
   * Output only. The query that defines the table view.
   * </pre>
   *
   * <code>string view_query = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for viewQuery.
   */
  com.google.protobuf.ByteString
      getViewQueryBytes();
}
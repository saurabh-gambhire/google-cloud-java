// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1beta/data.proto

package com.google.analytics.data.v1beta;

public interface FilterExpressionListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.FilterExpressionList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.FilterExpression expressions = 1;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.FilterExpression> 
      getExpressionsList();
  /**
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.FilterExpression expressions = 1;</code>
   */
  com.google.analytics.data.v1beta.FilterExpression getExpressions(int index);
  /**
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.FilterExpression expressions = 1;</code>
   */
  int getExpressionsCount();
  /**
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.FilterExpression expressions = 1;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.FilterExpressionOrBuilder> 
      getExpressionsOrBuilderList();
  /**
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.FilterExpression expressions = 1;</code>
   */
  com.google.analytics.data.v1beta.FilterExpressionOrBuilder getExpressionsOrBuilder(
      int index);
}
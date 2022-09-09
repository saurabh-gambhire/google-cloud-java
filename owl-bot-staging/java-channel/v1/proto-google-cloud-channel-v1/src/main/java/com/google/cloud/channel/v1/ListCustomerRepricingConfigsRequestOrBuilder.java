// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ListCustomerRepricingConfigsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListCustomerRepricingConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the customer.
   * Parent uses the format: accounts/{account_id}/customers/{customer_id}.
   * Supports accounts/{account_id}/customers/- to retrieve configs for all
   * customers.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the customer.
   * Parent uses the format: accounts/{account_id}/customers/{customer_id}.
   * Supports accounts/{account_id}/customers/- to retrieve configs for all
   * customers.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The maximum number of repricing configs to return. The service may return
   * fewer than this value. If unspecified, returns a maximum of 50 rules. The
   * maximum value is 100; values above 100 will be coerced to 100.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A token identifying a page of results beyond the first page.
   * Obtained through
   * [ListCustomerRepricingConfigsResponse.next_page_token][google.cloud.channel.v1.ListCustomerRepricingConfigsResponse.next_page_token] of the previous
   * [CloudChannelService.ListCustomerRepricingConfigs][google.cloud.channel.v1.CloudChannelService.ListCustomerRepricingConfigs] call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A token identifying a page of results beyond the first page.
   * Obtained through
   * [ListCustomerRepricingConfigsResponse.next_page_token][google.cloud.channel.v1.ListCustomerRepricingConfigsResponse.next_page_token] of the previous
   * [CloudChannelService.ListCustomerRepricingConfigs][google.cloud.channel.v1.CloudChannelService.ListCustomerRepricingConfigs] call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. A filter for [CloudChannelService.ListCustomerRepricingConfigs]
   * results (customer only). You can use this filter when you support
   * a BatchGet-like query.
   * To use the filter, you must set `parent=accounts/{account_id}/customers/-`.
   * Example: customer = accounts/account_id/customers/c1 OR
   * customer = accounts/account_id/customers/c2.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. A filter for [CloudChannelService.ListCustomerRepricingConfigs]
   * results (customer only). You can use this filter when you support
   * a BatchGet-like query.
   * To use the filter, you must set `parent=accounts/{account_id}/customers/-`.
   * Example: customer = accounts/account_id/customers/c1 OR
   * customer = accounts/account_id/customers/c2.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
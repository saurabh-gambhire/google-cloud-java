// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface CreateCustomerRepricingConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.CreateCustomerRepricingConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the customer that will receive this repricing config.
   * Parent uses the format: accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the customer that will receive this repricing config.
   * Parent uses the format: accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customerRepricingConfig field is set.
   */
  boolean hasCustomerRepricingConfig();
  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerRepricingConfig.
   */
  com.google.cloud.channel.v1.CustomerRepricingConfig getCustomerRepricingConfig();
  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder getCustomerRepricingConfigOrBuilder();
}
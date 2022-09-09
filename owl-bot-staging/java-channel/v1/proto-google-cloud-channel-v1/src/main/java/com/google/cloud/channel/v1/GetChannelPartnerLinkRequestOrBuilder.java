// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface GetChannelPartnerLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.GetChannelPartnerLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the channel partner link to retrieve.
   * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
   * where {id} is the Cloud Identity ID of the partner.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the channel partner link to retrieve.
   * Name uses the format: accounts/{account_id}/channelPartnerLinks/{id}
   * where {id} is the Cloud Identity ID of the partner.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The level of granularity the ChannelPartnerLink will display.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Optional. The level of granularity the ChannelPartnerLink will display.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ChannelPartnerLinkView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  com.google.cloud.channel.v1.ChannelPartnerLinkView getView();
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

public interface ListGoogleAdsLinksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.ListGoogleAdsLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.GoogleAdsLink google_ads_links = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1beta.GoogleAdsLink> 
      getGoogleAdsLinksList();
  /**
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.GoogleAdsLink google_ads_links = 1;</code>
   */
  com.google.analytics.admin.v1beta.GoogleAdsLink getGoogleAdsLinks(int index);
  /**
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.GoogleAdsLink google_ads_links = 1;</code>
   */
  int getGoogleAdsLinksCount();
  /**
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.GoogleAdsLink google_ads_links = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1beta.GoogleAdsLinkOrBuilder> 
      getGoogleAdsLinksOrBuilderList();
  /**
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.GoogleAdsLink google_ads_links = 1;</code>
   */
  com.google.analytics.admin.v1beta.GoogleAdsLinkOrBuilder getGoogleAdsLinksOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
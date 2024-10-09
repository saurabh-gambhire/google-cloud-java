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
// source: google/cloud/retail/v2alpha/search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

public interface SearchResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.SearchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of matched items. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.SearchResult results = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.SearchResponse.SearchResult> getResultsList();
  /**
   *
   *
   * <pre>
   * A list of matched items. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.SearchResult results = 1;</code>
   */
  com.google.cloud.retail.v2alpha.SearchResponse.SearchResult getResults(int index);
  /**
   *
   *
   * <pre>
   * A list of matched items. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.SearchResult results = 1;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * A list of matched items. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.SearchResult results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.SearchResponse.SearchResultOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of matched items. The order represents the ranking.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.SearchResult results = 1;</code>
   */
  com.google.cloud.retail.v2alpha.SearchResponse.SearchResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.Facet facets = 2;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.SearchResponse.Facet> getFacetsList();
  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.Facet facets = 2;</code>
   */
  com.google.cloud.retail.v2alpha.SearchResponse.Facet getFacets(int index);
  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.Facet facets = 2;</code>
   */
  int getFacetsCount();
  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.Facet facets = 2;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.SearchResponse.FacetOrBuilder>
      getFacetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Results of facets requested by user.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.SearchResponse.Facet facets = 2;</code>
   */
  com.google.cloud.retail.v2alpha.SearchResponse.FacetOrBuilder getFacetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The estimated total count of matched items irrespective of pagination. The
   * count of [results][google.cloud.retail.v2alpha.SearchResponse.results]
   * returned by pagination may be less than the
   * [total_size][google.cloud.retail.v2alpha.SearchResponse.total_size] that
   * matches.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();

  /**
   *
   *
   * <pre>
   * Contains the spell corrected query, if found. If the spell correction type
   * is AUTOMATIC, then the search results are based on corrected_query.
   * Otherwise the original query is used for search.
   * </pre>
   *
   * <code>string corrected_query = 4;</code>
   *
   * @return The correctedQuery.
   */
  java.lang.String getCorrectedQuery();
  /**
   *
   *
   * <pre>
   * Contains the spell corrected query, if found. If the spell correction type
   * is AUTOMATIC, then the search results are based on corrected_query.
   * Otherwise the original query is used for search.
   * </pre>
   *
   * <code>string corrected_query = 4;</code>
   *
   * @return The bytes for correctedQuery.
   */
  com.google.protobuf.ByteString getCorrectedQueryBytes();

  /**
   *
   *
   * <pre>
   * A unique search token. This should be included in the
   * [UserEvent][google.cloud.retail.v2alpha.UserEvent] logs resulting from this
   * search, which enables accurate attribution of search model performance.
   * </pre>
   *
   * <code>string attribution_token = 5;</code>
   *
   * @return The attributionToken.
   */
  java.lang.String getAttributionToken();
  /**
   *
   *
   * <pre>
   * A unique search token. This should be included in the
   * [UserEvent][google.cloud.retail.v2alpha.UserEvent] logs resulting from this
   * search, which enables accurate attribution of search model performance.
   * </pre>
   *
   * <code>string attribution_token = 5;</code>
   *
   * @return The bytes for attributionToken.
   */
  com.google.protobuf.ByteString getAttributionTokenBytes();

  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [SearchRequest.page_token][google.cloud.retail.v2alpha.SearchRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 6;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [SearchRequest.page_token][google.cloud.retail.v2alpha.SearchRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 6;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Query expansion information for the returned results.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.SearchResponse.QueryExpansionInfo query_expansion_info = 7;
   * </code>
   *
   * @return Whether the queryExpansionInfo field is set.
   */
  boolean hasQueryExpansionInfo();
  /**
   *
   *
   * <pre>
   * Query expansion information for the returned results.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.SearchResponse.QueryExpansionInfo query_expansion_info = 7;
   * </code>
   *
   * @return The queryExpansionInfo.
   */
  com.google.cloud.retail.v2alpha.SearchResponse.QueryExpansionInfo getQueryExpansionInfo();
  /**
   *
   *
   * <pre>
   * Query expansion information for the returned results.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.SearchResponse.QueryExpansionInfo query_expansion_info = 7;
   * </code>
   */
  com.google.cloud.retail.v2alpha.SearchResponse.QueryExpansionInfoOrBuilder
      getQueryExpansionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The URI of a customer-defined redirect page. If redirect action is
   * triggered, no search is performed, and only
   * [redirect_uri][google.cloud.retail.v2alpha.SearchResponse.redirect_uri] and
   * [attribution_token][google.cloud.retail.v2alpha.SearchResponse.attribution_token]
   * are set in the response.
   * </pre>
   *
   * <code>string redirect_uri = 10;</code>
   *
   * @return The redirectUri.
   */
  java.lang.String getRedirectUri();
  /**
   *
   *
   * <pre>
   * The URI of a customer-defined redirect page. If redirect action is
   * triggered, no search is performed, and only
   * [redirect_uri][google.cloud.retail.v2alpha.SearchResponse.redirect_uri] and
   * [attribution_token][google.cloud.retail.v2alpha.SearchResponse.attribution_token]
   * are set in the response.
   * </pre>
   *
   * <code>string redirect_uri = 10;</code>
   *
   * @return The bytes for redirectUri.
   */
  com.google.protobuf.ByteString getRedirectUriBytes();

  /**
   *
   *
   * <pre>
   * The fully qualified resource name of applied
   * [controls](https://cloud.google.com/retail/docs/serving-control-rules).
   * </pre>
   *
   * <code>repeated string applied_controls = 12;</code>
   *
   * @return A list containing the appliedControls.
   */
  java.util.List<java.lang.String> getAppliedControlsList();
  /**
   *
   *
   * <pre>
   * The fully qualified resource name of applied
   * [controls](https://cloud.google.com/retail/docs/serving-control-rules).
   * </pre>
   *
   * <code>repeated string applied_controls = 12;</code>
   *
   * @return The count of appliedControls.
   */
  int getAppliedControlsCount();
  /**
   *
   *
   * <pre>
   * The fully qualified resource name of applied
   * [controls](https://cloud.google.com/retail/docs/serving-control-rules).
   * </pre>
   *
   * <code>repeated string applied_controls = 12;</code>
   *
   * @param index The index of the element to return.
   * @return The appliedControls at the given index.
   */
  java.lang.String getAppliedControls(int index);
  /**
   *
   *
   * <pre>
   * The fully qualified resource name of applied
   * [controls](https://cloud.google.com/retail/docs/serving-control-rules).
   * </pre>
   *
   * <code>repeated string applied_controls = 12;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the appliedControls at the given index.
   */
  com.google.protobuf.ByteString getAppliedControlsBytes(int index);

  /**
   *
   *
   * <pre>
   * The invalid
   * [SearchRequest.BoostSpec.condition_boost_specs][google.cloud.retail.v2alpha.SearchRequest.BoostSpec.condition_boost_specs]
   * that are not applied during serving.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpec invalid_condition_boost_specs = 14;
   * </code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpec>
      getInvalidConditionBoostSpecsList();
  /**
   *
   *
   * <pre>
   * The invalid
   * [SearchRequest.BoostSpec.condition_boost_specs][google.cloud.retail.v2alpha.SearchRequest.BoostSpec.condition_boost_specs]
   * that are not applied during serving.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpec invalid_condition_boost_specs = 14;
   * </code>
   */
  com.google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpec
      getInvalidConditionBoostSpecs(int index);
  /**
   *
   *
   * <pre>
   * The invalid
   * [SearchRequest.BoostSpec.condition_boost_specs][google.cloud.retail.v2alpha.SearchRequest.BoostSpec.condition_boost_specs]
   * that are not applied during serving.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpec invalid_condition_boost_specs = 14;
   * </code>
   */
  int getInvalidConditionBoostSpecsCount();
  /**
   *
   *
   * <pre>
   * The invalid
   * [SearchRequest.BoostSpec.condition_boost_specs][google.cloud.retail.v2alpha.SearchRequest.BoostSpec.condition_boost_specs]
   * that are not applied during serving.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpec invalid_condition_boost_specs = 14;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpecOrBuilder>
      getInvalidConditionBoostSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The invalid
   * [SearchRequest.BoostSpec.condition_boost_specs][google.cloud.retail.v2alpha.SearchRequest.BoostSpec.condition_boost_specs]
   * that are not applied during serving.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpec invalid_condition_boost_specs = 14;
   * </code>
   */
  com.google.cloud.retail.v2alpha.SearchRequest.BoostSpec.ConditionBoostSpecOrBuilder
      getInvalidConditionBoostSpecsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Metadata related to A/B testing
   * [Experiment][google.cloud.retail.v2alpha.Experiment] associated with this
   * response. Only exists when an experiment is triggered.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ExperimentInfo experiment_info = 17;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.ExperimentInfo> getExperimentInfoList();
  /**
   *
   *
   * <pre>
   * Metadata related to A/B testing
   * [Experiment][google.cloud.retail.v2alpha.Experiment] associated with this
   * response. Only exists when an experiment is triggered.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ExperimentInfo experiment_info = 17;</code>
   */
  com.google.cloud.retail.v2alpha.ExperimentInfo getExperimentInfo(int index);
  /**
   *
   *
   * <pre>
   * Metadata related to A/B testing
   * [Experiment][google.cloud.retail.v2alpha.Experiment] associated with this
   * response. Only exists when an experiment is triggered.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ExperimentInfo experiment_info = 17;</code>
   */
  int getExperimentInfoCount();
  /**
   *
   *
   * <pre>
   * Metadata related to A/B testing
   * [Experiment][google.cloud.retail.v2alpha.Experiment] associated with this
   * response. Only exists when an experiment is triggered.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ExperimentInfo experiment_info = 17;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.ExperimentInfoOrBuilder>
      getExperimentInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Metadata related to A/B testing
   * [Experiment][google.cloud.retail.v2alpha.Experiment] associated with this
   * response. Only exists when an experiment is triggered.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ExperimentInfo experiment_info = 17;</code>
   */
  com.google.cloud.retail.v2alpha.ExperimentInfoOrBuilder getExperimentInfoOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * This field specifies all related information that is needed on client
   * side for UI rendering of conversational retail search.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.SearchResponse.ConversationalSearchResult conversational_search_result = 18;
   * </code>
   *
   * @return Whether the conversationalSearchResult field is set.
   */
  boolean hasConversationalSearchResult();
  /**
   *
   *
   * <pre>
   * This field specifies all related information that is needed on client
   * side for UI rendering of conversational retail search.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.SearchResponse.ConversationalSearchResult conversational_search_result = 18;
   * </code>
   *
   * @return The conversationalSearchResult.
   */
  com.google.cloud.retail.v2alpha.SearchResponse.ConversationalSearchResult
      getConversationalSearchResult();
  /**
   *
   *
   * <pre>
   * This field specifies all related information that is needed on client
   * side for UI rendering of conversational retail search.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.SearchResponse.ConversationalSearchResult conversational_search_result = 18;
   * </code>
   */
  com.google.cloud.retail.v2alpha.SearchResponse.ConversationalSearchResultOrBuilder
      getConversationalSearchResultOrBuilder();

  /**
   *
   *
   * <pre>
   * This field specifies all related information for tile navigation that will
   * be used in client side.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.SearchResponse.TileNavigationResult tile_navigation_result = 19;
   * </code>
   *
   * @return Whether the tileNavigationResult field is set.
   */
  boolean hasTileNavigationResult();
  /**
   *
   *
   * <pre>
   * This field specifies all related information for tile navigation that will
   * be used in client side.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.SearchResponse.TileNavigationResult tile_navigation_result = 19;
   * </code>
   *
   * @return The tileNavigationResult.
   */
  com.google.cloud.retail.v2alpha.SearchResponse.TileNavigationResult getTileNavigationResult();
  /**
   *
   *
   * <pre>
   * This field specifies all related information for tile navigation that will
   * be used in client side.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.SearchResponse.TileNavigationResult tile_navigation_result = 19;
   * </code>
   */
  com.google.cloud.retail.v2alpha.SearchResponse.TileNavigationResultOrBuilder
      getTileNavigationResultOrBuilder();
}

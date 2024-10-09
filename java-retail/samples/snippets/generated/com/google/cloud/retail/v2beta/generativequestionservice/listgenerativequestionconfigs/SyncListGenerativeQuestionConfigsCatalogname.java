/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_GenerativeQuestionService_ListGenerativeQuestionConfigs_Catalogname_sync]
import com.google.cloud.retail.v2beta.CatalogName;
import com.google.cloud.retail.v2beta.GenerativeQuestionServiceClient;
import com.google.cloud.retail.v2beta.ListGenerativeQuestionConfigsResponse;

public class SyncListGenerativeQuestionConfigsCatalogname {

  public static void main(String[] args) throws Exception {
    syncListGenerativeQuestionConfigsCatalogname();
  }

  public static void syncListGenerativeQuestionConfigsCatalogname() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GenerativeQuestionServiceClient generativeQuestionServiceClient =
        GenerativeQuestionServiceClient.create()) {
      CatalogName parent = CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]");
      ListGenerativeQuestionConfigsResponse response =
          generativeQuestionServiceClient.listGenerativeQuestionConfigs(parent);
    }
  }
}
// [END retail_v2beta_generated_GenerativeQuestionService_ListGenerativeQuestionConfigs_Catalogname_sync]

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

package com.google.cloud.webrisk.v1beta1.samples;

// [START webrisk_v1beta1_generated_WebRiskServiceV1Beta1_SearchUris_StringListthreattype_sync]
import com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Client;
import com.google.webrisk.v1beta1.SearchUrisResponse;
import com.google.webrisk.v1beta1.ThreatType;
import java.util.ArrayList;
import java.util.List;

public class SyncSearchUrisStringListthreattype {

  public static void main(String[] args) throws Exception {
    syncSearchUrisStringListthreattype();
  }

  public static void syncSearchUrisStringListthreattype() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WebRiskServiceV1Beta1Client webRiskServiceV1Beta1Client =
        WebRiskServiceV1Beta1Client.create()) {
      String uri = "uri116076";
      List<ThreatType> threatTypes = new ArrayList<>();
      SearchUrisResponse response = webRiskServiceV1Beta1Client.searchUris(uri, threatTypes);
    }
  }
}
// [END webrisk_v1beta1_generated_WebRiskServiceV1Beta1_SearchUris_StringListthreattype_sync]

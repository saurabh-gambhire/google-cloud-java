/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.websecurityscanner.v1alpha.samples;

// [START websecurityscanner_v1alpha_generated_websecurityscannerclient_listscanruns_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.websecurityscanner.v1alpha.ListScanRunsRequest;
import com.google.cloud.websecurityscanner.v1alpha.ScanConfigName;
import com.google.cloud.websecurityscanner.v1alpha.ScanRun;
import com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient;

public class AsyncListScanRuns {

  public static void main(String[] args) throws Exception {
    asyncListScanRuns();
  }

  public static void asyncListScanRuns() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      ListScanRunsRequest request =
          ListScanRunsRequest.newBuilder()
              .setParent(ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]").toString())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      ApiFuture<ScanRun> future =
          webSecurityScannerClient.listScanRunsPagedCallable().futureCall(request);
      // Do something.
      for (ScanRun element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END websecurityscanner_v1alpha_generated_websecurityscannerclient_listscanruns_async]
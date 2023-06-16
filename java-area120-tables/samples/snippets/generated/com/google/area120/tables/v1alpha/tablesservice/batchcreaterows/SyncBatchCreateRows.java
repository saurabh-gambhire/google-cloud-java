/*
 * Copyright 2023 Google LLC
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

package com.google.area120.tables.v1alpha.samples;

// [START area120tables_v1alpha1_generated_TablesService_BatchCreateRows_sync]
import com.google.area120.tables.v1alpha.TablesServiceClient;
import com.google.area120.tables.v1alpha1.BatchCreateRowsRequest;
import com.google.area120.tables.v1alpha1.BatchCreateRowsResponse;
import com.google.area120.tables.v1alpha1.CreateRowRequest;
import java.util.ArrayList;

public class SyncBatchCreateRows {

  public static void main(String[] args) throws Exception {
    syncBatchCreateRows();
  }

  public static void syncBatchCreateRows() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TablesServiceClient tablesServiceClient = TablesServiceClient.create()) {
      BatchCreateRowsRequest request =
          BatchCreateRowsRequest.newBuilder()
              .setParent("parent-995424086")
              .addAllRequests(new ArrayList<CreateRowRequest>())
              .build();
      BatchCreateRowsResponse response = tablesServiceClient.batchCreateRows(request);
    }
  }
}
// [END area120tables_v1alpha1_generated_TablesService_BatchCreateRows_sync]

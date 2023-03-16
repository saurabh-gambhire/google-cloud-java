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

package com.google.cloud.workstations.v1beta.samples;

// [START workstations_v1beta_generated_Workstations_UpdateWorkstationConfig_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.workstations.v1beta.OperationMetadata;
import com.google.cloud.workstations.v1beta.UpdateWorkstationConfigRequest;
import com.google.cloud.workstations.v1beta.WorkstationConfig;
import com.google.cloud.workstations.v1beta.WorkstationsClient;
import com.google.protobuf.FieldMask;

public class AsyncUpdateWorkstationConfigLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateWorkstationConfigLRO();
  }

  public static void asyncUpdateWorkstationConfigLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WorkstationsClient workstationsClient = WorkstationsClient.create()) {
      UpdateWorkstationConfigRequest request =
          UpdateWorkstationConfigRequest.newBuilder()
              .setWorkstationConfig(WorkstationConfig.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .setValidateOnly(true)
              .setAllowMissing(true)
              .build();
      OperationFuture<WorkstationConfig, OperationMetadata> future =
          workstationsClient.updateWorkstationConfigOperationCallable().futureCall(request);
      // Do something.
      WorkstationConfig response = future.get();
    }
  }
}
// [END workstations_v1beta_generated_Workstations_UpdateWorkstationConfig_LRO_async]

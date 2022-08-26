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

package com.google.cloud.managedidentities.v1beta1.samples;

// [START managedidentities_v1beta1_generated_managedidentitiesserviceclient_reconfiguretrust_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.managedidentities.v1beta1.DomainName;
import com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceClient;
import com.google.cloud.managedidentities.v1beta1.ReconfigureTrustRequest;
import com.google.longrunning.Operation;
import java.util.ArrayList;

public class AsyncReconfigureTrust {

  public static void main(String[] args) throws Exception {
    asyncReconfigureTrust();
  }

  public static void asyncReconfigureTrust() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ManagedIdentitiesServiceClient managedIdentitiesServiceClient =
        ManagedIdentitiesServiceClient.create()) {
      ReconfigureTrustRequest request =
          ReconfigureTrustRequest.newBuilder()
              .setName(DomainName.of("[PROJECT]", "[LOCATION]", "[DOMAIN]").toString())
              .setTargetDomainName("targetDomainName2065239520")
              .addAllTargetDnsIpAddresses(new ArrayList<String>())
              .build();
      ApiFuture<Operation> future =
          managedIdentitiesServiceClient.reconfigureTrustCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END managedidentities_v1beta1_generated_managedidentitiesserviceclient_reconfiguretrust_async]
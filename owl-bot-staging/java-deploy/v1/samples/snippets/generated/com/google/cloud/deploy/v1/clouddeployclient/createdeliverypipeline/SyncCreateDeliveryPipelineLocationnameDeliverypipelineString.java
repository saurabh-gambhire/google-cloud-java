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

package com.google.cloud.deploy.v1.samples;

// [START deploy_v1_generated_clouddeployclient_createdeliverypipeline_locationnamedeliverypipelinestring_sync]
import com.google.cloud.deploy.v1.CloudDeployClient;
import com.google.cloud.deploy.v1.DeliveryPipeline;
import com.google.cloud.deploy.v1.LocationName;

public class SyncCreateDeliveryPipelineLocationnameDeliverypipelineString {

  public static void main(String[] args) throws Exception {
    syncCreateDeliveryPipelineLocationnameDeliverypipelineString();
  }

  public static void syncCreateDeliveryPipelineLocationnameDeliverypipelineString()
      throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudDeployClient cloudDeployClient = CloudDeployClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      DeliveryPipeline deliveryPipeline = DeliveryPipeline.newBuilder().build();
      String deliveryPipelineId = "deliveryPipelineId-632411535";
      DeliveryPipeline response =
          cloudDeployClient
              .createDeliveryPipelineAsync(parent, deliveryPipeline, deliveryPipelineId)
              .get();
    }
  }
}
// [END deploy_v1_generated_clouddeployclient_createdeliverypipeline_locationnamedeliverypipelinestring_sync]
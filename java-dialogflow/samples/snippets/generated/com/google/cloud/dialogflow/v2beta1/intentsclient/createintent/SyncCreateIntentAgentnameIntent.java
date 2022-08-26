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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_intentsclient_createintent_agentnameintent_sync]
import com.google.cloud.dialogflow.v2beta1.AgentName;
import com.google.cloud.dialogflow.v2beta1.Intent;
import com.google.cloud.dialogflow.v2beta1.IntentsClient;

public class SyncCreateIntentAgentnameIntent {

  public static void main(String[] args) throws Exception {
    syncCreateIntentAgentnameIntent();
  }

  public static void syncCreateIntentAgentnameIntent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (IntentsClient intentsClient = IntentsClient.create()) {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      Intent intent = Intent.newBuilder().build();
      Intent response = intentsClient.createIntent(parent, intent);
    }
  }
}
// [END dialogflow_v2beta1_generated_intentsclient_createintent_agentnameintent_sync]
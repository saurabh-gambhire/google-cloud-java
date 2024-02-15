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

package com.google.cloud.vision.v1.samples;

// [START vision_v1_generated_ProductSearch_AddProductToProductSet_sync]
import com.google.cloud.vision.v1.AddProductToProductSetRequest;
import com.google.cloud.vision.v1.ProductName;
import com.google.cloud.vision.v1.ProductSearchClient;
import com.google.cloud.vision.v1.ProductSetName;
import com.google.protobuf.Empty;

public class SyncAddProductToProductSet {

  public static void main(String[] args) throws Exception {
    syncAddProductToProductSet();
  }

  public static void syncAddProductToProductSet() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
      AddProductToProductSetRequest request =
          AddProductToProductSetRequest.newBuilder()
              .setName(ProductSetName.of("[PROJECT]", "[LOCATION]", "[PRODUCT_SET]").toString())
              .setProduct(ProductName.of("[PROJECT]", "[LOCATION]", "[PRODUCT]").toString())
              .build();
      productSearchClient.addProductToProductSet(request);
    }
  }
}
// [END vision_v1_generated_ProductSearch_AddProductToProductSet_sync]

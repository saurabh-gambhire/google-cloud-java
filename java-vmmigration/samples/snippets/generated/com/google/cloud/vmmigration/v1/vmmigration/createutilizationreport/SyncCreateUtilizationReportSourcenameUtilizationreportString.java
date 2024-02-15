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

package com.google.cloud.vmmigration.v1.samples;

// [START vmmigration_v1_generated_VmMigration_CreateUtilizationReport_SourcenameUtilizationreportString_sync]
import com.google.cloud.vmmigration.v1.SourceName;
import com.google.cloud.vmmigration.v1.UtilizationReport;
import com.google.cloud.vmmigration.v1.VmMigrationClient;

public class SyncCreateUtilizationReportSourcenameUtilizationreportString {

  public static void main(String[] args) throws Exception {
    syncCreateUtilizationReportSourcenameUtilizationreportString();
  }

  public static void syncCreateUtilizationReportSourcenameUtilizationreportString()
      throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VmMigrationClient vmMigrationClient = VmMigrationClient.create()) {
      SourceName parent = SourceName.of("[PROJECT]", "[LOCATION]", "[SOURCE]");
      UtilizationReport utilizationReport = UtilizationReport.newBuilder().build();
      String utilizationReportId = "utilizationReportId1215771057";
      UtilizationReport response =
          vmMigrationClient
              .createUtilizationReportAsync(parent, utilizationReport, utilizationReportId)
              .get();
    }
  }
}
// [END vmmigration_v1_generated_VmMigration_CreateUtilizationReport_SourcenameUtilizationreportString_sync]

/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/text_sentiment.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public final class TextSentimentPredictionInstanceProto {
  private TextSentimentPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextSentimentPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextSentimentPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/instance/text_sentiment.proto\0227"
          + "google.cloud.aiplatform.v1beta1.schema.p"
          + "redict.instance\"E\n\037TextSentimentPredicti"
          + "onInstance\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_type"
          + "\030\002 \001(\tB\362\002\n;com.google.cloud.aiplatform.v"
          + "1beta1.schema.predict.instanceB$TextSent"
          + "imentPredictionInstanceProtoP\001ZWcloud.go"
          + "ogle.com/go/aiplatform/apiv1beta1/schema"
          + "/predict/instance/instancepb;instancepb\252"
          + "\0027Google.Cloud.AIPlatform.V1Beta1.Schema"
          + ".Predict.Instance\312\0027Google\\Cloud\\AIPlatf"
          + "orm\\V1beta1\\Schema\\Predict\\Instance\352\002=Go"
          + "ogle::Cloud::AIPlatform::V1beta1::Schema"
          + "::Predict::Instanceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextSentimentPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextSentimentPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextSentimentPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

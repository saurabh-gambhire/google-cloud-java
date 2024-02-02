/*
 * Copyright 2024 Google LLC
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
// source: google/devtools/artifactregistry/v1/artifact.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.artifactregistry.v1;

public interface DockerImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.DockerImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. registry_location, project_id, repository_name and image id forms
   * a unique image
   * name:`projects/&lt;project_id&gt;/locations/&lt;location&gt;/repository/&lt;repository_name&gt;/dockerImages/&lt;docker_image&gt;`.
   * For example,
   * "projects/test-project/locations/us-west4/repositories/test-repo/dockerImages/
   * nginx&#64;sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf",
   * where "us-west4" is the registry_location, "test-project" is the
   * project_id, "test-repo" is the repository_name and
   * "nginx&#64;sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf"
   * is the image's digest.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. registry_location, project_id, repository_name and image id forms
   * a unique image
   * name:`projects/&lt;project_id&gt;/locations/&lt;location&gt;/repository/&lt;repository_name&gt;/dockerImages/&lt;docker_image&gt;`.
   * For example,
   * "projects/test-project/locations/us-west4/repositories/test-repo/dockerImages/
   * nginx&#64;sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf",
   * where "us-west4" is the registry_location, "test-project" is the
   * project_id, "test-repo" is the repository_name and
   * "nginx&#64;sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf"
   * is the image's digest.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. URL to access the image.
   * Example:
   * us-west4-docker.pkg.dev/test-project/test-repo/nginx&#64;sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Required. URL to access the image.
   * Example:
   * us-west4-docker.pkg.dev/test-project/test-repo/nginx&#64;sha256:e9954c1fc875017be1c3e36eca16be2d9e9bccc4bf072163515467d6a823c7cf
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Tags attached to this image.
   * </pre>
   *
   * <code>repeated string tags = 3;</code>
   *
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * Tags attached to this image.
   * </pre>
   *
   * <code>repeated string tags = 3;</code>
   *
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Tags attached to this image.
   * </pre>
   *
   * <code>repeated string tags = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * Tags attached to this image.
   * </pre>
   *
   * <code>repeated string tags = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Calculated size of the image.
   * This field is returned as the 'metadata.imageSizeBytes' field in the
   * Version resource.
   * </pre>
   *
   * <code>int64 image_size_bytes = 4;</code>
   *
   * @return The imageSizeBytes.
   */
  long getImageSizeBytes();

  /**
   *
   *
   * <pre>
   * Time the image was uploaded.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp upload_time = 5;</code>
   *
   * @return Whether the uploadTime field is set.
   */
  boolean hasUploadTime();
  /**
   *
   *
   * <pre>
   * Time the image was uploaded.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp upload_time = 5;</code>
   *
   * @return The uploadTime.
   */
  com.google.protobuf.Timestamp getUploadTime();
  /**
   *
   *
   * <pre>
   * Time the image was uploaded.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp upload_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUploadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Media type of this image, e.g.
   * "application/vnd.docker.distribution.manifest.v2+json".
   * This field is returned as the 'metadata.mediaType' field in the
   * Version resource.
   * </pre>
   *
   * <code>string media_type = 6;</code>
   *
   * @return The mediaType.
   */
  java.lang.String getMediaType();
  /**
   *
   *
   * <pre>
   * Media type of this image, e.g.
   * "application/vnd.docker.distribution.manifest.v2+json".
   * This field is returned as the 'metadata.mediaType' field in the
   * Version resource.
   * </pre>
   *
   * <code>string media_type = 6;</code>
   *
   * @return The bytes for mediaType.
   */
  com.google.protobuf.ByteString getMediaTypeBytes();

  /**
   *
   *
   * <pre>
   * The time this image was built.
   * This field is returned as the 'metadata.buildTime' field in the
   * Version resource.
   * The build time is returned to the client as an RFC 3339 string, which can
   * be easily used with the JavaScript Date constructor.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_time = 7;</code>
   *
   * @return Whether the buildTime field is set.
   */
  boolean hasBuildTime();
  /**
   *
   *
   * <pre>
   * The time this image was built.
   * This field is returned as the 'metadata.buildTime' field in the
   * Version resource.
   * The build time is returned to the client as an RFC 3339 string, which can
   * be easily used with the JavaScript Date constructor.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_time = 7;</code>
   *
   * @return The buildTime.
   */
  com.google.protobuf.Timestamp getBuildTime();
  /**
   *
   *
   * <pre>
   * The time this image was built.
   * This field is returned as the 'metadata.buildTime' field in the
   * Version resource.
   * The build time is returned to the client as an RFC 3339 string, which can
   * be easily used with the JavaScript Date constructor.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp build_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getBuildTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the docker image was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the docker image was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the docker image was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}

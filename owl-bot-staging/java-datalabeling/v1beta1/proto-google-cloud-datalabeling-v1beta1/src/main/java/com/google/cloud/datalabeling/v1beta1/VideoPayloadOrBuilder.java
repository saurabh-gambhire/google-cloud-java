// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_payloads.proto

package com.google.cloud.datalabeling.v1beta1;

public interface VideoPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.VideoPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Video format.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   * <pre>
   * Video format.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString
      getMimeTypeBytes();

  /**
   * <pre>
   * Video uri from the user bucket.
   * </pre>
   *
   * <code>string video_uri = 2;</code>
   * @return The videoUri.
   */
  java.lang.String getVideoUri();
  /**
   * <pre>
   * Video uri from the user bucket.
   * </pre>
   *
   * <code>string video_uri = 2;</code>
   * @return The bytes for videoUri.
   */
  com.google.protobuf.ByteString
      getVideoUriBytes();

  /**
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.VideoThumbnail> 
      getVideoThumbnailsList();
  /**
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoThumbnail getVideoThumbnails(int index);
  /**
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  int getVideoThumbnailsCount();
  /**
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.VideoThumbnailOrBuilder> 
      getVideoThumbnailsOrBuilderList();
  /**
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoThumbnailOrBuilder getVideoThumbnailsOrBuilder(
      int index);

  /**
   * <pre>
   * FPS of the video.
   * </pre>
   *
   * <code>float frame_rate = 4;</code>
   * @return The frameRate.
   */
  float getFrameRate();

  /**
   * <pre>
   * Signed uri of the video file in the service bucket.
   * </pre>
   *
   * <code>string signed_uri = 5;</code>
   * @return The signedUri.
   */
  java.lang.String getSignedUri();
  /**
   * <pre>
   * Signed uri of the video file in the service bucket.
   * </pre>
   *
   * <code>string signed_uri = 5;</code>
   * @return The bytes for signedUri.
   */
  com.google.protobuf.ByteString
      getSignedUriBytes();
}
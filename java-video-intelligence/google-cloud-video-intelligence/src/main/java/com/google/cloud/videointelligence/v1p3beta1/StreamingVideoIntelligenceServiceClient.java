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

package com.google.cloud.videointelligence.v1p3beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStub;
import com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service that implements streaming Video Intelligence API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient =
 *     StreamingVideoIntelligenceServiceClient.create()) {
 *   BidiStream<StreamingAnnotateVideoRequest, StreamingAnnotateVideoResponse> bidiStream =
 *       streamingVideoIntelligenceServiceClient.streamingAnnotateVideoCallable().call();
 *   StreamingAnnotateVideoRequest request = StreamingAnnotateVideoRequest.newBuilder().build();
 *   bidiStream.send(request);
 *   for (StreamingAnnotateVideoResponse response : bidiStream) {
 *     // Do something when a response is received.
 *   }
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the StreamingVideoIntelligenceServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> StreamingAnnotateVideo</td>
 *      <td><p> Performs video annotation with bidirectional streaming: emitting results while sending video/audio bytes. This method is only available via the gRPC API (not REST).</td>
 *      <td>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> streamingAnnotateVideoCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * StreamingVideoIntelligenceServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * StreamingVideoIntelligenceServiceSettings streamingVideoIntelligenceServiceSettings =
 *     StreamingVideoIntelligenceServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient =
 *     StreamingVideoIntelligenceServiceClient.create(streamingVideoIntelligenceServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * StreamingVideoIntelligenceServiceSettings streamingVideoIntelligenceServiceSettings =
 *     StreamingVideoIntelligenceServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient =
 *     StreamingVideoIntelligenceServiceClient.create(streamingVideoIntelligenceServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class StreamingVideoIntelligenceServiceClient implements BackgroundResource {
  private final StreamingVideoIntelligenceServiceSettings settings;
  private final StreamingVideoIntelligenceServiceStub stub;

  /** Constructs an instance of StreamingVideoIntelligenceServiceClient with default settings. */
  public static final StreamingVideoIntelligenceServiceClient create() throws IOException {
    return create(StreamingVideoIntelligenceServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of StreamingVideoIntelligenceServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final StreamingVideoIntelligenceServiceClient create(
      StreamingVideoIntelligenceServiceSettings settings) throws IOException {
    return new StreamingVideoIntelligenceServiceClient(settings);
  }

  /**
   * Constructs an instance of StreamingVideoIntelligenceServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(StreamingVideoIntelligenceServiceSettings).
   */
  public static final StreamingVideoIntelligenceServiceClient create(
      StreamingVideoIntelligenceServiceStub stub) {
    return new StreamingVideoIntelligenceServiceClient(stub);
  }

  /**
   * Constructs an instance of StreamingVideoIntelligenceServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected StreamingVideoIntelligenceServiceClient(
      StreamingVideoIntelligenceServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((StreamingVideoIntelligenceServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected StreamingVideoIntelligenceServiceClient(StreamingVideoIntelligenceServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final StreamingVideoIntelligenceServiceSettings getSettings() {
    return settings;
  }

  public StreamingVideoIntelligenceServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Performs video annotation with bidirectional streaming: emitting results while sending
   * video/audio bytes. This method is only available via the gRPC API (not REST).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient =
   *     StreamingVideoIntelligenceServiceClient.create()) {
   *   BidiStream<StreamingAnnotateVideoRequest, StreamingAnnotateVideoResponse> bidiStream =
   *       streamingVideoIntelligenceServiceClient.streamingAnnotateVideoCallable().call();
   *   StreamingAnnotateVideoRequest request = StreamingAnnotateVideoRequest.newBuilder().build();
   *   bidiStream.send(request);
   *   for (StreamingAnnotateVideoResponse response : bidiStream) {
   *     // Do something when a response is received.
   *   }
   * }
   * }</pre>
   */
  public final BidiStreamingCallable<StreamingAnnotateVideoRequest, StreamingAnnotateVideoResponse>
      streamingAnnotateVideoCallable() {
    return stub.streamingAnnotateVideoCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceGroupManagersApplyUpdatesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagersApplyUpdatesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Flag to update all instances instead of specified list of ���instances���. If the flag is set to true then the instances may not be specified in the request.
   * </pre>
   *
   * <code>optional bool all_instances = 403676512;</code>
   * @return Whether the allInstances field is set.
   */
  boolean hasAllInstances();
  /**
   * <pre>
   * Flag to update all instances instead of specified list of ���instances���. If the flag is set to true then the instances may not be specified in the request.
   * </pre>
   *
   * <code>optional bool all_instances = 403676512;</code>
   * @return The allInstances.
   */
  boolean getAllInstances();

  /**
   * <pre>
   * The list of URLs of one or more instances for which you want to apply updates. Each URL can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @return A list containing the instances.
   */
  java.util.List<java.lang.String>
      getInstancesList();
  /**
   * <pre>
   * The list of URLs of one or more instances for which you want to apply updates. Each URL can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @return The count of instances.
   */
  int getInstancesCount();
  /**
   * <pre>
   * The list of URLs of one or more instances for which you want to apply updates. Each URL can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  java.lang.String getInstances(int index);
  /**
   * <pre>
   * The list of URLs of one or more instances for which you want to apply updates. Each URL can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  com.google.protobuf.ByteString
      getInstancesBytes(int index);

  /**
   * <pre>
   * The minimal action that you want to perform on each instance during the update: - REPLACE: At minimum, delete the instance and create it again. - RESTART: Stop the instance and start it again. - REFRESH: Do not stop the instance. - NONE: Do not disrupt the instance at all. By default, the minimum action is NONE. If your update requires a more disruptive action than you set with this flag, the necessary action is performed to execute the update.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   * @return Whether the minimalAction field is set.
   */
  boolean hasMinimalAction();
  /**
   * <pre>
   * The minimal action that you want to perform on each instance during the update: - REPLACE: At minimum, delete the instance and create it again. - RESTART: Stop the instance and start it again. - REFRESH: Do not stop the instance. - NONE: Do not disrupt the instance at all. By default, the minimum action is NONE. If your update requires a more disruptive action than you set with this flag, the necessary action is performed to execute the update.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   * @return The minimalAction.
   */
  java.lang.String getMinimalAction();
  /**
   * <pre>
   * The minimal action that you want to perform on each instance during the update: - REPLACE: At minimum, delete the instance and create it again. - RESTART: Stop the instance and start it again. - REFRESH: Do not stop the instance. - NONE: Do not disrupt the instance at all. By default, the minimum action is NONE. If your update requires a more disruptive action than you set with this flag, the necessary action is performed to execute the update.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   * @return The bytes for minimalAction.
   */
  com.google.protobuf.ByteString
      getMinimalActionBytes();

  /**
   * <pre>
   * The most disruptive action that you want to perform on each instance during the update: - REPLACE: Delete the instance and create it again. - RESTART: Stop the instance and start it again. - REFRESH: Do not stop the instance. - NONE: Do not disrupt the instance at all. By default, the most disruptive allowed action is REPLACE. If your update requires a more disruptive action than you set with this flag, the update request will fail.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   * @return Whether the mostDisruptiveAllowedAction field is set.
   */
  boolean hasMostDisruptiveAllowedAction();
  /**
   * <pre>
   * The most disruptive action that you want to perform on each instance during the update: - REPLACE: Delete the instance and create it again. - RESTART: Stop the instance and start it again. - REFRESH: Do not stop the instance. - NONE: Do not disrupt the instance at all. By default, the most disruptive allowed action is REPLACE. If your update requires a more disruptive action than you set with this flag, the update request will fail.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   * @return The mostDisruptiveAllowedAction.
   */
  java.lang.String getMostDisruptiveAllowedAction();
  /**
   * <pre>
   * The most disruptive action that you want to perform on each instance during the update: - REPLACE: Delete the instance and create it again. - RESTART: Stop the instance and start it again. - REFRESH: Do not stop the instance. - NONE: Do not disrupt the instance at all. By default, the most disruptive allowed action is REPLACE. If your update requires a more disruptive action than you set with this flag, the update request will fail.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   * @return The bytes for mostDisruptiveAllowedAction.
   */
  com.google.protobuf.ByteString
      getMostDisruptiveAllowedActionBytes();
}
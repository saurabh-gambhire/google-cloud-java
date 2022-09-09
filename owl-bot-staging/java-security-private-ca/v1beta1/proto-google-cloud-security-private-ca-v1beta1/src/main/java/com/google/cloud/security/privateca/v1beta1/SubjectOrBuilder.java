// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/privateca/v1beta1/resources.proto

package com.google.cloud.security.privateca.v1beta1;

public interface SubjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.Subject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The country code of the subject.
   * </pre>
   *
   * <code>string country_code = 1;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * The country code of the subject.
   * </pre>
   *
   * <code>string country_code = 1;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * The organization of the subject.
   * </pre>
   *
   * <code>string organization = 2;</code>
   * @return The organization.
   */
  java.lang.String getOrganization();
  /**
   * <pre>
   * The organization of the subject.
   * </pre>
   *
   * <code>string organization = 2;</code>
   * @return The bytes for organization.
   */
  com.google.protobuf.ByteString
      getOrganizationBytes();

  /**
   * <pre>
   * The organizational_unit of the subject.
   * </pre>
   *
   * <code>string organizational_unit = 3;</code>
   * @return The organizationalUnit.
   */
  java.lang.String getOrganizationalUnit();
  /**
   * <pre>
   * The organizational_unit of the subject.
   * </pre>
   *
   * <code>string organizational_unit = 3;</code>
   * @return The bytes for organizationalUnit.
   */
  com.google.protobuf.ByteString
      getOrganizationalUnitBytes();

  /**
   * <pre>
   * The locality or city of the subject.
   * </pre>
   *
   * <code>string locality = 4;</code>
   * @return The locality.
   */
  java.lang.String getLocality();
  /**
   * <pre>
   * The locality or city of the subject.
   * </pre>
   *
   * <code>string locality = 4;</code>
   * @return The bytes for locality.
   */
  com.google.protobuf.ByteString
      getLocalityBytes();

  /**
   * <pre>
   * The province, territory, or regional state of the subject.
   * </pre>
   *
   * <code>string province = 5;</code>
   * @return The province.
   */
  java.lang.String getProvince();
  /**
   * <pre>
   * The province, territory, or regional state of the subject.
   * </pre>
   *
   * <code>string province = 5;</code>
   * @return The bytes for province.
   */
  com.google.protobuf.ByteString
      getProvinceBytes();

  /**
   * <pre>
   * The street address of the subject.
   * </pre>
   *
   * <code>string street_address = 6;</code>
   * @return The streetAddress.
   */
  java.lang.String getStreetAddress();
  /**
   * <pre>
   * The street address of the subject.
   * </pre>
   *
   * <code>string street_address = 6;</code>
   * @return The bytes for streetAddress.
   */
  com.google.protobuf.ByteString
      getStreetAddressBytes();

  /**
   * <pre>
   * The postal code of the subject.
   * </pre>
   *
   * <code>string postal_code = 7;</code>
   * @return The postalCode.
   */
  java.lang.String getPostalCode();
  /**
   * <pre>
   * The postal code of the subject.
   * </pre>
   *
   * <code>string postal_code = 7;</code>
   * @return The bytes for postalCode.
   */
  com.google.protobuf.ByteString
      getPostalCodeBytes();
}
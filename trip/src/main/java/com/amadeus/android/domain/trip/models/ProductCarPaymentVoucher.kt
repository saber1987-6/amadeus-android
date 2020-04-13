/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Details of voucher information indicating prepayment.
 * @property type Indicates what part of the amount the Voucher covers. (e.g. Full credit, partial credit)
 * @property amount Indicates the amount covered in case of partial credit voucher.
 * @property currency Indicates the currency in case of partial credit voucher.
 * @property decimalPlace Indicates the decimal place in case of partial credit voucher.
 * @property billingNumber Reference number of the Billing Account that will be charged for the payment.
 * @property providerReference Unique Identifier created by the Car rental provider to identify this voucher.
 */
@JsonClass(generateAdapter = true)
data class ProductCarPaymentVoucher(
    @Json(name = "type") @field:Json(name = "type") var type: String? = null,
    @Json(name = "amount") @field:Json(name = "amount") var amount: Int? = null,
    @Json(name = "currency") @field:Json(name = "currency") var currency: String? = null,
    @Json(name = "decimalPlace") @field:Json(name = "decimalPlace") var decimalPlace: Int? = null,
    @Json(name = "billingNumber") @field:Json(name = "billingNumber") var billingNumber: String? = null,
    @Json(name = "providerReference") @field:Json(name = "providerReference") var providerReference: String? = null
)
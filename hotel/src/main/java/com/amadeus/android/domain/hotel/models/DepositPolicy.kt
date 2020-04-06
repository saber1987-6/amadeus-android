/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Hotel
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.hotel.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.threeten.bp.ZonedDateTime

/**
 * the deposit/prepay policy information applicable to the offer. It includes accepted payments, deadline and the amount due
 * @property amount Deposit-Prepay amount
 * @property deadline The date and time of the deadline in ISO 8601[https://www.w3.org/TR/NOTE-datetime].   Example: 2010-08-14T13:00:00  Please note that this value is expressed in the hotels local time zone 
 * @property description
 * @property acceptedPayments
 */
@JsonClass(generateAdapter = true)
data class DepositPolicy(
    @Json(name = "amount") @field:Json(name = "amount") var amount: String? = null,
    @Json(name = "deadline") @field:Json(name = "deadline") var deadline: ZonedDateTime? = null,
    @Json(name = "description") @field:Json(name = "description") var description: TextWithLanguageType? = null,
    @Json(name = "acceptedPayments") @field:Json(name = "acceptedPayments") var acceptedPayments: PaymentPolicy? = null
)
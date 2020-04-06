/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Offers Price
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * credit card brand
 * Values: VISA,AMERICAN_EXPRESS,MASTERCARD,VISA_ELECTRON,VISA_DEBIT,MASTERCARD_DEBIT,MAESTRO,DINERS,MASTERCARD_IXARIS,VISA_IXARIS,MASTERCARD_AIRPLUS,UATP_AIRPLUS
 */
@JsonClass(generateAdapter = false)
enum class PaymentBrand(val value: String) {
    @Json(name = "VISA")
    VISA("VISA"),
    @Json(name = "AMERICAN_EXPRESS")
    AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
    @Json(name = "MASTERCARD")
    MASTERCARD("MASTERCARD"),
    @Json(name = "VISA_ELECTRON")
    VISA_ELECTRON("VISA_ELECTRON"),
    @Json(name = "VISA_DEBIT")
    VISA_DEBIT("VISA_DEBIT"),
    @Json(name = "MASTERCARD_DEBIT")
    MASTERCARD_DEBIT("MASTERCARD_DEBIT"),
    @Json(name = "MAESTRO")
    MAESTRO("MAESTRO"),
    @Json(name = "DINERS")
    DINERS("DINERS"),
    @Json(name = "MASTERCARD_IXARIS")
    MASTERCARD_IXARIS("MASTERCARD_IXARIS"),
    @Json(name = "VISA_IXARIS")
    VISA_IXARIS("VISA_IXARIS"),
    @Json(name = "MASTERCARD_AIRPLUS")
    MASTERCARD_AIRPLUS("MASTERCARD_AIRPLUS"),
    @Json(name = "UATP_AIRPLUS")
    UATP_AIRPLUS("UATP_AIRPLUS")
}
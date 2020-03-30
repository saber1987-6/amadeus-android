/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Hotel Booking
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.hotel.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Booking Details
 * @property type Response Type
 * @property id Booking Id
 * @property providerConfirmationId GDS Confirmation Number. If you call the Provider, this Reference may be asked
 * @property self Retrieve Booking Details
 */
@JsonClass(generateAdapter = true)
data class HotelBookingLight(
    @Json(name = "type") @field:Json(name = "type") var type: String,
    @Json(name = "id") @field:Json(name = "id") var id: String,
    @Json(name = "providerConfirmationId") @field:Json(name = "providerConfirmationId") var providerConfirmationId: String,
    @Json(name = "self") @field:Json(name = "self") var self: String? = null
)

/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Seatmap Display
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property cabin Cabin of the seat.
 * @property number Concatenation of the row id and the column id, for example 12B
 * @property characteristicsCodes List of seat characteristics (the characteristic&#39;s names can be retrieved in the seat characteristic dictionary)
 * @property travelerPricing Traveler&#39;s information and price
 * @property coordinates
 */
@JsonClass(generateAdapter = true)
data class Seat(
    @Json(name = "cabin") @field:Json(name = "cabin") var cabin: String? = null,
    @Json(name = "number") @field:Json(name = "number") var number: String? = null,
    @Json(name = "characteristicsCodes") @field:Json(name = "characteristicsCodes") var characteristicsCodes: List<String>? = null,
    @Json(name = "travelerPricing") @field:Json(name = "travelerPricing") var travelerPricing: List<SeatmapTravelerPricing>? = null,
    @Json(name = "coordinates") @field:Json(name = "coordinates") var coordinates: Coordinates? = null
)

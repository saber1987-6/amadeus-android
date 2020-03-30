/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Seat details
 * @property status Status code (example HK, HX, HN, NO ...)
 * @property serviceProvider
 * @property start
 * @property end
 * @property number Seat number
 * @property stakeholder
 */
@JsonClass(generateAdapter = true)
data class ProductAirSeat(
    @Json(name = "start") @field:Json(name = "start") var start: AirSeatStart,
    @Json(name = "end") @field:Json(name = "end") var end: AirSeatEnd,
    @Json(name = "number") @field:Json(name = "number") var number: String,
    @Json(name = "status") @field:Json(name = "status") var status: String? = null,
    @Json(name = "serviceProvider") @field:Json(name = "serviceProvider") var serviceProvider: AirSeatServiceProvider? = null,
    @Json(name = "stakeholder") @field:Json(name = "stakeholder") var stakeholder: Relationship? = null
)

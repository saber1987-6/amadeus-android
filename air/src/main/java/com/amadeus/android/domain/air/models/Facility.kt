/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Seatmap Display
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property code Facility code, as described in the facility dictionary
 * @property column
 * @property row
 * @property position Position is either front, rear or seat (in case the facility takes the place of a seat)
 * @property coordinates
 */
@JsonClass(generateAdapter = true)
data class Facility(
    @Json(name = "code") @field:Json(name = "code") var code: String? = null,
    @Json(name = "column") @field:Json(name = "column") var column: String? = null,
    @Json(name = "row") @field:Json(name = "row") var row: String? = null,
    @Json(name = "position") @field:Json(name = "position") var position: Facility.PositionEnum? = null,
    @Json(name = "coordinates") @field:Json(name = "coordinates") var coordinates: Coordinates? = null
) {
    /**
     * Position is either front, rear or seat (in case the facility takes the place of a seat)
     * Values: FRONT, REAR, SEAT
     */
    @JsonClass(generateAdapter = false)
    enum class PositionEnum(val value: String) {
        @Json(name = "FRONT") FRONT("FRONT"),
        @Json(name = "REAR") REAR("REAR"),
        @Json(name = "SEAT") SEAT("SEAT")
    }
}
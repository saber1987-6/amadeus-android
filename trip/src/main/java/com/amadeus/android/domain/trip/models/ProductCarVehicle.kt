/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * information on the vehicle booked
 * @property code The ACRISS Code defining the vehicle
 * @property description Description of the vehicle booked
 * @property options Used to convey information about special equipments (GPS, Baby seat, ...) associated to the car booking.
 * @property numberOfDoors
 */
@JsonClass(generateAdapter = true)
data class ProductCarVehicle(
    @Json(name = "code") @field:Json(name = "code") var code: String? = null,
    @Json(name = "description") @field:Json(name = "description") var description: String? = null,
    @Json(name = "options") @field:Json(name = "options") var options: List<ProductCarVehicleOption>? = null,
    @Json(name = "numberOfDoors") @field:Json(name = "numberOfDoors") var numberOfDoors: Int? = null
)

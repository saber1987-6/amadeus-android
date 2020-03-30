/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property code Equipment code
 * @property description Equipment description
 */
@JsonClass(generateAdapter = true)
data class ProductTrainVehicle(
    @Json(name = "code") @field:Json(name = "code") var code: String? = null,
    @Json(name = "description") @field:Json(name = "description") var description: String? = null
)

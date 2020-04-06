/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property code
 */
@JsonClass(generateAdapter = true)
data class AirSeatServiceProvider(
    @Json(name = "code") @field:Json(name = "code") var code: String? = null
)
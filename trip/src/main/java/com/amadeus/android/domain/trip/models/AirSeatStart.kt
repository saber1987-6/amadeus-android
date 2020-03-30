/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property locationCode [IATA table codes](http://www.iata.org/publications/Pages/code-search.aspx) of the departure location
 */
@JsonClass(generateAdapter = true)
data class AirSeatStart(
    @Json(name = "locationCode") @field:Json(name = "locationCode") var locationCode: String? = null
)

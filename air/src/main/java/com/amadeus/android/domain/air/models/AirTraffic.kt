/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Most Traveled Destinations
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property type
 * @property period Time period following [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) standard
 * @property subType
 * @property destination IATA code of the destination city - [IATA table codes](http://www.iata.org/publications/Pages/code-search.aspx)
 * @property analytics
 */
@JsonClass(generateAdapter = true)
data class AirTraffic(
    @Json(name = "type") @field:Json(name = "type") var type: String? = null,
    @Json(name = "subType") @field:Json(name = "subType") var subType: String? = null,
    @Json(name = "destination") @field:Json(name = "destination") var destination: String? = null,
    @Json(name = "period") @field:Json(name = "period") var period: String? = null,
    @Json(name = "analytics") @field:Json(name = "analytics") var analytics: Analytics? = null
)

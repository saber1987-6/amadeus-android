/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Create Orders
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * remarks
 * @property general list of general remarks
 * @property airline list of airline remarks
 */
@JsonClass(generateAdapter = true)
data class Remarks(
    @Json(name = "general") @field:Json(name = "general") var general: List<GeneralRemark>? = null,
    @Json(name = "airline") @field:Json(name = "airline") var airline: List<AirlineRemark>? = null
)

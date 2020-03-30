/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Create Orders
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property name
 * @property value
 */
@JsonClass(generateAdapter = true)
data class ReportingData(
    @Json(name = "name") @field:Json(name = "name") var name: String? = null,
    @Json(name = "value") @field:Json(name = "value") var value: String? = null
)

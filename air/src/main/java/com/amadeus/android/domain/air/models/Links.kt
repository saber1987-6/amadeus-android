/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Airport On-Time Performance
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property self
 * @property related
 * @property type
 */
@JsonClass(generateAdapter = true)
data class Links(
    @Json(name = "self") @field:Json(name = "self") var self: String? = null,
    @Json(name = "related") @field:Json(name = "related") var related: String? = null,
    @Json(name = "type") @field:Json(name = "type") var type: String? = null
)
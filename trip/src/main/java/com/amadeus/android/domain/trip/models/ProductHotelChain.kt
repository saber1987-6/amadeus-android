/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * hotel Chain information
 * @property ref Hotel Chain&#39;s profile reference
 * @property name Hotel Chain name
 * @property code Hotel Chain code.
 * @property externalRef External profile reference for imported profiles.
 */
@JsonClass(generateAdapter = true)
data class ProductHotelChain(
    @Json(name = "ref") @field:Json(name = "ref") var ref: String? = null,
    @Json(name = "name") @field:Json(name = "name") var name: String? = null,
    @Json(name = "code") @field:Json(name = "code") var code: String? = null,
    @Json(name = "externalRef") @field:Json(name = "externalRef") var externalRef: String? = null
)

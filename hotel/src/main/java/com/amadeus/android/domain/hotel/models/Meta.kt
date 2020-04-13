/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Hotel
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.hotel.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * meta information
 * @property links
 * @property lang the default language of all texts returned
 */
@JsonClass(generateAdapter = true)
data class Meta(
    @Json(name = "links") @field:Json(name = "links") var links: Links? = null,
    @Json(name = "lang") @field:Json(name = "lang") var lang: String? = null
)
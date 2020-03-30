/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * operating information
 * @property serviceProvider
 * @property identifier
 */
@JsonClass(generateAdapter = true)
data class ProductAirPartnerInfo(
    @Json(name = "serviceProvider") @field:Json(name = "serviceProvider") var serviceProvider: ProductAirServiceProvider? = null,
    @Json(name = "identifier") @field:Json(name = "identifier") var identifier: AirIdentifier? = null
)

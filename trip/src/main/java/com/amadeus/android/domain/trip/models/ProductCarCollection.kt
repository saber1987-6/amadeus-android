/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Used to convey collection information.
 * @property address
 * @property contact
 */
@JsonClass(generateAdapter = true)
data class ProductCarCollection(
    @Json(name = "address") @field:Json(name = "address") var address: Address? = null,
    @Json(name = "contact") @field:Json(name = "contact") var contact: ProductCarContact? = null
)

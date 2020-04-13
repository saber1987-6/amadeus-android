/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Most Traveled Destinations
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.math.BigDecimal

/**
 * @property score Approximate score for ranking purposes calculated based on number of travelers in the location.
 */
@JsonClass(generateAdapter = true)
data class Travelers(
    @Json(name = "score") @field:Json(name = "score") var score: BigDecimal? = null
)
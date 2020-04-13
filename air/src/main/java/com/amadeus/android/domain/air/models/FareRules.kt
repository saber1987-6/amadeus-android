/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Order Management
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property currency The currency of the penalties
 * @property rules
 */
@JsonClass(generateAdapter = true)
data class FareRules(
    @Json(name = "currency") @field:Json(name = "currency") var currency: String? = null,
    @Json(name = "rules") @field:Json(name = "rules") var rules: List<TermAndCondition>? = null
)
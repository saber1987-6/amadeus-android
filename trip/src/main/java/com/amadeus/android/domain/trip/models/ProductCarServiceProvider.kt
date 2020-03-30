/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * car provider information
 * @property ref The provider&#39;s profile reference.
 * @property name Car rental compay name
 * @property code Car rental company code
 */
@JsonClass(generateAdapter = true)
data class ProductCarServiceProvider(
    @Json(name = "ref") @field:Json(name = "ref") var ref: String? = null,
    @Json(name = "name") @field:Json(name = "name") var name: String? = null,
    @Json(name = "code") @field:Json(name = "code") var code: String? = null
)

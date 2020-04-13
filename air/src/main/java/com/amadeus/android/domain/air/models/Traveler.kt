/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Offers Search
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property id
 * @property travelerType
 * @property associatedAdultId if type&#x3D;\&quot;HELD_INFANT\&quot;, corresponds to the adult travelers&#39;s id who will share the seat
 */
@JsonClass(generateAdapter = true)
data class Traveler(
    @Json(name = "id") @field:Json(name = "id") var id: String,
    @Json(name = "travelerType") @field:Json(name = "travelerType") var travelerType: TravelerType,
    @Json(name = "associatedAdultId") @field:Json(name = "associatedAdultId") var associatedAdultId: String? = null
)
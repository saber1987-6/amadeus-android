/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Create Orders
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
* quality of service offered in the cabin where the seat is located in this flight. Economy, premium economy, business or first class
* Values: ECONOMY,PREMIUM_ECONOMY,BUSINESS,FIRST
*/
@JsonClass(generateAdapter = false)
enum class TravelClass(val value: String) {
    @Json(name = "ECONOMY") ECONOMY("ECONOMY"),
    @Json(name = "PREMIUM_ECONOMY") PREMIUM_ECONOMY("PREMIUM_ECONOMY"),
    @Json(name = "BUSINESS") BUSINESS("BUSINESS"),
    @Json(name = "FIRST") FIRST("FIRST")
}

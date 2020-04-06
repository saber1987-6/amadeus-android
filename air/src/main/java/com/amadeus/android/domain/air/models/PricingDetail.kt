/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Choice Prediction
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 *
 * @property travelClass
 * @property fareClass class of the fare that applied. Fare classes are subdivisions of travel classes and vary from airline to airline. For instance, Y designs usually a full fare economy class
 * @property availability the number of seats still available at this time of search with this class of fare
 * @property fareBasis the identifier of the fare that applied. Farebasis identifiers vary from airline to airline. It is usually composed of the fare class followed by other alphanumeric codes that identify the rules that apply to the fare. For instance, WH7LNR might mean that the fare class is W, that it is valid during high-season only (H) and for a 7-day advance purchase, long-haul (L) and not refundable (NR)
 */
@JsonClass(generateAdapter = true)
data class PricingDetail(
    @Json(name = "travelClass") @field:Json(name = "travelClass") var travelClass: TravelClass? = null,
    @Json(name = "fareClass") @field:Json(name = "fareClass") var fareClass: String? = null,
    @Json(name = "availability") @field:Json(name = "availability") var availability: Int? = null,
    @Json(name = "fareBasis") @field:Json(name = "fareBasis") var fareBasis: String? = null
)

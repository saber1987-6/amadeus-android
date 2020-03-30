/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Seatmap Display
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * seat map information
 * @property type Ressource name
 * @property id item identifier
 * @property self
 * @property departure
 * @property arrival
 * @property carrierCode providing the airline / carrier code
 * @property number the flight number as assigned by the carrier
 * @property aircraft
 * @property `class` reservation booking designator (RBD) of the carrier
 * @property flightOfferId Id of the impacted flight offer
 * @property segmentId Id of the impacted segment
 * @property decks decks information
 */
@JsonClass(generateAdapter = true)
data class SeatMap(
    @Json(name = "type") @field:Json(name = "type") var type: String? = null,
    @Json(name = "id") @field:Json(name = "id") var id: String? = null,
    @Json(name = "self") @field:Json(name = "self") var self: Link? = null,
    @Json(name = "departure") @field:Json(name = "departure") var departure: FlightEndPoint? = null,
    @Json(name = "arrival") @field:Json(name = "arrival") var arrival: FlightEndPoint? = null,
    @Json(name = "carrierCode") @field:Json(name = "carrierCode") var carrierCode: String? = null,
    @Json(name = "number") @field:Json(name = "number") var number: String? = null,
    @Json(name = "aircraft") @field:Json(name = "aircraft") var aircraft: AircraftEquipment? = null,
    @Json(name = "class") @field:Json(name = "class") var `class`: String? = null,
    @Json(name = "flightOfferId") @field:Json(name = "flightOfferId") var flightOfferId: String? = null,
    @Json(name = "segmentId") @field:Json(name = "segmentId") var segmentId: String? = null,
    @Json(name = "decks") @field:Json(name = "decks") var decks: List<Deck>? = null
)

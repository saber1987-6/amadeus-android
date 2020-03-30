/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Offers Price
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property flightSegment
 * @property pricingDetailPerAdult
 * @property pricingDetailPerInfant
 * @property pricingDetailPerChild
 * @property pricingDetailPerSenior
 * @property departure
 * @property arrival
 * @property carrierCode providing the airline / carrier code
 * @property number the flight number as assigned by the carrier
 * @property aircraft
 * @property operating
 * @property duration stop duration in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) PnYnMnDTnHnMnS format, e.g. PT2H10M
 * @property stops information regarding the different stops composing the flight segment. E.g. technical stop, change of gauge...
 * @property id Id of the segment
 * @property numberOfStops Number of stops
 * @property blacklistedInEU When the flight has a marketing or/and operating airline that is identified as blacklisted by the European Commission.   To improve travel safety, the European Commission regularly updates the list of the banned carriers from operating in Europe. It allows any Travel Agency located in the European Union to easily identify and hide any travel recommendation based on some unsafe airlines.  The [list of the banned airlines](https://ec.europa.eu/transport/sites/transport/files/air-safety-list_en.pdf) is published in the Official Journal of the European Union, where they are included as annexes A and B to the Commission Regulation. The blacklist of an airline can concern all its flights or some specific aircraft types pertaining to the airline
 */
@JsonClass(generateAdapter = true)
data class Segment(
    @Json(name = "flightSegment") @field:Json(name = "flightSegment") var flightSegment: FlightSegment? = null,
    @Json(name = "pricingDetailPerAdult") @field:Json(name = "pricingDetailPerAdult") var pricingDetailPerAdult: PricingDetail? = null,
    @Json(name = "pricingDetailPerInfant") @field:Json(name = "pricingDetailPerInfant") var pricingDetailPerInfant: PricingDetail? = null,
    @Json(name = "pricingDetailPerChild") @field:Json(name = "pricingDetailPerChild") var pricingDetailPerChild: PricingDetail? = null,
    @Json(name = "pricingDetailPerSenior") @field:Json(name = "pricingDetailPerSenior") var pricingDetailPerSenior: PricingDetail? = null,
    @Json(name = "departure") @field:Json(name = "departure") var departure: FlightEndPoint? = null,
    @Json(name = "arrival") @field:Json(name = "arrival") var arrival: FlightEndPoint? = null,
    @Json(name = "carrierCode") @field:Json(name = "carrierCode") var carrierCode: String? = null,
    @Json(name = "number") @field:Json(name = "number") var number: String? = null,
    @Json(name = "aircraft") @field:Json(name = "aircraft") var aircraft: AircraftEquipment? = null,
    @Json(name = "operating") @field:Json(name = "operating") var operating: OperatingFlight? = null,
    @Json(name = "duration") @field:Json(name = "duration") var duration: String? = null,
    @Json(name = "stops") @field:Json(name = "stops") var stops: List<FlightStop>? = null,
    @Json(name = "id") @field:Json(name = "id") var id: String? = null,
    @Json(name = "numberOfStops") @field:Json(name = "numberOfStops") var numberOfStops: Int? = null,
    @Json(name = "blacklistedInEU") @field:Json(name = "blacklistedInEU") var blacklistedInEU: Boolean? = null
)

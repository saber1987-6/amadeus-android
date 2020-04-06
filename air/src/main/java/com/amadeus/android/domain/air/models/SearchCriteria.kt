/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Offers Search
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.math.BigDecimal

/**
 * @property excludeAllotments This option allows to exclude the isAllotment flag associated to a booking class in the search response when it exist.
 * @property addOneWayOffers This option allows activate the one-way combinable feature
 * @property maxFlightOffers Maximum number of flight offers returned (Max 250)
 * @property maxPrice maximum price per traveler. By default, no limit is applied. If specified, the value should be a positive number with no decimals
 * @property allowAlternativeFareOptions This option allows to default to a standard fareOption if no offers are found for the selected fareOption.
 * @property oneFlightOfferPerDay Requests the system to find at least one flight-offer per day, if possible, when a range of dates is specified. Default is false.
 * @property additionalInformation
 * @property pricingOptions
 * @property flightFilters
 */
@JsonClass(generateAdapter = true)
data class SearchCriteria(
    @Json(name = "excludeAllotments") @field:Json(name = "excludeAllotments") var excludeAllotments: Boolean? = null,
    @Json(name = "addOneWayOffers") @field:Json(name = "addOneWayOffers") var addOneWayOffers: Boolean? = null,
    @Json(name = "maxFlightOffers") @field:Json(name = "maxFlightOffers") var maxFlightOffers: BigDecimal? = null,
    @Json(name = "maxPrice") @field:Json(name = "maxPrice") var maxPrice: Int? = null,
    @Json(name = "allowAlternativeFareOptions") @field:Json(name = "allowAlternativeFareOptions") var allowAlternativeFareOptions: Boolean? = null,
    @Json(name = "oneFlightOfferPerDay") @field:Json(name = "oneFlightOfferPerDay") var oneFlightOfferPerDay: Boolean? = null,
    @Json(name = "additionalInformation") @field:Json(name = "additionalInformation") var additionalInformation: AdditionalInformation? = null,
    @Json(name = "pricingOptions") @field:Json(name = "pricingOptions") var pricingOptions: PricingOptions? = null,
    @Json(name = "flightFilters") @field:Json(name = "flightFilters") var flightFilters: FlightFilters? = null
)
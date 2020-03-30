/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Order Management
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property fareType type of fare of the flight-offer
 * @property corporateCodes Allow Corporate negotiated fares using one or more corporate number (corporate code).
 * @property includedCheckedBagsOnly If true, returns the flight-offers with included checked bags only
 * @property refundableFare If true, returns the flight-offers with refundable fares only
 * @property noRestrictionFare If true, returns the flight-offers with no restriction fares only
 * @property noPenaltyFare If true, returns the flight-offers with no penalty fares only
 */
@JsonClass(generateAdapter = true)
data class PricingOptions(
    @Json(name = "fareType") @field:Json(name = "fareType") var fareType: PricingOptionsFareType? = null,
    @Json(name = "corporateCodes") @field:Json(name = "corporateCodes") var corporateCodes: List<String>? = null,
    @Json(name = "includedCheckedBagsOnly") @field:Json(name = "includedCheckedBagsOnly") var includedCheckedBagsOnly: Boolean? = null,
    @Json(name = "refundableFare") @field:Json(name = "refundableFare") var refundableFare: Boolean? = null,
    @Json(name = "noRestrictionFare") @field:Json(name = "noRestrictionFare") var noRestrictionFare: Boolean? = null,
    @Json(name = "noPenaltyFare") @field:Json(name = "noPenaltyFare") var noPenaltyFare: Boolean? = null
)

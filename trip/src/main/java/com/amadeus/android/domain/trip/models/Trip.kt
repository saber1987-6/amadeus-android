/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property type the resource name (&#x60;trip&#x60;)
 * @property id item identifier
 * @property self
 * @property reference Reference of the Trip
 * @property externalID Identifier of the trip in an external system (e.g. GLC)
 * @property creation Creation date and office Id of the Trip
 * @property modification Modification date and office Id of the Trip
 * @property ownerOffice Owner office of the Trip
 * @property title Trip label or name
 * @property description Trip description
 * @property purpose Business or Leisure
 * @property privacy Public or private
 * @property start Trip Departure information
 * @property itinerary locations where a significant stop is performed.
 * @property to Trip destination information
 * @property end Trip Arrival information
 * @property travelAgency
 */
@JsonClass(generateAdapter = true)
data class Trip(
    @Json(name = "type") @field:Json(name = "type") var type: String? = null,
    @Json(name = "id") @field:Json(name = "id") var id: String? = null,
    @Json(name = "self") @field:Json(name = "self") var self: Links? = null,
    @Json(name = "reference") @field:Json(name = "reference") var reference: String? = null,
    @Json(name = "externalID") @field:Json(name = "externalID") var externalID: String? = null,
    @Json(name = "creation") @field:Json(name = "creation") var creation: Creation? = null,
    @Json(name = "modification") @field:Json(name = "modification") var modification: Creation? = null,
    @Json(name = "ownerOffice") @field:Json(name = "ownerOffice") var ownerOffice: Creation? = null,
    @Json(name = "title") @field:Json(name = "title") var title: String? = null,
    @Json(name = "description") @field:Json(name = "description") var description: String? = null,
    @Json(name = "purpose") @field:Json(name = "purpose") var purpose: String? = null,
    @Json(name = "privacy") @field:Json(name = "privacy") var privacy: String? = null,
    @Json(name = "start") @field:Json(name = "start") var start: TripPoint? = null,
    @Json(name = "itinerary") @field:Json(name = "itinerary") var itinerary: List<TripStep>? = null,
    @Json(name = "to") @field:Json(name = "to") var to: TripPoint? = null,
    @Json(name = "end") @field:Json(name = "end") var end: TripPoint? = null,
    @Json(name = "travelAgency") @field:Json(name = "travelAgency") var travelAgency: TravelAgency? = null
)

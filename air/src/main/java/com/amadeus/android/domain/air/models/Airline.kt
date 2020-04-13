/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Airline Code Lookup API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property type the resource name
 * @property iataCode IATA airline code. see [IATA table codes](http://www.iata.org/publications/Pages/code-search.aspx)
 * @property icaoCode IATA airline code. see [ICAO airlines table codes](https://en.wikipedia.org/wiki/List_of_airline_codes)
 * @property businessName airline business name
 * @property commonName airline common name
 */
@JsonClass(generateAdapter = true)
data class Airline(
    @Json(name = "type") @field:Json(name = "type") var type: String? = null,
    @Json(name = "iataCode") @field:Json(name = "iataCode") var iataCode: String? = null,
    @Json(name = "icaoCode") @field:Json(name = "icaoCode") var icaoCode: String? = null,
    @Json(name = "businessName") @field:Json(name = "businessName") var businessName: String? = null,
    @Json(name = "commonName") @field:Json(name = "commonName") var commonName: String? = null
)
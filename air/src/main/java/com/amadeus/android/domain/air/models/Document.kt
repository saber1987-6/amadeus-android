/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Create Orders
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.threeten.bp.LocalDate

/**
 * the information that are found on an ID document
 * @property number The document number (shown on the document) . E.g. QFU514563221J
 * @property issuanceDate Date at which the document has been issued.
 * @property expiryDate Date after which the document is not valid anymore.
 * @property issuanceCountry [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the country that issued the document
 * @property issuanceLocation A more precise information concerning the place where the document has been issued, when available. It may be a country, a state, a city or any other type of location. e.g. New-York
 * @property nationality [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the nationality appearing on the document
 * @property birthPlace Birth place as indicated on the document
 */
@JsonClass(generateAdapter = true)
data class Document(
    @Json(name = "number") @field:Json(name = "number") var number: String? = null,
    @Json(name = "issuanceDate") @field:Json(name = "issuanceDate") var issuanceDate: LocalDate? = null,
    @Json(name = "expiryDate") @field:Json(name = "expiryDate") var expiryDate: LocalDate? = null,
    @Json(name = "issuanceCountry") @field:Json(name = "issuanceCountry") var issuanceCountry: String? = null,
    @Json(name = "issuanceLocation") @field:Json(name = "issuanceLocation") var issuanceLocation: String? = null,
    @Json(name = "nationality") @field:Json(name = "nationality") var nationality: String? = null,
    @Json(name = "birthPlace") @field:Json(name = "birthPlace") var birthPlace: String? = null
)

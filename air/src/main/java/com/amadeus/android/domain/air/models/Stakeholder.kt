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
 * stakeholder definition
 * @property id item identifier
 * @property dateOfBirth The date of birth in ISO 8601 format (yyyy-mm-dd)
 * @property gender
 * @property name
 * @property documents Advanced Passenger Information - regulatory identity documents - SSR DOCS &amp; DOCO elements
 */
@JsonClass(generateAdapter = true)
data class Stakeholder(
    @Json(name = "id") @field:Json(name = "id") var id: String? = null,
    @Json(name = "dateOfBirth") @field:Json(name = "dateOfBirth") var dateOfBirth: LocalDate? = null,
    @Json(name = "gender") @field:Json(name = "gender") var gender: StakeholderGender? = null,
    @Json(name = "name") @field:Json(name = "name") var name: Name? = null,
    @Json(name = "documents") @field:Json(name = "documents") var documents: List<TravelerDocuments>? = null
)

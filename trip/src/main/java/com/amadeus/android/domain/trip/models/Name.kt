/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * description of the name of a physical person
 * @property type The type of the Name
 * @property isRef Reference Name
 * @property firstName First name.
 * @property lastName Last name.
 * @property title Contains all the suffixes and prefixes that can be appended to a name - Mr, Miss, Pr. - E.g. \&quot; Mr\&quot;.
 * @property maidenName The name given at birth time and that may have changed after a marriage.
 * @property middleName Middle name(s), for example \&quot;Lee\&quot; in \&quot;John Lee Smith\&quot;.
 * @property prefix Name prefix (e.g. Doctor)
 * @property suffix Name suffix (e.g. Junior, III, etc).
 * @property transliterationMethod The method (if applicated) that was used to transform the name from universal character (e.g. korean characters) to latin characters/phonetic transcription/...
 */
@JsonClass(generateAdapter = true)
data class Name(
    @Json(name = "type") @field:Json(name = "type") var type: String? = null,
    @Json(name = "isRef") @field:Json(name = "isRef") var isRef: Boolean? = null,
    @Json(name = "firstName") @field:Json(name = "firstName") var firstName: String? = null,
    @Json(name = "lastName") @field:Json(name = "lastName") var lastName: String? = null,
    @Json(name = "title") @field:Json(name = "title") var title: String? = null,
    @Json(name = "maidenName") @field:Json(name = "maidenName") var maidenName: String? = null,
    @Json(name = "middleName") @field:Json(name = "middleName") var middleName: String? = null,
    @Json(name = "prefix") @field:Json(name = "prefix") var prefix: String? = null,
    @Json(name = "suffix") @field:Json(name = "suffix") var suffix: String? = null,
    @Json(name = "transliterationMethod") @field:Json(name = "transliterationMethod") var transliterationMethod: String? = null
)

/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Order Management
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
* the purpose for which this contact is to be used
* Values: STANDARD,INVOICE,STANDARD_WITHOUT_TRANSMISSION
*/
@JsonClass(generateAdapter = false)
enum class ContactPurpose(val value: String) {
    @Json(name = "STANDARD") STANDARD("STANDARD"),
    @Json(name = "INVOICE") INVOICE("INVOICE"),
    @Json(name = "STANDARD_WITHOUT_TRANSMISSION") STANDARD_WITHOUT_TRANSMISSION("STANDARD_WITHOUT_TRANSMISSION")
}

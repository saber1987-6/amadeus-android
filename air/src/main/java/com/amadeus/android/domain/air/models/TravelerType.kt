/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Create Orders
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
* traveler type age restrictions : CHILD < 12y, HELD_INFANT < 2y, SEATED_INFANT < 2y, SENIOR >=60y 
* Values: ADULT,CHILD,SENIOR,YOUNG,HELD_INFANT,SEATED_INFANT,STUDENT
*/
@JsonClass(generateAdapter = false)
enum class TravelerType(val value: String) {
    @Json(name = "ADULT") ADULT("ADULT"),
    @Json(name = "CHILD") CHILD("CHILD"),
    @Json(name = "SENIOR") SENIOR("SENIOR"),
    @Json(name = "YOUNG") YOUNG("YOUNG"),
    @Json(name = "HELD_INFANT") HELD_INFANT("HELD_INFANT"),
    @Json(name = "SEATED_INFANT") SEATED_INFANT("SEATED_INFANT"),
    @Json(name = "STUDENT") STUDENT("STUDENT")
}

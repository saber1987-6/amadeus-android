/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * service provider information (Hotel Name, Property Code and Reference)
 * @property ref The provider&#39;s profile reference
 * @property name Provider name
 * @property code Provider code.
 * @property externalRef External profile reference for imported profiles.
 * @property source Type of provider (GDS, CRS, Multisource).
 */
@JsonClass(generateAdapter = true)
data class ProductHotelServiceProvider(
    @Json(name = "ref") @field:Json(name = "ref") var ref: String? = null,
    @Json(name = "name") @field:Json(name = "name") var name: String? = null,
    @Json(name = "code") @field:Json(name = "code") var code: String? = null,
    @Json(name = "externalRef") @field:Json(name = "externalRef") var externalRef: String? = null,
    @Json(name = "source") @field:Json(name = "source") var source: ProductHotelServiceProvider.SourceEnum? = null
) {
    /**
     * Type of provider (GDS, CRS, Multisource).
     * Values: GDS, CRS, MULTISOURCE
     */
    @JsonClass(generateAdapter = false)
    enum class SourceEnum(val value: String) {
        @Json(name = "GDS") GDS("GDS"),
        @Json(name = "CRS") CRS("CRS"),
        @Json(name = "MULTISOURCE") MULTISOURCE("MULTISOURCE")
    }
}

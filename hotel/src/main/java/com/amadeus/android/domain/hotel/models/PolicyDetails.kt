/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Hotel
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.hotel.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Booking Rules
 * @property paymentType payment type. Guarantee means Pay at Check Out. Check the &#x60;methods&#x60; in &#x60;guarantee&#x60; or &#x60;deposit&#x60; or &#x60;prepay&#x60;.
 * @property guarantee
 * @property deposit
 * @property prepay
 * @property holdTime
 * @property cancellation
 * @property checkInOut
 */
@JsonClass(generateAdapter = true)
data class PolicyDetails(
    @Json(name = "paymentType") @field:Json(name = "paymentType") var paymentType: PolicyDetails.PaymentTypeEnum? = null,
    @Json(name = "guarantee") @field:Json(name = "guarantee") var guarantee: GuaranteePolicy? = null,
    @Json(name = "deposit") @field:Json(name = "deposit") var deposit: DepositPolicy? = null,
    @Json(name = "prepay") @field:Json(name = "prepay") var prepay: DepositPolicy? = null,
    @Json(name = "holdTime") @field:Json(name = "holdTime") var holdTime: HoldPolicy? = null,
    @Json(name = "cancellation") @field:Json(name = "cancellation") var cancellation: CancellationPolicy? = null,
    @Json(name = "checkInOut") @field:Json(name = "checkInOut") var checkInOut: CheckInOutPolicy? = null
) {
    /**
     * payment type. Guarantee means Pay at Check Out. Check the `methods` in `guarantee` or `deposit` or `prepay`.
     * Values: GUARANTEE, DEPOSIT, PREPAY, HOLDTIME
     */
    @JsonClass(generateAdapter = false)
    enum class PaymentTypeEnum(val value: String) {
        @Json(name = "guarantee") GUARANTEE("guarantee"),
        @Json(name = "deposit") DEPOSIT("deposit"),
        @Json(name = "prepay") PREPAY("prepay"),
        @Json(name = "holdTime") HOLDTIME("holdTime")
    }
}

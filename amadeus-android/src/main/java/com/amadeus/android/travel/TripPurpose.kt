package com.amadeus.android.travel

import com.amadeus.android.base.BaseApi
import com.amadeus.android.domain.air.tools.GeneratedCodeConverters
import com.amadeus.android.domain.trip.apis.TripPurposePredictionApi
import kotlinx.coroutines.CoroutineDispatcher
import okhttp3.OkHttpClient
import org.threeten.bp.LocalDate
import retrofit2.Retrofit
import retrofit2.create

class TripPurpose internal constructor(
    baseUrl: String,
    httpClient: OkHttpClient,
    dispatcher: CoroutineDispatcher
) : BaseApi(dispatcher) {

    override val basePath = "v1/"

    private val api: TripPurposePredictionApi = Retrofit.Builder()
        .baseUrl(baseUrl + basePath)
        .addConverterFactory(GeneratedCodeConverters.converterFactory())
        .client(httpClient)
        .build()
        .create()

    suspend fun get(
        originLocationCode: String,
        destinationLocationCode: String,
        departureDate: LocalDate,
        returnDate: LocalDate,
        searchDate: LocalDate? = null
    ) = safeApiCall {
        api.getTripPurposePrediction(
            originLocationCode,
            destinationLocationCode,
            departureDate,
            returnDate,
            searchDate
        )
    }

}
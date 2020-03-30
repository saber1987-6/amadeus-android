package com.amadeus.android

import com.amadeus.android.travel.Analytics
import com.amadeus.android.travel.Predictions
import com.amadeus.android.travel.TripParserJob
import kotlinx.coroutines.CoroutineDispatcher
import okhttp3.OkHttpClient

class Travel internal constructor(
    private val baseUrl: String,
    private val httpClient: OkHttpClient,
    private val dispatcher: CoroutineDispatcher
) {

    /**
     * A namespaced client for the
     * `/v1/travel/predictions` endpoints.
     */
    val predictions = Predictions(baseUrl, httpClient, dispatcher)

    /**
     * A namespaced client for the
     * `/v1/travel/analytics` endpoints.
     */
    val analytics = Analytics(baseUrl, httpClient, dispatcher)

    /**
     * A namespaced client for the
     * `/v2/travel/trip-parsed-job` endpoints.
     */
    val tripParserJob = TripParserJob(baseUrl, httpClient, dispatcher)

    /**
     * A namespaced client for the
     * `/v2/travel/trip-parsed-job/:id` endpoints.
     */
    fun tripParserJob(id: String) = TripParserJob(baseUrl, httpClient, dispatcher, id)
}
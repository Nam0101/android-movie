/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.namnv.movieapp.data.models

import com.namnv.movieapp.data.models.UserDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param startTime 
 * @param endTime 
 * @param id 
 * @param user 
 */
@JsonClass(generateAdapter = true)

data class PremiumDTO (

    @Json(name = "startTime")
    var startTime: java.time.OffsetDateTime,

    @Json(name = "endTime")
    var endTime: java.time.OffsetDateTime,

    @Json(name = "id")
    var id: kotlin.Long? = null,

    @Json(name = "user")
    var user: UserDTO? = null

)

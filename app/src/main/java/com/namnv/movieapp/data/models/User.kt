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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param login 
 * @param activated 
 * @param createdBy 
 * @param createdDate 
 * @param lastModifiedBy 
 * @param lastModifiedDate 
 * @param id 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param langKey 
 * @param imageUrl 
 * @param resetDate 
 */
@JsonClass(generateAdapter = true)

data class User (

    @Json(name = "login")
    var login: kotlin.String,

    @Json(name = "activated")
    var activated: kotlin.Boolean,

    @Json(name = "createdBy")
    var createdBy: kotlin.String? = null,

    @Json(name = "createdDate")
    var createdDate: java.time.OffsetDateTime? = null,

    @Json(name = "lastModifiedBy")
    var lastModifiedBy: kotlin.String? = null,

    @Json(name = "lastModifiedDate")
    var lastModifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "id")
    var id: kotlin.Long? = null,

    @Json(name = "firstName")
    var firstName: kotlin.String? = null,

    @Json(name = "lastName")
    var lastName: kotlin.String? = null,

    @Json(name = "email")
    var email: kotlin.String? = null,

    @Json(name = "langKey")
    var langKey: kotlin.String? = null,

    @Json(name = "imageUrl")
    var imageUrl: kotlin.String? = null,

    @Json(name = "resetDate")
    var resetDate: java.time.OffsetDateTime? = null

)


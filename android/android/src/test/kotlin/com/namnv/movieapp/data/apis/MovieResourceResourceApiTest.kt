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

package com.namnv.movieapp.data.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import com.namnv.movieapp.data.apis.MovieResourceResourceApi
import com.namnv.movieapp.data.models.MovieResourceDTO

class MovieResourceResourceApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MovieResourceResourceApi
        //val apiInstance = MovieResourceResourceApi()

        // to test createMovieResource
        should("test createMovieResource") {
            // uncomment below to test createMovieResource
            //val movieResourceDTO : MovieResourceDTO =  // MovieResourceDTO | 
            //val result : MovieResourceDTO = apiInstance.createMovieResource(movieResourceDTO)
            //result shouldBe ("TODO")
        }

        // to test deleteMovieResource
        should("test deleteMovieResource") {
            // uncomment below to test deleteMovieResource
            //val id : kotlin.Long = 789 // kotlin.Long | 
            //apiInstance.deleteMovieResource(id)
        }

        // to test getAllMovieResources
        should("test getAllMovieResources") {
            // uncomment below to test getAllMovieResources
            //val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
            //val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
            //val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
            //val result : kotlin.collections.MutableList<MovieResourceDTO> = apiInstance.getAllMovieResources(page, size, sort)
            //result shouldBe ("TODO")
        }

        // to test getMovieResource
        should("test getMovieResource") {
            // uncomment below to test getMovieResource
            //val id : kotlin.Long = 789 // kotlin.Long | 
            //val result : MovieResourceDTO = apiInstance.getMovieResource(id)
            //result shouldBe ("TODO")
        }

        // to test partialUpdateMovieResource
        should("test partialUpdateMovieResource") {
            // uncomment below to test partialUpdateMovieResource
            //val id : kotlin.Long = 789 // kotlin.Long | 
            //val movieResourceDTO : MovieResourceDTO =  // MovieResourceDTO | 
            //val result : MovieResourceDTO = apiInstance.partialUpdateMovieResource(id, movieResourceDTO)
            //result shouldBe ("TODO")
        }

        // to test updateMovieResource
        should("test updateMovieResource") {
            // uncomment below to test updateMovieResource
            //val id : kotlin.Long = 789 // kotlin.Long | 
            //val movieResourceDTO : MovieResourceDTO =  // MovieResourceDTO | 
            //val result : MovieResourceDTO = apiInstance.updateMovieResource(id, movieResourceDTO)
            //result shouldBe ("TODO")
        }

    }
}

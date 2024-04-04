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

import com.namnv.movieapp.data.apis.MovieResourceApi
import com.namnv.movieapp.data.models.MovieDTO

class MovieResourceApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MovieResourceApi
        //val apiInstance = MovieResourceApi()

        // to test createMovie
        should("test createMovie") {
            // uncomment below to test createMovie
            //val movieDTO : MovieDTO =  // MovieDTO | 
            //val result : MovieDTO = apiInstance.createMovie(movieDTO)
            //result shouldBe ("TODO")
        }

        // to test deleteMovie
        should("test deleteMovie") {
            // uncomment below to test deleteMovie
            //val id : kotlin.Long = 789 // kotlin.Long | 
            //apiInstance.deleteMovie(id)
        }

        // to test getAllMovies
        should("test getAllMovies") {
            // uncomment below to test getAllMovies
            //val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
            //val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
            //val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
            //val eagerload : kotlin.Boolean = true // kotlin.Boolean | 
            //val result : kotlin.collections.MutableList<MovieDTO> = apiInstance.getAllMovies(page, size, sort, eagerload)
            //result shouldBe ("TODO")
        }

        // to test getMovie
        should("test getMovie") {
            // uncomment below to test getMovie
            //val id : kotlin.Long = 789 // kotlin.Long | 
            //val result : MovieDTO = apiInstance.getMovie(id)
            //result shouldBe ("TODO")
        }

        // to test partialUpdateMovie
        should("test partialUpdateMovie") {
            // uncomment below to test partialUpdateMovie
            //val id : kotlin.Long = 789 // kotlin.Long | 
            //val movieDTO : MovieDTO =  // MovieDTO | 
            //val result : MovieDTO = apiInstance.partialUpdateMovie(id, movieDTO)
            //result shouldBe ("TODO")
        }

        // to test updateMovie
        should("test updateMovie") {
            // uncomment below to test updateMovie
            //val id : kotlin.Long = 789 // kotlin.Long | 
            //val movieDTO : MovieDTO =  // MovieDTO | 
            //val result : MovieDTO = apiInstance.updateMovie(id, movieDTO)
            //result shouldBe ("TODO")
        }

    }
}
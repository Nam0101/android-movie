# MovieGenresResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMovieGenres**](MovieGenresResourceApi.md#createMovieGenres) | **POST** api/movie-genres | 
[**deleteMovieGenres**](MovieGenresResourceApi.md#deleteMovieGenres) | **DELETE** api/movie-genres/{id} | 
[**getAllMovieGenres**](MovieGenresResourceApi.md#getAllMovieGenres) | **GET** api/movie-genres | 
[**getMovieGenres**](MovieGenresResourceApi.md#getMovieGenres) | **GET** api/movie-genres/{id} | 
[**partialUpdateMovieGenres**](MovieGenresResourceApi.md#partialUpdateMovieGenres) | **PATCH** api/movie-genres/{id} | 
[**updateMovieGenres**](MovieGenresResourceApi.md#updateMovieGenres) | **PUT** api/movie-genres/{id} | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MovieGenresResourceApi::class.java)
val movieGenresDTO : MovieGenresDTO =  // MovieGenresDTO | 

launch(Dispatchers.IO) {
    val result : MovieGenresDTO = webService.createMovieGenres(movieGenresDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieGenresDTO** | [**MovieGenresDTO**](MovieGenresDTO.md)|  |

### Return type

[**MovieGenresDTO**](MovieGenresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MovieGenresResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    webService.deleteMovieGenres(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MovieGenresResourceApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.

launch(Dispatchers.IO) {
    val result : kotlin.collections.MutableList<MovieGenresDTO> = webService.getAllMovieGenres(page, size, sort)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **kotlin.Int**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**kotlin.collections.MutableList&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.collections.MutableList&lt;MovieGenresDTO&gt;**](MovieGenresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MovieGenresResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : MovieGenresDTO = webService.getMovieGenres(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**MovieGenresDTO**](MovieGenresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MovieGenresResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val movieGenresDTO : MovieGenresDTO =  // MovieGenresDTO | 

launch(Dispatchers.IO) {
    val result : MovieGenresDTO = webService.partialUpdateMovieGenres(id, movieGenresDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **movieGenresDTO** | [**MovieGenresDTO**](MovieGenresDTO.md)|  |

### Return type

[**MovieGenresDTO**](MovieGenresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: */*




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MovieGenresResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val movieGenresDTO : MovieGenresDTO =  // MovieGenresDTO | 

launch(Dispatchers.IO) {
    val result : MovieGenresDTO = webService.updateMovieGenres(id, movieGenresDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **movieGenresDTO** | [**MovieGenresDTO**](MovieGenresDTO.md)|  |

### Return type

[**MovieGenresDTO**](MovieGenresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


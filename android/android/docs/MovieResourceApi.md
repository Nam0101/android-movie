# MovieResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMovie**](MovieResourceApi.md#createMovie) | **POST** api/movies | 
[**deleteMovie**](MovieResourceApi.md#deleteMovie) | **DELETE** api/movies/{id} | 
[**getAllMovies**](MovieResourceApi.md#getAllMovies) | **GET** api/movies | 
[**getMovie**](MovieResourceApi.md#getMovie) | **GET** api/movies/{id} | 
[**partialUpdateMovie**](MovieResourceApi.md#partialUpdateMovie) | **PATCH** api/movies/{id} | 
[**updateMovie**](MovieResourceApi.md#updateMovie) | **PUT** api/movies/{id} | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MovieResourceApi::class.java)
val movieDTO : MovieDTO =  // MovieDTO | 

launch(Dispatchers.IO) {
    val result : MovieDTO = webService.createMovie(movieDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieDTO** | [**MovieDTO**](MovieDTO.md)|  |

### Return type

[**MovieDTO**](MovieDTO.md)

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
val webService = apiClient.createWebservice(MovieResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    webService.deleteMovie(id)
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
val webService = apiClient.createWebservice(MovieResourceApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
val eagerload : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.MutableList<MovieDTO> = webService.getAllMovies(page, size, sort, eagerload)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **kotlin.Int**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**kotlin.collections.MutableList&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]
 **eagerload** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**kotlin.collections.MutableList&lt;MovieDTO&gt;**](MovieDTO.md)

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
val webService = apiClient.createWebservice(MovieResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : MovieDTO = webService.getMovie(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**MovieDTO**](MovieDTO.md)

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
val webService = apiClient.createWebservice(MovieResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val movieDTO : MovieDTO =  // MovieDTO | 

launch(Dispatchers.IO) {
    val result : MovieDTO = webService.partialUpdateMovie(id, movieDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **movieDTO** | [**MovieDTO**](MovieDTO.md)|  |

### Return type

[**MovieDTO**](MovieDTO.md)

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
val webService = apiClient.createWebservice(MovieResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val movieDTO : MovieDTO =  // MovieDTO | 

launch(Dispatchers.IO) {
    val result : MovieDTO = webService.updateMovie(id, movieDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **movieDTO** | [**MovieDTO**](MovieDTO.md)|  |

### Return type

[**MovieDTO**](MovieDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


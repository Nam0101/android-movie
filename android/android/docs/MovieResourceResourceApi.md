# MovieResourceResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMovieResource**](MovieResourceResourceApi.md#createMovieResource) | **POST** api/movie-resources | 
[**deleteMovieResource**](MovieResourceResourceApi.md#deleteMovieResource) | **DELETE** api/movie-resources/{id} | 
[**getAllMovieResources**](MovieResourceResourceApi.md#getAllMovieResources) | **GET** api/movie-resources | 
[**getMovieResource**](MovieResourceResourceApi.md#getMovieResource) | **GET** api/movie-resources/{id} | 
[**partialUpdateMovieResource**](MovieResourceResourceApi.md#partialUpdateMovieResource) | **PATCH** api/movie-resources/{id} | 
[**updateMovieResource**](MovieResourceResourceApi.md#updateMovieResource) | **PUT** api/movie-resources/{id} | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MovieResourceResourceApi::class.java)
val movieResourceDTO : MovieResourceDTO =  // MovieResourceDTO | 

launch(Dispatchers.IO) {
    val result : MovieResourceDTO = webService.createMovieResource(movieResourceDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieResourceDTO** | [**MovieResourceDTO**](MovieResourceDTO.md)|  |

### Return type

[**MovieResourceDTO**](MovieResourceDTO.md)

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
val webService = apiClient.createWebservice(MovieResourceResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    webService.deleteMovieResource(id)
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
val webService = apiClient.createWebservice(MovieResourceResourceApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.

launch(Dispatchers.IO) {
    val result : kotlin.collections.MutableList<MovieResourceDTO> = webService.getAllMovieResources(page, size, sort)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **kotlin.Int**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**kotlin.collections.MutableList&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.collections.MutableList&lt;MovieResourceDTO&gt;**](MovieResourceDTO.md)

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
val webService = apiClient.createWebservice(MovieResourceResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : MovieResourceDTO = webService.getMovieResource(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**MovieResourceDTO**](MovieResourceDTO.md)

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
val webService = apiClient.createWebservice(MovieResourceResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val movieResourceDTO : MovieResourceDTO =  // MovieResourceDTO | 

launch(Dispatchers.IO) {
    val result : MovieResourceDTO = webService.partialUpdateMovieResource(id, movieResourceDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **movieResourceDTO** | [**MovieResourceDTO**](MovieResourceDTO.md)|  |

### Return type

[**MovieResourceDTO**](MovieResourceDTO.md)

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
val webService = apiClient.createWebservice(MovieResourceResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val movieResourceDTO : MovieResourceDTO =  // MovieResourceDTO | 

launch(Dispatchers.IO) {
    val result : MovieResourceDTO = webService.updateMovieResource(id, movieResourceDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **movieResourceDTO** | [**MovieResourceDTO**](MovieResourceDTO.md)|  |

### Return type

[**MovieResourceDTO**](MovieResourceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


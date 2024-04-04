# GenresResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGenres**](GenresResourceApi.md#createGenres) | **POST** api/genres | 
[**deleteGenres**](GenresResourceApi.md#deleteGenres) | **DELETE** api/genres/{id} | 
[**getAllGenres**](GenresResourceApi.md#getAllGenres) | **GET** api/genres | 
[**getGenres**](GenresResourceApi.md#getGenres) | **GET** api/genres/{id} | 
[**partialUpdateGenres**](GenresResourceApi.md#partialUpdateGenres) | **PATCH** api/genres/{id} | 
[**updateGenres**](GenresResourceApi.md#updateGenres) | **PUT** api/genres/{id} | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GenresResourceApi::class.java)
val genresDTO : GenresDTO =  // GenresDTO | 

launch(Dispatchers.IO) {
    val result : GenresDTO = webService.createGenres(genresDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **genresDTO** | [**GenresDTO**](GenresDTO.md)|  |

### Return type

[**GenresDTO**](GenresDTO.md)

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
val webService = apiClient.createWebservice(GenresResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    webService.deleteGenres(id)
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
val webService = apiClient.createWebservice(GenresResourceApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.

launch(Dispatchers.IO) {
    val result : kotlin.collections.MutableList<GenresDTO> = webService.getAllGenres(page, size, sort)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **kotlin.Int**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**kotlin.collections.MutableList&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.collections.MutableList&lt;GenresDTO&gt;**](GenresDTO.md)

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
val webService = apiClient.createWebservice(GenresResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : GenresDTO = webService.getGenres(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**GenresDTO**](GenresDTO.md)

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
val webService = apiClient.createWebservice(GenresResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val genresDTO : GenresDTO =  // GenresDTO | 

launch(Dispatchers.IO) {
    val result : GenresDTO = webService.partialUpdateGenres(id, genresDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **genresDTO** | [**GenresDTO**](GenresDTO.md)|  |

### Return type

[**GenresDTO**](GenresDTO.md)

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
val webService = apiClient.createWebservice(GenresResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val genresDTO : GenresDTO =  // GenresDTO | 

launch(Dispatchers.IO) {
    val result : GenresDTO = webService.updateGenres(id, genresDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **genresDTO** | [**GenresDTO**](GenresDTO.md)|  |

### Return type

[**GenresDTO**](GenresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


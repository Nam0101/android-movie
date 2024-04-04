# PlaylistResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPlaylist**](PlaylistResourceApi.md#createPlaylist) | **POST** api/playlists | 
[**deletePlaylist**](PlaylistResourceApi.md#deletePlaylist) | **DELETE** api/playlists/{id} | 
[**getAllPlaylists**](PlaylistResourceApi.md#getAllPlaylists) | **GET** api/playlists | 
[**getPlaylist**](PlaylistResourceApi.md#getPlaylist) | **GET** api/playlists/{id} | 
[**partialUpdatePlaylist**](PlaylistResourceApi.md#partialUpdatePlaylist) | **PATCH** api/playlists/{id} | 
[**updatePlaylist**](PlaylistResourceApi.md#updatePlaylist) | **PUT** api/playlists/{id} | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PlaylistResourceApi::class.java)
val playlistDTO : PlaylistDTO =  // PlaylistDTO | 

launch(Dispatchers.IO) {
    val result : PlaylistDTO = webService.createPlaylist(playlistDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistDTO** | [**PlaylistDTO**](PlaylistDTO.md)|  |

### Return type

[**PlaylistDTO**](PlaylistDTO.md)

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
val webService = apiClient.createWebservice(PlaylistResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    webService.deletePlaylist(id)
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
val webService = apiClient.createWebservice(PlaylistResourceApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.

launch(Dispatchers.IO) {
    val result : kotlin.collections.MutableList<PlaylistDTO> = webService.getAllPlaylists(page, size, sort)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **kotlin.Int**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**kotlin.collections.MutableList&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.collections.MutableList&lt;PlaylistDTO&gt;**](PlaylistDTO.md)

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
val webService = apiClient.createWebservice(PlaylistResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : PlaylistDTO = webService.getPlaylist(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**PlaylistDTO**](PlaylistDTO.md)

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
val webService = apiClient.createWebservice(PlaylistResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val playlistDTO : PlaylistDTO =  // PlaylistDTO | 

launch(Dispatchers.IO) {
    val result : PlaylistDTO = webService.partialUpdatePlaylist(id, playlistDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **playlistDTO** | [**PlaylistDTO**](PlaylistDTO.md)|  |

### Return type

[**PlaylistDTO**](PlaylistDTO.md)

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
val webService = apiClient.createWebservice(PlaylistResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val playlistDTO : PlaylistDTO =  // PlaylistDTO | 

launch(Dispatchers.IO) {
    val result : PlaylistDTO = webService.updatePlaylist(id, playlistDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **playlistDTO** | [**PlaylistDTO**](PlaylistDTO.md)|  |

### Return type

[**PlaylistDTO**](PlaylistDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


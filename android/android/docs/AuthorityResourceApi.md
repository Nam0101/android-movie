# AuthorityResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthority**](AuthorityResourceApi.md#createAuthority) | **POST** api/authorities | 
[**deleteAuthority**](AuthorityResourceApi.md#deleteAuthority) | **DELETE** api/authorities/{id} | 
[**getAllAuthorities**](AuthorityResourceApi.md#getAllAuthorities) | **GET** api/authorities | 
[**getAuthority**](AuthorityResourceApi.md#getAuthority) | **GET** api/authorities/{id} | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthorityResourceApi::class.java)
val authority : Authority =  // Authority | 

launch(Dispatchers.IO) {
    val result : Authority = webService.createAuthority(authority)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authority** | [**Authority**](Authority.md)|  |

### Return type

[**Authority**](Authority.md)

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
val webService = apiClient.createWebservice(AuthorityResourceApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.deleteAuthority(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

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
val webService = apiClient.createWebservice(AuthorityResourceApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.MutableList<Authority> = webService.getAllAuthorities()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.MutableList&lt;Authority&gt;**](Authority.md)

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
val webService = apiClient.createWebservice(AuthorityResourceApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : Authority = webService.getAuthority(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**Authority**](Authority.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


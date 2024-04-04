# PremiumResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPremium**](PremiumResourceApi.md#createPremium) | **POST** api/premiums | 
[**deletePremium**](PremiumResourceApi.md#deletePremium) | **DELETE** api/premiums/{id} | 
[**getAllPremiums**](PremiumResourceApi.md#getAllPremiums) | **GET** api/premiums | 
[**getPremium**](PremiumResourceApi.md#getPremium) | **GET** api/premiums/{id} | 
[**partialUpdatePremium**](PremiumResourceApi.md#partialUpdatePremium) | **PATCH** api/premiums/{id} | 
[**updatePremium**](PremiumResourceApi.md#updatePremium) | **PUT** api/premiums/{id} | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PremiumResourceApi::class.java)
val premiumDTO : PremiumDTO =  // PremiumDTO | 

launch(Dispatchers.IO) {
    val result : PremiumDTO = webService.createPremium(premiumDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **premiumDTO** | [**PremiumDTO**](PremiumDTO.md)|  |

### Return type

[**PremiumDTO**](PremiumDTO.md)

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
val webService = apiClient.createWebservice(PremiumResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    webService.deletePremium(id)
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
val webService = apiClient.createWebservice(PremiumResourceApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.

launch(Dispatchers.IO) {
    val result : kotlin.collections.MutableList<PremiumDTO> = webService.getAllPremiums(page, size, sort)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **kotlin.Int**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**kotlin.collections.MutableList&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.collections.MutableList&lt;PremiumDTO&gt;**](PremiumDTO.md)

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
val webService = apiClient.createWebservice(PremiumResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : PremiumDTO = webService.getPremium(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**PremiumDTO**](PremiumDTO.md)

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
val webService = apiClient.createWebservice(PremiumResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val premiumDTO : PremiumDTO =  // PremiumDTO | 

launch(Dispatchers.IO) {
    val result : PremiumDTO = webService.partialUpdatePremium(id, premiumDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **premiumDTO** | [**PremiumDTO**](PremiumDTO.md)|  |

### Return type

[**PremiumDTO**](PremiumDTO.md)

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
val webService = apiClient.createWebservice(PremiumResourceApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val premiumDTO : PremiumDTO =  // PremiumDTO | 

launch(Dispatchers.IO) {
    val result : PremiumDTO = webService.updatePremium(id, premiumDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **premiumDTO** | [**PremiumDTO**](PremiumDTO.md)|  |

### Return type

[**PremiumDTO**](PremiumDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


# AuthenticateControllerApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorize**](AuthenticateControllerApi.md#authorize) | **POST** api/authenticate | 
[**isAuthenticated**](AuthenticateControllerApi.md#isAuthenticated) | **GET** api/authenticate | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticateControllerApi::class.java)
val loginVM : LoginVM =  // LoginVM | 

launch(Dispatchers.IO) {
    val result : JWTToken = webService.authorize(loginVM)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginVM** | [**LoginVM**](LoginVM.md)|  |

### Return type

[**JWTToken**](JWTToken.md)

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
val webService = apiClient.createWebservice(AuthenticateControllerApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.isAuthenticated()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


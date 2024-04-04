# AccountResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAccount**](AccountResourceApi.md#activateAccount) | **GET** api/activate | 
[**changePassword**](AccountResourceApi.md#changePassword) | **POST** api/account/change-password | 
[**finishPasswordReset**](AccountResourceApi.md#finishPasswordReset) | **POST** api/account/reset-password/finish | 
[**getAccount**](AccountResourceApi.md#getAccount) | **GET** api/account | 
[**registerAccount**](AccountResourceApi.md#registerAccount) | **POST** api/register | 
[**requestPasswordReset**](AccountResourceApi.md#requestPasswordReset) | **POST** api/account/reset-password/init | 
[**saveAccount**](AccountResourceApi.md#saveAccount) | **POST** api/account | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AccountResourceApi::class.java)
val key : kotlin.String = key_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.activateAccount(key)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  |

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
val webService = apiClient.createWebservice(AccountResourceApi::class.java)
val passwordChangeDTO : PasswordChangeDTO =  // PasswordChangeDTO | 

launch(Dispatchers.IO) {
    webService.changePassword(passwordChangeDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordChangeDTO** | [**PasswordChangeDTO**](PasswordChangeDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AccountResourceApi::class.java)
val keyAndPasswordVM : KeyAndPasswordVM =  // KeyAndPasswordVM | 

launch(Dispatchers.IO) {
    webService.finishPasswordReset(keyAndPasswordVM)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyAndPasswordVM** | [**KeyAndPasswordVM**](KeyAndPasswordVM.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AccountResourceApi::class.java)

launch(Dispatchers.IO) {
    val result : AdminUserDTO = webService.getAccount()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdminUserDTO**](AdminUserDTO.md)

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
val webService = apiClient.createWebservice(AccountResourceApi::class.java)
val managedUserVM : ManagedUserVM =  // ManagedUserVM | 

launch(Dispatchers.IO) {
    webService.registerAccount(managedUserVM)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managedUserVM** | [**ManagedUserVM**](ManagedUserVM.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AccountResourceApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.requestPasswordReset(body)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined




### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AccountResourceApi::class.java)
val adminUserDTO : AdminUserDTO =  // AdminUserDTO | 

launch(Dispatchers.IO) {
    webService.saveAccount(adminUserDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminUserDTO** | [**AdminUserDTO**](AdminUserDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


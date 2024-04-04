# UserResourceApi

All URIs are relative to *https://floating-ocean-01567-cdc570f637c6.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserResourceApi.md#createUser) | **POST** api/admin/users | 
[**deleteUser**](UserResourceApi.md#deleteUser) | **DELETE** api/admin/users/{login} | 
[**getAllUsers**](UserResourceApi.md#getAllUsers) | **GET** api/admin/users | 
[**getUser**](UserResourceApi.md#getUser) | **GET** api/admin/users/{login} | 
[**updateUser**](UserResourceApi.md#updateUser) | **PUT** api/admin/users/{login} | 
[**updateUser1**](UserResourceApi.md#updateUser1) | **PUT** api/admin/users | 





### Example
```kotlin
// Import classes:
//import com.namnv.movieapp.data.*
//import com.namnv.movieapp.data.infrastructure.*
//import com.namnv.movieapp.data.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserResourceApi::class.java)
val adminUserDTO : AdminUserDTO =  // AdminUserDTO | 

launch(Dispatchers.IO) {
    val result : User = webService.createUser(adminUserDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminUserDTO** | [**AdminUserDTO**](AdminUserDTO.md)|  |

### Return type

[**User**](User.md)

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
val webService = apiClient.createWebservice(UserResourceApi::class.java)
val login : kotlin.String = login_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.deleteUser(login)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **kotlin.String**|  |

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
val webService = apiClient.createWebservice(UserResourceApi::class.java)
val page : kotlin.Int = 56 // kotlin.Int | Zero-based page index (0..N)
val size : kotlin.Int = 56 // kotlin.Int | The size of the page to be returned
val sort : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.

launch(Dispatchers.IO) {
    val result : kotlin.collections.MutableList<AdminUserDTO> = webService.getAllUsers(page, size, sort)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **kotlin.Int**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**kotlin.collections.MutableList&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.collections.MutableList&lt;AdminUserDTO&gt;**](AdminUserDTO.md)

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
val webService = apiClient.createWebservice(UserResourceApi::class.java)
val login : kotlin.String = login_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AdminUserDTO = webService.getUser(login)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **kotlin.String**|  |

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
val webService = apiClient.createWebservice(UserResourceApi::class.java)
val login : kotlin.String = login_example // kotlin.String | 
val adminUserDTO : AdminUserDTO =  // AdminUserDTO | 

launch(Dispatchers.IO) {
    val result : AdminUserDTO = webService.updateUser(login, adminUserDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **kotlin.String**|  |
 **adminUserDTO** | [**AdminUserDTO**](AdminUserDTO.md)|  |

### Return type

[**AdminUserDTO**](AdminUserDTO.md)

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
val webService = apiClient.createWebservice(UserResourceApi::class.java)
val adminUserDTO : AdminUserDTO =  // AdminUserDTO | 

launch(Dispatchers.IO) {
    val result : AdminUserDTO = webService.updateUser1(adminUserDTO)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminUserDTO** | [**AdminUserDTO**](AdminUserDTO.md)|  |

### Return type

[**AdminUserDTO**](AdminUserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


# DefaultApi

All URIs are relative to *https://{environment}.programmerzamannow.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**todolistTodolistIdDelete**](DefaultApi.md#todolistTodolistIdDelete) | **DELETE** /todolist/{todolistId} | Delete existing todolist
[**todolistTodolistIdPut**](DefaultApi.md#todolistTodolistIdPut) | **PUT** /todolist/{todolistId} | update existing todolist

<a name="todolistTodolistIdDelete"></a>
# **todolistTodolistIdDelete**
> InlineResponse200 todolistTodolistIdDelete(todolistId)

Delete existing todolist

Delete existing todolist in databases

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: TodolistAuth
ApiKeyAuth TodolistAuth = (ApiKeyAuth) defaultClient.getAuthentication("TodolistAuth");
TodolistAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TodolistAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String todolistId = "todolistId_example"; // String | Todolist for updated
try {
    InlineResponse200 result = apiInstance.todolistTodolistIdDelete(todolistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#todolistTodolistIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **todolistId** | **String**| Todolist for updated |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[TodolistAuth](../README.md#TodolistAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="todolistTodolistIdPut"></a>
# **todolistTodolistIdPut**
> Todolist todolistTodolistIdPut(body, todolistId)

update existing todolist

Update existing todolist indatabases

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: TodolistAuth
ApiKeyAuth TodolistAuth = (ApiKeyAuth) defaultClient.getAuthentication("TodolistAuth");
TodolistAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TodolistAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
CreateOrUpdateTodolist body = new CreateOrUpdateTodolist(); // CreateOrUpdateTodolist | 
String todolistId = "todolistId_example"; // String | Todolist for updated
try {
    Todolist result = apiInstance.todolistTodolistIdPut(body, todolistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#todolistTodolistIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateOrUpdateTodolist**](CreateOrUpdateTodolist.md)|  |
 **todolistId** | **String**| Todolist for updated |

### Return type

[**Todolist**](Todolist.md)

### Authorization

[TodolistAuth](../README.md#TodolistAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


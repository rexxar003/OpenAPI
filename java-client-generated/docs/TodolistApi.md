# TodolistApi

All URIs are relative to *https://{environment}.programmerzamannow.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**todolistGet**](TodolistApi.md#todolistGet) | **GET** /todolist | get all todolist
[**todolistPost**](TodolistApi.md#todolistPost) | **POST** /todolist | Create new todolist

<a name="todolistGet"></a>
# **todolistGet**
> ArrayTodolist todolistGet(includeDone, name)

get all todolist

get all todolist active by default

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TodolistApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: TodolistAuth
ApiKeyAuth TodolistAuth = (ApiKeyAuth) defaultClient.getAuthentication("TodolistAuth");
TodolistAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TodolistAuth.setApiKeyPrefix("Token");

TodolistApi apiInstance = new TodolistApi();
Boolean includeDone = true; // Boolean |  is include done todolist
String name = "name_example"; // String | Filter todolist by name
try {
    ArrayTodolist result = apiInstance.todolistGet(includeDone, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TodolistApi#todolistGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeDone** | **Boolean**|  is include done todolist | [optional]
 **name** | **String**| Filter todolist by name | [optional]

### Return type

[**ArrayTodolist**](ArrayTodolist.md)

### Authorization

[TodolistAuth](../README.md#TodolistAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="todolistPost"></a>
# **todolistPost**
> Todolist todolistPost(body)

Create new todolist

Create new todolist databases

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TodolistApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: TodolistAuth
ApiKeyAuth TodolistAuth = (ApiKeyAuth) defaultClient.getAuthentication("TodolistAuth");
TodolistAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//TodolistAuth.setApiKeyPrefix("Token");

TodolistApi apiInstance = new TodolistApi();
CreateOrUpdateTodolist body = new CreateOrUpdateTodolist(); // CreateOrUpdateTodolist | 
try {
    Todolist result = apiInstance.todolistPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TodolistApi#todolistPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateOrUpdateTodolist**](CreateOrUpdateTodolist.md)|  |

### Return type

[**Todolist**](Todolist.md)

### Authorization

[TodolistAuth](../README.md#TodolistAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


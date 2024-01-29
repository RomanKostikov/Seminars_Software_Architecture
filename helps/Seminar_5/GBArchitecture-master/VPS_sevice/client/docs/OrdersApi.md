# OrdersApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**canceledById**](OrdersApi.md#canceledById) | **DELETE** /orders/{cloud_id} | Метод отмены заказа на облако по ID
[**createCloud**](OrdersApi.md#createCloud) | **POST** /orders | Создание заказа на облако
[**getCloudById**](OrdersApi.md#getCloudById) | **GET** /orders/{cloud_id} | Метод получения заказа на облако по ID

<a name="canceledById"></a>
# **canceledById**
> canceledById(cloudId)

Метод отмены заказа на облако по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа облака
try {
    apiInstance.canceledById(cloudId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#canceledById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа облака |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCloud"></a>
# **createCloud**
> Clouds createCloud(body)

Создание заказа на облако

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
Error body = new Error(); // Error | 
try {
    Clouds result = apiInstance.createCloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#createCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Error**](Error.md)|  | [optional]

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCloudById"></a>
# **getCloudById**
> Cloud getCloudById(cloudId)

Метод получения заказа на облако по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа облака
try {
    Cloud result = apiInstance.getCloudById(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getCloudById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа облака |

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


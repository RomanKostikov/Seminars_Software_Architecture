# CustomersApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserById**](CustomersApi.md#deleteUserById) | **DELETE** /customers/{customer_id} | Метод удаления пользователя по ID
[**getAllCustomers**](CustomersApi.md#getAllCustomers) | **GET** /customers | метод получения списка покупателей на облаке

<a name="deleteUserById"></a>
# **deleteUserById**
> Customer deleteUserById(customerId)

Метод удаления пользователя по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | Идентификатор пользователя
try {
    Customer result = apiInstance.deleteUserById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#deleteUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Идентификатор пользователя |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllCustomers"></a>
# **getAllCustomers**
> Customers getAllCustomers()

метод получения списка покупателей на облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
try {
    Customers result = apiInstance.getAllCustomers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getAllCustomers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Customers**](Customers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


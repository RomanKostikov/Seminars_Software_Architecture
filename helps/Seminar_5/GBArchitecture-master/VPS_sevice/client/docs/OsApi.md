# OsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllOSs**](OsApi.md#getAllOSs) | **GET** /OS | Метод получения списка операционных систем в облаке

<a name="getAllOSs"></a>
# **getAllOSs**
> OSs getAllOSs()

Метод получения списка операционных систем в облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OsApi;


OsApi apiInstance = new OsApi();
try {
    OSs result = apiInstance.getAllOSs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsApi#getAllOSs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OSs**](OSs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeeGet**](DefaultApi.md#employeeGet) | **GET** /employee | 
[**employeeIdDelete**](DefaultApi.md#employeeIdDelete) | **DELETE** /employee/{id} | 
[**employeeIdGet**](DefaultApi.md#employeeIdGet) | **GET** /employee/{id} | 
[**employeeNameGet**](DefaultApi.md#employeeNameGet) | **GET** /employee/{name} | 
[**employeePost**](DefaultApi.md#employeePost) | **POST** /employee | 
[**employeePut**](DefaultApi.md#employeePut) | **PUT** /employee | 



## employeeGet

> List&lt;Employee&gt; employeeGet()



### Example

```java
// Import classes:
import com.sumit.pack.ApiClient;
import com.sumit.pack.ApiException;
import com.sumit.pack.Configuration;
import com.sumit.pack.models.*;
import com.sumit.pack.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Employee> result = apiInstance.employeeGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#employeeGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | returning all the employees data |  -  |


## employeeIdDelete

> List&lt;Employee&gt; employeeIdDelete(id)



### Example

```java
// Import classes:
import com.sumit.pack.ApiClient;
import com.sumit.pack.ApiException;
import com.sumit.pack.Configuration;
import com.sumit.pack.models.*;
import com.sumit.pack.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Employee id = new Employee(); // Employee | Employee id to delete employee in
        try {
            List<Employee> result = apiInstance.employeeIdDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#employeeIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Employee**](.md)| Employee id to delete employee in |

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | returning deleted employee |  -  |


## employeeIdGet

> List&lt;Employee&gt; employeeIdGet(id)



returning all emplyoees with names

### Example

```java
// Import classes:
import com.sumit.pack.ApiClient;
import com.sumit.pack.ApiException;
import com.sumit.pack.Configuration;
import com.sumit.pack.models.*;
import com.sumit.pack.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 1; // Integer | 
        try {
            List<Employee> result = apiInstance.employeeIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#employeeIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |


## employeeNameGet

> List&lt;Employee&gt; employeeNameGet(name)



returning all emplyoees with names

### Example

```java
// Import classes:
import com.sumit.pack.ApiClient;
import com.sumit.pack.ApiException;
import com.sumit.pack.Configuration;
import com.sumit.pack.models.*;
import com.sumit.pack.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String name = "sumit"; // String | 
        try {
            List<Employee> result = apiInstance.employeeNameGet(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#employeeNameGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success response |  -  |


## employeePost

> List&lt;Employee&gt; employeePost(employee)



### Example

```java
// Import classes:
import com.sumit.pack.ApiClient;
import com.sumit.pack.ApiException;
import com.sumit.pack.Configuration;
import com.sumit.pack.models.*;
import com.sumit.pack.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        List<Employee> employee = Arrays.asList(); // List<Employee> | 
        try {
            List<Employee> result = apiInstance.employeePost(employee);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#employeePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | [**List&lt;Employee&gt;**](Employee.md)|  | [optional]

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | returning inserted employee |  -  |


## employeePut

> List&lt;Employee&gt; employeePut(employee)



put operation

### Example

```java
// Import classes:
import com.sumit.pack.ApiClient;
import com.sumit.pack.ApiException;
import com.sumit.pack.Configuration;
import com.sumit.pack.models.*;
import com.sumit.pack.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        List<Employee> employee = Arrays.asList(); // List<Employee> | 
        try {
            List<Employee> result = apiInstance.employeePut(employee);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#employeePut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | [**List&lt;Employee&gt;**](Employee.md)|  | [optional]

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | returning inserted employee |  -  |


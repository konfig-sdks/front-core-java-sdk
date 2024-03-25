# ContactHandlesApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewHandle**](ContactHandlesApi.md#addNewHandle) | **POST** /contacts/{contact_id}/handles | Add contact handle |
| [**removeHandle**](ContactHandlesApi.md#removeHandle) | **DELETE** /contacts/{contact_id}/handles | Delete contact handle |


<a name="addNewHandle"></a>
# **addNewHandle**
> addNewHandle(contactId).contactHandle(contactHandle).execute();

Add contact handle

Adds a new handle to a contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactHandlesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontCore client = new FrontCore(configuration);
    String handle = "handle_example"; // Handle used to reach the contact.
    String source = "twitter"; // Source of the handle. Can be `email`, `phone`, `twitter`, `facebook`, `intercom`, `front_chat`, or `custom`.
    String contactId = "crd_123"; // The contact ID. Alternatively, you can supply the contact's source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      client
              .contactHandles
              .addNewHandle(handle, source, contactId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactHandlesApi#addNewHandle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .contactHandles
              .addNewHandle(handle, source, contactId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactHandlesApi#addNewHandle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contactId** | **String**| The contact ID. Alternatively, you can supply the contact&#39;s source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to crd_123] |
| **contactHandle** | [**ContactHandle**](ContactHandle.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |

<a name="removeHandle"></a>
# **removeHandle**
> removeHandle(contactId).deleteContactHandle(deleteContactHandle).execute();

Delete contact handle

Remove a handle from a contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactHandlesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontCore client = new FrontCore(configuration);
    String contactId = "crd_123"; // The contact ID. Alternatively, you can supply the contact's source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String handle = "handle_example"; // Handle used to reach the contact.
    String source = "twitter"; // Source of the handle. Can be `email`, `phone`, `twitter`, `facebook`, `intercom`, `front_chat`, or `custom`.
    Boolean force = false; // Force the deletetion of the contact if the handle is the last one
    try {
      client
              .contactHandles
              .removeHandle(contactId)
              .handle(handle)
              .source(source)
              .force(force)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactHandlesApi#removeHandle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .contactHandles
              .removeHandle(contactId)
              .handle(handle)
              .source(source)
              .force(force)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactHandlesApi#removeHandle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contactId** | **String**| The contact ID. Alternatively, you can supply the contact&#39;s source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to crd_123] |
| **deleteContactHandle** | [**DeleteContactHandle**](DeleteContactHandle.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |


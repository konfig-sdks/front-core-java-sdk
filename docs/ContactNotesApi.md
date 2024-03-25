# ContactNotesApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewNote**](ContactNotesApi.md#createNewNote) | **POST** /contacts/{contact_id}/notes | Add note |
| [**list**](ContactNotesApi.md#list) | **GET** /contacts/{contact_id}/notes | List notes |


<a name="createNewNote"></a>
# **createNewNote**
> ContactNoteResponses createNewNote(contactId).createContactNote(createContactNote).execute();

Add note

Create a new note on a contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactNotesApi;
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
    String authorId = "authorId_example"; // ID of teammate creating the note
    String body = "body_example"; // Content of the note
    String contactId = "crd_123"; // The contact ID. Alternatively, you can supply the contact's source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      ContactNoteResponses result = client
              .contactNotes
              .createNewNote(authorId, body, contactId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getBody());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactNotesApi#createNewNote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContactNoteResponses> response = client
              .contactNotes
              .createNewNote(authorId, body, contactId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactNotesApi#createNewNote");
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
| **createContactNote** | [**CreateContactNote**](CreateContactNote.md)|  | [optional] |

### Return type

[**ContactNoteResponses**](ContactNoteResponses.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A contact note |  -  |

<a name="list"></a>
# **list**
> ContactNotesListResponse list(contactId).execute();

List notes

List the notes added to a contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactNotesApi;
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
    try {
      ContactNotesListResponse result = client
              .contactNotes
              .list(contactId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactNotesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContactNotesListResponse> response = client
              .contactNotes
              .list(contactId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactNotesApi#list");
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

### Return type

[**ContactNotesListResponse**](ContactNotesListResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Array of contact notes |  -  |


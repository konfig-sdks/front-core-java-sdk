# EventsApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEvent**](EventsApi.md#getEvent) | **GET** /events/{event_id} | Get event |
| [**listDetailedInboxEvents**](EventsApi.md#listDetailedInboxEvents) | **GET** /events | List events |


<a name="getEvent"></a>
# **getEvent**
> EventResponse getEvent(eventId).execute();

Get event

Fetch an event. Refer to the [Events](https://dev.frontapp.com/reference/events) topic for more information, including sorting and filtering. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
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
    String eventId = "evt_55c8c149"; // The event ID
    try {
      EventResponse result = client
              .events
              .getEvent(eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEmittedAt());
      System.out.println(result.getSource());
      System.out.println(result.getTarget());
      System.out.println(result.getConversation());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventResponse> response = client
              .events
              .getEvent(eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEvent");
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
| **eventId** | **String**| The event ID | [default to evt_55c8c149] |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An event |  -  |

<a name="listDetailedInboxEvents"></a>
# **listDetailedInboxEvents**
> ConversationsListEventsResponse listDetailedInboxEvents().q(q).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List events

Lists all the detailed events which occured in the inboxes of the company ordered in reverse chronological order (newest first). Refer to the [Events](https://dev.frontapp.com/reference/events) topic for more information, including sorting and filtering. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
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
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with optional properties `before`, `after`, or `types`. `before` and `after` should be a timestamp in seconds with up to 3 decimal places. `types` should be a list of [event types](https://dev.frontapp.com/reference/events).
    Integer limit = 15; // Max number of results per page (max 15)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the events. Only supports `created_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      ConversationsListEventsResponse result = client
              .events
              .listDetailedInboxEvents()
              .q(q)
              .limit(limit)
              .pageToken(pageToken)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listDetailedInboxEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsListEventsResponse> response = client
              .events
              .listDetailedInboxEvents()
              .q(q)
              .limit(limit)
              .pageToken(pageToken)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listDetailedInboxEvents");
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
| **q** | **String**| [Search query object](https://dev.frontapp.com/docs/query-object-q) with optional properties &#x60;before&#x60;, &#x60;after&#x60;, or &#x60;types&#x60;. &#x60;before&#x60; and &#x60;after&#x60; should be a timestamp in seconds with up to 3 decimal places. &#x60;types&#x60; should be a list of [event types](https://dev.frontapp.com/reference/events). | [optional] |
| **limit** | **Integer**| Max number of results per page (max 15) | [optional] [default to 15] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the events. Only supports &#x60;created_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**ConversationsListEventsResponse**](ConversationsListEventsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of events |  -  |


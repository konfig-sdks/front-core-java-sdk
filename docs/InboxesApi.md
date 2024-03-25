# InboxesApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTeammateAccess**](InboxesApi.md#addTeammateAccess) | **POST** /inboxes/{inbox_id}/teammates | Add inbox access |
| [**createDefaultTeamInbox**](InboxesApi.md#createDefaultTeamInbox) | **POST** /inboxes | Create inbox |
| [**createTeamInbox**](InboxesApi.md#createTeamInbox) | **POST** /teams/{team_id}/inboxes | Create team inbox |
| [**getInbox**](InboxesApi.md#getInbox) | **GET** /inboxes/{inbox_id} | Get inbox |
| [**listChannels**](InboxesApi.md#listChannels) | **GET** /inboxes/{inbox_id}/channels | List inbox channels |
| [**listConversationsInbox**](InboxesApi.md#listConversationsInbox) | **GET** /inboxes/{inbox_id}/conversations | List inbox conversations |
| [**listInboxes**](InboxesApi.md#listInboxes) | **GET** /inboxes | List inboxes |
| [**listTeamInboxes**](InboxesApi.md#listTeamInboxes) | **GET** /teams/{team_id}/inboxes | List team inboxes |
| [**listTeammatesAccess**](InboxesApi.md#listTeammatesAccess) | **GET** /inboxes/{inbox_id}/teammates | List inbox access |
| [**removeAccess**](InboxesApi.md#removeAccess) | **DELETE** /inboxes/{inbox_id}/teammates | Removes inbox access |


<a name="addTeammateAccess"></a>
# **addTeammateAccess**
> addTeammateAccess(inboxId).teammateIds(teammateIds).execute();

Add inbox access

Give access to one or more teammates to an inbox.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    List<String> teammateIds = Arrays.asList();
    String inboxId = "inb_123"; // The Inbox ID
    try {
      client
              .inboxes
              .addTeammateAccess(teammateIds, inboxId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#addTeammateAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .inboxes
              .addTeammateAccess(teammateIds, inboxId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#addTeammateAccess");
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
| **inboxId** | **String**| The Inbox ID | [default to inb_123] |
| **teammateIds** | [**TeammateIds**](TeammateIds.md)| Teammate IDs to add. Alternatively, you can supply teammate emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [optional] |

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

<a name="createDefaultTeamInbox"></a>
# **createDefaultTeamInbox**
> createDefaultTeamInbox().createInbox(createInbox).execute();

Create inbox

Create an inbox in the default team (workspace). The default team will be the oldest team created that still exists at the time of the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    String name = "name_example"; // The name of the inbox
    List<String> teammateIds = Arrays.asList(); // An array of teammate IDs that should have access to the inbox. Alternatively, you can supply teammate emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      client
              .inboxes
              .createDefaultTeamInbox(name)
              .teammateIds(teammateIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#createDefaultTeamInbox");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .inboxes
              .createDefaultTeamInbox(name)
              .teammateIds(teammateIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#createDefaultTeamInbox");
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
| **createInbox** | [**CreateInbox**](CreateInbox.md)| Inbox details | [optional] |

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

<a name="createTeamInbox"></a>
# **createTeamInbox**
> createTeamInbox(teamId).createInbox(createInbox).execute();

Create team inbox

Create an inbox for a team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    String name = "name_example"; // The name of the inbox
    String teamId = "tim_123"; // The team ID
    List<String> teammateIds = Arrays.asList(); // An array of teammate IDs that should have access to the inbox. Alternatively, you can supply teammate emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      client
              .inboxes
              .createTeamInbox(name, teamId)
              .teammateIds(teammateIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#createTeamInbox");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .inboxes
              .createTeamInbox(name, teamId)
              .teammateIds(teammateIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#createTeamInbox");
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
| **teamId** | **String**| The team ID | [default to tim_123] |
| **createInbox** | [**CreateInbox**](CreateInbox.md)| Inbox details | [optional] |

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

<a name="getInbox"></a>
# **getInbox**
> Object getInbox(inboxId).execute();

Get inbox

Fetch an inbox.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    String inboxId = "inb_123"; // The Inbox ID
    try {
      Object result = client
              .inboxes
              .getInbox(inboxId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#getInbox");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .inboxes
              .getInbox(inboxId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#getInbox");
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
| **inboxId** | **String**| The Inbox ID | [default to inb_123] |

### Return type

**Object**

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An inbox |  -  |

<a name="listChannels"></a>
# **listChannels**
> ChannelsListResponse listChannels(inboxId).execute();

List inbox channels

List the channels in an inbox.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    String inboxId = "inb_123"; // The Inbox ID
    try {
      ChannelsListResponse result = client
              .inboxes
              .listChannels(inboxId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChannelsListResponse> response = client
              .inboxes
              .listChannels(inboxId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listChannels");
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
| **inboxId** | **String**| The Inbox ID | [default to inb_123] |

### Return type

[**ChannelsListResponse**](ChannelsListResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Channels |  -  |

<a name="listConversationsInbox"></a>
# **listConversationsInbox**
> ContactsListConversationsReverseChronologicalOrderResponse listConversationsInbox(inboxId).q(q).limit(limit).pageToken(pageToken).execute();

List inbox conversations

List the conversations in an inbox. For more advanced filtering, see the [search endpoint](https://dev.frontapp.com/reference/conversations#search-conversations). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    String inboxId = "inb_123"; // The Inbox ID
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property `statuses`, whose value should be a list of conversation statuses (`assigned`, `unassigned`, `archived`, or `deleted`).
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    try {
      ContactsListConversationsReverseChronologicalOrderResponse result = client
              .inboxes
              .listConversationsInbox(inboxId)
              .q(q)
              .limit(limit)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listConversationsInbox");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContactsListConversationsReverseChronologicalOrderResponse> response = client
              .inboxes
              .listConversationsInbox(inboxId)
              .q(q)
              .limit(limit)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listConversationsInbox");
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
| **inboxId** | **String**| The Inbox ID | [default to inb_123] |
| **q** | **String**| [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property &#x60;statuses&#x60;, whose value should be a list of conversation statuses (&#x60;assigned&#x60;, &#x60;unassigned&#x60;, &#x60;archived&#x60;, or &#x60;deleted&#x60;). | [optional] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |

### Return type

[**ContactsListConversationsReverseChronologicalOrderResponse**](ContactsListConversationsReverseChronologicalOrderResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of conversations |  -  |

<a name="listInboxes"></a>
# **listInboxes**
> ConversationsListInboxesResponse listInboxes().execute();

List inboxes

List the inboxes of the company.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    try {
      ConversationsListInboxesResponse result = client
              .inboxes
              .listInboxes()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listInboxes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsListInboxesResponse> response = client
              .inboxes
              .listInboxes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listInboxes");
      System.err.println("Status code: " + e.getStatusCode());
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

[**ConversationsListInboxesResponse**](ConversationsListInboxesResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Inboxes |  -  |

<a name="listTeamInboxes"></a>
# **listTeamInboxes**
> ConversationsListInboxesResponse listTeamInboxes(teamId).execute();

List team inboxes

List the inboxes belonging to a team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    String teamId = "tim_123"; // The team ID
    try {
      ConversationsListInboxesResponse result = client
              .inboxes
              .listTeamInboxes(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listTeamInboxes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsListInboxesResponse> response = client
              .inboxes
              .listTeamInboxes(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listTeamInboxes");
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
| **teamId** | **String**| The team ID | [default to tim_123] |

### Return type

[**ConversationsListInboxesResponse**](ConversationsListInboxesResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Inboxes |  -  |

<a name="listTeammatesAccess"></a>
# **listTeammatesAccess**
> CommentsListMentionedTeammatesResponse listTeammatesAccess(inboxId).execute();

List inbox access

List the teammates with access to an inbox.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    String inboxId = "inb_123"; // The Inbox ID
    try {
      CommentsListMentionedTeammatesResponse result = client
              .inboxes
              .listTeammatesAccess(inboxId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listTeammatesAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommentsListMentionedTeammatesResponse> response = client
              .inboxes
              .listTeammatesAccess(inboxId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#listTeammatesAccess");
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
| **inboxId** | **String**| The Inbox ID | [default to inb_123] |

### Return type

[**CommentsListMentionedTeammatesResponse**](CommentsListMentionedTeammatesResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of teammates |  -  |

<a name="removeAccess"></a>
# **removeAccess**
> removeAccess(inboxId).teammateIds(teammateIds).execute();

Removes inbox access

Remove access of one or more teammates from an inbox.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboxesApi;
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
    List<String> teammateIds = Arrays.asList();
    String inboxId = "inb_123"; // The Inbox ID
    try {
      client
              .inboxes
              .removeAccess(teammateIds, inboxId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#removeAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .inboxes
              .removeAccess(teammateIds, inboxId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxesApi#removeAccess");
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
| **inboxId** | **String**| The Inbox ID | [default to inb_123] |
| **teammateIds** | [**TeammateIds**](TeammateIds.md)| Teammate IDs to remove. Alternatively, you can supply teammate emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [optional] |

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


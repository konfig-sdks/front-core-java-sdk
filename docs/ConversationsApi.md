# ConversationsApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFollowers**](ConversationsApi.md#addFollowers) | **POST** /conversations/{conversation_id}/followers | Add conversation followers |
| [**addLink**](ConversationsApi.md#addLink) | **POST** /conversations/{conversation_id}/links | Add conversation link |
| [**addTagsToConversation**](ConversationsApi.md#addTagsToConversation) | **POST** /conversations/{conversation_id}/tags | Add conversation tag |
| [**createDiscussion**](ConversationsApi.md#createDiscussion) | **POST** /conversations | Create discussion conversation |
| [**getById**](ConversationsApi.md#getById) | **GET** /conversations/{conversation_id} | Get conversation |
| [**listEvents**](ConversationsApi.md#listEvents) | **GET** /conversations/{conversation_id}/events | List conversation events |
| [**listFollowers**](ConversationsApi.md#listFollowers) | **GET** /conversations/{conversation_id}/followers | List conversation followers |
| [**listInReverseChronologicalOrder**](ConversationsApi.md#listInReverseChronologicalOrder) | **GET** /conversations | List conversations |
| [**listInboxes**](ConversationsApi.md#listInboxes) | **GET** /conversations/{conversation_id}/inboxes | List conversation inboxes |
| [**listMessagesInReverseChronologicalOrder**](ConversationsApi.md#listMessagesInReverseChronologicalOrder) | **GET** /conversations/{conversation_id}/messages | List conversation messages |
| [**removeFollowers**](ConversationsApi.md#removeFollowers) | **DELETE** /conversations/{conversation_id}/followers | Delete conversation followers |
| [**removeLinks**](ConversationsApi.md#removeLinks) | **DELETE** /conversations/{conversation_id}/links | Remove conversation links |
| [**removeTag**](ConversationsApi.md#removeTag) | **DELETE** /conversations/{conversation_id}/tags | Remove conversation tag |
| [**searchByQuery**](ConversationsApi.md#searchByQuery) | **GET** /conversations/search/{query} | Search conversations |
| [**updateAssignee**](ConversationsApi.md#updateAssignee) | **PUT** /conversations/{conversation_id}/assignee | Update conversation assignee |
| [**updateConversationById**](ConversationsApi.md#updateConversationById) | **PATCH** /conversations/{conversation_id} | Update conversation |
| [**updateReminders**](ConversationsApi.md#updateReminders) | **PATCH** /conversations/{conversation_id}/reminders | Update conversation reminders |


<a name="addFollowers"></a>
# **addFollowers**
> addFollowers(conversationId).conversationsAddFollowersRequest(conversationsAddFollowersRequest).execute();

Add conversation followers

Adds teammates to the list of followers of a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    List<String> teammateIds = Arrays.asList(); // IDs of the teammate to add to the followers list. Alternatively, you can supply the teammates as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String conversationId = "cnv_123"; // The conversation ID
    try {
      client
              .conversations
              .addFollowers(teammateIds, conversationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#addFollowers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .addFollowers(teammateIds, conversationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#addFollowers");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **conversationsAddFollowersRequest** | [**ConversationsAddFollowersRequest**](ConversationsAddFollowersRequest.md)|  | [optional] |

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

<a name="addLink"></a>
# **addLink**
> addLink(conversationId).conversationsAddLinkRequest(conversationsAddLinkRequest).execute();

Add conversation link

Adds one or more links to a conversation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    List<String> linkIds = Arrays.asList(); // Link IDs to add. Either link_ids or link_external_urls must be specified but not both
    List<String> linkExternalUrls = Arrays.asList(); // Link external URLs to add. Creates links if necessary. Either link_ids or link_external_urls must be specified but not both
    try {
      client
              .conversations
              .addLink(conversationId)
              .linkIds(linkIds)
              .linkExternalUrls(linkExternalUrls)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#addLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .addLink(conversationId)
              .linkIds(linkIds)
              .linkExternalUrls(linkExternalUrls)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#addLink");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **conversationsAddLinkRequest** | [**ConversationsAddLinkRequest**](ConversationsAddLinkRequest.md)|  | [optional] |

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

<a name="addTagsToConversation"></a>
# **addTagsToConversation**
> addTagsToConversation(conversationId).tagIds(tagIds).execute();

Add conversation tag

Adds one or more tags to a conversation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    List<String> tagIds = Arrays.asList();
    List<String> teammateIds = Arrays.asList();
    List<String> channelIds = Arrays.asList();
    List<String> inboxIds = Arrays.asList();
    List<String> teamIds = Arrays.asList();
    List<String> accountIds = Arrays.asList();
    try {
      client
              .conversations
              .addTagsToConversation(conversationId)
              .tagIds(tagIds)
              .teammateIds(teammateIds)
              .channelIds(channelIds)
              .inboxIds(inboxIds)
              .teamIds(teamIds)
              .accountIds(accountIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#addTagsToConversation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .addTagsToConversation(conversationId)
              .tagIds(tagIds)
              .teammateIds(teammateIds)
              .channelIds(channelIds)
              .inboxIds(inboxIds)
              .teamIds(teamIds)
              .accountIds(accountIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#addTagsToConversation");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **tagIds** | [**TagIds**](TagIds.md)| Tag IDs to add | [optional] |

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

<a name="createDiscussion"></a>
# **createDiscussion**
> Object createDiscussion().createConversation(createConversation).execute();

Create discussion conversation

Create a new [conversation](https://dev.frontapp.com/reference/conversations#creating-a-new-conversation) that only supports comments (known as discussions in Front). If you want to create a conversation that supports messages, use the [Create message](https://dev.frontapp.com/reference/post_channels-channel-id-messages) endpoint. If you want to add a comment to an existing conversation, use the [Add comment](https://dev.frontapp.com/reference/post_conversations-conversation-id-comments) endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String type = "discussion"; // Conversation type
    String subject = "subject_example"; // Subject of the conversation
    CreateConversationComment comment = new CreateConversationComment();
    String inboxId = "inboxId_example"; // Inbox ID for the conversation. Either `inbox_id` OR `teammate_ids` must be provided (not both).
    List<String> teammateIds = Arrays.asList(); // Teammates to add to the conversation. Either `inbox_id` OR `teammate_ids` must be provided (not both).
    try {
      Object result = client
              .conversations
              .createDiscussion(type, subject, comment)
              .inboxId(inboxId)
              .teammateIds(teammateIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#createDiscussion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .conversations
              .createDiscussion(type, subject, comment)
              .inboxId(inboxId)
              .teammateIds(teammateIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#createDiscussion");
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
| **createConversation** | [**CreateConversation**](CreateConversation.md)|  | [optional] |

### Return type

**Object**

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A conversation |  -  |

<a name="getById"></a>
# **getById**
> Object getById(conversationId).execute();

Get conversation

Fetch a conversation. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    try {
      Object result = client
              .conversations
              .getById(conversationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .conversations
              .getById(conversationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getById");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |

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
| **200** | A conversation |  -  |

<a name="listEvents"></a>
# **listEvents**
> ConversationsListEventsResponse listEvents(conversationId).limit(limit).pageToken(pageToken).execute();

List conversation events

List the events that occured for a conversation in reverse chronological order (newest first). The order will respect your company&#39;s [bump settings](https://help.front.com/t/y729th/customize-when-conversations-bump-up), which determine when conversations bump to the top.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    try {
      ConversationsListEventsResponse result = client
              .conversations
              .listEvents(conversationId)
              .limit(limit)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsListEventsResponse> response = client
              .conversations
              .listEvents(conversationId)
              .limit(limit)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listEvents");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |

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

<a name="listFollowers"></a>
# **listFollowers**
> CommentsListMentionedTeammatesResponse listFollowers(conversationId).execute();

List conversation followers

List the teammates following a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    try {
      CommentsListMentionedTeammatesResponse result = client
              .conversations
              .listFollowers(conversationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listFollowers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommentsListMentionedTeammatesResponse> response = client
              .conversations
              .listFollowers(conversationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listFollowers");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |

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

<a name="listInReverseChronologicalOrder"></a>
# **listInReverseChronologicalOrder**
> ContactsListConversationsReverseChronologicalOrderResponse listInReverseChronologicalOrder().q(q).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List conversations

List the conversations in the company in reverse chronological order (most recently updated first). The order will respect your company&#39;s [bump settings](https://help.front.com/t/y729th/customize-when-conversations-bump-up), which determine when conversations bump to the top. For more advanced filtering, see the [search endpoint](https://dev.frontapp.com/reference/conversations#search-conversations). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property `statuses`, whose value should be a list of conversation statuses (`assigned`, `unassigned`, `archived`, or `deleted`).
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the conversations. Only supports `date`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      ContactsListConversationsReverseChronologicalOrderResponse result = client
              .conversations
              .listInReverseChronologicalOrder()
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
      System.err.println("Exception when calling ConversationsApi#listInReverseChronologicalOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContactsListConversationsReverseChronologicalOrderResponse> response = client
              .conversations
              .listInReverseChronologicalOrder()
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
      System.err.println("Exception when calling ConversationsApi#listInReverseChronologicalOrder");
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
| **q** | **String**| [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property &#x60;statuses&#x60;, whose value should be a list of conversation statuses (&#x60;assigned&#x60;, &#x60;unassigned&#x60;, &#x60;archived&#x60;, or &#x60;deleted&#x60;). | [optional] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the conversations. Only supports &#x60;date&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

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
> ConversationsListInboxesResponse listInboxes(conversationId).execute();

List conversation inboxes

List the inboxes in which a conversation is listed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    try {
      ConversationsListInboxesResponse result = client
              .conversations
              .listInboxes(conversationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listInboxes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsListInboxesResponse> response = client
              .conversations
              .listInboxes(conversationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listInboxes");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |

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

<a name="listMessagesInReverseChronologicalOrder"></a>
# **listMessagesInReverseChronologicalOrder**
> DraftsListConversationDraftsResponse listMessagesInReverseChronologicalOrder(conversationId).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List conversation messages

List the messages in a conversation in reverse chronological order (newest first).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the messages. Only supports `created_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      DraftsListConversationDraftsResponse result = client
              .conversations
              .listMessagesInReverseChronologicalOrder(conversationId)
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
      System.err.println("Exception when calling ConversationsApi#listMessagesInReverseChronologicalOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DraftsListConversationDraftsResponse> response = client
              .conversations
              .listMessagesInReverseChronologicalOrder(conversationId)
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
      System.err.println("Exception when calling ConversationsApi#listMessagesInReverseChronologicalOrder");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the messages. Only supports &#x60;created_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**DraftsListConversationDraftsResponse**](DraftsListConversationDraftsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of messages |  -  |

<a name="removeFollowers"></a>
# **removeFollowers**
> removeFollowers(conversationId).conversationsRemoveFollowersRequest(conversationsRemoveFollowersRequest).execute();

Delete conversation followers

Removes teammates from the list of followers of a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    List<String> teammateIds = Arrays.asList(); // IDs of the teammate to remove from the followers list. Alternatively, you can supply the teammates as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String conversationId = "cnv_123"; // The conversation ID
    try {
      client
              .conversations
              .removeFollowers(teammateIds, conversationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#removeFollowers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .removeFollowers(teammateIds, conversationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#removeFollowers");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **conversationsRemoveFollowersRequest** | [**ConversationsRemoveFollowersRequest**](ConversationsRemoveFollowersRequest.md)|  | [optional] |

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

<a name="removeLinks"></a>
# **removeLinks**
> removeLinks(conversationId).conversationsRemoveLinksRequest(conversationsRemoveLinksRequest).execute();

Remove conversation links

Removes one or more links to a conversation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    List<String> linkIds = Arrays.asList(); // Link IDs to remove.
    String conversationId = "cnv_123"; // The conversation ID
    try {
      client
              .conversations
              .removeLinks(linkIds, conversationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#removeLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .removeLinks(linkIds, conversationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#removeLinks");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **conversationsRemoveLinksRequest** | [**ConversationsRemoveLinksRequest**](ConversationsRemoveLinksRequest.md)|  | [optional] |

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

<a name="removeTag"></a>
# **removeTag**
> removeTag(conversationId).tagIds(tagIds).execute();

Remove conversation tag

Removes one or more tags to a conversation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    List<String> tagIds = Arrays.asList();
    List<String> teammateIds = Arrays.asList();
    List<String> channelIds = Arrays.asList();
    List<String> inboxIds = Arrays.asList();
    List<String> teamIds = Arrays.asList();
    List<String> accountIds = Arrays.asList();
    try {
      client
              .conversations
              .removeTag(conversationId)
              .tagIds(tagIds)
              .teammateIds(teammateIds)
              .channelIds(channelIds)
              .inboxIds(inboxIds)
              .teamIds(teamIds)
              .accountIds(accountIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#removeTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .removeTag(conversationId)
              .tagIds(tagIds)
              .teammateIds(teammateIds)
              .channelIds(channelIds)
              .inboxIds(inboxIds)
              .teamIds(teamIds)
              .accountIds(accountIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#removeTag");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **tagIds** | [**TagIds**](TagIds.md)| Tag IDs to remove | [optional] |

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

<a name="searchByQuery"></a>
# **searchByQuery**
> ConversationsSearchByQueryResponse searchByQuery(query).limit(limit).pageToken(pageToken).execute();

Search conversations

Search for conversations. Response will include a count of total matches and an array of conversations in descending order by last activity. See the [search syntax documentation](https://dev.frontapp.com/docs/search-1) for usage examples. **Note:** This endpoint is subject to [proportional rate limiting](https://dev.frontapp.com/docs/rate-limiting#additional-proportional-limiting) at 40% of your company&#39;s rate limit. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String query = "inbox:inb_123 tag:tag_345"; // Search query string. See [Search](https://dev.frontapp.com/docs/search-1) topic for usage details.
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    try {
      ConversationsSearchByQueryResponse result = client
              .conversations
              .searchByQuery(query)
              .limit(limit)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getTotal());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#searchByQuery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsSearchByQueryResponse> response = client
              .conversations
              .searchByQuery(query)
              .limit(limit)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#searchByQuery");
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
| **query** | **String**| Search query string. See [Search](https://dev.frontapp.com/docs/search-1) topic for usage details. | [default to inbox:inb_123 tag:tag_345] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |

### Return type

[**ConversationsSearchByQueryResponse**](ConversationsSearchByQueryResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of conversation search results |  -  |

<a name="updateAssignee"></a>
# **updateAssignee**
> updateAssignee(conversationId).updateConversationAssignee(updateConversationAssignee).execute();

Update conversation assignee

Assign or unassign a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String assigneeId = "assigneeId_example"; // ID of the teammate to assign the conversation to. Set it to null to unassign.
    String conversationId = "cnv_123"; // The conversation ID
    try {
      client
              .conversations
              .updateAssignee(assigneeId, conversationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#updateAssignee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .updateAssignee(assigneeId, conversationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#updateAssignee");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **updateConversationAssignee** | [**UpdateConversationAssignee**](UpdateConversationAssignee.md)|  | [optional] |

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

<a name="updateConversationById"></a>
# **updateConversationById**
> updateConversationById(conversationId).updateConversation(updateConversation).execute();

Update conversation

Update a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "cnv_123"; // The conversation ID
    String assigneeId = "assigneeId_example"; // ID of the teammate to assign the conversation to. Set it to null to unassign.
    String inboxId = "inboxId_example"; // ID of the inbox to move the conversation to.
    String status = "archived"; // New status of the conversation
    List<String> tagIds = Arrays.asList(); // List of all the tag IDs replacing the old conversation tags
    Object customFields = null; // Custom field attributes for this conversation. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields.
    try {
      client
              .conversations
              .updateConversationById(conversationId)
              .assigneeId(assigneeId)
              .inboxId(inboxId)
              .status(status)
              .tagIds(tagIds)
              .customFields(customFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#updateConversationById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .updateConversationById(conversationId)
              .assigneeId(assigneeId)
              .inboxId(inboxId)
              .status(status)
              .tagIds(tagIds)
              .customFields(customFields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#updateConversationById");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **updateConversation** | [**UpdateConversation**](UpdateConversation.md)|  | [optional] |

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
| **400** | Invalid input, such as invalid custom fields |  -  |

<a name="updateReminders"></a>
# **updateReminders**
> updateReminders(conversationId).updateConversationReminders(updateConversationReminders).execute();

Update conversation reminders

Snooze or unsnooze a conversation for the provided user. For private conversations, reminders can only be created and edited through the API for teammates that own the conversation. For shared conversations, reminders created and edited through the API are shared for all teammates within the shared inbox(es) that the conversation belongs to. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String teammateId = "teammateId_example"; // ID of the teammate to create a reminder for. For a private conversation, specify the id of the teammate that owns the conversation. For a shared conversation, use the id of any teammate that has access to the conversation's shared inbox. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    Double scheduledAt = 3.4D; // Timestamp to schedule the reminder for. Set to null to cancel.
    String conversationId = "cnv_123"; // The conversation ID
    try {
      client
              .conversations
              .updateReminders(teammateId, scheduledAt, conversationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#updateReminders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conversations
              .updateReminders(teammateId, scheduledAt, conversationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#updateReminders");
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
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **updateConversationReminders** | [**UpdateConversationReminders**](UpdateConversationReminders.md)|  | [optional] |

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


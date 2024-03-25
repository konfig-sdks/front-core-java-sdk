# LinksApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLink**](LinksApi.md#createLink) | **POST** /links | Create link |
| [**getLink**](LinksApi.md#getLink) | **GET** /links/{link_id} | Get link |
| [**listByIdAndType**](LinksApi.md#listByIdAndType) | **GET** /links | List links |
| [**listConversations**](LinksApi.md#listConversations) | **GET** /links/{link_id}/conversations | List link conversations |
| [**updateLink**](LinksApi.md#updateLink) | **PATCH** /links/{link_id} | Update a link |


<a name="createLink"></a>
# **createLink**
> LinkResponse createLink().createLink(createLink).execute();

Create link

Create a link. You must supply either &#x60;pattern&#x60; or &#x60;external_url&#x60; in the request, but not both (&#x60;pattern&#x60; is for dynamic objects while &#x60;external_url&#x60; is for standard links). If &#x60;pattern&#x60; is provided, the API call updates the dynamic objects matching the exact pattern. If the link is resolved to an installed links integration, any name retrieved from the integration will override the provided name in the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LinksApi;
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
    String name = "name_example"; // Name of the link. If none is specified, the external_url is used as a default
    String externalUrl = "externalUrl_example"; // Underlying identifying url of the link
    String pattern = "pattern_example"; // The string that dynamic object configurations will match on to update a specific dynamic object. For example, if you've configured a dynamic object to match on ORDER-{Digits}, and you want to specifically update the dynamic objects for ORDER-777 to retrieve the latest information from external systems, send \\\"ORDER-777\\\". Repeat for other specific identifiers, such as \\\"ORDER-435\\\".
    try {
      LinkResponse result = client
              .links
              .createLink()
              .name(name)
              .externalUrl(externalUrl)
              .pattern(pattern)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getExternalUrl());
      System.out.println(result.getCustomFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#createLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinkResponse> response = client
              .links
              .createLink()
              .name(name)
              .externalUrl(externalUrl)
              .pattern(pattern)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#createLink");
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
| **createLink** | [**CreateLink**](CreateLink.md)| Link to create | [optional] |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A link |  -  |

<a name="getLink"></a>
# **getLink**
> LinkResponse getLink(linkId).execute();

Get link

Fetch a link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LinksApi;
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
    String linkId = "top_123"; // The link ID
    try {
      LinkResponse result = client
              .links
              .getLink(linkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getExternalUrl());
      System.out.println(result.getCustomFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#getLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinkResponse> response = client
              .links
              .getLink(linkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#getLink");
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
| **linkId** | **String**| The link ID | [default to top_123] |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A link |  -  |

<a name="listByIdAndType"></a>
# **listByIdAndType**
> LinksListByIdAndTypeResponse listByIdAndType().q(q).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List links

List the links of the company paginated by id. Allows filtering by link type via the q.types param.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LinksApi;
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
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property `types`, whose value should be a list of link types (examples - `web`, `jira`, `asana` ).
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the links. Only supports `id`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      LinksListByIdAndTypeResponse result = client
              .links
              .listByIdAndType()
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
      System.err.println("Exception when calling LinksApi#listByIdAndType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinksListByIdAndTypeResponse> response = client
              .links
              .listByIdAndType()
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
      System.err.println("Exception when calling LinksApi#listByIdAndType");
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
| **q** | **String**| [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property &#x60;types&#x60;, whose value should be a list of link types (examples - &#x60;web&#x60;, &#x60;jira&#x60;, &#x60;asana&#x60; ). | [optional] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the links. Only supports &#x60;id&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**LinksListByIdAndTypeResponse**](LinksListByIdAndTypeResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Links |  -  |

<a name="listConversations"></a>
# **listConversations**
> ContactsListConversationsReverseChronologicalOrderResponse listConversations(linkId).q(q).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List link conversations

List the conversations linked to a specific link. For more advanced filtering, see the [search endpoint](https://dev.frontapp.com/reference/conversations#search-conversations). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LinksApi;
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
    String linkId = "top_123"; // The Link ID
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property `statuses`, whose value should be a list of conversation statuses (`assigned`, `unassigned`, `archived`, or `deleted`).
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the conversations. Only supports `date`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      ContactsListConversationsReverseChronologicalOrderResponse result = client
              .links
              .listConversations(linkId)
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
      System.err.println("Exception when calling LinksApi#listConversations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContactsListConversationsReverseChronologicalOrderResponse> response = client
              .links
              .listConversations(linkId)
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
      System.err.println("Exception when calling LinksApi#listConversations");
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
| **linkId** | **String**| The Link ID | [default to top_123] |
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

<a name="updateLink"></a>
# **updateLink**
> updateLink(linkId).updateLink(updateLink).execute();

Update a link

Update a link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LinksApi;
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
    String linkId = "top_123"; // The link ID
    String name = "name_example"; // Name of the link
    try {
      client
              .links
              .updateLink(linkId)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#updateLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .links
              .updateLink(linkId)
              .name(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#updateLink");
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
| **linkId** | **String**| The link ID | [default to top_123] |
| **updateLink** | [**UpdateLink**](UpdateLink.md)| Link fields to update | [optional] |

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


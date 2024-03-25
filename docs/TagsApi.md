# TagsApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChildTag**](TagsApi.md#createChildTag) | **POST** /tags/{tag_id}/children | Create child tag |
| [**createCompanyTag**](TagsApi.md#createCompanyTag) | **POST** /company/tags | Create company tag |
| [**createTagOldestTeam**](TagsApi.md#createTagOldestTeam) | **POST** /tags | Create tag |
| [**createTeamTag**](TagsApi.md#createTeamTag) | **POST** /teams/{team_id}/tags | Create team tag |
| [**createTeammateTag**](TagsApi.md#createTeammateTag) | **POST** /teammates/{teammate_id}/tags | Create teammate tag |
| [**deleteTag**](TagsApi.md#deleteTag) | **DELETE** /tags/{tag_id} | Delete tag |
| [**getTag**](TagsApi.md#getTag) | **GET** /tags/{tag_id} | Get tag |
| [**listAll**](TagsApi.md#listAll) | **GET** /tags | List tags |
| [**listChildren**](TagsApi.md#listChildren) | **GET** /tags/{tag_id}/children | List tag children |
| [**listCompany**](TagsApi.md#listCompany) | **GET** /company/tags | List company tags |
| [**listTaggedConversations**](TagsApi.md#listTaggedConversations) | **GET** /tags/{tag_id}/conversations | List tagged conversations |
| [**listTeamTags**](TagsApi.md#listTeamTags) | **GET** /teams/{team_id}/tags | List team tags |
| [**listTeammateTags**](TagsApi.md#listTeammateTags) | **GET** /teammates/{teammate_id}/tags | List teammate tags |
| [**updateTag**](TagsApi.md#updateTag) | **PATCH** /tags/{tag_id} | Update a tag |


<a name="createChildTag"></a>
# **createChildTag**
> TagResponse createChildTag(tagId).createTag(createTag).execute();

Create child tag

Creates a child tag.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String name = "name_example"; // Name of the tag
    String tagId = "tag_123"; // The tag ID
    String description = "description_example"; // Description of the tag
    String highlight = "grey"; // Highlight color of the tag.
    Boolean isVisibleInConversationLists = false; // Whether the tag is visible in conversation lists.
    try {
      TagResponse result = client
              .tags
              .createChildTag(name, tagId)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getHighlight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIsVisibleInConversationLists());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createChildTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagResponse> response = client
              .tags
              .createChildTag(name, tagId)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createChildTag");
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
| **tagId** | **String**| The tag ID | [default to tag_123] |
| **createTag** | [**CreateTag**](CreateTag.md)| Child Tag to create | [optional] |

### Return type

[**TagResponse**](TagResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A tag |  -  |

<a name="createCompanyTag"></a>
# **createCompanyTag**
> TagResponse createCompanyTag().createTag(createTag).execute();

Create company tag

Create a company tag.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String name = "name_example"; // Name of the tag
    String description = "description_example"; // Description of the tag
    String highlight = "grey"; // Highlight color of the tag.
    Boolean isVisibleInConversationLists = false; // Whether the tag is visible in conversation lists.
    try {
      TagResponse result = client
              .tags
              .createCompanyTag(name)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getHighlight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIsVisibleInConversationLists());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createCompanyTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagResponse> response = client
              .tags
              .createCompanyTag(name)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createCompanyTag");
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
| **createTag** | [**CreateTag**](CreateTag.md)| Tag to create | [optional] |

### Return type

[**TagResponse**](TagResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A tag |  -  |

<a name="createTagOldestTeam"></a>
# **createTagOldestTeam**
> TagResponse createTagOldestTeam().createTag(createTag).execute();

Create tag

Create a tag in the oldest team (workspace). This is a legacy endpoint. Use the Create company tag, Create team tag, or Create teammate tag endpoints instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String name = "name_example"; // Name of the tag
    String description = "description_example"; // Description of the tag
    String highlight = "grey"; // Highlight color of the tag.
    Boolean isVisibleInConversationLists = false; // Whether the tag is visible in conversation lists.
    try {
      TagResponse result = client
              .tags
              .createTagOldestTeam(name)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getHighlight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIsVisibleInConversationLists());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createTagOldestTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagResponse> response = client
              .tags
              .createTagOldestTeam(name)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createTagOldestTeam");
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
| **createTag** | [**CreateTag**](CreateTag.md)| Tag to create | [optional] |

### Return type

[**TagResponse**](TagResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A tag |  -  |

<a name="createTeamTag"></a>
# **createTeamTag**
> TagResponse createTeamTag(teamId).createTag(createTag).execute();

Create team tag

Create a tag for a team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String name = "name_example"; // Name of the tag
    String teamId = "tim_123"; // The team ID
    String description = "description_example"; // Description of the tag
    String highlight = "grey"; // Highlight color of the tag.
    Boolean isVisibleInConversationLists = false; // Whether the tag is visible in conversation lists.
    try {
      TagResponse result = client
              .tags
              .createTeamTag(name, teamId)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getHighlight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIsVisibleInConversationLists());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createTeamTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagResponse> response = client
              .tags
              .createTeamTag(name, teamId)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createTeamTag");
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
| **createTag** | [**CreateTag**](CreateTag.md)| Tag to create | [optional] |

### Return type

[**TagResponse**](TagResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A tag |  -  |

<a name="createTeammateTag"></a>
# **createTeammateTag**
> TagResponse createTeammateTag(teammateId).createTag(createTag).execute();

Create teammate tag

Create a tag for a teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String name = "name_example"; // Name of the tag
    String teammateId = "tea_123"; // The teammate ID. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String description = "description_example"; // Description of the tag
    String highlight = "grey"; // Highlight color of the tag.
    Boolean isVisibleInConversationLists = false; // Whether the tag is visible in conversation lists.
    try {
      TagResponse result = client
              .tags
              .createTeammateTag(name, teammateId)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getHighlight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIsVisibleInConversationLists());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createTeammateTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagResponse> response = client
              .tags
              .createTeammateTag(name, teammateId)
              .description(description)
              .highlight(highlight)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createTeammateTag");
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
| **teammateId** | **String**| The teammate ID. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to tea_123] |
| **createTag** | [**CreateTag**](CreateTag.md)| Tag to create | [optional] |

### Return type

[**TagResponse**](TagResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A tag |  -  |

<a name="deleteTag"></a>
# **deleteTag**
> deleteTag(tagId).execute();

Delete tag

Delete a tag.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String tagId = "tag_123"; // The ID of the tag to delete
    try {
      client
              .tags
              .deleteTag(tagId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#deleteTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tags
              .deleteTag(tagId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#deleteTag");
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
| **tagId** | **String**| The ID of the tag to delete | [default to tag_123] |

### Return type

null (empty response body)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |

<a name="getTag"></a>
# **getTag**
> TagResponse getTag(tagId).execute();

Get tag

Fetch a tag.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String tagId = "tag_123"; // The tag ID
    try {
      TagResponse result = client
              .tags
              .getTag(tagId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getHighlight());
      System.out.println(result.getIsPrivate());
      System.out.println(result.getIsVisibleInConversationLists());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#getTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagResponse> response = client
              .tags
              .getTag(tagId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#getTag");
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
| **tagId** | **String**| The tag ID | [default to tag_123] |

### Return type

[**TagResponse**](TagResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A tag |  -  |

<a name="listAll"></a>
# **listAll**
> TagsListCompanyResponse listAll().limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List tags

List all the tags of the company that the API token has access to, whether they be company tags, team tags, or teammate tags.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the tags. Only supports `id`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      TagsListCompanyResponse result = client
              .tags
              .listAll()
              .limit(limit)
              .pageToken(pageToken)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagsListCompanyResponse> response = client
              .tags
              .listAll()
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
      System.err.println("Exception when calling TagsApi#listAll");
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
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the tags. Only supports &#x60;id&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**TagsListCompanyResponse**](TagsListCompanyResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Tags |  -  |

<a name="listChildren"></a>
# **listChildren**
> TagsListCompanyResponse listChildren(tagId).execute();

List tag children

List the children of a specific tag.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String tagId = "tag_123"; // The tag ID
    try {
      TagsListCompanyResponse result = client
              .tags
              .listChildren(tagId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#listChildren");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagsListCompanyResponse> response = client
              .tags
              .listChildren(tagId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#listChildren");
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
| **tagId** | **String**| The tag ID | [default to tag_123] |

### Return type

[**TagsListCompanyResponse**](TagsListCompanyResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Tags |  -  |

<a name="listCompany"></a>
# **listCompany**
> TagsListCompanyResponse listCompany().limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List company tags

List the company tags.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the tags. Only supports `id`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      TagsListCompanyResponse result = client
              .tags
              .listCompany()
              .limit(limit)
              .pageToken(pageToken)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#listCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagsListCompanyResponse> response = client
              .tags
              .listCompany()
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
      System.err.println("Exception when calling TagsApi#listCompany");
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
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the tags. Only supports &#x60;id&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**TagsListCompanyResponse**](TagsListCompanyResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Tags |  -  |

<a name="listTaggedConversations"></a>
# **listTaggedConversations**
> ContactsListConversationsReverseChronologicalOrderResponse listTaggedConversations(tagId).q(q).limit(limit).pageToken(pageToken).execute();

List tagged conversations

List the conversations tagged with a tag. For more advanced filtering, see the [search endpoint](https://dev.frontapp.com/reference/conversations#search-conversations). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String tagId = "tag_123"; // The ID of the tag
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property `statuses`, whose value should be a list of conversation statuses (`assigned`, `unassigned`, `archived`, or `deleted`).
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    try {
      ContactsListConversationsReverseChronologicalOrderResponse result = client
              .tags
              .listTaggedConversations(tagId)
              .q(q)
              .limit(limit)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#listTaggedConversations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContactsListConversationsReverseChronologicalOrderResponse> response = client
              .tags
              .listTaggedConversations(tagId)
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
      System.err.println("Exception when calling TagsApi#listTaggedConversations");
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
| **tagId** | **String**| The ID of the tag | [default to tag_123] |
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

<a name="listTeamTags"></a>
# **listTeamTags**
> TagsListCompanyResponse listTeamTags(teamId).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List team tags

List the tags for a team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the tags. Only supports `id`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      TagsListCompanyResponse result = client
              .tags
              .listTeamTags(teamId)
              .limit(limit)
              .pageToken(pageToken)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#listTeamTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagsListCompanyResponse> response = client
              .tags
              .listTeamTags(teamId)
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
      System.err.println("Exception when calling TagsApi#listTeamTags");
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
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the tags. Only supports &#x60;id&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**TagsListCompanyResponse**](TagsListCompanyResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Tags |  -  |

<a name="listTeammateTags"></a>
# **listTeammateTags**
> TagsListCompanyResponse listTeammateTags(teammateId).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List teammate tags

List the tags for a teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String teammateId = "tea_123"; // The teammate ID. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the tags. Only supports `id`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      TagsListCompanyResponse result = client
              .tags
              .listTeammateTags(teammateId)
              .limit(limit)
              .pageToken(pageToken)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#listTeammateTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagsListCompanyResponse> response = client
              .tags
              .listTeammateTags(teammateId)
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
      System.err.println("Exception when calling TagsApi#listTeammateTags");
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
| **teammateId** | **String**| The teammate ID. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to tea_123] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the tags. Only supports &#x60;id&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**TagsListCompanyResponse**](TagsListCompanyResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Tags |  -  |

<a name="updateTag"></a>
# **updateTag**
> updateTag(tagId).updateTag(updateTag).execute();

Update a tag

Update a tag.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagsApi;
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
    String tagId = "tag_123"; // The tag ID
    String description = "description_example"; // Description of the tag
    String name = "name_example"; // Name of the tag
    String highlight = "grey"; // Highlight color of the tag.
    String parentTagId = "parentTagId_example"; // ID of the parent of this tag. Set to `null` to remove  the parent tag.
    Boolean isVisibleInConversationLists = true; // Whether the tag is visible in conversation lists.
    try {
      client
              .tags
              .updateTag(tagId)
              .description(description)
              .name(name)
              .highlight(highlight)
              .parentTagId(parentTagId)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#updateTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tags
              .updateTag(tagId)
              .description(description)
              .name(name)
              .highlight(highlight)
              .parentTagId(parentTagId)
              .isVisibleInConversationLists(isVisibleInConversationLists)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#updateTag");
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
| **tagId** | **String**| The tag ID | [default to tag_123] |
| **updateTag** | [**UpdateTag**](UpdateTag.md)| Child Tag to update | [optional] |

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


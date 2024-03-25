# MessageTemplateFoldersApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChildFolder**](MessageTemplateFoldersApi.md#createChildFolder) | **POST** /message_template_folders/{message_template_folder_id}/message_template_folders | Create child folder |
| [**createNewFolder**](MessageTemplateFoldersApi.md#createNewFolder) | **POST** /message_template_folders | Create folder |
| [**createNewFolder_0**](MessageTemplateFoldersApi.md#createNewFolder_0) | **POST** /teammates/{teammate_id}/message_template_folders | Create teammate folder |
| [**createNewFolder_1**](MessageTemplateFoldersApi.md#createNewFolder_1) | **POST** /teams/{team_id}/message_template_folders | Create team folder |
| [**deleteFolder**](MessageTemplateFoldersApi.md#deleteFolder) | **DELETE** /message_template_folders/{message_template_folder_id} | Delete folder |
| [**getChildFolders**](MessageTemplateFoldersApi.md#getChildFolders) | **GET** /message_template_folders/{message_template_folder_id}/message_template_folders | Get child folders |
| [**getFolder**](MessageTemplateFoldersApi.md#getFolder) | **GET** /message_template_folders/{message_template_folder_id} | Get folder |
| [**listFolders**](MessageTemplateFoldersApi.md#listFolders) | **GET** /message_template_folders | List folders |
| [**listTeamFolders**](MessageTemplateFoldersApi.md#listTeamFolders) | **GET** /teams/{team_id}/message_template_folders | List team folders |
| [**listTeammateFolders**](MessageTemplateFoldersApi.md#listTeammateFolders) | **GET** /teammates/{teammate_id}/message_template_folders | List teammate folders |
| [**updateFolder**](MessageTemplateFoldersApi.md#updateFolder) | **PATCH** /message_template_folders/{message_template_folder_id} | Update folder |


<a name="createChildFolder"></a>
# **createChildFolder**
> Object createChildFolder(messageTemplateFolderId).createMessageTemplateFolderAsChild(createMessageTemplateFolderAsChild).execute();

Create child folder

Create a new message template folder as a child of the given folder

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String name = "name_example"; // Name of the message template folder
    String messageTemplateFolderId = "rsf_123"; // The parent message template folder ID
    try {
      Object result = client
              .messageTemplateFolders
              .createChildFolder(name, messageTemplateFolderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#createChildFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplateFolders
              .createChildFolder(name, messageTemplateFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#createChildFolder");
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
| **messageTemplateFolderId** | **String**| The parent message template folder ID | [default to rsf_123] |
| **createMessageTemplateFolderAsChild** | [**CreateMessageTemplateFolderAsChild**](CreateMessageTemplateFolderAsChild.md)| Message template folder to create | [optional] |

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
| **201** | A message template folder |  -  |

<a name="createNewFolder"></a>
# **createNewFolder**
> Object createNewFolder().createMessageTemplateFolder(createMessageTemplateFolder).execute();

Create folder

Create a new message template folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String name = "name_example"; // Name of the message template folder
    String parentFolderId = "parentFolderId_example"; // ID of the parent folder to be placed into. Goes into the root folder if unspecified or if null.
    try {
      Object result = client
              .messageTemplateFolders
              .createNewFolder(name)
              .parentFolderId(parentFolderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#createNewFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplateFolders
              .createNewFolder(name)
              .parentFolderId(parentFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#createNewFolder");
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
| **createMessageTemplateFolder** | [**CreateMessageTemplateFolder**](CreateMessageTemplateFolder.md)| Message template folder to create | [optional] |

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
| **201** | A message template folder |  -  |

<a name="createNewFolder_0"></a>
# **createNewFolder_0**
> Object createNewFolder_0(teammateId).createMessageTemplateFolder(createMessageTemplateFolder).execute();

Create teammate folder

Create a new message template folder belonging to the requested teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String name = "name_example"; // Name of the message template folder
    String teammateId = "tea_123"; // The teammate ID. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String parentFolderId = "parentFolderId_example"; // ID of the parent folder to be placed into. Goes into the root folder if unspecified or if null.
    try {
      Object result = client
              .messageTemplateFolders
              .createNewFolder_0(name, teammateId)
              .parentFolderId(parentFolderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#createNewFolder_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplateFolders
              .createNewFolder_0(name, teammateId)
              .parentFolderId(parentFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#createNewFolder_0");
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
| **createMessageTemplateFolder** | [**CreateMessageTemplateFolder**](CreateMessageTemplateFolder.md)| Message template folder to create | [optional] |

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
| **201** | A message template folder |  -  |

<a name="createNewFolder_1"></a>
# **createNewFolder_1**
> Object createNewFolder_1(teamId).createMessageTemplateFolder(createMessageTemplateFolder).execute();

Create team folder

Create a new message template folder belonging to the requested team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String name = "name_example"; // Name of the message template folder
    String teamId = "tim_55c8c149"; // The team ID
    String parentFolderId = "parentFolderId_example"; // ID of the parent folder to be placed into. Goes into the root folder if unspecified or if null.
    try {
      Object result = client
              .messageTemplateFolders
              .createNewFolder_1(name, teamId)
              .parentFolderId(parentFolderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#createNewFolder_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplateFolders
              .createNewFolder_1(name, teamId)
              .parentFolderId(parentFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#createNewFolder_1");
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
| **teamId** | **String**| The team ID | [default to tim_55c8c149] |
| **createMessageTemplateFolder** | [**CreateMessageTemplateFolder**](CreateMessageTemplateFolder.md)| Message template folder to create | [optional] |

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
| **201** | A message template folder |  -  |

<a name="deleteFolder"></a>
# **deleteFolder**
> MessageTemplateFoldersDeleteFolderResponse deleteFolder(messageTemplateFolderId).execute();

Delete folder

Delete a message template folder and child folders/templates

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String messageTemplateFolderId = "rsf_123"; // The message template folder id
    try {
      MessageTemplateFoldersDeleteFolderResponse result = client
              .messageTemplateFolders
              .deleteFolder(messageTemplateFolderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessageTemplateFolderId());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#deleteFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplateFoldersDeleteFolderResponse> response = client
              .messageTemplateFolders
              .deleteFolder(messageTemplateFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#deleteFolder");
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
| **messageTemplateFolderId** | **String**| The message template folder id | [default to rsf_123] |

### Return type

[**MessageTemplateFoldersDeleteFolderResponse**](MessageTemplateFoldersDeleteFolderResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A message template folder accepted for deletion |  -  |

<a name="getChildFolders"></a>
# **getChildFolders**
> MessageTemplateFoldersListFoldersResponse getChildFolders(messageTemplateFolderId).execute();

Get child folders

Fetch the child message templates folders of a message template folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String messageTemplateFolderId = "rsf_123"; // The message template folder ID
    try {
      MessageTemplateFoldersListFoldersResponse result = client
              .messageTemplateFolders
              .getChildFolders(messageTemplateFolderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#getChildFolders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplateFoldersListFoldersResponse> response = client
              .messageTemplateFolders
              .getChildFolders(messageTemplateFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#getChildFolders");
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
| **messageTemplateFolderId** | **String**| The message template folder ID | [default to rsf_123] |

### Return type

[**MessageTemplateFoldersListFoldersResponse**](MessageTemplateFoldersListFoldersResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of message template folders |  -  |

<a name="getFolder"></a>
# **getFolder**
> Object getFolder(messageTemplateFolderId).execute();

Get folder

Fetch a message template folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String messageTemplateFolderId = "rsf_123"; // The message template folder ID
    try {
      Object result = client
              .messageTemplateFolders
              .getFolder(messageTemplateFolderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#getFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplateFolders
              .getFolder(messageTemplateFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#getFolder");
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
| **messageTemplateFolderId** | **String**| The message template folder ID | [default to rsf_123] |

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
| **200** | A message template folder |  -  |

<a name="listFolders"></a>
# **listFolders**
> MessageTemplateFoldersListFoldersResponse listFolders().sortBy(sortBy).sortOrder(sortOrder).execute();

List folders

List the message template folders.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String sortBy = "sortBy_example"; // Field used to sort the message template folders. Either `created_at` or `updated_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      MessageTemplateFoldersListFoldersResponse result = client
              .messageTemplateFolders
              .listFolders()
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#listFolders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplateFoldersListFoldersResponse> response = client
              .messageTemplateFolders
              .listFolders()
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#listFolders");
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
| **sortBy** | **String**| Field used to sort the message template folders. Either &#x60;created_at&#x60; or &#x60;updated_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**MessageTemplateFoldersListFoldersResponse**](MessageTemplateFoldersListFoldersResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of message template folders |  -  |

<a name="listTeamFolders"></a>
# **listTeamFolders**
> MessageTemplateFoldersListFoldersResponse listTeamFolders(teamId).sortBy(sortBy).sortOrder(sortOrder).execute();

List team folders

List the message template folders belonging to the requested team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String teamId = "tim_55c8c149"; // The team ID
    String sortBy = "sortBy_example"; // Field used to sort the message template folders. Either `created_at` or `updated_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      MessageTemplateFoldersListFoldersResponse result = client
              .messageTemplateFolders
              .listTeamFolders(teamId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#listTeamFolders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplateFoldersListFoldersResponse> response = client
              .messageTemplateFolders
              .listTeamFolders(teamId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#listTeamFolders");
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
| **teamId** | **String**| The team ID | [default to tim_55c8c149] |
| **sortBy** | **String**| Field used to sort the message template folders. Either &#x60;created_at&#x60; or &#x60;updated_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**MessageTemplateFoldersListFoldersResponse**](MessageTemplateFoldersListFoldersResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of message template folders |  -  |

<a name="listTeammateFolders"></a>
# **listTeammateFolders**
> MessageTemplateFoldersListFoldersResponse listTeammateFolders(teammateId).sortBy(sortBy).sortOrder(sortOrder).execute();

List teammate folders

List the message template folders belonging to the requested teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String sortBy = "sortBy_example"; // Field used to sort the message template folders. Either `created_at` or `updated_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      MessageTemplateFoldersListFoldersResponse result = client
              .messageTemplateFolders
              .listTeammateFolders(teammateId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#listTeammateFolders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplateFoldersListFoldersResponse> response = client
              .messageTemplateFolders
              .listTeammateFolders(teammateId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#listTeammateFolders");
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
| **sortBy** | **String**| Field used to sort the message template folders. Either &#x60;created_at&#x60; or &#x60;updated_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**MessageTemplateFoldersListFoldersResponse**](MessageTemplateFoldersListFoldersResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of message template folders |  -  |

<a name="updateFolder"></a>
# **updateFolder**
> Object updateFolder(messageTemplateFolderId).updateMessageTemplateFolder(updateMessageTemplateFolder).execute();

Update folder

Update message template folder

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
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
    String messageTemplateFolderId = "rsf_123"; // The message template folder ID
    String name = "name_example"; // Name of the message template folder
    String parentFolderId = "parentFolderId_example"; // ID of the parent folder to be placed into. Goes into the root folder if unspecified or if null.
    try {
      Object result = client
              .messageTemplateFolders
              .updateFolder(messageTemplateFolderId)
              .name(name)
              .parentFolderId(parentFolderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#updateFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplateFolders
              .updateFolder(messageTemplateFolderId)
              .name(name)
              .parentFolderId(parentFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplateFoldersApi#updateFolder");
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
| **messageTemplateFolderId** | **String**| The message template folder ID | [default to rsf_123] |
| **updateMessageTemplateFolder** | [**UpdateMessageTemplateFolder**](UpdateMessageTemplateFolder.md)| Message template folder to update | [optional] |

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
| **200** | A message template folder |  -  |


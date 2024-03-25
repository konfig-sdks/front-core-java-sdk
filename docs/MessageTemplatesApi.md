# MessageTemplatesApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewTeammateTemplate**](MessageTemplatesApi.md#addNewTeammateTemplate) | **POST** /teammates/{teammate_id}/message_templates | Create teammate message template |
| [**createChildTemplate**](MessageTemplatesApi.md#createChildTemplate) | **POST** /message_template_folders/{message_template_folder_id}/message_templates | Create child template |
| [**createNewTemplate**](MessageTemplatesApi.md#createNewTemplate) | **POST** /message_templates | Create message template |
| [**createTeamTemplate**](MessageTemplatesApi.md#createTeamTemplate) | **POST** /teams/{team_id}/message_templates | Create team message template |
| [**deleteTemplate**](MessageTemplatesApi.md#deleteTemplate) | **DELETE** /message_templates/{message_template_id} | Delete message template |
| [**getChildTemplates**](MessageTemplatesApi.md#getChildTemplates) | **GET** /message_template_folders/{message_template_folder_id}/message_templates | Get child templates |
| [**getTemplateById**](MessageTemplatesApi.md#getTemplateById) | **GET** /message_templates/{message_template_id} | Get message template |
| [**list**](MessageTemplatesApi.md#list) | **GET** /message_templates | List message templates |
| [**listTeamTemplates**](MessageTemplatesApi.md#listTeamTemplates) | **GET** /teams/{team_id}/message_templates | List team message templates |
| [**listTeammateTemplates**](MessageTemplatesApi.md#listTeammateTemplates) | **GET** /teammates/{teammate_id}/message_templates | List teammate message templates |
| [**updateTemplateById**](MessageTemplatesApi.md#updateTemplateById) | **PATCH** /message_templates/{message_template_id} | Update message template |


<a name="addNewTeammateTemplate"></a>
# **addNewTeammateTemplate**
> Object addNewTeammateTemplate(teammateId).createPrivateMessageTemplate(createPrivateMessageTemplate).execute();

Create teammate message template

Create a new message template for the given teammate

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String name = "name_example"; // Name of the message template
    String body = "body_example"; // Body of the message template
    String teammateId = "tea_123"; // The teammate ID. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String subject = "subject_example"; // Subject of the message template. If not set, the name will be used to populate the subject.
    String folderId = "folderId_example"; // ID of the message template folder to place this message template in
    try {
      Object result = client
              .messageTemplates
              .addNewTeammateTemplate(name, body, teammateId)
              .subject(subject)
              .folderId(folderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#addNewTeammateTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplates
              .addNewTeammateTemplate(name, body, teammateId)
              .subject(subject)
              .folderId(folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#addNewTeammateTemplate");
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
| **createPrivateMessageTemplate** | [**CreatePrivateMessageTemplate**](CreatePrivateMessageTemplate.md)| Message template to create | [optional] |

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
| **201** | A message template |  -  |

<a name="createChildTemplate"></a>
# **createChildTemplate**
> Object createChildTemplate(messageTemplateFolderId).createMessageTemplateAsChild(createMessageTemplateAsChild).execute();

Create child template

Create a new message template as a child of the given folder

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String name = "name_example"; // Name of the message template
    String body = "body_example"; // Body of the message template
    String messageTemplateFolderId = "rsf_123"; // The parent message template folder ID
    String subject = "subject_example"; // Subject of the message template. If not set, the name will be used to populate the subject.
    List<String> inboxIds = Arrays.asList(); // The specific inboxes this template is available in. If unspecified or null, then it will be available in all inboxes. Array should be non-empty.
    try {
      Object result = client
              .messageTemplates
              .createChildTemplate(name, body, messageTemplateFolderId)
              .subject(subject)
              .inboxIds(inboxIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#createChildTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplates
              .createChildTemplate(name, body, messageTemplateFolderId)
              .subject(subject)
              .inboxIds(inboxIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#createChildTemplate");
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
| **createMessageTemplateAsChild** | [**CreateMessageTemplateAsChild**](CreateMessageTemplateAsChild.md)| Message template to create | [optional] |

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
| **201** | A message template |  -  |

<a name="createNewTemplate"></a>
# **createNewTemplate**
> Object createNewTemplate().createSharedMessageTemplate(createSharedMessageTemplate).execute();

Create message template

Create a new message template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String name = "name_example"; // Name of the message template
    String body = "body_example"; // Body of the message template
    String subject = "subject_example"; // Subject of the message template. If not set, the name will be used to populate the subject.
    String folderId = "folderId_example"; // ID of the message template folder to place this message template in
    List<String> inboxIds = Arrays.asList(); // The specific inboxes this template is available in. If unspecified or null, then it will be available in all inboxes. Array should be non-empty.
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    try {
      Object result = client
              .messageTemplates
              .createNewTemplate(name, body)
              .subject(subject)
              .folderId(folderId)
              .inboxIds(inboxIds)
              .attachments(attachments)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#createNewTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplates
              .createNewTemplate(name, body)
              .subject(subject)
              .folderId(folderId)
              .inboxIds(inboxIds)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#createNewTemplate");
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
| **createSharedMessageTemplate** | [**CreateSharedMessageTemplate**](CreateSharedMessageTemplate.md)| Message template to create | [optional] |

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
| **201** | A message template |  -  |

<a name="createTeamTemplate"></a>
# **createTeamTemplate**
> Object createTeamTemplate(teamId).createSharedMessageTemplate(createSharedMessageTemplate).execute();

Create team message template

Create a new message template for the given team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String name = "name_example"; // Name of the message template
    String body = "body_example"; // Body of the message template
    String teamId = "tim_55c8c149"; // The team ID
    String subject = "subject_example"; // Subject of the message template. If not set, the name will be used to populate the subject.
    String folderId = "folderId_example"; // ID of the message template folder to place this message template in
    List<String> inboxIds = Arrays.asList(); // The specific inboxes this template is available in. If unspecified or null, then it will be available in all inboxes. Array should be non-empty.
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    try {
      Object result = client
              .messageTemplates
              .createTeamTemplate(name, body, teamId)
              .subject(subject)
              .folderId(folderId)
              .inboxIds(inboxIds)
              .attachments(attachments)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#createTeamTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplates
              .createTeamTemplate(name, body, teamId)
              .subject(subject)
              .folderId(folderId)
              .inboxIds(inboxIds)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#createTeamTemplate");
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
| **createSharedMessageTemplate** | [**CreateSharedMessageTemplate**](CreateSharedMessageTemplate.md)| Message template to create | [optional] |

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
| **201** | A message template |  -  |

<a name="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(messageTemplateId).execute();

Delete message template

Delete a message template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String messageTemplateId = "rsp_123"; // The message template ID
    try {
      client
              .messageTemplates
              .deleteTemplate(messageTemplateId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#deleteTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .messageTemplates
              .deleteTemplate(messageTemplateId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#deleteTemplate");
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
| **messageTemplateId** | **String**| The message template ID | [default to rsp_123] |

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

<a name="getChildTemplates"></a>
# **getChildTemplates**
> MessageTemplateFoldersListFoldersResponse getChildTemplates(messageTemplateFolderId).execute();

Get child templates

Fetch the child message templates of a message template folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
              .messageTemplates
              .getChildTemplates(messageTemplateFolderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#getChildTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplateFoldersListFoldersResponse> response = client
              .messageTemplates
              .getChildTemplates(messageTemplateFolderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#getChildTemplates");
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

<a name="getTemplateById"></a>
# **getTemplateById**
> Object getTemplateById(messageTemplateId).execute();

Get message template

Fetch a message template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String messageTemplateId = "rsp_123"; // The message template ID
    try {
      Object result = client
              .messageTemplates
              .getTemplateById(messageTemplateId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#getTemplateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplates
              .getTemplateById(messageTemplateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#getTemplateById");
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
| **messageTemplateId** | **String**| The message template ID | [default to rsp_123] |

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
| **200** | A message template |  -  |

<a name="list"></a>
# **list**
> MessageTemplatesListResponse list().sortBy(sortBy).sortOrder(sortOrder).execute();

List message templates

List the message templates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String sortBy = "sortBy_example"; // Field used to sort the message templates. Either `created_at`, `updated_at`, or `sort_order`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      MessageTemplatesListResponse result = client
              .messageTemplates
              .list()
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplatesListResponse> response = client
              .messageTemplates
              .list()
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#list");
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
| **sortBy** | **String**| Field used to sort the message templates. Either &#x60;created_at&#x60;, &#x60;updated_at&#x60;, or &#x60;sort_order&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**MessageTemplatesListResponse**](MessageTemplatesListResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of message templates |  -  |

<a name="listTeamTemplates"></a>
# **listTeamTemplates**
> MessageTemplatesListResponse listTeamTemplates(teamId).sortBy(sortBy).sortOrder(sortOrder).execute();

List team message templates

List the message templates belonging to the requested team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String sortBy = "sortBy_example"; // Field used to sort the message templates. Either `created_at`, `updated_at`, or `sort_order`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      MessageTemplatesListResponse result = client
              .messageTemplates
              .listTeamTemplates(teamId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#listTeamTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplatesListResponse> response = client
              .messageTemplates
              .listTeamTemplates(teamId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#listTeamTemplates");
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
| **sortBy** | **String**| Field used to sort the message templates. Either &#x60;created_at&#x60;, &#x60;updated_at&#x60;, or &#x60;sort_order&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**MessageTemplatesListResponse**](MessageTemplatesListResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of message templates |  -  |

<a name="listTeammateTemplates"></a>
# **listTeammateTemplates**
> MessageTemplatesListResponse listTeammateTemplates(teammateId).sortBy(sortBy).sortOrder(sortOrder).execute();

List teammate message templates

List the message templates belonging to the requested teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String sortBy = "sortBy_example"; // Field used to sort the message templates. Either `created_at`, `updated_at`, or `sort_order`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      MessageTemplatesListResponse result = client
              .messageTemplates
              .listTeammateTemplates(teammateId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#listTeammateTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageTemplatesListResponse> response = client
              .messageTemplates
              .listTeammateTemplates(teammateId)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#listTeammateTemplates");
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
| **sortBy** | **String**| Field used to sort the message templates. Either &#x60;created_at&#x60;, &#x60;updated_at&#x60;, or &#x60;sort_order&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**MessageTemplatesListResponse**](MessageTemplatesListResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of message templates |  -  |

<a name="updateTemplateById"></a>
# **updateTemplateById**
> Object updateTemplateById(messageTemplateId).updateMessageTemplate(updateMessageTemplate).execute();

Update message template

Update message template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageTemplatesApi;
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
    String messageTemplateId = "rsp_123"; // The message template ID
    String name = "name_example"; // Name of the message template
    String subject = "subject_example"; // Subject of the message template
    String body = "body_example"; // Body of the message template
    String folderId = "folderId_example"; // ID of the parent folder to be placed into. Goes into the root folder if unspecified or if null.
    List<String> inboxIds = Arrays.asList(); // The specific inboxes this template is available in. If null, then it will be available in all inboxes. Array should be non-empty. If unspecified, will retain previous value.
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://dev.frontapp.com/docs/attachments-1). Max 25 MB. Specify an empty array to delete all attachments from a message template. If unspecified, it will retain previous value.
    try {
      Object result = client
              .messageTemplates
              .updateTemplateById(messageTemplateId)
              .name(name)
              .subject(subject)
              .body(body)
              .folderId(folderId)
              .inboxIds(inboxIds)
              .attachments(attachments)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#updateTemplateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messageTemplates
              .updateTemplateById(messageTemplateId)
              .name(name)
              .subject(subject)
              .body(body)
              .folderId(folderId)
              .inboxIds(inboxIds)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageTemplatesApi#updateTemplateById");
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
| **messageTemplateId** | **String**| The message template ID | [default to rsp_123] |
| **updateMessageTemplate** | [**UpdateMessageTemplate**](UpdateMessageTemplate.md)| Message template to update | [optional] |

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
| **200** | A message template |  -  |


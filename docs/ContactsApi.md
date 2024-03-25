# ContactsApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewContact**](ContactsApi.md#createNewContact) | **POST** /contacts | Create contact |
| [**createTeamContact**](ContactsApi.md#createTeamContact) | **POST** /teams/{team_id}/contacts | Create team contact |
| [**createTeammateContact**](ContactsApi.md#createTeammateContact) | **POST** /teammates/{teammate_id}/contacts | Create teammate contact |
| [**deleteContact**](ContactsApi.md#deleteContact) | **DELETE** /contacts/{contact_id} | Delete a contact |
| [**getOneContact**](ContactsApi.md#getOneContact) | **GET** /contacts/{contact_id} | Get contact |
| [**listCompanyContacts**](ContactsApi.md#listCompanyContacts) | **GET** /contacts | List contacts |
| [**listConversationsReverseChronologicalOrder**](ContactsApi.md#listConversationsReverseChronologicalOrder) | **GET** /contacts/{contact_id}/conversations | List contact conversations |
| [**listTeamContacts**](ContactsApi.md#listTeamContacts) | **GET** /teams/{team_id}/contacts | List team contacts |
| [**listTeammateContacts**](ContactsApi.md#listTeammateContacts) | **GET** /teammates/{teammate_id}/contacts | List teammate contacts |
| [**mergeContacts**](ContactsApi.md#mergeContacts) | **POST** /contacts/merge | Merge contacts |
| [**updateContact**](ContactsApi.md#updateContact) | **PATCH** /contacts/{contact_id} | Update a contact |


<a name="createNewContact"></a>
# **createNewContact**
> Object createNewContact().createContact(createContact).execute();

Create contact

Create a new contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    List<ContactHandle> handles = Arrays.asList(); // List of the handles for this contact. Each handle object should include `handle` and `source` fields.
    String description = "description_example"; // Contact description
    String name = "name_example"; // Contact name
    File avatar = new File("/path/to/file"); // Binary data of avatar. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    Boolean isSpammer = true; // Whether or not the contact is marked as a spammer
    List<String> links = Arrays.asList(); // List of all the links of the contact
    List<String> groupNames = Arrays.asList(); // List of all the group names the contact belongs to. It will automatically create missing groups
    Object customFields = null; // Custom field attributes for this contact. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields.
    try {
      Object result = client
              .contacts
              .createNewContact(handles)
              .description(description)
              .name(name)
              .avatar(avatar)
              .isSpammer(isSpammer)
              .links(links)
              .groupNames(groupNames)
              .customFields(customFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createNewContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .contacts
              .createNewContact(handles)
              .description(description)
              .name(name)
              .avatar(avatar)
              .isSpammer(isSpammer)
              .links(links)
              .groupNames(groupNames)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createNewContact");
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
| **createContact** | [**CreateContact**](CreateContact.md)|  | [optional] |

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
| **201** | A contact |  -  |

<a name="createTeamContact"></a>
# **createTeamContact**
> Object createTeamContact(teamId).createContact(createContact).execute();

Create team contact

Create a contact for a team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    List<ContactHandle> handles = Arrays.asList(); // List of the handles for this contact. Each handle object should include `handle` and `source` fields.
    String teamId = "tim_123"; // The team ID
    String description = "description_example"; // Contact description
    String name = "name_example"; // Contact name
    File avatar = new File("/path/to/file"); // Binary data of avatar. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    Boolean isSpammer = true; // Whether or not the contact is marked as a spammer
    List<String> links = Arrays.asList(); // List of all the links of the contact
    List<String> groupNames = Arrays.asList(); // List of all the group names the contact belongs to. It will automatically create missing groups
    Object customFields = null; // Custom field attributes for this contact. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields.
    try {
      Object result = client
              .contacts
              .createTeamContact(handles, teamId)
              .description(description)
              .name(name)
              .avatar(avatar)
              .isSpammer(isSpammer)
              .links(links)
              .groupNames(groupNames)
              .customFields(customFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createTeamContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .contacts
              .createTeamContact(handles, teamId)
              .description(description)
              .name(name)
              .avatar(avatar)
              .isSpammer(isSpammer)
              .links(links)
              .groupNames(groupNames)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createTeamContact");
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
| **createContact** | [**CreateContact**](CreateContact.md)|  | [optional] |

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
| **201** | A contact |  -  |

<a name="createTeammateContact"></a>
# **createTeammateContact**
> Object createTeammateContact(teammateId).createContact(createContact).execute();

Create teammate contact

Create a contact for a teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    List<ContactHandle> handles = Arrays.asList(); // List of the handles for this contact. Each handle object should include `handle` and `source` fields.
    String teammateId = "tea_123"; // The teammate ID. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String description = "description_example"; // Contact description
    String name = "name_example"; // Contact name
    File avatar = new File("/path/to/file"); // Binary data of avatar. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    Boolean isSpammer = true; // Whether or not the contact is marked as a spammer
    List<String> links = Arrays.asList(); // List of all the links of the contact
    List<String> groupNames = Arrays.asList(); // List of all the group names the contact belongs to. It will automatically create missing groups
    Object customFields = null; // Custom field attributes for this contact. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields.
    try {
      Object result = client
              .contacts
              .createTeammateContact(handles, teammateId)
              .description(description)
              .name(name)
              .avatar(avatar)
              .isSpammer(isSpammer)
              .links(links)
              .groupNames(groupNames)
              .customFields(customFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createTeammateContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .contacts
              .createTeammateContact(handles, teammateId)
              .description(description)
              .name(name)
              .avatar(avatar)
              .isSpammer(isSpammer)
              .links(links)
              .groupNames(groupNames)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createTeammateContact");
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
| **createContact** | [**CreateContact**](CreateContact.md)|  | [optional] |

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
| **201** | A contact |  -  |

<a name="deleteContact"></a>
# **deleteContact**
> deleteContact(contactId).execute();

Delete a contact

Delete a contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
      client
              .contacts
              .deleteContact(contactId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#deleteContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .contacts
              .deleteContact(contactId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#deleteContact");
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

<a name="getOneContact"></a>
# **getOneContact**
> Object getOneContact(contactId).execute();

Get contact

Fetch a contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
      Object result = client
              .contacts
              .getOneContact(contactId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getOneContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .contacts
              .getOneContact(contactId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getOneContact");
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

**Object**

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A contact |  -  |

<a name="listCompanyContacts"></a>
# **listCompanyContacts**
> AccountsListAccountContactsResponse listCompanyContacts().q(q).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List contacts

List the contacts of the company.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with the optional properties `updated_after` and `updated_before`, whose value should be a timestamp in seconds with up to 3 decimal places.
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the contacts. Either `created_at` or `updated_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      AccountsListAccountContactsResponse result = client
              .contacts
              .listCompanyContacts()
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
      System.err.println("Exception when calling ContactsApi#listCompanyContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountsListAccountContactsResponse> response = client
              .contacts
              .listCompanyContacts()
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
      System.err.println("Exception when calling ContactsApi#listCompanyContacts");
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
| **q** | **String**| [Search query object](https://dev.frontapp.com/docs/query-object-q) with the optional properties &#x60;updated_after&#x60; and &#x60;updated_before&#x60;, whose value should be a timestamp in seconds with up to 3 decimal places. | [optional] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the contacts. Either &#x60;created_at&#x60; or &#x60;updated_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**AccountsListAccountContactsResponse**](AccountsListAccountContactsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of contacts |  -  |

<a name="listConversationsReverseChronologicalOrder"></a>
# **listConversationsReverseChronologicalOrder**
> ContactsListConversationsReverseChronologicalOrderResponse listConversationsReverseChronologicalOrder(contactId).q(q).limit(limit).pageToken(pageToken).execute();

List contact conversations

List the conversations for a contact in reverse chronological order (newest first). For more advanced filtering, see the [search endpoint](https://dev.frontapp.com/reference/conversations#search-conversations). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    String contactId = "crd_123"; // The Contact ID. Alternatively, you can supply the contact's source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with a property `statuses`, whose value should be a list of conversation statuses (`assigned`, `unassigned`, `archived`, or `deleted`).
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    try {
      ContactsListConversationsReverseChronologicalOrderResponse result = client
              .contacts
              .listConversationsReverseChronologicalOrder(contactId)
              .q(q)
              .limit(limit)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#listConversationsReverseChronologicalOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContactsListConversationsReverseChronologicalOrderResponse> response = client
              .contacts
              .listConversationsReverseChronologicalOrder(contactId)
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
      System.err.println("Exception when calling ContactsApi#listConversationsReverseChronologicalOrder");
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
| **contactId** | **String**| The Contact ID. Alternatively, you can supply the contact&#39;s source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to crd_123] |
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

<a name="listTeamContacts"></a>
# **listTeamContacts**
> AccountsListAccountContactsResponse listTeamContacts(teamId).q(q).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List team contacts

List the contacts of a team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with the optional properties `updated_after` and `updated_before`, whose value should be a timestamp in seconds with up to 3 decimal places.
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the contacts. Either `created_at` or `updated_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      AccountsListAccountContactsResponse result = client
              .contacts
              .listTeamContacts(teamId)
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
      System.err.println("Exception when calling ContactsApi#listTeamContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountsListAccountContactsResponse> response = client
              .contacts
              .listTeamContacts(teamId)
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
      System.err.println("Exception when calling ContactsApi#listTeamContacts");
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
| **q** | **String**| [Search query object](https://dev.frontapp.com/docs/query-object-q) with the optional properties &#x60;updated_after&#x60; and &#x60;updated_before&#x60;, whose value should be a timestamp in seconds with up to 3 decimal places. | [optional] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the contacts. Either &#x60;created_at&#x60; or &#x60;updated_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**AccountsListAccountContactsResponse**](AccountsListAccountContactsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of contacts |  -  |

<a name="listTeammateContacts"></a>
# **listTeammateContacts**
> AccountsListAccountContactsResponse listTeammateContacts(teammateId).q(q).limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List teammate contacts

List the contacts of a teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    String q = "q_example"; // [Search query object](https://dev.frontapp.com/docs/query-object-q) with the optional properties `updated_after` and `updated_before`, whose value should be a timestamp in seconds with up to 3 decimal places.
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the contacts. Either `created_at` or `updated_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      AccountsListAccountContactsResponse result = client
              .contacts
              .listTeammateContacts(teammateId)
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
      System.err.println("Exception when calling ContactsApi#listTeammateContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountsListAccountContactsResponse> response = client
              .contacts
              .listTeammateContacts(teammateId)
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
      System.err.println("Exception when calling ContactsApi#listTeammateContacts");
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
| **q** | **String**| [Search query object](https://dev.frontapp.com/docs/query-object-q) with the optional properties &#x60;updated_after&#x60; and &#x60;updated_before&#x60;, whose value should be a timestamp in seconds with up to 3 decimal places. | [optional] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **sortBy** | **String**| Field used to sort the contacts. Either &#x60;created_at&#x60; or &#x60;updated_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**AccountsListAccountContactsResponse**](AccountsListAccountContactsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of contacts |  -  |

<a name="mergeContacts"></a>
# **mergeContacts**
> Object mergeContacts().mergeContacts(mergeContacts).execute();

Merge contacts

Merges the contacts specified into a single contact, deleting the merged-in contacts. If a target contact ID is supplied, the other contacts will be merged into that one. Otherwise, some contact in the contact ID list will be treated as the target contact. Merge conflicts will be resolved in the following ways:   * name will prioritize manually-updated and non-private contact names   * descriptions will be concatenated and separated by newlines in order from     oldest to newest with the (optional) target contact&#39;s description first   * all handles, groups, links, and notes will be preserved   * other conflicts will use the most recently updated contact&#39;s value 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    List<String> contactIds = Arrays.asList(); // Array of all the contact IDs of the contacts to be merged.  If a target contact id is provided and that contact id is not in this array, the length of this array must be between 1 and 49.  If no target contact id is provided or it is contained in this array, the length must be between 2 and 50.
    String targetContactId = "targetContactId_example"; // Optional contact ID to merge the other contacts into.
    try {
      Object result = client
              .contacts
              .mergeContacts(contactIds)
              .targetContactId(targetContactId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#mergeContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .contacts
              .mergeContacts(contactIds)
              .targetContactId(targetContactId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#mergeContacts");
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
| **mergeContacts** | [**MergeContacts**](MergeContacts.md)|  | [optional] |

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
| **200** | A contact |  -  |

<a name="updateContact"></a>
# **updateContact**
> updateContact(contactId).contact(contact).execute();

Update a contact

Updates a contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
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
    String description = "description_example"; // Contact description
    String name = "name_example"; // Contact name
    File avatar = new File("/path/to/file"); // Binary data of avatar. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    Boolean isSpammer = true; // Whether or not the contact is marked as a spammer
    List<String> links = Arrays.asList(); // List of all the links of the contact
    List<String> groupNames = Arrays.asList(); // List of all the group names the contact belongs to. It will automatically create missing groups
    Object customFields = null; // Custom field attributes for this contact. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields.
    try {
      client
              .contacts
              .updateContact(contactId)
              .description(description)
              .name(name)
              .avatar(avatar)
              .isSpammer(isSpammer)
              .links(links)
              .groupNames(groupNames)
              .customFields(customFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .contacts
              .updateContact(contactId)
              .description(description)
              .name(name)
              .avatar(avatar)
              .isSpammer(isSpammer)
              .links(links)
              .groupNames(groupNames)
              .customFields(customFields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateContact");
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
| **contact** | [**Contact**](Contact.md)|  | [optional] |

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


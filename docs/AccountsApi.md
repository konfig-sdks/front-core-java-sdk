# AccountsApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addContactsToAccount**](AccountsApi.md#addContactsToAccount) | **POST** /accounts/{account_id}/contacts | Add contact to Account |
| [**createNewAccount**](AccountsApi.md#createNewAccount) | **POST** /accounts | Create account |
| [**deleteAccount**](AccountsApi.md#deleteAccount) | **DELETE** /accounts/{account_id} | Delete an account |
| [**getAccount**](AccountsApi.md#getAccount) | **GET** /accounts/{account_id} | Fetch an account |
| [**listAccountContacts**](AccountsApi.md#listAccountContacts) | **GET** /accounts/{account_id}/contacts | List account contacts |
| [**listCompanyAccounts**](AccountsApi.md#listCompanyAccounts) | **GET** /accounts | List Accounts |
| [**removeContactFrom**](AccountsApi.md#removeContactFrom) | **DELETE** /accounts/{account_id}/contacts | Remove contact from Account |
| [**updateAccount**](AccountsApi.md#updateAccount) | **PATCH** /accounts/{account_id} | Update account |


<a name="addContactsToAccount"></a>
# **addContactsToAccount**
> addContactsToAccount(accountId).contactIds(contactIds).execute();

Add contact to Account

Adds a list of contacts to an Account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    List<String> contactIds = Arrays.asList(); // The contact IDs to include. Alternatively, you can supply the contact source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String accountId = "acc_123"; // The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      client
              .accounts
              .addContactsToAccount(contactIds, accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#addContactsToAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accounts
              .addContactsToAccount(contactIds, accountId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#addContactsToAccount");
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
| **accountId** | **String**| The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to acc_123] |
| **contactIds** | [**ContactIds**](ContactIds.md)|  | [optional] |

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

<a name="createNewAccount"></a>
# **createNewAccount**
> Object createNewAccount().account(account).execute();

Create account

Create a new account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String description = "description_example"; // Account description
    String name = "name_example"; // Name of the Account
    List<String> domains = Arrays.asList(); // List of domains associated with the Account
    String externalId = "externalId_example"; // ID of the Account in an external system
    Object customFields = null; // Custom field attributes for this account.
    try {
      Object result = client
              .accounts
              .createNewAccount()
              .description(description)
              .name(name)
              .domains(domains)
              .externalId(externalId)
              .customFields(customFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createNewAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .accounts
              .createNewAccount()
              .description(description)
              .name(name)
              .domains(domains)
              .externalId(externalId)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createNewAccount");
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
| **account** | [**Account**](Account.md)|  | [optional] |

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
| **201** | An Account |  -  |

<a name="deleteAccount"></a>
# **deleteAccount**
> deleteAccount(accountId).execute();

Delete an account

Deletes an account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String accountId = "acc_123"; // The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      client
              .accounts
              .deleteAccount(accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accounts
              .deleteAccount(accountId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccount");
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
| **accountId** | **String**| The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to acc_123] |

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

<a name="getAccount"></a>
# **getAccount**
> Object getAccount(accountId).execute();

Fetch an account

Fetches an account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String accountId = "acc_123"; // The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      Object result = client
              .accounts
              .getAccount(accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .accounts
              .getAccount(accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccount");
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
| **accountId** | **String**| The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to acc_123] |

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
| **200** | An Account |  -  |

<a name="listAccountContacts"></a>
# **listAccountContacts**
> AccountsListAccountContactsResponse listAccountContacts(accountId).pageToken(pageToken).limit(limit).sortBy(sortBy).sortOrder(sortOrder).execute();

List account contacts

Lists the contacts associated with an Account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String accountId = "acc_123"; // The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String sortBy = "sortBy_example"; // Field used to sort the contacts. Either `created_at` or `updated_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      AccountsListAccountContactsResponse result = client
              .accounts
              .listAccountContacts(accountId)
              .pageToken(pageToken)
              .limit(limit)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#listAccountContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountsListAccountContactsResponse> response = client
              .accounts
              .listAccountContacts(accountId)
              .pageToken(pageToken)
              .limit(limit)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#listAccountContacts");
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
| **accountId** | **String**| The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to acc_123] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
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

<a name="listCompanyAccounts"></a>
# **listCompanyAccounts**
> AccountsListCompanyAccountsResponse listCompanyAccounts().limit(limit).pageToken(pageToken).sortBy(sortBy).sortOrder(sortOrder).execute();

List Accounts

List the accounts of the company.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String sortBy = "sortBy_example"; // Field used to sort the accounts. Either `created_at` or `updated_at`.
    String sortOrder = "asc"; // Order by which results should be sorted
    try {
      AccountsListCompanyAccountsResponse result = client
              .accounts
              .listCompanyAccounts()
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
      System.err.println("Exception when calling AccountsApi#listCompanyAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountsListCompanyAccountsResponse> response = client
              .accounts
              .listCompanyAccounts()
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
      System.err.println("Exception when calling AccountsApi#listCompanyAccounts");
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
| **sortBy** | **String**| Field used to sort the accounts. Either &#x60;created_at&#x60; or &#x60;updated_at&#x60;. | [optional] |
| **sortOrder** | **String**| Order by which results should be sorted | [optional] [enum: asc, desc] |

### Return type

[**AccountsListCompanyAccountsResponse**](AccountsListCompanyAccountsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of accounts |  -  |

<a name="removeContactFrom"></a>
# **removeContactFrom**
> removeContactFrom(accountId).contactIds(contactIds).execute();

Remove contact from Account

Removes a list of contacts from an Account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    List<String> contactIds = Arrays.asList(); // The contact IDs to include. Alternatively, you can supply the contact source and handle as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String accountId = "acc_123"; // The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      client
              .accounts
              .removeContactFrom(contactIds, accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#removeContactFrom");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accounts
              .removeContactFrom(contactIds, accountId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#removeContactFrom");
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
| **accountId** | **String**| The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to acc_123] |
| **contactIds** | [**ContactIds**](ContactIds.md)|  | [optional] |

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

<a name="updateAccount"></a>
# **updateAccount**
> Object updateAccount(accountId).accountPatch(accountPatch).execute();

Update account

Updates an account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String accountId = "acc_123"; // The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String description = "description_example"; // Account description
    String name = "name_example"; // Name of the Account
    List<String> domains = Arrays.asList(); // List of domains associated with the Account
    Object customFields = null; // Custom field attributes for this account. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields.
    try {
      Object result = client
              .accounts
              .updateAccount(accountId)
              .description(description)
              .name(name)
              .domains(domains)
              .customFields(customFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .accounts
              .updateAccount(accountId)
              .description(description)
              .name(name)
              .domains(domains)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccount");
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
| **accountId** | **String**| The Account ID. Alternatively, you can supply the account domain or external ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to acc_123] |
| **accountPatch** | [**AccountPatch**](AccountPatch.md)|  | [optional] |

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
| **200** | An Account |  -  |


# SignaturesApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTeamSignature**](SignaturesApi.md#createTeamSignature) | **POST** /teams/{team_id}/signatures | Create team signature |
| [**createTeammateSignature**](SignaturesApi.md#createTeammateSignature) | **POST** /teammates/{teammate_id}/signatures | Create teammate signature |
| [**deleteSignature**](SignaturesApi.md#deleteSignature) | **DELETE** /signatures/{signature_id} | Delete signature |
| [**getSignature**](SignaturesApi.md#getSignature) | **GET** /signatures/{signature_id} | Get signatures |
| [**listTeam**](SignaturesApi.md#listTeam) | **GET** /teams/{team_id}/signatures | List team signatures |
| [**listTeammate**](SignaturesApi.md#listTeammate) | **GET** /teammates/{teammate_id}/signatures | List teammate signatures |
| [**updateSignature**](SignaturesApi.md#updateSignature) | **PATCH** /signatures/{signature_id} | Update signature |


<a name="createTeamSignature"></a>
# **createTeamSignature**
> Object createTeamSignature(teamId).createSharedSignature(createSharedSignature).execute();

Create team signature

Create a new signature for the given team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignaturesApi;
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
    String name = "name_example"; // Name of the signature
    String body = "body_example"; // Body of the signature
    String teamId = "tim_123"; // The team ID
    String senderInfo = "senderInfo_example"; // Sender info of the signature that will appear in the From line of emails sent.
    Boolean isVisibleForAllTeammateChannels = true; // Whether or not the signature is visible in all individual channels for teammates in the given team.
    Boolean isDefault = false; // If true, the signature will be set as the default signature for the team.
    List<String> channelIds = Arrays.asList(); // The specific channels this signature is available in. If omitted or null, the signature will be available in all channels the team has access to. Alternatively, you can specify channels using a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      Object result = client
              .signatures
              .createTeamSignature(name, body, teamId)
              .senderInfo(senderInfo)
              .isVisibleForAllTeammateChannels(isVisibleForAllTeammateChannels)
              .isDefault(isDefault)
              .channelIds(channelIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#createTeamSignature");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .signatures
              .createTeamSignature(name, body, teamId)
              .senderInfo(senderInfo)
              .isVisibleForAllTeammateChannels(isVisibleForAllTeammateChannels)
              .isDefault(isDefault)
              .channelIds(channelIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#createTeamSignature");
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
| **createSharedSignature** | [**CreateSharedSignature**](CreateSharedSignature.md)| Signature to create | [optional] |

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
| **201** | A signature |  -  |

<a name="createTeammateSignature"></a>
# **createTeammateSignature**
> Object createTeammateSignature(teammateId).createPrivateSignature(createPrivateSignature).execute();

Create teammate signature

Create a new signature for the given teammate

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignaturesApi;
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
    String name = "name_example"; // Name of the signature
    String body = "body_example"; // Body of the signature
    String teammateId = "tea_123"; // The teammate ID. Alternatively, you can supply an email as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String senderInfo = "senderInfo_example"; // Sender info of the signature that will appear in the From line of emails sent.
    Boolean isDefault = false; // If true, the signature will be set as the default signature for the teammate.
    List<String> channelIds = Arrays.asList(); // The specific channels this signature is available in. If omitted or null, the signature will be available in all channels the teammate has access to. Alternatively, you can specify channels using a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      Object result = client
              .signatures
              .createTeammateSignature(name, body, teammateId)
              .senderInfo(senderInfo)
              .isDefault(isDefault)
              .channelIds(channelIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#createTeammateSignature");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .signatures
              .createTeammateSignature(name, body, teammateId)
              .senderInfo(senderInfo)
              .isDefault(isDefault)
              .channelIds(channelIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#createTeammateSignature");
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
| **createPrivateSignature** | [**CreatePrivateSignature**](CreatePrivateSignature.md)| Signature to create | [optional] |

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
| **201** | A signature |  -  |

<a name="deleteSignature"></a>
# **deleteSignature**
> deleteSignature(signatureId).execute();

Delete signature

Delete signature

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignaturesApi;
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
    String signatureId = "sig_123"; // The signature ID
    try {
      client
              .signatures
              .deleteSignature(signatureId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#deleteSignature");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .signatures
              .deleteSignature(signatureId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#deleteSignature");
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
| **signatureId** | **String**| The signature ID | [default to sig_123] |

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

<a name="getSignature"></a>
# **getSignature**
> Object getSignature(signatureId).execute();

Get signatures

Get the given signature.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignaturesApi;
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
    String signatureId = "sig_123"; // The signature ID
    try {
      Object result = client
              .signatures
              .getSignature(signatureId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#getSignature");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .signatures
              .getSignature(signatureId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#getSignature");
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
| **signatureId** | **String**| The signature ID | [default to sig_123] |

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
| **200** | A signature |  -  |

<a name="listTeam"></a>
# **listTeam**
> SignaturesListTeammateResponse listTeam(teamId).execute();

List team signatures

List the signatures belonging to the given team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignaturesApi;
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
      SignaturesListTeammateResponse result = client
              .signatures
              .listTeam(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#listTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SignaturesListTeammateResponse> response = client
              .signatures
              .listTeam(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#listTeam");
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

[**SignaturesListTeammateResponse**](SignaturesListTeammateResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of signatures |  -  |

<a name="listTeammate"></a>
# **listTeammate**
> SignaturesListTeammateResponse listTeammate(teammateId).execute();

List teammate signatures

List the signatures belonging to the given teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignaturesApi;
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
    try {
      SignaturesListTeammateResponse result = client
              .signatures
              .listTeammate(teammateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#listTeammate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SignaturesListTeammateResponse> response = client
              .signatures
              .listTeammate(teammateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#listTeammate");
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

### Return type

[**SignaturesListTeammateResponse**](SignaturesListTeammateResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of signatures |  -  |

<a name="updateSignature"></a>
# **updateSignature**
> Object updateSignature(signatureId).updateSignature(updateSignature).execute();

Update signature

Update signature

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignaturesApi;
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
    String signatureId = "sig_123"; // The signature ID
    String name = "name_example"; // Name of the signature
    String senderInfo = "senderInfo_example"; // Sender info of the signature that will appear in the From line of emails sent.
    String body = "body_example"; // Body of the signature
    Boolean isVisibleForAllTeammateChannels = true; // Whether or not the signature is visible in all individual channels for teammates in the given team. Can only be set for shared signatures.
    Boolean isDefault = false; // If true, the signature will be set as the default signature for the team or teammate.
    List<String> channelIds = Arrays.asList(); // The specific shared channels this signature if available in. If null, then it will be available in all channels. If unspecified, will retain previous value. Alternatively, you can specify channels using a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      Object result = client
              .signatures
              .updateSignature(signatureId)
              .name(name)
              .senderInfo(senderInfo)
              .body(body)
              .isVisibleForAllTeammateChannels(isVisibleForAllTeammateChannels)
              .isDefault(isDefault)
              .channelIds(channelIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#updateSignature");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .signatures
              .updateSignature(signatureId)
              .name(name)
              .senderInfo(senderInfo)
              .body(body)
              .isVisibleForAllTeammateChannels(isVisibleForAllTeammateChannels)
              .isDefault(isDefault)
              .channelIds(channelIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignaturesApi#updateSignature");
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
| **signatureId** | **String**| The signature ID | [default to sig_123] |
| **updateSignature** | [**UpdateSignature**](UpdateSignature.md)| Signature to update | [optional] |

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
| **200** | A signature |  -  |


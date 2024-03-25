# ShiftsApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTeammatesToShift**](ShiftsApi.md#addTeammatesToShift) | **POST** /shift/{shift_id}/teammates | Add teammates to shift |
| [**createShift**](ShiftsApi.md#createShift) | **POST** /shifts | Create shift |
| [**createTeamShift**](ShiftsApi.md#createTeamShift) | **POST** /teams/{team_id}/shifts | Create team shift |
| [**getShift**](ShiftsApi.md#getShift) | **GET** /shift/{shift_id} | Get shift |
| [**listShiftTeammates**](ShiftsApi.md#listShiftTeammates) | **GET** /shift/{shift_id}/teammates | List shift&#39;s teammates |
| [**listShifts**](ShiftsApi.md#listShifts) | **GET** /shifts | List Shifts |
| [**listTeamShifts**](ShiftsApi.md#listTeamShifts) | **GET** /teams/{team_id}/shifts | List team Shifts |
| [**removeTeammatesFromShift**](ShiftsApi.md#removeTeammatesFromShift) | **DELETE** /shift/{shift_id}/teammates | Remove teammates from shift |
| [**teammateShiftsList**](ShiftsApi.md#teammateShiftsList) | **GET** /teammates/{teammate_id}/shifts | List Teammate Shifts |
| [**updateShift**](ShiftsApi.md#updateShift) | **PATCH** /shifts/{shift_id} | Update shift |


<a name="addTeammatesToShift"></a>
# **addTeammatesToShift**
> addTeammatesToShift(shiftId).teammateIds(teammateIds).execute();

Add teammates to shift

Add teammates to a shift. The selected teammates must be in the team that owns the shift.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    String shiftId = "shf_123"; // The Shift ID
    try {
      client
              .shifts
              .addTeammatesToShift(teammateIds, shiftId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#addTeammatesToShift");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shifts
              .addTeammatesToShift(teammateIds, shiftId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#addTeammatesToShift");
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
| **shiftId** | **String**| The Shift ID | [default to shf_123] |
| **teammateIds** | [**TeammateIds**](TeammateIds.md)| Teammate IDs to add. Alternatively, you can supply emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [optional] |

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

<a name="createShift"></a>
# **createShift**
> ShiftResponse createShift().createShift(createShift).execute();

Create shift

Create a shift.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    String name = "name_example"; // Name of the shift
    String color = "black"; // Color of the shift
    String timezone = "timezone_example"; // A timezone name as defined in the IANA tz database
    ShiftIntervals times = new ShiftIntervals();
    List<String> teammateIds = Arrays.asList(); // List of all the teammate ids who will be part of this shift. Alternatively, you can supply emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      ShiftResponse result = client
              .shifts
              .createShift(name, color, timezone, times, teammateIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getColor());
      System.out.println(result.getTimezone());
      System.out.println(result.getTimes());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#createShift");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftResponse> response = client
              .shifts
              .createShift(name, color, timezone, times, teammateIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#createShift");
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
| **createShift** | [**CreateShift**](CreateShift.md)| Shift to create details | [optional] |

### Return type

[**ShiftResponse**](ShiftResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A shift |  -  |

<a name="createTeamShift"></a>
# **createTeamShift**
> ShiftResponse createTeamShift(teamId).createShift(createShift).execute();

Create team shift

Create a shift for a team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    String name = "name_example"; // Name of the shift
    String color = "black"; // Color of the shift
    String timezone = "timezone_example"; // A timezone name as defined in the IANA tz database
    ShiftIntervals times = new ShiftIntervals();
    List<String> teammateIds = Arrays.asList(); // List of all the teammate ids who will be part of this shift. Alternatively, you can supply emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String teamId = "tim_123"; // The Team ID
    try {
      ShiftResponse result = client
              .shifts
              .createTeamShift(name, color, timezone, times, teammateIds, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getColor());
      System.out.println(result.getTimezone());
      System.out.println(result.getTimes());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#createTeamShift");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftResponse> response = client
              .shifts
              .createTeamShift(name, color, timezone, times, teammateIds, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#createTeamShift");
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
| **teamId** | **String**| The Team ID | [default to tim_123] |
| **createShift** | [**CreateShift**](CreateShift.md)| Shift to create details | [optional] |

### Return type

[**ShiftResponse**](ShiftResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A shift |  -  |

<a name="getShift"></a>
# **getShift**
> ShiftResponse getShift(shiftId).execute();

Get shift

Fetch a shift.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    String shiftId = "shf_123"; // The Shift ID
    try {
      ShiftResponse result = client
              .shifts
              .getShift(shiftId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getColor());
      System.out.println(result.getTimezone());
      System.out.println(result.getTimes());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#getShift");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftResponse> response = client
              .shifts
              .getShift(shiftId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#getShift");
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
| **shiftId** | **String**| The Shift ID | [default to shf_123] |

### Return type

[**ShiftResponse**](ShiftResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A shift |  -  |

<a name="listShiftTeammates"></a>
# **listShiftTeammates**
> CommentsListMentionedTeammatesResponse listShiftTeammates(shiftId).execute();

List shift&#39;s teammates

List the teammates assigned to a shift.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    String shiftId = "shf_123"; // The Shift ID
    try {
      CommentsListMentionedTeammatesResponse result = client
              .shifts
              .listShiftTeammates(shiftId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#listShiftTeammates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommentsListMentionedTeammatesResponse> response = client
              .shifts
              .listShiftTeammates(shiftId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#listShiftTeammates");
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
| **shiftId** | **String**| The Shift ID | [default to shf_123] |

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

<a name="listShifts"></a>
# **listShifts**
> ShiftsListShiftsResponse listShifts().execute();

List Shifts

List the shifts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
      ShiftsListShiftsResponse result = client
              .shifts
              .listShifts()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#listShifts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftsListShiftsResponse> response = client
              .shifts
              .listShifts()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#listShifts");
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

[**ShiftsListShiftsResponse**](ShiftsListShiftsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Shifts |  -  |

<a name="listTeamShifts"></a>
# **listTeamShifts**
> ShiftsListShiftsResponse listTeamShifts(teamId).execute();

List team Shifts

List the shifts for a team (workspace).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
      ShiftsListShiftsResponse result = client
              .shifts
              .listTeamShifts(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#listTeamShifts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftsListShiftsResponse> response = client
              .shifts
              .listTeamShifts(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#listTeamShifts");
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

[**ShiftsListShiftsResponse**](ShiftsListShiftsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Shifts |  -  |

<a name="removeTeammatesFromShift"></a>
# **removeTeammatesFromShift**
> removeTeammatesFromShift(shiftId).teammateIds(teammateIds).execute();

Remove teammates from shift

Remove teammates from a shift.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    String shiftId = "shf_123"; // The Shift ID
    try {
      client
              .shifts
              .removeTeammatesFromShift(teammateIds, shiftId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#removeTeammatesFromShift");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shifts
              .removeTeammatesFromShift(teammateIds, shiftId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#removeTeammatesFromShift");
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
| **shiftId** | **String**| The Shift ID | [default to shf_123] |
| **teammateIds** | [**TeammateIds**](TeammateIds.md)| Teammate IDs to remove. Alternatively, you can supply emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [optional] |

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

<a name="teammateShiftsList"></a>
# **teammateShiftsList**
> ShiftsListShiftsResponse teammateShiftsList(teammateId).execute();

List Teammate Shifts

Lists all the shifts for the teammate.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
      ShiftsListShiftsResponse result = client
              .shifts
              .teammateShiftsList(teammateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#teammateShiftsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftsListShiftsResponse> response = client
              .shifts
              .teammateShiftsList(teammateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#teammateShiftsList");
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

[**ShiftsListShiftsResponse**](ShiftsListShiftsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Shifts |  -  |

<a name="updateShift"></a>
# **updateShift**
> updateShift(shiftId).updateShift(updateShift).execute();

Update shift

Update a shift.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    String shiftId = "shf_123"; // The Shift ID
    String name = "name_example"; // Name of the shift
    String color = "black"; // Color of the shift
    String timezone = "timezone_example"; // A timezone name as defined in the IANA tz database
    ShiftIntervals times = new ShiftIntervals();
    List<String> teammateIds = Arrays.asList(); // List of all the teammate ids who will be part of this shift. Alternatively, you can supply emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    try {
      client
              .shifts
              .updateShift(shiftId)
              .name(name)
              .color(color)
              .timezone(timezone)
              .times(times)
              .teammateIds(teammateIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#updateShift");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shifts
              .updateShift(shiftId)
              .name(name)
              .color(color)
              .timezone(timezone)
              .times(times)
              .teammateIds(teammateIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#updateShift");
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
| **shiftId** | **String**| The Shift ID | [default to shf_123] |
| **updateShift** | [**UpdateShift**](UpdateShift.md)| Updated Shift Body | [optional] |

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


# AnalyticsApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewExport**](AnalyticsApi.md#createNewExport) | **POST** /analytics/exports | Create a new analytics export. |
| [**createNewReport**](AnalyticsApi.md#createNewReport) | **POST** /analytics/reports | Create a new analytics report. |
| [**getExport**](AnalyticsApi.md#getExport) | **GET** /analytics/exports/{export_id} | Fetch an analytics export. |
| [**getReport**](AnalyticsApi.md#getReport) | **GET** /analytics/reports/{report_uid} | Fetch an analytics report. |


<a name="createNewExport"></a>
# **createNewExport**
> Object createNewExport().body(body).execute();

Create a new analytics export.

Create a new analytics export of messages or events (activities) over a specific time span. The export will be executed asynchronously. The response will include a link that can be used to retrieve the export status &amp; result. Refer to the [Analytics](https://dev.frontapp.com/reference/analytics) topic for details about specific metrics. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnalyticsApi;
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
      Object result = client
              .analytics
              .createNewExport()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#createNewExport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .analytics
              .createNewExport()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#createNewExport");
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
| **body** | **Object**|  | [optional] |

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
| **201** | An analytics export. |  -  |

<a name="createNewReport"></a>
# **createNewReport**
> Object createNewReport().analyticsReportRequest(analyticsReportRequest).execute();

Create a new analytics report.

Create a new analytics report for a set of metrics over a specific time span. Different filters (e.g. Inbox v Tag v Teammates) will be joined with AND logic, but the IDs within a filter will be joined with OR logic (e.g. Inbox A or Inbox B, Tag A or Tag B). The report will be executed asynchronously. The response will include a link that can be used to retrieve the report status &amp; result. Refer to the [Analytics](https://dev.frontapp.com/reference/analytics) topic for details about specific metrics. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnalyticsApi;
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
    Double start = 3.4D; // Start time of the data to include in the export (seconds since 1970-01-01T00:00:00+00). Will be rounded down to the start of the day.
    Double end = 3.4D; // End time of the data to include in the export (seconds since 1970-01-01T00:00:00+00). Will be rounded up to the end of the day.
    List<AnalyticsMetricId> metrics = Arrays.asList(); // List of the metrics required.
    String timezone = "timezone_example"; // [IANA name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the timezone to format the dates with. If omitted, the export will use Etc/UTC.
    TCIAIds filters = new TCIAIds();
    try {
      Object result = client
              .analytics
              .createNewReport(start, end, metrics)
              .timezone(timezone)
              .filters(filters)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#createNewReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .analytics
              .createNewReport(start, end, metrics)
              .timezone(timezone)
              .filters(filters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#createNewReport");
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
| **analyticsReportRequest** | [**AnalyticsReportRequest**](AnalyticsReportRequest.md)|  | [optional] |

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
| **201** | An analytics report. |  -  |

<a name="getExport"></a>
# **getExport**
> Object getExport(exportId).execute();

Fetch an analytics export.

Fetch an analytics exports. Refer to the [Analytics](https://dev.frontapp.com/reference/analytics) topic for details about specific metrics.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnalyticsApi;
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
    String exportId = "exp_123"; // The export ID.
    try {
      Object result = client
              .analytics
              .getExport(exportId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getExport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .analytics
              .getExport(exportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getExport");
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
| **exportId** | **String**| The export ID. | [default to exp_123] |

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
| **200** | An analytics export. |  -  |

<a name="getReport"></a>
# **getReport**
> Object getReport(reportUid).execute();

Fetch an analytics report.

Fetch an analytics report. Refer to the [Analytics](https://dev.frontapp.com/reference/analytics) topic for details about specific metrics.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnalyticsApi;
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
    String reportUid = "723ec32796f12c6f05f6b124d8ef76191a38cec990e0f65d549206c51373f1a0"; // The report UID.
    try {
      Object result = client
              .analytics
              .getReport(reportUid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .analytics
              .getReport(reportUid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getReport");
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
| **reportUid** | **String**| The report UID. | [default to 723ec32796f12c6f05f6b124d8ef76191a38cec990e0f65d549206c51373f1a0] |

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
| **200** | An analytics report. |  -  |


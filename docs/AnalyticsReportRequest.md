

# AnalyticsReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**start** | **Double** | Start time of the data to include in the export (seconds since 1970-01-01T00:00:00+00). Will be rounded down to the start of the day. |  |
|**end** | **Double** | End time of the data to include in the export (seconds since 1970-01-01T00:00:00+00). Will be rounded up to the end of the day. |  |
|**timezone** | **String** | [IANA name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the timezone to format the dates with. If omitted, the export will use Etc/UTC. |  [optional] |
|**filters** | [**TCIAIds**](TCIAIds.md) |  |  [optional] |
|**metrics** | **List&lt;AnalyticsMetricId&gt;** | List of the metrics required. |  |




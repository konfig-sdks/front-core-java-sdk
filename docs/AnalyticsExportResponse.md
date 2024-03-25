

# AnalyticsExportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**AnalyticsExportResponseLinks**](AnalyticsExportResponseLinks.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the analytics |  [optional] |
|**progress** | **Integer** | Number ranging from 0 to 100 corresponding to the percentage of the analytics processed. |  [optional] |
|**url** | **String** | The URL from which the export data can be downloaded. Only displays after you make a GET request to the link included in the POST response. |  [optional] |
|**filename** | **String** | The filename of the export with extension included. Only displays after you make a GET request to the link included in the POST response. |  [optional] |
|**size** | **Double** | Size (in bytes) of the export data. Only displays after you make a GET request to the link included in the POST response. |  [optional] |
|**createdAt** | **Double** | Timestamp (in seconds) at which the export was requested. |  [optional] |
|**filters** | [**TCIAIds**](TCIAIds.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RUNNING | &quot;running&quot; |
| DONE | &quot;done&quot; |
| TOO_BIG | &quot;too_big&quot; |
| FAILED | &quot;failed&quot; |




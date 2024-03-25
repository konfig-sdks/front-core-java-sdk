

# AnalyticsReportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**AnalyticsReportResponseLinks**](AnalyticsReportResponseLinks.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the report. |  [optional] |
|**progress** | **Integer** | Number ranging from 0 to 100 corresponding to the percentage of the analytics processed. |  [optional] |
|**metrics** | [**List&lt;AnalyticsScalar&gt;**](AnalyticsScalar.md) | The metrics computed for the report. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RUNNING | &quot;running&quot; |
| DONE | &quot;done&quot; |
| FAILED | &quot;failed&quot; |




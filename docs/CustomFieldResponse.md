

# CustomFieldResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the custom field |  |
|**links** | [**CustomFieldResponseLinks**](CustomFieldResponseLinks.md) |  |  |
|**id** | **String** | Unique identifier of the custom field |  |
|**name** | **String** | Name of the custom field |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the custom field |  |
|**values** | [**List&lt;CustomFieldResponseValuesInner&gt;**](CustomFieldResponseValuesInner.md) | List of possible values for a custom field of type &#x60;enum&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| BOOLEAN | &quot;boolean&quot; |
| DATETIME | &quot;datetime&quot; |
| NUMBER | &quot;number&quot; |
| TEAMMATE | &quot;teammate&quot; |
| TEAMMATE_LIST | &quot;teammate_list&quot; |
| INBOX | &quot;inbox&quot; |
| ENUM | &quot;enum&quot; |




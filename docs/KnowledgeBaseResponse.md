

# KnowledgeBaseResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**KnowledgeBaseResponseLinks**](KnowledgeBaseResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the knowledge base |  [optional] |
|**name** | **String** | Knowledge base name |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the KB |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the KB |  [optional] |
|**locale** | [**LocaleEnum**](#LocaleEnum) | Locale of this requested KB |  [optional] |
|**createdAt** | **Double** | Timestamp when the knowledge base was created |  [optional] |
|**updatedAt** | **Double** | Timestamp when the knowledge base was updated |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PUBLISHED | &quot;published&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INTERNAL | &quot;internal&quot; |
| EXTERNAL | &quot;external&quot; |



## Enum: LocaleEnum

| Name | Value |
|---- | -----|
| FR | &quot;fr&quot; |
| EN | &quot;en&quot; |




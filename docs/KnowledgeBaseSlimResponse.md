

# KnowledgeBaseSlimResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**KnowledgeBaseSlimResponseLinks**](KnowledgeBaseSlimResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the knowledge base |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the KB |  [optional] |
|**locales** | **List&lt;String&gt;** | List of the KB&#39;s possible locales |  [optional] |
|**createdAt** | **Double** | Timestamp when the knowledge base was created |  [optional] |
|**updatedAt** | **Double** | Timestamp when the knowledge base was updated |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INTERNAL | &quot;internal&quot; |
| EXTERNAL | &quot;external&quot; |




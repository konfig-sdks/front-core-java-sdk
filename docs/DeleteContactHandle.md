

# DeleteContactHandle


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handle** | **String** | Handle used to reach the contact. |  |
|**source** | [**SourceEnum**](#SourceEnum) | Source of the handle. Can be &#x60;email&#x60;, &#x60;phone&#x60;, &#x60;twitter&#x60;, &#x60;facebook&#x60;, &#x60;intercom&#x60;, &#x60;front_chat&#x60;, or &#x60;custom&#x60;. |  |
|**force** | **Boolean** | Force the deletetion of the contact if the handle is the last one |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| TWITTER | &quot;twitter&quot; |
| EMAIL | &quot;email&quot; |
| PHONE | &quot;phone&quot; |
| FACEBOOK | &quot;facebook&quot; |
| INTERCOM | &quot;intercom&quot; |
| FRONT_CHAT | &quot;front_chat&quot; |
| CUSTOM | &quot;custom&quot; |




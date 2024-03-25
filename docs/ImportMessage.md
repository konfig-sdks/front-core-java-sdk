

# ImportMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | List of tag names to add to the conversation |  [optional] |
|**sender** | [**ImportMessageSender**](ImportMessageSender.md) |  |  |
|**to** | **List&lt;String&gt;** | List of the recipient handles who will receive this message |  |
|**cc** | **List&lt;String&gt;** | List of the recipient handles who will receive a copy of this message |  [optional] |
|**bcc** | **List&lt;String&gt;** | List of the recipient handles who will receive a blind copy of this message |  [optional] |
|**subject** | **String** | Subject of the message |  [optional] |
|**body** | **String** | Body of the message |  |
|**bodyFormat** | [**BodyFormatEnum**](#BodyFormatEnum) | Format of the message body. Can be &#x60;markdown&#x60; (default) or &#x60;html&#x60;, and can only be specified for &#x60;email&#x60; type. |  [optional] |
|**externalId** | **String** | External identifier of the message. Front won&#39;t import two messages with the same external ID. |  |
|**createdAt** | **Integer** | Date at which the message as been sent or received. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the message to import. Default is &#x60;email&#x60;. |  [optional] |
|**assigneeId** | **String** | ID of the teammate who will be assigned to the conversation. |  [optional] |
|**conversationId** | **String** | If supplied, Front will thread this message into conversation with the given ID. Note that including this parameter nullifies the &#x60;thread_ref&#x60; parameter _completely_. |  [optional] |
|**metadata** | [**ImportMessageMetadata**](ImportMessageMetadata.md) |  |  |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB. |  [optional] |



## Enum: BodyFormatEnum

| Name | Value |
|---- | -----|
| HTML | &quot;html&quot; |
| MARKDOWN | &quot;markdown&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| SMS | &quot;sms&quot; |
| INTERCOM | &quot;intercom&quot; |
| CUSTOM | &quot;custom&quot; |




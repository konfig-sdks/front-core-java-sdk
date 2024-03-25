

# CustomMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sender** | [**CustomMessageSender**](CustomMessageSender.md) |  |  |
|**subject** | **String** | Subject of the message |  [optional] |
|**body** | **String** | Body of the message |  |
|**bodyFormat** | [**BodyFormatEnum**](#BodyFormatEnum) | Format of the message body. Can be &#x60;markdown&#x60; (default) or &#x60;html&#x60;. |  [optional] |
|**metadata** | [**CustomMessageMetadata**](CustomMessageMetadata.md) |  |  [optional] |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB. |  [optional] |



## Enum: BodyFormatEnum

| Name | Value |
|---- | -----|
| HTML | &quot;html&quot; |
| MARKDOWN | &quot;markdown&quot; |




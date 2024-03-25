

# CreateSharedMessageTemplate

A message template that is used for pre-written responses

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the message template |  |
|**subject** | **String** | Subject of the message template. If not set, the name will be used to populate the subject. |  [optional] |
|**body** | **String** | Body of the message template |  |
|**folderId** | **String** | ID of the message template folder to place this message template in |  [optional] |
|**inboxIds** | **List&lt;String&gt;** | The specific inboxes this template is available in. If unspecified or null, then it will be available in all inboxes. Array should be non-empty. |  [optional] |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB. |  [optional] |




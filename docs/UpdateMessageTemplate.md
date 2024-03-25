

# UpdateMessageTemplate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the message template |  [optional] |
|**subject** | **String** | Subject of the message template |  [optional] |
|**body** | **String** | Body of the message template |  [optional] |
|**folderId** | **String** | ID of the parent folder to be placed into. Goes into the root folder if unspecified or if null. |  [optional] |
|**inboxIds** | **List&lt;String&gt;** | The specific inboxes this template is available in. If null, then it will be available in all inboxes. Array should be non-empty. If unspecified, will retain previous value. |  [optional] |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://dev.frontapp.com/docs/attachments-1). Max 25 MB. Specify an empty array to delete all attachments from a message template. If unspecified, it will retain previous value. |  [optional] |




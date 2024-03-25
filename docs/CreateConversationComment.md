

# CreateConversationComment

Details for the starter comment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorId** | **String** | ID of the teammate creating the comment. If omitted, will post as the API Token or OAuth client of the requester. |  [optional] |
|**body** | **String** | Content of the comment |  |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1). |  [optional] |




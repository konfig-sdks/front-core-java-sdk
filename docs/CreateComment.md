

# CreateComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorId** | **String** | ID of the teammate creating the comment. Alternatively, you can supply the author as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). If omitted, will post as the API Token or OAuth client of the requester. |  [optional] |
|**body** | **String** | Content of the comment. Can include markdown formatting. |  |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB. |  [optional] |




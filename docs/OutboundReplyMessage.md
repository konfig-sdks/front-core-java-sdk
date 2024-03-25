

# OutboundReplyMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **List&lt;String&gt;** | List of the recipient handles who will receive this message |  [optional] |
|**cc** | **List&lt;String&gt;** | List of the recipient handles who will receive a copy of this message |  [optional] |
|**bcc** | **List&lt;String&gt;** | List of the recipient handles who will receive a copy of this message |  [optional] |
|**senderName** | **String** | Name used for the sender info of the message |  [optional] |
|**subject** | **String** | Subject of the message for email message |  [optional] |
|**authorId** | **String** | ID of the teammate on behalf of whom the answer is sent |  [optional] |
|**channelId** | **String** | Channel ID the message is sent from |  [optional] |
|**body** | **String** | Body of the message |  |
|**text** | **String** | Text version of the body for email messages |  [optional] |
|**quoteBody** | **String** | Body for the quote that the message is referencing. Only available on email channels. |  [optional] |
|**options** | [**OutboundReplyMessageOptions**](OutboundReplyMessageOptions.md) |  |  [optional] |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB. |  [optional] |
|**signatureId** | **String** | ID of the signature to attach to this draft. If null, no signature is attached. |  [optional] |
|**shouldAddDefaultSignature** | **Boolean** | Whether or not Front should try to resolve a signature for the message. Is ignored if signature_id is included. Default false; |  [optional] |




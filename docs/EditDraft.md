

# EditDraft


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorId** | **String** | ID of the teammate on behalf of whom the draft will be created. Alternatively, you can supply the author ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). |  |
|**to** | **List&lt;String&gt;** | List of recipient handles who will receive the message once the draft is sent |  [optional] |
|**cc** | **List&lt;String&gt;** | List of recipient handles who will receive a copy of the message once the draft is sent |  [optional] |
|**bcc** | **List&lt;String&gt;** | List of the recipient handles who will receive a blind copy of the message once the draft is sent |  [optional] |
|**subject** | **String** | Subject of the draft. |  [optional] |
|**body** | **String** | Body of the draft |  |
|**quoteBody** | **String** | Body for the quote that the message is referencing. Only available on email channels. |  [optional] |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1). Max 25 MB. |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | Mode of the draft to update. Can only be &#39;shared&#39; (draft is visible to all teammates with access to the conversation). |  [optional] |
|**signatureId** | **String** | ID of the signature to attach to this draft. If null, no signature is attached. |  [optional] |
|**shouldAddDefaultSignature** | **Boolean** | Whether or not Front should try to resolve a signature for the message. Is ignored if signature_id is included. Default false; |  [optional] |
|**channelId** | **String** | ID of the channel from which the draft will be sent. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). |  |
|**version** | **String** | Version of the draft |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| SHARED | &quot;shared&quot; |




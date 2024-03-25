

# MessageResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the message in Front |  [optional] |
|**links** | [**MessageResponseLinks**](MessageResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the message |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the message |  [optional] |
|**isInbound** | **Boolean** | Whether or not the message has been received or sent |  [optional] |
|**draftMode** | [**DraftModeEnum**](#DraftModeEnum) | If the message is a draft, describes the draft mode. Can be &#39;private&#39; (draft is visible to the author only) or &#39;shared&#39; (draft is visible to all teammates with access to the conversation). |  [optional] |
|**errorType** | **String** | Type of the error when the draft failed to be sent |  [optional] |
|**createdAt** | **Double** | Date at which the message as been sent or received |  [optional] |
|**subject** | **String** | Subject of the message |  [optional] |
|**blurb** | **String** | Preview of the message body |  [optional] |
|**author** | [**TeammateResponse**](TeammateResponse.md) |  |  [optional] |
|**recipients** | [**List&lt;RecipientResponse&gt;**](RecipientResponse.md) |  |  [optional] |
|**body** | **String** | Body of the message |  [optional] |
|**text** | **String** | Text version of the body for email messages |  [optional] |
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | List of files attached to the message |  [optional] |
|**signature** | [**SignatureResponse**](SignatureResponse.md) |  |  [optional] |
|**metadata** | [**MessageResponseMetadata**](MessageResponseMetadata.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CALL | &quot;call&quot; |
| CUSTOM | &quot;custom&quot; |
| EMAIL | &quot;email&quot; |
| FACEBOOK | &quot;facebook&quot; |
| FRONT_CHAT | &quot;front_chat&quot; |
| GOOGLEPLAY | &quot;googleplay&quot; |
| INTERCOM | &quot;intercom&quot; |
| INTERNAL | &quot;internal&quot; |
| PHONE_CALL | &quot;phone-call&quot; |
| SMS | &quot;sms&quot; |
| SMOOCH | &quot;smooch&quot; |
| TWEET | &quot;tweet&quot; |
| TWEET_DM | &quot;tweet_dm&quot; |
| WHATSAPP | &quot;whatsapp&quot; |
| YALO_WHA | &quot;yalo_wha&quot; |



## Enum: DraftModeEnum

| Name | Value |
|---- | -----|
| SHARED | &quot;shared&quot; |
| PRIVATE | &quot;private&quot; |






# MessageTemplateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**MessageTemplateResponseLinks**](MessageTemplateResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the message template |  [optional] |
|**name** | **String** | Name of the message template |  [optional] |
|**subject** | **String** | Subject of the message template |  [optional] |
|**body** | **String** | Body of the message template |  [optional] |
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | List of files attached to the response |  [optional] |
|**isAvailableForAllInboxes** | **Boolean** | Whether or not the template is available in all inboxes. |  [optional] |
|**inboxIds** | **List&lt;String&gt;** | List of inboxes the template is available in. Null if there are no restrictions. |  [optional] |




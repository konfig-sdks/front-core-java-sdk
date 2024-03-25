

# CreateMessageTemplateAsChild

A message template that is used for pre-written responses

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the message template |  |
|**subject** | **String** | Subject of the message template. If not set, the name will be used to populate the subject. |  [optional] |
|**body** | **String** | Body of the message template |  |
|**inboxIds** | **List&lt;String&gt;** | The specific inboxes this template is available in. If unspecified or null, then it will be available in all inboxes. Array should be non-empty. |  [optional] |




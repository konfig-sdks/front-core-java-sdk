

# CreateConversation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Conversation type |  |
|**inboxId** | **String** | Inbox ID for the conversation. Either &#x60;inbox_id&#x60; OR &#x60;teammate_ids&#x60; must be provided (not both). |  [optional] |
|**teammateIds** | **List&lt;String&gt;** | Teammates to add to the conversation. Either &#x60;inbox_id&#x60; OR &#x60;teammate_ids&#x60; must be provided (not both). |  [optional] |
|**subject** | **String** | Subject of the conversation |  |
|**comment** | [**CreateConversationComment**](CreateConversationComment.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCUSSION | &quot;discussion&quot; |




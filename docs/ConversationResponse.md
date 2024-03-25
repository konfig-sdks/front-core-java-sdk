

# ConversationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;TagResponse&gt;**](TagResponse.md) | List of the tags for this conversation |  [optional] |
|**links** | [**ConversationResponseLinks**](ConversationResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the conversation |  [optional] |
|**subject** | **String** | Subject of the message for email message |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the conversation |  [optional] |
|**assignee** | [**TeammateResponse**](TeammateResponse.md) |  |  [optional] |
|**recipient** | [**RecipientResponse**](RecipientResponse.md) |  |  [optional] |
|**links** | [**List&lt;LinkResponse&gt;**](LinkResponse.md) | List of the links for this conversation |  [optional] |
|**customFields** | **Object** | Custom field attributes for this conversation |  [optional] |
|**createdAt** | **Double** | Timestamp at which the conversation have been created. |  [optional] |
|**waitingSince** | **Double** | Timestamp of the oldest unreplied message. |  [optional] |
|**isPrivate** | **Boolean** | Whether or not the conversation is private |  [optional] |
|**scheduledReminders** | [**List&lt;Reminder&gt;**](Reminder.md) | List of scheduled (non-expired and non-canceled) reminders for this conversation |  [optional] |
|**metadata** | [**ConversationResponseMetadata**](ConversationResponseMetadata.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ARCHIVED | &quot;archived&quot; |
| UNASSIGNED | &quot;unassigned&quot; |
| DELETED | &quot;deleted&quot; |
| ASSIGNED | &quot;assigned&quot; |




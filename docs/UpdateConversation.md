

# UpdateConversation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assigneeId** | **String** | ID of the teammate to assign the conversation to. Set it to null to unassign. |  [optional] |
|**inboxId** | **String** | ID of the inbox to move the conversation to. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | New status of the conversation |  [optional] |
|**tagIds** | **List&lt;String&gt;** | List of all the tag IDs replacing the old conversation tags |  [optional] |
|**customFields** | **Object** | Custom field attributes for this conversation. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ARCHIVED | &quot;archived&quot; |
| OPEN | &quot;open&quot; |
| DELETED | &quot;deleted&quot; |
| SPAM | &quot;spam&quot; |




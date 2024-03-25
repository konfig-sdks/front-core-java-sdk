

# EventResponse

An event is created everytime something interesting is happening in Front.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**EventResponseLinks**](EventResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the event |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of event |  [optional] |
|**emittedAt** | **Double** | Date at which the event has been emitted |  [optional] |
|**source** | [**EventResponseSource**](EventResponseSource.md) |  |  [optional] |
|**target** | [**EventResponseTarget**](EventResponseTarget.md) |  |  [optional] |
|**conversation** | [**ConversationResponse**](ConversationResponse.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ASSIGN | &quot;assign&quot; |
| UNASSIGN | &quot;unassign&quot; |
| ARCHIVE | &quot;archive&quot; |
| REOPEN | &quot;reopen&quot; |
| TRASH | &quot;trash&quot; |
| RESTORE | &quot;restore&quot; |
| REMINDER | &quot;reminder&quot; |
| COMMENT | &quot;comment&quot; |
| MENTION | &quot;mention&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
| OUTBOUND_REPLY | &quot;outbound_reply&quot; |
| MOVE | &quot;move&quot; |
| FORWARD | &quot;forward&quot; |
| TAG | &quot;tag&quot; |
| UNTAG | &quot;untag&quot; |
| SENDING_ERROR | &quot;sending_error&quot; |
| MESSAGE_BOUNCE_ERROR | &quot;message_bounce_error&quot; |
| CONVERSATIONS_MERGED | &quot;conversations_merged&quot; |
| LINK_ADDED | &quot;link_added&quot; |
| LINK_REMOVED | &quot;link_removed&quot; |
| CUSTOM_FIELD_UPDATED | &quot;custom_field_updated&quot; |




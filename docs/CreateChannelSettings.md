

# CreateChannelSettings

Settings of the channel

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**undoSendTime** | [**UndoSendTimeEnum**](#UndoSendTimeEnum) | The time (measured in seconds) that users have to undo a send operation in the channel. |  [optional] |
|**allTeammatesCanReply** | **Boolean** | Whether teammates without inbox access can reply on this channel. Only allowed for shared channels. |  [optional] |
|**webhookUrl** | **String** | The webhook URL outbound messages should be sent to. Only allowed for \&quot;custom\&quot; type channels. |  [optional] |
|**sid** | **String** | The SID of the Twilio channel. Only allowed for \&quot;twilio\&quot; type channels. |  [optional] |
|**authToken** | **String** | The auth token for the Twilio account. Only allowed for \&quot;twilio\&quot; type channels. |  [optional] |



## Enum: UndoSendTimeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_5 | 5 |
| NUMBER_10 | 10 |
| NUMBER_15 | 15 |
| NUMBER_30 | 30 |
| NUMBER_60 | 60 |




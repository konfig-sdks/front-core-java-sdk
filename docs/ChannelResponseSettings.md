

# ChannelResponseSettings

Channel settings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**undoSendTime** | [**UndoSendTimeEnum**](#UndoSendTimeEnum) | The time (measured in seconds) that users have to undo a send operation in the channel. |  [optional] |
|**allTeammatesCanReply** | **Boolean** | Whether teammates without inbox access can reply on this channel. Only present for shared channels; omitted for private channels. |  [optional] |



## Enum: UndoSendTimeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_5 | 5 |
| NUMBER_10 | 10 |
| NUMBER_15 | 15 |
| NUMBER_30 | 30 |
| NUMBER_60 | 60 |




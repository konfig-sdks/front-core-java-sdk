

# CreateChannel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the channel |  [optional] |
|**settings** | [**CreateChannelSettings**](CreateChannelSettings.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the channel |  |
|**sendAs** | **String** | Sending address of your channel. Required for SMTP channels. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;custom&quot; |
| SMTP | &quot;smtp&quot; |
| TWILIO | &quot;twilio&quot; |




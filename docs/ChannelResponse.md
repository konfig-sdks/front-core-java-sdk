

# ChannelResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**ChannelResponseLinks**](ChannelResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier for the channel |  [optional] |
|**name** | **String** | The name of the channel |  [optional] |
|**address** | **String** | Address receiving the messages |  [optional] |
|**types** | [**TypesEnum**](#TypesEnum) | Type of the channel |  [optional] |
|**sendAs** | **String** | Address which appears as the sender for messages sent from Front |  [optional] |
|**settings** | [**ChannelResponseSettings**](ChannelResponseSettings.md) |  |  [optional] |
|**isPrivate** | **Boolean** | Whether or not the channel is individual |  [optional] |
|**isValid** | **Boolean** | Whether or not the channel configuration is valid |  [optional] |



## Enum: TypesEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;custom&quot; |
| FACEBOOK | &quot;facebook&quot; |
| GMAIL | &quot;gmail&quot; |
| GOOGLE_PLAY | &quot;google_play&quot; |
| IMAP | &quot;imap&quot; |
| INTERCOM | &quot;intercom&quot; |
| FORM | &quot;form&quot; |
| OFFICE365 | &quot;office365&quot; |
| LAYER_ANON | &quot;layer_anon&quot; |
| SMOOCH | &quot;smooch&quot; |
| SMTP | &quot;smtp&quot; |
| TALKDESK | &quot;talkdesk&quot; |
| TRULY | &quot;truly&quot; |
| TWILIO | &quot;twilio&quot; |
| TWILIO_WHATSAPP | &quot;twilio_whatsapp&quot; |
| TWITTER | &quot;twitter&quot; |
| TWITTER_DM | &quot;twitter_dm&quot; |
| YALO_WHA | &quot;yalo_wha&quot; |
| FRONT_CHAT | &quot;front_chat&quot; |
| FRONT_MAIL | &quot;front_mail&quot; |




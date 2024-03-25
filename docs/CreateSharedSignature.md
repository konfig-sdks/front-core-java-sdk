

# CreateSharedSignature

A signature that can be used to sign messages.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the signature |  |
|**senderInfo** | **String** | Sender info of the signature that will appear in the From line of emails sent. |  [optional] |
|**body** | **String** | Body of the signature |  |
|**isVisibleForAllTeammateChannels** | **Boolean** | Whether or not the signature is visible in all individual channels for teammates in the given team. |  [optional] |
|**isDefault** | **Boolean** | If true, the signature will be set as the default signature for the team. |  [optional] |
|**channelIds** | **List&lt;String&gt;** | The specific channels this signature is available in. If omitted or null, the signature will be available in all channels the team has access to. Alternatively, you can specify channels using a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). |  [optional] |




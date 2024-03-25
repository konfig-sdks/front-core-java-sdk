

# UpdateSignature

A signature that can be used to sign messages.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the signature |  [optional] |
|**senderInfo** | **String** | Sender info of the signature that will appear in the From line of emails sent. |  [optional] |
|**body** | **String** | Body of the signature |  [optional] |
|**isVisibleForAllTeammateChannels** | **Boolean** | Whether or not the signature is visible in all individual channels for teammates in the given team. Can only be set for shared signatures. |  [optional] |
|**isDefault** | **Boolean** | If true, the signature will be set as the default signature for the team or teammate. |  [optional] |
|**channelIds** | **List&lt;String&gt;** | The specific shared channels this signature if available in. If null, then it will be available in all channels. If unspecified, will retain previous value. Alternatively, you can specify channels using a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). |  [optional] |




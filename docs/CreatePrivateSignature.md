

# CreatePrivateSignature

A signature that can be used to sign messages.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the signature |  |
|**senderInfo** | **String** | Sender info of the signature that will appear in the From line of emails sent. |  [optional] |
|**body** | **String** | Body of the signature |  |
|**isDefault** | **Boolean** | If true, the signature will be set as the default signature for the teammate. |  [optional] |
|**channelIds** | **List&lt;String&gt;** | The specific channels this signature is available in. If omitted or null, the signature will be available in all channels the teammate has access to. Alternatively, you can specify channels using a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). |  [optional] |




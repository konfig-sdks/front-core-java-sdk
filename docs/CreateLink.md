

# CreateLink

A link is used to connect a Front conversation to an external resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the link. If none is specified, the external_url is used as a default |  [optional] |
|**externalUrl** | **String** | Underlying identifying url of the link |  [optional] |
|**pattern** | **String** | The string that dynamic object configurations will match on to update a specific dynamic object. For example, if you&#39;ve configured a dynamic object to match on ORDER-{Digits}, and you want to specifically update the dynamic objects for ORDER-777 to retrieve the latest information from external systems, send \&quot;ORDER-777\&quot;. Repeat for other specific identifiers, such as \&quot;ORDER-435\&quot;. |  [optional] |




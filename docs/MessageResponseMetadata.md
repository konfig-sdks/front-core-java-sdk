

# MessageResponseMetadata

Optional metadata about the message

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intercomUrl** | **String** | For &#x60;intercom&#x60; messages only. URL of the Intercom conversation the message is coming from. |  [optional] |
|**duration** | **Integer** | For &#x60;truly-call&#x60; messages only. Length of the call in seconds. |  [optional] |
|**haveBeenAnswered** | **Boolean** | For &#x60;truly-call&#x60; messages only. Whether or not the call have been answered. |  [optional] |
|**externalId** | **String** | For &#x60;tweet&#x60; or &#39;custom&#39; (partner channel token authenticated) messages only. Unique message identifier in the underlying provider (Twitter or Partner). For custom messages, only present for partner channel token authenticated requests. |  [optional] |
|**twitterUrl** | **String** | For &#x60;tweet&#x60; messages only. URL of the tweet. |  [optional] |
|**isRetweet** | **Boolean** | For &#x60;tweet&#x60; messages only. Whether or not the tweet is a retweet. |  [optional] |
|**haveBeenRetweeted** | **Boolean** | For &#x60;tweet&#x60; messages only. Whether or not the tweet have been retweeted. |  [optional] |
|**haveBeenFavorited** | **Boolean** | For &#x60;tweet&#x60; messages only. Whether or not the tweet have been favorited. |  [optional] |
|**threadRef** | **String** | For &#x60;custom&#x60; messages only. Custom reference which is used to thread messages. |  [optional] |
|**headers** | **Object** | For &#x60;custom&#x60; messages only. Custom object holding internal information. |  [optional] |
|**chatVisitorUrl** | **String** | For &#x60;front_chat&#x60; messages only. Source URL from the chat widget when sending a message. |  [optional] |




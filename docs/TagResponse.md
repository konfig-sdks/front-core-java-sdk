

# TagResponse

A tag is a label that can be used to classify conversations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the tag |  [optional] |
|**links** | [**TagResponseLinks**](TagResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the tag |  [optional] |
|**name** | **String** | Name of the tag |  [optional] |
|**highlight** | [**HighlightEnum**](#HighlightEnum) | Highlight color of the tag. |  [optional] |
|**isPrivate** | **Boolean** | Whether or not the tag is individual |  [optional] |
|**isVisibleInConversationLists** | **Boolean** | Whether the tag is visible in conversation lists. |  [optional] |
|**createdAt** | **Double** | Timestamp of tag create creation |  [optional] |
|**updatedAt** | **Double** | Timestamp of the last tag update |  [optional] |



## Enum: HighlightEnum

| Name | Value |
|---- | -----|
| GREY | &quot;grey&quot; |
| PINK | &quot;pink&quot; |
| RED | &quot;red&quot; |
| ORANGE | &quot;orange&quot; |
| YELLOW | &quot;yellow&quot; |
| GREEN | &quot;green&quot; |
| LIGHT_BLUE | &quot;light-blue&quot; |
| BLUE | &quot;blue&quot; |
| PURPLE | &quot;purple&quot; |




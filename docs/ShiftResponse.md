

# ShiftResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**ShiftResponseLinks**](ShiftResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the shift |  [optional] |
|**name** | **String** | Name of the shift |  [optional] |
|**color** | [**ColorEnum**](#ColorEnum) | Color of the shift |  [optional] |
|**timezone** | **String** | A timezone name as defined in the IANA tz database |  [optional] |
|**times** | [**ShiftIntervals**](ShiftIntervals.md) |  |  [optional] |
|**createdAt** | **Double** | The timestamp when the shift was created. |  [optional] |
|**updatedAt** | **Double** | The timestamp when the shift was updated. |  [optional] |



## Enum: ColorEnum

| Name | Value |
|---- | -----|
| BLACK | &quot;black&quot; |
| GREY | &quot;grey&quot; |
| PINK | &quot;pink&quot; |
| PURPLE | &quot;purple&quot; |
| BLUE | &quot;blue&quot; |
| TEAL | &quot;teal&quot; |
| GREEN | &quot;green&quot; |
| YELLOW | &quot;yellow&quot; |
| ORANGE | &quot;orange&quot; |
| RED | &quot;red&quot; |




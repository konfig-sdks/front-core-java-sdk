

# CreateShift


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the shift |  |
|**color** | [**ColorEnum**](#ColorEnum) | Color of the shift |  |
|**timezone** | **String** | A timezone name as defined in the IANA tz database |  |
|**times** | [**ShiftIntervals**](ShiftIntervals.md) |  |  |
|**teammateIds** | **List&lt;String&gt;** | List of all the teammate ids who will be part of this shift. Alternatively, you can supply emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). |  |



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




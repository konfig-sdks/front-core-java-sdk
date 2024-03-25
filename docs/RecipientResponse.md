

# RecipientResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**RecipientResponseLinks**](RecipientResponseLinks.md) |  |  [optional] |
|**name** | **String** | Name of the recipient. |  [optional] |
|**handle** | **String** | Handle of the contact. Can be any string used to uniquely identify the contact |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Role of the recipient |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| FROM | &quot;from&quot; |
| TO | &quot;to&quot; |
| CC | &quot;cc&quot; |
| BCC | &quot;bcc&quot; |




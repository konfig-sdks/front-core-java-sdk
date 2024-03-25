

# UpdateTeammate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | New username. It must be unique and can only contains lowercase letters, numbers and underscores. |  [optional] |
|**firstName** | **String** | New first name |  [optional] |
|**lastName** | **String** | New last name |  [optional] |
|**isAvailable** | **Boolean** | New availability status |  [optional] |
|**customFields** | **Object** | Custom field attributes for this teammate. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields. |  [optional] |




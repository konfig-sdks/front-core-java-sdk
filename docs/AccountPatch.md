

# AccountPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Account description |  [optional] |
|**name** | **String** | Name of the Account |  [optional] |
|**domains** | **List&lt;String&gt;** | List of domains associated with the Account |  [optional] |
|**customFields** | **Object** | Custom field attributes for this account. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields. |  [optional] |




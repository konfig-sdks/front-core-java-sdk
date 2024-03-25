

# Contact


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Contact description |  [optional] |
|**name** | **String** | Contact name |  [optional] |
|**avatar** | **File** | Binary data of avatar. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB. |  [optional] |
|**isSpammer** | **Boolean** | Whether or not the contact is marked as a spammer |  [optional] |
|**links** | **List&lt;String&gt;** | List of all the links of the contact |  [optional] |
|**groupNames** | **List&lt;String&gt;** | List of all the group names the contact belongs to. It will automatically create missing groups |  [optional] |
|**customFields** | **Object** | Custom field attributes for this contact. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields. |  [optional] |




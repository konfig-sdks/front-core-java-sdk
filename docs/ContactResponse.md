

# ContactResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Contact description |  [optional] |
|**links** | [**ContactResponseLinks**](ContactResponseLinks.md) |  |  [optional] |
|**id** | **String** | Unique identifier of the contact |  [optional] |
|**name** | **String** | Contact name |  [optional] |
|**avatarUrl** | **String** | URL of the contact&#39;s avatar |  [optional] |
|**isSpammer** | **Boolean** | Whether or not the contact is marked as a spammer |  [optional] |
|**links** | **List&lt;String&gt;** | List of all the links of the contact |  [optional] |
|**groups** | [**List&lt;ContactGroupResponses&gt;**](ContactGroupResponses.md) | List of the groups the contact belongs to. |  [optional] |
|**handles** | [**List&lt;ContactHandle&gt;**](ContactHandle.md) | List of the handles and sources with which the contact is reachable. |  [optional] |
|**customFields** | **Object** | Custom field attributes for this contact. |  [optional] |
|**isPrivate** | **Boolean** | Whether or not the contact is individual |  [optional] |





# SearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **List&lt;String&gt;** |  |  [optional]
**count** | **Integer** | An integer indicating the desired maximum number of query results per page. |  [optional]
**excludedAttributes** | **List&lt;String&gt;** |  |  [optional]
**filter** | **String** | The filter string used to request a subset of resources. |  [optional]
**schemas** | [**List&lt;SchemasEnum&gt;**](#List&lt;SchemasEnum&gt;) | Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource. | 
**sortBy** | **String** | A string indicating the attribute whose value shall be used to order the returned responses. |  [optional]
**sortOrder** | [**SortOrderEnum**](#SortOrderEnum) | A string indicating the order in which the &#39;sortBy&#39; parameter is applied. |  [optional]
**startIndex** | **Integer** | An integer indicating the 1-based index of the first query result. |  [optional]


<a name="List<SchemasEnum>"></a>
## Enum: List&lt;SchemasEnum&gt;
Name | Value
---- | -----
URN_IETF_PARAMS_SCIM_API_MESSAGES_2_0_SEARCHREQUEST | &quot;urn:ietf:params:scim:api:messages:2.0:SearchRequest&quot;


<a name="SortOrderEnum"></a>
## Enum: SortOrderEnum
Name | Value
---- | -----
ASCENDING | &quot;ascending&quot;
DESCENDING | &quot;descending&quot;




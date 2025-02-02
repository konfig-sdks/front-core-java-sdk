/*
 * Core API
 * Front is a customer operations platform that enables support, sales, and account management teams to deliver exceptional service at scale. Front streamlines customer communication by combining the efficiency of a help desk and the familiarity of email, with automated workflows and real-time collaboration behind the scenes.  With Front, teams can centralize messages across channels, route them to the right person, and unlock visibility and insights across all of their customer operations. More than 8000 businesses use Front to drive operational efficiency that prevents churn, improves retention, and propels customer growth.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ContactsListConversationsReverseChronologicalOrderResponse;
import com.konfigthis.client.model.CreateLink;
import com.konfigthis.client.model.LinkResponse;
import com.konfigthis.client.model.LinksListByIdAndTypeResponse;
import com.konfigthis.client.model.UpdateLink;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LinksApi
 */
@Disabled
public class LinksApiTest {

    private static LinksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LinksApi(apiClient);
    }

    /**
     * Create link
     *
     * Create a link. You must supply either &#x60;pattern&#x60; or &#x60;external_url&#x60; in the request, but not both (&#x60;pattern&#x60; is for dynamic objects while &#x60;external_url&#x60; is for standard links). If &#x60;pattern&#x60; is provided, the API call updates the dynamic objects matching the exact pattern. If the link is resolved to an installed links integration, any name retrieved from the integration will override the provided name in the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createLinkTest() throws ApiException {
        String name = null;
        String externalUrl = null;
        String pattern = null;
        LinkResponse response = api.createLink()
                .name(name)
                .externalUrl(externalUrl)
                .pattern(pattern)
                .execute();
        // TODO: test validations
    }

    /**
     * Get link
     *
     * Fetch a link.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLinkTest() throws ApiException {
        String linkId = null;
        LinkResponse response = api.getLink(linkId)
                .execute();
        // TODO: test validations
    }

    /**
     * List links
     *
     * List the links of the company paginated by id. Allows filtering by link type via the q.types param.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listByIdAndTypeTest() throws ApiException {
        String q = null;
        Integer limit = null;
        String pageToken = null;
        String sortBy = null;
        String sortOrder = null;
        LinksListByIdAndTypeResponse response = api.listByIdAndType()
                .q(q)
                .limit(limit)
                .pageToken(pageToken)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .execute();
        // TODO: test validations
    }

    /**
     * List link conversations
     *
     * List the conversations linked to a specific link. For more advanced filtering, see the [search endpoint](https://dev.frontapp.com/reference/conversations#search-conversations). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listConversationsTest() throws ApiException {
        String linkId = null;
        String q = null;
        Integer limit = null;
        String pageToken = null;
        String sortBy = null;
        String sortOrder = null;
        ContactsListConversationsReverseChronologicalOrderResponse response = api.listConversations(linkId)
                .q(q)
                .limit(limit)
                .pageToken(pageToken)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a link
     *
     * Update a link.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLinkTest() throws ApiException {
        String linkId = null;
        String name = null;
        api.updateLink(linkId)
                .name(name)
                .execute();
        // TODO: test validations
    }

}

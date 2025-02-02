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
import com.konfigthis.client.model.ConversationsListEventsResponse;
import com.konfigthis.client.model.EventResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Disabled
public class EventsApiTest {

    private static EventsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EventsApi(apiClient);
    }

    /**
     * Get event
     *
     * Fetch an event. Refer to the [Events](https://dev.frontapp.com/reference/events) topic for more information, including sorting and filtering. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEventTest() throws ApiException {
        String eventId = null;
        EventResponse response = api.getEvent(eventId)
                .execute();
        // TODO: test validations
    }

    /**
     * List events
     *
     * Lists all the detailed events which occured in the inboxes of the company ordered in reverse chronological order (newest first). Refer to the [Events](https://dev.frontapp.com/reference/events) topic for more information, including sorting and filtering. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDetailedInboxEventsTest() throws ApiException {
        String q = null;
        Integer limit = null;
        String pageToken = null;
        String sortBy = null;
        String sortOrder = null;
        ConversationsListEventsResponse response = api.listDetailedInboxEvents()
                .q(q)
                .limit(limit)
                .pageToken(pageToken)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .execute();
        // TODO: test validations
    }

}

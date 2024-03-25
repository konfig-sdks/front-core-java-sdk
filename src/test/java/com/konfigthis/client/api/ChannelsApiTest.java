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
import com.konfigthis.client.model.ChannelsListResponse;
import com.konfigthis.client.model.ChannelsValidateSmtpSettingsResponse;
import com.konfigthis.client.model.CreateChannel;
import com.konfigthis.client.model.CreateChannelSettings;
import com.konfigthis.client.model.UpdateChannel;
import com.konfigthis.client.model.UpdateChannelSettings;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelsApi
 */
@Disabled
public class ChannelsApiTest {

    private static ChannelsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ChannelsApi(apiClient);
    }

    /**
     * Create a channel
     *
     * Create a channel in an inbox.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInboxChannelTest() throws ApiException {
        String type = null;
        String inboxId = null;
        String name = null;
        CreateChannelSettings settings = null;
        String sendAs = null;
        api.createInboxChannel(type, inboxId)
                .name(name)
                .settings(settings)
                .sendAs(sendAs)
                .execute();
        // TODO: test validations
    }

    /**
     * Get channel
     *
     * Fetch a channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChannelTest() throws ApiException {
        String channelId = null;
        Object response = api.getChannel(channelId)
                .execute();
        // TODO: test validations
    }

    /**
     * List channels
     *
     * List the channels of the company.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        ChannelsListResponse response = api.list()
                .execute();
        // TODO: test validations
    }

    /**
     * List team channels
     *
     * List the channels of a team (workspace).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTeamTest() throws ApiException {
        String teamId = null;
        ChannelsListResponse response = api.listTeam(teamId)
                .execute();
        // TODO: test validations
    }

    /**
     * List teammate channels
     *
     * List the channels of a teammate.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTeammateTest() throws ApiException {
        String teammateId = null;
        ChannelsListResponse response = api.listTeammate(teammateId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Channel
     *
     * Update a channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateChannelTest() throws ApiException {
        String channelId = null;
        String name = null;
        String inboxId = null;
        UpdateChannelSettings settings = null;
        api.updateChannel(channelId)
                .name(name)
                .inboxId(inboxId)
                .settings(settings)
                .execute();
        // TODO: test validations
    }

    /**
     * Validate channel
     *
     * Asynchronously validate an SMTP channel (this endpoint is irrelevant to other channel types). When you create an SMTP channel via the API, [create a channel](https://dev.frontapp.com/reference/post_inboxes-inbox-id-channels) with type smtp and the send_as set to the needed email address. You then [configure the email provider](https://help.front.com/en/articles/2081), after which you use this endpoint to asynchronously validate the SMTP settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateSMTPSettingsTest() throws ApiException {
        String channelId = null;
        ChannelsValidateSmtpSettingsResponse response = api.validateSMTPSettings(channelId)
                .execute();
        // TODO: test validations
    }

}

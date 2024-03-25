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
import com.konfigthis.client.model.AnalyticsMetricId;
import com.konfigthis.client.model.AnalyticsReportRequest;
import com.konfigthis.client.model.TCIAIds;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsApi
 */
@Disabled
public class AnalyticsApiTest {

    private static AnalyticsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AnalyticsApi(apiClient);
    }

    /**
     * Create a new analytics export.
     *
     * Create a new analytics export of messages or events (activities) over a specific time span. The export will be executed asynchronously. The response will include a link that can be used to retrieve the export status &amp; result. Refer to the [Analytics](https://dev.frontapp.com/reference/analytics) topic for details about specific metrics. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewExportTest() throws ApiException {
        Object response = api.createNewExport()
                .execute();
        // TODO: test validations
    }

    /**
     * Create a new analytics report.
     *
     * Create a new analytics report for a set of metrics over a specific time span. Different filters (e.g. Inbox v Tag v Teammates) will be joined with AND logic, but the IDs within a filter will be joined with OR logic (e.g. Inbox A or Inbox B, Tag A or Tag B). The report will be executed asynchronously. The response will include a link that can be used to retrieve the report status &amp; result. Refer to the [Analytics](https://dev.frontapp.com/reference/analytics) topic for details about specific metrics. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewReportTest() throws ApiException {
        Double start = null;
        Double end = null;
        List<AnalyticsMetricId> metrics = null;
        String timezone = null;
        TCIAIds filters = null;
        Object response = api.createNewReport(start, end, metrics)
                .timezone(timezone)
                .filters(filters)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch an analytics export.
     *
     * Fetch an analytics exports. Refer to the [Analytics](https://dev.frontapp.com/reference/analytics) topic for details about specific metrics.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExportTest() throws ApiException {
        String exportId = null;
        Object response = api.getExport(exportId)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch an analytics report.
     *
     * Fetch an analytics report. Refer to the [Analytics](https://dev.frontapp.com/reference/analytics) topic for details about specific metrics.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReportTest() throws ApiException {
        String reportUid = null;
        Object response = api.getReport(reportUid)
                .execute();
        // TODO: test validations
    }

}

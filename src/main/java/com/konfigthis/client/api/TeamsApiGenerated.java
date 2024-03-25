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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.TeammateIds;
import com.konfigthis.client.model.TeamsListTeamsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TeamsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TeamsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TeamsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call addTeammatesCall(String teamId, TeammateIds teammateIds, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = teammateIds;

        // create path and map variables
        String localVarPath = "/teams/{team_id}/teammates"
            .replace("{" + "team_id" + "}", localVarApiClient.escapeString(teamId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "http" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addTeammatesValidateBeforeCall(String teamId, TeammateIds teammateIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling addTeammates(Async)");
        }

        return addTeammatesCall(teamId, teammateIds, _callback);

    }


    private ApiResponse<Void> addTeammatesWithHttpInfo(String teamId, TeammateIds teammateIds) throws ApiException {
        okhttp3.Call localVarCall = addTeammatesValidateBeforeCall(teamId, teammateIds, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call addTeammatesAsync(String teamId, TeammateIds teammateIds, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addTeammatesValidateBeforeCall(teamId, teammateIds, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class AddTeammatesRequestBuilder {
        private final List<String> teammateIds;
        private final String teamId;

        private AddTeammatesRequestBuilder(List<String> teammateIds, String teamId) {
            this.teammateIds = teammateIds;
            this.teamId = teamId;
        }

        /**
         * Build call for addTeammates
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            TeammateIds teammateIds = buildBodyParams();
            return addTeammatesCall(teamId, teammateIds, _callback);
        }

        private TeammateIds buildBodyParams() {
            TeammateIds teammateIds = new TeammateIds();
            teammateIds.teammateIds(this.teammateIds);
            return teammateIds;
        }

        /**
         * Execute addTeammates request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            TeammateIds teammateIds = buildBodyParams();
            addTeammatesWithHttpInfo(teamId, teammateIds);
        }

        /**
         * Execute addTeammates request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            TeammateIds teammateIds = buildBodyParams();
            return addTeammatesWithHttpInfo(teamId, teammateIds);
        }

        /**
         * Execute addTeammates request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            TeammateIds teammateIds = buildBodyParams();
            return addTeammatesAsync(teamId, teammateIds, _callback);
        }
    }

    /**
     * Add teammates to team
     * Add one or more teammates to a team (workspace).
     * @param teamId The Team ID (required)
     * @return AddTeammatesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
     </table>
     */
    public AddTeammatesRequestBuilder addTeammates(List<String> teammateIds, String teamId) throws IllegalArgumentException {
        if (teammateIds == null) throw new IllegalArgumentException("\"teammateIds\" is required but got null");
        if (teamId == null) throw new IllegalArgumentException("\"teamId\" is required but got null");
            

        return new AddTeammatesRequestBuilder(teammateIds, teamId);
    }
    private okhttp3.Call getWorkspaceCall(String teamId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/teams/{team_id}"
            .replace("{" + "team_id" + "}", localVarApiClient.escapeString(teamId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "http" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWorkspaceValidateBeforeCall(String teamId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling getWorkspace(Async)");
        }

        return getWorkspaceCall(teamId, _callback);

    }


    private ApiResponse<Object> getWorkspaceWithHttpInfo(String teamId) throws ApiException {
        okhttp3.Call localVarCall = getWorkspaceValidateBeforeCall(teamId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getWorkspaceAsync(String teamId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorkspaceValidateBeforeCall(teamId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetWorkspaceRequestBuilder {
        private final String teamId;

        private GetWorkspaceRequestBuilder(String teamId) {
            this.teamId = teamId;
        }

        /**
         * Build call for getWorkspace
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A team </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getWorkspaceCall(teamId, _callback);
        }


        /**
         * Execute getWorkspace request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A team </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getWorkspaceWithHttpInfo(teamId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getWorkspace request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A team </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getWorkspaceWithHttpInfo(teamId);
        }

        /**
         * Execute getWorkspace request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A team </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getWorkspaceAsync(teamId, _callback);
        }
    }

    /**
     * Get team
     * Fetch a team (workspace).
     * @param teamId The Team ID (required)
     * @return GetWorkspaceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A team </td><td>  -  </td></tr>
     </table>
     */
    public GetWorkspaceRequestBuilder getWorkspace(String teamId) throws IllegalArgumentException {
        if (teamId == null) throw new IllegalArgumentException("\"teamId\" is required but got null");
            

        return new GetWorkspaceRequestBuilder(teamId);
    }
    private okhttp3.Call listTeamsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/teams";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "http" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listTeamsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listTeamsCall(_callback);

    }


    private ApiResponse<TeamsListTeamsResponse> listTeamsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listTeamsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<TeamsListTeamsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listTeamsAsync(final ApiCallback<TeamsListTeamsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listTeamsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<TeamsListTeamsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListTeamsRequestBuilder {

        private ListTeamsRequestBuilder() {
        }

        /**
         * Build call for listTeams
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of teams </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listTeamsCall(_callback);
        }


        /**
         * Execute listTeams request
         * @return TeamsListTeamsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of teams </td><td>  -  </td></tr>
         </table>
         */
        public TeamsListTeamsResponse execute() throws ApiException {
            ApiResponse<TeamsListTeamsResponse> localVarResp = listTeamsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listTeams request with HTTP info returned
         * @return ApiResponse&lt;TeamsListTeamsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of teams </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TeamsListTeamsResponse> executeWithHttpInfo() throws ApiException {
            return listTeamsWithHttpInfo();
        }

        /**
         * Execute listTeams request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Array of teams </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TeamsListTeamsResponse> _callback) throws ApiException {
            return listTeamsAsync(_callback);
        }
    }

    /**
     * List teams
     * List the teams (workspaces) in the company.
     * @return ListTeamsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Array of teams </td><td>  -  </td></tr>
     </table>
     */
    public ListTeamsRequestBuilder listTeams() throws IllegalArgumentException {
        return new ListTeamsRequestBuilder();
    }
    private okhttp3.Call removeTeammatesCall(String teamId, TeammateIds teammateIds, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = teammateIds;

        // create path and map variables
        String localVarPath = "/teams/{team_id}/teammates"
            .replace("{" + "team_id" + "}", localVarApiClient.escapeString(teamId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "http" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeTeammatesValidateBeforeCall(String teamId, TeammateIds teammateIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling removeTeammates(Async)");
        }

        return removeTeammatesCall(teamId, teammateIds, _callback);

    }


    private ApiResponse<Void> removeTeammatesWithHttpInfo(String teamId, TeammateIds teammateIds) throws ApiException {
        okhttp3.Call localVarCall = removeTeammatesValidateBeforeCall(teamId, teammateIds, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call removeTeammatesAsync(String teamId, TeammateIds teammateIds, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeTeammatesValidateBeforeCall(teamId, teammateIds, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class RemoveTeammatesRequestBuilder {
        private final List<String> teammateIds;
        private final String teamId;

        private RemoveTeammatesRequestBuilder(List<String> teammateIds, String teamId) {
            this.teammateIds = teammateIds;
            this.teamId = teamId;
        }

        /**
         * Build call for removeTeammates
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            TeammateIds teammateIds = buildBodyParams();
            return removeTeammatesCall(teamId, teammateIds, _callback);
        }

        private TeammateIds buildBodyParams() {
            TeammateIds teammateIds = new TeammateIds();
            teammateIds.teammateIds(this.teammateIds);
            return teammateIds;
        }

        /**
         * Execute removeTeammates request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            TeammateIds teammateIds = buildBodyParams();
            removeTeammatesWithHttpInfo(teamId, teammateIds);
        }

        /**
         * Execute removeTeammates request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            TeammateIds teammateIds = buildBodyParams();
            return removeTeammatesWithHttpInfo(teamId, teammateIds);
        }

        /**
         * Execute removeTeammates request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            TeammateIds teammateIds = buildBodyParams();
            return removeTeammatesAsync(teamId, teammateIds, _callback);
        }
    }

    /**
     * Remove teammates from team
     * Remove one or more teammates from a team (workspace). Alternatively, you can supply emails as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
     * @param teamId The Team ID (required)
     * @return RemoveTeammatesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
     </table>
     */
    public RemoveTeammatesRequestBuilder removeTeammates(List<String> teammateIds, String teamId) throws IllegalArgumentException {
        if (teammateIds == null) throw new IllegalArgumentException("\"teammateIds\" is required but got null");
        if (teamId == null) throw new IllegalArgumentException("\"teamId\" is required but got null");
            

        return new RemoveTeammatesRequestBuilder(teammateIds, teamId);
    }
}

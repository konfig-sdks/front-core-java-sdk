# DraftsApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDraftReply**](DraftsApi.md#createDraftReply) | **POST** /conversations/{conversation_id}/drafts | Create draft reply |
| [**createNewDraftMessage**](DraftsApi.md#createNewDraftMessage) | **POST** /channels/{channel_id}/drafts | Create draft |
| [**deleteDraftMessage**](DraftsApi.md#deleteDraftMessage) | **DELETE** /drafts/{draft_id} | Delete draft |
| [**editMessage**](DraftsApi.md#editMessage) | **PATCH** /drafts/{message_id} | Edit draft |
| [**listConversationDrafts**](DraftsApi.md#listConversationDrafts) | **GET** /conversations/{conversation_id}/drafts | List conversation drafts |


<a name="createDraftReply"></a>
# **createDraftReply**
> Object createDraftReply(conversationId).replyDraft(replyDraft).execute();

Create draft reply

Create a new draft as a reply to the last message in the conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DraftsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontCore client = new FrontCore(configuration);
    String authorId = "authorId_example"; // ID of the teammate on behalf of whom the draft will be created. Alternatively, you can supply the author ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String body = "body_example"; // Body of the draft
    String channelId = "channelId_example"; // ID of the channel from which the draft will be sent. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String conversationId = "cnv_123"; // The conversation ID
    List<String> to = Arrays.asList(); // List of recipient handles who will receive the message once the draft is sent
    List<String> cc = Arrays.asList(); // List of recipient handles who will receive a copy of the message once the draft is sent
    List<String> bcc = Arrays.asList(); // List of the recipient handles who will receive a blind copy of the message once the draft is sent
    String subject = "subject_example"; // Subject of the draft.
    String quoteBody = "quoteBody_example"; // Body for the quote that the message is referencing. Only available on email channels.
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1). Max 25 MB.
    String mode = "private"; // Mode of the draft to create. Can be 'private' (draft is visible to the author only) or 'shared' (draft is visible to all teammates with access to the conversation).
    String signatureId = "signatureId_example"; // ID of the signature to attach to this draft. If null, no signature is attached.
    Boolean shouldAddDefaultSignature = true; // Whether or not Front should try to resolve a signature for the message. Is ignored if signature_id is included. Default false;
    try {
      Object result = client
              .drafts
              .createDraftReply(authorId, body, channelId, conversationId)
              .to(to)
              .cc(cc)
              .bcc(bcc)
              .subject(subject)
              .quoteBody(quoteBody)
              .attachments(attachments)
              .mode(mode)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#createDraftReply");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .drafts
              .createDraftReply(authorId, body, channelId, conversationId)
              .to(to)
              .cc(cc)
              .bcc(bcc)
              .subject(subject)
              .quoteBody(quoteBody)
              .attachments(attachments)
              .mode(mode)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#createDraftReply");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |
| **replyDraft** | [**ReplyDraft**](ReplyDraft.md)|  | [optional] |

### Return type

**Object**

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A message |  -  |

<a name="createNewDraftMessage"></a>
# **createNewDraftMessage**
> Object createNewDraftMessage(channelId).createDraft(createDraft).execute();

Create draft

Create a draft message which is the first message of a new [conversation](https://dev.frontapp.com/reference/conversations).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DraftsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontCore client = new FrontCore(configuration);
    String authorId = "authorId_example"; // ID of the teammate on behalf of whom the draft will be created. Alternatively, you can supply the author ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String body = "body_example"; // Body of the draft
    String channelId = "cha_123"; // The channel ID. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    List<String> to = Arrays.asList(); // List of recipient handles who will receive the message once the draft is sent
    List<String> cc = Arrays.asList(); // List of recipient handles who will receive a copy of the message once the draft is sent
    List<String> bcc = Arrays.asList(); // List of the recipient handles who will receive a blind copy of the message once the draft is sent
    String subject = "subject_example"; // Subject of the draft.
    String quoteBody = "quoteBody_example"; // Body for the quote that the message is referencing. Only available on email channels.
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1). Max 25 MB.
    String mode = "private"; // Mode of the draft to create. Can be 'private' (draft is visible to the author only) or 'shared' (draft is visible to all teammates with access to the conversation).
    String signatureId = "signatureId_example"; // ID of the signature to attach to this draft. If null, no signature is attached.
    Boolean shouldAddDefaultSignature = true; // Whether or not Front should try to resolve a signature for the message. Is ignored if signature_id is included. Default false;
    try {
      Object result = client
              .drafts
              .createNewDraftMessage(authorId, body, channelId)
              .to(to)
              .cc(cc)
              .bcc(bcc)
              .subject(subject)
              .quoteBody(quoteBody)
              .attachments(attachments)
              .mode(mode)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#createNewDraftMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .drafts
              .createNewDraftMessage(authorId, body, channelId)
              .to(to)
              .cc(cc)
              .bcc(bcc)
              .subject(subject)
              .quoteBody(quoteBody)
              .attachments(attachments)
              .mode(mode)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#createNewDraftMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelId** | **String**| The channel ID. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to cha_123] |
| **createDraft** | [**CreateDraft**](CreateDraft.md)|  | [optional] |

### Return type

**Object**

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A message |  -  |

<a name="deleteDraftMessage"></a>
# **deleteDraftMessage**
> deleteDraftMessage(draftId).deleteDraft(deleteDraft).execute();

Delete draft

Delete a draft message.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DraftsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontCore client = new FrontCore(configuration);
    String version = "version_example"; // Version of the draft
    String draftId = "msg_123"; // The draft ID
    try {
      client
              .drafts
              .deleteDraftMessage(version, draftId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#deleteDraftMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .drafts
              .deleteDraftMessage(version, draftId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#deleteDraftMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **draftId** | **String**| The draft ID | [default to msg_123] |
| **deleteDraft** | [**DeleteDraft**](DeleteDraft.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |

<a name="editMessage"></a>
# **editMessage**
> Object editMessage(messageId).editDraft(editDraft).execute();

Edit draft

Edit a draft message.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DraftsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontCore client = new FrontCore(configuration);
    String authorId = "authorId_example"; // ID of the teammate on behalf of whom the draft will be created. Alternatively, you can supply the author ID as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String body = "body_example"; // Body of the draft
    String channelId = "channelId_example"; // ID of the channel from which the draft will be sent. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String messageId = "msg_123"; // The draft ID
    List<String> to = Arrays.asList(); // List of recipient handles who will receive the message once the draft is sent
    List<String> cc = Arrays.asList(); // List of recipient handles who will receive a copy of the message once the draft is sent
    List<String> bcc = Arrays.asList(); // List of the recipient handles who will receive a blind copy of the message once the draft is sent
    String subject = "subject_example"; // Subject of the draft.
    String quoteBody = "quoteBody_example"; // Body for the quote that the message is referencing. Only available on email channels.
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1). Max 25 MB.
    String mode = "shared"; // Mode of the draft to update. Can only be 'shared' (draft is visible to all teammates with access to the conversation).
    String signatureId = "signatureId_example"; // ID of the signature to attach to this draft. If null, no signature is attached.
    Boolean shouldAddDefaultSignature = true; // Whether or not Front should try to resolve a signature for the message. Is ignored if signature_id is included. Default false;
    String version = "version_example"; // Version of the draft
    try {
      Object result = client
              .drafts
              .editMessage(authorId, body, channelId, messageId)
              .to(to)
              .cc(cc)
              .bcc(bcc)
              .subject(subject)
              .quoteBody(quoteBody)
              .attachments(attachments)
              .mode(mode)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .version(version)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#editMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .drafts
              .editMessage(authorId, body, channelId, messageId)
              .to(to)
              .cc(cc)
              .bcc(bcc)
              .subject(subject)
              .quoteBody(quoteBody)
              .attachments(attachments)
              .mode(mode)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .version(version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#editMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageId** | **String**| The draft ID | [default to msg_123] |
| **editDraft** | [**EditDraft**](EditDraft.md)|  | [optional] |

### Return type

**Object**

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A message |  -  |

<a name="listConversationDrafts"></a>
# **listConversationDrafts**
> DraftsListConversationDraftsResponse listConversationDrafts(conversationId).execute();

List conversation drafts

List the drafts in a conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DraftsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontCore client = new FrontCore(configuration);
    String conversationId = "cnv_123"; // The conversation ID
    try {
      DraftsListConversationDraftsResponse result = client
              .drafts
              .listConversationDrafts(conversationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#listConversationDrafts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DraftsListConversationDraftsResponse> response = client
              .drafts
              .listConversationDrafts(conversationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#listConversationDrafts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationId** | **String**| The conversation ID | [default to cnv_123] |

### Return type

[**DraftsListConversationDraftsResponse**](DraftsListConversationDraftsResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of messages |  -  |


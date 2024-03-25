# MessagesApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMessageReply**](MessagesApi.md#createMessageReply) | **POST** /conversations/{conversation_id}/messages | Create message reply |
| [**createNewMessage**](MessagesApi.md#createNewMessage) | **POST** /channels/{channel_id}/messages | Create message |
| [**getMessageById**](MessagesApi.md#getMessageById) | **GET** /messages/{message_id} | Get message |
| [**getMessageSeenStatus**](MessagesApi.md#getMessageSeenStatus) | **GET** /messages/{message_id}/seen | Get message seen status |
| [**importNewInboxMessage**](MessagesApi.md#importNewInboxMessage) | **POST** /inboxes/{inbox_id}/imported_messages | Import message |
| [**markMessageSeen**](MessagesApi.md#markMessageSeen) | **POST** /messages/{message_id}/seen | Mark message seen |
| [**receiveCustomMessage**](MessagesApi.md#receiveCustomMessage) | **POST** /channels/{channel_id}/incoming_messages | Receive custom messages |


<a name="createMessageReply"></a>
# **createMessageReply**
> Object createMessageReply(conversationId).outboundReplyMessage(outboundReplyMessage).execute();

Create message reply

Reply to a conversation by sending a message and appending it to the conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    String body = "body_example"; // Body of the message
    String conversationId = "cnv_123"; // The conversation ID
    List<String> to = Arrays.asList(); // List of the recipient handles who will receive this message
    List<String> cc = Arrays.asList(); // List of the recipient handles who will receive a copy of this message
    List<String> bcc = Arrays.asList(); // List of the recipient handles who will receive a copy of this message
    String senderName = "senderName_example"; // Name used for the sender info of the message
    String subject = "subject_example"; // Subject of the message for email message
    String authorId = "authorId_example"; // ID of the teammate on behalf of whom the answer is sent
    String channelId = "channelId_example"; // Channel ID the message is sent from
    String text = "text_example"; // Text version of the body for email messages
    String quoteBody = "quoteBody_example"; // Body for the quote that the message is referencing. Only available on email channels.
    OutboundReplyMessageOptions options = new OutboundReplyMessageOptions();
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    String signatureId = "signatureId_example"; // ID of the signature to attach to this draft. If null, no signature is attached.
    Boolean shouldAddDefaultSignature = true; // Whether or not Front should try to resolve a signature for the message. Is ignored if signature_id is included. Default false;
    try {
      Object result = client
              .messages
              .createMessageReply(body, conversationId)
              .to(to)
              .cc(cc)
              .bcc(bcc)
              .senderName(senderName)
              .subject(subject)
              .authorId(authorId)
              .channelId(channelId)
              .text(text)
              .quoteBody(quoteBody)
              .options(options)
              .attachments(attachments)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createMessageReply");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messages
              .createMessageReply(body, conversationId)
              .to(to)
              .cc(cc)
              .bcc(bcc)
              .senderName(senderName)
              .subject(subject)
              .authorId(authorId)
              .channelId(channelId)
              .text(text)
              .quoteBody(quoteBody)
              .options(options)
              .attachments(attachments)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createMessageReply");
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
| **outboundReplyMessage** | [**OutboundReplyMessage**](OutboundReplyMessage.md)|  | [optional] |

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
| **202** | A message |  -  |

<a name="createNewMessage"></a>
# **createNewMessage**
> Object createNewMessage(channelId).outboundMessage(outboundMessage).execute();

Create message

Send a new message from a channel. This is one of the ways to create a new [conversation](https://dev.frontapp.com/reference/conversations#creating-a-new-conversation). The new conversation will support both messages and comments (discussions).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    List<String> to = Arrays.asList(); // List of the recipient handles who will receive this message
    String body = "body_example"; // Body of the message
    String channelId = "cha_123"; // The sending channel ID. Alternatively, you can supply the sending channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    List<String> cc = Arrays.asList(); // List of the recipient handles who will receive a copy of this message
    List<String> bcc = Arrays.asList(); // List of the recipient handles who will receive a blind copy of this message
    String senderName = "senderName_example"; // Name used for the sender info of the message
    String subject = "subject_example"; // Subject of the message for email message
    String authorId = "authorId_example"; // ID of the teammate on behalf of whom the answer is sent
    String text = "text_example"; // Text version of the body for email messages
    OutboundMessageOptions options = new OutboundMessageOptions();
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1). Max 25 MB.
    String signatureId = "signatureId_example"; // ID of the signature to attach to this draft. If null, no signature is attached.
    Boolean shouldAddDefaultSignature = true; // Whether or not Front should try to resolve a signature for the message. Is ignored if signature_id is included. Default false;
    try {
      Object result = client
              .messages
              .createNewMessage(to, body, channelId)
              .cc(cc)
              .bcc(bcc)
              .senderName(senderName)
              .subject(subject)
              .authorId(authorId)
              .text(text)
              .options(options)
              .attachments(attachments)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createNewMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messages
              .createNewMessage(to, body, channelId)
              .cc(cc)
              .bcc(bcc)
              .senderName(senderName)
              .subject(subject)
              .authorId(authorId)
              .text(text)
              .options(options)
              .attachments(attachments)
              .signatureId(signatureId)
              .shouldAddDefaultSignature(shouldAddDefaultSignature)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createNewMessage");
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
| **channelId** | **String**| The sending channel ID. Alternatively, you can supply the sending channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to cha_123] |
| **outboundMessage** | [**OutboundMessage**](OutboundMessage.md)|  | [optional] |

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
| **202** | A message |  -  |

<a name="getMessageById"></a>
# **getMessageById**
> Object getMessageById(messageId).execute();

Get message

Fetch a message.  &gt; ℹ️ The HTTP Header &#x60;Accept&#x60; can be used to request the message in a different format. &gt; By default, Front will return the documented JSON response. By requesting &#x60;message/rfc822&#x60;, the response will contain the message in the EML format (for email messages only). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    String messageId = "msg_123"; // The message ID
    try {
      Object result = client
              .messages
              .getMessageById(messageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#getMessageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messages
              .getMessageById(messageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#getMessageById");
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
| **messageId** | **String**| The message ID | [default to msg_123] |

### Return type

**Object**

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A message |  -  |

<a name="getMessageSeenStatus"></a>
# **getMessageSeenStatus**
> MessagesGetMessageSeenStatusResponse getMessageSeenStatus(messageId).execute();

Get message seen status

Get the seen receipts for the given message. If no seen-by information is available, there will be a single entry for the first time the message was seen by any recipient. If seen-by information is available, there will be an entry for each recipient who has seen the message.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    String messageId = "msg_123"; // The message ID
    try {
      MessagesGetMessageSeenStatusResponse result = client
              .messages
              .getMessageSeenStatus(messageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#getMessageSeenStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessagesGetMessageSeenStatusResponse> response = client
              .messages
              .getMessageSeenStatus(messageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#getMessageSeenStatus");
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
| **messageId** | **String**| The message ID | [default to msg_123] |

### Return type

[**MessagesGetMessageSeenStatusResponse**](MessagesGetMessageSeenStatusResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of seen receipts |  -  |

<a name="importNewInboxMessage"></a>
# **importNewInboxMessage**
> MessagesReceiveCustomMessageResponse importNewInboxMessage(inboxId).importMessage(importMessage).execute();

Import message

Import a new message in an inbox.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    ImportMessageSender sender = new ImportMessageSender();
    List<String> to = Arrays.asList(); // List of the recipient handles who will receive this message
    String body = "body_example"; // Body of the message
    String externalId = "externalId_example"; // External identifier of the message. Front won't import two messages with the same external ID.
    Integer createdAt = 56; // Date at which the message as been sent or received.
    ImportMessageMetadata metadata = new ImportMessageMetadata();
    String inboxId = "inb_123"; // The Inbox ID
    List<String> tags = Arrays.asList(); // List of tag names to add to the conversation
    List<String> cc = Arrays.asList(); // List of the recipient handles who will receive a copy of this message
    List<String> bcc = Arrays.asList(); // List of the recipient handles who will receive a blind copy of this message
    String subject = "subject_example"; // Subject of the message
    String bodyFormat = "html"; // Format of the message body. Can be `markdown` (default) or `html`, and can only be specified for `email` type.
    String type = "email"; // Type of the message to import. Default is `email`.
    String assigneeId = "assigneeId_example"; // ID of the teammate who will be assigned to the conversation.
    String conversationId = "conversationId_example"; // If supplied, Front will thread this message into conversation with the given ID. Note that including this parameter nullifies the `thread_ref` parameter _completely_.
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    try {
      MessagesReceiveCustomMessageResponse result = client
              .messages
              .importNewInboxMessage(sender, to, body, externalId, createdAt, metadata, inboxId)
              .tags(tags)
              .cc(cc)
              .bcc(bcc)
              .subject(subject)
              .bodyFormat(bodyFormat)
              .type(type)
              .assigneeId(assigneeId)
              .conversationId(conversationId)
              .attachments(attachments)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessageUid());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#importNewInboxMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessagesReceiveCustomMessageResponse> response = client
              .messages
              .importNewInboxMessage(sender, to, body, externalId, createdAt, metadata, inboxId)
              .tags(tags)
              .cc(cc)
              .bcc(bcc)
              .subject(subject)
              .bodyFormat(bodyFormat)
              .type(type)
              .assigneeId(assigneeId)
              .conversationId(conversationId)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#importNewInboxMessage");
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
| **inboxId** | **String**| The Inbox ID | [default to inb_123] |
| **importMessage** | [**ImportMessage**](ImportMessage.md)|  | [optional] |

### Return type

[**MessagesReceiveCustomMessageResponse**](MessagesReceiveCustomMessageResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | An accepted message |  -  |

<a name="markMessageSeen"></a>
# **markMessageSeen**
> markMessageSeen(messageId).body(body).execute();

Mark message seen

Mark an outbound message from Front as seen. Note, the message seen route should only be called in response to an actual end-user&#39;s message-seen action. In accordance with this behavior, the route is rate limited to 10 requests per hour. The request body should send an empty object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    String messageId = "msg_123"; // The message ID
    try {
      client
              .messages
              .markMessageSeen(messageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#markMessageSeen");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .messages
              .markMessageSeen(messageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#markMessageSeen");
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
| **messageId** | **String**| The message ID | [default to msg_123] |
| **body** | **Object**|  | [optional] |

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

<a name="receiveCustomMessage"></a>
# **receiveCustomMessage**
> MessagesReceiveCustomMessageResponse receiveCustomMessage(channelId).customMessage(customMessage).execute();

Receive custom messages

Receive a custom message in Front. This endpoint is available for custom channels **ONLY**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    CustomMessageSender sender = new CustomMessageSender();
    String body = "body_example"; // Body of the message
    String channelId = "cha_123"; // The channel ID. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String subject = "subject_example"; // Subject of the message
    String bodyFormat = "html"; // Format of the message body. Can be `markdown` (default) or `html`.
    CustomMessageMetadata metadata = new CustomMessageMetadata();
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    try {
      MessagesReceiveCustomMessageResponse result = client
              .messages
              .receiveCustomMessage(sender, body, channelId)
              .subject(subject)
              .bodyFormat(bodyFormat)
              .metadata(metadata)
              .attachments(attachments)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessageUid());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#receiveCustomMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessagesReceiveCustomMessageResponse> response = client
              .messages
              .receiveCustomMessage(sender, body, channelId)
              .subject(subject)
              .bodyFormat(bodyFormat)
              .metadata(metadata)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#receiveCustomMessage");
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
| **customMessage** | [**CustomMessage**](CustomMessage.md)|  | [optional] |

### Return type

[**MessagesReceiveCustomMessageResponse**](MessagesReceiveCustomMessageResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | An accepted message |  -  |


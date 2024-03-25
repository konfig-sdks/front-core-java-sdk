# KnowledgeBasesApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createArticleDefaultLocale**](KnowledgeBasesApi.md#createArticleDefaultLocale) | **POST** /knowledge_bases/{knowledge_base_id}/articles | Create article in a knowledge base in default locale |
| [**createArticleLocale**](KnowledgeBasesApi.md#createArticleLocale) | **POST** /knowledge_bases/{knowledge_base_id}/locales/{locale}/articles | Create article in a knowledge base in specified locale |
| [**createCategoryDefaultLocale**](KnowledgeBasesApi.md#createCategoryDefaultLocale) | **POST** /knowledge_bases/{knowledge_base_id}/categories | Create knowledge base category in default locale |
| [**createCategoryInLocale**](KnowledgeBasesApi.md#createCategoryInLocale) | **POST** /knowledge_bases/{knowledge_base_id}/locales/{locale}/categories | Create knowledge base category in specified locale |
| [**createNewKnowledgeBase**](KnowledgeBasesApi.md#createNewKnowledgeBase) | **POST** /knowledge_bases | Create a knowledge base |
| [**deleteArticle**](KnowledgeBasesApi.md#deleteArticle) | **DELETE** /knowledge_base_articles/{article_id} | Delete an article |
| [**deleteCategory**](KnowledgeBasesApi.md#deleteCategory) | **DELETE** /knowledge_base_categories/{category_id} | Delete a knowledge base category |
| [**downloadAttachmentArticle**](KnowledgeBasesApi.md#downloadAttachmentArticle) | **GET** /knowledge_base_articles/{article_id}/download/{attachment_id} | Download attachment from an article |
| [**getArticleById**](KnowledgeBasesApi.md#getArticleById) | **GET** /knowledge_base_articles/{article_id} | Get a knowledge base article |
| [**getArticleContent**](KnowledgeBasesApi.md#getArticleContent) | **GET** /knowledge_base_articles/{article_id}/locales/{locale}/content | Get knowledge base article with content in specified locale |
| [**getCategory**](KnowledgeBasesApi.md#getCategory) | **GET** /knowledge_base_categories/{category_id} | Get a knowledge base category |
| [**getCategoryContentDefaultLocale**](KnowledgeBasesApi.md#getCategoryContentDefaultLocale) | **GET** /knowledge_base_categories/{category_id}/content | Get knowledge base category content in default locale |
| [**getCategoryContentLocale**](KnowledgeBasesApi.md#getCategoryContentLocale) | **GET** /knowledge_base_categories/{category_id}/locales/{locale}/content | Get knowledge base category with content in specified locale |
| [**getContentDefaultLocale**](KnowledgeBasesApi.md#getContentDefaultLocale) | **GET** /knowledge_base_articles/{article_id}/content | Get knowledge base article with content in default locale |
| [**getContentDefaultLocale_0**](KnowledgeBasesApi.md#getContentDefaultLocale_0) | **GET** /knowledge_bases/{knowledge_base_id}/content | Get a knowledge base with content in default locale |
| [**getKnowledgeBase**](KnowledgeBasesApi.md#getKnowledgeBase) | **GET** /knowledge_bases/{knowledge_base_id} | Get a knowledge base |
| [**getKnowledgeBaseContentInLocale**](KnowledgeBasesApi.md#getKnowledgeBaseContentInLocale) | **GET** /knowledge_bases/{knowledge_base_id}/locales/{locale}/content | Get a knowledge base with content in specified locale |
| [**listArticlesInBase**](KnowledgeBasesApi.md#listArticlesInBase) | **GET** /knowledge_bases/{knowledge_base_id}/articles | List articles in a knowledge base |
| [**listArticlesInCategory**](KnowledgeBasesApi.md#listArticlesInCategory) | **GET** /knowledge_base_categories/{category_id}/articles | List articles in a category |
| [**listCategoriesInBase**](KnowledgeBasesApi.md#listCategoriesInBase) | **GET** /knowledge_bases/{knowledge_base_id}/categories | List categories in a knowledge base |
| [**listKnowledgeBases**](KnowledgeBasesApi.md#listKnowledgeBases) | **GET** /knowledge_bases | List knowledge bases |
| [**updateArticleContentDefaultLocale**](KnowledgeBasesApi.md#updateArticleContentDefaultLocale) | **PATCH** /knowledge_base_articles/{article_id}/content | Update article content in default locale. |
| [**updateArticleContentLocale**](KnowledgeBasesApi.md#updateArticleContentLocale) | **PATCH** /knowledge_base_articles/{article_id}/locales/{locale}/content | Update article content in specified locale |
| [**updateCategoryContentLocale**](KnowledgeBasesApi.md#updateCategoryContentLocale) | **PATCH** /knowledge_base_categories/{category_id}/locales/{locale}/content | Update knowledge base category in specified locale |
| [**updateCategoryDefaultLocale**](KnowledgeBasesApi.md#updateCategoryDefaultLocale) | **PATCH** /knowledge_base_categories/{category_id}/content | Update knowledge base category in default locale |
| [**updateDefaultKnowledgeBase**](KnowledgeBasesApi.md#updateDefaultKnowledgeBase) | **PATCH** /knowledge_bases/{knowledge_base_id}/content | Update knowledge base in default locale |
| [**updateKnowledgeBaseLocale**](KnowledgeBasesApi.md#updateKnowledgeBaseLocale) | **PATCH** /knowledge_bases/{knowledge_base_id}/locales/{locale}/content | Update knowledge base in specified locale |


<a name="createArticleDefaultLocale"></a>
# **createArticleDefaultLocale**
> Object createArticleDefaultLocale(knowledgeBaseId).knowledgeBaseArticleCreate(knowledgeBaseArticleCreate).execute();

Create article in a knowledge base in default locale

Creates an article in a knowledge base in the default locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to create the article in
    String categoryId = "categoryId_example"; // ID of the category this article belongs to
    String authorId = "authorId_example"; // Teammate ID of the article author
    String subject = "subject_example"; // Subject of the article
    String content = "content_example"; // HTML content of the article
    String status = "draft"; // Article status
    try {
      Object result = client
              .knowledgeBases
              .createArticleDefaultLocale(knowledgeBaseId)
              .categoryId(categoryId)
              .authorId(authorId)
              .subject(subject)
              .content(content)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createArticleDefaultLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .createArticleDefaultLocale(knowledgeBaseId)
              .categoryId(categoryId)
              .authorId(authorId)
              .subject(subject)
              .content(content)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createArticleDefaultLocale");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to create the article in | [default to knb_123] |
| **knowledgeBaseArticleCreate** | [**KnowledgeBaseArticleCreate**](KnowledgeBaseArticleCreate.md)|  | [optional] |

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
| **201** | A knowledge base article with content |  -  |

<a name="createArticleLocale"></a>
# **createArticleLocale**
> Object createArticleLocale(knowledgeBaseId, locale).knowledgeBaseArticleCreate(knowledgeBaseArticleCreate).execute();

Create article in a knowledge base in specified locale

Create an article for a given locale in a knowledge base.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to create the article in
    String locale = "en"; // The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the article's content
    String categoryId = "categoryId_example"; // ID of the category this article belongs to
    String authorId = "authorId_example"; // Teammate ID of the article author
    String subject = "subject_example"; // Subject of the article
    String content = "content_example"; // HTML content of the article
    String status = "draft"; // Article status
    try {
      Object result = client
              .knowledgeBases
              .createArticleLocale(knowledgeBaseId, locale)
              .categoryId(categoryId)
              .authorId(authorId)
              .subject(subject)
              .content(content)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createArticleLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .createArticleLocale(knowledgeBaseId, locale)
              .categoryId(categoryId)
              .authorId(authorId)
              .subject(subject)
              .content(content)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createArticleLocale");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to create the article in | [default to knb_123] |
| **locale** | **String**| The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the article&#39;s content | [default to en] |
| **knowledgeBaseArticleCreate** | [**KnowledgeBaseArticleCreate**](KnowledgeBaseArticleCreate.md)|  | [optional] |

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
| **201** | A knowledge base article with content |  -  |

<a name="createCategoryDefaultLocale"></a>
# **createCategoryDefaultLocale**
> Object createCategoryDefaultLocale(knowledgeBaseId).knowledgeBaseCategoryCreate(knowledgeBaseCategoryCreate).execute();

Create knowledge base category in default locale

Creates a knowledge base category in the default locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String name = "name_example"; // Name of the knowledge base category
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to create the category in
    String description = "description_example"; // Description of the knowledge base category
    String parentCategoryId = "parentCategoryId_example"; // ID of the parent category
    try {
      Object result = client
              .knowledgeBases
              .createCategoryDefaultLocale(name, knowledgeBaseId)
              .description(description)
              .parentCategoryId(parentCategoryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createCategoryDefaultLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .createCategoryDefaultLocale(name, knowledgeBaseId)
              .description(description)
              .parentCategoryId(parentCategoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createCategoryDefaultLocale");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to create the category in | [default to knb_123] |
| **knowledgeBaseCategoryCreate** | [**KnowledgeBaseCategoryCreate**](KnowledgeBaseCategoryCreate.md)|  | [optional] |

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
| **201** | A knowledge base category with content |  -  |

<a name="createCategoryInLocale"></a>
# **createCategoryInLocale**
> Object createCategoryInLocale(knowledgeBaseId, locale).knowledgeBaseCategoryCreate(knowledgeBaseCategoryCreate).execute();

Create knowledge base category in specified locale

Creates a knowledge base category for a given locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String name = "name_example"; // Name of the knowledge base category
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to create the category in
    String locale = "en"; // The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the category's content
    String description = "description_example"; // Description of the knowledge base category
    String parentCategoryId = "parentCategoryId_example"; // ID of the parent category
    try {
      Object result = client
              .knowledgeBases
              .createCategoryInLocale(name, knowledgeBaseId, locale)
              .description(description)
              .parentCategoryId(parentCategoryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createCategoryInLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .createCategoryInLocale(name, knowledgeBaseId, locale)
              .description(description)
              .parentCategoryId(parentCategoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createCategoryInLocale");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to create the category in | [default to knb_123] |
| **locale** | **String**| The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the category&#39;s content | [default to en] |
| **knowledgeBaseCategoryCreate** | [**KnowledgeBaseCategoryCreate**](KnowledgeBaseCategoryCreate.md)|  | [optional] |

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
| **201** | A knowledge base category with content |  -  |

<a name="createNewKnowledgeBase"></a>
# **createNewKnowledgeBase**
> Object createNewKnowledgeBase().knowledgeBaseCreate(knowledgeBaseCreate).execute();

Create a knowledge base

Creates a knowledge base.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String name = "name_example"; // Name of the knowledge base
    String type = "internal"; // Determines if the knowledge base is publicly available or private only to your company
    try {
      Object result = client
              .knowledgeBases
              .createNewKnowledgeBase(name)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createNewKnowledgeBase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .createNewKnowledgeBase(name)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#createNewKnowledgeBase");
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
| **knowledgeBaseCreate** | [**KnowledgeBaseCreate**](KnowledgeBaseCreate.md)|  | [optional] |

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
| **201** | A knowledge base with content |  -  |

<a name="deleteArticle"></a>
# **deleteArticle**
> Object deleteArticle(articleId).execute();

Delete an article

Deletes an article and all its content and translations.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String articleId = "kba_123"; // The ID of the article to delete
    try {
      Object result = client
              .knowledgeBases
              .deleteArticle(articleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#deleteArticle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .deleteArticle(articleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#deleteArticle");
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
| **articleId** | **String**| The ID of the article to delete | [default to kba_123] |

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
| **200** | A knowledge base article |  -  |

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(categoryId).execute();

Delete a knowledge base category

Deletes a knowledge base category.  &gt; ⚠️ Warning &gt; &gt; When a category is deleted, all articles in the category are also deleted.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String categoryId = "kbc_123"; // The ID of the category to delete
    try {
      client
              .knowledgeBases
              .deleteCategory(categoryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#deleteCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .knowledgeBases
              .deleteCategory(categoryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#deleteCategory");
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
| **categoryId** | **String**| The ID of the category to delete | [default to kbc_123] |

### Return type

null (empty response body)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |

<a name="downloadAttachmentArticle"></a>
# **downloadAttachmentArticle**
> Object downloadAttachmentArticle(articleId, attachmentId).execute();

Download attachment from an article

Downloads the attachment from an article.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String articleId = "kba_123"; // The ID of the article
    String attachmentId = "attachmentId_example"; // The ID of the file to download
    try {
      Object result = client
              .knowledgeBases
              .downloadAttachmentArticle(articleId, attachmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#downloadAttachmentArticle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .downloadAttachmentArticle(articleId, attachmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#downloadAttachmentArticle");
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
| **articleId** | **String**| The ID of the article | [default to kba_123] |
| **attachmentId** | **String**| The ID of the file to download | |

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
| **200** | An attachment |  -  |

<a name="getArticleById"></a>
# **getArticleById**
> Object getArticleById(articleId).execute();

Get a knowledge base article

Fetches a knowledge base article.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String articleId = "kba_123"; // The ID of the article to fetch
    try {
      Object result = client
              .knowledgeBases
              .getArticleById(articleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getArticleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getArticleById(articleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getArticleById");
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
| **articleId** | **String**| The ID of the article to fetch | [default to kba_123] |

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
| **200** | A knowledge base article |  -  |

<a name="getArticleContent"></a>
# **getArticleContent**
> Object getArticleContent(articleId, locale).execute();

Get knowledge base article with content in specified locale

Fetches a knowledge base article with content for a given locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String articleId = "kba_123"; // The ID of the article to fetch
    String locale = "en"; // The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the content to fetch
    try {
      Object result = client
              .knowledgeBases
              .getArticleContent(articleId, locale)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getArticleContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getArticleContent(articleId, locale)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getArticleContent");
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
| **articleId** | **String**| The ID of the article to fetch | [default to kba_123] |
| **locale** | **String**| The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the content to fetch | [default to en] |

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
| **200** | A knowledge base article with content |  -  |

<a name="getCategory"></a>
# **getCategory**
> Object getCategory(categoryId).execute();

Get a knowledge base category

Fetches a knowledge base category.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String categoryId = "kbc_123"; // The ID of the category to fetch
    try {
      Object result = client
              .knowledgeBases
              .getCategory(categoryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getCategory(categoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getCategory");
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
| **categoryId** | **String**| The ID of the category to fetch | [default to kbc_123] |

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
| **200** | A knowledge base category |  -  |

<a name="getCategoryContentDefaultLocale"></a>
# **getCategoryContentDefaultLocale**
> Object getCategoryContentDefaultLocale(categoryId).execute();

Get knowledge base category content in default locale

Fetches a knowledge base category with content in the default locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String categoryId = "kbc_123"; // The ID of the category to fetch
    try {
      Object result = client
              .knowledgeBases
              .getCategoryContentDefaultLocale(categoryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getCategoryContentDefaultLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getCategoryContentDefaultLocale(categoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getCategoryContentDefaultLocale");
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
| **categoryId** | **String**| The ID of the category to fetch | [default to kbc_123] |

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
| **200** | A knowledge base category with content |  -  |

<a name="getCategoryContentLocale"></a>
# **getCategoryContentLocale**
> Object getCategoryContentLocale(categoryId, locale).execute();

Get knowledge base category with content in specified locale

Fetches a knowledge base category with content for a given locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String categoryId = "kbc_123"; // The ID of the category to fetch
    String locale = "en"; // The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the content to fetch
    try {
      Object result = client
              .knowledgeBases
              .getCategoryContentLocale(categoryId, locale)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getCategoryContentLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getCategoryContentLocale(categoryId, locale)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getCategoryContentLocale");
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
| **categoryId** | **String**| The ID of the category to fetch | [default to kbc_123] |
| **locale** | **String**| The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the content to fetch | [default to en] |

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
| **200** | A knowledge base category with content |  -  |

<a name="getContentDefaultLocale"></a>
# **getContentDefaultLocale**
> Object getContentDefaultLocale(articleId).execute();

Get knowledge base article with content in default locale

Fetches a knowledge base article with content in the default locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String articleId = "kba_123"; // The ID of the article to fetch
    try {
      Object result = client
              .knowledgeBases
              .getContentDefaultLocale(articleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getContentDefaultLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getContentDefaultLocale(articleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getContentDefaultLocale");
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
| **articleId** | **String**| The ID of the article to fetch | [default to kba_123] |

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
| **200** | A knowledge base article with content |  -  |

<a name="getContentDefaultLocale_0"></a>
# **getContentDefaultLocale_0**
> Object getContentDefaultLocale_0(knowledgeBaseId).execute();

Get a knowledge base with content in default locale

Fetches a knowledge base with its content in the default locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to fetch
    try {
      Object result = client
              .knowledgeBases
              .getContentDefaultLocale_0(knowledgeBaseId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getContentDefaultLocale_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getContentDefaultLocale_0(knowledgeBaseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getContentDefaultLocale_0");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to fetch | [default to knb_123] |

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
| **200** | A knowledge base with content |  -  |

<a name="getKnowledgeBase"></a>
# **getKnowledgeBase**
> Object getKnowledgeBase(knowledgeBaseId).execute();

Get a knowledge base

Fetches a knowledge base.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to fetch
    try {
      Object result = client
              .knowledgeBases
              .getKnowledgeBase(knowledgeBaseId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getKnowledgeBase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getKnowledgeBase(knowledgeBaseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getKnowledgeBase");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to fetch | [default to knb_123] |

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
| **200** | A knowledge base |  -  |

<a name="getKnowledgeBaseContentInLocale"></a>
# **getKnowledgeBaseContentInLocale**
> Object getKnowledgeBaseContentInLocale(knowledgeBaseId, locale).execute();

Get a knowledge base with content in specified locale

Fetches a knowledge base with its content for a given locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to fetch
    String locale = "en"; // The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the content to fetch
    try {
      Object result = client
              .knowledgeBases
              .getKnowledgeBaseContentInLocale(knowledgeBaseId, locale)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getKnowledgeBaseContentInLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .getKnowledgeBaseContentInLocale(knowledgeBaseId, locale)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#getKnowledgeBaseContentInLocale");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to fetch | [default to knb_123] |
| **locale** | **String**| The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the content to fetch | [default to en] |

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
| **200** | A knowledge base with content |  -  |

<a name="listArticlesInBase"></a>
# **listArticlesInBase**
> KnowledgeBasesListArticlesInCategoryResponse listArticlesInBase(knowledgeBaseId).limit(limit).pageToken(pageToken).execute();

List articles in a knowledge base

List articles in a knowledge base  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    try {
      KnowledgeBasesListArticlesInCategoryResponse result = client
              .knowledgeBases
              .listArticlesInBase(knowledgeBaseId)
              .limit(limit)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#listArticlesInBase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KnowledgeBasesListArticlesInCategoryResponse> response = client
              .knowledgeBases
              .listArticlesInBase(knowledgeBaseId)
              .limit(limit)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#listArticlesInBase");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base | [default to knb_123] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |

### Return type

[**KnowledgeBasesListArticlesInCategoryResponse**](KnowledgeBasesListArticlesInCategoryResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of knowledge base articles |  -  |

<a name="listArticlesInCategory"></a>
# **listArticlesInCategory**
> KnowledgeBasesListArticlesInCategoryResponse listArticlesInCategory(categoryId).limit(limit).pageToken(pageToken).execute();

List articles in a category

List articles in a category.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String categoryId = "kbc_123"; // The ID of the category
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    try {
      KnowledgeBasesListArticlesInCategoryResponse result = client
              .knowledgeBases
              .listArticlesInCategory(categoryId)
              .limit(limit)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#listArticlesInCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KnowledgeBasesListArticlesInCategoryResponse> response = client
              .knowledgeBases
              .listArticlesInCategory(categoryId)
              .limit(limit)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#listArticlesInCategory");
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
| **categoryId** | **String**| The ID of the category | [default to kbc_123] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |

### Return type

[**KnowledgeBasesListArticlesInCategoryResponse**](KnowledgeBasesListArticlesInCategoryResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of knowledge base articles |  -  |

<a name="listCategoriesInBase"></a>
# **listCategoriesInBase**
> KnowledgeBasesListCategoriesInBaseResponse listCategoriesInBase(knowledgeBaseId).limit(limit).pageToken(pageToken).execute();

List categories in a knowledge base

List categories in a knowledge base.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base
    Integer limit = 25; // Max number of results per [page](https://dev.frontapp.com/docs/pagination)
    String pageToken = "https://yourCompany.api.frontapp.com/endpoint?limit=25&page_token=92f32bcd7625333caf4e0f8fc26d920c812f"; // Token to use to request the [next page](https://dev.frontapp.com/docs/pagination)
    try {
      KnowledgeBasesListCategoriesInBaseResponse result = client
              .knowledgeBases
              .listCategoriesInBase(knowledgeBaseId)
              .limit(limit)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getPagination());
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#listCategoriesInBase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KnowledgeBasesListCategoriesInBaseResponse> response = client
              .knowledgeBases
              .listCategoriesInBase(knowledgeBaseId)
              .limit(limit)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#listCategoriesInBase");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base | [default to knb_123] |
| **limit** | **Integer**| Max number of results per [page](https://dev.frontapp.com/docs/pagination) | [optional] |
| **pageToken** | **String**| Token to use to request the [next page](https://dev.frontapp.com/docs/pagination) | [optional] |

### Return type

[**KnowledgeBasesListCategoriesInBaseResponse**](KnowledgeBasesListCategoriesInBaseResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of knowledge base categories |  -  |

<a name="listKnowledgeBases"></a>
# **listKnowledgeBases**
> KnowledgeBasesListKnowledgeBasesResponse listKnowledgeBases().execute();

List knowledge bases

List the knowledge bases of the company.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    try {
      KnowledgeBasesListKnowledgeBasesResponse result = client
              .knowledgeBases
              .listKnowledgeBases()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#listKnowledgeBases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KnowledgeBasesListKnowledgeBasesResponse> response = client
              .knowledgeBases
              .listKnowledgeBases()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#listKnowledgeBases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**KnowledgeBasesListKnowledgeBasesResponse**](KnowledgeBasesListKnowledgeBasesResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of knowledge bases |  -  |

<a name="updateArticleContentDefaultLocale"></a>
# **updateArticleContentDefaultLocale**
> Object updateArticleContentDefaultLocale(articleId).knowledgeBaseArticlePatch(knowledgeBaseArticlePatch).execute();

Update article content in default locale.

Updates an article&#39;s content in the default locale  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String articleId = "kba_123"; // The ID of the article to update
    String authorId = "authorId_example"; // Teammate ID of the article author
    String subject = "subject_example"; // Subject of the article
    String content = "content_example"; // HTML content of the article
    String status = "draft"; // Article status
    try {
      Object result = client
              .knowledgeBases
              .updateArticleContentDefaultLocale(articleId)
              .authorId(authorId)
              .subject(subject)
              .content(content)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateArticleContentDefaultLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .updateArticleContentDefaultLocale(articleId)
              .authorId(authorId)
              .subject(subject)
              .content(content)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateArticleContentDefaultLocale");
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
| **articleId** | **String**| The ID of the article to update | [default to kba_123] |
| **knowledgeBaseArticlePatch** | [**KnowledgeBaseArticlePatch**](KnowledgeBaseArticlePatch.md)|  | [optional] |

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
| **200** | A knowledge base article with content |  -  |

<a name="updateArticleContentLocale"></a>
# **updateArticleContentLocale**
> Object updateArticleContentLocale(articleId, locale).knowledgeBaseArticlePatch(knowledgeBaseArticlePatch).execute();

Update article content in specified locale

Updates an article&#39;s content for a given locale.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String articleId = "kba_123"; // The ID of the article to update
    String locale = "en"; // The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the updated content
    String authorId = "authorId_example"; // Teammate ID of the article author
    String subject = "subject_example"; // Subject of the article
    String content = "content_example"; // HTML content of the article
    String status = "draft"; // Article status
    try {
      Object result = client
              .knowledgeBases
              .updateArticleContentLocale(articleId, locale)
              .authorId(authorId)
              .subject(subject)
              .content(content)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateArticleContentLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .updateArticleContentLocale(articleId, locale)
              .authorId(authorId)
              .subject(subject)
              .content(content)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateArticleContentLocale");
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
| **articleId** | **String**| The ID of the article to update | [default to kba_123] |
| **locale** | **String**| The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the updated content | [default to en] |
| **knowledgeBaseArticlePatch** | [**KnowledgeBaseArticlePatch**](KnowledgeBaseArticlePatch.md)|  | [optional] |

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
| **200** | A knowledge base article with content |  -  |

<a name="updateCategoryContentLocale"></a>
# **updateCategoryContentLocale**
> Object updateCategoryContentLocale(categoryId, locale).knowledgeBaseCategoryPatch(knowledgeBaseCategoryPatch).execute();

Update knowledge base category in specified locale

Updates a knowledge base category for a given locale. Will republish the knowledge base if the knowledge base is currently published.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String categoryId = "kbc_123"; // The ID of the category to update
    String locale = "en"; // The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the updated content
    String description = "description_example"; // Description of the knowledge base category
    String name = "name_example"; // Name of the knowledge base category
    try {
      Object result = client
              .knowledgeBases
              .updateCategoryContentLocale(categoryId, locale)
              .description(description)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateCategoryContentLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .updateCategoryContentLocale(categoryId, locale)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateCategoryContentLocale");
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
| **categoryId** | **String**| The ID of the category to update | [default to kbc_123] |
| **locale** | **String**| The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the updated content | [default to en] |
| **knowledgeBaseCategoryPatch** | [**KnowledgeBaseCategoryPatch**](KnowledgeBaseCategoryPatch.md)|  | [optional] |

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
| **200** | A knowledge base category with content |  -  |

<a name="updateCategoryDefaultLocale"></a>
# **updateCategoryDefaultLocale**
> Object updateCategoryDefaultLocale(categoryId).knowledgeBaseCategoryPatch(knowledgeBaseCategoryPatch).execute();

Update knowledge base category in default locale

Updates a knowledge base category in the default locale. Will republish the knowledge base if the knowledge base is currently published.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String categoryId = "kbc_123"; // The ID of the category to update
    String description = "description_example"; // Description of the knowledge base category
    String name = "name_example"; // Name of the knowledge base category
    try {
      Object result = client
              .knowledgeBases
              .updateCategoryDefaultLocale(categoryId)
              .description(description)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateCategoryDefaultLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .updateCategoryDefaultLocale(categoryId)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateCategoryDefaultLocale");
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
| **categoryId** | **String**| The ID of the category to update | [default to kbc_123] |
| **knowledgeBaseCategoryPatch** | [**KnowledgeBaseCategoryPatch**](KnowledgeBaseCategoryPatch.md)|  | [optional] |

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
| **200** | A knowledge base category with content |  -  |

<a name="updateDefaultKnowledgeBase"></a>
# **updateDefaultKnowledgeBase**
> Object updateDefaultKnowledgeBase(knowledgeBaseId).knowledgeBasePatch(knowledgeBasePatch).execute();

Update knowledge base in default locale

Updates a knowledge base in the default locale. Will republish the knowledge base if the knowledge base is currently published.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to update
    String name = "name_example"; // Name of the knowledge base
    try {
      Object result = client
              .knowledgeBases
              .updateDefaultKnowledgeBase(knowledgeBaseId)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateDefaultKnowledgeBase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .updateDefaultKnowledgeBase(knowledgeBaseId)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateDefaultKnowledgeBase");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to update | [default to knb_123] |
| **knowledgeBasePatch** | [**KnowledgeBasePatch**](KnowledgeBasePatch.md)|  | [optional] |

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
| **200** | A knowledge base with content |  -  |

<a name="updateKnowledgeBaseLocale"></a>
# **updateKnowledgeBaseLocale**
> Object updateKnowledgeBaseLocale(knowledgeBaseId, locale).knowledgeBasePatch(knowledgeBasePatch).execute();

Update knowledge base in specified locale

Updates a knowledge base for a given locale. Will republish the knowledge base if the knowledge base is currently published.  **Note**: You must use an API token to authenticate. OAuth is not supported at this time. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontCore;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KnowledgeBasesApi;
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
    String knowledgeBaseId = "knb_123"; // The ID of the knowledge base to update
    String locale = "en"; // The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the updated content
    String name = "name_example"; // Name of the knowledge base
    try {
      Object result = client
              .knowledgeBases
              .updateKnowledgeBaseLocale(knowledgeBaseId, locale)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateKnowledgeBaseLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .knowledgeBases
              .updateKnowledgeBaseLocale(knowledgeBaseId, locale)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeBasesApi#updateKnowledgeBaseLocale");
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
| **knowledgeBaseId** | **String**| The ID of the knowledge base to update | [default to knb_123] |
| **locale** | **String**| The [locale](https://dev.frontapp.com/reference/knowledge-bases#locales) of the updated content | [default to en] |
| **knowledgeBasePatch** | [**KnowledgeBasePatch**](KnowledgeBasePatch.md)|  | [optional] |

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
| **200** | A knowledge base with content |  -  |


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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.KnowledgeBaseArticleSlimResponse;
import com.konfigthis.client.model.KnowledgeBasesListArticlesInCategoryResponseLinks;
import com.konfigthis.client.model.KnowledgeBasesListArticlesInCategoryResponsePagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * KnowledgeBasesListArticlesInCategoryResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class KnowledgeBasesListArticlesInCategoryResponse {
  public static final String SERIALIZED_NAME_PAGINATION = "_pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private KnowledgeBasesListArticlesInCategoryResponsePagination pagination;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private KnowledgeBasesListArticlesInCategoryResponseLinks links;

  public static final String SERIALIZED_NAME_RESULTS = "_results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<KnowledgeBaseArticleSlimResponse> results = null;

  public KnowledgeBasesListArticlesInCategoryResponse() {
  }

  public KnowledgeBasesListArticlesInCategoryResponse pagination(KnowledgeBasesListArticlesInCategoryResponsePagination pagination) {
    
    
    
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KnowledgeBasesListArticlesInCategoryResponsePagination getPagination() {
    return pagination;
  }


  public void setPagination(KnowledgeBasesListArticlesInCategoryResponsePagination pagination) {
    
    
    
    this.pagination = pagination;
  }


  public KnowledgeBasesListArticlesInCategoryResponse links(KnowledgeBasesListArticlesInCategoryResponseLinks links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KnowledgeBasesListArticlesInCategoryResponseLinks getLinks() {
    return links;
  }


  public void setLinks(KnowledgeBasesListArticlesInCategoryResponseLinks links) {
    
    
    
    this.links = links;
  }


  public KnowledgeBasesListArticlesInCategoryResponse results(List<KnowledgeBaseArticleSlimResponse> results) {
    
    
    
    
    this.results = results;
    return this;
  }

  public KnowledgeBasesListArticlesInCategoryResponse addResultsItem(KnowledgeBaseArticleSlimResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KnowledgeBaseArticleSlimResponse> getResults() {
    return results;
  }


  public void setResults(List<KnowledgeBaseArticleSlimResponse> results) {
    
    
    
    this.results = results;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the KnowledgeBasesListArticlesInCategoryResponse instance itself
   */
  public KnowledgeBasesListArticlesInCategoryResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeBasesListArticlesInCategoryResponse knowledgeBasesListArticlesInCategoryResponse = (KnowledgeBasesListArticlesInCategoryResponse) o;
    return Objects.equals(this.pagination, knowledgeBasesListArticlesInCategoryResponse.pagination) &&
        Objects.equals(this.links, knowledgeBasesListArticlesInCategoryResponse.links) &&
        Objects.equals(this.results, knowledgeBasesListArticlesInCategoryResponse.results)&&
        Objects.equals(this.additionalProperties, knowledgeBasesListArticlesInCategoryResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, links, results, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeBasesListArticlesInCategoryResponse {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("_pagination");
    openapiFields.add("_links");
    openapiFields.add("_results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KnowledgeBasesListArticlesInCategoryResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KnowledgeBasesListArticlesInCategoryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KnowledgeBasesListArticlesInCategoryResponse is not found in the empty JSON string", KnowledgeBasesListArticlesInCategoryResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `_pagination`
      if (jsonObj.get("_pagination") != null && !jsonObj.get("_pagination").isJsonNull()) {
        KnowledgeBasesListArticlesInCategoryResponsePagination.validateJsonObject(jsonObj.getAsJsonObject("_pagination"));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        KnowledgeBasesListArticlesInCategoryResponseLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      if (jsonObj.get("_results") != null && !jsonObj.get("_results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("_results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("_results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `_results` to be an array in the JSON string but got `%s`", jsonObj.get("_results").toString()));
          }

          // validate the optional field `_results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            KnowledgeBaseArticleSlimResponse.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KnowledgeBasesListArticlesInCategoryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KnowledgeBasesListArticlesInCategoryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KnowledgeBasesListArticlesInCategoryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KnowledgeBasesListArticlesInCategoryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KnowledgeBasesListArticlesInCategoryResponse>() {
           @Override
           public void write(JsonWriter out, KnowledgeBasesListArticlesInCategoryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public KnowledgeBasesListArticlesInCategoryResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             KnowledgeBasesListArticlesInCategoryResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KnowledgeBasesListArticlesInCategoryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KnowledgeBasesListArticlesInCategoryResponse
  * @throws IOException if the JSON string is invalid with respect to KnowledgeBasesListArticlesInCategoryResponse
  */
  public static KnowledgeBasesListArticlesInCategoryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KnowledgeBasesListArticlesInCategoryResponse.class);
  }

 /**
  * Convert an instance of KnowledgeBasesListArticlesInCategoryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


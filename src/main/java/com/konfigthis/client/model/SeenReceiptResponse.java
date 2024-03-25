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
import com.konfigthis.client.model.ContactHandle;
import com.konfigthis.client.model.SeenReceiptResponseLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * SeenReceiptResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SeenReceiptResponse {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SeenReceiptResponseLinks links;

  public static final String SERIALIZED_NAME_FIRST_SEEN_AT = "first_seen_at";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN_AT)
  private String firstSeenAt;

  public static final String SERIALIZED_NAME_SEEN_BY = "seen_by";
  @SerializedName(SERIALIZED_NAME_SEEN_BY)
  private ContactHandle seenBy;

  public SeenReceiptResponse() {
  }

  public SeenReceiptResponse links(SeenReceiptResponseLinks links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeenReceiptResponseLinks getLinks() {
    return links;
  }


  public void setLinks(SeenReceiptResponseLinks links) {
    
    
    
    this.links = links;
  }


  public SeenReceiptResponse firstSeenAt(String firstSeenAt) {
    
    
    
    
    this.firstSeenAt = firstSeenAt;
    return this;
  }

   /**
   * Timestamp when message was seen
   * @return firstSeenAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1701298738269", value = "Timestamp when message was seen")

  public String getFirstSeenAt() {
    return firstSeenAt;
  }


  public void setFirstSeenAt(String firstSeenAt) {
    
    
    
    this.firstSeenAt = firstSeenAt;
  }


  public SeenReceiptResponse seenBy(ContactHandle seenBy) {
    
    
    
    
    this.seenBy = seenBy;
    return this;
  }

   /**
   * Get seenBy
   * @return seenBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactHandle getSeenBy() {
    return seenBy;
  }


  public void setSeenBy(ContactHandle seenBy) {
    
    
    
    this.seenBy = seenBy;
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
   * @return the SeenReceiptResponse instance itself
   */
  public SeenReceiptResponse putAdditionalProperty(String key, Object value) {
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
    SeenReceiptResponse seenReceiptResponse = (SeenReceiptResponse) o;
    return Objects.equals(this.links, seenReceiptResponse.links) &&
        Objects.equals(this.firstSeenAt, seenReceiptResponse.firstSeenAt) &&
        Objects.equals(this.seenBy, seenReceiptResponse.seenBy)&&
        Objects.equals(this.additionalProperties, seenReceiptResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, firstSeenAt, seenBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeenReceiptResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    seenBy: ").append(toIndentedString(seenBy)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("first_seen_at");
    openapiFields.add("seen_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SeenReceiptResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SeenReceiptResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SeenReceiptResponse is not found in the empty JSON string", SeenReceiptResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SeenReceiptResponseLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      if ((jsonObj.get("first_seen_at") != null && !jsonObj.get("first_seen_at").isJsonNull()) && !jsonObj.get("first_seen_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_seen_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_seen_at").toString()));
      }
      // validate the optional field `seen_by`
      if (jsonObj.get("seen_by") != null && !jsonObj.get("seen_by").isJsonNull()) {
        ContactHandle.validateJsonObject(jsonObj.getAsJsonObject("seen_by"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SeenReceiptResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SeenReceiptResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SeenReceiptResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SeenReceiptResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SeenReceiptResponse>() {
           @Override
           public void write(JsonWriter out, SeenReceiptResponse value) throws IOException {
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
           public SeenReceiptResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SeenReceiptResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SeenReceiptResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SeenReceiptResponse
  * @throws IOException if the JSON string is invalid with respect to SeenReceiptResponse
  */
  public static SeenReceiptResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SeenReceiptResponse.class);
  }

 /**
  * Convert an instance of SeenReceiptResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


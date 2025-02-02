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
import com.konfigthis.client.model.ReminderLinks;
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
 * Reminder
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Reminder {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ReminderLinks links;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Double createdAt;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduled_at";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private Double scheduledAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Double updatedAt;

  public Reminder() {
  }

  public Reminder links(ReminderLinks links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReminderLinks getLinks() {
    return links;
  }


  public void setLinks(ReminderLinks links) {
    
    
    
    this.links = links;
  }


  public Reminder createdAt(Double createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

  public Reminder createdAt(Integer createdAt) {
    
    
    
    
    this.createdAt = createdAt.doubleValue();
    return this;
  }

   /**
   * Timestamp at which the conversation reminder has been created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1701806790.536", value = "Timestamp at which the conversation reminder has been created")

  public Double getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Double createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Reminder scheduledAt(Double scheduledAt) {
    
    
    
    
    this.scheduledAt = scheduledAt;
    return this;
  }

  public Reminder scheduledAt(Integer scheduledAt) {
    
    
    
    
    this.scheduledAt = scheduledAt.doubleValue();
    return this;
  }

   /**
   * Timestamp that the conversation reminder has been scheduled for
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1701874800", value = "Timestamp that the conversation reminder has been scheduled for")

  public Double getScheduledAt() {
    return scheduledAt;
  }


  public void setScheduledAt(Double scheduledAt) {
    
    
    
    this.scheduledAt = scheduledAt;
  }


  public Reminder updatedAt(Double updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

  public Reminder updatedAt(Integer updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt.doubleValue();
    return this;
  }

   /**
   * Timestamp at which the conversation reminder has been updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1701806790.536", value = "Timestamp at which the conversation reminder has been updated")

  public Double getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(Double updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
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
   * @return the Reminder instance itself
   */
  public Reminder putAdditionalProperty(String key, Object value) {
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
    Reminder reminder = (Reminder) o;
    return Objects.equals(this.links, reminder.links) &&
        Objects.equals(this.createdAt, reminder.createdAt) &&
        Objects.equals(this.scheduledAt, reminder.scheduledAt) &&
        Objects.equals(this.updatedAt, reminder.updatedAt)&&
        Objects.equals(this.additionalProperties, reminder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, createdAt, scheduledAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reminder {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("scheduled_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Reminder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Reminder.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reminder is not found in the empty JSON string", Reminder.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        ReminderLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reminder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reminder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reminder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reminder.class));

       return (TypeAdapter<T>) new TypeAdapter<Reminder>() {
           @Override
           public void write(JsonWriter out, Reminder value) throws IOException {
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
           public Reminder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Reminder instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Reminder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reminder
  * @throws IOException if the JSON string is invalid with respect to Reminder
  */
  public static Reminder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reminder.class);
  }

 /**
  * Convert an instance of Reminder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * A signature that can be used to sign messages.
 */
@ApiModel(description = "A signature that can be used to sign messages.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateSharedSignature {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SENDER_INFO = "sender_info";
  @SerializedName(SERIALIZED_NAME_SENDER_INFO)
  private String senderInfo;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_IS_VISIBLE_FOR_ALL_TEAMMATE_CHANNELS = "is_visible_for_all_teammate_channels";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE_FOR_ALL_TEAMMATE_CHANNELS)
  private Boolean isVisibleForAllTeammateChannels;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault = false;

  public static final String SERIALIZED_NAME_CHANNEL_IDS = "channel_ids";
  @SerializedName(SERIALIZED_NAME_CHANNEL_IDS)
  private List<String> channelIds = null;

  public CreateSharedSignature() {
  }

  public CreateSharedSignature name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the signature
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the signature")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CreateSharedSignature senderInfo(String senderInfo) {
    
    
    
    
    this.senderInfo = senderInfo;
    return this;
  }

   /**
   * Sender info of the signature that will appear in the From line of emails sent.
   * @return senderInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sender info of the signature that will appear in the From line of emails sent.")

  public String getSenderInfo() {
    return senderInfo;
  }


  public void setSenderInfo(String senderInfo) {
    
    
    
    this.senderInfo = senderInfo;
  }


  public CreateSharedSignature body(String body) {
    
    
    
    
    this.body = body;
    return this;
  }

   /**
   * Body of the signature
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Body of the signature")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    
    
    
    this.body = body;
  }


  public CreateSharedSignature isVisibleForAllTeammateChannels(Boolean isVisibleForAllTeammateChannels) {
    
    
    
    
    this.isVisibleForAllTeammateChannels = isVisibleForAllTeammateChannels;
    return this;
  }

   /**
   * Whether or not the signature is visible in all individual channels for teammates in the given team.
   * @return isVisibleForAllTeammateChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the signature is visible in all individual channels for teammates in the given team.")

  public Boolean getIsVisibleForAllTeammateChannels() {
    return isVisibleForAllTeammateChannels;
  }


  public void setIsVisibleForAllTeammateChannels(Boolean isVisibleForAllTeammateChannels) {
    
    
    
    this.isVisibleForAllTeammateChannels = isVisibleForAllTeammateChannels;
  }


  public CreateSharedSignature isDefault(Boolean isDefault) {
    
    
    
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * If true, the signature will be set as the default signature for the team.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "If true, the signature will be set as the default signature for the team.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    
    
    
    this.isDefault = isDefault;
  }


  public CreateSharedSignature channelIds(List<String> channelIds) {
    
    
    
    
    this.channelIds = channelIds;
    return this;
  }

  public CreateSharedSignature addChannelIdsItem(String channelIdsItem) {
    if (this.channelIds == null) {
      this.channelIds = new ArrayList<>();
    }
    this.channelIds.add(channelIdsItem);
    return this;
  }

   /**
   * The specific channels this signature is available in. If omitted or null, the signature will be available in all channels the team has access to. Alternatively, you can specify channels using a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
   * @return channelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specific channels this signature is available in. If omitted or null, the signature will be available in all channels the team has access to. Alternatively, you can specify channels using a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).")

  public List<String> getChannelIds() {
    return channelIds;
  }


  public void setChannelIds(List<String> channelIds) {
    
    
    
    this.channelIds = channelIds;
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
   * @return the CreateSharedSignature instance itself
   */
  public CreateSharedSignature putAdditionalProperty(String key, Object value) {
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
    CreateSharedSignature createSharedSignature = (CreateSharedSignature) o;
    return Objects.equals(this.name, createSharedSignature.name) &&
        Objects.equals(this.senderInfo, createSharedSignature.senderInfo) &&
        Objects.equals(this.body, createSharedSignature.body) &&
        Objects.equals(this.isVisibleForAllTeammateChannels, createSharedSignature.isVisibleForAllTeammateChannels) &&
        Objects.equals(this.isDefault, createSharedSignature.isDefault) &&
        Objects.equals(this.channelIds, createSharedSignature.channelIds)&&
        Objects.equals(this.additionalProperties, createSharedSignature.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, senderInfo, body, isVisibleForAllTeammateChannels, isDefault, channelIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSharedSignature {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    senderInfo: ").append(toIndentedString(senderInfo)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    isVisibleForAllTeammateChannels: ").append(toIndentedString(isVisibleForAllTeammateChannels)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    channelIds: ").append(toIndentedString(channelIds)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("sender_info");
    openapiFields.add("body");
    openapiFields.add("is_visible_for_all_teammate_channels");
    openapiFields.add("is_default");
    openapiFields.add("channel_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("body");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSharedSignature
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateSharedSignature.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSharedSignature is not found in the empty JSON string", CreateSharedSignature.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSharedSignature.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("sender_info") != null && !jsonObj.get("sender_info").isJsonNull()) && !jsonObj.get("sender_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender_info").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("channel_ids") != null && !jsonObj.get("channel_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_ids` to be an array in the JSON string but got `%s`", jsonObj.get("channel_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSharedSignature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSharedSignature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSharedSignature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSharedSignature.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSharedSignature>() {
           @Override
           public void write(JsonWriter out, CreateSharedSignature value) throws IOException {
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
           public CreateSharedSignature read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateSharedSignature instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateSharedSignature given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSharedSignature
  * @throws IOException if the JSON string is invalid with respect to CreateSharedSignature
  */
  public static CreateSharedSignature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSharedSignature.class);
  }

 /**
  * Convert an instance of CreateSharedSignature to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


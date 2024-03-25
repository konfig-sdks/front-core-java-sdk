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
 * Settings of the channel
 */
@ApiModel(description = "Settings of the channel")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateChannelSettings {
  /**
   * The time (measured in seconds) that users have to undo a send operation in the channel.
   */
  @JsonAdapter(UndoSendTimeEnum.Adapter.class)
 public enum UndoSendTimeEnum {
    NUMBER_0(0),
    
    NUMBER_5(5),
    
    NUMBER_10(10),
    
    NUMBER_15(15),
    
    NUMBER_30(30),
    
    NUMBER_60(60);

    private Integer value;

    UndoSendTimeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UndoSendTimeEnum fromValue(Integer value) {
      for (UndoSendTimeEnum b : UndoSendTimeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UndoSendTimeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UndoSendTimeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UndoSendTimeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return UndoSendTimeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNDO_SEND_TIME = "undo_send_time";
  @SerializedName(SERIALIZED_NAME_UNDO_SEND_TIME)
  private UndoSendTimeEnum undoSendTime;

  public static final String SERIALIZED_NAME_ALL_TEAMMATES_CAN_REPLY = "all_teammates_can_reply";
  @SerializedName(SERIALIZED_NAME_ALL_TEAMMATES_CAN_REPLY)
  private Boolean allTeammatesCanReply;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhook_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_AUTH_TOKEN = "auth_token";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
  private String authToken;

  public CreateChannelSettings() {
  }

  public CreateChannelSettings undoSendTime(UndoSendTimeEnum undoSendTime) {
    
    
    
    
    this.undoSendTime = undoSendTime;
    return this;
  }

   /**
   * The time (measured in seconds) that users have to undo a send operation in the channel.
   * @return undoSendTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time (measured in seconds) that users have to undo a send operation in the channel.")

  public UndoSendTimeEnum getUndoSendTime() {
    return undoSendTime;
  }


  public void setUndoSendTime(UndoSendTimeEnum undoSendTime) {
    
    
    
    this.undoSendTime = undoSendTime;
  }


  public CreateChannelSettings allTeammatesCanReply(Boolean allTeammatesCanReply) {
    
    
    
    
    this.allTeammatesCanReply = allTeammatesCanReply;
    return this;
  }

   /**
   * Whether teammates without inbox access can reply on this channel. Only allowed for shared channels.
   * @return allTeammatesCanReply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether teammates without inbox access can reply on this channel. Only allowed for shared channels.")

  public Boolean getAllTeammatesCanReply() {
    return allTeammatesCanReply;
  }


  public void setAllTeammatesCanReply(Boolean allTeammatesCanReply) {
    
    
    
    this.allTeammatesCanReply = allTeammatesCanReply;
  }


  public CreateChannelSettings webhookUrl(String webhookUrl) {
    
    
    
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The webhook URL outbound messages should be sent to. Only allowed for \&quot;custom\&quot; type channels.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The webhook URL outbound messages should be sent to. Only allowed for \"custom\" type channels.")

  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {
    
    
    
    this.webhookUrl = webhookUrl;
  }


  public CreateChannelSettings sid(String sid) {
    
    
    
    
    this.sid = sid;
    return this;
  }

   /**
   * The SID of the Twilio channel. Only allowed for \&quot;twilio\&quot; type channels.
   * @return sid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The SID of the Twilio channel. Only allowed for \"twilio\" type channels.")

  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    
    
    
    this.sid = sid;
  }


  public CreateChannelSettings authToken(String authToken) {
    
    
    
    
    this.authToken = authToken;
    return this;
  }

   /**
   * The auth token for the Twilio account. Only allowed for \&quot;twilio\&quot; type channels.
   * @return authToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The auth token for the Twilio account. Only allowed for \"twilio\" type channels.")

  public String getAuthToken() {
    return authToken;
  }


  public void setAuthToken(String authToken) {
    
    
    
    this.authToken = authToken;
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
   * @return the CreateChannelSettings instance itself
   */
  public CreateChannelSettings putAdditionalProperty(String key, Object value) {
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
    CreateChannelSettings createChannelSettings = (CreateChannelSettings) o;
    return Objects.equals(this.undoSendTime, createChannelSettings.undoSendTime) &&
        Objects.equals(this.allTeammatesCanReply, createChannelSettings.allTeammatesCanReply) &&
        Objects.equals(this.webhookUrl, createChannelSettings.webhookUrl) &&
        Objects.equals(this.sid, createChannelSettings.sid) &&
        Objects.equals(this.authToken, createChannelSettings.authToken)&&
        Objects.equals(this.additionalProperties, createChannelSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(undoSendTime, allTeammatesCanReply, webhookUrl, sid, authToken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChannelSettings {\n");
    sb.append("    undoSendTime: ").append(toIndentedString(undoSendTime)).append("\n");
    sb.append("    allTeammatesCanReply: ").append(toIndentedString(allTeammatesCanReply)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
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
    openapiFields.add("undo_send_time");
    openapiFields.add("all_teammates_can_reply");
    openapiFields.add("webhook_url");
    openapiFields.add("sid");
    openapiFields.add("auth_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateChannelSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateChannelSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateChannelSettings is not found in the empty JSON string", CreateChannelSettings.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("webhook_url") != null && !jsonObj.get("webhook_url").isJsonNull()) && !jsonObj.get("webhook_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_url").toString()));
      }
      if ((jsonObj.get("sid") != null && !jsonObj.get("sid").isJsonNull()) && !jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if ((jsonObj.get("auth_token") != null && !jsonObj.get("auth_token").isJsonNull()) && !jsonObj.get("auth_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateChannelSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateChannelSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateChannelSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateChannelSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateChannelSettings>() {
           @Override
           public void write(JsonWriter out, CreateChannelSettings value) throws IOException {
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
           public CreateChannelSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateChannelSettings instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateChannelSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateChannelSettings
  * @throws IOException if the JSON string is invalid with respect to CreateChannelSettings
  */
  public static CreateChannelSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateChannelSettings.class);
  }

 /**
  * Convert an instance of CreateChannelSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


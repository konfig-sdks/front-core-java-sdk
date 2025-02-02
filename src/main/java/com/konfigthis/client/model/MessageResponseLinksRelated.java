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
 * MessageResponseLinksRelated
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MessageResponseLinksRelated {
  public static final String SERIALIZED_NAME_CONVERSATION = "conversation";
  @SerializedName(SERIALIZED_NAME_CONVERSATION)
  private String conversation;

  public static final String SERIALIZED_NAME_MESSAGE_REPLIED_TO = "message_replied_to";
  @SerializedName(SERIALIZED_NAME_MESSAGE_REPLIED_TO)
  private String messageRepliedTo;

  public static final String SERIALIZED_NAME_MESSAGE_SEEN = "message_seen";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SEEN)
  private String messageSeen;

  public MessageResponseLinksRelated() {
  }

  public MessageResponseLinksRelated conversation(String conversation) {
    
    
    
    
    this.conversation = conversation;
    return this;
  }

   /**
   * Link to message conversation
   * @return conversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://yourCompany.api.frontapp.com/conversations/cnv_yo1kg5q", value = "Link to message conversation")

  public String getConversation() {
    return conversation;
  }


  public void setConversation(String conversation) {
    
    
    
    this.conversation = conversation;
  }


  public MessageResponseLinksRelated messageRepliedTo(String messageRepliedTo) {
    
    
    
    
    this.messageRepliedTo = messageRepliedTo;
    return this;
  }

   /**
   * Link to message this message replied to
   * @return messageRepliedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://yourCompany.api.frontapp.com/messages/msg_2y67qldq", value = "Link to message this message replied to")

  public String getMessageRepliedTo() {
    return messageRepliedTo;
  }


  public void setMessageRepliedTo(String messageRepliedTo) {
    
    
    
    this.messageRepliedTo = messageRepliedTo;
  }


  public MessageResponseLinksRelated messageSeen(String messageSeen) {
    
    
    
    
    this.messageSeen = messageSeen;
    return this;
  }

   /**
   * Link to message seen information
   * @return messageSeen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://yourCompany.api.frontapp.com/messages/msg_1q15qmtq/seen", value = "Link to message seen information")

  public String getMessageSeen() {
    return messageSeen;
  }


  public void setMessageSeen(String messageSeen) {
    
    
    
    this.messageSeen = messageSeen;
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
   * @return the MessageResponseLinksRelated instance itself
   */
  public MessageResponseLinksRelated putAdditionalProperty(String key, Object value) {
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
    MessageResponseLinksRelated messageResponseLinksRelated = (MessageResponseLinksRelated) o;
    return Objects.equals(this.conversation, messageResponseLinksRelated.conversation) &&
        Objects.equals(this.messageRepliedTo, messageResponseLinksRelated.messageRepliedTo) &&
        Objects.equals(this.messageSeen, messageResponseLinksRelated.messageSeen)&&
        Objects.equals(this.additionalProperties, messageResponseLinksRelated.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, messageRepliedTo, messageSeen, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponseLinksRelated {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    messageRepliedTo: ").append(toIndentedString(messageRepliedTo)).append("\n");
    sb.append("    messageSeen: ").append(toIndentedString(messageSeen)).append("\n");
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
    openapiFields.add("conversation");
    openapiFields.add("message_replied_to");
    openapiFields.add("message_seen");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageResponseLinksRelated
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MessageResponseLinksRelated.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageResponseLinksRelated is not found in the empty JSON string", MessageResponseLinksRelated.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("conversation") != null && !jsonObj.get("conversation").isJsonNull()) && !jsonObj.get("conversation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation").toString()));
      }
      if ((jsonObj.get("message_replied_to") != null && !jsonObj.get("message_replied_to").isJsonNull()) && !jsonObj.get("message_replied_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_replied_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_replied_to").toString()));
      }
      if ((jsonObj.get("message_seen") != null && !jsonObj.get("message_seen").isJsonNull()) && !jsonObj.get("message_seen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_seen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_seen").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageResponseLinksRelated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageResponseLinksRelated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageResponseLinksRelated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseLinksRelated.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageResponseLinksRelated>() {
           @Override
           public void write(JsonWriter out, MessageResponseLinksRelated value) throws IOException {
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
           public MessageResponseLinksRelated read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MessageResponseLinksRelated instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MessageResponseLinksRelated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponseLinksRelated
  * @throws IOException if the JSON string is invalid with respect to MessageResponseLinksRelated
  */
  public static MessageResponseLinksRelated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponseLinksRelated.class);
  }

 /**
  * Convert an instance of MessageResponseLinksRelated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


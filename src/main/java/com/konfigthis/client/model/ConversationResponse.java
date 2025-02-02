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
import com.konfigthis.client.model.ConversationResponseLinks;
import com.konfigthis.client.model.ConversationResponseMetadata;
import com.konfigthis.client.model.LinkResponse;
import com.konfigthis.client.model.RecipientResponse;
import com.konfigthis.client.model.Reminder;
import com.konfigthis.client.model.TagResponse;
import com.konfigthis.client.model.TeammateResponse;
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
 * ConversationResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConversationResponse {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagResponse> tags = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ConversationResponseLinks links;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  /**
   * Status of the conversation
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    ARCHIVED("archived"),
    
    UNASSIGNED("unassigned"),
    
    DELETED("deleted"),
    
    ASSIGNED("assigned");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private TeammateResponse assignee;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private RecipientResponse recipient;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkResponse> links = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Object customFields;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Double createdAt;

  public static final String SERIALIZED_NAME_WAITING_SINCE = "waiting_since";
  @SerializedName(SERIALIZED_NAME_WAITING_SINCE)
  private Double waitingSince;

  public static final String SERIALIZED_NAME_IS_PRIVATE = "is_private";
  @SerializedName(SERIALIZED_NAME_IS_PRIVATE)
  private Boolean isPrivate;

  public static final String SERIALIZED_NAME_SCHEDULED_REMINDERS = "scheduled_reminders";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_REMINDERS)
  private List<Reminder> scheduledReminders = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private ConversationResponseMetadata metadata;

  public ConversationResponse() {
  }

  public ConversationResponse tags(List<TagResponse> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public ConversationResponse addTagsItem(TagResponse tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of the tags for this conversation
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags for this conversation")

  public List<TagResponse> getTags() {
    return tags;
  }


  public void setTags(List<TagResponse> tags) {
    
    
    
    this.tags = tags;
  }


  public ConversationResponse links(ConversationResponseLinks links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversationResponseLinks getLinks() {
    return links;
  }


  public void setLinks(ConversationResponseLinks links) {
    
    
    
    this.links = links;
  }


  public ConversationResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the conversation
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cnv_yo1kg5q", value = "Unique identifier of the conversation")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ConversationResponse subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the message for email message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "How to prank Dwight Schrute", value = "Subject of the message for email message")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public ConversationResponse status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of the conversation
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ASSIGNED", value = "Status of the conversation")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public ConversationResponse assignee(TeammateResponse assignee) {
    
    
    
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TeammateResponse getAssignee() {
    return assignee;
  }


  public void setAssignee(TeammateResponse assignee) {
    
    
    
    this.assignee = assignee;
  }


  public ConversationResponse recipient(RecipientResponse recipient) {
    
    
    
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecipientResponse getRecipient() {
    return recipient;
  }


  public void setRecipient(RecipientResponse recipient) {
    
    
    
    this.recipient = recipient;
  }


  public ConversationResponse links(List<LinkResponse> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public ConversationResponse addLinksItem(LinkResponse linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * List of the links for this conversation
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the links for this conversation")

  public List<LinkResponse> getLinks() {
    return links;
  }


  public void setLinks(List<LinkResponse> links) {
    
    
    
    this.links = links;
  }


  public ConversationResponse customFields(Object customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

   /**
   * Custom field attributes for this conversation
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"last_assignee\":\"Jim Halpert\"}", value = "Custom field attributes for this conversation")

  public Object getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Object customFields) {
    
    
    
    this.customFields = customFields;
  }


  public ConversationResponse createdAt(Double createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

  public ConversationResponse createdAt(Integer createdAt) {
    
    
    
    
    this.createdAt = createdAt.doubleValue();
    return this;
  }

   /**
   * Timestamp at which the conversation have been created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1701292649.333", value = "Timestamp at which the conversation have been created.")

  public Double getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Double createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public ConversationResponse waitingSince(Double waitingSince) {
    
    
    
    
    this.waitingSince = waitingSince;
    return this;
  }

  public ConversationResponse waitingSince(Integer waitingSince) {
    
    
    
    
    this.waitingSince = waitingSince.doubleValue();
    return this;
  }

   /**
   * Timestamp of the oldest unreplied message.
   * @return waitingSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1701292649.333", value = "Timestamp of the oldest unreplied message.")

  public Double getWaitingSince() {
    return waitingSince;
  }


  public void setWaitingSince(Double waitingSince) {
    
    
    
    this.waitingSince = waitingSince;
  }


  public ConversationResponse isPrivate(Boolean isPrivate) {
    
    
    
    
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Whether or not the conversation is private
   * @return isPrivate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not the conversation is private")

  public Boolean getIsPrivate() {
    return isPrivate;
  }


  public void setIsPrivate(Boolean isPrivate) {
    
    
    
    this.isPrivate = isPrivate;
  }


  public ConversationResponse scheduledReminders(List<Reminder> scheduledReminders) {
    
    
    
    
    this.scheduledReminders = scheduledReminders;
    return this;
  }

  public ConversationResponse addScheduledRemindersItem(Reminder scheduledRemindersItem) {
    if (this.scheduledReminders == null) {
      this.scheduledReminders = new ArrayList<>();
    }
    this.scheduledReminders.add(scheduledRemindersItem);
    return this;
  }

   /**
   * List of scheduled (non-expired and non-canceled) reminders for this conversation
   * @return scheduledReminders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of scheduled (non-expired and non-canceled) reminders for this conversation")

  public List<Reminder> getScheduledReminders() {
    return scheduledReminders;
  }


  public void setScheduledReminders(List<Reminder> scheduledReminders) {
    
    
    
    this.scheduledReminders = scheduledReminders;
  }


  public ConversationResponse metadata(ConversationResponseMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversationResponseMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(ConversationResponseMetadata metadata) {
    
    
    
    this.metadata = metadata;
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
   * @return the ConversationResponse instance itself
   */
  public ConversationResponse putAdditionalProperty(String key, Object value) {
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
    ConversationResponse conversationResponse = (ConversationResponse) o;
    return Objects.equals(this.tags, conversationResponse.tags) &&
        Objects.equals(this.links, conversationResponse.links) &&
        Objects.equals(this.id, conversationResponse.id) &&
        Objects.equals(this.subject, conversationResponse.subject) &&
        Objects.equals(this.status, conversationResponse.status) &&
        Objects.equals(this.assignee, conversationResponse.assignee) &&
        Objects.equals(this.recipient, conversationResponse.recipient) &&
        Objects.equals(this.links, conversationResponse.links) &&
        Objects.equals(this.customFields, conversationResponse.customFields) &&
        Objects.equals(this.createdAt, conversationResponse.createdAt) &&
        Objects.equals(this.waitingSince, conversationResponse.waitingSince) &&
        Objects.equals(this.isPrivate, conversationResponse.isPrivate) &&
        Objects.equals(this.scheduledReminders, conversationResponse.scheduledReminders) &&
        Objects.equals(this.metadata, conversationResponse.metadata)&&
        Objects.equals(this.additionalProperties, conversationResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, links, id, subject, status, assignee, recipient, links, customFields, createdAt, waitingSince, isPrivate, scheduledReminders, metadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationResponse {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    waitingSince: ").append(toIndentedString(waitingSince)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    scheduledReminders: ").append(toIndentedString(scheduledReminders)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("_links");
    openapiFields.add("id");
    openapiFields.add("subject");
    openapiFields.add("status");
    openapiFields.add("assignee");
    openapiFields.add("recipient");
    openapiFields.add("links");
    openapiFields.add("custom_fields");
    openapiFields.add("created_at");
    openapiFields.add("waiting_since");
    openapiFields.add("is_private");
    openapiFields.add("scheduled_reminders");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConversationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationResponse is not found in the empty JSON string", ConversationResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            TagResponse.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        ConversationResponseLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `assignee`
      if (jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) {
        TeammateResponse.validateJsonObject(jsonObj.getAsJsonObject("assignee"));
      }
      // validate the optional field `recipient`
      if (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) {
        RecipientResponse.validateJsonObject(jsonObj.getAsJsonObject("recipient"));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            LinkResponse.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("scheduled_reminders") != null && !jsonObj.get("scheduled_reminders").isJsonNull()) {
        JsonArray jsonArrayscheduledReminders = jsonObj.getAsJsonArray("scheduled_reminders");
        if (jsonArrayscheduledReminders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scheduled_reminders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scheduled_reminders` to be an array in the JSON string but got `%s`", jsonObj.get("scheduled_reminders").toString()));
          }

          // validate the optional field `scheduled_reminders` (array)
          for (int i = 0; i < jsonArrayscheduledReminders.size(); i++) {
            Reminder.validateJsonObject(jsonArrayscheduledReminders.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        ConversationResponseMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationResponse>() {
           @Override
           public void write(JsonWriter out, ConversationResponse value) throws IOException {
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
           public ConversationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConversationResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConversationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationResponse
  * @throws IOException if the JSON string is invalid with respect to ConversationResponse
  */
  public static ConversationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationResponse.class);
  }

 /**
  * Convert an instance of ConversationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


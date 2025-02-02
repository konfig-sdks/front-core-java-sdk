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
import com.konfigthis.client.model.ImportMessageMetadata;
import com.konfigthis.client.model.ImportMessageSender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * ImportMessage
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ImportMessage {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private ImportMessageSender sender;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = new ArrayList<>();

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  /**
   * Format of the message body. Can be &#x60;markdown&#x60; (default) or &#x60;html&#x60;, and can only be specified for &#x60;email&#x60; type.
   */
  @JsonAdapter(BodyFormatEnum.Adapter.class)
 public enum BodyFormatEnum {
    HTML("html"),
    
    MARKDOWN("markdown");

    private String value;

    BodyFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BodyFormatEnum fromValue(String value) {
      for (BodyFormatEnum b : BodyFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BodyFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BodyFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BodyFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BodyFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BODY_FORMAT = "body_format";
  @SerializedName(SERIALIZED_NAME_BODY_FORMAT)
  private BodyFormatEnum bodyFormat = BodyFormatEnum.MARKDOWN;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  /**
   * Type of the message to import. Default is &#x60;email&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    EMAIL("email"),
    
    SMS("sms"),
    
    INTERCOM("intercom"),
    
    CUSTOM("custom");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.EMAIL;

  public static final String SERIALIZED_NAME_ASSIGNEE_ID = "assignee_id";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE_ID)
  private String assigneeId;

  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  private String conversationId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private ImportMessageMetadata metadata;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<File> attachments = null;

  public ImportMessage() {
  }

  public ImportMessage tags(List<String> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public ImportMessage addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tag names to add to the conversation
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tag names to add to the conversation")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    
    
    
    this.tags = tags;
  }


  public ImportMessage sender(ImportMessageSender sender) {
    
    
    
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ImportMessageSender getSender() {
    return sender;
  }


  public void setSender(ImportMessageSender sender) {
    
    
    
    this.sender = sender;
  }


  public ImportMessage to(List<String> to) {
    
    
    
    
    this.to = to;
    return this;
  }

  public ImportMessage addToItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * List of the recipient handles who will receive this message
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of the recipient handles who will receive this message")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    
    
    
    this.to = to;
  }


  public ImportMessage cc(List<String> cc) {
    
    
    
    
    this.cc = cc;
    return this;
  }

  public ImportMessage addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * List of the recipient handles who will receive a copy of this message
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the recipient handles who will receive a copy of this message")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    
    
    
    this.cc = cc;
  }


  public ImportMessage bcc(List<String> bcc) {
    
    
    
    
    this.bcc = bcc;
    return this;
  }

  public ImportMessage addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * List of the recipient handles who will receive a blind copy of this message
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the recipient handles who will receive a blind copy of this message")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    
    
    
    this.bcc = bcc;
  }


  public ImportMessage subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject of the message")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public ImportMessage body(String body) {
    
    
    
    
    this.body = body;
    return this;
  }

   /**
   * Body of the message
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Body of the message")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    
    
    
    this.body = body;
  }


  public ImportMessage bodyFormat(BodyFormatEnum bodyFormat) {
    
    
    
    
    this.bodyFormat = bodyFormat;
    return this;
  }

   /**
   * Format of the message body. Can be &#x60;markdown&#x60; (default) or &#x60;html&#x60;, and can only be specified for &#x60;email&#x60; type.
   * @return bodyFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MARKDOWN", value = "Format of the message body. Can be `markdown` (default) or `html`, and can only be specified for `email` type.")

  public BodyFormatEnum getBodyFormat() {
    return bodyFormat;
  }


  public void setBodyFormat(BodyFormatEnum bodyFormat) {
    
    
    
    this.bodyFormat = bodyFormat;
  }


  public ImportMessage externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External identifier of the message. Front won&#39;t import two messages with the same external ID.
   * @return externalId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "External identifier of the message. Front won't import two messages with the same external ID.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
  }


  public ImportMessage createdAt(Integer createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date at which the message as been sent or received.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date at which the message as been sent or received.")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public ImportMessage type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Type of the message to import. Default is &#x60;email&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMAIL", value = "Type of the message to import. Default is `email`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public ImportMessage assigneeId(String assigneeId) {
    
    
    
    
    this.assigneeId = assigneeId;
    return this;
  }

   /**
   * ID of the teammate who will be assigned to the conversation.
   * @return assigneeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the teammate who will be assigned to the conversation.")

  public String getAssigneeId() {
    return assigneeId;
  }


  public void setAssigneeId(String assigneeId) {
    
    
    
    this.assigneeId = assigneeId;
  }


  public ImportMessage conversationId(String conversationId) {
    
    
    
    
    this.conversationId = conversationId;
    return this;
  }

   /**
   * If supplied, Front will thread this message into conversation with the given ID. Note that including this parameter nullifies the &#x60;thread_ref&#x60; parameter _completely_.
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If supplied, Front will thread this message into conversation with the given ID. Note that including this parameter nullifies the `thread_ref` parameter _completely_.")

  public String getConversationId() {
    return conversationId;
  }


  public void setConversationId(String conversationId) {
    
    
    
    this.conversationId = conversationId;
  }


  public ImportMessage metadata(ImportMessageMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ImportMessageMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(ImportMessageMetadata metadata) {
    
    
    
    this.metadata = metadata;
  }


  public ImportMessage attachments(List<File> attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

  public ImportMessage addAttachmentsItem(File attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.")

  public List<File> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<File> attachments) {
    
    
    
    this.attachments = attachments;
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
   * @return the ImportMessage instance itself
   */
  public ImportMessage putAdditionalProperty(String key, Object value) {
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
    ImportMessage importMessage = (ImportMessage) o;
    return Objects.equals(this.tags, importMessage.tags) &&
        Objects.equals(this.sender, importMessage.sender) &&
        Objects.equals(this.to, importMessage.to) &&
        Objects.equals(this.cc, importMessage.cc) &&
        Objects.equals(this.bcc, importMessage.bcc) &&
        Objects.equals(this.subject, importMessage.subject) &&
        Objects.equals(this.body, importMessage.body) &&
        Objects.equals(this.bodyFormat, importMessage.bodyFormat) &&
        Objects.equals(this.externalId, importMessage.externalId) &&
        Objects.equals(this.createdAt, importMessage.createdAt) &&
        Objects.equals(this.type, importMessage.type) &&
        Objects.equals(this.assigneeId, importMessage.assigneeId) &&
        Objects.equals(this.conversationId, importMessage.conversationId) &&
        Objects.equals(this.metadata, importMessage.metadata) &&
        Objects.equals(this.attachments, importMessage.attachments)&&
        Objects.equals(this.additionalProperties, importMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, sender, to, cc, bcc, subject, body, bodyFormat, externalId, createdAt, type, assigneeId, conversationId, metadata, attachments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportMessage {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyFormat: ").append(toIndentedString(bodyFormat)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("sender");
    openapiFields.add("to");
    openapiFields.add("cc");
    openapiFields.add("bcc");
    openapiFields.add("subject");
    openapiFields.add("body");
    openapiFields.add("body_format");
    openapiFields.add("external_id");
    openapiFields.add("created_at");
    openapiFields.add("type");
    openapiFields.add("assignee_id");
    openapiFields.add("conversation_id");
    openapiFields.add("metadata");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sender");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("external_id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ImportMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportMessage is not found in the empty JSON string", ImportMessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // validate the required field `sender`
      ImportMessageSender.validateJsonObject(jsonObj.getAsJsonObject("sender"));
      // ensure the required json array is present
      if (jsonObj.get("to") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be an array in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cc") != null && !jsonObj.get("cc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cc` to be an array in the JSON string but got `%s`", jsonObj.get("cc").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bcc") != null && !jsonObj.get("bcc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bcc` to be an array in the JSON string but got `%s`", jsonObj.get("bcc").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("body_format") != null && !jsonObj.get("body_format").isJsonNull()) && !jsonObj.get("body_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body_format").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("assignee_id") != null && !jsonObj.get("assignee_id").isJsonNull()) && !jsonObj.get("assignee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignee_id").toString()));
      }
      if ((jsonObj.get("conversation_id") != null && !jsonObj.get("conversation_id").isJsonNull()) && !jsonObj.get("conversation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation_id").toString()));
      }
      // validate the required field `metadata`
      ImportMessageMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportMessage>() {
           @Override
           public void write(JsonWriter out, ImportMessage value) throws IOException {
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
           public ImportMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImportMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ImportMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportMessage
  * @throws IOException if the JSON string is invalid with respect to ImportMessage
  */
  public static ImportMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportMessage.class);
  }

 /**
  * Convert an instance of ImportMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * CreateContact
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateContact {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private File avatar;

  public static final String SERIALIZED_NAME_IS_SPAMMER = "is_spammer";
  @SerializedName(SERIALIZED_NAME_IS_SPAMMER)
  private Boolean isSpammer;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<String> links = null;

  public static final String SERIALIZED_NAME_GROUP_NAMES = "group_names";
  @SerializedName(SERIALIZED_NAME_GROUP_NAMES)
  private List<String> groupNames = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Object customFields;

  public static final String SERIALIZED_NAME_HANDLES = "handles";
  @SerializedName(SERIALIZED_NAME_HANDLES)
  private List<ContactHandle> handles = new ArrayList<>();

  public CreateContact() {
  }

  public CreateContact description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Contact description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CreateContact name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Contact name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CreateContact avatar(File avatar) {
    
    
    
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Binary data of avatar. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Binary data of avatar. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.")

  public File getAvatar() {
    return avatar;
  }


  public void setAvatar(File avatar) {
    
    
    
    this.avatar = avatar;
  }


  public CreateContact isSpammer(Boolean isSpammer) {
    
    
    
    
    this.isSpammer = isSpammer;
    return this;
  }

   /**
   * Whether or not the contact is marked as a spammer
   * @return isSpammer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the contact is marked as a spammer")

  public Boolean getIsSpammer() {
    return isSpammer;
  }


  public void setIsSpammer(Boolean isSpammer) {
    
    
    
    this.isSpammer = isSpammer;
  }


  public CreateContact links(List<String> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public CreateContact addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * List of all the links of the contact
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all the links of the contact")

  public List<String> getLinks() {
    return links;
  }


  public void setLinks(List<String> links) {
    
    
    
    this.links = links;
  }


  public CreateContact groupNames(List<String> groupNames) {
    
    
    
    
    this.groupNames = groupNames;
    return this;
  }

  public CreateContact addGroupNamesItem(String groupNamesItem) {
    if (this.groupNames == null) {
      this.groupNames = new ArrayList<>();
    }
    this.groupNames.add(groupNamesItem);
    return this;
  }

   /**
   * List of all the group names the contact belongs to. It will automatically create missing groups
   * @return groupNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all the group names the contact belongs to. It will automatically create missing groups")

  public List<String> getGroupNames() {
    return groupNames;
  }


  public void setGroupNames(List<String> groupNames) {
    
    
    
    this.groupNames = groupNames;
  }


  public CreateContact customFields(Object customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

   /**
   * Custom field attributes for this contact. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom field attributes for this contact. If you want to keep all custom fields the same when updating this resource, do not include any custom fields in the update. If you want to update custom fields, make sure to include all custom fields, not just the fields you want to add or update. If you send only the custom fields you want to update, the other custom fields will be erased. You can retrieve the existing custom fields before making the update to note the current fields.")

  public Object getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Object customFields) {
    
    
    
    this.customFields = customFields;
  }


  public CreateContact handles(List<ContactHandle> handles) {
    
    
    
    
    this.handles = handles;
    return this;
  }

  public CreateContact addHandlesItem(ContactHandle handlesItem) {
    this.handles.add(handlesItem);
    return this;
  }

   /**
   * List of the handles for this contact. Each handle object should include &#x60;handle&#x60; and &#x60;source&#x60; fields.
   * @return handles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of the handles for this contact. Each handle object should include `handle` and `source` fields.")

  public List<ContactHandle> getHandles() {
    return handles;
  }


  public void setHandles(List<ContactHandle> handles) {
    
    
    
    this.handles = handles;
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
   * @return the CreateContact instance itself
   */
  public CreateContact putAdditionalProperty(String key, Object value) {
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
    CreateContact createContact = (CreateContact) o;
    return Objects.equals(this.description, createContact.description) &&
        Objects.equals(this.name, createContact.name) &&
        Objects.equals(this.avatar, createContact.avatar) &&
        Objects.equals(this.isSpammer, createContact.isSpammer) &&
        Objects.equals(this.links, createContact.links) &&
        Objects.equals(this.groupNames, createContact.groupNames) &&
        Objects.equals(this.customFields, createContact.customFields) &&
        Objects.equals(this.handles, createContact.handles)&&
        Objects.equals(this.additionalProperties, createContact.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, avatar, isSpammer, links, groupNames, customFields, handles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContact {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    isSpammer: ").append(toIndentedString(isSpammer)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    handles: ").append(toIndentedString(handles)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("avatar");
    openapiFields.add("is_spammer");
    openapiFields.add("links");
    openapiFields.add("group_names");
    openapiFields.add("custom_fields");
    openapiFields.add("handles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("handles");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateContact
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateContact.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContact is not found in the empty JSON string", CreateContact.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateContact.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_names") != null && !jsonObj.get("group_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_names` to be an array in the JSON string but got `%s`", jsonObj.get("group_names").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("handles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `handles` to be an array in the JSON string but got `%s`", jsonObj.get("handles").toString()));
      }

      JsonArray jsonArrayhandles = jsonObj.getAsJsonArray("handles");
      // validate the required field `handles` (array)
      for (int i = 0; i < jsonArrayhandles.size(); i++) {
        ContactHandle.validateJsonObject(jsonArrayhandles.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContact.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContact>() {
           @Override
           public void write(JsonWriter out, CreateContact value) throws IOException {
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
           public CreateContact read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateContact instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateContact given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateContact
  * @throws IOException if the JSON string is invalid with respect to CreateContact
  */
  public static CreateContact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContact.class);
  }

 /**
  * Convert an instance of CreateContact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


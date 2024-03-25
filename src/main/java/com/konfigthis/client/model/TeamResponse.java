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
import com.konfigthis.client.model.InboxResponse;
import com.konfigthis.client.model.TeamResponseLinks;
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
 * TeamResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TeamResponse {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private TeamResponseLinks links;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INBOXES = "inboxes";
  @SerializedName(SERIALIZED_NAME_INBOXES)
  private List<InboxResponse> inboxes = null;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<TeammateResponse> members = null;

  public TeamResponse() {
  }

  public TeamResponse links(TeamResponseLinks links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TeamResponseLinks getLinks() {
    return links;
  }


  public void setLinks(TeamResponseLinks links) {
    
    
    
    this.links = links;
  }


  public TeamResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the team
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tim_aqsa", value = "Unique identifier of the team")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TeamResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the team
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Stanley's crossword puzzle team", value = "Name of the team")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TeamResponse inboxes(List<InboxResponse> inboxes) {
    
    
    
    
    this.inboxes = inboxes;
    return this;
  }

  public TeamResponse addInboxesItem(InboxResponse inboxesItem) {
    if (this.inboxes == null) {
      this.inboxes = new ArrayList<>();
    }
    this.inboxes.add(inboxesItem);
    return this;
  }

   /**
   * List of the inboxes in the team
   * @return inboxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the inboxes in the team")

  public List<InboxResponse> getInboxes() {
    return inboxes;
  }


  public void setInboxes(List<InboxResponse> inboxes) {
    
    
    
    this.inboxes = inboxes;
  }


  public TeamResponse members(List<TeammateResponse> members) {
    
    
    
    
    this.members = members;
    return this;
  }

  public TeamResponse addMembersItem(TeammateResponse membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * List of the teammates that have access to the team
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the teammates that have access to the team")

  public List<TeammateResponse> getMembers() {
    return members;
  }


  public void setMembers(List<TeammateResponse> members) {
    
    
    
    this.members = members;
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
   * @return the TeamResponse instance itself
   */
  public TeamResponse putAdditionalProperty(String key, Object value) {
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
    TeamResponse teamResponse = (TeamResponse) o;
    return Objects.equals(this.links, teamResponse.links) &&
        Objects.equals(this.id, teamResponse.id) &&
        Objects.equals(this.name, teamResponse.name) &&
        Objects.equals(this.inboxes, teamResponse.inboxes) &&
        Objects.equals(this.members, teamResponse.members)&&
        Objects.equals(this.additionalProperties, teamResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, inboxes, members, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inboxes: ").append(toIndentedString(inboxes)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("inboxes");
    openapiFields.add("members");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TeamResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TeamResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamResponse is not found in the empty JSON string", TeamResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        TeamResponseLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("inboxes") != null && !jsonObj.get("inboxes").isJsonNull()) {
        JsonArray jsonArrayinboxes = jsonObj.getAsJsonArray("inboxes");
        if (jsonArrayinboxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inboxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inboxes` to be an array in the JSON string but got `%s`", jsonObj.get("inboxes").toString()));
          }

          // validate the optional field `inboxes` (array)
          for (int i = 0; i < jsonArrayinboxes.size(); i++) {
            InboxResponse.validateJsonObject(jsonArrayinboxes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
        if (jsonArraymembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
          }

          // validate the optional field `members` (array)
          for (int i = 0; i < jsonArraymembers.size(); i++) {
            TeammateResponse.validateJsonObject(jsonArraymembers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamResponse>() {
           @Override
           public void write(JsonWriter out, TeamResponse value) throws IOException {
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
           public TeamResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TeamResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TeamResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamResponse
  * @throws IOException if the JSON string is invalid with respect to TeamResponse
  */
  public static TeamResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamResponse.class);
  }

 /**
  * Convert an instance of TeamResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


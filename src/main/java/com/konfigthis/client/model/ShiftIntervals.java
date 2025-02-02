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
import com.konfigthis.client.model.ShiftInterval;
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
 * ShiftIntervals
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ShiftIntervals {
  public static final String SERIALIZED_NAME_MON = "mon";
  @SerializedName(SERIALIZED_NAME_MON)
  private ShiftInterval mon;

  public static final String SERIALIZED_NAME_TUE = "tue";
  @SerializedName(SERIALIZED_NAME_TUE)
  private ShiftInterval tue;

  public static final String SERIALIZED_NAME_WED = "wed";
  @SerializedName(SERIALIZED_NAME_WED)
  private ShiftInterval wed;

  public static final String SERIALIZED_NAME_THU = "thu";
  @SerializedName(SERIALIZED_NAME_THU)
  private ShiftInterval thu;

  public static final String SERIALIZED_NAME_FRI = "fri";
  @SerializedName(SERIALIZED_NAME_FRI)
  private ShiftInterval fri;

  public static final String SERIALIZED_NAME_SAT = "sat";
  @SerializedName(SERIALIZED_NAME_SAT)
  private ShiftInterval sat;

  public static final String SERIALIZED_NAME_SUN = "sun";
  @SerializedName(SERIALIZED_NAME_SUN)
  private ShiftInterval sun;

  public ShiftIntervals() {
  }

  public ShiftIntervals mon(ShiftInterval mon) {
    
    
    
    
    this.mon = mon;
    return this;
  }

   /**
   * Get mon
   * @return mon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShiftInterval getMon() {
    return mon;
  }


  public void setMon(ShiftInterval mon) {
    
    
    
    this.mon = mon;
  }


  public ShiftIntervals tue(ShiftInterval tue) {
    
    
    
    
    this.tue = tue;
    return this;
  }

   /**
   * Get tue
   * @return tue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShiftInterval getTue() {
    return tue;
  }


  public void setTue(ShiftInterval tue) {
    
    
    
    this.tue = tue;
  }


  public ShiftIntervals wed(ShiftInterval wed) {
    
    
    
    
    this.wed = wed;
    return this;
  }

   /**
   * Get wed
   * @return wed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShiftInterval getWed() {
    return wed;
  }


  public void setWed(ShiftInterval wed) {
    
    
    
    this.wed = wed;
  }


  public ShiftIntervals thu(ShiftInterval thu) {
    
    
    
    
    this.thu = thu;
    return this;
  }

   /**
   * Get thu
   * @return thu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShiftInterval getThu() {
    return thu;
  }


  public void setThu(ShiftInterval thu) {
    
    
    
    this.thu = thu;
  }


  public ShiftIntervals fri(ShiftInterval fri) {
    
    
    
    
    this.fri = fri;
    return this;
  }

   /**
   * Get fri
   * @return fri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShiftInterval getFri() {
    return fri;
  }


  public void setFri(ShiftInterval fri) {
    
    
    
    this.fri = fri;
  }


  public ShiftIntervals sat(ShiftInterval sat) {
    
    
    
    
    this.sat = sat;
    return this;
  }

   /**
   * Get sat
   * @return sat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShiftInterval getSat() {
    return sat;
  }


  public void setSat(ShiftInterval sat) {
    
    
    
    this.sat = sat;
  }


  public ShiftIntervals sun(ShiftInterval sun) {
    
    
    
    
    this.sun = sun;
    return this;
  }

   /**
   * Get sun
   * @return sun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShiftInterval getSun() {
    return sun;
  }


  public void setSun(ShiftInterval sun) {
    
    
    
    this.sun = sun;
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
   * @return the ShiftIntervals instance itself
   */
  public ShiftIntervals putAdditionalProperty(String key, Object value) {
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
    ShiftIntervals shiftIntervals = (ShiftIntervals) o;
    return Objects.equals(this.mon, shiftIntervals.mon) &&
        Objects.equals(this.tue, shiftIntervals.tue) &&
        Objects.equals(this.wed, shiftIntervals.wed) &&
        Objects.equals(this.thu, shiftIntervals.thu) &&
        Objects.equals(this.fri, shiftIntervals.fri) &&
        Objects.equals(this.sat, shiftIntervals.sat) &&
        Objects.equals(this.sun, shiftIntervals.sun)&&
        Objects.equals(this.additionalProperties, shiftIntervals.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mon, tue, wed, thu, fri, sat, sun, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftIntervals {\n");
    sb.append("    mon: ").append(toIndentedString(mon)).append("\n");
    sb.append("    tue: ").append(toIndentedString(tue)).append("\n");
    sb.append("    wed: ").append(toIndentedString(wed)).append("\n");
    sb.append("    thu: ").append(toIndentedString(thu)).append("\n");
    sb.append("    fri: ").append(toIndentedString(fri)).append("\n");
    sb.append("    sat: ").append(toIndentedString(sat)).append("\n");
    sb.append("    sun: ").append(toIndentedString(sun)).append("\n");
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
    openapiFields.add("mon");
    openapiFields.add("tue");
    openapiFields.add("wed");
    openapiFields.add("thu");
    openapiFields.add("fri");
    openapiFields.add("sat");
    openapiFields.add("sun");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShiftIntervals
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShiftIntervals.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShiftIntervals is not found in the empty JSON string", ShiftIntervals.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `mon`
      if (jsonObj.get("mon") != null && !jsonObj.get("mon").isJsonNull()) {
        ShiftInterval.validateJsonObject(jsonObj.getAsJsonObject("mon"));
      }
      // validate the optional field `tue`
      if (jsonObj.get("tue") != null && !jsonObj.get("tue").isJsonNull()) {
        ShiftInterval.validateJsonObject(jsonObj.getAsJsonObject("tue"));
      }
      // validate the optional field `wed`
      if (jsonObj.get("wed") != null && !jsonObj.get("wed").isJsonNull()) {
        ShiftInterval.validateJsonObject(jsonObj.getAsJsonObject("wed"));
      }
      // validate the optional field `thu`
      if (jsonObj.get("thu") != null && !jsonObj.get("thu").isJsonNull()) {
        ShiftInterval.validateJsonObject(jsonObj.getAsJsonObject("thu"));
      }
      // validate the optional field `fri`
      if (jsonObj.get("fri") != null && !jsonObj.get("fri").isJsonNull()) {
        ShiftInterval.validateJsonObject(jsonObj.getAsJsonObject("fri"));
      }
      // validate the optional field `sat`
      if (jsonObj.get("sat") != null && !jsonObj.get("sat").isJsonNull()) {
        ShiftInterval.validateJsonObject(jsonObj.getAsJsonObject("sat"));
      }
      // validate the optional field `sun`
      if (jsonObj.get("sun") != null && !jsonObj.get("sun").isJsonNull()) {
        ShiftInterval.validateJsonObject(jsonObj.getAsJsonObject("sun"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShiftIntervals.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShiftIntervals' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShiftIntervals> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShiftIntervals.class));

       return (TypeAdapter<T>) new TypeAdapter<ShiftIntervals>() {
           @Override
           public void write(JsonWriter out, ShiftIntervals value) throws IOException {
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
           public ShiftIntervals read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShiftIntervals instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShiftIntervals given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShiftIntervals
  * @throws IOException if the JSON string is invalid with respect to ShiftIntervals
  */
  public static ShiftIntervals fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShiftIntervals.class);
  }

 /**
  * Convert an instance of ShiftIntervals to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


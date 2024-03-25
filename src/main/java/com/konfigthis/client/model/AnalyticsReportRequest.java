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
import com.konfigthis.client.model.AnalyticsMetricId;
import com.konfigthis.client.model.TCIAIds;
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
 * AnalyticsReportRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnalyticsReportRequest {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Double start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Double end;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private TCIAIds filters;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<AnalyticsMetricId> metrics = new ArrayList<>();

  public AnalyticsReportRequest() {
  }

  public AnalyticsReportRequest start(Double start) {
    
    
    
    
    this.start = start;
    return this;
  }

  public AnalyticsReportRequest start(Integer start) {
    
    
    
    
    this.start = start.doubleValue();
    return this;
  }

   /**
   * Start time of the data to include in the export (seconds since 1970-01-01T00:00:00+00). Will be rounded down to the start of the day.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Start time of the data to include in the export (seconds since 1970-01-01T00:00:00+00). Will be rounded down to the start of the day.")

  public Double getStart() {
    return start;
  }


  public void setStart(Double start) {
    
    
    
    this.start = start;
  }


  public AnalyticsReportRequest end(Double end) {
    
    
    
    
    this.end = end;
    return this;
  }

  public AnalyticsReportRequest end(Integer end) {
    
    
    
    
    this.end = end.doubleValue();
    return this;
  }

   /**
   * End time of the data to include in the export (seconds since 1970-01-01T00:00:00+00). Will be rounded up to the end of the day.
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "End time of the data to include in the export (seconds since 1970-01-01T00:00:00+00). Will be rounded up to the end of the day.")

  public Double getEnd() {
    return end;
  }


  public void setEnd(Double end) {
    
    
    
    this.end = end;
  }


  public AnalyticsReportRequest timezone(String timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * [IANA name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the timezone to format the dates with. If omitted, the export will use Etc/UTC.
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[IANA name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the timezone to format the dates with. If omitted, the export will use Etc/UTC.")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    
    
    
    this.timezone = timezone;
  }


  public AnalyticsReportRequest filters(TCIAIds filters) {
    
    
    
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TCIAIds getFilters() {
    return filters;
  }


  public void setFilters(TCIAIds filters) {
    
    
    
    this.filters = filters;
  }


  public AnalyticsReportRequest metrics(List<AnalyticsMetricId> metrics) {
    
    
    
    
    this.metrics = metrics;
    return this;
  }

  public AnalyticsReportRequest addMetricsItem(AnalyticsMetricId metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * List of the metrics required.
   * @return metrics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of the metrics required.")

  public List<AnalyticsMetricId> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<AnalyticsMetricId> metrics) {
    
    
    
    this.metrics = metrics;
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
   * @return the AnalyticsReportRequest instance itself
   */
  public AnalyticsReportRequest putAdditionalProperty(String key, Object value) {
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
    AnalyticsReportRequest analyticsReportRequest = (AnalyticsReportRequest) o;
    return Objects.equals(this.start, analyticsReportRequest.start) &&
        Objects.equals(this.end, analyticsReportRequest.end) &&
        Objects.equals(this.timezone, analyticsReportRequest.timezone) &&
        Objects.equals(this.filters, analyticsReportRequest.filters) &&
        Objects.equals(this.metrics, analyticsReportRequest.metrics)&&
        Objects.equals(this.additionalProperties, analyticsReportRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, timezone, filters, metrics, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsReportRequest {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("timezone");
    openapiFields.add("filters");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("end");
    openapiRequiredFields.add("metrics");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnalyticsReportRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnalyticsReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyticsReportRequest is not found in the empty JSON string", AnalyticsReportRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnalyticsReportRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        TCIAIds.validateJsonObject(jsonObj.getAsJsonObject("filters"));
      }
      // ensure the required json array is present
      if (jsonObj.get("metrics") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyticsReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyticsReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyticsReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyticsReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyticsReportRequest>() {
           @Override
           public void write(JsonWriter out, AnalyticsReportRequest value) throws IOException {
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
           public AnalyticsReportRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnalyticsReportRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AnalyticsReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyticsReportRequest
  * @throws IOException if the JSON string is invalid with respect to AnalyticsReportRequest
  */
  public static AnalyticsReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyticsReportRequest.class);
  }

 /**
  * Convert an instance of AnalyticsReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


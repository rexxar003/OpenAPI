/*
 * API Title
 * OpenAPI for Todolist RESTful API
 *
 * OpenAPI spec version: 2.0
 * Contact: kanza.az.zahrawani28@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-23T03:44:14.841354269Z[GMT]")

public class InlineResponse200 {
  @SerializedName("succes")
  private Boolean succes = null;

  public InlineResponse200 succes(Boolean succes) {
    this.succes = succes;
    return this;
  }

   /**
   * Get succes
   * @return succes
  **/
  @Schema(description = "")
  public Boolean isSucces() {
    return succes;
  }

  public void setSucces(Boolean succes) {
    this.succes = succes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.succes, inlineResponse200.succes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(succes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    succes: ").append(toIndentedString(succes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

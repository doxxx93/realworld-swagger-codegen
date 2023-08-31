package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenericErrorModelErrors
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-31T04:49:45.091618529Z[GMT]")


public class GenericErrorModelErrors   {
  @JsonProperty("body")
  @Valid
  private List<String> body = new ArrayList<String>();

  public GenericErrorModelErrors body(List<String> body) {
    this.body = body;
    return this;
  }

  public GenericErrorModelErrors addBodyItem(String bodyItem) {
    this.body.add(bodyItem);
    return this;
  }

  /**
   * Get body
   * @return body
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getBody() {
    return body;
  }

  public void setBody(List<String> body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericErrorModelErrors genericErrorModelErrors = (GenericErrorModelErrors) o;
    return Objects.equals(this.body, genericErrorModelErrors.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericErrorModelErrors {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

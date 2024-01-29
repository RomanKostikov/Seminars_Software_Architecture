package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OS
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-08T16:27:47.853155125Z[GMT]")


public class OS   {
  @JsonProperty("os_id")
  private String osId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("os_group")
  private String osGroup = null;

  @JsonProperty("os_version")
  private String osVersion = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("price")
  private String price = null;

  public OS osId(String osId) {
    this.osId = osId;
    return this;
  }

  /**
   * ID операционки
   * @return osId
   **/
  @Schema(example = "f102b615", required = true, description = "ID операционки")
      @NotNull

    public String getOsId() {
    return osId;
  }

  public void setOsId(String osId) {
    this.osId = osId;
  }

  public OS name(String name) {
    this.name = name;
    return this;
  }

  /**
   * название операционки
   * @return name
   **/
  @Schema(example = "Linux", required = true, description = "название операционки")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OS osGroup(String osGroup) {
    this.osGroup = osGroup;
    return this;
  }

  /**
   * название семейства ОS
   * @return osGroup
   **/
  @Schema(example = "Ubuntu", required = true, description = "название семейства ОS")
      @NotNull

    public String getOsGroup() {
    return osGroup;
  }

  public void setOsGroup(String osGroup) {
    this.osGroup = osGroup;
  }

  public OS osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * версия ОS
   * @return osVersion
   **/
  @Schema(example = "10.5", required = true, description = "версия ОS")
      @NotNull

    public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public OS language(String language) {
    this.language = language;
    return this;
  }

  /**
   * язык ОS
   * @return language
   **/
  @Schema(example = "rus", required = true, description = "язык ОS")
      @NotNull

    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public OS price(String price) {
    this.price = price;
    return this;
  }

  /**
   * цена использования ОS
   * @return price
   **/
  @Schema(example = "200.5", required = true, description = "цена использования ОS")
      @NotNull

    public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OS OS = (OS) o;
    return Objects.equals(this.osId, OS.osId) &&
        Objects.equals(this.name, OS.name) &&
        Objects.equals(this.osGroup, OS.osGroup) &&
        Objects.equals(this.osVersion, OS.osVersion) &&
        Objects.equals(this.language, OS.language) &&
        Objects.equals(this.price, OS.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osId, name, osGroup, osVersion, language, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OS {\n");
    
    sb.append("    osId: ").append(toIndentedString(osId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osGroup: ").append(toIndentedString(osGroup)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

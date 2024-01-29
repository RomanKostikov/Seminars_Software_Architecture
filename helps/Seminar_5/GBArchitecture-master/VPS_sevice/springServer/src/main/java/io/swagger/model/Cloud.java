package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cloud
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-08T16:27:47.853155125Z[GMT]")


public class Cloud   {
  @JsonProperty("cloud_id")
  private String cloudId = null;

  @JsonProperty("client_id")
  private String clientId = null;

  /**
   * Операционная система сервера
   */
  public enum OSEnum {
    WINDOWS("Windows"),
    
    LINUX("Linux");

    private String value;

    OSEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OSEnum fromValue(String text) {
      for (OSEnum b : OSEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("OS")
  private OSEnum OS = null;

  @JsonProperty("RAM")
  private String RAM = null;

  @JsonProperty("CPU")
  private String CPU = null;

  public Cloud cloudId(String cloudId) {
    this.cloudId = cloudId;
    return this;
  }

  /**
   * ID облака
   * @return cloudId
   **/
  @Schema(example = "f102b615", description = "ID облака")
  
    public String getCloudId() {
    return cloudId;
  }

  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }

  public Cloud clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * ID клиента
   * @return clientId
   **/
  @Schema(description = "ID клиента")
  
    public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Cloud OS(OSEnum OS) {
    this.OS = OS;
    return this;
  }

  /**
   * Операционная система сервера
   * @return OS
   **/
  @Schema(required = true, description = "Операционная система сервера")
      @NotNull

    public OSEnum getOS() {
    return OS;
  }

  public void setOS(OSEnum OS) {
    this.OS = OS;
  }

  public Cloud RAM(String RAM) {
    this.RAM = RAM;
    return this;
  }

  /**
   * Объем оперативной памяти
   * @return RAM
   **/
  @Schema(example = "128", required = true, description = "Объем оперативной памяти")
      @NotNull

    public String getRAM() {
    return RAM;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  public Cloud CPU(String CPU) {
    this.CPU = CPU;
    return this;
  }

  /**
   * количество ядер процессора
   * @return CPU
   **/
  @Schema(example = "16", required = true, description = "количество ядер процессора")
      @NotNull

    public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cloud cloud = (Cloud) o;
    return Objects.equals(this.cloudId, cloud.cloudId) &&
        Objects.equals(this.clientId, cloud.clientId) &&
        Objects.equals(this.OS, cloud.OS) &&
        Objects.equals(this.RAM, cloud.RAM) &&
        Objects.equals(this.CPU, cloud.CPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudId, clientId, OS, RAM, CPU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    RAM: ").append(toIndentedString(RAM)).append("\n");
    sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
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

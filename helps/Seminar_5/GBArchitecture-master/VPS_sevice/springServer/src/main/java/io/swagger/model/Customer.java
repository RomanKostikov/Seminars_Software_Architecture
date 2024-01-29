package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-08T16:27:47.853155125Z[GMT]")


public class Customer   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("balance")
  private String balance = null;

  public Customer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "135", required = true, description = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "YouJhin", required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Ваш логин в ситеме
   * @return login
   **/
  @Schema(example = "qwerty", required = true, description = "Ваш логин в ситеме")
      @NotNull

    public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public Customer password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Ваш пароль
   * @return password
   **/
  @Schema(example = "оченьмноготекстасциферками", required = true, description = "Ваш пароль")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Ваш телефон
   * @return phone
   **/
  @Schema(example = "880077777", required = true, description = "Ваш телефон")
      @NotNull

    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Ваша почта
   * @return email
   **/
  @Schema(example = "user@mail.com", required = true, description = "Ваша почта")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer balance(String balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Ваш баланс на сервисе
   * @return balance
   **/
  @Schema(example = "1 000 000 $", required = true, description = "Ваш баланс на сервисе")
      @NotNull

    public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.login, customer.login) &&
        Objects.equals(this.password, customer.password) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.balance, customer.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, login, password, phone, email, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

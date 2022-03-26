package com.globant.tc.scooter.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Account
 */
@Entity

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-20T04:57:43.215273600+05:00[Asia/Karachi]")
public class Account   {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String mercado_pago_account;

  @JsonProperty("balance")
  private Double balance;

  @JsonProperty("active")
  private Boolean active;

  public Account balance(Double balance) {
    this.balance = balance;
    return this;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMercado_pago_account() {
    return mercado_pago_account;
  }

  public void setMercado_pago_account(String mercado_pago_account) {
    this.mercado_pago_account = mercado_pago_account;
  }

  /**
   * Get balance
   * @return balance
  */
  @ApiModelProperty(value = "")


  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public Account active(Boolean active) {
    this.active = active;
    return this;
  }


  /**
   * Get active
   * @return active
  */
  @ApiModelProperty(value = "")


  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.active, account.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
}


package com.globant.tc.scooter.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Positive;
import java.util.Objects;

/**
 * InlineObject1
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-20T04:57:43.215273600+05:00[Asia/Karachi]")
@Entity(name ="account_credit")
public class InlineObject1   {

  @Id
  @JsonProperty("accountId")
  private Integer accountId;

  @JsonProperty("credits")
  @Positive
  private Double credits;

  public InlineObject1 accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  @ApiModelProperty(value = "")


  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public InlineObject1 credits(Double credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
  */
  @ApiModelProperty(value = "")


  public Double getCredits() {
    return credits;
  }

  public void setCredits(Double credits) {
    this.credits = credits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(this.accountId, inlineObject1.accountId) &&
        Objects.equals(this.credits, inlineObject1.credits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, credits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
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


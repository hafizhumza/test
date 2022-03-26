package com.globant.tc.scooter.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Objects;

/**
 * InlineObject
 */
@Entity(name = "Accounts_Users")
//@IdClass(InlineObjectId.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-20T04:57:43.215273600+05:00[Asia/Karachi]")
public class InlineObject   {
//  @Id
//  @JsonProperty("userId")
//  @Column(name = "user_id")
//  private Integer userId;
//
//  @JsonProperty("account")
//  @Id
////  @ManyToOne(targetEntity = Account.class)
////  @JoinColumn(name = "account_id")
//   private Account account;
  @EmbeddedId
  @JsonUnwrapped
  private inlineObjectEmbeddedId id;

//  public InlineObject userId(Integer userId) {
//    this.userId = userId;
//    return this;
//  }
//
//  /**
//   * Get userId
//   * @return userId
//  */
//  @ApiModelProperty(value = "")
//
//
//  public Integer getUserId() {
//    return userId;
//  }
//
//  public void setUserId(Integer userId) {
//    this.userId = userId;
//  }
//
//  public InlineObject account(Account account) {
//    this.account = account;
//    return this;
//  }
//
//  /**
//   * Get account
//   * @return account
//  */
//  @ApiModelProperty(value = "")
//
//  @Valid
//
//  public Account getAccount() {
//    return account;
//  }
//
//  public void setAccount(Account account) {
//    this.account = account;
//  }
//
//
//  @Override
//  public boolean equals(Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//      return false;
//    }
//    InlineObject inlineObject = (InlineObject) o;
//    return Objects.equals(this.userId, inlineObject.userId) &&
//        Objects.equals(this.account, inlineObject.account);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(userId, account);
//  }
//
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("class InlineObject {\n");
//
//    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
//    sb.append("    account: ").append(toIndentedString(account)).append("\n");
//    sb.append("}");
//    return sb.toString();
//  }
//
//  /**
//   * Convert the given object to string with each line indented by 4 spaces
//   * (except the first line).
//   */
//  private String toIndentedString(Object o) {
//    if (o == null) {
//      return "null";
//    }
//    return o.toString().replace("\n", "\n    ");
//  }

  // new implementation
//
//  public InlineObject userId(Integer userId) {
//    this.id.setUserId(userId);
//    return this;
//  }
//
//  /**
//   * Get userId
//   * @return userId
//  */
//  @ApiModelProperty(value = "")
//
//
//  public Integer getUserId() {
//    return id.getUserId();
//  }
//
//  public void setUserId(Integer userId) {
//    this.id.setUserId(userId);
//  }
//
//  public InlineObject account(Account account) {
//    this.setAccount(account) ;
//    return this;
//  }
//
//  /**
//   * Get account
//   * @return account
//  */
//  @ApiModelProperty(value = "")
//
//  @Valid
//
//  public Account getAccount() {
//    return id.getAccount();
//  }
//
//  public void setAccount(Account account) {
//    this.setAccount(account);
//  }


  public inlineObjectEmbeddedId getId() {
    return id;
  }

  public void setId(inlineObjectEmbeddedId id) {
    this.id = id;
  }
//
//
//
//  @Override
//  public boolean equals(Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//      return false;
//    }
//    InlineObject inlineObject = (InlineObject) o;
//    return Objects.equals(this.getUserId(), inlineObject.getUserId()) &&
//        Objects.equals(this.getAccount(), inlineObject.getAccount());
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(id.getUserId(), id.getAccount());
//  }
//
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("class InlineObject {\n");
//
//    sb.append("    userId: ").append(toIndentedString(id.getUserId())).append("\n");
//    sb.append("    account: ").append(toIndentedString(id.getAccount())).append("\n");
//    sb.append("}");
//    return sb.toString();
//  }
//
//  /**
//   * Convert the given object to string with each line indented by 4 spaces
//   * (except the first line).
//   */
//  private String toIndentedString(Object o) {
//    if (o == null) {
//      return "null";
//    }
//    return o.toString().replace("\n", "\n    ");
//  }
}


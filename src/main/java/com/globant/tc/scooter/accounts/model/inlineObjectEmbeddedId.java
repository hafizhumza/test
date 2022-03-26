package com.globant.tc.scooter.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class inlineObjectEmbeddedId implements Serializable{

        @JsonProperty("userId")
        @Column(name = "user_id")
        private Integer userId;

        @JsonProperty("account")
        @ManyToOne(targetEntity = Account.class)
        @JoinColumn(name = "account_id")
        private Account account;

}

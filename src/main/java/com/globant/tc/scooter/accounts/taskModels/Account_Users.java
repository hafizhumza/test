//package com.globant.tc.scooter.accounts.taskModels;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Account_Users {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;
//
//    private Integer user_id;
//
//    @ManyToOne(targetEntity = Account.class)
//    @JoinColumn(name = "account_id", nullable = false)
//    private Account account; ;
//
//}

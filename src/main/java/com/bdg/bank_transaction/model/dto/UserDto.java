package com.bdg.bank_transaction.model.dto;

import com.bdg.bank_transaction.constant.Role;
import com.bdg.bank_transaction.model.entity.Accounts;
import com.bdg.bank_transaction.model.entity.Transaction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {


    private Long id;

    private String firstName;
    private String lastName;

    private String email;
    private String password;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

}

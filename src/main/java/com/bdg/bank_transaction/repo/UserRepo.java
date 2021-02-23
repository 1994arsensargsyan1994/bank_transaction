package com.bdg.bank_transaction.repo;

import com.bdg.bank_transaction.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

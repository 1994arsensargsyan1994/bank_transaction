package com.bdg.bank_transaction.controller;


import com.bdg.bank_transaction.mapper.CategoryMapper;
import com.bdg.bank_transaction.model.dto.UserDto;
import com.bdg.bank_transaction.model.entity.User;
import com.bdg.bank_transaction.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {


    private final UserRepo userRepo;
    private final CategoryMapper mapper;


    @Autowired
    public UserController(UserRepo userRepo, CategoryMapper mapper) {
        this.userRepo = userRepo;
        this.mapper = mapper;
    }

    @PutMapping("/registration")
    public ResponseEntity<User> register(@RequestBody UserDto userDto){

        User user = mapper.toEntity(userDto);

        User save = userRepo.save(user);
         return  ResponseEntity.ok(save);
    }
}

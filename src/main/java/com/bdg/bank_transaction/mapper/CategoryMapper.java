package com.bdg.bank_transaction.mapper;


import com.bdg.bank_transaction.model.dto.UserDto;
import com.bdg.bank_transaction.model.entity.User;
import org.springframework.stereotype.Component;

@org.mapstruct.Mapper(componentModel = "spring")
@Component
public interface CategoryMapper extends Mapper<User, UserDto> {
}

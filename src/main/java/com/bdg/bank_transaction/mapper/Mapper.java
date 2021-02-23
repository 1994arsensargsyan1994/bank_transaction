package com.bdg.bank_transaction.mapper;

import java.util.List;
import java.util.Set;

interface Mapper<Entity, Dto> {

    Dto toDto(Entity entity);

    Entity toEntity(Dto dto);

    List<Dto> toDtoList(List<Entity> entity);

    List<Entity> toEntityList(List<Dto> dto);


    Set<Dto> toDtoSet(Set<Entity> entity);

    Set<Entity> toEntitySet(Set<Dto> dto);
}

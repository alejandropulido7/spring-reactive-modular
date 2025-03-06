package com.events.event;

import org.mapstruct.Mapper;


@Mapper
public interface EventEntityTransformer {

    EventEntity domainToEntity(Event event);
    Event entityToDomain(EventEntity eventEntity);
}

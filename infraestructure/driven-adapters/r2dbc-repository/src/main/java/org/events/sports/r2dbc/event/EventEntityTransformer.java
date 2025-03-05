package org.events.sports.r2dbc.event;

import com.events.sports.domain.model.event.Event;
import org.mapstruct.Mapper;


@Mapper
public interface EventEntityTransformer {

    EventEntity domainToEntity(Event event);
    Event entityToDomain(EventEntity eventEntity);
}

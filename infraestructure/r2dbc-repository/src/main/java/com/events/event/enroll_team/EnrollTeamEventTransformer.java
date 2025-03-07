package com.events.event.enroll_team;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface EnrollTeamEventTransformer {

    EnrollTeamEventEntity domainToEntity(EnrollTeamEvent enrollTeamEvent);
    EnrollTeamEvent entityToDomain(EnrollTeamEventEntity enrollTeamEvent);
}

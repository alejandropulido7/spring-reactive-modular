package org.events.sports.r2dbc.event.enroll_team;

import com.events.sports.domain.model.event.enroll_team.EnrollTeamEvent;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface EnrollTeamEventTransformer {

    EnrollTeamEventEntity domainToEntity(EnrollTeamEvent enrollTeamEvent);
    EnrollTeamEvent entityToDomain(EnrollTeamEventEntity enrollTeamEvent);
}

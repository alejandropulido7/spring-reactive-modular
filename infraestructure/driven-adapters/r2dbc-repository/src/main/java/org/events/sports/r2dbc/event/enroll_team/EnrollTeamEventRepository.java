package org.events.sports.r2dbc.event.enroll_team;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollTeamEventRepository extends ReactiveCrudRepository<EnrollTeamEventEntity, Long> {
}

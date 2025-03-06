package com.events.event.enroll_team;

import com.events.sports.domain.model.event.enroll_team.EnrollTeamEvent;
import com.events.sports.domain.model.event.enroll_team.EnrollTeamEventGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class EnrollTeamEventRepositoryAdapter implements EnrollTeamEventGateway {

    private final EnrollTeamEventRepository enrollTeamEventRepository;
    private final EnrollTeamEventTransformer enrollTeamEventTransformer;

    @Override
    public Mono<EnrollTeamEvent> enrollTeamToEvent(EnrollTeamEvent enrollTeamEvent) {
        return enrollTeamEventRepository.save(enrollTeamEventTransformer.domainToEntity(enrollTeamEvent))
                .map(enrollTeamEventTransformer::entityToDomain);
    }
}

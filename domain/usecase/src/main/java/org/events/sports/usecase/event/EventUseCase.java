package org.events.sports.usecase.event;


import lombok.RequiredArgsConstructor;
import org.events.sports.domain.event.EventGateway;
import org.events.sports.domain.event.enroll_team.EnrollTeamEventGateway;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class EventUseCase {
    private final EventGateway eventGateway;
    private final EnrollTeamEventGateway enrollTeamEventGateway;

    public Mono<Event> registerEvent(Event event){
        return eventGateway.registerEvent(event)
                .flatMap(eventRegistered -> Flux.fromIterable(event.getTeams())
                        .flatMap(teamDTO -> {
                            EnrollTeamEvent enrollTeamEvent = EnrollTeamEvent.builder()
                                    .idEvent(event.getId())
                                    .idTeam(teamDTO.getId())
                                    .status("ACTIVE")
                                    .build();
                            return enrollTeamEventGateway.enrollTeamToEvent(enrollTeamEvent);
                        })
                        .collectList()
                        .flatMap(enrollTeamEventRegistered -> eventGateway.getEventById(enrollTeamEventRegistered.get(0).getIdEvent()))
                );
    }
}

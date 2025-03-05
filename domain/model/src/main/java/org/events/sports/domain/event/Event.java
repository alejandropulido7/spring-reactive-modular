package org.events.sports.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.events.sports.domain.team.Team;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    private Long id;
    private String name;
    private LocalDateTime dateEvent;
    private String sport;
    private String location;
    private boolean status;
    private List<Team> teams;
}

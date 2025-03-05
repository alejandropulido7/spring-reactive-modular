package org.events.sports.web.event;

import org.events.sports.web.team.TeamDTO;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class EventDTO {
    private Long id;
    private String name;
    private LocalDateTime dateEvent;
    private String sport;
    private String location;
    private boolean status;
    private List<TeamDTO> teams;
}

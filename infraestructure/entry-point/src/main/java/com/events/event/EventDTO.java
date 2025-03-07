package com.events.event;

import com.events.team.TeamDTO;
import lombok.Data;

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

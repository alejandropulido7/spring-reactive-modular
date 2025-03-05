package org.events.sports.domain.event.enroll_team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnrollTeamEvent {
    private Long id;
    private Long idEvent;
    private Long idTeam;
    private String status;
}

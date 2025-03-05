package org.events.sports.r2dbc.event.enroll_team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table("events_teams")
public class EnrollTeamEventEntity {

    @Id
    private Long id;
    @Column("event_id")
    private Long idEvent;
    @Column("team_id")
    private Long idTeam;
    private String status;
}

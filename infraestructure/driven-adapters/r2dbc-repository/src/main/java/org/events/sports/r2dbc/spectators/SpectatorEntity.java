package org.events.sports.r2dbc.spectators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table("spectators")
public class SpectatorEntity {

    @Id
    private Long id;
    private String name;
    private String email;
}

package org.events.sports.domain.spectator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Spectator {
    private Long id;
    private String name;
    private String email;
}

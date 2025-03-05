package org.events.sports.web.spectator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/spectator")
public class SpectatorService {

    @PostMapping
    public Mono<SpectatorDTO> registerSpectator(SpectatorDTO spectatorDTO){
        return Mono.empty();
    }

    @PostMapping("/cancel-spot")
    public Mono<SpectatorDTO> cancelSpotAndStatus(SpectatorDTO spectatorDTO){
        return Mono.empty();
    }
}

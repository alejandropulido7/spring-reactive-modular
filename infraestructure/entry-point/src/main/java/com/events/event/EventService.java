package com.events.event;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/event")
public class EventService {



    @PostMapping()
    public Mono<EventDTO> registerEvent(@RequestBody EventDTO eventDTO){
        return Mono.empty();
    }

    @GetMapping("/previuos")
    public Flux<EventDTO> getPreviousEvents(@RequestParam String sport, @RequestParam String location){
        return Flux.empty();
    }

    @GetMapping("/next")
    public Flux<EventDTO> getNextEvents(@RequestParam String sport, @RequestParam String location){
        return Flux.empty();
    }

    @GetMapping("/actives")
    public Flux<EventDTO> getActiveEvents(@RequestParam String sport, @RequestParam String location){
        return Flux.empty();
    }
}

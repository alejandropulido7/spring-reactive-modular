package com.events.sports.config;

import com.events.sports.infraestructure.repository.event.EventEntityTransformer;
import com.events.sports.infraestructure.repository.event.enroll_team.EnrollTeamEventTransformer;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransformerConfig {

    @Bean
    public EventEntityTransformer eventEntityTransformer(){
        return Mappers.getMapper(EventEntityTransformer.class);
    }

    @Bean
    public EnrollTeamEventTransformer enrollTeamEventTransformer(){
        return Mappers.getMapper(EnrollTeamEventTransformer.class);
    }
}

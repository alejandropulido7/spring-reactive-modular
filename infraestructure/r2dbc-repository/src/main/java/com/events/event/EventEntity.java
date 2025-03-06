package com.events.event;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table("events")
public class EventEntity {

    @Id
    private Long id;
    private String name;
    @Column("date_event")
    private LocalDateTime dateEvent;
    private String sport;
    private String location;
    private boolean status;
}

CREATE TABLE IF NOT EXISTS events (
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(255) UNIQUE,
    date_event TIMESTAMP NOT NULL,
    sport VARCHAR(255) UNIQUE,
    location VARCHAR(255),
    status BOOLEAN NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS teams (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(255),
    members INT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS spectators (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS events_teams(
   id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
   event_id INT NOT NULL,
   team_id INT NOT NULL,
   status VARCHAR(15),
   created_at TIMESTAMP NOT NULL DEFAULT NOW(),
   CONSTRAINT fk_events
      FOREIGN KEY(event_id)
        REFERENCES events(id),
   CONSTRAINT fk_teams
         FOREIGN KEY(team_id)
           REFERENCES teams(id)
);

CREATE TABLE IF NOT EXISTS events_spectators(
   id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
   event_id INT NOT NULL,
   spectator_id INT NOT NULL,
   status BOOLEAN NOT NULL,
   spot VARCHAR(100),
   created_at TIMESTAMP NOT NULL DEFAULT NOW(),
   CONSTRAINT fk_events
      FOREIGN KEY(event_id)
        REFERENCES events(id),
   CONSTRAINT fk_teams
         FOREIGN KEY(spectator_id)
           REFERENCES spectators(id)
);


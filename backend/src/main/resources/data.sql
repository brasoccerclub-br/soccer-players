INSERT INTO position (name, field_area) VALUES ('Goleiro', 'Defesa');
INSERT INTO position (name, field_area) VALUES ('Lateral Esquerdo', 'Defesa');
INSERT INTO position (name, field_area) VALUES ('Lateral Direito', 'Defesa');
INSERT INTO position (name, field_area) VALUES ('Zagueiro Central', 'Defesa');
INSERT INTO position (name, field_area) VALUES ('Centroavante', 'Ataque');

INSERT INTO team (name, acronym, city, state) VALUES ('Palmeiras', 'PAL', 'São Paulo', 'São Paulo');
INSERT INTO team (name, acronym, city, state) VALUES ('Corinthians', 'COR', 'São Paulo', 'São Paulo');
INSERT INTO team (name, acronym, city, state) VALUES ('São Paulo', 'SAO', 'São Paulo', 'São Paulo');
INSERT INTO team (name, acronym, city, state) VALUES ('Santos', 'SAN', 'Santos', 'São Paulo');

INSERT INTO player (name, jersey_number, birth_date, position_id, team_id) VALUES ('Weverton', 1, TIMESTAMP WITH TIME ZONE '1985-07-13T20:50:07.12345Z', 1, 1);
INSERT INTO user (first_name, last_name, email, password) VALUES ('Admin', 'Administrador', 'admin@soccerplayers.com', '$2a$10$iDteayb5QMZE4NPjbOeTzeOEVdVXu8C5Et7rBeeoyfEJw.mfdDaL6');
INSERT INTO user (first_name, last_name, email, password) VALUES ('Usuário', 'Comum', 'user@gmail.com', '$2a$10$Nkwdk8Vi0R/ZZYAYF7jumOhljtsuKTesnvaZ.eKRdIw3Y1gI8M4yi');

INSERT INTO role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO position (name, field_area) VALUES ('Goleiro', 'Defesa');
INSERT INTO position (name, field_area) VALUES ('Lateral Esquerdo', 'Defesa');
INSERT INTO position (name, field_area) VALUES ('Lateral Direito', 'Defesa');
INSERT INTO position (name, field_area) VALUES ('Zagueiro Central', 'Defesa');
INSERT INTO position (name, field_area) VALUES ('Centroavante', 'Ataque');

INSERT INTO team (name, acronym, city, state) VALUES ('Palmeiras', 'PAL', 'São Paulo', 'SP');
INSERT INTO team (name, acronym, city, state) VALUES ('Corinthians', 'COR', 'São Paulo', 'SP');
INSERT INTO team (name, acronym, city, state) VALUES ('São Paulo', 'SAO', 'São Paulo', 'SP');
INSERT INTO team (name, acronym, city, state) VALUES ('Santos', 'SAN', 'Santos', 'SP');

INSERT INTO player (name, jersey_number, birth_date, position_id, team_id) VALUES ('Weverton', 1, TIMESTAMP WITH TIME ZONE '1985-07-13T20:50:07.12345Z', 1, 1);
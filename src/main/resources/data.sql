-- Neighbours
insert into app_neighbourhood (id, name, city) values (1, 'Ramos Mejia (Norte)', 'Ramos Mejia');
insert into app_neighbourhood (id, name, city) values (2, 'Ramos Mejia (Sur)', 'Ramos Mejia');
insert into app_neighbourhood (id, name, city) values (3, 'Haedo Norte', 'Haedo');
insert into app_neighbourhood (id, name, city) values (4, 'Haedo Chico', 'Haedo');
insert into app_neighbourhood (id, name, city) values (5, 'Haedo Sur', 'Haedo');
insert into app_neighbourhood (id, name, city) values (6, 'Ituzaingo Norte', 'Ituzaingo');
insert into app_neighbourhood (id, name, city) values (7, 'Parque Leloir', 'Ituzaingo');
insert into app_neighbourhood (id, name, city) values (8, 'Ituzaingo Sur', 'Ituzaingo');
-- Houses
-- Ramos Mejia (Norte)
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (9, 1, 1, 320, 2, 1);
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (10, 2, 1, 550, 15, 1);
-- Ramos Mejia (Sur)
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (11, 3, 2, 1200, 25, 2);
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (12, 4, 2, 950, 30, 2);
-- Haedo Norte
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (13, 3, 2, 1300, 17, 3);
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (14, 4, 2, 2300, 29, 3);
-- Haedo Chico
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (15, 6, 3, 5500, 77, 4);
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (16, 6, 3, 4000, 80, 4);
-- Haedo Sur
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (17, 2, 1, 1200, 10, 5);
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (18, 2, 1, 1300, 12, 5);
-- Ituzaingo Norte
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (19, 3, 1, 1100, 12, 6);
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (20, 4, 2, 2100, 25, 6);
-- Parque Leloir
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (21, 6, 3, 4500, 40, 7);
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (22, 6, 3, 3800, 38, 7);
-- Ituzaingo Sur
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (23, 1, 1, 300, 3, 8);
insert into app_house (id, beds, baths, sqft, age, neighbourhoodid) values (24, 1, 1, 280, 1, 8);

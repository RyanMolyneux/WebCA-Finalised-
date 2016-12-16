# --- !Ups
INSERT INTO GENRE VALUES (1,'RPG');
INSERT INTO GENRE VALUES (2,'FPS');
INSERT INTO GAMES VALUES (1,'Skyrim Special Edition (Remastered)','Winner of more than 200 Game of the Year Awards, Skyrim Special Edition brings the epic fantasy to life in stunning detail.','8/10','Bethesda Game Studeios','25/12/10',25.00,true,true,false,1);
insert into user (email,name,password,role) values ( 'admin@products.com', 'Alice Admin', 'password', 'admin' );

insert into user (email,name,password,role) values ( 'manager@products.com', 'Bob Manager', 'password', 'manager' );

insert into user (email,name,password,role) values ( 'customer@products.com', 'Charlie Customer', 'password', 'customer' ); 

insert into Developpeur(ID,AVATAR, NOM)
values
(1,'chien','HELIN');
insert into Developpeur(ID,AVATAR, NOM)
values
(2,'dauphin','DEWAGHE');
insert into Developpeur(ID,AVATAR, NOM)
values
(3,'lapin','LEFEYER');


insert into Bug(ID,DATEC,DESCRIPTION,ETAT,PRIORITE,TITRE,DEVELOPPEUR_ID)
values

(1,TO_DATE('28-11-2020', 'dd-MM-yyyy'),'Pb syntaxe','TODO','HAUTE','BUG1',1);
insert into Bug(ID,DATEC,DESCRIPTION,ETAT,PRIORITE,TITRE,DEVELOPPEUR_ID)
values
(2,TO_DATE('29-12-2020', 'dd-MM-yyyy'),'Bug classique','TODO','MOYEN','BUG2',2);



insert into Commentaire(ID,DATEP,MESSAGE,DEVELOPPEUR_ID,BUG_ID)
values
(1,TO_DATE('28-11-2020', 'dd-MM-yyyy'),'Va falloir revoir vos cours de C !', 1,1);

insert into Commentaire(ID,DATEP,MESSAGE,DEVELOPPEUR_ID,BUG_ID)
values
(2,TO_DATE('26-11-2020', 'dd-MM-yyyy'),'Je vois rien !!!', 2, 2);

--('N = NP', 3, TO_DATE('27/11/2020', 'DD/MM/YYYY'), 3),
--('C\'est qui qui ne sait pas coder ?!', 4, TO_DATE('28/11/2020', 'DD/MM/YYYY'), 4);


insert into Developpeur(ID_DEV,AVATAR, NOM)
values
(1,'chien','HELIN');
insert into Developpeur(ID_DEV,AVATAR, NOM)
values
(2,'dauphin','DEWAGHE');
insert into Developpeur(ID_DEV,AVATAR, NOM)
values
(3,'lapin','LEFEYER');


insert into Bug(ID_BUG,DATEC,DESCRIPTION,ETAT,PRIORITE,TITRE,DEVELOPPEUR_ID_DEV)
values
(1,'29/11/2020','Pb syntaxe','TODO','HAUTE','BUG 1',1);
insert into Bug(ID_BUG,DATEC,DESCRIPTION,ETAT,PRIORITE,TITRE,DEVELOPPEUR_ID_DEV)
values
(2,'19/12/2020','Bug classique','TODO','MOYEN','BUG 2',2);



insert into Commentaire(ID_COM,DATEP,MESSAGE,AUTEUR_ID_DEV,BUG_ID_BUG)
values
(1,TO_DATE('28/11/2020', 'DD/MM/YYYY'),'Va falloir revoir vos cours de C !', 1,1);

insert into Commentaire(ID_COM,DATEP,MESSAGE,AUTEUR_ID_DEV,BUG_ID_BUG)
values
(2,TO_DATE('26/11/2020', 'DD/MM/YYYY'),'Je vois rien !!!', 2, 2);

--('N = NP', 3, TO_DATE('27/11/2020', 'DD/MM/YYYY'), 3),
--('C\'est qui qui ne sait pas coder ?!', 4, TO_DATE('28/11/2020', 'DD/MM/YYYY'), 4);
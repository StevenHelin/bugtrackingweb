insert into Bug(titre, description, propriete, etat)
values
('Erreur fin de ligne', 'Oublie du point-virgule', 'BASSE', 'TODO'),
('Erreur d\'affichage', 'Couleur blanche au lieu de noir', 'NORMALE', 'TODO'),
('Erreur de securite', 'Defaillance des donnees', 'HAUTE', 'TODO'),
('Erreur d\'ENT', 'Correction de l\'emploi du temps', 'BASE', 'TODO');

insert into Developpeur(nom)
values
('HELIN'),
('DEWAGHE'),
('GUERY'),
('LEFEYER');

insert into Commentaire(message, auteur, date, bug)
values
('Va falloir revoir vos cours de C !', 1, TO_DATE('28/11/2020', 'DD/MM/YYYY'), 1)
('J\'vois rien !!!', 2, TO_DATE('26/11/2020', 'DD/MM/YYYY'), 2)
('N = NP', 3, TO_DATE('27/11/2020', 'DD/MM/YYYY'), 3)
('C\'est qui qui ne sait pas coder ?!', 4, TO_DATE('28/11/2020', 'DD/MM/YYYY'), 4);
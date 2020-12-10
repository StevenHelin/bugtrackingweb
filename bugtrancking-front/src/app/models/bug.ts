export interface Developpeur
{
  id?: number;
  nom: string;
  avatar: string;
  bugs: Array<Bug>;
  commentaires: Array<Commentaire>;
}

export interface Commentaire
{
  id?: number;
  message: string;
  developpeur: Developpeur;
  dateP: Date;
  bug: Bug;
}

export interface Bug
{
  id?: number;
  description: string,
  titre: string;
  priorite: string;
  etat: string;
  dateC: Date;
  developpeur: Developpeur;
  commentaire: Array<Commentaire>;
}

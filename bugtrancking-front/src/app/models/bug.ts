export interface Bug
{
  id?: number;
  description: string,
  titre: string;
  priorite: string;
  etat: string;
  dateC: date;
  developpeur: developpeur;
  commentaire: list<commentaire>;
}

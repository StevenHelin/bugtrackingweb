export interface Bug
{
  id?: number;
  titre: string;
  priorite: string;
  etat: string;
  dateC: date;
  developpeur: developpeur;
  commentaire: list<commentaire>;
}

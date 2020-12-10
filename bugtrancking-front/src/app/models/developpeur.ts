export interface Developpeur
{
  id?: number;
  nom: string;
  avatar: string;
  bugs: list<bug>;
  commentaires: list<commentaire>;
}

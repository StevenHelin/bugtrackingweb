import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Developpeur } from '../models/developpeur';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class DeveloppeurService {

  constructor(private http: HttpClient) { }

  public getDeveloppeursList(): Observable<Developppeur[]> {
    return this.http.get<Developpeur[]>(`${environment.url}/developpeurs`);
  }

  public deleteDeveloppeur(id: number): Observable<any> {
    return this.http.delete(`${environment.url}/developpeurs/${id}`);
  }
  public createDeveloppeur(developpeur: Developpeur): Observable<Developpeur> {
    return this.http.post<Developpeur>(`${environment.url}/developpeurs`, developpeur);
  }
}

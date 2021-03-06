import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Bug } from '../models/bug';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BugsService {

  constructor(private http: HttpClient) { }

  public getBug(id: number): Observable<Bug>
  {
    return this.http.get<Bug>(`${environment.url}/bug/${id}`);
  }

  public getAllBug(): Observable<Bug[]>
  {
    return this.http.get<Bug[]>(`${environment.url}/bug`);
  }

  public deleteBug(id: number): Observable<any>
  {
    return this.http.delete(`${environment.url}/bug/${id}`);
  }

  public createBug(bug: Bug): Observable<Bug>
  {
    return this.http.post<Bug>(`${environment.url}/bug`, bug);
  }

  public getBugTitre(titre: String): Observable<Bug[]>
  {
    return this.http.get<Bug[]>(`${environment.url}/bug/titre`);
  }

  public getBugEtat(etat: String): Observable<Bug[]>
  {
    return this.http.get<Bug[]>(`${environment.url}/bug/etat`);
  }

  public getBugByDate(debut: Date, fin: Date): Observable<Bug[]>
  {
    return this.http.get<Bug[]>(`${environment.url}/bug/date`);
  }

  public replaceBugById(bug: Bug, id: number): Observable<Bug>
  {
    return this.http.put<Bug>(`${environment.url}/bug/${id}`, bug);
  }

  public ajoutDev(bug: Bug, id: number, iddev: number): Observable<Bug>
  {
    return this.http.put<Bug>(`${environment.url}/bug/${id}/dev/${iddev}`, bug);
  }
}

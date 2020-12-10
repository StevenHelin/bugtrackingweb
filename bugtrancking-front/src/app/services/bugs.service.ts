import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Bug } from '../models/bug';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BugService {

  constructor(private http: HttpClient) { }

  public getBugsList(): Observable<Bug[]> {
    return this.http.get<Bug[]>(`${environment.url}/bugs`);
  }

  public deleteBug(id: number): Observable<any> {
    return this.http.delete(`${environment.url}/bugs/${id}`);
  }
  public createBug(bug: Bug): Observable<Bug> {
    return this.http.post<Bug>(`${environment.url}/bugs`, bug);
  }
}

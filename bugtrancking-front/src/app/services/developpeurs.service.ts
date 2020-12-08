import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from '../models/developpeur';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BugService {

  constructor(private http: HttpClient) { }

  public getDeveloppeursList(): Observable<Bug[]> {
    return this.http.get<Developpeur[]>(`${environment.url}/students`);
  }

  public deleteDeveloppeur(id: number): Observable<any> {
    return this.http.delete(`${environment.url}/students/${id}`);
  }
  public createDeveloppeur(student: Student): Observable<Student> {
    return this.http.post<Student>(`${environment.url}/students`, student);
  }
}

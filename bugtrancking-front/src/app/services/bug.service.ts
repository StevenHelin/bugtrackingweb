import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from '../models/bug';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BugService {

  constructor(private http: HttpClient) { }

  public getStudentsList(): Observable<Bug[]> {
    return this.http.get<Student[]>(`${environment.url}/students`);
  }

  public deleteStudent(id: number): Observable<any> {
    return this.http.delete(`${environment.url}/students/${id}`);
  }
  public createStudent(student: Student): Observable<Student> {
    return this.http.post<Student>(`${environment.url}/students`, student);
  }
}

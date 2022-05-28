import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Skill } from '../model/skill';

@Injectable({
  providedIn: 'root'
})
export class SkillService {

  [x: string]: any;
  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http:HttpClient) { }

  public getSkill():Observable<Skill[]>{
    return this.http.get<Skill[]>(`${this.apiServerUrl}/skill/all`);
  }
  public addSkill(educacion: Skill):Observable<Skill>{
    return this.http.post<Skill>(`${this.apiServerUrl}/skill/add`,educacion);
  }
  public updateSkill(educacion: Skill):Observable<Skill>{
    return this.http.put<Skill>(`${this.apiServerUrl}/skill/update`,educacion);
  }
  public deleteSkill(skillId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/skill/delete/${skillId}`);
  }
}

import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Skill } from 'src/app/model/skill';
import { SkillService } from 'src/app/service/skill.service';

@Component({
  selector: 'app-hardskill',
  templateUrl: './hardskill.component.html',
  styleUrls: ['./hardskill.component.css']
})
export class HardskillComponent implements OnInit {

  public skills:Skill[]=[];

  constructor(private skillService: SkillService) { }

  ngOnInit(): void {
    this.getSkills();
    
  }

  public getSkills():void{
    this.skillService.getSkill().subscribe({
      next:(Response: Skill[]) =>{
        this.skills=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }
}

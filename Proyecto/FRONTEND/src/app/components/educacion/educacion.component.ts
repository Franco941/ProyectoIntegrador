import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Educacion } from 'src/app/model/education';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  public educaciones:Educacion[]=[];

  constructor(private educacionService: EducacionService) { }

  ngOnInit(): void {
    this.getEducaciones();
  }

  public getEducaciones():void{
    this.educacionService.getEducation().subscribe({
      next:(Response: Educacion[]) =>{
        this.educaciones=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

}

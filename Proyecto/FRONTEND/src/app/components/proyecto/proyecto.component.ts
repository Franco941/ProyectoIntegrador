import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Proyecto } from 'src/app/model/project';
import { ProyectoService } from 'src/app/service/proyecto.service';

@Component({
  selector: 'app-proyecto',
  templateUrl: './proyecto.component.html',
  styleUrls: ['./proyecto.component.css']
})
export class ProyectoComponent implements OnInit {

  public proyectos:Proyecto[]=[];

  constructor(private proyectoService: ProyectoService) { }

  ngOnInit(): void {
    this.getProyectos();
  }

  public getProyectos():void{
    this.proyectoService.getProject().subscribe({
      next:(Response: Proyecto[]) =>{
        this.proyectos=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

}

import { Component } from '@angular/core';
import { Funcionario } from '../../models/funcionario';
import { FuncionarioService } from '../../controllers/funcionario.service';

@Component({
  selector: 'app-funcionarios',
  imports: [],
  templateUrl: './funcionarios.html',
  styleUrl: './funcionarios.css',
})
export class Funcionarios {
  funcionarios: Funcionario[];

  constructor(private service: FuncionarioService) {
    this.funcionarios = this.service.listar();
  }
}

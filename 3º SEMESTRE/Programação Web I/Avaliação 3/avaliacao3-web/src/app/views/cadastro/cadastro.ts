import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { Cadastro as CadastroModel } from '../../models/cadastro';
import { CadastroService } from '../../controllers/cadastro.service';

@Component({
  selector: 'app-cadastro',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './cadastro.html',
  styleUrl: './cadastro.css'
})
export class CadastroComponent {

  idConsulta: number = 0;

  cadastro: CadastroModel = {
    id: 0,
    nome: '',
    departamento: '',
    endereco: '',
    email: ''
  };

  mensagem: string = '';
  corMensagem: string = '';

  constructor(private service: CadastroService) {}

  consultar(): void {

    this.service.consultar(this.idConsulta).subscribe({

      next: (retorno) => {

        this.cadastro = retorno;

        this.mensagem = '';
        this.corMensagem = '';

      },

      error: (erro: any) => {

        this.mensagem = erro.error?.mensagem || 'Ocorreu um erro ao consultar.';
        this.corMensagem = 'red';

      }

    });

  }

  excluir(): void {

    this.service.excluir(this.idConsulta).subscribe({

      next: () => {

        this.mensagem = 'Cadastro excluído com sucesso!';
        this.corMensagem = 'green';

        this.cadastro = {
          id: 0,
          nome: '',
          departamento: '',
          endereco: '',
          email: ''
        };

        this.idConsulta = 0;

      },

      error: (erro: any) => {

        this.mensagem = erro.error?.mensagem || 'Ocorreu um erro ao excluir.';
        this.corMensagem = 'red';

      }

    });

  }

  alterar(): void {

    this.service.alterar(this.cadastro).subscribe({

      next: () => {

        this.mensagem = 'Cadastro alterado com sucesso!';
        this.corMensagem = 'green';

      },

      error: (erro: any) => {

        this.mensagem = erro.error?.mensagem || 'Ocorreu um erro ao alterar.';
        this.corMensagem = 'red';

      }

    });

  }

}
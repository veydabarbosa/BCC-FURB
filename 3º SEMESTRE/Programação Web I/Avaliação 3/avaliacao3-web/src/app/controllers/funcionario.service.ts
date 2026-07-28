import { Injectable } from '@angular/core';
import { Funcionario } from '../models/funcionario';

@Injectable({ providedIn: 'root' })
export class FuncionarioService {
  private readonly funcionarios: Funcionario[] = [
    {
      id: 1,
      nome: 'Luiz Henrique',
      foto: 'https://robohash.org/praesentiumomnisdolore.png?size=150x150&set=set4',
      email: 'luiz@furb.br',
      subobjeto: { propriedade1: 'Veterinário', propriedade2: 'Clínica Geral' },
    },
    {
      id: 2,
      nome: 'Nicole Bruch',
      foto: 'https://robohash.org/explicaboenimquo.png?size=150x150&set=set4',
      email: 'nicoleb@furb.br',
      subobjeto: { propriedade1: 'Tosadora', propriedade2: 'Banho & Tosa' },
    },
    {
      id: 3,
      nome: 'Veyda Barbosa',
      foto: 'https://robohash.org/officiisconsequaturvoluptas.png?size=150x150&set=set4',
      email: 'veydab@furb.br',
      subobjeto: { propriedade1: 'Recepcionista', propriedade2: 'Atendimento' },
    },
    {
      id: 4,
      nome: 'Vitor Wöstehoff',
      foto: 'https://robohash.org/mollitiasedsunt.png?size=150x150&set=set4',
      email: 'vitor@furb.br',
      subobjeto: { propriedade1: 'Adestrador', propriedade2: 'Comportamento' },
    },
    {
      id: 5,
      nome: 'João da Silva',
      foto: 'https://robohash.org/possimusnihilnihil.png?size=150x150&set=set4',
      email: 'joao@furb.br',
      subobjeto: { propriedade1: 'Veterinário', propriedade2: 'Cirurgia' },
    },
    {
      id: 6,
      nome: 'Sabrina Sato',
      foto: 'https://robohash.org/quiscommodiullam.png?size=150x150&set=set4',
      email: 'sabrina@furb.br',
      subobjeto: { propriedade1: 'Cuidadora', propriedade2: 'Hotel Pet' },
    },
    {
      id: 7,
      nome: 'Letícia Bertoldi',
      foto: 'https://robohash.org/optioestexercitationem.png?size=150x150&set=set4',
      email: 'leticia@furb.br',
      subobjeto: { propriedade1: 'Auxiliar', propriedade2: 'Banho & Tosa' },
    },
    {
      id: 8,
      nome: 'Giovana Santana',
      foto: 'https://robohash.org/dolorfacilisquia.png?size=150x150&set=set4',
      email: 'giovana@furb.br',
      subobjeto: { propriedade1: 'Veterinária', propriedade2: 'Dermatologia' },
    },
    {
      id: 9,
      nome: 'Jaqueline Lindsey',
      foto: 'https://robohash.org/voluptatemtemporaveniam.png?size=150x150&set=set4',
      email: 'jaqueline@furb.br',
      subobjeto: { propriedade1: 'Nutricionista', propriedade2: 'Nutrição Animal' },
    },
    {
      id: 10,
      nome: 'Moisés Maré',
      foto: 'https://robohash.org/esteaquedolores.png?size=150x150&set=set4',
      email: 'moises@furb.br',
      subobjeto: { propriedade1: 'Gerente', propriedade2: 'Administração' },
    },
  ];

  listar(): Funcionario[] {
    return this.funcionarios;
  }
}

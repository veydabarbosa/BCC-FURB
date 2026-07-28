import { Routes } from '@angular/router';

import { Home } from './views/home/home';
import { Funcionarios } from './views/funcionarios/funcionarios';
import { CadastroComponent } from './views/cadastro/cadastro';

export const routes: Routes = [

  { path: '', component: Home },

  { path: 'funcionarios', component: Funcionarios },

  { path: 'cadastro', component: CadastroComponent }

];
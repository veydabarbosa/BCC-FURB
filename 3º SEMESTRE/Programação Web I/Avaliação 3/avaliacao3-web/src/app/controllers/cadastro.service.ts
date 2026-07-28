import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Cadastro } from '../models/cadastro';

@Injectable({
  providedIn: 'root'
})
export class CadastroService {

  private readonly api =
    'https://bu.furb.br/mcardoso/progWeb/apiRestAval.php/cadastro';

  constructor(private http: HttpClient) {}

  consultar(id: number): Observable<Cadastro> {

    return this.http.get<Cadastro>(`${this.api}/${id}`);

  }

  excluir(id: number): Observable<any> {

    return this.http.delete(`${this.api}/${id}`);

  }

  alterar(cadastro: Cadastro): Observable<any> {

    return this.http.put(`${this.api}/${cadastro.id}`, cadastro);

  }

}
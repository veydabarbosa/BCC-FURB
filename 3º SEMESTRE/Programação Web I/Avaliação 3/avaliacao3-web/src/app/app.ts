import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Header } from './views/header/header';
import { Menu } from './views/menu/menu';
import { Footer } from './views/footer/footer';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Header, Menu, Footer],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('avaliacao2-web');
}

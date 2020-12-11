import { DeveloppeursService } from './../services/developpeurs.service';
import { Component, OnInit } from '@angular/core';
import { Developpeur } from '../models/developpeur';
import { delay } from 'rxjs/operators';

@Component({
  selector: 'app-developpeur-list',
  templateUrl: './developpeur-list.component.html',
  styleUrls: ['./developpeur-list.component.css']
})
export class DeveloppeurListComponent implements OnInit {


  public developpeurs: Developpeur[];

  public showSpinner: boolean;

  constructor(private developpeursService: DeveloppeursService) { }

  ngOnInit(): void {
    this.showSpinner = true;
    this.developpeursService.getAllDeveloppeur()
    .pipe(delay(2000))
    .subscribe((developpeursResponse => {
      this.developpeurs = developpeursResponse;
      this.showSpinner = false;
    }));
  }

  deleteDeveloppeur(id: number): void {
    this.developpeursService.deleteDeveloppeur(id).subscribe((deleteResponse) => {
      this.developpeurs = this.developpeurs.filter(s => s.id !== id);
    }, (error) => {
      // TODO
    });
  }
  /* Callback of child component */
  createDeveloppeur(newDeveloppeur: Developpeur): void {
    this.developpeurs.push(newDeveloppeur);
  }

}

import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Developpeur } from '../models/developpeur';
import { DeveloppeurService } from './../services/developpeur.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-developpeur',
  templateUrl: './create-developpeur.component.html',
  styleUrls: ['./create-developpeur.component.css']
})
export class CreateDeveloppeurComponent implements OnInit {

  createForm: FormGroup;

    @OutPut() createEvent = new EventEmitter<Developpeur>();

    constructor(public formBuilder: FormBuilder,
                private developpeurService: DeveloppeurService) { }

    ngOnInit(): void
    {
      this.createForm = this.formBuilder.group({
        nom='',
        avatar='',
        bugs=''
      });
    }

    OnSubmit(developpeurData): void
    {
      this.createForm.reset();
      const developpeur: Developpeur =
      {
        nom: developpeurData.nom,
        avatar: developpeurData.avatar,
        bugs: developpeurData.bugs
      };
      this.developpeurData.createDeveloppeur(developpeur).subscribe((developpeurResponse) => {
        this.createEvent.emit(developpeurResponse);
      });
    }

}

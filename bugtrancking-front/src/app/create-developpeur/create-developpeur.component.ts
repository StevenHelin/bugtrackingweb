import { DeveloppeursService } from './../services/developpeurs.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Developpeur } from '../models/developpeur';
import { Router } from '@angular/router';
import { Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-create-developpeur',
  templateUrl: './create-developpeur.component.html',
  styleUrls: ['./create-developpeur.component.css']
})
export class CreateDeveloppeurComponent implements OnInit {

  createForm: FormGroup;

    @OutPut() createEvent = new EventEmitter<Developpeur>();

    constructor(public formBuilder: FormBuilder,
                private developpeursService: DeveloppeursService) { }

    ngOnInit(): void
    {
      this.createForm = this.formBuilder.group({
        nom: '',
        avatar: '',
        bugs: '',
        commentaires: ''
      });
    }

    OnSubmit(developpeurData): void
    {
      this.createForm.reset();
      const developpeur: Developpeur =
      {
        nom: developpeurData.nom,
        avatar: developpeurData.avatar,
        bugs: developpeurData.bugs,
        commentaires: developpeurData.commentaires
      };
      this.developpeursService.createDeveloppeur(developpeur).subscribe((developpeurResponse) => {
        this.createEvent.emit(developpeurResponse);
      });
    }

}

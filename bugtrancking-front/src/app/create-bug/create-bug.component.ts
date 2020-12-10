import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Bug } from '../models/bug';
import { BugService } from './../services/bugs.service';
import { Router } from '@angular/router';
import { Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-create-bug',
  templateUrl: './create-bug.component.html',
  styleUrls: ['./create-bug.component.css']
})
export class CreateBugComponent implements OnInit
{
  createForm: FormGroup;

  @OutPut() createEvent = new EventEmitter<Bug>();

  constructor(public formBuilder: FormBuilder,
              private bugService: BugService) { }

  ngOnInit(): void
  {
    this.createForm = this.formBuilder.group({
      titre: '',
      description: '',
      priorite: '',
      etat: 'TODO',
      dateC: '',
      developpeur: '',
      commentaire: ''
    });
  }

  OnSubmit(bugData): void
  {
    this.createForm.reset();
    const bug: Bug =
    {
      titre: bugData.titre,
      description: bugData.description,
      etat: bugData.etat,
      dateC : bugData.dateC,
      developpeur: bugData.developpeur,
      commentaire: bugData.commentaire
    };
    this.bugService.createBug(bug).subscribe((bugResponse) => {
      this.createEvent.emit(bugResponse);
    });
  }
}

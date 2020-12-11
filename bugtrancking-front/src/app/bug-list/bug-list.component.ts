import { BugsService } from './../services/bugs.service';
import { Component, OnInit } from '@angular/core';
import { Bug } from '../models/bug';
import { delay } from 'rxjs/operators';

@Component({
  selector: 'app-bug-list',
  templateUrl: './bug-list.component.html',
  styleUrls: ['./bug-list.component.css']
})
export class BugListComponent implements OnInit {


  public bugs: Bug[];

  public showSpinner: boolean;

  constructor(private bugsService: BugsService) { }

  ngOnInit(): void {
    this.showSpinner = true;
    this.bugsService.getAllBug()
    .pipe(delay(2000))
    .subscribe((bugsResponse => {
      this.bugs = bugsResponse;
      this.showSpinner = false;
    }));
  }

  deleteBug(id: number): void {
    this.bugsService.deleteBug(id).subscribe((deleteResponse) => {
      this.bugs = this.bugs.filter(s => s.id !== id);
    }, (error) => {
      // TODO
    });
  }
  /* Callback of child component */
  createBug(newBug: Bug): void {
    this.bugs.push(newBug);
  }

}

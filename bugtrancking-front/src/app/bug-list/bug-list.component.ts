import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bug-list',
  templateUrl: './bug-list.component.html',
  styleUrls: ['./bug-list.component.css']
})
export class BugListComponent implements OnInit {

  bugName: string = 'Bug à laver';

  constructor() { }

  ngOnInit(): void {
  }

}

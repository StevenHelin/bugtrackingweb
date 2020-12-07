import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BugListComponent } from './bug-list/bug-list.component';
import { BugDetailComponent } from './bug-list/bug-detail.component';


const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

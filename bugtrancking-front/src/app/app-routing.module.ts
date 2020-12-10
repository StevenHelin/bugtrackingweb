import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BugListComponent } from './bug-list/bug-list.component';
import { BugDetailComponent } from './bug-detail/bug-detail.component';
import { DeveloppeurListComponent } from './developpeur-list/developpeur-list.component';
import { DeveloppeurDetailComponent } from './developpeur-detail/developpeur-detail.component';


const routes: Routes = [
    {path: 'bugs', component: BugListComponent},
    {path: 'bugs/:id', component: BugDetailComponent},
    {path: 'developpeurs', component: DeveloppeurListComponent},
    {path: 'developpeurs/:id', component: DeveloppeurDetailComponent},
    {path: '', redirectTo: 'bugs', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

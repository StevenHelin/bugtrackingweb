import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BugListComponent } from './bug-list/bug-list.component';
import { DeveloppeurDetailComponent } from './developpeur-detail/developpeur-detail.component';
import { BugDetailComponent } from './bug-detail/bug-detail.component';
import { CreateBugComponent } from './create-bug/create-bug.component';
import { CreateDeveloppeurComponent } from './create-developpeur/create-developpeur.component';

@NgModule({
  declarations: [
    AppComponent,
    BugListComponent,
    DeveloppeurDetailComponent,
    BugDetailComponent,
    CreateBugComponent,
    CreateDeveloppeurComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

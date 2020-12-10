import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BugListComponent } from './bug-list/bug-list.component';
import { DeveloppeurListComponent } from './developpeur-list/developpeur-list.component';
import { HttpClientModule } from '@angular/common/http';
import { CreateBugComponent } from './create-bug/create-bug.component';
import { CreateDeveloppeurComponent } from './create-developpeur/create-developpeur.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BugDetailComponent } from './bug-detail/bug-detail.component';
import { DeveloppeurDetailComponent } from './developpeur-detail/developpeur-detail.component';



@NgModule({
  declarations: [
    AppComponent,
    BugListComponent,
    DeveloppeurListComponent,
    CreateBugComponent,
    CreateDeveloppeurComponent,
    BugDetailComponent,
    DeveloppeurDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

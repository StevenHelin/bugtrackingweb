import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDeveloppeurComponent } from './create-developpeur.component';

describe('CreateDeveloppeurComponent', () => {
  let component: CreateDeveloppeurComponent;
  let fixture: ComponentFixture<CreateDeveloppeurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateDeveloppeurComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateDeveloppeurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

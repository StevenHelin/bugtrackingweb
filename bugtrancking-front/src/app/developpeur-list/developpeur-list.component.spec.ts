import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeveloppeurListComponent } from './developpeur-list.component';

describe('DeveloppeurListComponent', () => {
  let component: DeveloppeurListComponent;
  let fixture: ComponentFixture<DeveloppeurListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeveloppeurListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeveloppeurListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { DeveloppeursService } from './developpeurs.service';

describe('DeveloppeursService', () => {
  let service: DeveloppeursService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DeveloppeursService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

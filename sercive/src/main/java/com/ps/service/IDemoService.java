package com.ps.service;

import com.ps.domain.Person;
import com.ps.service.IDemoService;

class NormalDemoService implements IDemoService {
    @Override
    public Person get(int id) {
        return new Person(id, "charles`son", 4);

    }
}
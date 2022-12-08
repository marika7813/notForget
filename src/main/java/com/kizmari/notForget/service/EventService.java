package com.kizmari.notForget.service;

import com.kizmari.notForget.models.Event;
import com.kizmari.notForget.repo.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class EventService {


    @Autowired
    private IEventRepository repo;

    public List<Event> listAll() {
        return (List<Event>) repo.findAll();
    }

    public void save(Event event) {
        repo.save(event);
    }

    public Event get(Long id) {
        return repo.findById (id).get();
    }

    public void delete(Long id) {
        repo.deleteById (id);
    }


}

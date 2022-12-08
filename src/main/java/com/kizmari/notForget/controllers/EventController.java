package com.kizmari.notForget.controllers;

import com.kizmari.notForget.models.Event;
import com.kizmari.notForget.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class EventController {

    @Autowired
    private EventService service;

    /**
     * Метод извлечения/отобраажения всех событий
     *
     * @return список всех событий
     */
    @GetMapping("/events")
    public List<Event> list() {
        return service.listAll();
    }

    /**
     * Метод извлечения/отобраажения события по id
     *
     * @param id - id события
     * @return одно событие по id
     */
    @GetMapping(value = "/events/{id}")
    public ResponseEntity<Event> read(@PathVariable(name = "id") Long id) {
        final Event event = service.get(id);
        return event != null ?
                new ResponseEntity<>(event, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * Метод для добавления/вставки нового события
     *
     * @param event - событие
     */
    @PostMapping("/events")
    public void add(@RequestBody Event event) {
        service.save(event);
    }

    /**
     * Метод для обновления события по id
     *
     * @param event - событие
     * @param id     - id события
     * @return -
     */
    @PutMapping("/events/{id}")
    public ResponseEntity<?> update(@RequestBody Event event, @PathVariable Long id) {
        try {
            Event existTicket = service.get(id);
            service.save(event);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
//Приложение создано и принадлежит Киселевой Марии Александровне GitHub marika7813

    /**
     * Метод для удаления события по id
     *
     * @param id - id события
     */
    @DeleteMapping("/events/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}


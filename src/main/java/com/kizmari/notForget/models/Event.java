package com.kizmari.notForget.models;

import java.util.Calendar;

public class Event {

    private Long id;
    private Long idAuthor;
    private int category;
    private String title, comment, contact, location;
    private Calendar dateEvent, dateReminder;

    public Event () {
    }

    public Event (Long idAuthor, int category, String title, String comment, String contact, String location, Calendar dateEvent, Calendar dateReminder) {
        this.idAuthor = idAuthor;
        this.category = category;
        this.title = title;
        this.comment = comment;
        this.contact = contact;
        this.location = location;
        this.dateEvent = dateEvent;
        this.dateReminder = dateReminder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Calendar getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Calendar dateEvent) {
        this.dateEvent = dateEvent;
    }

    public Calendar getDateReminder() {
        return dateReminder;
    }

    public void setDateReminder(Calendar dateReminder) {
        this.dateReminder = dateReminder;
    }
}

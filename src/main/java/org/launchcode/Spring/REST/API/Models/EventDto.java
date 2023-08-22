package org.launchcode.Spring.REST.API.Models;

public class EventDto {

    private String text;

    public EventDto() {}

    public EventDto(String text) {
        this.text = text;
    }
    public String getText() {
        return this.text;
    }
    public void setText(String text) {
        this.text = text;
    }

}

package org.launchcode.Spring.REST.API.Models;

public class EventDto {
    private String name;
    private String description;
    public EventDto() {}
    public EventDto(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

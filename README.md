This application is an basic api example using java/spring for Chapter 20: Web APIs and REST

You can also view the swagger docs once the application is running at this endpoint: http://localhost:8080/swagger-ui/index.html

Once the application is running on your machine you can test the application with some of the following commands. Please note the following commands assume that you are able to run curl requests from your terminal::

## GET all events:
curl localhost:8080/events

## GET specific events:
curl localhost:8080/events/{id}

## POST a new event:
curl -X POST localhost:8080/events -H Content-Type:application/json -d '{"name":"the first event", "description":"WWDC"}'

## PATCH to update an event:
curl -X PATCH localhost:8080/events/1 -H 'Content-Type:application/json' -d '{"text":"the first event name has been modified", "description":"and the description has been changed"}'

## DELETE and event:
curl -X DELETE localhost:8080/events/1

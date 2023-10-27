# Tournament
Frontend

This is my Tournament_scheduler application where I have used child component to represent the form that is getting input and also representing the output with date and combinations based on teams per day input.

app.component.html is used for representing the output and combination while clicking on view button.

While clicking on view schedule button, date with combinations will display.

Both of the operation involves different APIs.

Backend

Tournament scheduler for storing & publishing input data and their combinations.(8080 port) scheduler_output for storing & publishing output combination with their respective date.(8090 port)

These both are connected with postgresql database.

this contains four main folders called model,controller,service and repository for ensuring the flow from client to controller then controller to service where business logics are being written and service to repo and finally repository to database

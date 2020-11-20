# NBA

IDEA http requests (ctrl+alt+shift+insert) </br>
***

<b>Get players</b>
GET http://localhost:8080/players </br>

<b>Get player by id</b>
GET http://localhost:8080/players/1 </br>

<b>Get team</b>
GET http://localhost:8080/teams </br>

<b>Get salary</b>
GET http://localhost:8080/search/findBySalary?salary=3562178 </br>

<b>Get short name</b>
GET http://localhost:8080/fun/getShortName </br>
***

<b>Add new player</b>

POST http://localhost:8080/players </br>
Content-Type: application/json

{
  "playerName" : "Alex Caruso", </br>
  "playerNumber" : 4, </br>
  "salary" : 2750000	
}
***

<b>Add new team</b>

POST http://localhost:8080/teams </br>
Content-Type: application/json

{
"teamName" : "Los Angeles Lakers"
}
***

<b>Mapping</b>

PUT http://localhost:8080/players/1/team </br>
Content-Type: text/uri-list

http://localhost:8080/teams/1


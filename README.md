# reali-home-assignment

# LOCAL 
to run locally clone this project then run the command:
`mvn spring-boot:run`

API description example:

## get all the filtered listings with a GeoJSON support response:
GET http://localhost:8080/api/listings?min_price=100000&max_price=200000&min_bed=1&max_bed=3&min_bath=1&max_bath=3

## get all the filtered listings with Pagination support response:
GET http://localhost:8080/api/listings/byPage?min_price=100000&max_price=200000&min_bed=1&max_bed=3&min_bath=1&max_bath=3&page=0&size=3

<br>

# HEROKU

API description example:

## get all the filtered listings with a GeoJSON support response:
GET https://reali-home-assignment.herokuapp.com/api/listings?min_price=100000&max_price=200000&min_bed=1&max_bed=3&min_bath=1&max_bath=3

## get all the filtered listings with Pagination support response:
GET https://reali-home-assignment.herokuapp.com//api/listings/byPage?min_price=100000&max_price=200000&min_bed=1&max_bed=3&min_bath=1&max_bath=3&page=0&size=3

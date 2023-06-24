# Library
Simple project having the REST endpoint and DB support using Kotlin, Spring Boot, Spring Web, Spring Data JPA and PostgreSQL.

I was more interested to make this project as simple as possible, so that I can create the working REST service with the enlisted technologies.


Currently this endpoints are supported:

| Method | Endpoint | Description |
| ------ | ------ | ------ |    
| GET | /books | Get all books |     
| GET | /books/{id} | Get book by id |           
| POST | /books | Create new book |      
| PUT | /books/{id} | Update book by id |
| DELETE | /books/{id} | Delete book by id |

Example format of POST request body (Verify you use the JSON format for the body):
```sh
{
    "name": "1984",
    "author": "Orwell",
    "totalCount": 1
}
```

# RealState App

This is an example about how to use GraphQL with Spring Booth and Java 10.

## Entities

Below you will find the entities being managed by this Application:

### Neighbourhood

This is a simple entity with the following fields:
* name: name of the neighbourhood
* city: name of the city that this neighbourhood belongs to

### House

This is an entity that it's referencing a Neighbourhood and it also has the following fields:
* beds: number of beds
* baths: number of bathrooms
* squareFeet: area of the house
* age: how old the house is
* neighbourhood: in which neighbourhood this house is located

## Queries

### findAllNeighbourhoods

Gets all the Neighbourhood present in the system.

Request:
```
query {
    findAllNeighbourhoods {
        id, name, city
    }
}
```

Response:
```
{
  "data": {
    "findAllNeighbourhoods": [
      {
        "id": "1",
        "name": "Ramos Mejia (Norte)",
        "city": "Ramos Mejia"
      },
      {
        "id": "2",
        "name": "Ramos Mejia (Sur)",
        "city": "Ramos Mejia"
      },
      {
        "id": "3",
        "name": "Haedo Norte",
        "city": "Haedo"
      },
      {
        "id": "4",
        "name": "Haedo Chico",
        "city": "Haedo"
      },
      {
        "id": "5",
        "name": "Haedo Sur",
        "city": "Haedo"
      },
      {
        "id": "6",
        "name": "Ituzaingo Norte",
        "city": "Ituzaingo"
      },
      {
        "id": "7",
        "name": "Parque Leloir",
        "city": "Ituzaingo"
      },
      {
        "id": "8",
        "name": "Ituzaingo Sur",
        "city": "Ituzaingo"
      },
      {
        "id": "149",
        "name": "Palermo",
        "city": "Ciudad de Buenos Aires"
      }
    ]
  }
}
```

### countNeighbourhoods

Counts all the Nneighbourhoods present in the system.

Request:
```
query {
    countNeighbourhoods
}
```

Response:
```
{
  "data": {
    "countNeighbourhoods": 8
  }
}
```

### findAllHouses

Gets all the Houses present in the system.

Request:
```
query {
    findAllHouses {
	    id, baths
    }
}
```

Response:
```
{
  "data": {
    "findAllHouses": [
      {
        "id": "9",
        "baths": 1
      },
      {
        "id": "10",
        "baths": 1
      },
      {
        "id": "11",
        "baths": 2
      },
      {
        "id": "12",
        "baths": 2
      },
      {
        "id": "13",
        "baths": 2
      },
      {
        "id": "16",
        "baths": 3
      },
      {
        "id": "17",
        "baths": 1
      },
      {
        "id": "18",
        "baths": 1
      },
      {
        "id": "19",
        "baths": 1
      },
      {
        "id": "20",
        "baths": 2
      },
      {
        "id": "21",
        "baths": 3
      },
      {
        "id": "22",
        "baths": 3
      },
      {
        "id": "23",
        "baths": 1
      },
      {
        "id": "24",
        "baths": 1
      },
      {
        "id": "152",
        "baths": 2
      },
      {
        "id": "153",
        "baths": 2
      },
      {
        "id": "154",
        "baths": 2
      }
    ]
  }
}
```

### countHouses

Counts all the Houses present in the system.

Request:
```
query {
    countHouses
}
```

Response:
```
{
  "data": {
    "countHouses": 17
  }
}
```

## Mutations

### newNeighbourhood

Creates a new Neighbourhood.

Request:
```
mutation {
    newNeighbourhood(
        name: "Palermo",
        city: "Ciudad de Buenos Aires"
    ) {
        id, name, city
    }
}
```

Response:
```
{
  "data": {
    "newNeighbourhood": {
      "id": "155",
      "name": "Palermo",
      "city": "Ciudad de Buenos Aires"
    }
  }
}
```

### newHouse

Creates a new House.

Request:
```
mutation {
    newHouse(
        beds: 5,
        baths: 2,
        squareFeet: 5000,
        age: 100,
        neighbourhood: 1
    ) {
        id, beds, baths, squareFeet, age
    }
}
```

Response:
```
{
  "data": {
    "newHouse": {
      "id": "154",
      "beds": 5,
      "baths": 2,
      "squareFeet": 5000,
      "age": 100
    }
  }
}
```

### updateHouseAge

Updates the age of a given House.

Request:
```
mutation {
    updateHouseAge(id: 12, age: 99) { id, age }
}
```

Response:
```
{
  "data": {
    "updateHouseAge": {
      "id": "12",
      "age": 99
    }
  }
}
```

### deleteHouse

Deletes a House.

Request:
```
mutation {
    deleteHouse(id:15)
}
```

Response:
```
{
  "data": {
    "deleteHouse": true
  }
}
```

## How to Test

- Start the application by running the `RealStateApplication` java class.
- Access `http://localhost:8080/h2` with a Browser to look around the database structure (user: sa / no password)
- Access `http://localhost:8080/graphiql` with a Browser to run GraphQL queries.

## Technologies

* Java 10
* Gradle
* Spring Boot
* H2 (in-memory database)
* Spring Data (JPA)
* Hibernate (ORM)
* GraphQL

## Notes

I based my application in the following Tutorial: https://www.pluralsight.com/guides/building-a-graphql-server-with-spring-boot

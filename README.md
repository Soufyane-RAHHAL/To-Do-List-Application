# To-Do-List-Application
This is a simple to-do list application built using Angular for the frontend and Spring Boot for the backend. The application allows users to add, edit, and delete to-do items, which are stored and retrieved from a MongoDB database running on Docker..

## Prerequisites
- Node.js and npm.
- Angular CLI.
- Java 8 or later.
- Apache Maven.
- Docker and Docker-Compose.

## Getting Started
1. Clone the repository: `git clone https://github.com/Soufyane-RAHHAL/To-Do-List-Application.git`
2. Navigate to the `frontend` directory: `cd to-do-list-app/frontend`
3. Install the dependencies: `npm install`
4. Run the Angular development server: `ng serve`
5. Navigate to the `backend` directory: `cd ../backend`
6. Build the Spring Boot application: `mvn clean install`
7. Run the MongoDB container on Docker: `docker-compose up` 
7. Run the Spring Boot application: `mvn spring-boot:run`
8. The application should now be running at `http://localhost:4200/.
## Database Configuration
The application is configured to use MongoDB as the default database. You can configure your MongoDB credentials in the docker-compose.yml file located in the root directory of the project.

## Built With
    - [Angular](https://angular.io/) - The web framework used for the frontend
    - [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used for the backend
    - [MongoDB](https://www.mongodb.com/) - The database used to store and retrieve to-do items
    - [Docker](https://www.docker.com/) - The containerization platform used to run the MongoDB database

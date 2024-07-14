# GBJ Buzz Website

This is a fully functional company webpage showcasing the services, products, and contact information of GBJ Buzz. The project includes both frontend and backend components.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
  - [Prerequisites](#prerequisites)
  - [Frontend Setup](#frontend-setup)
  - [Backend Setup](#backend-setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used

- **Frontend:** HTML, CSS, Bootstrap, JavaScript, React.js
- **Backend:** Spring Boot, Java
- **Build Tool:** Maven

## Project Structure

gbjbuzz-website/
├── frontend/
│ ├── public/
│ │ ├── index.html
│ ├── src/
│ │ ├── App.js
│ │ ├── index.js
│ │ ├── components/
│ │ │ ├── Navbar.js
│ │ │ ├── HomePage.js
│ │ │ ├── ServicesPage.js
│ │ │ ├── ProductsPage.js
│ │ │ ├── TeamPage.js
│ │ │ ├── ContactPage.js
│ ├── styles/
│ │ ├── main.css
├── backend/
│ ├── src/main/java/com/gbjbuzz/
│ │ ├── GbjbuzzApplication.java
│ │ ├── controller/
│ │ │ ├── ServiceController.java
│ │ │ ├── ProductController.java
│ │ │ ├── TeamController.java
│ │ │ ├── ContactController.java
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ ├── src/main/resources/
│ │ ├── application.properties
│ ├── pom.xml

markdown


## Setup Instructions

### Prerequisites

- **Java:** Ensure you have Java Development Kit (JDK) installed.
- **Node.js:** Install Node.js and npm.
- **Maven:** Install Maven and set it up in your system path.

### Frontend Setup

1. **Navigate to the frontend directory:**

   cd gbjbuzz-website/frontend
Install dependencies:

npm install
Start the development server:


npm start
Backend Setup
Navigate to the backend directory:


cd gbjbuzz-website/backend
Run the Spring Boot application:


mvn spring-boot:run

Open your browser and go to http://localhost:3000 to access the frontend.
The backend server will run on http://localhost:8080.

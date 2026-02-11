# E-Grampanchayat

E-Grampanchayat is a full-stack web application developed to digitize and simplify village panchayat operations. The system provides an efficient platform for managing citizen records, service requests, and administrative workflows through a centralized web-based solution.

## Tech Stack

Frontend  
- React.js  
- HTML5  
- CSS3  
- JavaScript  
- Axios  

Backend  
- Java  
- Spring Boot  
- RESTful APIs  
- Maven  

Database  
- MySQL (or any relational database)

## Project Structure

E-Grampanchayat/
├── frontend/
│   └── egram-panchayat-frontend-v2/
│       ├── src/
│       ├── public/
│       ├── package.json
│       └── package-lock.json
│
├── backend/
│   └── EGRAM/
│       └── springboot_backend_template/
│           ├── src/
│           ├── pom.xml
│           └── mvnw
│
└── README.md

## Setup Instructions

Clone the repository:

git clone https://github.com/Harsh9370/E-Grampanchayat.git  
cd E-Grampanchayat

Frontend setup:

cd frontend/egram-panchayat-frontend-v2  
npm install  
npm start  

The frontend application runs on:  
http://localhost:3000

Backend setup:

cd backend/EGRAM/springboot_backend_template  
mvn clean install  
mvn spring-boot:run  

The backend server runs on:  
http://localhost:8080

## Environment Configuration

Create a `.env` file inside the frontend directory (do not commit this file):

REACT_APP_API_URL=http://localhost:8080

## Features

- Secure user authentication (Login system)
- Role-based access control (Admin, Citizen)
- Citizen record management
- Panchayat service request handling
- Administrative dashboard
- REST-based backend integration

## Future Enhancements

- Improved UI and responsiveness  
- Cloud deployment support  
- Reporting and audit logs  

## Author

Harshvardhan Solankure

# Employees-Departments-Microservices-

This is a Microservice Rest Application built using SpringBoot.

The Servcies are

* Service Registry
* Config Server
* Api Gateway
* Department Service
* Employee Service
* Zikpin

The Architecture of this Application

![output_image](https://github.com/Anils117/EmployeesAndDepartments-Microservices/assets/83568202/5d772f41-2a61-48dd-98af-a04a222ba0ce)


### Service Registry ###
In microservices architecture, a service registry facilitates service discovery. Microservices are individual, independent components that communicate with each other to deliver a specific functionality within a larger application. The service registry plays a key role in managing the dynamic nature of microservices by helping them discover and communicate with each other efficiently.
* Service Registration
* Service Discovery
* Dynamic Updates
* Load Balancing

### Config Server  ###
In a microservices architecture, a Config Server centralizes and manages configuration information for the various microservices within the system. It provides a centralized configuration management solution that helps microservices retrieve their configuration parameters at runtime. The primary goal of a Config Server is to enhance the flexibility, maintainability, and scalability of microservices by separating configuration from code and allowing dynamic updates without requiring service restarts.


### Api Gateway  ###
In a microservices architecture, an API Gateway acts as a single entry point for managing and facilitating communication between various microservices and client applications. It plays a central role in simplifying the complexity of microservices interactions, improving security, and providing additional functionalities to enhance the overall system's performance.
* Centralized Entry Point
* Request Routing and Composition
* Load Balancing

### Department Service ###
Department Serivce manages all the data about Department Database. it contains all the Rest Endpoints like addDepartment, removeDepartment, getAllDepartments...

### Employee Service ###
Employee Service manages all the data about Employee Database. it contains all the the Rest Endpoints like addEmployee, removeEmployee, getAllEmployees...

### Zipkin ###
Zipkin is an open-source distributed tracing system that helps developers track and visualize the flow of requests through a complex system of microservices. It provides insights into how services interact with each other, helping to identify performance bottlenecks, troubleshoot latency issues, and optimize the overall system's performance.

### Open Feign ###
OpenFeign is a declarative web service client library for Java, designed to simplify the process of creating HTTP clients and invoking RESTful services. It is part of the larger Spring Cloud ecosystem and is often used in microservices architectures to enable communication between different services. OpenFeign allows developers to define HTTP clients using a simple and intuitive interface, abstracting away much of the boilerplate code associated with making HTTP requests.

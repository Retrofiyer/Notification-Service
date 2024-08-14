<div>
    <h1>User Notification Microservice</h1>
</div>

## About The Project

This microservice is responsible for managing notifications, specifically focused on sending authentication emails to users. Its core functionality is to generate and send secure email notifications containing 
authentication tokens, which users can use to validate their identity on the platform. This service integrates seamlessly with the token generation microservice to ensure that each email contains a unique, 
secure token that is time-bound for security purposes.

## Table of Contents

<ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#overview">Overview</a></li>
        <li><a href="#features">Features</a></li>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#configuration">Configuration</a></li>
        <li><a href="#running-the-service">Running the service</a></li>
      </ul>
    </li>
    <li>
      <a href="#contributing">Contributing</a>
    </li>
 </ol>

## Overview

The Notification Microservice is a RESTful API built using Spring Boot. The notification microservice is crucial for user verification, ensuring that only authorized users can access the platform through email-based 
authentication mechanisms.

## Features

<div>
  <ul>
      <li> <b>Email Authentication:</b> Sends authentication tokens to users' email addresses for secure login and identity verification.</li>
      <li> <b>Token Expiration Management:</b> Ensures that tokens included in the emails have a configurable expiration time to enhance security.</li>
      <li> <b>Security and Encryption: </b> Ensures that the email content, especially tokens, is encrypted during transit to protect sensitive information.</li>
    <li> <b>API for External Services:</b> Provides a RESTful API to allow other microservices to trigger email notifications.</li>
  </ul>
</div>


## Built With

[![Spring Boot][springboot.com]][springboot-url]
[![RabbitMQ][rabbitmq.com]][rabbitmq-url]
[![Swagger][swagger.com]][swagger-url]
[![Docker][docker.com]][docker-url]

<!-- GETTING STARTED -->
## Getting Started

## Prerequisites

Before you begin, make sure you have the following tools installed on your machine:

- **Java 17 or higher** - [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Spring Boot 3.3.2** - [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- **Maven** - [Maven](https://maven.apache.org/install.html)

If you don't have any of these tools installed, follow the provided links to install them.


## Installation

1.- Clone the repository
   ```sh
   git clone https://github.com/Retrofiyer/Notification-Service.git
   cd Notification-Service
   ```
2.- Build project using maven
 ```sh
   mvn clean install
   ```

## Configuration

The configuration for the User Service is located in `src/main/resources/application.properties`. Below is an example configuration:

 ```sh
email.sender=AnyEmail
email.password=PasswordAnyEmail
token.service.url=URL-TOKEN-SERVICE
   ```

## Running the service

  ```sh
    mvn spring-boot:run
   ```

## Contributing

I would like you to contribute to this project. Whether it's fixing a bug, adding a new feature or improving the documentation, your help is always welcome. Please email me at `sebitas5225@gmail.com` with all the details for improvement.

<!-- LINKS & IMAGES -->

[docker.com]: https://img.shields.io/badge/Docker-black?style=for-the-badge&logo=docker&logoColor=white
[docker-url]: https://www.docker.com/
[springboot.com]: https://img.shields.io/badge/SpringBoot-black?style=for-the-badge&logo=springboot&logoColor=white
[springboot-url]: https://spring.io/projects/spring-boot
[java.com]: https://img.shields.io/badge/Java-black?style=for-the-badge&logo=java&logoColor=white
[java-url]: https://www.oracle.com/java/
[rabbitmq.com]: https://img.shields.io/badge/RabbitMQ-black?style=for-the-badge&logo=rabbitmq&logoColor=white
[rabbitmq-url]: https://www.rabbitmq.com/
[swagger.com]: https://img.shields.io/badge/Swagger-black?style=for-the-badge&logo=swagger&logoColor=white
[swagger-url]: https://swagger.io/
[postgresql.com]: https://img.shields.io/badge/PostgreSQL-black?style=for-the-badge&logo=postgresql&logoColor=white
[postgresql-url]: https://www.postgresql.org/

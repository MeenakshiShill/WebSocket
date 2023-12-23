
WebSocket integration for real-time collaborative editing in Spring Boot

Overview
This project demonstrates a real-time chat collaboration application using WebSocket in a Spring Boot environment.
WebSocket allows for bidirectional communication between the server and clients, making it ideal for building interactive and real-time applications like chat systems.

Technologies Used

Spring Boot: Framework for building Java-based applications.
WebSocket: Communication protocol that provides full-duplex communication channels over a single, long-lived connection.
Spring Web: Module for building web applications using Spring MVC.
Getting Started
Prerequisites
Java Development Kit (JDK) 17 
Maven installed.
Setup
Clone the repository:

git clone https://github.com/MeenakshiShill/WebSocket.git
Navigate to the project directory:

cd WebSocket
Build the project using Maven:

Use mvn clean and Run the application:

The application will be accessible at http://localhost:9090

Usage
Access the application in your web browser at http://localhost:9090
Enter a username.
Start chatting in real-time with other users connected to the WebSocket.

Key Components:

Message Class (Message.java):
Contains fields for the sender's name and the content of the message .

WebSocket Configuration (Config.java):
Configures WebSocket settings using Spring's WebSocketMessageBrokerConfigurer.

MessageController (MessageController.java):
Handles incoming messages from clients using @MessageMapping.

Front-End (index.html, style.css, script.js):

Provides a simple web interface for users to interact with the chat application.
Includes a form to enter a username and a chat room.
Allows users to send and receive messages in real-time.

Test Cases Description:

MessageControllerTest:
Check if the MessageController properly processes and broadcasts messages.

ConfigTest:
Objective: Confirm that the Config class sets up the message broker and Stomp endpoints correctly.

i have completed the task and tried to Expain in Readme file what i have done in the project 




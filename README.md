# websocket-example
This example show you the basic Websocket example using SpringBoot

Project Structure

The project has a standard Maven structure:

src/main/java: Contains the main application code.

src/main/resources: Holds resources like templates and properties.

src/test/java: Contains tests.

pom.xml: Maven configuration.

mvnw and mvnw.cmd: Maven Wrapper scripts for easy building. 

Key Files and Functionalities

README.md: Provides a basic description of the project. 

pom.xml: This file defines the project's dependencies. It uses Spring Boot, Thymeleaf (for templating), and Spring WebSocket. It also includes jQuery and Lombok. 

SiddhuWebsocketExampleApplication.java: This is the main Spring Boot application class. It uses @SpringBootApplication to set up the application. 

SiddhuWebSocketConfig.java: This configures the WebSocket functionality. The @EnableWebSocket annotation enables WebSocket support. It registers SiddhuTextWebSocketHandler to handle WebSocket connections at the /web-socket endpoint. 

SiddhuWebSocketController.java: This controller handles the HTTP request for the main page. It maps the /websocket URL to the index.html page. 

SiddhuTextWebSocketHandler.java: This class extends TextWebSocketHandler and handles WebSocket events:

afterConnectionEstablished: Called when a new WebSocket connection is established. It adds the session to a list of active sessions. 

afterConnectionClosed: Called when a connection is closed. It removes the session from the active sessions list. 

handleTextMessage: Called when a text message is received. It broadcasts the message to all connected sessions. 

application.properties: This file is empty, indicating that it uses the default application properties. 

index.html: This is the HTML page that provides the user interface for interacting with the WebSocket. It includes:

JavaScript to establish a WebSocket connection, send messages, and display received messages. 

Buttons to connect and disconnect. 

Input fields for sending messages. 

A div element to display messages. 

SiddhuWebsocketExampleApplicationTests.java: A basic Spring Boot test class. 

.**mvn/wrapper/**: The Maven Wrapper allows you to build the project without having Maven installed. 
WebSocket Flow

The user accesses the /websocket URL, which serves the index.html page.

The index.html page uses JavaScript to establish a WebSocket connection to /web-socket. 

The SiddhuWebSocketConfig maps this URL to the SiddhuTextWebSocketHandler. 

When the user sends a message, it is sent through the WebSocket connection to the server. 

The SiddhuTextWebSocketHandler receives the message and broadcasts it to all connected WebSocket sessions. 

All connected clients, including the sender, receive the message and display it on their pages. 


# Java-Server-Client
Java Socket Programming 
# Java Server-Client Communication

## Aim
To write a Java program to demonstrate communication between a client and a server using Java Socket Programming.

## About the Experiment
This experiment demonstrates how a client and a server communicate over a network using Java. The server waits for a client connection, and the client connects to the server using a socket.

## Technologies Used
- Java
- Java Socket Programming
- JDK
- Visual Studio Code

## Files
- `Server.java` – Contains the server-side program.
- `Client.java` – Contains the client-side program.

## Requirements
- Java Development Kit (JDK)
- Visual Studio Code or any Java-supported IDE
- Two terminals to run the server and client programs

## How to Run

### Step 1: Open the Project
Open the project folder in Visual Studio Code.

### Step 2: Compile the Java Files
Open the terminal in the project folder and run:

```bash
javac Server.java Client.java
```

### Step 3: Start the Server
Run the server program first:

```bash
java Server
```

### Step 4: Start the Client
Open another terminal and run:

```bash
java Client
```

### Step 5: Verify the Output
Check the terminal windows to verify that the client connects to the server and communication takes place.

## Expected Output
The server starts and waits for a client connection. The client connects to the server, and messages are exchanged according to the program's implementation.

## Learning Outcomes
- Understanding client-server architecture.
- Learning Java socket programming.
- Establishing connections using `Socket` and `ServerSocket`.
- Understanding basic network communication.

## Author
Shrejal Shukla

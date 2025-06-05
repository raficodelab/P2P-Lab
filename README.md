# P2P-Lab# P2P Chat Application (Java Sockets)

## Introduction

This project demonstrates a simple peer-to-peer (P2P) chat system using Java. It includes two Java files: `Peer1.java` acts as a server that listens for incoming messages, and `Peer2.java` acts as a client that sends messages to the server. Communication is done over TCP sockets on port 5000.

## Objective

To simulate a basic text-based chat system between two peers using Java networking principles with:
- Socket programming
- Client-server model
- Stream handling

## Tools Used

- **Java (JDK 8 or later)**
- **NetBeans IDE**
- **Command Line/Git Bash (for GitHub)**

## Project Structure

```plaintext
P2PChat/
├── Peer1.java       # Server that listens and receives messages
├── Peer2.java       # Client that sends messages
└── README.md        # Project documentation
Instructions to Run (in NetBeans)
Open NetBeans IDE.

Create a new project (Java → Java Application → Project Name: P2PChat) and uncheck “Create Main Class”.

Add two Java classes: Peer1 and Peer2.

Copy the code into the respective files.

Right-click on Peer1.java → Run (to start the server).

Right-click on Peer2.java → Run (to send messages to server).

How It Works
Peer1 (Server): Listens on port 5000. Accepts a connection, reads a single line of text, and prints it. Exits if it receives the message "exit".

Peer2 (Client): Connects to localhost:5000, prompts the user for a message, sends it to the server, and closes the connection. Repeats until the user types "exit".

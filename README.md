# Realtime Notification System (Monolith Version)

Real-time event-based notification system using Kafka y WebSockets.

⚠️ This is the initial monolithic version of the project.
👉 Coming soon: a microservices-based version.

---

## 📌 Table of Contents

- [Architecture](#-architecture)
- [Tech Stack](#-tech-stack)
- [Getting Started](#-getting-started)
- [Flowchart](#-flowchart)
- [Features](#-features)
- [Upcoming improvements](#-upcoming-improvements)
- [Testing](#-testing)
- [Notes](#-notes)
- [Author](#-author)
- [License](#-license)

---

## 🧠 Architecture

```
Client (HTML)
   ↓
Spring Boot API
   ↓
Kafka (KRaft)
   ↓
Kafka Consumer
   ↓
WebSocket (STOMP)
   ↓
Client receives real-time notification
```

---

## 🚀 Tech Stack

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Spring WebSocket (STOMP)
* Apache Kafka (KRaft mode)
* H2 Database
* Docker

---

## ⚙️ Getting Started

### 1. Run Kafka

```bash
docker compose up -d
```

---

### 2. Run the application Spring Boot

From IntelliJ:

```bash
./mvnw spring-boot:run
```

---

### 3. Open WebSocket client

Open in browser:

```
http://localhost:8080/websocket-test.html
```

---

### 4. Create a ticket

Example using Postman:

```
POST http://localhost:8080/api/tickets
Content-Type: application/json

{
  "title": "Ticket test",
  "description": "This is a test"
}
```

---

## 📡 Flowchart

1. A ticket is created
2. It's stored in a database (H2)
3. Event sent to Kafka
4. The consumer receives the event
5. Notification is sent via WebSocket
6. The customer receives it in real time

---

## 📌 Features

* Ticket creation
* Integration with Kafka (Producer + Consumer)
* Realtime notifications with WebSocket
* HTML client for testing

---

## 🔜 Upcoming improvements

* Separation into microservices
* Users.
* Notifications per user
* Notification persistence
* Security (JWT)

---

## 🧪 Testing

You can test the complete flow using:

* Postman / curl to create tickets
* HTML client to receive notifications

---

## 📦 Notes

* Kafka runs with KRaft (without Zookeeper)
* Topics are created automatically
* In-memory database (H2)

---

## 👨‍💻 Author

Project developed as part of backend portfolio.

---

## 📝 License

This project is licensed under the MIT License.
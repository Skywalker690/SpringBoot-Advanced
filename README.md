# 🧪 Spring Boot Advanced Project

A fully-featured **Spring Boot** application that demonstrates advanced backend engineering concepts, including **JPA relationships**, **embedded IDs**, **custom specifications**, and robust **JUnit 5 testing**. Ideal for real-world enterprise scenarios and clean architectural design.

---

## 🚀 Features

- 📦 Modular structure with clear separation of concerns (models, repositories, services, config)
- 🧬 **Embedded IDs** using `@Embeddable` and `@EmbeddedId`
- 🔄 **Many-to-One**, **One-to-Many**, and **Many-to-Many** JPA relationships
- 🔍 Custom query filtering using **JPA Specification API**
- 🧪 Unit and integration testing with **JUnit 5** and **Mockito**
- 🗄️ Uses **PostgreSQL** as the relational database
- ⚙️ Centralized configuration using `application.yml`

---

## 🛠 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **JUnit 5** & **Mockito**
- **PostgreSQL**
- **Lombok**, **MapStruct** 
- **Maven** for build automation

---

## 📂 Project Structure (Highlights)

```
src/
└── main/
    └── java/
        └── com/sanjo/advanced/
            ├── model/
            │   ├── embedded/
            │   ├── entities like Admin, Order, Course, etc.
            ├── repository/
            │   ├── JpaRepository interfaces
            ├── specification/
            │   ├── Specification filters
            ├── AdvancedApplication.java
    └── resources/
        ├── application.yml
```

---

## 🧪 Testing

- Unit testing for services and components using **JUnit 5**
- Mocked repositories and service layers using **Mockito**
- Organized and isolated test cases for business logic

---

## ⚙️ Running the App

### Prerequisites:
- Java 17+
- PostgreSQL running locally or remotely
- Maven

### Steps:
```bash
# Clone the repository
git clone https://github.com/your-username/your-repo.git
cd your-repo

# Update DB config in application.yml

# Build and run
mvn clean install
mvn spring-boot:run
```

---

## 🧾 License

This project is licensed under the MIT License.

---

## 📬 Feedback or Contributions

Feel free to open issues or PRs. Contributions are welcome!

> Built with ❤️ by Sanjo

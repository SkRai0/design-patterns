# 🚀 Low Level Design Patterns & Questions

Welcome to my Java-based LLD playground where I am learning and implementing design patterns with clean, practical examples.  
This repository is **actively growing**, and many more patterns + LLD problems will be added over time ✅

## 🎯 What This Repository Focuses On

Each pattern/problem is built to cover:
- 🔍 The real-world problem
- 🧠 Why a specific pattern is useful
- 🛠️ A clean Java implementation
- 📈 Extensibility and maintainability mindset

This repo is also a preparation space for **LLD interviews** and system design thinking.

## 🧰 Tech Stack
- ☕ Java 17
- 📦 Maven

## 📁 Project Structure

```text
src/main/java/org/iamskrai/
├── CreationalPatterns/
│   ├── FactoryPattern/
│   ├── AbstractFactoryPattern/
│   ├── BuilderPattern/
│   └── SingletonPattern/
├── BehaviouralPatterns/
│   ├── StrategyPattern/
│   ├── ObserverPattern/
│   └── CommandPattern/
└── StructuralPatterns/ (coming soon)
```

## 📚 Pattern Index

### 🏗️ Creational Patterns
- [Factory Pattern](src/main/java/org/iamskrai/CreationalPatterns/FactoryPattern/README.md)
- [Abstract Factory Pattern](src/main/java/org/iamskrai/CreationalPatterns/AbstractFactoryPattern/README.md)
- [Builder Pattern](src/main/java/org/iamskrai/CreationalPatterns/BuilderPattern/README.md)
- [Singleton Pattern](src/main/java/org/iamskrai/CreationalPatterns/SingletonPattern/README.md)

### 🔄 Behavioural Patterns
- [Strategy Pattern](src/main/java/org/iamskrai/BehaviouralPatterns/StrategyPattern/README.md)
- [Observer Pattern](src/main/java/org/iamskrai/BehaviouralPatterns/ObserverPattern/README.md)
- [Command Pattern](src/main/java/org/iamskrai/BehaviouralPatterns/CommandPattern/README.md)

### 🧱 Structural Patterns
- 🚧 In progress (will be added soon)

## ▶️ How to Run

### 1) Compile project
```bash
mvn clean compile
```

### 2) Run any example class
```bash
java -cp target/classes <fully.qualified.ClassName>
```

Example:
```bash
java -cp target/classes org.iamskrai.BehaviouralPatterns.ObserverPattern.Solution.Homepage
```

## 🧩 LLD Questions (Planned + Upcoming)

Along with patterns, I am also adding common interview-style LLD problems such as:
- 🚗 Parking Lot System
- 🎟️ Movie Ticket Booking (BookMyShow style)
- 🍔 Food Delivery System
- 🛗 Elevator System
- ⚡ Rate Limiter
- 🔔 Notification Service

Typical coverage for each question:
- ✅ Problem statement
- ✅ Functional and non-functional requirements
- ✅ Class design / UML direction
- ✅ Java implementation
- ✅ Trade-offs and extensions

## 🌱 Learning Goals

This repository helps me strengthen:
- SOLID principles
- Object-oriented design
- Design pattern selection
- Writing scalable and maintainable code

## 🤝 Contributions

Suggestions and contributions are welcome!

You can contribute by:
- adding new design patterns,
- improving existing examples,
- adding LLD questions + model solutions,
- improving docs/diagrams.

---

If you find this useful, please consider giving it a ⭐

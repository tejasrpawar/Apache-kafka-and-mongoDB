# SpringBoot-with-Kafka

A simple Spring Boot microservice that integrates Apache Kafka for consuming messages and stores them in MongoDB.

## Project Overview

This project demonstrates how to implement Apache Kafka with Spring Boot to consume messages and subsequently store them in MongoDB.

## Prerequisites

- Java 8 or higher installed on your local environment.
- Apache Kafka installed locally.

## Setting up Apache Kafka

1. **Install Apache Kafka:**

   Make sure to install Apache Kafka on your local machine. You can download it from the [Apache Kafka website](https://kafka.apache.org/downloads).

2. **Start Zookeeper Service:**

   Open a terminal and navigate to your Kafka directory:

   ```bash
   cd <path_to_kafka>

Start Zookeeper service by running the following command:

`bin/zookeeper-server-start.sh config/zookeeper.properties`

3. Start Kafka Broker Service:

Open a new terminal (keep the Zookeeper terminal running) and run:

`bin/kafka-server-start.sh config/server.properties`

This command starts the Kafka broker service.






<<<<<<< HEAD
FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 8080

=======
FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 8080

>>>>>>> 31b74891882edd8d9435f5c88b859e2737048cd7
CMD ["java", "-jar", "target/*.jar"]
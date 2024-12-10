# Используем официальный образ OpenJDK
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

EXPOSE 8080

# Копируем JAR-файл в контейнер
COPY target/book-0.0.1-SNAPSHOT.jar /app/book-0.0.1-SNAPSHOT.jar

# Запускаем приложение
CMD ["java", "-jar", "book-0.0.1-SNAPSHOT.jar"]

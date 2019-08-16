FROM java:8 
COPY ./src/ /var/www/java  
WORKDIR /var/www/java
CMD ["java", "-jar", "Mgtg-1.0-SNAPSHOT.jar"]  
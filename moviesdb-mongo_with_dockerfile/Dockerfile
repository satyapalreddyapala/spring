FROM openjdk:10-jre

ADD ./target/moviesdb-0.0.1-SNAPSHOT.jar /usr/app/moviesdb-0.0.1-SNAPSHOT.jar

WORKDIR usr/app

ENTRYPOINT ["java","-jar", "moviesdb-0.0.1-SNAPSHOT.jar"]
FROM openjdk
EXPOSE 8080
ADD target/common-util.jar common-util.jar
ENTRYPOINT ["java","-jar","/common-util.jar"]
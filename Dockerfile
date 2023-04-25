From openjdk:8
Expose 9292
Add build/libs/webclient-employee-management-system-0.0.1-SNAPSHOT.jar webclient-employee-management-system-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/webclient-employee-management-system-0.0.1-SNAPSHOT.jar"]
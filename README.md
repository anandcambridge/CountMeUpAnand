# CountMeUpAnand
Count public vote

This is spring boot web application. Building this application (mvn install) produces a standalone jar file (CountMeUpAnand-0.0.1-SNAPSHOT.jar) with embedded tomcat. Which can be run on terminal at port 8080. The command used to run this application after building the jar is
java -jar CountMeUpAnand-0.0.1-SNAPSHOT.jar

Two functionality added
1) Take public vote using
http://localhost:8080/countmeup/takevoting
2) Count the vote for each candidate
http://localhost:8080/countmeup/votingresultinput

Assumptions:
Currently application is expected to run on multi core machine. It spawns multiple thread as set in application.properties file, currently set to five threads (thread.pool.count = 5).
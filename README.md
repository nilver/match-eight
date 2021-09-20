# match-eight

You can run the application from the command line with Gradle. You can also build a single executable JAR file that contains all the necessary dependencies, classes, and resources and run that. Building an executable jar makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.

If you use Gradle, you can run the application by using ./gradlew bootRun. Alternatively, you can build the JAR file by using ./gradlew build and then run the JAR file, as follows:

java -jar build/libs/ rest-api-0.0.1-SNAPSHOT.jar 139

In this case 139 is ingle integer input to add  up heights

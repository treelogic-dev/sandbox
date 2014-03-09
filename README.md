This project uses Gradle as its build and dependency management (see http://www.gradle.org/). Gradle is self-provisioning build framework which means you don't have to have gradle installed to follow the rest of the procedure. 

BUILD for development:

Depending on the IDE you are using execute the following gradle script.
ECLIPSE:

	./gradlew clean eclipse
	
IntelliJ IDEA

	./gradlew clean idea
	
The above will generate all necessary IDE-specific artifacts to successfully import the project.
Import the project into your IDE.
For example in Eclipse follow this procedure:

	File -> Import -> General -> Existing Project Into Workspace -> browse to the root of the project and click Finish

# <p align="center">Setting up Eclipse and JUnit testing dependencies</p>

- Download EclipseEE [Click here](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2023-12/R/eclipse-jee-2023-12-R-win32-x86_64.zip)
- Create Maven Project
- Go to `File`>`New`>`Maven Project`
![eclipse](./JUnit_Testing/Screenshots/Screenshot%20(84).png)
![eclipse](./JUnit_Testing/Screenshots/Screenshot%20(85).png) 
Click `Finish`

## Go to `pom.xml` 
### use the code below to setup `dependencies` for JUnit
```xml
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-suite-engine</artifactId>
            <version>1.10.1</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>2.0.9</version>
        </dependency>
    </dependencies>
```
### use the following 'dependencies' for Selenium
```xml
    <dependencies>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.9.0</version>
		</dependency>
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<!-- <version>5.6.2</version> -->
			<version>5.2.0</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.11.0</version>
		</dependency>
		<dependency>
			<groupId>ru.yandex.qatools.ashot</groupId>
			<artifactId>ashot</artifactId>
			<version>1.5.4</version>
		</dependency>
		<dependency>
			<groupId>org.hamcrest</groupId>
			<artifactId>java-hamcrest</artifactId>
			<version>2.0.0.0</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.assertthat</groupId>
			<artifactId>selenium-shutterbug</artifactId>
			<version>1.5</version>
			<exclusions>
				<exclusion>
					<groupId>org.seleniumhq.selenium</groupId>
					<artifactId>selenium-java</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
	</dependencies>
```
### use the code below to setup `build`(Plugin)
```xml
    <build>
        <pluginManagement><!-- lock down plugins versions to avoid using Maven
            defaults (may be moved to parent pom) -->
            <plugins>
                <!-- clean lifecycle, see
                https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
                <plugin>
                    <artifactId>maven-clean-plugin</artifactId>
                    <version>3.1.0</version>
                </plugin>
                <!-- default lifecycle, jar packaging: see
                https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
                <plugin>
                    <artifactId>maven-resources-plugin</artifactId>
                    <version>3.0.2</version>
                </plugin>
                <plugin>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.8.0</version>
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>3.2.3</version>
                    <!--                    <configuration>-->
                    <!--                        <test>test_suite.MyTestSuite</test>-->
                    <!--                    </configuration>-->
                </plugin>
                <plugin>
                    <artifactId>maven-jar-plugin</artifactId>
                    <version>3.0.2</version>
                </plugin>
                <plugin>
                    <artifactId>maven-install-plugin</artifactId>
                    <version>2.5.2</version>
                </plugin>
                <plugin>
                    <artifactId>maven-deploy-plugin</artifactId>
                    <version>2.8.2</version>
                </plugin>
                <!-- site lifecycle, see
                https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
                <plugin>
                    <artifactId>maven-site-plugin</artifactId>
                    <version>3.7.1</version>
                </plugin>
                <plugin>
                    <artifactId>maven-project-info-reports-plugin</artifactId>
                    <version>3.0.0</version>
                </plugin>
            </plugins>
        </pluginManagement>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>8</source>
                    <target>8</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.10</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>jacoco-check</id>
                        <goals>
                            <goal>check</goal>
                        </goals>
                        <configuration>
                            <rules>
                                <rule>
                                    <element>PACKAGE</element>
                                    <limits>
                                        <limit>
                                            <counter>LINE</counter>
                                            <value>COVEREDRATIO</value>
                                            <minimum>0.9</minimum>
                                        </limit>
                                    </limits>
                                </rule>
                            </rules>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```

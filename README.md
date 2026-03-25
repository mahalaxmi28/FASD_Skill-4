# Spring DI - Skill 4: Constructor & Setter Injection

## Project Structure
```
SpringDI/
├── src/main/java/com/training/di/
│   ├── Student.java            (POJO - used in XML config)
│   ├── StudentAnnotation.java  (POJO - used in Annotation config)
│   ├── AppConfig.java          (@Configuration class)
│   ├── MainXML.java            (Run this for XML-based DI)
│   └── MainAnnotation.java     (Run this for Annotation-based DI)
├── src/main/resources/
│   └── applicationContext.xml  (Spring XML config)
├── lib/                        (Add JAR files here - see below)
├── .classpath
├── .project
└── README.md
```

---

## STEP 1 — Download Required JAR Files

Download all JARs from Maven Repository and place them in the `lib/` folder:

| JAR File | Download Link |
|---|---|
| spring-context-5.3.30.jar | https://repo1.maven.org/maven2/org/springframework/spring-context/5.3.30/spring-context-5.3.30.jar |
| spring-core-5.3.30.jar | https://repo1.maven.org/maven2/org/springframework/spring-core/5.3.30/spring-core-5.3.30.jar |
| spring-beans-5.3.30.jar | https://repo1.maven.org/maven2/org/springframework/spring-beans/5.3.30/spring-beans-5.3.30.jar |
| spring-aop-5.3.30.jar | https://repo1.maven.org/maven2/org/springframework/spring-aop/5.3.30/spring-aop-5.3.30.jar |
| spring-expression-5.3.30.jar | https://repo1.maven.org/maven2/org/springframework/spring-expression/5.3.30/spring-expression-5.3.30.jar |
| commons-logging-1.2.jar | https://repo1.maven.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar |

---

## STEP 2 — Import into Eclipse

1. Open Eclipse
2. File → Import → General → Existing Projects into Workspace
3. Select the `SpringDI` folder → Finish
4. Right-click project → Build Path → Configure Build Path
5. Go to Libraries tab → Add JARs → select all JARs from the `lib/` folder
6. Click Apply and Close

---

## STEP 3 — Run the Project

### XML-Based Injection
Right-click `MainXML.java` → Run As → Java Application

**Expected Output:**
```
=== XML-Based Spring Dependency Injection ===

Constructor Injection:
Student [ID=101, Name=Ravi Kumar, Course=B.Tech CSE, Year=2]

Setter Injection:
Student [ID=102, Name=Priya Sharma, Course=MCA, Year=1]
```

### Annotation-Based Injection
Right-click `MainAnnotation.java` → Run As → Java Application

**Expected Output:**
```
=== Annotation-Based Spring Dependency Injection ===

@Component + @Value Injection:
Student [ID=201, Name=Anjali Verma, Course=B.Sc Data Science, Year=3]

@Bean (Constructor + Setter) Injection:
Student [ID=301, Name=Kiran Reddy, Course=B.Tech ECE (Hons), Year=4]
```

---

## How Each Injection Works

| Type | Where Configured | How |
|---|---|---|
| Constructor Injection (XML) | applicationContext.xml | `<constructor-arg>` tags |
| Setter Injection (XML) | applicationContext.xml | `<property>` tags |
| @Value Injection | StudentAnnotation.java | `@Value("...")` on fields |
| @Bean (Java Config) | AppConfig.java | new + setter inside `@Bean` method |

---

## GitHub Push Commands

```bash
git init
git add .
git commit -m "Skill 4 - Spring DI Constructor and Setter Injection"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/SpringDI.git
git push -u origin main
```

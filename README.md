# Java Task Manager — OOP Portfolio Project

A small, interactive command-line task manager written in **Java**. This independent portfolio implementation revisits object-oriented programming concepts practiced during my Software Development Engineering studies.

## Features

- Create tasks with automatic IDs
- List all tasks or only pending tasks
- Mark tasks as completed
- Remove tasks
- Handle invalid menu choices and task IDs

## Technologies and concepts

Java 17+; encapsulation; classes and objects; collections (`List`, `ArrayList`); methods; input validation; simple separation of responsibilities.

## Run locally

From the project root, with JDK 17 or later installed:

```bash
javac -d out src/main/java/com/angelamena/tasks/*.java
java -cp out com.angelamena.tasks.Main
```

On Windows PowerShell, the same commands work when executed from the project root.

## Structure

- `Task.java`: task model and state
- `TaskManager.java`: task operations and filtering
- `Main.java`: interactive console interface

## Limitations and next steps

Tasks are stored in memory and reset when the application exits. Possible improvements include file persistence, unit tests, and a graphical interface.

## Background

This is a separate portfolio exercise based on concepts learned in an individual university lab. It does not include the university's private Classroom configuration or grading files.

**Author:** Angela Mena

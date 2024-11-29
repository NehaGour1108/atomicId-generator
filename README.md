# Atomic ID Generator

<img width="749" alt="Screenshot 2024-11-29 at 9 56 15 PM" src="https://github.com/user-attachments/assets/0551d822-755e-4f5a-8364-e6e98afb145a">

This is a simple Java project demonstrating how to generate unique IDs in a thread-safe manner using the `AtomicInteger` class. The project showcases the use of atomic operations to ensure unique ID generation in a multi-threaded environment.

### Key Features:
- **Atomic ID Generation**: Generates unique IDs by atomically incrementing a counter.
- **Thread-Safe**: The ID generation is thread-safe, meaning multiple threads can call the ID generator simultaneously without conflicts.
- **Simple and Efficient**: The project demonstrates a minimalistic and efficient approach to generating unique IDs in Java.

---

## Prerequisites

- Java 8 or higher
- Maven (optional, for building the project)

---

## How to Use

### Clone the repository

```bash
git clone https://github.com/your-username/atomic-id-generator.git
```

### Compile and Run the Project

1. **Using Maven (if applicable):**

    Navigate to the project directory and run the following command to build and run the project:

    ```bash
    mvn clean install
    mvn exec:java
    ```

2. **Using Command Line (without Maven):**

    If you don’t have Maven set up, you can manually compile and run the project from the command line.

    1. **Compile the `Main.java` file**:

        ```bash
        mvn exec:java -Dexec.mainClass="org.example.Main"
        ```

    2. **Run the `Main.class` file**:

        ```bash
        mvn exec:java -Dexec.mainClass="org.example.Main"
        ```

---

## Code Explanation

The core of the project is a thread-safe ID generator using `AtomicInteger` to ensure unique ID generation.

- **AtomicInteger**: This is used to safely increment an integer value across multiple threads.
- **`getNextId()`**: This method uses the `incrementAndGet()` method of `AtomicInteger` to atomically increment the ID and return the updated value.

### Example Usage

```java
System.out.println("Next ID: " + getNextId()); // Should print 1
System.out.println("Next ID: " + getNextId()); // Should print 2
System.out.println("Next ID: " + getNextId()); // Should print 3
```

---

## Output

The output will be:

```
Next ID: 1
Next ID: 2
Next ID: 3
```

Each time the `getNextId()` method is called, the ID is incremented atomically and returns a unique value.

---

## Why Use AtomicInteger?

- **Thread-Safety**: `AtomicInteger` ensures that each ID is generated safely across multiple threads without synchronization issues.
- **Efficient**: The use of `AtomicInteger` avoids the need for complex synchronization mechanisms, making it faster and simpler.
- **No Blocking**: Unlike synchronized methods, `AtomicInteger` ensures that the atomic operation does not block threads, which improves performance.

---

## Use Cases

- **Database Record IDs**: Used to generate unique IDs for records in a database.
- **Session or Token Generation**: Generate unique tokens for sessions, security purposes, or other identifiers.
- **Counters**: Track task completion, user activity, or other events that require counting.

## 🚀 Problem Statement: Ensuring a Single Shared Instance

### 🏗️ Scenario:

#### Imagine your application uses a `Logger` service to print important system messages.  
#### This logger is needed across multiple classes and modules.

#### Desired behavior:
✅ One shared logger instance 🧾  
✅ Consistent logging behavior across the app  
✅ Controlled resource usage  

### ⚠️ The Problem:

#### In a normal class design, any part of the app can create a new logger object:
- ➡️ `new Logger()`
- ➡️ `new Logger()` again in another class

#### This creates multiple logger instances, which can lead to:
- ❌ Inconsistent logging behavior
- ❌ Hard-to-manage lifecycle in large applications
- ❌ Unnecessary object creation

``` When many components create their own Logger instances, consistency and control are lost 😵‍💫💥! ```

### ✅ Why Singleton Pattern Helps:

#### Singleton ensures only one instance of `Logger` exists in the whole application:
- 🔒 Constructor is private (no external `new`)
- 🧠 A static instance is stored inside the class
- 🏭 `getInstance()` provides global access to the same object
- 🛡️ Thread-safe lazy creation (using synchronized double-check)

#### This guarantees centralized logging and predictable behavior throughout the system.

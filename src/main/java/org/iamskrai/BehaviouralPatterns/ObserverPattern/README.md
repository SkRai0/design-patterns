## 🚀 Problem Statement: Notifying Multiple Subscribers Efficiently

### 🏗️ Scenario:

#### Imagine you are building an online shop that announces newly added products.  
#### Different users may want updates through different channels:
✅ Email subscribers 📧  
✅ SMS subscribers 📱  

#### Whenever a new product is added, all active subscribers should be notified automatically.

### ⚠️ The Problem:

#### In a direct implementation, `Shop` is tightly coupled to a specific subscriber type (like `EmailSubscriber`):
- ➡️ Shop knows concrete subscriber classes directly
- ➡️ Only one notification channel is easy to support
- ➡️ Adding new subscriber types requires modifying `Shop`

#### This leads to:
- ❌ Tight coupling between business logic and notification logic
- ❌ Poor extensibility
- ❌ Open/Closed Principle violation

``` As subscriber types grow, hardcoded notification logic becomes rigid and difficult to maintain 😵‍💫💥! ```

### ✅ Why Observer Pattern Helps:

#### Observer pattern decouples the shop from subscriber implementations:
- 🧩 `Observer` interface defines a common `update(message)` contract
- 🏪 `Shop` acts as `Subject` and maintains a list of observers
- ➕ `subscribe(...)` and ➖ `unsubscribe(...)` manage listeners dynamically
- 📣 `notifyObservers(...)` informs all active subscribers when a product is added

#### This makes the system flexible, scalable, and easy to extend with new subscriber types without changing `Shop`.

## 🚀 Problem Statement: Routing Requests Through an Approval Hierarchy

### 🏗️ Scenario:

#### Imagine you are building an employee leave management system.  
#### Leave requests must be approved based on duration:
✅ 1-3 days → Supervisor approval 👔  
✅ 4-7 days → Manager approval 🧑‍💼  
✅ 8+ days → Director approval 👨‍💼  

#### The system should route requests to the appropriate authority without the caller knowing who will handle it.

### ⚠️ The Problem:

#### In a direct implementation, the request processor needs to know all approval levels:
- ➡️ Check which approver can handle the request
- ➡️ Hard-coded decision logic for each level
- ➡️ Tightly coupled to the approval hierarchy

#### This causes:
- ❌ Request handling logic is scattered and hard to maintain
- ❌ Adding new approval levels requires rewriting existing code
- ❌ Client must know the entire hierarchy structure
- ❌ Changes to thresholds mean scattered modifications

``` Managing multiple approval levels with hardcoded conditionals becomes rigid and error-prone 😵‍💫💥! ```

### ✅ Why Chain of Responsibility Pattern Helps:

#### Chain of Responsibility lets requests pass through a chain of handlers:
- 🧩 `Approver` abstract class defines `processRequest(days)`
- 👔 `Supervisor` - handles up to 3 days or passes forward
- 🧑‍💼 `Manager` - handles up to 7 days or passes forward
- 👨‍💼 `Director` - handles 8+ days or rejects
- 🔗 Each handler maintains a reference to the next approver via `setNextApprover(...)`

#### This keeps each approval level independent, makes the chain configurable, and lets you add new levels without modifying existing handlers.

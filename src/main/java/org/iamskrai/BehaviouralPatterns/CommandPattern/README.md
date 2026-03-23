## 🚀 Problem Statement: Decoupling Actions from Button Triggers

### 🏗️ Scenario:

#### Imagine you are building a remote control system for a TV.  
#### The remote should trigger different actions such as:
✅ Turn ON TV 📺  
✅ Turn OFF TV 📴  
✅ Change Channel 🔢  
✅ Set Volume 🔊  

#### The same remote button should be reusable for different operations.

### ⚠️ The Problem:

#### If the `Remote` directly calls TV methods:
- ➡️ Remote becomes tightly coupled to TV operation details
- ➡️ Adding new actions requires modifying remote logic repeatedly
- ➡️ UI trigger code gets mixed with business/action code

#### This causes:
- ❌ Rigid and hard-to-extend control flow
- ❌ Poor separation of concerns
- ❌ Growing condition-heavy or hardcoded invoker logic

``` As device actions increase, tightly coupled button logic becomes messy and difficult to maintain 😵‍💫💥! ```

### ✅ Why Command Pattern Helps:

#### Command pattern encapsulates each request as an object:
- 🧩 `Command` interface defines `execute()`
- 🎛️ Concrete commands like `TurnOnCommand`, `TurnOffCommand`, `ChangeChannelCommand`, `SetVolumeCommand`
- 📺 `TV` acts as the receiver that performs the real work
- 🎮 `Remote` acts as the invoker and executes whichever command is assigned

#### This keeps invoker code clean, decouples request sender from receiver, and makes it easy to add new commands without changing `Remote`.

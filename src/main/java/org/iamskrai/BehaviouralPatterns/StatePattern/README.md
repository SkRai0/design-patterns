## 🚀 Problem Statement: Managing Behavior Based on Current State

### 🏗️ Scenario:

#### Imagine you are building a traffic light system.  
#### The signal changes in a fixed cycle:
✅ Red 🔴 → Green 🟢  
✅ Green 🟢 → Yellow 🟡  
✅ Yellow 🟡 → Red 🔴  

#### The behavior of the system should depend on its current light state.

### ⚠️ The Problem:

#### In a direct implementation, state transitions are usually handled with big if-else/switch blocks:
- ➡️ Check current state manually
- ➡️ Decide next state using conditions
- ➡️ Keep updating transition logic in one place

#### This leads to:
- ❌ Condition-heavy and hard-to-read code
- ❌ Difficult extension when more states/rules are added
- ❌ Tight coupling between context and transition logic

``` As state-based rules grow, centralized conditional logic becomes messy and hard to maintain 😵‍💫💥! ```

### ✅ Why State Pattern Helps:

#### State pattern moves each state's behavior into separate classes:
- 🧩 `State` interface defines `nextState(context)`
- 🔴 `RedState`
- 🟢 `GreenState`
- 🟡 `YellowState`
- 🚦 `TrafficLightContext` keeps current state and delegates transition via `next()`

#### This keeps the code clean, makes transitions explicit, and allows adding/modifying states without bloating the context class.

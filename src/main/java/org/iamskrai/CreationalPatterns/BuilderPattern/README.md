## 🚀 Problem Statement: Building Complex Objects Cleanly

### 🏗️ Scenario:

#### Imagine you are building a food ordering system where users can customize a burger with multiple options:
✅ Bun type 🍞  
✅ Patty type 🍗/🧀  
✅ Cheese 🧀  
✅ Lettuce 🥬  
✅ Tomato 🍅  
✅ Pickles 🥒  

#### Some fields are required, while many others are optional.

### ⚠️ The Problem:

#### If you try to create `Burger` objects directly using constructors:
- ➡️ Constructor parameters become too many and hard to read
- ➡️ Parameter order is easy to mix up
- ➡️ Multiple overloaded constructors are needed for different combinations

``` Creating complex objects with many optional fields leads to unreadable constructors, duplication, and confusing object creation code 😵‍💫💥! ```

### ✅ Why Builder Pattern Helps:

#### The Builder pattern lets you construct the object step by step using a fluent API:
- 🧱 `new Burger.Builder()`
- ⚙️ Set only what you need (`setBun`, `setPatty`, `setCheese`, ...)
- ✅ Call `build()` when configuration is complete

#### This approach makes object creation clear, maintainable, and scalable when optional parameters increase.

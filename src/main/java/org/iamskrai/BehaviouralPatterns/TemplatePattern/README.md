## 🚀 Problem Statement: Reusing Algorithm Structure with Varying Steps

### 🏗️ Scenario:

#### Imagine you are building a cafe system that prepares different beverages.  
#### Both tea ☕ and coffee ☕ follow a similar preparation process:
✅ Boil water 💧  
✅ Brew the ingredient 🫖  
✅ Pour into cup 🥤  
✅ Add condiments 🍯  

#### The steps are the same, but the implementation of each step differs by beverage type.

### ⚠️ The Problem:

#### In a direct implementation, each beverage class has its own full preparation method:
- ➡️ `Tea.prepare()` - hardcodes tea's full recipe
- ➡️ `Coffee.prepare()` - hardcodes coffee's full recipe
- ➡️ Shared logic like "boil water" and "pour in cup" is duplicated

#### This causes:
- ❌ Code duplication across similar classes
- ❌ Algorithm structure not enforced
- ❌ Hard to modify/extend the common flow

``` Duplicating the same algorithm skeleton in each subclass leads to maintenance nightmares 😵‍💫💥! ```

### ✅ Why Template Method Pattern Helps:

#### Template Method pattern defines the algorithm skeleton in a base class, letting subclasses override specific steps:
- 🧩 `Beverage` abstract class defines `prepareRecipe()` as the template
- 🔒 `boilWater()` and `pourInCup()` are fixed common steps
- 📝 `brew()` and `addCondiments()` are abstract, implemented by subclasses
- ☕ `Tea` implements tea-specific brewing and lemon
- ☕ `Coffee` implements coffee-specific brewing and sugar/milk

#### This keeps the algorithm structure centralized, eliminates duplication, and makes it easy to add new beverage types by just implementing the variable steps.

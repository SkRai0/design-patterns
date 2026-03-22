## 🚀 Problem Statement: Switching Algorithms Without Messy Conditions

### 🏗️ Scenario:

#### Imagine you are building a payment module that supports multiple payment methods:
✅ Credit Card 💳  
✅ PayPal 🅿️  
✅ Bank Transfer 🏦  

#### The system should process payments based on the selected method.

### ⚠️ The Problem:

#### In a direct implementation, `PaymentProcessor` uses multiple if-else checks for each payment type:
- ➡️ `if (CreditCard)`
- ➡️ `else if (PayPal)`
- ➡️ `else if (BankTransfer)`

#### This causes issues:
- ❌ Payment logic is tightly coupled inside one class
- ❌ Adding a new payment method needs changes in existing processor code
- ❌ Violates the Open/Closed Principle

``` As payment options grow, condition-heavy code becomes harder to maintain and extend 😵‍💫💥! ```

### ✅ Why Strategy Pattern Helps:

#### Strategy pattern extracts each payment algorithm into its own class:
- 🧩 `PaymentStrategy` interface defines `pay(amount)`
- 💳 `CreditCardPaymentStrategy`
- 🅿️ `PaypalPaymentStrategy`
- 🏦 `BankTransferPaymentStrategy`

#### `PaymentProcessor` uses composition and can switch strategies at runtime using `setPaymentStrategy(...)`, keeping the code clean, flexible, and scalable.

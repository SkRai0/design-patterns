## 🚀 Problem Statement: Scaling Vehicle Creation with a Single Factory

### 🏗️ Scenario:

#### Imagine your transportation system is growing and now supports multiple vehicle types such as:
✅ Car 🚗  
✅ Truck 🚚  
✅ Bike 🏍️  

#### All vehicles still share common behaviors:
🔹 start() ▶️  
🔹 stop() ⏹️  

### ⚠️ The Problem:

#### In the current approach, one central `VehicleFactory` handles creation logic for every vehicle type:
- ➡️ `car` → Car 🚗
- ➡️ `truck` → Truck 🚛
- ➡️ `bike` → Bike 🏍️

``` As more vehicle types are introduced (for example, Bus or Van), the same factory keeps growing and must be modified repeatedly. This violates the Open/Closed Principle and makes object creation harder to maintain over time 😵‍💫💥! ```

### ✅ Why Abstract Factory Helps:

#### Instead of one overloaded factory, create a dedicated factory per vehicle type:
- 🏭 `CarFactory`
- 🏭 `TruckFactory`
- 🏭 `BikeFactory`

#### This keeps creation logic isolated, easier to extend, and cleaner to maintain without modifying existing factory code.

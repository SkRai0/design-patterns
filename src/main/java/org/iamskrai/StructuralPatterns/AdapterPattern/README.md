## 🚀 Problem Statement: Making Incompatible Device Interfaces Work Together

### 🏗️ Scenario:

#### Imagine you are building a smart room controller.  
#### The room should manage multiple devices such as:
✅ Air Conditioner ❄️  
✅ Smart Light 💡  

#### But each device exposes different method names and connection protocols.

### ⚠️ The Problem:

#### If client code directly talks to every device API:
- ➡️ The client becomes tightly coupled to each device implementation
- ➡️ Every new device requires changes in control logic
- ➡️ Repeated connect/on/off/disconnect flow makes code noisy and hard to maintain

#### Example of incompatibility:
- 🔹 Air Conditioner uses `connectToBluetooth()`
- 🔹 Smart Light uses `connectToWifi()`

``` Managing many incompatible APIs in one client quickly becomes messy 😵‍💫💥! ```

### ✅ Why Adapter Pattern Helps:

#### Adapter pattern converts each incompatible API into one common interface:
- 🧩 `SmartDevice` acts as the target interface (`turnOn()`, `turnOff()`)
- 🔌 Adapters (`AirConditionerAdapter`, `SmartLightAdapter`) translate calls to existing device APIs
- 🏠 Client (`SmartRoom`) works only with `SmartDevice`

#### This keeps client code clean, reduces duplication, and lets you add new devices by creating new adapters instead of changing existing client logic.

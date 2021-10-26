[Here's a PlantUML diagram](https://tiny.amazon.com/6h7beebf/plancorpamazplanformencohtml) of the dependency graph.
PayrollManager is the entry point with our main method, and there are two root objects we will interact with.
`EmployeePaymentDistributor` which has a few dependencies, and a `HumanResourcesClient` which does not have dependencies. 

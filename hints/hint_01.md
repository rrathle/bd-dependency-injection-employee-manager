[Here's a PlantUML diagram](./PayrollManagerDependencyGraph_CD.puml) of the dependency graph.
main.PayrollManager is the entry point with our main method, and there are two root objects we will interact with.
`main.EmployeePaymentDistributor` which has a few dependencies, and a `main.HumanResourcesClient` which does not have dependencies. 

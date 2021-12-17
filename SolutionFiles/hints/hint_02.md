This error could mean any of the following:

* Make sure to use @Inject on a constructor where an object is being supplied by Dagger. 
* Dagger must also know how to create that object. Either use @Inject on a relevant constructor that will supply that
 object, or provide it in the `main.BankClientModule`. 
* If you use provde it in the `main.BankClientModule`, make sure the `main.PayrollManagerComponent`'s `@Component` annotation
 includes `main.BankClientModule.class` in the `modules` parameter. (Similar to how we give a table name to the
  `@DynamoDBTable` annotation like `@DynamoDBTable(tablename = "TableName"))
* Read the errors closely to see which classes Dagger is indicating are missing the relevant annotations, and where
 in the dependency graph that class is needed.

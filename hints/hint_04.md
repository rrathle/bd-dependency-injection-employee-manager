You may have annotated a constructor with both `@Inject` and `@Singleton`. If you want Dagger to create an object
 with singleton scope outside of a Dagger module and provider method, you can annotate the class with `@Singleton
 `, as long as it's constructor is annotated with `@Inject`. Remember to also annotate the component with `@Singleton`!

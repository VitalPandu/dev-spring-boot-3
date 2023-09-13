	Bean Sopes
--------------------------
- Scope refers to the lifecycle of a bean
  - How long does the bean live ?
  - How many instances are created ?
  - how is the bean shared ?

Note:- Default scope in spring is "SINGLETON"

What is singleton?
- Spring Container creates only one instance of the bean by default,
- It is cached in memory
- All dependecy injections for the bean
 ->will reference the SAME bean

Both point to the same Instance

For Explicitly specifying Bean Scope use 
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

	Additional Spring Bean Scopes
--------------------------------------------------------
Singleton  => creates a single shared instance of the bean. Default scope
Prototype  => creates a new bean intance for each container request
request    => Scoped to an HTTP we request. Only Used for wep apps.
session    => Scoped to an HTTP web session. Only Used for web apps.
global-sessions => Scoped to a global HTTP web session. only used for web apps
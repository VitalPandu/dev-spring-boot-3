	Bean Life Cycle
--------------------------------

container started  -> Bean Instantiated -> Dependecies Injected -> internal spring processing  -> Your Custom init method(Bean is ready for use)-> container is shutdown -> your custom destroy method(if any) -> stop

	Bean Lifecycle Methods/Hooks
-----------------------------------------

-You can add custom code during bean initialization
 -> Calling custom business logic methods
 -> Setting up handles to resources(db,sockets,file etc)

- You can add custom code during bean destruction
 ->Calling custom business logic method
 -> Clean up handles to resources (db, sockets,files etc)


	Init: method configuration
-----------------------------------------------
With the help of @PostConstruct annotation we can define our init method logic.

	Destroy: method configuration
---------------------------------------------------
With the help of @PreDestroy annotation we can define our destroy method logic
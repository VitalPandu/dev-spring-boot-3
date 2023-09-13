@Lazy - annotation

By Default, when your application starts, all beans are initialized

spring will create an instance of each and make them available

Lazy Initialization
----------------------------

- Instead of creating all beans up front, we can specify lazy initialization
- A bean will only be created in the following cases
  -> It is neede for dependecy Injection
  -> or it is explicitly requested

- Add the @Lazy annotation to given call to acheive the above steps (for class level)

- Add "spring.main.lazy-initialization=true" in properties file of yaml file.(global level)

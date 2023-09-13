	JPA Devlopment process
---------------------------------------
By Default, Hibernate is the default JPA implementation in spring boot

	Entity Class
------------------------------------------
Java class that is mapped to database table

-At a minimum, the Entity class
 -Must be annotated with @Entity
 -Must have a public or proteced no-argument constructor
  -> The class can have other constructors


	Object-to-Relational mapping(ORM)
-----------------------------------------------

JAVA class 				DataBase
int id ---------->JPA --------------->id INT

	JAVA Annotations
------------------------------------
Step1: Map Class to database table
Step2: Map fields to database columns

Note: @Column annotation is optional(but not recommended)

Primary key --> Uniqueily identifies each row in a table Must be unique value cannot contain NULL vaules

MYSQL-Auto increment
------------------------------
Ex:-
create TAble student{
	id int NOT NULL AUTO_INCREMENT, //Automatic increment of id
	first_name varchar(45) Default NUll

}

JPA Identity- primary key 
we have to provide @Id annotation.
@GeneratedValue(strategy=GenerationType.IDENTITY)


ID Generation strategies
------------------------------------------
GenerationType.AUTO  --> Pick an appropriate strategy for the particular database
GenerationType.IDENTITY --> Assign Primary keys using database identity column(recomended)
GenerationType.SEQUENCE --> Assign primary keys using a database sequence
GenerationType.TABLE --> Assign primary keys using an underlying database table to ensure uniqueness

Custom Generation strategies
-------------------------------------------
- create implementation of org.hibernate.id.IdentifierGenerator
- override the method: "public Serializable generate(---)" we provide own business logic

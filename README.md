# Hibernate workshop examples
Bit and bobs that I use to run a JPA/Hibernate workshop. The code uses maven and Spring to run the 
example mappings

## What is included in the tin?
Nothing too wild
* One to One
* One to Many / Many to One 
* Many to Many
* Embedded
* Secondary table
* Inheritance
* Lazy fetching
* Queries
    * JPQL
    * Named queries
    * Spring Data
    * Native SQL
* Optimistic locking
* Composite keys (in progress)


## TODO
* Add more examples of composite keys
* Add examples of ternary keys
* The two above with mixed with associations
* User types (including user types for Id fields)
* Caching
* Examples of bad TX management with Spring
* Examples of bad equals/hashcode
* Examples of slow queries (eg. 'ignore case')

# References
* [JPA 2.1 spec](http://download.oracle.com/otndocs/jcp/persistence-2_1-fr-eval-spec/index.html)
* [Hibernate ORM manual (4.3)](https://docs.jboss.org/hibernate/orm/4.3/manual/en-US/html_single/)
* [Hibernate/JPA annotations](https://docs.jboss.org/ejb3/app-server/HibernateAnnotations/reference/en/html_single/index.html)
* [Spring data (1.8.0)](http://docs.spring.io/spring-data/jpa/docs/1.8.0.RELEASE/reference/html/)
* [Spring manual](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/)
* [JPQL reference](http://docs.oracle.com/cd/E11035_01/kodo41/full/html/ejb3_langref.html)
* [What’s new in JPA 2.1](https://blogs.oracle.com/theaquarium/entry/jpa_2_1_entity_graphs)
* [Entity Graphs tutorial](https://docs.oracle.com/javaee/7/tutorial/persistence-entitygraphs.htm)

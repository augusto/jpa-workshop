insert into JPQL_CUSTOMER(CUSTOMER_ID, NAME) values(null, 'John');
insert into JPQL_CUSTOMER(CUSTOMER_ID, NAME) values(null, 'Carl');
insert into JPQL_CUSTOMER(CUSTOMER_ID, NAME) values(null, 'Paul');

insert into JPQL_PRODUCT(PRODUCT_ID, NAME, PRICE) values(null, 'Halloween scary latte', 4.55);
insert into JPQL_PRODUCT(PRODUCT_ID, NAME, PRICE) values(null, 'Explosive meringue', 2.31);
insert into JPQL_PRODUCT(PRODUCT_ID, NAME, PRICE) values(null, 'Tuna-flavoured chocolate', 1.20);
insert into JPQL_PRODUCT(PRODUCT_ID, NAME, PRICE) values(null, 'Toffee spaghetti', 1.20);

insert into JPQL_ORDER(ORDER_ID, CUSTOMER_ID, PLACED_AT) values(null, 1, '2015-01-02 17:12:55');
insert into JPQL_ORDER(ORDER_ID, CUSTOMER_ID, PLACED_AT) values(null, 2, '2015-03-12 11:51:21');
insert into JPQL_ORDER(ORDER_ID, CUSTOMER_ID, PLACED_AT) values(null, 3, '2015-03-22 02:43:39');

insert into JPQL_ORDER_PRODUCT(ORDER_ID, PRODUCT_ID) values(1,1);
insert into JPQL_ORDER_PRODUCT(ORDER_ID, PRODUCT_ID) values(1,2);
insert into JPQL_ORDER_PRODUCT(ORDER_ID, PRODUCT_ID) values(1,3);

insert into JPQL_ORDER_PRODUCT(ORDER_ID, PRODUCT_ID) values(2,1);
insert into JPQL_ORDER_PRODUCT(ORDER_ID, PRODUCT_ID) values(2,2);

insert into JPQL_ORDER_PRODUCT(ORDER_ID, PRODUCT_ID) values(3,1);
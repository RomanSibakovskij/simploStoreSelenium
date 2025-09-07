# SimploStoreSelenium

Simple Selenium test suite on user account registration/login/logout, account information update, user address addition, single category product display view, product addition (removal from) to product wishlist, product addition to cart/checkout. The test suite captures screenshots at the end of test case run (for logging purposes). There can occur soe instabilities of the test due to the unstable backend (product scroll buttons fail to be clicked, random 503 errors).

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test Case List

//user navigation to register modal test

1.	//Test 001 -> user navigation to register modal test

//valid user account creation test

1.	//Test 002 -> valid user account creation test

//invalid user account creation tests

//no singular input

1.	//Test 002a -> invalid user account creation test - no first name (the error wasn't triggered)
2.	//Test 002b -> invalid user account creation test - no last name(the error wasn't triggered)
3.	//Test 002c -> invalid user account creation test - no email (the error wasn't triggered)
4.	//Test 002d -> invalid user account creation test - no password/confirm password (the error wasn't triggered)


//too short singular input

1.	//Test 002e -> invalid user account creation test - too short first name (1 char) (the user account gets created, test has failed)
2.	//Test 002f -> invalid user account creation test - too short last name (1 char) (the user account gets created, test has failed)
3.	//Test 002g -> invalid user account creation test - too short email (1 char -> name, domain) (the user account gets created, test has failed)
4.	//Test 002h -> invalid user account creation test - too short password/confirm password (7 chars)


//too long singular input

1.	//Test 002i -> invalid user account creation test - too long first name (100 chars) (the user account gets created, test has failed)
2.	//Test 002j -> invalid user account creation test - too long last name (100 chars) (the user account gets created, test has failed)
3.	//Test 002k -> invalid user account creation test - too long email (100 chars -> name, domain) (the user account gets created, test has failed)
4.	//Test 002l -> invalid user account creation test - too long password/confirm password (75 chars)


//invalid singular input format

1.	//Test 002m -> invalid user account creation test - invalid first name format (special symbols only) (the user account gets created, test has failed)
2.	//Test 002n -> invalid user account creation test - invalid last name format (special symbols only) (the user account gets created, test has failed)
3.	//Test 002o -> invalid user account creation test - invalid email input format (missing '@')
4.	//Test 002p -> invalid user account creation test - existing email (used beforehand in manual testing) (the user account gets created, test has failed)
5.	//Test 002q -> invalid user account creation test - invalid password/confirm password input format (lowercase only) (the user account gets created, test has failed)
6.	//Test 002r -> invalid user account creation test - mismatching confirm password (the user account gets created, test has failed)


//valid edit user account information tests

1.	//Test 003 -> valid edit user account information (with login email) test
2.	//Test 003a -> valid edit user account password test


//invalid edit user account information tests

//no singular input

1.	//Test 003b -> invalid edit user account information test - no edited first name  (the error wasn't triggered)
2.	//Test 003c -> invalid edit user account information test - no edited last name (the error wasn't triggered)
3.	//Test 003d -> invalid edit user account information test - no edited email (the error wasn't triggered)
4.	//Test 003e -> invalid edit user account information test - no user password (the error wasn't triggered)


//too short singular input

1.	//Test 003f -> invalid edit user account information test - too short edited first name (1 char) (the error wasn't triggered, test has failed)
2.	//Test 003g -> invalid edit user account information test - too short edited last name (1 char) (the error wasn't triggered, test has failed)
3.	//Test 003h -> invalid edit user account information test - too short edited email (1 char -> name, domain) (the error wasn't triggered, test has failed)
4.	//Test 003i -> invalid edit user account information test - too short user password/confirm password (7 chars)


//too long singular input

1.	//Test 003j -> invalid edit user account information test - too long edited first name (100 chars) (the error wasn't triggered, test has failed)
2.	//Test 003k -> invalid edit user account information test - too long edited last name (100 chars) (the error wasn't triggered, test has failed)
3.	//Test 003l -> invalid edit user account information test - too long edited email (100 chars -> name, domain) (the error wasn't triggered, test has failed)
4.	//Test 003m -> invalid edit user account information test - too long user password/confirm password (75 chars) (the error wasn't triggered, test has failed)


//invalid singular input format

1.	//Test 003n -> invalid edit user account information test - invalid edited first name format (special symbols only) (the error wasn't triggered, test has failed)
2.	//Test 003o -> invalid edit user account information test - invalid edited last name format (special symbols only) (the error wasn't triggered, test has failed)
3.	//Test 003p -> invalid edit user account information test - invalid edited email format (missing '@')
4.	//Test 003q -> invalid edit user account information test - existing email (used beforehand in manual testing)
5.	//Test 003r -> invalid edit user account information test - invalid user password
6.	//Test 003s -> invalid edit user account information test - invalid user password/confirm password format (lowercase only) (the error wasn't triggered, test has failed)
7.	//Test 003t -> invalid edit user account information test - mismatching confirm password


//user account removal test

1.	//Test 004 -> valid user account removal test


//valid add user address test

1.	//Test 005 -> valid add user address test (address fails to be added due to inability to select country code)


//invalid add user address tests (due to absence of country code options in dropdown menu, all address addition attempts will fail)

//no singular input

1.	//Test 005a -> invalid add user address test - no first name
2.	//Test 005b -> invalid add user address test - no last name
3.	//Test 005c -> invalid add user address test - no street
4.	//Test 005d -> invalid add user address test - no zip code
5.	//Test 005e -> invalid add user address test - no city
6.	//Test 005f -> invalid add user address test - no country code
7.	//Test 005g -> invalid add user address test - no phone
8.	//Test 005h -> invalid add user address test - no country


//too short singular input

1.	//Test 005i -> invalid add user address test - too short first name (1 char) (the error wasn't triggered, test has failed)
2.	//Test 005j -> invalid add user address test - too short last name (1 char) (the error wasn't triggered, test has failed)
3.	//Test 005k -> invalid add user address test - too short street (3 chars) (the error wasn't triggered, test has failed)
4.	//Test 005l -> invalid add user address test - too short zip code (4 digits) (the error wasn't triggered, test has failed)
5.	//Test 005m -> invalid add user address test - too short city (2 chars)
6.	//Test 005n -> invalid add user address test - too short phone (2 digits) (the error wasn't triggered, test has failed)


//too long singular input

1.	//Test 005o -> invalid add user address test - too long first name (100 chars) (the error wasn't triggered, test has failed)
2.	//Test 005p -> invalid add user address test - too long last name (100 chars) (the error wasn't triggered, test has failed)
3.	//Test 005q -> invalid add user address test - too long street (100 chars) (the error wasn't triggered, test has failed)
4.	//Test 005r -> invalid add user address test - too long zip code (6 digits) (the error wasn't triggered, test has failed)
5.	//Test 005s -> invalid add user address test - too long city (100 chars) (the error wasn't triggered, test has failed)
6.	//Test 005t -> invalid add user address test - too long phone (30 digits) (the error wasn't triggered, test has failed)


//invalid singular input format

1.	//Test 005u -> invalid add user address test - invalid first name format (special symbols only) (the error wasn't triggered, test has failed)
2.	//Test 005v -> invalid add user address test - invalid last name format (special symbols only) (the error wasn't triggered, test has failed)
3.	//Test 005w -> invalid add user address test - invalid street format (special symbols only) (the error wasn't triggered, test has failed)
4.	//Test 005x -> invalid add user address test - invalid zip code format (special symbols only) (the error wasn't triggered, test has failed)
5.	//Test 005y -> invalid add user address test - invalid city format (special symbols only) (the error wasn't triggered, test has failed)
6.	//Test 005z -> invalid add user address test - invalid phone format (special symbols only) (the error wasn't triggered, test has failed)


//valid user logout test

1.	//Test 006 -> valid user logout test

//valid user login tests

1.	//Test 007 -> valid user login test
2.	//Test 007a -> valid user login test - edited login email
3.	//Test 007b -> valid user login test - edited login password

//invalid user login tests

//no singular input

1.	//Test 007c -> invalid user login test - no login email
2.	//Test 007d -> invalid user login test - no login password

//invalid singular input

1.	//Test 007e -> invalid user login test - invalid login email
2.	//Test 007f -> invalid user login test - invalid login email format (missing '@')
3.	//Test 007g -> invalid user login test - invalid login password

//valid chosen product(s) add to cart tests

1.	//Test 008 -> add single chosen product ("Polštář Furniture") to cart test - as a guest
2.	//Test 008a -> add single chosen product ("Polštář Furniture") to cart test - as a registered user
3.	//Test 008b -> add multiple chosen products ("Polštář Furniture") to cart test - as a guest
4.	//Test 008c -> add multiple chosen products ("Polštář Furniture") to cart test - as a registered user

//update product count in shopping cart modal test

1.	//Test 009 -> update product count in shopping cart modal test
2.	//Test 009a -> remove product from shopping cart modal test


//single category dashboard page product(s) add to cart tests

1.	//Test 010 -> add single category single product ("Manželská postel") to cart test - as a guest
2.	//Test 010a -> add single category single product ("Odkládací stolek") to cart test - as a registered user
3.	//Test 010b -> add single category multiple product ("Konferenční stolek", "Knihovna - 3 police") to cart test - as a guest
4.	//Test 010c -> add single category multiple products ("Dětská postýlka", "Polštář") to cart test - as a registered user

//searched product(s) add to cart tests

1.	//Test 011 -> add single searched product ("Rohová pohovka") to cart test - as a guest 
2.	//Test 011a -> add single searched product ("Knihovna - 3 police") to cart test - as a registered user
3.	//Test 011b -> add multiple searched products ("Rohová pohovka") to cart test - as a guest 
4.	//Test 011c -> add multiple searched products ("Knihovna - 3 police") to cart test - as a registered user

//add product(s) to wishlist tests (only registered users have this feature) 

1.	//Test 012 -> add set category product ("Manželská postel") to wishlist test - as a registered user (the product failed to be added to wishlist, test has failed)
2.	//Test 012a -> add set category products ("Manželská postel", "Knihovna - 10 polic", "Rohová pohovka") to wishlist test - as a registered user 
3.	//Test 012b -> add set category products ("Manželská postel", "Knihovna - 10 polic", "Rohová pohovka") to cart from wishlist test - as a registered user 

//add product review for a set searched product(s) add to cart tests

1.	//Test 013 -> add review for a single searched product ("Rohová pohovka") test - as a guest
2.	//Test 013a -> add review for a single searched product ("Rohová pohovka") test - as a registered user (due to network / laggy backend issues, test can fail)

//invalid add product review for a set searched product(s) add to cart tests

//no singular input

1.	//Test 013b -> invalid add review for a single searched product ("Rohová pohovka") test - no review stars
2.	//Test 013c -> invalid add review for a single searched product ("Rohová pohovka") test - no review author
3.	//Test 013d -> invalid add review for a single searched product ("Rohová pohovka") test - no review

//too short singular input

1.	//Test 013e -> invalid add review for a single searched product ("Rohová pohovka") test - too short review author (1 char) (the error wasn't triggered, test has failed)
2.	//Test 013f -> invalid add review for a single searched product ("Rohová pohovka") test - too short review (1 char) (the error wasn't triggered, test has failed)

//too long singular input

1.	//Test 013g -> invalid add review for a single searched product ("Rohová pohovka") test - too long review author (201 chars)
2.	//Test 013h -> invalid add review for a single searched product ("Rohová pohovka") test - too long review (10001 chars) (the error wasn't triggered, test has failed)

//invalid singular input

1.	//Test 013i -> invalid add review for a single searched product ("Rohová pohovka") test - invalid review author format (special symbols only) (the error wasn't triggered, test has failed)
2.	//Test 013j -> invalid add review for a single searched product ("Rohová pohovka") test - invalid review format (special symbols only) (the error wasn't triggered, test has failed)

//chosen product(s) add to checkout tests

1.	//Test 014 -> add single chosen product ("Polštář Furniture") to check out test - as a guest
2.	//Test 014a -> add single chosen product ("Polštář Furniture") to check out test - as a registered user
3.	//Test 014b -> add multiple chosen products ("Polštář Furniture") to check out test - as a guest
4.	//Test 014c -> add multiple chosen products ("Polštář Furniture") to check out test - as a registered user

//single category dashboard page product(s) add to check out tests

1.	//Test 015 -> add single category single product ("Manželská postel") to check out test - as a guest
2.	//Test 015a -> add single category single product ("Odkládací stolek") to check out test - as a registered user
3.	//Test 015b -> add single category multiple product ("Konferenční stolek", "Knihovna - 3 police") to check out test - as a guest
4.	//Test 015c -> add single category multiple products ("Dětská postýlka", "Polštář") to check out test - as a registered user

//searched product(s) add to check out tests

1.	//Test 016 -> add single searched product ("Rohová pohovka") to check out test - as a guest 
2.	//Test 016a -> add single searched product ("Knihovna - 3 police") to check out test - as a registered user
3.	//Test 016b -> add multiple searched products ("Rohová pohovka") to cart test - as a guest 
4.	//Test 016c -> add multiple searched products ("Knihovna - 3 police") to check out test - as a registered user

//add product from wishlist to check out test

1.	//Test 017 -> add set category products ("Manželská postel", "Knihovna - 10 polic") to check out from wishlist test - as a registered user (sometimes the product fails to be added to wishlist)

//update product quantity in shopping cart test (both guest and registered user have the same output, so guest branch is being tested to avoid redundancy)

1.	//Test 018 -> update product quantity in shopping cart page test

//valid chosen product(s) checkout confirmation tests

1.	//Test 019 -> single chosen product ("Polštář Furniture") checkout confirmation test - as a guest (the country code dropdown menu is empty, test has failed)
2.	//Test 019a -> single chosen product ("Polštář Furniture") checkout confirmation test - as a registered user (the country code dropdown menu is empty, test has failed)
3.	//Test 019b -> multiple chosen products ("Polštář Furniture") check out confirmation test - as a guest (the country code dropdown menu is empty, test has failed)
4.	//Test 019c -> multiple chosen products ("Polštář Furniture") check out confirmation test - as a registered user (the country code dropdown menu is empty, test has failed)

//single category dashboard page product(s) check out confirmation tests

1.	//Test 020 -> single category single product ("Manželská postel") check out confirmation test - as a guest (the country code dropdown menu is empty, test has failed)
2.	//Test 020a -> single category single product ("Odkládací stolek") check out confirmation test - as a registered user (the country code dropdown menu is empty, test has failed)
3.	//Test 020b -> single category multiple products ("Konferenční stolek", "Knihovna - 3 police") ("Go Pay") check out confirmation test - as a guest (the country code dropdown menu is empty, test has failed)
4.	//Test 020c -> single category multiple products ("Dětská postýlka", "Polštář") check out confirmation test - as a registered user (the country code dropdown menu is empty, test has failed)

//add product from wishlist check out confirmation test

1.	//Test 021 -> set category products ("Manželská postel", "Knihovna - 10 polic") check out confirmation from wishlist test - as a registered user (the country code dropdown menu is empty, test has failed)

//invalid chosen product checkout confirmation tests

//no singular input

1.	//Test 022 -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing email
2.	//Test 022a -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing first name (the first name error doesn't get triggered)
3.	//Test 022b -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing last name (the last name error doesn't get triggered)
4.	//Test 022c -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing street (the street error doesn't get triggered)
5.	//Test 022d -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing city (the city error doesn't get triggered)
6.	//Test 022e -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing country (the country error doesn't get triggered)
7.	//Test 022f -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing zip code (the zip code error doesn't get triggered)
8.	//Test 022g -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing country code (the country code error doesn't get triggered)
9.	//Test 022h -> invalid single product ("Polštář Furniture") checkout confirmation test - no billing phone (the phone error doesn't get triggered)
10.	//Test 022i -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping first name (the shipping first name error doesn't get triggered)
11.	//Test 022j -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping last name (the shipping last name error doesn't get triggered)
12.	//Test 022k -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping street (the shipping street error doesn't get triggered)
13.	//Test 022l -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping city (the shipping city error doesn't get triggered)
14.	//Test 022m -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping country (the shipping country error doesn't get triggered)
15.	//Test 022n -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping zip code (the shipping zip code error doesn't get triggered)
16.	//Test 022o -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping country code (the shipping country code error doesn't get triggered)
17.	//Test 022p -> invalid single product ("Polštář Furniture") checkout confirmation test - no shipping phone (the shipping phone error doesn't get triggered)

//invalid chosen product checkout confirmation tests

//too short singular input

1.	//Test 022q -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing email (1 char -> name, domain) (too short email error doesn't get triggered)
2.	//Test 022r -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing first name (1 char) (too short first name error doesn't get triggered)
3.	//Test 022s -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing last name (1 char) (too short last name error doesn't get triggered)
4.	//Test 022t -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing street (3 chars) (too short street error doesn't get triggered)
5.	//Test 022u -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing city (2 chars) (too short city error doesn't get triggered)
6.	//Test 022v -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing zip code (4 digits) (too short zip code error doesn't get triggered)
7.	//Test 022w -> invalid single product ("Polštář Furniture") checkout confirmation test - too short billing phone (2 digits)
8.	//Test 022x -> invalid single product ("Polštář Furniture") checkout confirmation test - too short shipping first name (1 char) (too short shipping first name error doesn't get triggered)
9.	//Test 022y -> invalid single product ("Polštář Furniture") checkout confirmation test - too short shipping last name (1 char) (too short shipping last name error doesn't get triggered)
10.	//Test 022z -> invalid single product ("Polštář Furniture") checkout confirmation test - too short shipping street (3 chars) (too short shipping street error doesn't get triggered)
11.	//Test 022aa -> invalid single product ("Polštář Furniture") checkout confirmation test - too short shipping city (3 chars) (too short shipping city error doesn't get triggered)
12.	//Test 022ab -> invalid single product ("Polštář Furniture") checkout confirmation test - too short shipping zip code (4 digits)
13.	//Test 022ac -> invalid single product ("Polštář Furniture") checkout confirmation test - too short shipping phone (2 digits) (too short shipping zip code error doesn't get triggered)

//invalid chosen product checkout confirmation tests

//too long singular input

1.	//Test 022ad -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing email (100 chars -> name, domain)
2.	//Test 022ae -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing first name (100 chars)
3.	//Test 022af -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing last name (100 chars)
4.	//Test 022ag -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing street (100 chars)
5.	//Test 022ah -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing city (100 chars)
6.	//Test 022ai -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing zip code (6 digits)
7.	//Test 022aj -> invalid single product ("Polštář Furniture") checkout confirmation test - too long billing phone (30 digits)
8.	//Test 022ak -> invalid single product ("Polštář Furniture") checkout confirmation test - too long shipping first name (100 chars)
9.	//Test 022al -> invalid single product ("Polštář Furniture") checkout confirmation test - too long shipping last name (100 chars)
10.	//Test 022am -> invalid single product ("Polštář Furniture") checkout confirmation test - too long shipping street (100 chars)
11.	//Test 022an -> invalid single product ("Polštář Furniture") checkout confirmation test - too long shipping city (100 chars)
12.	//Test 022ao -> invalid single product ("Polštář Furniture") checkout confirmation test - too long shipping zip code (6 digits) (the too long zip code error wasn't triggered)
13.	//Test 022ap -> invalid single product ("Polštář Furniture") checkout confirmation test - too long shipping phone (30 digits)

//invalid chosen product checkout confirmation tests

//invalid singular input

1.	//Test 022aq -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing email format (missing '@')
2.	//Test 022ar -> invalid single product ("Polštář Furniture") checkout confirmation test - existing email (used beforehand in manual testing) (the existing email input error wasn't triggered)
3.	//Test 022as -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing first name format (special symbols only) (the invalid first name input format error wasn't triggered)
4.	//Test 022at -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing last name format (special symbols only) (the invalid last name input format error wasn't triggered)
5.	//Test 022au -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing street format (special symbols only) (the invalid street input format error wasn't triggered)
6.	//Test 022av -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing city format (special symbols only) (the invalid city input format error wasn't triggered)
7.	//Test 022aw -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing zip code format (special symbols only) (the invalid zip code input format error wasn't triggered)
8.	//Test 022ax -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid billing phone format (special symbols only)
9.	//Test 022ay -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping first name format (special symbols only) (the invalid shipping first name input format error wasn't triggered)
10.	//Test 022az -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping last name format (special symbols only) (the invalid shipping last name input format error wasn't triggered)
11.	//Test 022aaa -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping street format (special symbols only) (the invalid shipping street input format error wasn't triggered)
12.	//Test 022aab -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping city format (special symbols only) (the invalid shipping city input format error wasn't triggered)
13.	//Test 022aac -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping zip code format (special symbols only)  (the invalid shipping zip code input format error wasn't triggered)
14.	//Test 022aad -> invalid single product ("Polštář Furniture") checkout confirmation test - invalid shipping phone format (special symbols only)

package cz.simploshop.demo.utilities;

import org.openqa.selenium.*;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.*;

public class TestDataGenerator extends BasePage{

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final Random RANDOM = new SecureRandom();

    private static String storedFirstName;
    private static String storedLastName;
    private static String emailAddress;
    private static String password;
    private static String storedReview;

    public TestDataGenerator(WebDriver driver) {super(driver);}

    // first names array
    private static final String[] firstNames = {
            "Aiden", "Liam", "Noah", "Elijah", "Lucas", "Mason", "Ethan", "James", "Benjamin", "Jack",
            "Henry", "Alexander", "Jackson", "Sebastian", "Owen", "Matthew", "William", "Joseph", "Luke", "Daniel",
            "Logan", "David", "Samuel", "John", "Ryan", "Leo", "Nathan", "Isaac", "Joshua", "Caleb",
            "Olivia", "Emma", "Ava", "Sophia", "Isabella", "Mia", "Amelia", "Harper", "Evelyn", "Abigail",
            "Ella", "Avery", "Scarlett", "Grace", "Lily", "Chloe", "Zoey", "Penelope", "Hannah", "Aria",
            "Ellie", "Madison", "Nora", "Riley", "Lillian", "Paisley", "Aurora", "Addison", "Brooklyn", "Leah",
            "Savannah", "Sofia", "Lucy", "Victoria", "Willow", "Violet", "Zoe", "Stella", "Hazel", "Emilia",
            "Claire", "Bella", "Maya", "Elena", "Piper", "Ariana", "Ruby", "Madelyn", "Alice", "Skylar",
            "Hunter", "Andrew", "Connor", "Carter", "Eli", "Wyatt", "Dylan", "Grayson", "Landon", "Gabriel",
            "Jayden", "Anthony", "Christian", "Julian", "Aaron", "Dominic", "Adam", "Evan", "Nicholas", "Isaiah"
    };

    //last names array
    private static final String[] lastNames = {
            "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
            "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
            "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "King", "Wright",
            "Scott", "Torres", "Nguyen", "Hill", "Flores", "Green", "Adams", "Nelson", "Baker", "Gonzalez",
            "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards",
            "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy",
            "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray",
            "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes",
            "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores",
            "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz",
            "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Woods", "Cole", "West",
            "Jordan", "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "McDonald", "Cruz", "Marshall"
    };

    // array of Illinois state cities
    private static final String[] ILLINOIS_CITIES = {
            "Chicago", "Aurora", "Naperville", "Joliet", "Rockford", "Springfield",
            "Elgin", "Peoria", "Champaign", "Waukegan", "Cicero", "Bloomington",
            "Arlington Heights", "Evanston", "Decatur", "Schaumburg", "Bolingbrook",
            "Palatine", "Skokie", "Des Plaines", "Orland Park", "Tinley Park",
            "Oak Lawn", "Berwyn", "Mount Prospect", "Normal", "Wheaton", "Hoffman Estates",
            "Oak Park", "Downers Grove", "Elmhurst", "Glenview", "DeKalb", "Lombard",
            "Moline", "Buffalo Grove", "Bartlett", "Urbana", "Crystal Lake", "Quincy",
            "Streamwood", "Carol Stream", "Romeoville", "Plainfield", "Hanover Park",
            "Carpentersville", "Wheeling", "Park Ridge", "Addison", "Calumet City"
    };

    //Illinois street types array
    private static final String[] STREET_TYPES = {"St.", "Ave.", "Blvd.", "Rd.", "Ln.", "Dr.", "Ct.", "Pl."};

    //reviews array
    private static final String[] PRODUCT_REVIEWS = {
            "This sofa is absolutely perfect for our living room. The cushions are plush, and the fabric is soft yet durable. We've received countless compliments!",
            "I ordered my usual size for the bed frame, but it was far too short for a standard mattress. Very odd dimensions and difficult to assemble.",
            "I didn't have high hopes at this price point, but this dining table absolutely blew me away. The craftsmanship and wood finish are impressive!",
            "For the premium price, I expected much better materials. The armchair looked worn after just a few weeks. Definitely not worth what I paid.",
            "Hosted a dinner party with this new dining set and felt so proud. It looks elegant and was comfortable for everyone all night!",
            "The shelves are much thinner than they appeared online and started bowing after adding just a few books. Disappointing quality.",
            "If you're on the fence about this coffee table, just get it! It's solid, stylish, and has become the centerpiece of our living room.",
            "The wardrobe design is lovely, but the internal compartments were completely off. Had to return it twice to get a properly aligned one.",
            "I've bought a lot of furniture recently, but this console table is by far my favorite. The design is modern and fits my space perfectly.",
            "The 'oak' finish I received looks nothing like the rich tone shown online. It's dull and leans more orange in person.",
            "This media unit has a timeless design. The soft-close drawers and matte finish make it look far more expensive than it was.",
            "The joints started creaking after just a few uses. Closer inspection revealed poorly secured screws and uneven legs.",
            "I used this ergonomic office chair for 10-hour workdays and stayed comfortable the entire time. No backaches or readjusting needed!",
            "I'm 6'2\" and this desk barely reaches a comfortable height. What's advertised as standard-sized is very low for taller individuals.",
            "I can style this bookshelf in multiple ways — with decor, books, or plants. It’s now the most versatile piece in my home.",
            "The drawer sliders broke the second time I used the dresser. Completely split open while storing clothes — very frustrating!",
            "Had an issue with the delivery, but the customer service team sent a replacement immediately. They even upgraded my shipping for free!",
            "The design of the cabinet feels very outdated, like something from decades ago. It clashes with the rest of my decor.",
            "The carved wood detailing on this headboard is exquisite. It adds a luxurious touch without being over the top.",
            "I usually order standard dimensions, but had to go up significantly in size with this desk. The sizing chart was totally misleading.",
            "This sectional sofa is my go-to for movie nights, guests, and lazy Sundays. It's universally comfortable and looks luxurious.",
            "The fabric attracts wrinkles and lint like crazy. I spend more time cleaning this couch than relaxing on it.",
            "The curved backrest on the dining chairs is both stylish and supportive. I feel comfortable and classy every time I sit.",
            "The white finish on this coffee table stains easily and shows every fingerprint. Had to return it — totally impractical.",
            "A storage bench with actual usable compartments! This shouldn’t be revolutionary, but somehow it is. Plus it’s beautiful!",
            "The wooden slats on the bedframe dig into the mattress awkwardly. I had to add extra padding just to sleep comfortably.",
            "The material quality surpassed expectations. It’s sturdy, scratch-resistant, and has a luxurious, smooth finish.",
            "The ottoman height is awkward and makes the whole set look unbalanced. I suspect the product photos were edited or propped.",
            "Initially seemed overpriced, but after using it daily for two years and still getting compliments, it was worth every cent.",
            "They're charging designer prices for what feels like laminated particle board. You can find better at local shops for less.",
            "The detailed woodwork on this accent table elevates it from basic to breathtaking. The scalloped edges are a nice touch.",
            "The photos made this couch look plush and premium, but in person it feels flat and underfilled. Construction quality is poor.",
            "This bed frame has a classic silhouette that won’t go out of style. I’ll be using it for years — definitely a solid investment.",
            "Followed the care instructions exactly, but the veneer bubbled after one wipe-down. Very disappointing.",
            "The bookshelf arrived exactly as described. Dimensions, color, and finish all matched the listing perfectly.",
            "I measured carefully, but this console table still didn’t fit properly. Had to hire someone to customize it for my space.",
            "Ordered on Monday and the sofa arrived by Wednesday! Impressive speed and great packaging, too.",
            "The cushion foam holds indentations and won’t spring back. I’ve tried fluffing and rotating, but nothing helps.",
            "After two years of regular use, this chair still looks brand new. Really impressed by the build quality.",
            "The nightstand drawer completely fell out after one use. Then the legs wobbled. Literally falling apart.",
            "Loved the eco-friendly packaging — no plastic, all recyclable. It's clear they care about sustainability.",
            "Tried to return a damaged product within the window but was denied because I opened the box. How else was I supposed to inspect it?",
            "This elegant dining set made me feel like I was hosting royalty. The wood grain is gorgeous and table feels solid and grand.",
            "According to the measurements I needed a medium-sized desk, but it was enormous. Exchanged for a smaller one and now it's perfect.",
            "Finally found a sofa that supports a taller frame without cutting into the knees. Great for long legs and wide frames.",
            "The faux leather on this armchair is stiff and gave me a rash. Had to add a throw blanket just to sit comfortably.",
            "The cotton-linen fabric on this lounge chair is ideal for summer. Stayed cool during a heatwave with no sweating.",
            "Ordered 'Espresso Brown' but got something closer to black. Not the warm tone I expected based on the listing.",
            "Every time guests come over, they comment on this coffee table. It’s become the signature piece of our living room.",
            "Complete waste of money. The product looked nothing like the photos, arrived damaged, and customer service was useless. Avoid!"
    };

    //random first name picker method
    public static String getRandomFirstName() {
        if (storedFirstName == null) {
            Random random = new Random();
            storedFirstName = firstNames[random.nextInt(firstNames.length)];
        }
        return storedFirstName;
    }
    //random last name picker method
    public static String getRandomLastName() {
        if (storedLastName == null) {
            Random random = new Random();
            storedLastName = lastNames[random.nextInt(lastNames.length)];
        }
        return storedLastName;
    }

    //generate random string methods
    private static String generateRandomString(String characters, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }


    //string generator methods
    private static String generateRandomNumberString(int length) {return generateRandomString(DIGITS, length);}

    private static String generateRandomSpecialString(int length) {return generateRandomString(SPECIAL, length);}

    //random email generator
    public static String generateRandomEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        char randomChar;
        Random rand = new Random();
        //generate random character that asserts uniqueness
        if (rand.nextBoolean()) {
            randomChar = (char) ('A' + rand.nextInt(26)); //uppercase A-Z
        } else {
            randomChar = (char) ('a' + rand.nextInt(26)); //lowercase a-z
        }
        return emailAddress + randomChar + "@example.com";
    }

    //random too short email generator
    public static String generateRandomTooShortEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@z.com";
    }
    //random too long email generator
    public static String generateRandomTooLongEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@esddsadwsdfghfafrujkuykmjnsfdasffdgjmyuhuyujhrgfsfdsgfgjukyyhggfsfdjgkyudfs.com";
    }

    //random phone number generator
    public static String generatePhoneNumber(int length) {
        if (length < 1) {throw new IllegalArgumentException("Phone number length must be at least 1.");}

        Random random = new Random();
        String phoneNumber = "";
        //generate the specified number of random digits
        for (int i = 0; i < length; i++) {
            phoneNumber += random.nextInt(10); //generate a random digit (0-9)
        }
        return phoneNumber;
    }

    //random password generator
    public static String generateRandomPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        //fixed password part
        String stokerPart = "Stoker";

        //random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append('_'); // Static underscore

        //shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    //generate a random address with a given length for the street name
    public static String generateRandomAddress(int length) {
        int streetNumber = RANDOM.nextInt(9999) + 1; // street number between 1 and 9999
        String streetName = generateRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", length);
        String streetType = STREET_TYPES[RANDOM.nextInt(STREET_TYPES.length)];
        return streetNumber + " " + streetName + " " + streetType;
    }

    // cities rnd instance
    private static final Random rndIllinoisCities = new Random();

    // method to get a random city from the array
    public static String getRandomCity() {
        int index = rndIllinoisCities.nextInt(ILLINOIS_CITIES.length);
        return ILLINOIS_CITIES[index];
    }

    // generate random postal code for Illinois
    public static int getRandomPostalCode() {
        return 60000 + RANDOM.nextInt(30000);
    }

    //pick random product review
    public static String getRandomProductReview(){
        if (storedReview == null) {
            Random random = new Random();
            storedReview = PRODUCT_REVIEWS[random.nextInt(PRODUCT_REVIEWS.length)];
        }
        return storedReview;
    }

    public static String generateExpirationDate() {
        // Get current date
        LocalDate now = LocalDate.now();
        int currentYear = now.getYear();
        int currentMonth = now.getMonthValue();

        Random random = new Random();

        // Generate random month (1-12)
        int month = random.nextInt(12) + 1;

        // Generate random year (current year to current year + 10)
        int year = currentYear + random.nextInt(11);

        // If the generated year is the current year, make sure the month is not in the past
        if (year == currentYear && month < currentMonth) {
            month = currentMonth + random.nextInt(13 - currentMonth);
        }

        // Format as MM/YY
        return String.format("%02d/%02d", month, year % 100);
    }

    public static String generateCVV() {
        Random random = new Random();
        return String.format("%03d", random.nextInt(1000));
    }

}


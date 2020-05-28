package animals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import staff.medical.Veterinarian;
/**
 * Class for objects type Animals
 * @author Íttalo Barbalho
 *
 */
public class Animals {
	
	private String type;
	private String name;
	private int age;
	private String medicalCondition;
		
	public Animals() {
		
	}

	public Animals(String type, String name, int age, String medicalCondition) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
		
	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	@Override
	public String toString() {
		return "Type = " +type
				+"\nName = "+name
				+"\nAge = "+ age
				+"\nMedical Condition = "+medicalCondition
				+"\n----------------------------------------";
	}

	ArrayList<Animals> animalsList = new ArrayList<Animals>();
	ArrayList<Cat> catList = new ArrayList<Cat>();
	ArrayList<Dog> dogList = new ArrayList<Dog>();
	ArrayList<Horse> horseList = new ArrayList<Horse>();
	ArrayList<Pig> pigList = new ArrayList<Pig>();
	ArrayList<Turtle> turtleList = new ArrayList<Turtle>();
	ArrayList<Veterinarian> vet = new ArrayList<Veterinarian>(); 
	
	
	/**
	 * Method generateNames returns a Ramdom name for each Animal from animalNames array
	 * @return String namesAnimals
	 */
	public String generateNames() {
		 
		String[] animalNames = {"Abbey", "Abbie", "Abby", "Abel", "Abigail", "Ace", "Adam", "Addie", "Admiral", "Aggie", "Aires",
					 "Aj", "Ajax", "Aldo", "Alex", "Alexus", "Alf", "Alfie", "Allie", "Ally", "Amber", "Amie", "Amigo", "Amos", "Amy", "Andy", "Angel",
					 "Angus", "Annie", "Apollo", "April", "Archie", "Argus", "Aries", "Armanti", "Arnie", "Arrow", "Ashes", "Ashley", "Astro", "Athena",
					 "Atlas", "Audi", "Augie", "Aussie", "Austin", "Autumn", "Axel", "Axle", "Babbles", "Babe", "Baby", "Babykins", "Bacchus", "Bailey",
					 "Bam", "Bambi", "Bandit", "Banjo", "Barbie", "Barclay", "Barker", "Barkley", "Barley", "Barnaby", "Barney", "Baron", "Bart", "Basil",
					 "Baxter", "Bb", "Beamer", "Beanie", "Beans", "Bear", "Beau", "Beauty", "Beaux", "Bebe", "Beetle", "Bella", "Belle", "Ben", "Benji",
					 "Benny", "Benson", "Bentley", "Bernie", "Bessie", "Biablo", "Bibbles", "Bigboy", "Bigfoot", "Biggie", "Billie", "Billy", "Bingo",
					 "Binky", "Birdie", "Birdy", "Biscuit", "Bishop", "Bits", "Bitsy", "Bizzy", "Bj", "Blackie", "Black", "Blanche", "Blast", "Blaze",
					 "Blondie", "Blossom", "Blue", "Bo", "Bob", "Bobbie", "Bobby", "Bobo", "Bodie", "Bogey", "Bones", "Bongo", "Bonnie", "Boo", "Booker",
					 "Boomer", "Boone", "Booster", "Bootie", "Boots", "Boozer", "Boris", "Bosco", "Bosley", "Boss", "Boy", "Bozley", "Bradley", "Brady",
					 "Braggs", "Brandi", "Brando", "Brandy", "Bridgett", "Bridgette", "Brie", "Brindle", "Brit", "Brittany", "Brodie", "Brook", "Brooke",
					 "Brownie", "Bruiser", "Bruno", "Brutus", "Bubba", "Bubbles", "Buck", "Buckeye", "Bucko", "Bucky", "Bud", "Budda", "Buddie", "Buddy",
					 "Buddyboy", "Buffie", "Buffy", "Bug", "Bugsey", "Bugsy", "Bullet", "Bullwinkle", "Bully", "Bumper", "Bunky", "Buster", "Buster-Brown",
					 "Butch", "Butchy", "Butter", "Butterball", "Buttercup", "Butterscotch", "Buttons", "Buzzy", "Caesar", "Cali", "Callie", "Calvin",
					 "Cameo", "Camille", "Candy", "Capone", "Captain", "Carley", "Casey", "Casper", "Cassie", "Cassis", "Chacha", "Chad", "Chamberlain",
					 "Champ", "Chance", "Chanel", "Chaos", "Charisma", "Charles", "Charlie", "Charliebrown", "Charmer", "Chase", "Chauncey", "Chaz",
					 "Checkers", "Chelsea", "Cherokee", "Chessie", "Chester", "Chevy", "Chewie", "Chewy", "Cheyenne", "Chichi", "Chic", "Chico", "Chief",
					 "Chili", "China", "Chip", "Chipper", "Chippy", "Chips", "Chiquita", "Chivas", "Chloe", "Chocolate", "Chrissy", "Chubbs", "Chucky", 
					 "Chyna", "Cinder", "Cindy", "Cinnamon", "Cisco", "Claire", "Clancy", "Cleo", "Cleopatra", "Clicker", "Clifford", "Clover", "Clyde",
					 "Coal", "Cobweb", "Coco", "Cocoa", "Coconut", "Codi", "Cody", "Cole", "Comet", "Commando", "Conan", "Connor", "Cookie", "Cooper", 
					 "Copper", "Corky", "Cosmo", "Cotton", "Cozmo", "Crackers", "Cricket", "Crystal", "Cubby", "Cubs", "Cujo", "Cupcake", "Curly", "Curry",
					 "Cutie", "Cyrus", "Daffy", "Daisey", "Daisy", "Dakota", "Dallas", "Dandy", "Dante", "Daphne", "Darby", "Darcy", "Darwin", "Dash", 
					 "Dave", "Deacon", "Dee", "Deedee", "Dempsey", "Destini", "Dewey", "Dexter", "Dharma", "Diamond", "Dickens", "Diego", "Diesel", "Digger",
					 "Dillon", "Dinky", "Dino", "Diva", "Dixie", "Dobie", "Doc", "Dodger", "Doggon", "Dolly", "Domino", "Doodles", "Doogie", "Dots",
					 "Dottie", "Dozer", "Dragster", "Dreamer", "Duchess", "Dude", "Dudley", "Duffy", "Duke", "Duncan", "Dunn", "Dusty", "Dutches", 
					 "Dutchess", "Dylan", "Earl", "Ebony", "Echo", "Eddie", "Eddy", "Edgar", "Edsel", "Eifel", "Einstein", "Ellie", "Elliot", "Elmo", 
					 "Elvis", "Elwood", "Ember", "Emily", "Emma", "Emmy", "Erin", "Ernie", "Eva", "Faith", "Fancy", "Felix", "Fergie", "Ferris", "Fido",
					 "Fifi", "Figaro", "Finnegan", "Fiona", "Flake", "Flakey", "Flash", "Flint", "Flopsy", "Flower", "Floyd", "Fluffy", "Fonzie", "Foxy", 
					 "Francais", "Frankie", "Franky", "Freckles", "Fred", "Freddie", "Freddy", "Freedom", "Freeway", "Fresier", "Friday", "Frisco", 
					 "Frisky", "Fritz", "Frodo", "Frosty", "Furball", "Fuzzy", "Gabby", "Gabriella", "Garfield", "Gasby", "Gator", "Gavin", "Genie", 
					 "George", "Georgia", "Georgie", "Giant", "Gibson", "Gidget", "Gigi", "Gilbert", "Gilda", "Ginger", "Ginny", "Girl", "Gizmo", 
					 "Godiva", "Goldie", "Goober", "Goose", "Gordon", "Grace", "Gracie", "Grady", "Greenie", "Greta", "Gretchen", "Gretel", "Gretta", 
					 "Griffen", "Gringo", "Grizzly", "Gromit", "Grover", "Gucci", "Guido", "Guinness", "Gunner", "Gunther", "Gus", "Guy", "Gypsy", 
					 "Hailey", "Haley", "Hallie", "Hamlet", "Hammer", "Hank", "Hanna", "Hannah", "Hans", "Happyt", "Hardy", "Harley", "Harpo", 
					 "Harrison", "Harry", "Harvey", "Heather", "Heidi", "Henry", "Hercules", "Hershey", "Higgins", "Hobbes", "Holly", "Homer", "Honey", 
					 "Hooch", "Hoover", "Hope", "Houdini", "Howie", "Hudson", "Huey", "Hugh", "Hugo", "Humphrey", "Hunter", "India", "Indy", "Iris",
					 "Isabella", "Isabelle", "Itsy", "Ivory", "Ivy", "Izzy", "Jack", "Jackie", "Jackpot", "Jackson", "Jade", "Jagger", "Jags", 
					 "Jaguar", "Jake", "Jamie", "Jasmine", "Jasper", "Jaxson", "Jazmie", "Jazz", "Jelly", "Jenna", "Jenny", "Jerry", "Jersey", 
					 "Jess", "Jesse", "Jessejames", "Jessie", "Jester", "Jet", "Jethro", "Jett", "Jetta", "Jewel", "Jewels", "Jimmuy", "Jingles", 
					 "Jj", "Joe", "Joey", "Johnny", "Jojo", "Joker", "Jolie", "Jolly", "Jordan", "Josie", "Joy", "Jr", "Judy", "Julius", "June", 
					 "Junior", "Justice", "Kali", "Kallie", "Kane", "Karma", "Kasey", "Katie", "Kato", "Katz", "Kayla", "Kc", "Keesha", "Kellie", 
					 "Kelly", "Kelsey", "Kenya", "Kerry", "Kibbles", "Kid", "Kiki", "Killian", "King", "Kipper", "Kira", "Kirby", "Kismet", "Kissy",
					 "Kitty", "Kiwi", "Klaus", "Koba", "Kobe", "Koda", "Koko", "Kona", "Kosmo", "Koty", "Kramer", "Kujo", "Kurly", "Kyra", "Lacey", 
					 "Laddie", "Lady", "Ladybug", "Laney", "Lassie", "Latte", "Layla", "Lazarus", "Lefty", "Leo", "Levi", "Lexi", "Lexie", "Lexus", 
					 "Libby", "Lightning", "Lili", "Lilly", "Lily", "Lincoln", "Linus", "Littlebit", "Little", "Lizzy", "Logan", "Loki", "Lola", "Lou", 
					 "Louie", "Louis", "Lovey", "Lucas", "Luci", "Lucifer", "Lucky", "Lucy", "Luke", "Lulu", "Luna", "Lynx", "Mac", "Macho", "Macintosh",
					 "Mack", "Mackenzie", "Macy", "Maddie", "Maddy", "Madison", "Maggie", "Maggy", "Magic", "Magnolia", "Major", "Mandi", "Mandy", "Mango", 
					 "Marble", "Mariah", "Marley", "Mary", "Maryjane", "Mason", "Mattie", "Maverick", "Max", "Maximus", "Maxine", "Maxwell", "May", 
					 "Maya", "Mcduff", "Mckenzie", "Meadow", "Megan", "Meggie", "Mercedes", "Mercle", "Merlin", "Mia", "Miasy", "Michael", "Mickey", 
					 "Midnight", "Mikey", "Miko", "Miles", "Miller", "Millie", "Milo", "Mimi", "Mindy", "Ming", "Mini", "Minnie", "Mischief", "Misha",
					 "Misskitty", "Misspriss", "Missie", "Missy", "Mister", "Misty", "Mitch", "Mittens", "Mitzi", "Mitzy", "Mo", "Mocha", "Mojo",
					 "Mollie", "Molly", "Mona", "Monkey", "Monster", "Montana", "Montgomery", "Monty", "Moocher", "Moochie", "Mookie", "Moonshine", 
					 "Moose", "Morgan", "Moses", "Mouse", "Mrkitty", "Muffin", "Muffy", "Mugsy", "Mulligan", "Munchkin", "Murphy", "Nakita", "Nala", 
					 "Nana", "Napoleon", "Natasha", "Nathan", "Nellie", "Nemo", "Nena", "Nero", "Nestle", "Newt", "Newton", "Nibbles", "Nibby",
					 "Nibby-Nose", "Nick", "Nickers", "Nickie", "Nicky", "Nico", "Nike", "Niki", "Nikita", "Nikki", "Niko", "Nina", "Nitro", 
					 "Nobel", "Noel", "Nona", "Noodles", "Norton", "Nosey", "Nugget", "Nutmeg", "Oakley", "Obie", "Odie", "Oldglory", "Olive", 
					 "Oliver", "Olivia", "Ollie", "Onie", "Onyx", "Opie", "Oreo", "Oscar", "Otis", "Otto", "Oz", "Ozzie", "Ozzy", "Pablo", 
					 "Paco", "Paddington", "Paddy", "Panda", "Pandora", "Panther", "Papa", "Paris", "Parker", "Pasha", "Patch", "Patches", 
					 "Patricky", "Patsy", "Patty", "Peaches", "Peanut", "Peanuts", "Pearl", "Pebbles", "Pedro", "Penny", "Pepe", "Pepper", "Peppy",
					 "Pepsi", "Persy", "Pete", "Peter", "Petey", "Petie", "Phantom", "Phoebe", "Phoenix", "Picasso", "Pickles", "Pierre", "Piggy", "Piglet", 
					 "Pinkpanther", "Pinky", "Pinto", "Piper", "Pippin", "Pippy", "Pip-Squeek", "Pirate", "Pixie", "Plato", "Pluto", "Pockets", "Pogo", 
					 "Pokey", "Polly", "Poncho", "Pongo", "Pooch", "Poochie", "Pooh", "Pooh-Bear", "Pookie", "Pooky", "Popcorn", "Poppy", "Porche", 
					 "Porkchop", "Porky", "Porter", "Powder", "Prancer", "Precious", "Presley", "Pretty", "Prince", "Princess", "Prissy", "Puck", 
					 "Puddles", "Pudge", "Puffy", "Pugsley", "Pumpkin", "Punkin", "Puppy", "Purdy", "Queen", "Queenie", "Quincy", "Quinn", "Rags", 
					 "Raison", "Ralph", "Ralphie", "Rambler", "Rambo", "Ranger", "Rascal", "Raven", "Rebel", "Red", "Reggie", "Reilly", "Remy", 
					 "Rex", "Rexy", "Rhett", "Ricky", "Rico", "Riggs", "Riley", "Rintintin", "Ringo", "Ripley", "Rocco", "Rock", "Rocket", "Rocko",
					 "Rocky", "Roland", "Rolex", "Rollie", "Roman", "Romeo", "Rosa", "Roscoe", "Rosebud", "Rosie", "Rosy", "Rover", "Rowdy", 
					 "Roxanne", "Roxie", "Roxy", "Ruby", "Ruchus", "Rudy", "Ruffe", "Ruffer", "Ruffles", "Rufus", "Ruger", "Rusty", "Ruthie", 
					 "Ryder", "Sabine", "Sable", "Sabrina", "Sadie", "Sage", "Sailor", "Salem", "Sally", "Salty", "Sam", "Samantha", "Sammy", 
					 "Sampson", "Samson", "Sandy", "Sara", "Sarah", "Sarge", "Sasha", "Sassie", "Sassy", "Savannah", "Sawyer", "Scarlett", "Schotzie", 
					 "Schultz", "Scoobie", "Scooby", "Scooter", "Scottie", "Scout", "Scrappy", "Scruffy", "Sebastian", "Shadow", "Shady", "Shaggy", 
					 "Shasta", "Sheba", "Sheena", "Shelby", "Shelly", "Sherman", "Shiloh", "Shiner", "Shorty", "Sienna", "Sierra", "Silky", "Silver", 
					 "Silvester", "Simba", "Simon", "Simone", "Sissy", "Skeeter", "Skinny", "Skip", "Skipper", "Skippy", "Skittles", "Sky", "Skye", 
					 "Skyler", "Slick", "Slinky", "Sly", "Smarty", "Smoke", "Smokey", "Smudge", "Sneakers", "Snickers", "Snoop", "Snoopy", "Snowball", 
					 "Snowflake", "Snowy", "Snuffles", "Snuggles", "Solomon", "Sonny", "Sophia", "Sophie", "Sox", "Spanky", "Sparkle", "Sparky", "Speed", 
					 "Speedo", "Speedy", "Spencer", "Spike", "Spirit", "Spookey", "Spot", "Spotty", "Spud", "Spunky", "Squeeky", "Squirt", "Stanley", 
					 "Star", "Starr", "Stella", "Sterling", "Stich", "Stinky", "Stormy", "Stuart", "Abbey", "Abbie", "Abby", "Abel", "Abigail", 
					 "Ace", "Adam", "Addie", "Admiral", "Aggie", "Aires", "Aj", "Ajax", "Aldo", "Alex", "Alexus", "Alf", "Alfie", "Allie", "Ally", 
					 "Amber", "Amie", "Amigo", "Amos", "Amy", "Andy", "Angel", "Angus", "Annie", "Apollo", "April", "Archie", "Argus", "Aries", 
					 "Armanti", "Arnie", "Arrow", "Ashes", "Ashley", "Astro", "Athena", "Atlas", "Audi", "Augie", "Aussie", "Austin", "Autumn", "Axel",
					 "Axle", "Babbles", "Babe", "Baby", "Babykins", "Bacchus", "Bailey", "Bam", "Bambi", "Bandit", "Banjo", "Barbie", "Barclay", 
					 "Barker", "Barkley", "Barley", "Barnaby", "Barney", "Baron", "Bart", "Basil", "Baxter", "Bb", "Beamer", "Beanie", "Beans", 
					 "Bear", "Beau", "Beauty", "Beaux", "Bebe", "Beetle", "Bella", "Belle", "Ben", "Benji", "Benny", "Benson", "Bentley", 
					 "Bernie", "Bessie", "Biablo", "Bibbles", "Bigboy", "Bigfoot", "Biggie", "Billie", "Billy", "Bingo", "Binky", "Birdie", 
					 "Birdy", "Biscuit", "Bishop", "Bits", "Bitsy", "Bizzy", "Bj", "Blackie", "Black", "Blanche", "Blast", "Blaze", "Blondie", 
					 "Blossom", "Blue", "Bo", "Bob", "Bobbie", "Bobby", "Bobo", "Bodie", "Bogey", "Bones", "Bongo", "Bonnie", "Boo", "Booker", 
					 "Boomer", "Boone", "Booster", "Bootie", "Boots", "Boozer", "Boris", "Bosco", "Bosley", "Boss", "Boy", "Bozley", "Bradley", 
					 "Brady", "Braggs", "Brandi", "Brando", "Brandy", "Bridgett", "Bridgette", "Brie", "Brindle", "Brit", "Brittany", "Brodie", 
					 "Brook", "Brooke", "Brownie", "Bruiser", "Bruno", "Brutus", "Bubba", "Bubbles", "Buck", "Buckeye", "Bucko", "Bucky", "Bud", 
					 "Budda", "Buddie", "Buddy", "Buddyboy", "Buffie", "Buffy", "Bug", "Bugsey", "Bugsy", "Bullet", "Bullwinkle", "Bully", "Bumper", 
					 "Bunky", "Buster", "Buster-Brown", "Butch", "Butchy", "Butter", "Butterball", "Buttercup", "Butterscotch", "Buttons", "Buzzy", 
					 "Caesar", "Cali", "Callie", "Calvin", "Cameo", "Camille", "Candy", "Capone", "Captain", "Carley", "Casey", "Casper", "Cassie", 
					 "Cassis", "Chacha", "Chad", "Chamberlain", "Champ", "Chance", "Chanel", "Chaos", "Charisma", "Charles", "Charlie", "Charliebrown", 
					 "Charmer", "Chase", "Chauncey", "Chaz", "Checkers", "Chelsea", "Cherokee", "Chessie", "Chester", "Chevy", "Chewie", "Chewy", 
					 "Cheyenne", "Chichi", "Chic", "Chico", "Chief", "Chili", "China", "Chip", "Chipper", "Chippy", "Chips", "Chiquita", "Chivas", 
					 "Chloe", "Chocolate", "Chrissy", "Chubbs", "Chucky", "Chyna", "Cinder", "Cindy", "Cinnamon", "Cisco", "Claire", "Clancy", "Cleo", 
					 "Cleopatra", "Clicker", "Clifford", "Clover", "Clyde", "Coal", "Cobweb", "Coco", "Cocoa", "Coconut", "Codi", "Cody", "Cole", "Comet", 
					 "Commando", "Conan", "Connor", "Cookie", "Cooper", "Copper", "Corky", "Cosmo", "Cotton", "Cozmo", "Crackers", "Cricket", "Crystal", 
					 "Cubby", "Cubs", "Cujo", "Cupcake", "Curly", "Curry", "Cutie", "Cyrus", "Daffy", "Daisey", "Daisy", "Dakota", "Dallas", "Dandy", 
					 "Dante", "Daphne", "Darby", "Darcy", "Darwin", "Dash", "Dave", "Deacon", "Dee", "Deedee", "Dempsey", "Destini", "Dewey", "Dexter", 
					 "Dharma", "Diamond", "Dickens", "Diego", "Diesel", "Digger", "Dillon", "Dinky", "Dino", "Diva", "Dixie", "Dobie", "Doc", "Dodger", 
					 "Doggon", "Dolly", "Domino", "Doodles", "Doogie", "Dots", "Dottie", "Dozer", "Dragster", "Dreamer", "Duchess", "Dude", "Dudley", 
					 "Duffy", "Duke", "Duncan", "Dunn", "Dusty", "Dutches", "Dutchess", "Dylan", "Earl", "Ebony", "Echo", "Eddie", "Eddy", "Edgar", 
					 "Edsel", "Eifel", "Einstein", "Ellie", "Elliot", "Elmo", "Elvis", "Elwood", "Ember", "Emily", "Emma", "Emmy", "Erin", "Ernie", 
					 "Eva", "Faith", "Fancy", "Felix", "Fergie", "Ferris", "Fido", "Fifi", "Figaro", "Finnegan", "Fiona", "Flake", "Flakey", "Flash", 
					 "Flint", "Flopsy", "Flower", "Floyd", "Fluffy", "Fonzie", "Foxy", "Francais", "Frankie", "Franky", "Freckles", "Fred", "Freddie",
					 "Freddy", "Freedom", "Freeway", "Fresier", "Friday", "Frisco", "Frisky", "Fritz", "Frodo", "Frosty", "Furball", "Fuzzy", "Gabby", 
					 "Gabriella", "Garfield", "Gasby", "Gator", "Gavin", "Genie", "George", "Georgia", "Georgie", "Giant", "Gibson", "Gidget", "Gigi",
					 "Gilbert", "Gilda", "Ginger", "Ginny", "Girl", "Gizmo", "Godiva", "Goldie", "Goober", "Goose", "Gordon", "Grace", "Gracie", 
					 "Grady", "Greenie", "Greta", "Gretchen", "Gretel", "Gretta", "Griffen", "Gringo", "Grizzly", "Gromit", "Grover", "Gucci", "Guido", 
					 "Guinness", "Gunner", "Gunther", "Gus", "Guy", "Gypsy", "Hailey", "Haley", "Hallie", "Hamlet", "Hammer", "Hank", "Hanna", 
					 "Hannah", "Hans", "Happyt", "Hardy", "Harley", "Harpo", "Harrison", "Harry", "Harvey", "Heather", "Heidi", 
					 "Henry", "Hercules", "Hershey", "Higgins", "Hobbes", "Holly", "Homer", "Honey", "Hooch", "Hoover", "Hope", 
					 "Houdini", "Howie", "Hudson", "Huey", "Hugh", "Hugo", "Humphrey", "Hunter", "India", "Indy", "Iris", "Isabella", 
					 "Isabelle", "Itsy", "Ivory", "Ivy", "Izzy", "Jack", "Jackie", "Jackpot", "Jackson", "Jade", "Jagger", "Jags", "Jaguar", "Jake", 
					 "Jamie", "Jasmine", "Jasper", "Jaxson", "Jazmie", "Jazz", "Jelly", "Jenna", "Jenny", "Jerry", "Jersey", "Jess", "Jesse", 
					 "Jessejames", "Jessie", "Jester", "Jet", "Jethro", "Jett", "Jetta", "Jewel", "Jewels", "Jimmuy", "Jingles", "Jj", "Joe", 
					 "Joey", "Johnny", "Jojo", "Joker", "Jolie", "Jolly", "Jordan", "Josie", "Joy", "Jr", "Judy", "Julius", "June", "Junior", 
					 "Justice", "Kali", "Kallie", "Kane", "Karma", "Kasey", "Katie", "Kato", "Katz", "Kayla", "Kc", "Keesha", "Kellie", "Kelly", 
					 "Kelsey", "Kenya", "Kerry", "Kibbles", "Kid", "Kiki", "Killian", "King", "Kipper", "Kira", "Kirby", "Kismet", "Kissy", "Kitty", 
					 "Kiwi", "Klaus", "Koba", "Kobe", "Koda", "Koko", "Kona", "Kosmo", "Koty", "Kramer", "Kujo", "Kurly", "Kyra", "Lacey", "Laddie", "Lady", 
					 "Ladybug", "Laney", "Lassie", "Latte", "Layla", "Lazarus", "Lefty", "Leo", "Levi", "Lexi", "Lexie", "Lexus", "Libby", "Lightning", 
					 "Lili", "Lilly", "Lily", "Lincoln", "Linus", "Littlebit", "Little", "Lizzy", "Logan", "Loki", "Lola", "Lou", "Louie", "Louis", "Lovey", 
					 "Lucas", "Luci", "Lucifer", "Lucky", "Lucy", "Luke", "Lulu", "Luna", "Lynx", "Mac", "Macho", "Macintosh", "Mack", "Mackenzie", "Macy",
		"Maddie", "Maddy", "Madison", "Maggie", "Maggy", "Magic", "Magnolia", "Major", "Mandi", "Mandy", "Mango", "Marble", "Mariah", "Marley", "Mary", 
		"Maryjane", "Mason", "Mattie", "Maverick", "Max", "Maximus", "Maxine", "Maxwell", "May", "Maya", "Mcduff", "Mckenzie", "Meadow", "Megan", "Meggie", 
		"Mercedes", "Mercle", "Merlin", "Mia", "Miasy", "Michael", "Mickey", "Midnight", "Mikey", "Miko", "Miles", "Miller", "Millie", "Milo", "Mimi", 
		"Mindy", "Ming", "Mini", "Minnie", "Mischief", "Misha", "Misskitty", "Misspriss", "Missie", "Missy", "Mister", "Misty", "Mitch", "Mittens", 
		"Mitzi", "Mitzy", "Mo", "Mocha", "Mojo", "Mollie", "Molly", "Mona", "Monkey", "Monster", "Montana", "Montgomery", "Monty", "Moocher", "Moochie", 
		"Mookie", "Moonshine", "Moose", "Morgan", "Moses", "Mouse", "Mrkitty", "Muffin", "Muffy", "Mugsy", "Mulligan", "Munchkin", "Murphy", "Nakita", 
		"Nala", "Nana", "Napoleon", "Natasha", "Nathan", "Nellie", "Nemo", "Nena", "Nero", "Nestle", "Newt", "Newton", "Nibbles", "Nibby", "Nibby-Nose", 
		"Nick", "Nickers", "Nickie", "Nicky", "Nico", "Nike", "Niki", "Nikita", "Nikki", "Niko", "Nina", "Nitro", "Nobel", "Noel", "Nona", "Noodles", 
		"Norton", "Nosey", "Nugget", "Nutmeg", "Oakley", "Obie", "Odie", "Oldglory", "Olive", "Oliver", "Olivia", "Ollie", "Onie", "Onyx", "Opie", "Oreo", 
		"Oscar", "Otis", "Otto", "Oz", "Ozzie", "Ozzy", "Pablo", "Paco", "Paddington", "Paddy", "Panda", "Pandora", "Panther", "Papa", "Paris", "Parker", 
		"Pasha", "Patch", "Patches", "Patricky", "Patsy", "Patty", "Peaches", "Peanut", "Peanuts", "Pearl", "Pebbles", "Pedro", "Penny", "Pepe", "Pepper", 
		"Peppy", "Pepsi", "Persy", "Pete", "Peter", "Petey", "Petie", "Phantom", "Phoebe", "Phoenix", "Picasso", "Pickles", "Pierre", "Piggy", "Piglet", 
		"Pinkpanther", "Pinky", "Pinto", "Piper", "Pippin", "Pippy", "Pip-Squeek", "Pirate", "Pixie", "Plato", "Pluto", "Pockets", "Pogo", "Pokey", "Polly", 
		"Poncho", "Pongo", "Pooch", "Poochie", "Pooh", "Pooh-Bear", "Pookie", "Pooky", "Popcorn", "Poppy", "Porche", "Porkchop", "Porky", "Porter", 
		"Powder", "Prancer", "Precious", "Presley", "Pretty", "Prince", "Princess", "Prissy", "Puck", "Puddles", "Pudge", "Puffy", "Pugsley", "Pumpkin", 
		"Punkin", "Puppy", "Purdy", "Queen", "Queenie", "Quincy", "Quinn", "Rags", "Raison", "Ralph", "Ralphie", "Rambler", "Rambo", "Ranger", "Rascal", 
		"Raven", "Rebel", "Red", "Reggie", "Reilly", "Remy", "Rex", "Rexy", "Rhett", "Ricky", "Rico", "Riggs", "Riley", "Rintintin", "Ringo", "Ripley", 
		"Rocco", "Rock", "Rocket", "Rocko", "Rocky", "Roland", "Rolex", "Rollie", "Roman", "Romeo", "Rosa", "Roscoe", "Rosebud", "Rosie", "Rosy", "Rover", 
		"Rowdy", "Roxanne", "Roxie", "Roxy", "Ruby", "Ruchus", "Rudy", "Ruffe", "Ruffer", "Ruffles", "Rufus", "Ruger", "Rusty", "Ruthie", "Ryder", "Sabine",
		"Sable", "Sabrina", "Sadie", "Sage", "Sailor", "Salem", "Sally", "Salty", "Sam", "Samantha", "Sammy", "Sampson", "Samson", "Sandy", "Sara", "Sarah",
		"Sarge", "Sasha", "Sassie", "Sassy", "Savannah", "Sawyer", "Scarlett", "Schotzie", "Schultz", "Scoobie", "Scooby", "Scooter", "Scottie", "Scout", 
		"Scrappy", "Scruffy", "Sebastian", "Shadow", "Shady", "Shaggy", "Shasta", "Sheba", "Sheena", "Shelby", "Shelly", "Sherman", "Shiloh", "Shiner", 
		"Shorty", "Sienna", "Sierra", "Silky", "Silver", "Silvester", "Simba", "Simon", "Simone", "Sissy", "Skeeter", "Skinny", "Skip", "Skipper", "Skippy", 
		"Skittles", "Sky", "Skye", "Skyler", "Slick", "Slinky", "Sly", "Smarty", "Smoke", "Smokey", "Smudge", "Sneakers", "Snickers", "Snoop", "Snoopy", 
		"Snowball", "Snowflake", "Snowy", "Snuffles", "Snuggles", "Solomon", "Sonny", "Sophia", "Sophie", "Sox", "Spanky", "Sparkle", "Sparky", "Speed", 
		"Speedo", "Speedy", "Spencer", "Spike", "Spirit", "Spookey", "Spot", "Spotty", "Spud", "Spunky", "Squeeky", "Squirt", "Stanley", "Star", "Starr", 
		"Stella", "Sterling", "Stich", "Stinky", "Stormy", "Stuart"};
		
		String namesAnimals;
		
		namesAnimals = (animalNames[new Random().nextInt(animalNames.length)]);
				
		return namesAnimals;
		
	}
	
	/**
	 * The method returns a ramdom age between 1 and the number from the parameter age,
	 *  if the parameter age gets number 30, it will returns a value between 1 and 30
	 * @param age - the maximum age of the animal
	 * @return randomAge 
	 */
	public int generateAge(int age) {		
		Random random = new Random();
		int randomAge = random.nextInt(age) + 1;	
		return randomAge;
	}	
	
	/**
	 * Method generateMedicalCondition returns a Ramdom name for each Animal from animalNames array
	 * @return medicalConditions
	 */
	public String generateMedicalCondition() {
		String[] animalConditions = new String[]{"Arthritis", "Cancer", "Dental Disease", "Diabetes", "Distemper", "Ear Mites", "Epilepsy", "Flea Bite Allergies",
				"Gastric", "Heartworm", "Mange", "Rabies", "Vestibular Disease", "Anthrax", "Brucellosis", "Campylobacter", "Cryptosporidiosis", "Diphtheria", "Echinococcosis",
				"Skin Infection", "Vomiting", "Chronic Kidney Disease", "Lymphoma"};
		
		String medicalConditions;
		
		medicalConditions = (animalConditions[new Random().nextInt(animalConditions.length)]);
				
		return medicalConditions;
	}
	
	/**
	 * The method namesAnimals add Type, Name, Age and Medical Condition for each category of animal
	 * Each type of animal is added in a Arraylist Animals and a second Arraylist for type
	 */
	 public void namesAnimals() {		   	  	
    	//---------------------- Medical Staff -----------------------    	    	
    	//200 Cats
    	for(int i = 0; i < 200; i++) {     		
    		Cat cat = new Cat("Cat", generateNames(), generateAge(25), generateMedicalCondition());
    		animalsList.add(cat);    
    		catList.add(cat);    		
    	}
    	//200 Dogs
    	for(int i = 0; i < 200; i++) {     		
    		Dog dog = new Dog("Dog", generateNames(), generateAge(13), generateMedicalCondition());
    		animalsList.add(dog);    
    		dogList.add(dog);    		
    	}	 
    	
    	//200 Horses
    	for(int i = 0; i < 200; i++) {     		
    		Horse horse = new Horse("Horse", generateNames(), generateAge(25), generateMedicalCondition());
    		animalsList.add(horse);    
    		horseList.add(horse);    		
    	}
    	
    	//200 Pigs
    	for(int i = 0; i < 200; i++) {     		
    		Pig pig = new Pig("Pig", generateNames(), generateAge(12), generateMedicalCondition());
    		animalsList.add(pig);    
    		pigList.add(pig);    		
    	}
    	
    	//200 Turtles
    	for(int i = 0; i < 200; i++) {     		
    		Turtle turtle = new Turtle("Turtle", generateNames(), generateAge(150), generateMedicalCondition());
    		animalsList.add(turtle);    
    		turtleList.add(turtle);    		
    	}   
	 }
	 
	 /**
	  *  This method list all Animals in the ArrayList Animals
	  */
	public void listAllAnimals() {
		for(Animals list: animalsList) {			
			System.out.println(list.toString());		
		}		 			
	}
	
	/**
	 * ThiS method search for all animals by Type, it shows a list from the ArrayList.
	 * @param type - options from the user Menu
	 */
	public void animlasByType(int type) {			
		if(type == 1 ) {
			for(Animals list: catList) {
				System.out.println(list.toString());				
			}
		}else if(type == 2) {
			for(Animals list: dogList) {
				System.out.println(list.toString());	
			}
		}else if(type == 3) {
			for(Animals list: horseList) {
				System.out.println(list.toString());	
			}
		}else if(type == 4) {
			for(Animals list: pigList) {
				System.out.println(list.toString());	
			}
		}else if(type == 5) {	
			for(Animals list: turtleList) {
				System.out.println(list.toString());	
			}
		}
	}
	
	/**
	 * Shows informations of Animal by its name, all names are converted to lowercase words and compared with the Arraylist Animals
	 * @param name - the user must inform an animal name to find in the Arraylist
	 */
	public void searchAnimalByName(String name) {		
		for(Animals list: animalsList) {				
			if(list.getName().toLowerCase().equalsIgnoreCase(name)) {				
				System.out.println(list.toString());
			}
		}			
	}
	
}

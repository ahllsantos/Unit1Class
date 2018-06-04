
public class Pet {
	
	private int age;
	private String name;
	private String gender;
	private String color;
	private int weight;
	private String species;
	private String park;

	public Pet(int age1, String name1, String gender1, String color1, int weight1, String species1) {
		
		age = age1;
		name = name1;
		gender = gender1;
		color = color1;
		weight = weight1;
		species = species1; }
		
	
	public static void main(String[] args) {
		Pet dog = new Pet(4, "Milo", "Male", "brown", 123, "retriever"); }
		
		public void setAge(int age1) {
			age = age1; }
		public int getAge(int age1) {
			return age; }
		public void setName(String name1) {
			name = name1; }
		public String getName(String name1) {
			return name; }
		public void setGender(String gender1) {
			gender = gender1; }
		public String getGender(String gender1) {
			return gender; }
		public void setColor(String color1) {
			color = color1; }
		public String getColor(String color1) {
			return color; }
		public void setWeight(int weight1) {
			weight = weight1; }
		public int getweight(int weight1) {
			return weight; }
		public void setSpecies(String species1) {
			species = species1; }
		public String getSpecies(String species1) {
			return species; }
	
		
		public void eat() {
			System.out.println("I am eating rice"); }

		public void askToGoOutside() {
			System.out.println("Can I go to the park?"); }
		
		public void sleep() {
			System.out.println("I am sleeping in my bed."); }
		
		public void snuggleWithOwner() {
			System.out.println("I am snuggling with my owner on the couch."); }
		
		public void drinkWater() {
			System.out.println("I am drinking water in my bowl."); }
		
		public void dogChase() {
			System.out.println("I am chasing a cat."); }
		
		public void scratchedPerson() {
			System.out.println("I got in trouble for scratching my owner."); }
		}
		
	

		

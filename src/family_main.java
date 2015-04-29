public class family_main {

	public static void main(String[] args){
		Person eon = new Person("Eon");
		Person jasmine = new Person("Ariana grande");
		Person kerby = new Person("Kerby");
		Person kelly = new Person ("Kelly");
		Person al = new Person("alhad");
		Person test = new Person("yep");

		eon.setSpouse(jasmine);
		eon.addChild(kerby);
		eon.addChild(al);
		//al.setSpouse(kelly);
		//	al.addChild(test);
		System.out.println(jasmine.getSpouse().toString());
		System.out.println(eon.getChildren().toString());
		System.out.println(kerby.getParents().toString());
		System.out.println(al.getParents().toString());

		System.out.println(al.getSibling(al, kerby));

		System.out.println("\n");

		al.setSpouse(kelly);
		al.addChild(test);

		//System.out.println(kerby.getParents().toString());
		System.out.println(test.getParents().toString());
		System.out.println(test.getRelatives(test));
	}
}


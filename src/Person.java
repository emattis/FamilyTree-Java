import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Person {

	Person spouse;
	Set<Person> children;
	Set<Person> sibling;
	String name;
	Set<Person> parents;

	public Person(String name) {

		this.name = name;

	}

	public String getName() {

		return name;
	}

	public void setSpouse(Person person) {
		if (spouse == null) {
			this.spouse = person;
			spouse.setSpouse(this);
		} else {
			this.spouse = person;
			// spouse.setSpouse(this);
		}

	}

	public Person getSpouse() {
		return spouse;
	}

	public void addChild(Person person) {
		if (children == null) {
			// children.add(person);
			person.setParents();
			person.parents.add(this);
			person.parents.add(this.getSpouse());
			children = new HashSet<Person>();

			children.add(person);
			spouse.addChild(person);

		} else {
			person.setParents();
			person.parents.add(this);
			person.parents.add(this.getSpouse());
			// person.setParents();
			children.add(person);
			spouse.children.add(person);

			// spouse.children.add(person);
		}

	}

	public void setParents() {
		// System.out.println(spouse+"dsd");
		if (parents == null) {
			parents = new HashSet<Person>(2);
			// parents.add(this);
			// parents.add(this.getSpouse());
			// parents.add(this);

		} else {
			// parents.add(this);
			// parents.add(this.getSpouse());
		}
	}

	
	
	public Set getFather() {

		return parents;
	}

	
	public Set getParents() {

		return parents;
	}

	public void addSiblings(Person person) {
		if (sibling == null) {
			sibling = new HashSet<Person>();

		} else {

		}

	}

	public boolean getSibling(Person person, Person person1) {

		if (person.getParents().equals(person1.getParents())) {
			return true;
		}
		return false;
	}


	public String getRelatives(Person person){

		String data = null;
		if(person.getChildren() != null){

			data += person.getChildren();
		}

		if(person.getParents() != null){

			data += person.getParents();
		}

		if(person.getSpouse()!= null){

			data +=	person.getSpouse();
		}

		return data;
	}

	public Set getChildren() {
		if (children != null) {
			return children;
		}
		return null;
	}

	public String toString() {
		return name;
	}
}
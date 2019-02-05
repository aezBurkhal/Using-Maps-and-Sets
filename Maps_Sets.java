import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	public String toString() {
		return id + ": " + name;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}




public class Maps_Sets {
	private int id;
	private String name;
	
	public Maps_Sets(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		return "(ID is: "  + id +"; "+  "Name is: " + name + ")";
	}
	
	

	public static void main(String[] args) {
		
		Person M1 = new Person(0, "Bob");
		Person M2 = new Person(1, "Sue");
		Person M3 = new Person(2, "Mike");
		Person M4 = new Person(1, "Sue");
		// for(Person key: map.keySet());
		 //System.out.println(key + ": " + map.get(key));
		
		
		Maps_Sets p1 = new Maps_Sets(0, "Bob");
		Maps_Sets p2 = new Maps_Sets(1, "Sue");
		Maps_Sets p3 = new Maps_Sets(2, "Mike");
		Maps_Sets p4 = new Maps_Sets(1, "Sue");
		
		Map<Maps_Sets, Integer>map = new LinkedHashMap<Maps_Sets, Integer>() ;
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1);
		
		for(Maps_Sets key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<Maps_Sets> set = new LinkedHashSet<Maps_Sets>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		

	}

}

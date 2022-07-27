package grandcircus.co.donutAPI;

import java.util.List;

public class Donut {

	private int id;
	private String ref;
	private String name;
	private int calories;
	private List<String> extras;
	private String photo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
	
	
	
	
	
//	{
//		"id": 3,
//		"ref": "https://grandcircusco.github.io/demo-apis/donuts/3.json",
//		"name": "Boston Cream",
//		"calories": 300,
//		"extras": [
//		"chocolate icing",
//		"cream filling"
//		],
//		"photo": "https://grandcircusco.github.io/demo-apis/donuts/images/d3.jpg",
//		"photo_attribution": "https://commons.wikimedia.org/wiki/File:DD-Boston-Cream-Donut.jpg"
//		}
}

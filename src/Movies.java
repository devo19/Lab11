public class Movies {

	private String title;
	private String category;
	private int num;

	public String getTitle() {
		return title;
	}

	public int getNum() {
		return num;
	}

	public String getCategory() {
		return category;
	}

	public Movies(int num, String title, String category) {
		this.num = num;
		this.title = title;
		this.category = category;
	}

}

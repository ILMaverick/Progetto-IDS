public class TextContent extends Content<String> {
	

	public TextContent(String myContent) {
		super(myContent);
		// TODO Auto-generated constructor stub
	}

	@Override
	void modify(String text) {

	}

	@Override
	void create(String content) {

	}

	@Override
	void show() {
		System.out.println(super.myContent);
	}
}
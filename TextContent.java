public class TextContent extends Content<TextContent> {
	private String text;

	public TextContent(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	void modify(TextContent content) {

	}

	@Override
	void create(TextContent content) {

	}

	@Override
	void show() {
		System.out.println(text);
	}
}
package stringBuilder;

public class Html {

	public static String htmlElement(String tag, String body) {
		if(body == null && (tag.isBlank() || tag == null)){
			return "";
		}else if (tag == null || tag.isBlank()) {
			 return body;	
		}else if(body == null) {
			return "<" + tag + ">" + "<" + "/" + tag +">";
		}else {
			return "<" + tag + ">" + body + "<" + "/" + tag +">";
		}
	}
	
	public static String strong(String str) {
		return htmlElement("strong", str);
	}
	
	public static String emphasized(String str) {
		return htmlElement("em", str);
	}
	
	public static void main(String[] args) {
		System.out.println(htmlElement("hi", "bye"));
		System.out.println(strong("test"));
		System.out.println(emphasized("test2"));
		}

}

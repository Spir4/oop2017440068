package bj1;

public class Man {
	public String publicField;
	private String privateField;
	String packageField;
	protected String protectedField;
	//protect: 동일 패키지 내에서는 public
	//동일 패키지 내에서는 public
	//타 패키지에서는 private
	public Man(){
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}

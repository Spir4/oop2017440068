package bj1;

public class Man {
	public String publicField;
	private String privateField;
	String packageField;
	protected String protectedField;
	//protect: ���� ��Ű�� �������� public
	//���� ��Ű�� �������� public
	//Ÿ ��Ű�������� private
	public Man(){
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}

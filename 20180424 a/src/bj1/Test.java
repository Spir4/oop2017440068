package bj1;

public class Test {

	public static void main(String[] args) {
		Father father = new Father();
		father.print();
		father.name="Father";
		//father.ID="1425142"; Error ID is a private field
		father.nickname="F";
		father.publicField="U2";
	//	father.privatefield="dsaf"; error
		father.packageField="daf";
		father.protectedField= "badfqwe";
		father.print(); 
		
		Father aa = new Father();
		aa.protectedField = "ddd";
	}

}


public  class MethodOverriding {
static int sum(int a,int b) {
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p = new Child();
		
System.out.println(p.sum(4, 6));
	}

}

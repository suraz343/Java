
class MethodOverloading {
int sum(int a,int b) {
	return a+b;
	}
int sum(int a,int b,int c) {
	return a+b+c;
}
float sum(float a,float b,float c) {
	return (float) (a+b+c);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading m = new MethodOverloading();
System.out.println(m.sum(3,5));
System.out.println(m.sum(6,7,3));
System.out.println(m.sum(4.5f,3.9f,4.0f));
	}

}

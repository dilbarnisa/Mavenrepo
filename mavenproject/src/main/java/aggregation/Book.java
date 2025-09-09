package aggregation;

public class Book {
	
	String name ;
	int id ;
	
	Auther data;//class A name and new object(reference variable) created

	
	Book(String n , int i , Auther d){
		name = n;
		id = i;
		data = d;
		
		}
	
	public void display() {
		
		System.out.println("name is "+name +" "+ "id is "+id );
		data.print();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auther obj = new Auther("kerala","calicut");
		Book obj1 = new Book("Anu", 2,obj);
		obj1.display();

	}
}

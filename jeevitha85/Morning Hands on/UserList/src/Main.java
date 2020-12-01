import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1=new User(1,"jeevs","jeevs99");
		User u2=new User(2,"bubbly","bubbly98");
		User u3=new User(5,"Trupti","trup876");
		User u4=new User(4,"Deepu","deep092");
		User u5=new User(10,"guru","guru760");
		ArrayList<User> arr1=new ArrayList<User>();
		arr1.add(u1);
		arr1.add(u2);
		arr1.add(u3);
		arr1.add(u4);
		arr1.add(u5);
		
		for(User u:arr1)
		{
			if(u.getName().length()>5)
			{
				System.out.println("id="+u.getId()+" name="+u.getName());
			}
		}
		
		
	}

}

package edu.neu.csye6200;


	import java.util.ArrayList;
	import java.util.List;

	public class PersonController {
	private int numberofpersons=0;
	private List<Person>personlist=new ArrayList();
	private List<AbstractPersonAPI>factories=new ArrayList();
	
	public PersonController()
	{	
	}
	
	public PersonController(int numberofpersons)
	{
	this.numberofpersons=numberofpersons;
	this.load(new Person());
	}
	
	public void load(AbstractPersonAPI a)
	{
		factories.add(a);
	}
	public void load()
	{
		this.add(this.numberofpersons);
	}
	public void load(int n)
	{
		if(0==n)
		{
			this.personlist.clear();
		    this.numberofpersons=n;
		}
		else
		{
			this.add(n);
		}
	}
	public void load(Student b)
	{
		this.personlist.add(b);
		this.numberofpersons++;
	}
	public void start()
	{
		System.out.println(personlist.size()+"persons are there");
		for(Person p:personlist)
		{
			System.out.println(p.getClass().getSimpleName()+"");
			p.show();
		}
	}
	public static void demo()
	{
		System.out.println(PersonController.class.getName()+"demo starting...\n");
//		PersonController obj=new PersonController();
//		obj.start();
//		System.out.println(PersonController.class.getName()+"demo starting....\n");
		
	}

	private void add(int n)
	{
		System.out.println("Adding"+n*this.factories.size());
	}
}

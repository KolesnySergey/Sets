import java.util.TreeSet;

class MySets
{
	public static void main(String[] args)
	{
		TreeSet<String> mySet = new TreeSet<String>();
		mySet.add("Строка 1");
		mySet.add("Строка 5");
		mySet.add("Строка 3");
		for (String string : mySet) 
		{
			System.out.println(string);
		}
		
		System.out.println("\nС объектом пользовательского класса: ");
		TreeSet<MyCls> myClsSet = new TreeSet<MyCls>();
		myClsSet.add(new MyCls("Строка 1"));
		myClsSet.add(new MyCls("Строка 5"));
		myClsSet.add(new MyCls("Строка 3"));
		for (MyCls myCls : myClsSet) 
		{
			System.out.println(myCls.str);
		}
		System.out.write(1);
	}
}

class MyCls implements Comparable<MyCls>
{
	String str = ""; 
	public MyCls(String str)
	{
		this.str = str;
	}
	
	@Override
	public int compareTo(MyCls arg0) 
	{
		 return this.str.compareTo(arg0.str);
	}
}
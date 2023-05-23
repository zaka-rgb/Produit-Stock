
public class test {
	
	public static void main(String[] args) {
		Date dt1=new Date(15,11,2019);
		Date dt2=new Date(17,11,2019);
		Date dt3=new Date(19,11,2019);
		
		Date dt=new Date(17,11,2019);
		Stock s=new Stock();
		Stock sp=new Stock();
		Produit p1=new Produit("1",dt1);
		Produit p2=new Produit("2",dt2);
		Produit p3=new Produit("3",dt3);
		
		
		
		s.add(p1);
		s.add(p2);
		s.add(p3);
		//System.out.println(s.destocker(dt).toString());
		//s.destocker(dt);
		
		
		
		System.out.println(s.destocker2(dt).toString());
		
		
		
	}

}

import java.util.*;
public class Stock extends LinkedList<Produit> {
	
	
	public Stock(){}
	public Stock(Stock s){
		int i;
	for(i=0;i<s.size();i++)
		this.add(s.get(i));
	}
	
	
	
	@Override
	public boolean add(Produit p) {
		if (p == null) {
			return false;
		}

		if (!this.contains(p)) { // si le produit existe, mettre à jour la
								// quantité.
			
			this.addLast(p);
		}
		else return false;

		return true;
	}
	
	public Produit ancien(){
		int i;
		Produit pp,pplusancien;
		pplusancien=this.get(0);
		
		for(i=1;i<this.size();i++){
		pp=this.get(i);
			if(pplusancien.plusancien(pp)==false)
				pplusancien=pp;
			
			}
		return pplusancien;
		
	}
	
	
	
	public Stock perime(Date dt){
		
		Stock s=new Stock();
		Produit p=new Produit(dt);
		int i;
		for(i=0;i<this.size();i++)
		{
			if(this.get(i).plusancien(p)==true)
				s.add(this.get(i));
				
		}
		
		return s;
		
	}
	
	public Stock destocker(Date dt)
	{Stock s=new Stock();
	Produit p=new Produit(dt);
	int i;
	for(i=0;i<this.size();i++)
	{
		if(this.get(i).plusancien(p)==false)
			s.add(this.get(i));
			
	}
	return s;
		
		
		
	}
	
	
	public Stock destocker2(Date dt)
	{
		
	Produit p=new Produit(dt);
	int i=0;
	
		for(i=0;i<this.size();i++)
	{
		
		if(this.get(i).plusancien(p)== true)
			{
			this.remove(this.get(i));
			i--;
			}
	
	}
	return this;
	
		}
	
	
	public String toString(){
		String s="";
		int i;
		
		for(i=0;i<this.size();i++)
		 s+="Produit "+i+1+this.get(i)+"\n";
		
		return s;
	}
	
	
	

}

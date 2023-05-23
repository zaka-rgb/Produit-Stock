


public class Produit {

	
private String code; 
private Date dt;


//public Produit(){}
public Produit(String code){

this.code=code;


}
public Produit(Date dt){


this.dt=dt;

}
public Produit(String code,Date dt){

this.code=code;
this.dt=dt;

}
public Produit(Produit p){
	this(p.code,p.dt);
	
	
}
@Override
public boolean equals(Object o)
{
if(o==null)
	return false;
if(o.getClass()!= this.getClass())
	return false;

Produit p=(Produit) o;
return this.code.equals(p.code);


}


@Override
public String toString(){
	return "le code :"+this.code+"la date: "+this.dt;
	
	}


public int comparer(Produit p)
{
	/*if(this.equals(p)==true)
		return 0;*/
	
	return this.code.compareTo(p.code);
}


public boolean plusancien(Produit p){
	if(Date.comp(this.dt, p.dt)==1)
		return true;
	return false;
	
	}



}

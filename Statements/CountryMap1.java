package lab15DecPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lab15DecPrep.CountryMap;

public class CountryMap1{
  private HashMap<String,String>M1;
	public Countrymap() {
		M1= new HashMAp<String,String>();
	}
	
	public HashMAp<String, String>
	storeCounrtryCapital(String CountryName, String capital)
M1.put(CountryName, capital);
	return M1;
}
	
		public String retriveCountry(String capitalNAme) {
			Set<Entry<String,String>>set = M1.entrySet();
			Iterator<Entry<String, String>> it=set.iterator();
			while(it.hasNext()) {
				Map.Entry<String, String>me=it.next();
				if(me.getValue().equals(capital name))
					return me.getKey();
				}
			
		return null;
		}
		
		
		
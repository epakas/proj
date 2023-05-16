package sub;

public class subtract {

    public String subtractTwoIntegers(int firstInteger,int secondInteger)
    {
        if ((firstInteger-secondInteger)<0) { 
        	return "NEGATIVE";}
        else { 
        	return "POSITIVE";
        }
    }
}
package testpackage;

public class testclass {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String shipTypeName ="Cargo>test Cargo";
		String retval = null;
		if(shipTypeName!=null){
			if(shipTypeName.indexOf(">")>0){
				String[] splitResult = shipTypeName.split(">");
				if(splitResult[0]==splitResult[1]){
					retval="<b>"+shipTypeName+"</b>";
				} else {
					retval="<b>"+splitResult[0]+"</b>: "+splitResult[1];
				}
			} else {
				retval="<b>"+shipTypeName+"</b>";
			}
		} else {
			retval="<b>other</b>";
		}
		System.out.println(retval);
	}

}

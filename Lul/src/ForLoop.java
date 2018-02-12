
class ForLoop {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(args[0]);
		sb.append("I am Studying Java");
		String constant = "Studying";
		
		
		System.out.println("Given String : " + sb);
		System.out.println("First three words : " + sb.substring(0,3));
		System.out.println("Last three words : " + sb.substring((sb.length()-3)));
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("Given String : " + sb.substring(startOfConstant,endOfConstant));
		
		//insert delete function
		sb.insert((sb.indexOf("am") +2), "irsyad");
		System.out.println("After insert: " + sb);
		sb.delete(sb.indexOf("am"), sb.indexOf("am")+2);
		System.out.println("After delete: " + sb);
		System.out.println("After reverse: " + sb.reverse());
		
		//comparing strings
		StringBuilder sb2 = new StringBuilder(args[0]);
		System.out.println(sb == sb2);
		StringBuilder sb3 = (sb.insert((sb.indexOf("am") +2), "irsyad"));
		System.out.println(sb == sb3);
		
		sb = null;
		sb2 = null;
		sb3 = null;
	
	}

}

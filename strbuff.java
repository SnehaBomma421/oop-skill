package skill2;

public class strbuff {
	    public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer("Hello");
	        sb.append(" World");
	        System.out.println("After append: " + sb);
	        sb.insert(6, "Java ");
	        System.out.println("After insert: " + sb);
	        sb.replace(6, 10, "Code");
	        System.out.println("After replace: " + sb);
	        sb.delete(6, 10);
	        System.out.println("After delete: " + sb);
	        sb.reverse();
	        System.out.println("After reverse: " + sb);
	        System.out.println("Capacity of buffer: " + sb.capacity());
	    }
	}

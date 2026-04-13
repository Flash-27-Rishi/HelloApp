public class HelloApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String arg : args) {
            if(!first){
                sb.append(" ");
            }
            else{
                sb.append(arg);
                first = false;
            }
        }
        if(sb.length() == 0){
            System.out.println("Hello, World!");
        }
        else{
            System.out.println("Hello, " + sb.toString() + "!");
        }
    }
}
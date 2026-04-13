public class HelloApp {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for(String arg: args){
            sb.append(arg).append(", ");
        }
        if(sb.isEmpty()){
            System.out.println("Hello World!");
            return;
        }else {
            System.out.println("Hello " + sb.substring(0, sb.length() - 2) + "!");
        }
    }
}
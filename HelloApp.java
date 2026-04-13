public class HelloApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<args.length; i++){
            sb.append(args[i]);
            if(i<args.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
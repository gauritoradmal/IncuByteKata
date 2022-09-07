import java.util.*;

class StringCalculator{
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        sc.close();
        int n = add(s);
        System.out.println(n);
    }
    static int add(String numbers){
        if(numbers==null){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int c=1;
        for(char i='a';i<='z';i++){
            map.put(i, c);
            c++;
        }
        String[] strarr = numbers.split(",");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String str : strarr){
            if(map.containsKey(str.charAt(0))){
                arr.add(map.get(str.charAt(0)));

            }
            else{
                int n = Integer.parseInt(str);
                if(n<0){
                    throw new ArithmeticException("Negatives not allowed" +" "+ n);
                }
                if(n<=1000){
                    arr.add(n);
                }
                
            }
        }

        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> sub=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                sub.add("FizzBuzz");
            }else if(i%3==0){
                sub.add("Fizz");
            }else if(i%5==0){
                sub.add("Buzz");
            }else{
                sub.add(String.valueOf(i));
            }
        }
        return sub;
    }
}
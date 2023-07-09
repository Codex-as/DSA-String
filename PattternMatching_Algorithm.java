package String;

public class PattternMatching_Algorithm {

    //Naive --> O(n * m)

    public static  void patternMatching(String s , String p){
        int n = s.length();
        int m = p.length();
        for(int i = 0 ;i<=n-m; i++){
            int j = 0;
            for(; j< m ; j++){
                if(s.charAt(i+j) != p.charAt(j)){
                    break;
                }
            }
                if(j == m){
                    System.out.println("Pattern Found" +i);
                }
            }
        }

        //R
    
        public static void main(String[] args) {
            String s = "abcabdabbacdab";
            String p = "bda";
            patternMatching(s, p);
            
        }
    }


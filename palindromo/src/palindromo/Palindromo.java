package palindromo;

public class Palindromo {

    public static void main(String[] args) {
        String palavra = "arara";
        System.out.println(palavra + " eh palindromo " + isPal(palavra));
    }
    
    private static boolean isPal (String palavra){
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) != palavra.charAt(palavra.length()-1-i)){
              return false;  
            } 
        }
        return true;
    }
    
}

package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println("reverse : ");
    }

     public void isPalindrome(){
       int i=0, longueur=s.length()-1;
       boolean egale=true;
        while(i<longueur/2 && egale){
           if(s.charAt(i)==s.charAt(longueur-i))
              egale = true;
           else
              egale = false;
           i++;
        }
        System.out.println("isPalindrome : "+egale);
    }


 public void toUpperCase(){
         int x;
         String s2 = new String();
         for (int i=0; i<s.length();i++){
             char c= s.charAt(i);
             if (c >= 'a' && c <= 'z'){
                 x = (int) c;
                 x -= 32;
                 s2 += (char) x;
             }
             else {
                 s2 += c;
             }
         }
        System.out.println("uppercase : "+s2);
    }

    public void toLowerCase(){
        int x;
         String s2 = new String();
         for (int i=0; i<s.length();i++){
             char c= s.charAt(i);
             if (c >= 'a' && c <= 'z'){
                 x = (int) c;
                 x += 32;
                 s2 += (char) x;
             }
             else {
                 s2 += c;
             }
         }
        System.out.println("lowercase : "+s2);
    }

    public void getVowelNumber(){
        int count = 0;
        String c= new String();
        for (int i = 0; i < s.length(); i++)
        {
            c= s.substring(i,i+1);
            if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("u") || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("y"))
            {
                count++;
            }
        }

        System.out.println("vowelNumber : "+count);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}

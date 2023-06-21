package variables;

public class Ex08 {
   public static void main(String[] args) {
      byte b = 97; // 1
      short s = 20; // 2byte, -32000 ~ +32000
      char c = 'A'; // 2byte, 0 ~ 65535
      // 위에는 변수형      
      
      s = b;
      c = (char)b;
      c = (char)s;
      s = (short)c;
      
      float f = 1.23f;
      f = (float)5.12;
   }

}
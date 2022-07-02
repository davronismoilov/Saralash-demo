package davron;

public class Task3 {

    /**
     * 107 and  112  = 96
     * 101 and 112   = 96
     * 108 -- 97
     * 97 --   116
     * 96 --    99
     * 106 --  111
     * 114 -- 99
     * 104 -- 101
     *  99  -- 100
     *
     */

    public  static  String  task(String str){
        StringBuilder result = new StringBuilder();

        for (char i : str.toCharArray()){
            for (int j = 97; j < 123; j++) {
                  if((i & j) ==96 ){
                      char ch = (char)j;
                      result.append(String.valueOf(ch));
                      break;
                  }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(task("kelajak"));
    }
}

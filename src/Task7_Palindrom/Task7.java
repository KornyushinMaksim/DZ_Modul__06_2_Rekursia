package Task7;

public class Task7 {
    public static String palindrome(String strMain) {
        StringBuilder strBuild = new StringBuilder();
        StringBuilder strBuildRev = new StringBuilder();
        strBuild.append(strMain.substring(strMain.indexOf(" ")));
        strBuildRev.append(strBuild.reverse());

        int i = 0;
        if (strMain.isEmpty()) {
            //return palin(strBuild, strBuildRev, strMain, i);
            return "a";
        } else {
            return "b";
            //palin(strBuild, strBuildRev, strMain, i);
        }
        //return palin(strBuild, strBuildRev, strMain, i);
    }

    private static String palin(StringBuilder str, StringBuilder strRev, String strMain, int index) {
        if (index == str.length()) {
            palindrome(strMain);
        } else if (index < str.length()) {
            if (str.charAt(index) == strRev.charAt(index)) {
                //index++;
                palin(str, strRev, strMain, index++);
            } else {
                return "no";
            }
        }
        return "yes";
    }
}

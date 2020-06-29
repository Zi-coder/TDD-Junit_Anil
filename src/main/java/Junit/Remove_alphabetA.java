package Junit;

public class Remove_alphabetA {
    public String remove_alphabetA(String str)
    {
        String res = str;
        int len = str.length();

        if(len > 2)
        {
            if(str.charAt(0) == 'A' && str.charAt(1) == 'A')
            {
                res = str.substring(2);
            }
            else if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
            {
                res = str.substring(1);
            }
            else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
            {
                res = str.charAt(0) + str.substring(2);
            }
        }
        else
        {
            if(len == 2)
            {
                if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
                {
                    res = str.charAt(1) + "";
                }
                else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
                {
                    res = str.charAt(0) + "";
                }
                else
                {
                    res = "";
                }
            }
            else
            {
                res = "";
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        Remove_alphabetA str = new Remove_alphabetA();
        System.out.println(str.remove_alphabetA("ABCDA"));
    }
}


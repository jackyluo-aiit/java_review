package StringDemo;

public class StringAPIExercise {
    /*
    计算一个字符串中大写字母和小写字母还有数字的数量
     */
    public static void main(String[] args) {
        String str = "23aosdf23aosdfSDFGsfdgloasasdfasfgsrgqADF2453sadfgag";
        int lc = 0;
        int uc = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>=48 && c<=57){
                num++;
            }
            else if(c>='a'&&c<='z'){
                lc++;
            }
            else if(c>='A'&&c<='Z'){
                uc++;
            }
        }
        System.out.println(num);
        System.out.println(lc);
        System.out.println(uc);

    }
}

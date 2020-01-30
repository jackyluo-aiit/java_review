package IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestCodeScheme {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = new String("中");
        byte[] gbks = s.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));

        //将编码转换为字符
        String s1 = new String(gbks, "GBK");
        System.out.println(s1);

    }
}

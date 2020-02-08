package Reg;

import java.util.Scanner;

public class FormatValidate {
    private boolean checkMobile(String content) {
        /*
        手提电话格式
         */
        boolean flag = false;
        String reg = "^\\++(86)\\s(13|14|15|16|17|18|19)[0-9]{9}$";
        if (content.matches(reg)) {
            flag = true;
        }
        return flag;
    }

    private boolean checkPhone(String content) {
        /*
        固定电话格式
         */
        boolean flag = false;
        String reg = "^(0[1-9][0-9]{1,2}-)?([2-9]\\d{6,7})(-[0-9]{1,4})?$";
        if (content.matches(reg)) {
            flag = true;
        }
        return flag;
    }

    private boolean checkEmail(String content) {
        /*
        通用邮箱格式 x@y.z
         */
        boolean flag = false;
        String reg = "^([a-zA-Z0-9][\\w.-]*)@[0-9a-zA-Z]([-]?[0-9a-zA-Z])*(\\.[a-z0-9]+)+$";
        if (content.matches(reg)) {
            flag = true;
        }
        return flag;
    }

    private boolean checkID(String content) {
        /*
        大陆身份证号格式
         */
        boolean flag = content.matches("^\\d{17}(\\d|[X])$");
        System.out.println("error:" + flag);
        if (flag) {
            String part = "";
            part = content.substring(0, 2);
            flag = part.matches("1[1-5]|2[1-3]|3[1-7]|4[1-6]|5[0-4]|6[1-5]]"); //判断省份
            System.out.println("error:" + flag);
            if (flag) {
                part = content.substring(2, 4);
                flag = part.matches("0[1-9]|[1-9][0-9]"); //判断城市,理论上
                System.out.println("error:" + flag);
                if (flag) {
                    part = content.substring(4, 6);
                    flag = part.matches("0[1-9]|[1-9][0-9]"); //判断区, 理论上
                    System.out.println("error:" + flag);
                    if (flag) {
                        part = content.substring(6, 14);
                        flag = checkBirthday(part);
                        System.out.println("error:" + flag);
                        if (flag) {
                            flag = checkLastNum(content);
                            System.out.println("error:" + flag);
                        }
                    }
                }
            }
        }
        return flag;
    }

    private boolean checkBirthday(String content) {
        boolean flag = false;
        String year = content.substring(0, 4);
        System.out.println(year);
        if (Integer.parseInt(year) >= 1920 && Integer.parseInt(year) <= 2020) {
            String month = content.substring(4, 6);
            System.out.println(month);
            if (month.matches("0[0-9]|1[0-2]")) {
                int m = Integer.parseInt(month);
                String date = content.substring(6, 8);
                int d = Integer.parseInt(date);
                if (m == 2) {
                    if (leapYear(Integer.parseInt(year))) {
                        flag = d > 29 ? false : true;
                    } else {
                        flag = d > 28 ? false : true;
                    }
                } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                    flag = d > 30 ? false : true;
                } else {
                    flag = d > 31 ? false : true;
                }
            }
        }
        return flag;
    }

    private boolean leapYear(int year) {
        boolean flag = false;
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
            flag = true;
        }
        return flag;
    }

    private boolean checkLastNum(String content) {
        String lastNum = content.substring(17);
        boolean flag = lastNum.equals(getLastNum(content));
        return flag;
    }

    private String getLastNum(String content) {
        String[] digit = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
        String lastNum = "";
        int sum = 0;
        for (int i = 0; i < content.length() - 1; i++) {
            String strNum = content.substring(i,i+1);
            int num = Integer.parseInt(strNum);
            int factor = (int) (Math.pow(2,18-(i+1))%11);
            sum += num * factor;
        }
        int index = sum % 11;
        lastNum = digit[index];
        System.out.println(lastNum);
        return lastNum;
    }

    public static void main(String[] args) {
        FormatValidate formatValidate = new FormatValidate();
        Scanner content = new Scanner(System.in);
//        System.out.println(content.nextLine());
        System.out.println(formatValidate.checkID(content.nextLine()));
    }
}

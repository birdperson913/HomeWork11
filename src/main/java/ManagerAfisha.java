import java.util.Arrays;

public class ManagerAfisha {
    private String afisha[];
    private int output;


    public String[] getAfisha() {
        return afisha;
    }

    public ManagerAfisha() {  //конструктор с установленными значениями
        this.afisha = new String[0];
        this.output = 10;
    }

    public ManagerAfisha(int output) { // контруктор
        this.afisha = new String[0];
        this.output = output;
    }


    public String[] addFilm(String newFilm) {
        String tmp[] = new String[afisha.length + 1];
        for (int i = 0; i < afisha.length; i++) {
            tmp[i] = afisha[i];
        }
        tmp[tmp.length - 1] = newFilm;

        return afisha = tmp;
    }

    public String[] findAll() {

        return getAfisha();
    }


    public String[] findLast() {
        int lengthTmp;
<<<<<<<<< Temporary merge branch 1
        if (afisha.length<=output) {
            lengthTmp = afisha.length;
        }
        else {
            lengthTmp =output;
        }
        String[] tmp = new String[lengthTmp];
        int copyToIndex = 0;
                for (int i = afisha.length - lengthTmp; i < afisha.length; i++) {
                    tmp[copyToIndex] = afisha[i];
                    copyToIndex++;
                }
            return afisha = tmp;
=========
        if (afisha.length <= output) {
            lengthTmp = afisha.length;
        } else {
            lengthTmp = output;
        }
        String[] tmp = new String[lengthTmp];
        int copyToIndex = 0;
        for (int i = afisha.length - lengthTmp; i < afisha.length; i++) {
            tmp[copyToIndex] = afisha[i];
            copyToIndex++;
>>>>>>>>> Temporary merge branch 2
        }
    }
<<<<<<<<< Temporary merge branch 1
=========
}
>>>>>>>>> Temporary merge branch 2


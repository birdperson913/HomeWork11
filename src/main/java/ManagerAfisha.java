import java.util.Arrays;

public class ManagerAfisha {
    private String afisha[];
    private int output;

    public void setAfisha(String[] afisha) {
        this.afisha = Arrays.copyOf(afisha, afisha.length);
    }


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
        if(output>afisha.length){
            output=afisha.length;
        }
        String[] tmp = new String[output];
        int copyToIndex = 0;
        for (int i = afisha.length - output; i < afisha.length; i++) {
            tmp[copyToIndex] = afisha[i];
            copyToIndex++;
        }
        return afisha = tmp;
    }


}


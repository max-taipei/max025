package com.livehereandnow.ages.field;

/**
 *
 * @author mark
 */
public class Points {

    private String title = "---";

    public Points() {
    }

    public Points(String str) {
        title = str;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    private int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;

    }

    public void addPoints(int k) {
        this.points += k;
    }

    @Override
    public String toString() {
        return "" + points;
    }

    private String getSameSize(String name) {
        int times = 8 - name.length();
        String cnSpace = "\u3000";
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < times; k++) {
            sb.append("\u3000");
        }
        return  sb.toString()+name ;
    }

    public void show() {
//        System.out.print(title+" "+  toString()+"  ");
        System.out.printf("%s %3d ",getSameSize(title) , points);
    }
}

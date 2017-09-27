
public class Color {
    String[] color;

    public Color(int r, int g, int b) {
        String r1 = Integer.toString(r, 2);
        String g1 = Integer.toString(g, 2);
        String b1 = Integer.toString(b, 2);
        this.color = new String[]{r1, g1, b1};
    }

    public String sumaBinarios(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 + b1;

        String resultado = Integer.toString(c1, 2);
        return resultado;
    }

    public String[] Suma(int r, int g, int b) {
        String r1 = Integer.toString(r, 2);
        String g1 = Integer.toString(g, 2);
        String b1 = Integer.toString(b, 2);


        color[0] = sumaBinarios(color[0] , r1);
        color[1] = sumaBinarios(color[1] , g1);
        color[2] = sumaBinarios(color[2] , b1);

        return color;
    }

    /*  public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    String[] restaColor(int r, int g, int b){
      color[0] = Math.round(Math.abs((color[0] - r)/2));
        color[1] = Math.round(Math.abs((color[1] - r)/2));
        color[2] = Math.round(Math.abs((color[2] - r)/2));
        return color;
    }*/
}

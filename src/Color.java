
public class Color {
    short[] color;
    final double weight = 0.5;
    public Color(short r, short g, short b) {
        this.color = new short[]{r, g, b};
    }

    public String sumaBinarios(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 + b1;

        String resultado = Integer.toString(c1, 2);
        return resultado;
    }

    public short[] Suma(short r, short g, short b) {


        int variable  = (int)(weight * color[0]  + (1 - weight) * r);

        System.out.println("la variable es: "+variable);


        color[0] = (short) (color[0] & r);
        color[1] = (short) (color[1] & g);
        color[2] = (short) (color[2] & b);
        /*color[1] = sumaBinarios(color[1] , g1);
        color[2] = sumaBinarios(color[2] , b1);*/

        return color;
    }

    /*  public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    String[] restaColor(int r, int g, int b){

        return color;
    }*/
}

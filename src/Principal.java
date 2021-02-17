class Persona
{
    int iEdad;
    String name;

    public void setName(String name)
    {
        this.name = name;

    }

    public String getName()
    {
        return name;
    }

    public int getiEdad()
    {
        return iEdad;
    }

    public void cumplirAnios()
    {
        iEdad ++;
    }



}
public class Principal
{
    public static void main(String []args)
    {
        Persona Juan = new Persona();
        Persona Lupe = new Persona();

        Juan.iEdad = 10;
        Lupe.iEdad = 20;

        Juan.cumplirAnios();
        Juan.cumplirAnios();
        Juan.cumplirAnios();
        Juan.cumplirAnios();

        Lupe.cumplirAnios();
        Lupe.cumplirAnios();

        Juan.setName("Lopez");
        Lupe.setName("Perez");

        System.out.println("Juan " + Juan.getName() + " tiene " + Juan.getiEdad()+ " anios");
        System.out.println("Lupe " + Lupe.getName() + " tiene " + Lupe.getiEdad()+ " anios");

        //System.gc(); -> garbage collector

    }
}



